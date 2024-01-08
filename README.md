127.0.0.1:6379> LRANGE studentList 0 -1
 1) "StudentID:010 Name:Megan Taylor Age:23 Grade:A"
 2) "StudentID:009 Name:Chris Wilson Age:19 Grade:C"
 3) "StudentID:008 Name:Laura Martinez Age:21 Grade:B"
 4) "StudentID:007 Name:Daniel Lee Age:22 Grade:A"
 5) "StudentID:006 Name:Emily Davis Age:20 Grade:C"
 6) "StudentID:005 Name:Michael Brown Age:23 Grade:B"
 7) "StudentID:004 Name:Sara Williams Age:19 Grade:A"
 8) "StudentID:003 Name:Alex Johnson Age:21 Grade:C"
 9) "StudentID:002 Name:Jane Smith Age:22 Grade:B"
10) "StudentID:001 Name:John Doe Age:20 Grade:A"
This is an output for which i added data in redis-cli



After that i connected to  java with redis data fetched from studentList
At that time i got  output

C:\D12\RedisExamples\redis-demo>mvn exec:java -Dexec.mainClass="com.example.RedisDemo"
[INFO] Scanning for projects...
[INFO]
[INFO] -----------------------< com.example:redis-demo >-----------------------
[INFO] Building redis-demo 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- exec:3.1.0:java (default-cli) @ redis-demo ---
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
Connected to Redis server
Fetched student details from Redis:
StudentID:010 Name:Megan Taylor Age:23 Grade:A
StudentID:009 Name:Chris Wilson Age:19 Grade:C
StudentID:008 Name:Laura Martinez Age:21 Grade:B
StudentID:007 Name:Daniel Lee Age:22 Grade:A
StudentID:006 Name:Emily Davis Age:20 Grade:C
StudentID:005 Name:Michael Brown Age:23 Grade:B
StudentID:004 Name:Sara Williams Age:19 Grade:A
StudentID:003 Name:Alex Johnson Age:21 Grade:C
StudentID:002 Name:Jane Smith Age:22 Grade:B
StudentID:001 Name:John Doe Age:20 Grade:A
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  0.821 s
[INFO] Finished at: 2024-01-08T11:06:46+05:30
[INFO] ------------------------------------------------------------------------
