# SpaceWebApp

The Glassfish container that can be used to run this can be found at: 
https://glassfish.java.net/download.html. Download the full platform and 
copy the folder "glassfish4" into the same directory as this file. This
is needed to run the webapp

To start the container, run start-domain.bat in a console. To run on Mac OS
or Linux, enter "./glassfish4/bin/asadmin start-domain" on a terminal in
this directory.

To compile and deploy the project, run compile.bat. To run on Mac OS or Linux,
change into the "space-webapp" directory and run "mvn clean package". Then copy
the package (in "target" directory, called "space-webapp.war") into the 
autodeploy folder (glassfish4/glassfish/domains/domain1/autodeploy/).

To view the result, go to http://localhost:8080/space-webapp/ in a browser 
window (note: the container must be started and the package in the autodeploy
folder for this to work).
