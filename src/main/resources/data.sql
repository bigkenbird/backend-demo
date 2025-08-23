INSERT INTO employee (code, name, title, department, arrivaldate) VALUES ('1001', 'Peter', '經理', '產品部', '2002/08/23');
INSERT INTO employee (code, name, title, department, arrivaldate) VALUES ('1002', 'Mary', '工程師', '產品部', '2012/01/13');
INSERT INTO employee (code, name, title, department, arrivaldate) VALUES ('1003', 'Andy', '工程師', '產品部', '2001/09/11');
INSERT INTO employee (code, name, title, department, arrivaldate) VALUES ('1004', 'Sue', '工程師', '產品部', '2022/07/10');
INSERT INTO employee (code, name, title, department, arrivaldate) VALUES ('2005', 'Sunny', '專員', '業務部', '2011/10/02');
INSERT INTO employee (code, name, title, department, arrivaldate) VALUES ('2006', 'Cherry', '專員', '業務部', '2008/06/21');
INSERT INTO employee (code, name, title, department, arrivaldate) VALUES ('1007', 'Han', '工程師', '產品部', '2006/07/20');
INSERT INTO employee (code, name, title, department, arrivaldate) VALUES ('2008', 'Eddie', '專員', '業務部', '2014/09/30');
INSERT INTO employee (code, name, title, department, arrivaldate) VALUES ('1009', 'Bill', '工程師', '產品部', '2015/11/18');
INSERT INTO employee (code, name, title, department, arrivaldate) VALUES ('1010', 'Lio', '工程師', '產品部', '2017/04/25');
INSERT INTO employee (code, name, title, department, arrivaldate) VALUES ('1011', 'Stanley', '工程師', '產品部', '2020/03/03');
INSERT INTO employee (code, name, title, department, arrivaldate) VALUES ('1012', 'Sean', '工程師', '產品部', '2021/06/01');
INSERT INTO employee (code, name, title, department, arrivaldate) VALUES ('2013', 'Mei', '經理', '業務部', '2020/02/10');
INSERT INTO employee (code, name, title, department, arrivaldate) VALUES ('2014', 'Cody', '專員', '業務部', '2016/03/20');
INSERT INTO employee (code, name, title, department, arrivaldate) VALUES ('1015', 'Lawrence', '工程師', '產品部', '2019/10/02');



INSERT INTO menu (id, parentid, label, menuixd, sort, url, disabled) VALUES (1, 0, '系統管理', 'SYSMGM000', 10, '',true);
INSERT INTO menu (id, parentid, label, menuixd, sort, url, disabled) VALUES (2, 1, '員工資料查詢', 'SYSMGM001', 11, '/esm/esmqu001/home',true);
INSERT INTO menu (id, parentid, label, menuixd, sort, url, disabled) VALUES (3, 1, '員工明細資料查詢', 'SYSMGM002', 12, '/esm/esmqu002/detail',true);
INSERT INTO menu (id, parentid, label, menuixd, sort, url, disabled) VALUES (4, 1, '功能未實作', 'SYSMGM003', 11, '/oth/othni001/home',true);
INSERT INTO menu (id, parentid, label, menuixd, sort, url, disabled) VALUES (5, 0, '功能選單1', 'FUNGRP000', 20, '',true);
INSERT INTO menu (id, parentid, label, menuixd, sort, url, disabled) VALUES (6, 5, '功能未實作', 'FUNGRP001', 21, '/oth/othni001/home',true);
INSERT INTO menu (id, parentid, label, menuixd, sort, url, disabled) VALUES (7, 5, '功能未實作', 'FUNGRP002', 22, '/oth/othni001/home',true);
INSERT INTO menu (id, parentid, label, menuixd, sort, url, disabled) VALUES (8, 0, '功能選單2', 'FUNGRO000', 30, '',true);
INSERT INTO menu (id, parentid, label, menuixd, sort, url, disabled) VALUES (9, 8, '功能未實作', 'FUNGRO001', 31, '/oth/othni001/home',true);
INSERT INTO menu (id, parentid, label, menuixd, sort, url, disabled) VALUES (10, 0, 'SQL', 'SQLMGM000', 10, '/sql/sql001/home',true);


INSERT INTO sys_user (id, account, password, authority) VALUES (1, 'ken','123456','admin');
INSERT INTO sys_user (id, account, password, authority) VALUES (2, 'leo','123456','general');

