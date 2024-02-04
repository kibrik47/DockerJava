FROM openjdk:11-jdk-slim

WORKDIR /usr/src/app

COPY PrintNumbers.java .

RUN javac PrintNumbers.java

CMD ["java", "PrintNumbers"]