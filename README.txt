# vnpost
Group 5
1. Ngô Quang Trọng SE04542 - Leader - All functions back-end development.
2. Nguyễn Nam Anh - Font-end development.
3. Phùng Trí Đức SE05234 - Create demo data for database.
4. Bùi Văn Tuấn SE05634 - Font-end development.
5. Nguyễn Trung Hải SE06350 - Code entity and DAO classes.

================== Install guideline ========================
STEP1 : Before, you create database with database name is "PRJ321_PROJECT".
STEP2: Use databaseScript.sql for generate database, file databaseScript.sql in folder "database" on source folder.
STEP3: Open project on netbeans and config database context in Other Sources/src/main/resources/datasource/
    Open datasource-configuration.property and config as below template:
     
    ds.database-driver=net.sourceforge.jtds.jdbc.Driver
    ds.url=jdbc:jtds:sqlserver://localhost:1433/PRJ321_PROJECT
    ds.username=<<your sql username>>
    ds.password=<<your sql password>>

STEP4: Before you run project, you must confim that INTERNET CONNECTED, becase, netbeans will download 3rd libulary and freamwork.

Account admin for login:
Username: trongnq
Password: 123456