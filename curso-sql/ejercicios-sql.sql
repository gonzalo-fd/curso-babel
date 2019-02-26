INSERT INTO fabricantes (nombre) VALUES
("frodo"), ("sam"),  ("aragorn"),  ("legolas"), ("peregrin tuk"),  ("meriadoc brandigamo"), ("gimli"),  ("boromir"), ("gandalf");
INSERT INTO articulos (codigo, nombre, precio, fabricante) VALUES
("1", "anillo unico", 757, "1"), ("2", "papas", 45, "2"),  ("3","narsil", 300, "3"),  ("4","mi arco", 50, "4"), ("5","segundo desayuno", 10, "5"),  
("6","pan lembas", 20, "6"), ("7","mi hacha", 100, "7"), ("8","tumba", 1, "8"), ("9","blanco", 444, "9");

-- 1.1. Obtener los nombres y los precios de los productos de la tienda. 
select nombre, precio from articulos;
-- 1.2. Obtener el nombre de los productos cuyo precio sea mayor o igual a 200 €. 
select nombre from articulos where precio >= 200;
-- 1.3. Obtener todos los datos de los artículos cuyo precio esté entre los 60 € y los 120 € (ambas cantidades incluidas).
select * from articulos where precio between 60 and 120;
-- 1.4. Obtener el nombre y el precio en pesetas (es decir, el precio en euros multiplicado por 166'386).
select nombre, precio*166.386 from articulos;
-- 1.5. Seleccionar el precio medio de todos los productos.
select avg(precio) from articulos;
-- 1.6. Obtener el precio medio de los artículos cuyo código de fabricante sea 2.
 select avg(precio) from articulos where fabricante = 2;
-- 1.7. Obtener el número de artículos cuyo precio sea mayor o igual a 180 €. 
select count(*) from articulos where precio >= 180;
-- 1.8. Obtener el nombre y precio de los artículos cuyo precio sea mayor o igual a 180 € y ordenarlos descendentemente por precio, y luego ascendentemente por nombre.
select nombre, precio from articulos where precio >= 180 order by precio desc, nombre asc;
-- 1.9. Obtener un listado completo de artículos, incluyendo por cada articulo los datos del articulo y de su fabricante.
select * from articulos a join fabricantes f on a.fabricante = f.codigo;
-- 1.10. Obtener un listado de artículos, incluyendo el nombre del artículo, su precio, y el nombre de su fabricante.
select a.nombre, a.precio, f.nombre from articulos a join fabricantes f on a.fabricante = f.codigo;
-- 1.11. Obtener el precio medio de los productos de cada fabricante, mostrando solo los códigos de fabricante.
select avg(precio), f.codigo from articulos a join fabricantes f on a.fabricante = f.codigo group by fabricante;
-- 1.12. Obtener el precio medio de los productos de cada fabricante, mostrando el nombre del fabricante.
select avg(precio), f.nombre from articulos a join fabricantes f on a.fabricante = f.codigo group by fabricante;
-- 1.13. Obtener los nombres de los fabricantes que ofrezcan productos cuyo precio medio sea mayor o igual a 150 €.
select f.nombre from articulos a join fabricantes f on a.fabricante = f.codigo where precio >= 150;
-- 1.14. Obtener el nombre y precio del artículo más barato.
select nombre, min(precio) from articulos group by precio asc;
-- 1.15. Obtener una lista con el nombre y precio de los artículos más caros de cada proveedor (incluyendo el nombre del proveedor).
-- 1.16. Añadir un nuevo producto: Altavoces de 70 € (del fabricante 2). 
-- 1.17. Cambiar el nombre del producto 8 a 'Impresora Laser'. 
-- 1.18. Aplicar un descuento del 10 % (multiplicar el precio por 0'9) a todos los productos. 
-- 1.19. Aplicar un descuento de 10 € a todos los productos cuyo precio sea mayor o igual a 120 €.

