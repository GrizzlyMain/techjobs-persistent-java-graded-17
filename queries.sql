--Part 1
--column = ID, Data Type = Int/Primary Key
--column = employer, Data Type - varchar(255)
--column = employer, Data Type - varchar(255)
--column = employer, Data Type - varchar(255)
-- found with SHOW FIELDS FROM job FROM techjobs; from https://stackoverflow.com/questions/1215368/how-to-get-the-mysql-table-columns-data-type

--Part 2
-- SELECT name FROM employer WHERE location = "St. Louis City";
--Part 3
--DROP TABLE job;
--Part 4
-- SELECT * FROM skill LEFT JOIN job_skills ON skill.id = job_skills.skills_id WHERE job_skills.jobs_id IS NOT NULL ORDER BY name ASC;