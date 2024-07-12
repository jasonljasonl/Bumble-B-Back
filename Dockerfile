# Utiliser une image de base OpenJDK
FROM openjdk:17-jdk-slim

# Ajouter un volume pour les logs
VOLUME /tmp

# Copier l'application dans le conteneur
COPY target/rest-service-complete-0.0.1-SNAPSHOT.jar app.jar

# Démarrer l'application Spring Boot
ENTRYPOINT ["java","-jar","/app.jar"]

# Exposer le port sur lequel l'application écoute
EXPOSE 8080