# Spring Boot GraphQL example

## What is inside this project
This project is an example of graphQL usage in Spring Boot framework.

## Technologies
What we use in this project :
- Spring boot v.3.0.2
- Kotlin
- Flyway (for database migration)
- PostgreSQL
- Jakarta API (for JPA)

## How to use this project
Here is the steps you must follow to use this project :
- Load the project dependencies using gradle
- Create database with name `graphql_example`
- Setup the database connection on `gradle.properties` and `application.yml` files. Change the connection setups according to your local PostgreSQL.
- Migrate the database. If you use IntelliJ IDE, you can migrate from Gradle menu. If you desire to you terminal, you can use `./gradlew flywayMigrate` command.
- Start the server. By default, the used port is 8080, you can change it from `application.yml`
- Run the project.
- Then visit `http://localhost:<your_port>/graphiql`, you will get the graphQL query console link the shown image below

![Alt text](/graphql-console.png "Optional title")

## When to use GraphQL
Here is some clues when is the good condition to use GraphQL :
- When you have bandwidth concern i.e., integration with IoT
- Data fetching control. GraphQL allow client app to ask just the necessary data. This is the biggest benefit of GraphQL over REST.

## Note!
GraphQL is alternative for REST but for replacement! So learn both!