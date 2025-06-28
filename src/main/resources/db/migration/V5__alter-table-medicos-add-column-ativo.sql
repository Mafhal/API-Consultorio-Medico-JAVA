alter table clientes add ativo tinyint;
update clientes set ativo = 1;
alter table medicos add ativo tinyint;
update medicos set ativo = 1;

