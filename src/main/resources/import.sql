

insert into roles(id_role, name) values (1, 'ADMIN'), (2, 'USER');

insert into authorities(id, name) values (1, 'user.read'), (2, 'user.create'), (3, 'user.update'), (4,  'user.delete');

insert into role_authorities(authority_id, role_id) values (1, 1), (2,1),(3,1), (4,1), (1, 2);


insert into users(id, role_id, last_name, name, password, username) values (1, 1, 'iba', 'gus', '$2a$10$yK7oOQmifS3BNDGBlQlLl.8YC26ZA3p992eBEbOQzwaArMC0A3M1K', 'grimgdl') ;




insert into company_groups(id, name) values ( 1, 'Parent company 1' ), (2, 'Parent company 2');
        #on duplicate key update id = values(id);



insert into formats(id, id_group,  name ) values (1, 1, 'Paun paun');
         #                                 on duplicate key update id = values(id);



insert into stores(id,id_format, lat, lon, name )  values (1, 1, 123.4324323, -125.4893286, 'Store One'),(2, 1, 230.4332423423, -139.42342343, 'Store Two');