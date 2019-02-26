-- Obtener todas las ofertas que hay publicadas para Sevilla y Barcelona.
select * from ofertas where ciudad = "sevilla" or ciudad = "barcelona";
-- Obtener el nombre de las ofertas a las que se ha apuntado el usuario con id 3.w
select titulo from ofertas o  join ofertas_usuarios ou on o.id = ou.oferta_id where ou.usuario_id = 3;
-- Obtener el número total de ofertas a las que se ha apuntado el usuario con id 3.
select count(*) from ofertas join ofertas_usuarios where usuario_id = 3;
-- Obtener el nombre de los usuarios que se han apuntado a la oferta con id 2.
select nombre from usuarios join ofertas_usuarios where oferta_id = 2;
-- Obtener el número total de usuarios que se han apuntado a la oferta con id 2.
select count(*) from usuarios u join ofertas_usuarios ou on u.id = ou.usuario_id where oferta_id = 2;
-- Obtener las empresas que no han publicado ninguna oferta.
select * from empresas e where e.id not in (select empresa_id from ofertas) group by nombre;
-- Obtener los usuarios que no están apuntados en ninguna oferta.
select * from usuarios where id not in (select usuario_id from ofertas_usuarios);
-- Obtener las empresas que han publicado más de 3 ofertas.
select * from empresas where (select count(*) from ofertas where empresas.id = empresa_id) > 3;
select * from empresas e inner join ofertas o on e.id = o.empresa_id group by e.nombre having count(*) >3;
-- Obtener los usuarios que se han apuntado a más de 3 ofertas.
select * from usuarios where (select count(*) from ofertas_usuarios where usuarios.id = ofertas_usuarios.usuario_id) > 3;
-- Obtener las ofertas con el número de usuarios que hay apuntados ordenadas por mayor número de apuntados.
select o.titulo, count(usuario_id) as cont from ofertas o  join ofertas_usuarios ou on o.id = ou.oferta_id group by o.titulo order by cont desc;