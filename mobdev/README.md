**Prerequisites**
1) Install and configure environtment variables for Jdk 1.8
2) Install and configure environtment variables for mvn 3.6.1

**How to run app**
1) git clone https://github.com/karavenap/ms-mobdev.git
2) root folder ms-mobdev execute command mvn clean package
3) go to folder ms-mobdev\target and execute command "java -jar ms-mobdev-0.0.1-SNAPSHOT.jar"  

**How to execute app**
1) Import proyect postman locate in folder ms-mobdev/CollectionRickyAndMorty.postman_collection.json
2) To run the project, check the url http://localhost:8080/rickyandmorty/{id} and change the id of the parameter as needed