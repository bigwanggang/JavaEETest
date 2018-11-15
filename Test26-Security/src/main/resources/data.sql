insert into sys_role(id, name) values(1,'ROLE_ADMIN');
insert into sys_role(id, name) values(2,'ROLE_USER');

insert into sys_user(id, username, password) values(1,'james', '$2a$10$LcyCHzvKp5266QlTuz27c.HbPF/DbUTUn1h8kZLa/Pm4D9n/ZiqG6');
insert into sys_user(id, username, password) values(2,'kobe', 'abcabcabc');

insert into sys_user_roles(sys_user_id, roles_id) values (1,1);
insert into sys_user_roles(sys_user_id, roles_id) values (2,2);
