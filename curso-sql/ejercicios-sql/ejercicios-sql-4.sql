insert into peliculas (nombre, calificacionEdad) values
("star wars", 12), ("esdla", 16), ("blade runner", 8), ("origen", 7), ("big fish", 12);

insert into peliculas (nombre) values ("pulp fiction");

insert into salas (nombre, pelicula) values
("sala1", 1), ("sala2", 2), ("sala3", 3), ("sala4", 4);


-- 4.1. Mostrar las distintas caliﬁcaciones de edad que existen.
select distinct(calificacionEdad)  from peliculas;
-- 4.2. Mostrar todas las películas que no han sido caliﬁcadas.
select * from peliculas where calificacionEdad is null; 
-- 4.3. Mostrar la información de todas las salas y, si se proyecta alguna película en la sala, mostrar también la información de la película. 
select * from peliculas p right join salas s on p.id= s.pelicula group by s.nombre;
-- 4.4. Mostrar la información de todas las películas y, si se proyecta en alguna sala, mostrar también la información de la sala.
select * from peliculas p left join salas s on p.id= s.pelicula;
-- 4.5. Mostrar los nombres de las películas que no se proyectan en ninguna sala.
select p.nombre from peliculas p where p.id not in(select a.pelicula from salas a);
-- 4.6. Añadir una nueva película 'Uno, Dos, Tres', para mayores de 7 años.
insert into peliculas (nombre, calificacionEdad) values ("Uno, Dos, Tres", 7);
-- 4.7. Hacer constar que todas las películas no calificadas han sido calificadas 'no recomendables para menores de 13 años'.
update peliculas set calificacionEdad = 7 where calificacionEdad is null;
-- 4.8. Eliminar todas las salas que proyectan películas recomendadas para todos los públicos.

