FROM openjdk:8
ADD target/docker-maven-achievement-jar-with-dependencies.jar docker-maven6-achievement.jar
#EXPOSE 8085
ENTRYPOINT ["java","-jar","docker-maven6-achievement.jar"]