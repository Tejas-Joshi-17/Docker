FROM ubuntu/jdk:17-24.04_stable

WORKDIR /app

COPY ./Morning.java .
COPY ./Night.java .

RUN javac Morning.java & javac Night.java

ENTRYPOINT [ "java" ]
CMD [ "Morning.java" ]