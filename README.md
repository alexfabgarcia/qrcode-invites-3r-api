# qrcode-invites-3r-api

API Rest that provides services to allow people entering on parties with invitation via QR code reader.

## Requires

[Java JDK 8](http://lmgtfy.com/?q=install+jdk+8)

## Compilation

To compile the code you can use the [Maven](https://maven.apache.org/) wrapped version, running the following command:
```
.\mvnw clean install
```

## Configuration

Change the server port on `src/main/resources/application.properties`.
```
server.port=8085
```

## Running
```
.\mvnw spring-boot:run
```

## Consuming

To test the API you can use you prefered browser or any HTTP client, suck as [Postman](http://lmgtfy.com/?q=postman+chrome) or [Curl](http://lmgtfy.com/?q=curl+http+calls).

All available endpoints are listed below using `curl` calls:

```
curl http://localhost:8085/ingressos
```