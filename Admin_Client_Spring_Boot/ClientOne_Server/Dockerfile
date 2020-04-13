 
# Base Image ubuntu
FROM ubuntu:18.04

# Installing dependencies
RUN apt-get update
RUN apt-get install -y openjdk-8-jdk maven 

# coping the required application files
COPY . /spring_boot_client_one_server
WORKDIR /spring_boot_client_one_server/clientOne

# building the spring boot app
RUN mvn clean install

WORKDIR /spring_boot_client_one_server/clientOne/target

# running the spring boot app
CMD ["java", "-jar", "clientOne-0.0.1-SNAPSHOT.jar"]
