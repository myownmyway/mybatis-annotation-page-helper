
create database generator;
use generator;
select database();
create table if not exists `user`
(
    id       int(11) primary key auto_increment comment '用户id，自增主键',
    username varchar(255) comment '用户名',
    password varchar(255) comment '用户密码',
    phone    varchar(255) comment '用户手机号',
    address  varchar(255) comment '用户地址',
    id_card  varchar(255) comment '用户身份证'
) engine = InnoDB
  charset = utf8 COMMENT '用户表';

insert into `user`(username, password, phone, address,id_card) values ("zhangsan","123456","13507660631","zheJiang","0001");
insert into `user`(username, password, phone, address,id_card) values ("lsi","123456","13507660632","zheJiang","0002");
insert into `user`(username, password, phone, address,id_card) values ("wangwu","123456","13507660633","zheJiang","0003");
insert into `user`(username, password, phone, address,id_card) values ("zhaoliu","123456","13507660634","zheJiang","0004");
insert into `user`(username, password, phone, address,id_card) values ("sunqi","123456","13507660635","zheJiang","0005");
insert into `user`(username, password, phone, address,id_card) values ("dengchao","123456","13507660636","zheJiang","0006");
insert into `user`(username, password, phone, address,id_card) values ("sunli","123456","13507660637","zheJiang","0007");
insert into `user`(username, password, phone, address,id_card) values ("huangxiaoming","123456","13507660638","zheJiang","0008");
insert into `user`(username, password, phone, address,id_card) values ("zhaowei","123456","13507660639","zheJiang","0009");
insert into `user`(username, password, phone, address,id_card) values ("zhangsan","123456","13907660631","zheJiang","0010");
insert into `user`(username, password, phone, address,id_card) values ("zhangsan","123456","13907660631","zheJiang","0010");
insert into `user`(username, password, phone, address,id_card) values ("zhangsan001","123456","13907660631","zheJiang","0010");
insert into `user`(username, password, phone, address,id_card) values ("zhangsan002","123456","13907660632","zheJiang","0010");
insert into `user`(username, password, phone, address,id_card) values ("zhangsan003","123456","13907660633","zheJiang","0010");
insert into `user`(username, password, phone, address,id_card) values ("zhangsan004","123456","13907660634","zheJiang","0010");
insert into `user`(username, password, phone, address,id_card) values ("zhangsan005","123456","13907660635","zheJiang","0010");
insert into `user`(username, password, phone, address,id_card) values ("zhangsan006","123456","13907660636","zheJiang","0010");
insert into `user`(username, password, phone, address,id_card) values ("zhangsan007","123456","13907660637","zheJiang","0010");
insert into `user`(username, password, phone, address,id_card) values ("zhangsan008","123456","13907660638","zheJiang","0010");
insert into `user`(username, password, phone, address,id_card) values ("zhangsan009","123456","13907660639","zheJiang","0010");
insert into `user`(username, password, phone, address,id_card) values ("zhangsan010","123456","13907660100","zheJiang","0010");