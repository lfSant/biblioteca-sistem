FROM maven:3.8.1-openjdk-17-slim
CMD ["mvn", "clean", "install"]
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]