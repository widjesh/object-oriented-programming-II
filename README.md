# Spring Boot Snelstart

## Stappen om te Beginnen

### 1. Installeer Java 21

Zorg ervoor dat je Java 21 hebt geïnstalleerd voordat je begint. Je kunt de nieuwste JDK downloaden van [Oracle's officiële website](https://www.oracle.com/java/technologies/javase-downloads.html) of [OpenJDK](https://openjdk.org/).

### 2. Spring Initializer

1. Open [Spring Initializer](https://start.spring.io/).
2. Selecteer de volgende afhankelijkheden:
   - **Spring Web**
   - **Spring Data JPA**
   - **H2 Database**
   - **Spring Boot DevTools**
3. Genereer het project en importeer het in je IDE (bijv. IntelliJ IDEA).

### 3. Update `application.properties`

Configureer H2 voor je project. Open `src/main/resources/application.properties` en voeg het volgende toe:

```properties
# H2 Database Configuratie
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
```

### 4. Automatisch Herladen Inschakelen in IntelliJ IDEA

Om ervoor te zorgen dat je applicatie automatisch herlaadt tijdens de ontwikkeling, volg deze stappen:

#### A. Schakel Automatisch Project Bouwen In

1. Ga naar **Bestand** > **Instellingen** > **Build, Execution, Deployment** > **Compiler**.
2. Vink de optie **Enable Build Project Automatically** aan.

#### B. Sta Auto-Make Toe

1. Ga naar **Bestand** > **Instellingen** > **Geavanceerde Instellingen**.
2. Onder **Build, Execution, Deployment**, schakel de optie in:
   - **Allow auto-make to start even if developed application is currently running**.

### 5. Begin met Ontwikkelen

- Start je Spring Boot-applicatie.
- Gebruik de H2-console op `http://localhost:8080/h2-console` (standaard) voor database-interacties.
- Veel succes! 🎉
