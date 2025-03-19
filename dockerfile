FROM openjdk:17               
COPY target/SpringBootApp-0.0.1-SNAPSHOT.jar SpringBootApp-0.0.1-SNAPSHOT.jar 
ENTRYPOINT ["java","-jar","SpringBootApp-0.0.1-SNAPSHOT.jar"]   
EXPOSE 8080