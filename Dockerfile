# Utiliser une image de base OpenJDK
FROM openjdk:17-jdk-slim

# Ajouter un volume pour les logs
VOLUME /tmp

# Copier l'application dans le conteneur
COPY target/rest-service-complete-0.0.1-SNAPSHOT.jar rest-service-complete-0.0.1-SNAPSHOT.jar

# Exposer le port sur lequel l'application écoute
EXPOSE 8080

# Démarrer l'application Spring Boot
ENTRYPOINT ["java","-jar","/rest-service-complete-0.0.1-SNAPSHOT.jar"]
