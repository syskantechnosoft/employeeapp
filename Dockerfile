FROM openjdk:11
COPY ./target/employeeapp.jar employeeapp.jar
CMD ["java","-jar","employeeapp.jar"]