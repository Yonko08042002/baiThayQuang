create database quanLyNhanSu
go

use quanLyNhanSu

go

create table quanLy(
 maNV varchar(15) primary key,
hoTen varchar(10),
heSoLuong int ,
)

insert into quanLy 
values
('NV01','bap',1),
('NV02','tun',10)

select * , heSoLuong  * 14900000 as luong from quanLy 