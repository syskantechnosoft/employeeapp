FROM openjdk:11
COPY ./target/employeeapp.jar app.jar
CMD ["java","-jar","app.jar"]
