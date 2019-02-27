insert into almacenes (lugar, capacidad) values
("mordor", 100), ("narnia", 200), ("parla", 150), ("hell", 300);

insert into cajas (contenido, valor, almacen) values
("cosas", 100, 1), ("cositas", 200, 2), ("cosinas", 150, 3),("cosazas", 250, 4),
("cositas", 200, 1), ("cosas", 400, 2), ("cosazas", 550, 3),("cosinas", 450, 4);

-- 3.1. Obtener todos los almacenes. 
select * from almacenes;
-- 3.2. Obtener todas las cajas cuyo contenido tenga un valor superior a 150 €.
select * from cajas where valor > 150;
-- 3.3. Obtener los tipos de contenidos de las cajas. 
select distinct(contenido) from cajas;
-- 3.4. Obtener el valor medio de todas las cajas. 
select avg(valor) from cajas;
-- 3.5. Obtener el valor medio de las cajas de cada almacén. 
select lugar, avg(valor) from cajas c join almacenes a on c.almacen=a.codigo group by lugar;
-- 3.6. Obtener los códigos de los almacenes en los cuales el valor medio de las cajas sea superior a 150 €. 
select codigo, avg(valor) from cajas c join almacenes a on c.almacen=a.codigo group by lugar having avg(valor) > 150;
-- 3.7. Obtener el número de referencia de cada caja junto con el nombre de la ciudad en el que se encuentra. 
select numreferencia, lugar from cajas c join almacenes a on c.almacen=a.codigo;
-- 3.8. Obtener el número de cajas que hay en cada almacén.
select lugar, count(numreferencia) from cajas c join almacenes a on c.almacen=a.codigo group by lugar;
-- 3.9. Obtener los códigos de los almacenes que estén saturados (los almacenes donde el número de cajas es superior a la capacidad).
select distinct(codigo) from cajas c join almacenes a on c.almacen=a.codigo where 
(select count(d.numreferencia) from cajas d join almacenes b on d.almacen=b.codigo where a.lugar=b.lugar)
> capacidad;
-- 3.10. Obtener los números de referencia de las cajas que están en Bilbao(mordor).
 select numreferencia from cajas c join almacenes a on c.almacen=a.codigo
 where a.lugar = "mordor";
-- 3.11. Insertar un nuevo almacén en Barcelona con capacidad para 3 cajas.
insert into almacenes (lugar, capacidad) values
("barcelona", 3);
-- 3.12. Insertar una nueva caja, con número de referencia 'H5RT', con contenido 'Papel', valor 200, y situada en el almacén 2.
insert into cajas (contenido, valor, almacen) values ("papel", 200, 2);
-- 3.13. Rebajar el valor de todas las cajas un 15 %. 
update cajas set valor = valor * 1.15;
-- 3.14. Rebajar un 20 % el valor de todas las cajas cuyo valor sea superior al valor medio de todas las cajas.
-- NO FUNCIONA
update cajas set valor = valor * 0.8 where valor > avg(valor);
-- .15. Eliminar todas las cajas cuyo valor sea inferior a 100 €.
delete from cajas where valor > 100; 
-- 3.16. Vaciar el contenido de los almacenes que estén saturados.
-- NO FUNCIONA
delete from cajas where (select distinct(codigo) from cajas c join almacenes a on c.almacen=a.codigo where 
(select count(d.numreferencia) from cajas d join almacenes b on d.almacen=b.codigo where a.lugar=b.lugar)
> capacidad);
