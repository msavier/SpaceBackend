cd space-webapp\
call mvn clean package
copy target\space-webapp.war ..\glassfish4\glassfish\domains\domain1\autodeploy\space-webapp.war
cd ..\
