# Complaint Registration Portal

This is Advanced Java project for Complaint Registration at college level it will help students and all the related stakeholders.

**Technology/Softwares used**
1. NetBeans IDE v8.2
2. MySql Server version: 8.0.18
3. mysql-connector-java-5.1.48
4. HTML5
5. CSS3
6. Javascript

**Database Tables**
1. Post
   ```
   CREATE TABLE post (
   uid int(11) NOT NULL AUTO_INCREMENT,
   title varchar(255) DEFAULT NULL,
   deptName varchar(255) DEFAULT NULL,
   facultyName varchar(255) DEFAULT NULL,
   description varchar(500) DEFAULT NULL,
   uname varchar(255) DEFAULT NULL,
   anonymous int(11) DEFAULT NULL,
   PRIMARY KEY (uid),
   KEY uname (uname),
   CONSTRAINT post_ibfk_1 FOREIGN KEY (uname) REFERENCES user (uname));```

2. User
   ```
   CREATE TABLE user (
   name varchar(255) NOT NULL,
   email varchar(255) NOT NULL,
   uname varchar(255) NOT NULL,
   password varchar(255) DEFAULT NULL,
   admin int(11) DEFAULT '0',
   PRIMARY KEY (uname))```

**Implementation plan**

1.  Developers
    *  Frontend + Backend - Mayur Satav
    *  Database + Backend - Mayur Masram
    *  Database + Documentation  - Akanksha
