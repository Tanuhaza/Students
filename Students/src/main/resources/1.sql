/*
-- Query: SELECT * FROM studentsdb.course
LIMIT 0, 1000

-- Date: 2017-12-06 19:14
*/
INSERT INTO `course` (`idCourse`,`courseNumber`) VALUES (1,'1');
INSERT INTO `course` (`idCourse`,`courseNumber`) VALUES (2,'2');
INSERT INTO `course` (`idCourse`,`courseNumber`) VALUES (3,'3');

INSERT INTO `group` (`idGroup`,`groupName`,`course_idCourse`) VALUES (1,'БМ-61',2);
INSERT INTO `group` (`idGroup`,`groupName`,`course_idCourse`) VALUES (2,'БМ-71',1);
INSERT INTO `group` (`idGroup`,`groupName`,`course_idCourse`) VALUES (3,'БЕ-71',1);

INSERT INTO `student` (`idstudent`,`firstName`,`lastName`,`group_idGroup`) VALUES (1,'Ольга','Бондаренко',1);
INSERT INTO `student` (`idstudent`,`firstName`,`lastName`,`group_idGroup`) VALUES (2,'Вікторія','Нікітіна',2);
INSERT INTO `student` (`idstudent`,`firstName`,`lastName`,`group_idGroup`) VALUES (3,'Олена','Висока',1);
INSERT INTO `student` (`idstudent`,`firstName`,`lastName`,`group_idGroup`) VALUES (4,'Віктор','Хрущ',2);
INSERT INTO `student` (`idstudent`,`firstName`,`lastName`,`group_idGroup`) VALUES (5,'Микита','Бортник',1);
INSERT INTO `student` (`idstudent`,`firstName`,`lastName`,`group_idGroup`) VALUES (6,'Євгенія','Моцна',2);

INSERT INTO `subject` (`idSubject`,`subjectName`) VALUES (1,'Вища математика');
INSERT INTO `subject` (`idSubject`,`subjectName`) VALUES (2,'Біологія');
INSERT INTO `subject` (`idSubject`,`subjectName`) VALUES (3,'Цитологія');

INSERT INTO `studentsdb`.`subject_has_student` (`subject_idSubject`, `student_idstudent`) VALUES ('1', '1');
INSERT INTO `studentsdb`.`subject_has_student` (`subject_idSubject`, `student_idstudent`) VALUES ('1', '2');
INSERT INTO `studentsdb`.`subject_has_student` (`subject_idSubject`, `student_idstudent`) VALUES ('1', '3');
