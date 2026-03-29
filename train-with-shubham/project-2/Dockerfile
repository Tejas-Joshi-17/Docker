FROM ubuntu/jdk:17-24.04_stable

WORKDIR /app

COPY . .

RUN javac Main.java

ENTRYPOINT [ "java" ]
CMD [ "Main.java" ]