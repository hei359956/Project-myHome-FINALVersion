# A MyHome CRM Web App

This is a minimal CRM Web App using the fictive furniture store "MyHome" as a basis. This project was created and developed by:
- Carla Kaufmann
- Flavio Heim
- Leonardo Cepeda Carranza
- Jithin Ureath

! THIS README IS BASED ON THE TEMPLETE FROM ANDREAS MARTIN


[![License](https://img.shields.io/:license-apache-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0.html)
[![Deploy to Heroku](https://img.shields.io/badge/deploy%20to-Heroku-6762a6.svg?longCache=true)](https://heroku.com/deploy)


#### Contents:
- [Analysis](#analysis)
  - [Scenario](#scenario)
  - [User Stories](#user-stories)
  - [Use Case](#use-case)
- [Design](#design)
  - [Prototype Design](#prototype-design)
  - [Domain Design](#domain-design)
  - [Business Logic Design](#business-logic-design)
  - [Endpoint Design](#endpoint-design)
- [Implementation](#implementation)
  - [Backend Technology](#backend-technology)
  - [Frontend Technology](#frontend-technology)
- [Deployment](#deployment)
- [User Guide](#user-guide)
- [Project Management](#project-management)
  - [Roles](#roles)
  - [Milestones](#milestones)
- [Reflection](#reflection)

## Analysis

### Scenario

As a furnitre store, customers are able to look at our current offerings but also login into their account to be able to make the purchase. All the login and customer related data will be stored in the database.

### User Stories
1.	As a customer, I want to have a simple and easy shopping experience.
2.	As a customer, I would also like to be able to state what I need, e.g. a table and then different recommendations will be suggested to me.
3.	As a customer, I want to create an account so that I can get access to the Web app.
4.	As a customer, I want to log-in so that I can authenticate myself.
5.	As a customer, I want to edit my profile so that my data is stored securely.

### Use Case
![](images/use-case.png)

- UC-1 [Login on MyHome]: Customers can log-in by entering an email address and password. As an extension, new customers can register first.
- UC-2 [Register on MyHome]: Customers can register to get an account (profile) to access the MyHome system.
- UC-3 [Edit a profile]: Customers can update their profile and change information on it.
- UC-4 [Store a product in cart]: Customers can put a product in the shopping cart and interact with it there.

## Design

### Prototype Design

A bootstrap based static prototype has been created by using a prototyping application. 

In this case, the prototype application Bootstrap Studio has been used to create a basic user interface design based on an HTML grid, Bootstrap CSS and JavaScript, including the selection of web fonts and font-based icons.

The assets (HTML, CSS, JavaScript, image and font files) has been exported and will be extended in the later during implementation with jQuery, to build a dynamic website.

### Endpoint Design
- Home
- About
- Shop
    - "Various Items"
- Contact
- User Login
    - Register
    - Login
    - Change Account Credentials

## Implementation

### Backend Technology
This Web application is relying on [Spring Boot](https://projects.spring.io/spring-boot) and the following dependencies:

- [Spring Boot](https://projects.spring.io/spring-boot)
- [Spring Web](https://docs.spring.io/spring/docs/current/spring-framework-reference/web.html)
- [Spring Data](https://projects.spring.io/spring-data)
- [Java Persistence API (JPA)](http://www.oracle.com/technetwork/java/javaee/tech/persistence-jsp-140049.html)
- [H2 Database Engine](https://www.h2database.com)
- [PostgreSQL](https://www.postgresql.org)

To bootstrap the application, the [Spring Initializr](https://start.spring.io/) has been used.

Then the following further dependencies has been added to the project `pom.xml`:

- Swagger and Swagger UI:
```XML
<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-boot-starter</artifactId>
    <version>3.0.0</version>
</dependency>
```

- Java HTML Parser and JWT:
```XML
<dependency>
    <groupId>org.jsoup</groupId>
    <artifactId>jsoup</artifactId>
    <version>1.14.2</version>
</dependency>
<dependency>
    <groupId>io.jsonwebtoken</groupId>
    <artifactId>jjwt-api</artifactId>
    <version>0.11.2</version>
</dependency>
<dependency>
    <groupId>io.jsonwebtoken</groupId>
    <artifactId>jjwt-impl</artifactId>
    <version>0.11.2</version>
    <scope>runtime</scope>
</dependency>
<dependency>
    <groupId>io.jsonwebtoken</groupId>
    <artifactId>jjwt-gson</artifactId>
    <version>0.11.2</version>
    <scope>runtime</scope>
</dependency>
```

### Frontend Technology
This Web application is relying on the following frontend technology/libraries:

- jQuery
- Bootstrap
- Visual Studio Code

## Deployment
This spring boot has been deployed to Heroku by using a pre-configuration scripts `app.json` and `Procfile`.

## User Guide
The Web application can be accessed over the browser by using the following address: `https://myhome-project-1.herokuapp.com`.

## Project Management

### Roles
- All-rounder: [Carla Kaufmann](https://www.linkedin.com/in/carla-kaufmann-371167154/)
- Database Developer: [Flavio Heim](https://github.com/FHeim)
- Website Developer: [Leonardo Cepeda Carranza](https://www.linkedin.com/in/leonardo-c-3a5042b8/)
- Business Analyst: [Jithin Ureath](https://ch.linkedin.com/in/jithin-ureath-10340b1a6)

### Milestones
1. **Analysis**: Scenario ideation, use case analysis and user story writing.
2. **Prototype Design**: Creation of Bootstrap static web-design prototype.
3. **Domain Design**: Definition of domain model.
4. **Business Logic and API Design**: Definition of business logic and API.
5. **Data and API Implementation**: Implementation of data access and business logic layers, and API.
6. **Security and Frontend Implementation**: Integration of security framework and frontend realisation.
7. **Deployment**: Deployment of Web application on cloud infrastructure.

## Reflection

This WebApp assignment was quite challenging for our group. None of us had any web development experience and we were struggling quite a lot. In addition to some personal family matters, we also had a change in our teams and gained a new member. An additional challenge since the member is not located on the same continent and trying to find a suitable time for everybody to meed up and work was not easy. Closer to the end, we were struggling with implenting all the features properly and bug-free aswell. Overall we are grateful to be able to start this journey but are also aware that the product we are delivering is not the best, but the best we could do.


#### Maintainer
- [Carla Kaufmann](https://github.com/hei359956)

#### License
- [Apache License, Version 2.0](blob/master/LICENSE)