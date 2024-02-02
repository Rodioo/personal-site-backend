FROM --platform=linux/amd64 openjdk:17

RUN mkdir -p /app

WORKDIR /app

COPY build/libs/*.jar ./app.jar

EXPOSE $PORT

CMD [ "java", "-jar", "./app.jar" ]