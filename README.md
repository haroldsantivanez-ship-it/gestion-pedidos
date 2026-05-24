# Sistema de Gestión de Pedidos - Delivery

## Descripción
Proyecto desarrollado con Spring Boot para gestionar clientes, productos y pedidos mediante una API REST.

El sistema permite:
* Registrar clientes.
* Registrar productos.
* Crear pedidos.
* Actualizar automáticamente el stock.
* Validar datos ingresados.
* Aplicar seguridad por roles (ADMIN / USER).
* Registrar auditoría de operaciones.

## Tecnologías utilizadas
* Java 17
* Spring Boot 3
* Spring Data JPA
* Spring Security
* Hibernate
* MySQL
* Maven
* Postman
* IntelliJ IDEA
* XAMPP

## Base de Datos
Motor utilizado: MySQL

Nombre:
```
gestionpedidos
```

Importar:
```
evaluacion_springboot_relaciones.sql
```

## Ejecutar el proyecto

Clonar repositorio:
```
git clone https://github.com/haroldsantivanez-ship-it/gestion-pedidos.git
```

Entrar al proyecto:
```
cd gestion-pedidos
```

Instalar dependencias:
```
mvn clean install
```

Ejecutar:
```
mvn spring-boot:run
```

Servidor:
```
http://localhost:8080
```

## Seguridad

Usuarios configurados:

**ADMIN**
```
usuario: admin
password: 1234
```
Permisos:
* Clientes
* Productos
* Pedidos
* Auditoría

**USER**
```
usuario: user
password: 1234
```
Permisos:
* Consultas limitadas

## Endpoints

### Clientes

GET:
```
GET /clientes
```

POST:
```
POST /clientes
```
Ejemplo:
```json
{
  "nombres": "Harold",
  "apellidos": "Santivañez Garcia",
  "correo": "harold@gmail.com",
  "telefono": "999999999",
  "direccion": "Lima",
  "rol": "ADMIN"
}
```

### Productos

GET:
```
GET /productos
```

POST:
```
POST /productos
```
Ejemplo:
```json
{
  "nombre": "Laptop Lenovo",
  "descripcion": "i7 16GB",
  "precio": 3500,
  "stock": 20,
  "categoria": {
    "id": 1
  }
}
```

### Pedidos

GET:
```
GET /pedidos
```

POST:
```
POST /pedidos
```
Ejemplo:
```json
{
  "fecha": "2026-05-23",
  "cliente": {
    "id": 1
  },
  "detalles": [
    {
      "producto": {
        "id": 1
      },
      "cantidad": 2
    }
  ]
}
```

## Funcionalidades implementadas
✔ CRUD Clientes  
✔ CRUD Productos  
✔ Registro de pedidos  
✔ Validaciones  
✔ Seguridad por roles  
✔ Disminución automática de stock  
✔ Auditoría  
✔ Pruebas con Postman  

## Evidencias
Incluye:
* Capturas BD
* Modelo relacional
* CRUD funcionando
* Seguridad
* Auditoría
* Export Postman

## Autor
**Harold Santivañez Garcia**  
[github.com/haroldsantivanez-ship-it](https://github.com/haroldsantivanez-ship-it)
