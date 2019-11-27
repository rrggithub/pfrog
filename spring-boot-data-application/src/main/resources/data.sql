insert into dept(id, name) values (1, 'security');
insert into dept(id, name) values (2, 'logistics');
insert into dept(id, name) values (3, 'tennis');
insert into dept(id, name) values (4, 'cricket');

insert into emp(id, first_name, middle_name, last_name, dept_id) values (1,'virat', '', 'kohli', 4);
insert into emp(id, first_name, middle_name, last_name, dept_id) values (2,'roger', '', 'federor', 3);

insert into br_rostr(id, is_affirm, affirm_date) values (1, 'false', '2004-06-29');

insert into br_rostr_emp(br_id, emp_id) values (1, 1);
insert into br_rostr_emp(br_id, emp_id) values (1, 2);

insert into item_category(id,name,desc) values(1,'category','desc1');

insert into item_issues(id,name,desc) values(1,'issues1','desc1');
insert into item_issues(id,name,desc) values(2,'issues2','desc2');

insert into item_inspection_method(id,name,desc) values(1,'inspection1','desc1');
insert into item_inspection_method(id,name,desc) values(2,'inspection2','desc2');

insert into chkl_type(id, year, month) values (1,2019,10);

insert into item_type(id, name, desc, item_category_id) values(1,'item1','desc1', 1);
insert into item_type(id, name, desc, item_category_id) values(2,'item2','desc1', 1);

insert into item_type_inspection_method_xref(item_type_id,inspection_method_id) values (1,1);

insert into item_type_issues_xref(item_type_id,item_issue_id) values(1,1);

insert into chkl_type_item_type_xref(chkl_type_id,item_type_id) values (1,1);