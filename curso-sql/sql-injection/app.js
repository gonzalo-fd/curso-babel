const express = require('express');
const bodyparser = require('body-parser');
const path = require('path');
const db = require('./db');

const app = express();

app.use(bodyparser.urlencoded({extended: false}));

app.use((req, res, next) => {
    console.log("URL: " + req.url);
    console.log("METHOD: " + req.method);
    next();
});

app.get('/login', (req, res, next) => { //get
    res.sendFile(path.join(__dirname, 'login.html'));
});

app.post('/login', (req, res, next) => { //post
    const body = req.body;
    console.log(body);
    login(body.usuario, body.password)
        .then(datos => {
            console.log(datos);
            if (datos[0].length === 0) {
                res.redirect('/login');
            }
            else {
                res.redirect('/inicio');
            }
        })
        .catch(err => console.log(err));
});

app.get('/inicio', (req, res, next) => { //post
    res.send('<h1>Bienvenido</h1>');
});

function login(usuario, password) {
  return db.execute("select * from usuarios where usuario = '" +
    usuario + "' AND password = '" + password + "';");
   // return db.execute("select * from usuarios where usuario = ? AND password = ?;",[usuario,password]);
}

app.listen(8080);