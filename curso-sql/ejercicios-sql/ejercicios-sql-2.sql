insert into departamento (codigo, nombre, presupuesto) values
(1, "it", 300), (2, "rrhh", 400), (3, "desarollo", 600), (4, "marketing", 100);

insert into empleados (dni, nombre, apellidos, departamento) values
(1, "juan", "lopez", 1), (2, "pepe", "fernandez", 2), (3, "marcos", "sanchez", 3), (4, "gonzalo", "alonso", 4) ,(5, "maria", "fernandez", 1);
insert into empleados (dni, nombre, apellidos, departamento) values
(6, "lucia", "perez", 3);
-- 2.1. Obtener los apellidos de los empleados.
select apellidos from empleados;
-- 2.2. Obtener los apellidos de los empleados sin repeticiones.
select distinct(apellidos) from empleados;
-- 2.3. Obtener todos los datos de los empleados que se apellidan 'López'
select * from empleados where apellidos like "lopez"; 
-- 2.4. Obtener todos los datos de los empleados que se apellidan 'López' ó 'Pérez'.
select * from empleados where apellidos like "lopez" or apellidos like "perez"; 
-- 2.5. Obtener todos los datos de los empleados que trabajan para el departamento 14 (3).
select * from empleados where departamento = 3;
-- 2.6. Obtener todos los datos de los empleados que trabajan para el departamento 37 y para el departamento 77 (1 y 3).
select * from empleados where departamento = 1 or departamento = 3;
-- 2.7. Obtener todos los datos de los empleados cuyo apellido comience por 'P'.
select * from empleados where apellidos like "p%"; 
-- 2.8. Obtener el presupuesto total de todos los departamentos.
-- NO SE A CUAL DE LOS DOS SE REFIERE
select nombre , presupuesto from departamento;
select sum(presupuesto) from departamento;
-- 2.9. Obtener el número de empleados en cada departamento.
select d.nombre, count(dni) from departamento d join empleados e on d.codigo = e.departamento group by departamento;
-- 2.10. Obtener un listado completo de empleados, incluyendo por cada empleado los datos del empleado y de su departamento.
select * from departamento d join empleados e on d.codigo = e.departamento;
-- 2.11. Obtener un listado completo de empleados, incluyendo el nombre y apellidos del empleado junto al nombre y presupuesto de su departamento.
select e.nombre, e.apellidos, d.nombre, d.presupuesto from departamento d join empleados e on d.codigo = e.departamento;
-- 2.12. Obtener los nombres y apellidos de los empleados que trabajen en departamentos cuyo presupuesto sea mayor de 60.000 € (300).
select e.nombre, e.apellidos from departamento d join empleados e on d.codigo = e.departamento
where d.presupuesto >300;
-- 2.13. Obtener los datos de los departamentos cuyo presupuesto es superior al presupuesto medio de todos los departamentos.
select e.nombre, e.apellidos from departamento d join empleados e on d.codigo = e.departamento
where d.presupuesto > (select avg(b.presupuesto) from departamento b);
-- 2.14. Obtener los nombres (únicamente los nombres) de los departamentos que tienen más de dos empleados. 
select d.nombre from departamento d 
where (select count(e.dni) from empleados e where e.departamento = d.codigo) >= 2;
-- 2.15. Añadir un nuevo departamento: 'Calidad', con presupuesto de 40.000 € y código 11. Añadir un empleado vinculado al departamento recién creado: Esther Vázquez, DNI: 89267109.
insert into departamento (codigo, nombre, presupuesto) values
(11, "calidad", 400);
insert into empleados (dni, nombre, apellidos, departamento) values
(7, "esther", "vazquez", 11);
-- 2.16. Aplicar un recorte presupuestario del 10 % a todos los departamentos.
update departamento set presupuesto = presupuesto * 0.9;
-- 2.17. Reasignar a los empleados del departamento de investigación (código 77)(2) al departamento de informática (código 14)(4).
update empleados set departamento = 4 where departamento = 2;
-- 2.18. Despedir a todos los empleados que trabajan para el departamento de informática a (código 14)(4).
DELETE FROM empleados WHERE departamento = 4;
-- 2.19. Despedir a todos los empleados que trabajen para departamentos cuyo presupuesto sea superior a los 60.000 €.
-- NO FUNCIONA
DELETE FROM empleados WHERE dni in (
select dni from departamento d join empleados e on d.codigo = e.departamento
where presupuesto > 600
);
-- 2.20. Despedir a todos los empleados.
DELETE FROM empleados;
