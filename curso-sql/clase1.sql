use `curso-mysql`;
-- insert into empresas(nombre) values("Uber");
-- insert into empresas(nombre) values("Babel");
-- insert into empresas(nombre) values("Cabify"),("Delivero"),("Job And Talent");
-- INSERT INTO usuarios (nombre, apellidos, usuario, password) VALUES
-- ("Charly", "Falco", "falco", "1234"),
-- ("Mike", "Kozinsky", "koz", "1234"),
-- ("Bud", "Spencer", "bud", "1234"),
-- ("Charlie", "Callahan", "charlie", "1234"),
-- ("Chuck", "Norris", "god", "1234");

-- insert into empresas values(7,"Toggl");

-- INSERT INTO ofertas (titulo, descripcion, salario, ciudad, empresa_id) VALUES
-- ("Ruby Software Engineer", "Descripción Ruby Software Engineer", 43000, "Madrid", 3),
-- ("iOS Engineer", "Descripción iOS Engineer", 30000, "Madrid", 3),
-- ("Elixir Software Engineer", "Descripción Elixir Software Engineer", 44000, "Madrid", 3),
-- ("Product Manager", "Descripción Product Manager", 83000, "Madrid", 3),
-- ("Programadores Java", "Descripción Programadores Java", 0, "Sevilla", 1),
-- ("Referente técnico Frontend", "Descripción Referente técnico Frontend", 0, "Madrid", 1),
-- ("Estudiante de Ingeniería Informática", "Descripción Estudiante de Ingeniería Informática", 0, "Barcelona", 1),
-- ("Business Analyst junior", "Descripción Business Analyst junior", 0, "Madrid", 2),
-- ("Senior Android Developer (Mobile)", "Descripción Senior Android Developer (Mobile)", 0, "Madrid", 2);

-- insert into ofertas_usuarios (oferta_id, usuario_id) values (1,1),(2,1),(1,2),(5,4),(3,4),(7,5),(8,5),(9,5);

select nombre from empresas;
select titulo, salarioofertas from ofertas where salario = 0;

select * from ofertas where titulo like "ruby%";

select salario from ofertas;
select distinct salario from ofertas;

select titulo from ofertas where salario >= 30000 and salario <= 40000;
select titulo from ofertas where salario between 30000 and 40000;

select nombre, apellidos from usuarios where id = 1 or id = 3 or id= 4;
select nombre, apellidos from usuarios where id in (1,3,4);

select nombre from empresas where id in (select distinct empresa_id from ofertas where salario > 35000);

select nombre from empresas where exists(select * from ofertas where publicada = 1);

select * from ofertas order by salario desc, titulo desc;

select ciudad from ofertas where salario = 0 order by ciudad desc limit 1;

update ofertas set ciudad = "remota" where id = 8;

update ofertas set ciudad = "Madrid", publicada = 0 where id = 8;

update ofertas set salario = 20000 where ciudad not like "madrid" and salario = 0;