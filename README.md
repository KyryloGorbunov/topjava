![Project Structure.png](Project%20Structure.png)
### Development of a fully functional Spring/JPA Enterprise application with authentication and role-based access control using the <a href="https://zeroturnaround.com/rebellabs/java-tools-and-technologies-landscape-2016/" target="_blank">most popular Java tools and technologies</a>: Maven, Spring MVC, Security, JPA(Hibernate), REST(Jackson), Bootstrap (css, js), DataTables, jQuery + plugins, Java 8 Stream and Time API, and persistence in PostgreSQL and HSQLDB databases.

- The main focus will be on solving various development issues in Spring/JPA, as well as on structural (clean and reliable) Java coding and application architecture.
- Significant attention is given to code testing: the project includes over 100 JUnit tests.
- Despite its relatively small size, the application is developed from scratch as a large project: for example, using Hibernate second-level cache, configuring Jackson to work with Hibernate lazy loading, creating converters for LocalDateTime types (Java 8 time API).
- Architectural patterns are discussed: application layers and how to properly distribute logic across layers, when to use Data Transfer Objects. As a result, the output is not an educational project, but a well-scalable template for a large project using all the covered technologies.
- Great attention is paid to details: database population, transaction usage, service and REST controller testing, EntityManagerFactory configuration, choice of connection pool implementation. Special attention is paid to working with databases: through Spring JDBC, Spring ORM, and Spring Data JPA.
- The most in-demand frameworks are used: Maven, Spring Security 4 along with Spring Security Test, Spring Data JPA for convenient database work, Logback logging library implementing SLF4J, widely used Bootstrap, and jQuery.

### <a href="https://github.com/KyryloGorbunov/topjava" target=_blank>Development Application Demo</a>

## Project Plan (links to some topics are open for viewing)
### Project Architecture. Persistence.
- Version Control Systems
- Java 8: Lambda, Stream API
- Overview of technologies and tools used in the project.
- Maven build tool
- WAR. Tomcat web container. Servlets.
- Logging.
- Overview of standard libraries. Apache Commons, Guava
- Application layers. Creating an application skeleton.
- Overview of Spring Framework. Spring Context.
- Testing via JUnit.
- Spring Test
- Databases. PostgreSQL. Overview of NoSQL and Java persistence solutions without ORM.
- Database configuration in IDEA.
- Database initialization scripts. Spring Jdbc Template.
- Spring: database initialization and population
- ORM. Hibernate. JPA.
- Testing JPA service with AssertJ
- HSQLDB support
- Transactions
- Maven and Spring profiles
- Connection pool
- Spring Data JPA
- Hibernate cache

### WEB Development
- Spring cache
- Spring Web
- JSP, JSTL, i18n
- Tomcat maven plugin. JNDI
- Spring Web MVC
- Spring Internationalization
- Spring MVC testing
- REST controllers
- Testing REST controllers. Jackson.
- jackson-datatype-hibernate. Testing via matchers.
- Testing via SoapUi. UTF-8
- WebJars.
- Bootstrap. jQuery datatables.
- AJAX. jQuery. Notifications.
- Spring Security
- Spring Binding/Validation
- Working with DataTables via Ajax.
- Spring Security Test
- Customizing JSON (@JsonView) and validation (groups)
- Encoding password
- CSRF (adding CSRF protection to the project)
- form-login. Spring Security Taglib
- Handler interceptor
- Spring Exception Handling
- Locale change
- JSON filtering using @JsonView
- XSS (Cross Site Scripting) protection
- Datatables localization, validation errors
- 404 error handling (NotFound)
- Access to AuthorizedUser
- Lombok, H2 database, ApplicationRunner
- Spring Data REST + HATEOAS
- Swagger/ OpenAPI 3.0