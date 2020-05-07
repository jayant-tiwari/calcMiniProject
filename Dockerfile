FROM openjdk:8
MAINTAINER JayantTiwari jayant.tiwari@iiitb.org
COPY ./target/calculatorMiniProject-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "calculatorMiniProject-1.0-SNAPSHOT-jar-with-dependencies.jar"]