FROM adoptopenjdk/openjdk17:alpine-jre
EXPOSE 8081
ADD build/libs/SpringBoots_Testcontainers-0.0.1-SNAPSHOT-plain.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]