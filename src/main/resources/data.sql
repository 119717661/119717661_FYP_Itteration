insert into employee values (101,'Manager', 'Piotr','Janus' );
insert into employee values (102,'Project Leader', 'Randy' ,'Randsom');
insert into employee values (103,'Support', 'Borris' ,'Johnson');
INSERT INTO PROCESS ( PROCID , PROC_NAME ) VALUES (101, 'Product Complaint');
INSERT INTO PROCESS ( PROCID , PROC_NAME ) VALUES (102, 'Adverse Event');
INSERT INTO TASK( TASKID, TASK_NAME , PROC_ID ) VALUES (101, 'Document Searching', 101);
INSERT INTO TASK( TASKID, TASK_NAME , PROC_ID ) VALUES (102, 'Phone Conversation', 101);
INSERT INTO TASK( TASKID, TASK_NAME , PROC_ID ) VALUES (201, 'Document Searching', 102);
INSERT INTO TASK( TASKID, TASK_NAME , PROC_ID ) VALUES (202, 'Phone Conversation', 102);  