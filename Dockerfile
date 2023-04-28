FROM openjdk:17

RUN mkdir /apps


WORKDIR /apps

ADD target/DockerAssignment-0.0.1-SNAPSHOT.jar /apps

EXPOSE 8090

ENTRYPOINT [ "java","-jar","DockerAssignment-0.0.1-SNAPSHOT.jar" ]