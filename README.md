# Hotel DDJ API

## Descripción

Hotel DDJ API es una aplicación desarrollada en Java utilizando Spring Boot que permite gestionar clientes, habitaciones, reservas, productos y categorías mediante servicios REST. La aplicación implementa persistencia de datos en MySQL, documentación automática con Swagger y despliegue mediante Docker.

## Integrantes

### CIPAS DDJ

* Daniela Ramos Escudero – 7512420006
* Danis Daniel Barrero Rodríguez – 7512420012
* Jaime Alberto Rodelo Ramírez – 7512420042

## Información Académica

**Universidad de Cartagena**

Programa de Ingeniería de Software

Asignatura: Ingeniería de Software

Docente: Ingeniero Iván Romero Guevara

## Tecnologías Utilizadas

* Java 17
* Spring Boot
* Spring Data JPA
* MySQL
* Docker
* Swagger OpenAPI
* JUnit
* GitHub
* Postman

## Funcionalidades

### Clientes

* Registrar clientes
* Consultar clientes
* Actualizar clientes
* Eliminar clientes

### Habitaciones

* Registrar habitaciones
* Consultar habitaciones
* Actualizar habitaciones
* Eliminar habitaciones

### Reservas

* Registrar reservas
* Consultar reservas
* Actualizar reservas
* Eliminar reservas

### Categorías

* Registrar categorías
* Consultar categorías
* Actualizar categorías
* Eliminar categorías

### Productos

* Registrar productos
* Consultar productos
* Actualizar productos
* Eliminar productos

## Arquitectura

El proyecto implementa una arquitectura en capas:

Controller → Service → Repository → MySQL

## Documentación Swagger

Una vez ejecutada la aplicación:

http://localhost:8081/swagger-ui/index.html

## Ejecución con Docker

### Levantar los servicios

```bash
docker compose up -d
```

### Verificar contenedores

```bash
docker ps
```

## Pruebas

Las pruebas funcionales fueron realizadas mediante:

* Swagger
* Postman

Las pruebas unitarias fueron ejecutadas utilizando:

* JUnit

## Repositorio

Proyecto académico desarrollado como parte de la asignatura Ingeniería de Software aplicando metodología Scrum, principios SOLID, código limpio y buenas prácticas de desarrollo.
