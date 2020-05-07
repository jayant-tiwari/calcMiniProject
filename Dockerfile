FROM openjdk:8
MAINTAINER 30071997 jayant.tiwari@iiitb.org
COPY ./target/calculator-devops-1.0-SNAPSHOT-jar-with-dependencies.jar ./
CMD ["java -jar calculator-devops-1.0-SNAPSHOT-jar-with-dependencies.jar"]