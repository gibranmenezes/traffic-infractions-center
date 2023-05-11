# Traffic Infractions Center

>Status: Version 1.0 - developing ⚠️ : Disclaimer: My computer get some problems and the docker container just disappeared and I couldn't send it to te repository.

#

###  It is a REST API projetc which manager information from a system that simulates an Eletronic Traffic Radar.
#

>#### Project Structure:
#

* Backend:
  * * Traffic Violations Manager API : [api](https://github.com/gibranmenezes/traffic-violation-manager/tree/main/backend/traffic-violation-manager-api)
  * * Traffic Violations Generator : [generator](https://github.com/gibranmenezes/traffic-violation-manager/tree/main/backend/com.trafficviolationgenerator)

* Frontend:
  *  * Interface: [interface](https://github.com/gibranmenezes/traffic-violation-manager/tree/main/frontend/interface)
  
  ##### The Traffic Violation Generator simulates an Eletronic Traffic Radar and sends the information to the API which process these information and salve in the data base. The Interface requests to the API the Traffic Violations Records and shows in the browser.

#
>### Technologies:
#
* Backend:
* * Java
* * SpringBoot FrameWork
* * Flyway  - for database migrations
##

* Frontend:
* * Angular 
##
* Data Base
* * Postgres
##

* Documentation:
*  * Swagger : [documentation](http://localhost:8080/swagger-ui.html)
#

>### How perform it:

* Do the download of the project 
* Open the backend files in the IntelliJ
* Run the API : http://localhost:8080/
* Run the system generator 
* Open the frontend file with vscode
* Open the bash in the project folder
* Run the command ng serve
* Open webbrowser in : http://localhost:4200/



