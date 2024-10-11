from adoptopenjdk:11-jre-hotspot
Volume /tmp
ADD target/* .jar app.jar
CMD ["JAVA","-jar","app.jar","--spring.profiles.active=prod"]
EXPOSE 8080