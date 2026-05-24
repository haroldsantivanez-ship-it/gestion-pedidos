# Sistema de Gestión de Pedidos - Delivery

## Descripción
Proyecto desarrollado con Spring Boot para gestionar clientes, productos y pedidos mediante una API REST.

El sistema permite:

- Registrar clientes.
- Registrar productos.
- Crear pedidos.
- Actualizar automáticamente el stock.
- Validar datos ingresados.
- Aplicar seguridad por roles (ADMIN / USER).
- Registrar auditoría de operaciones.

---

## Tecnologías utilizadas

- Java 17
- Spring Boot 3
- Spring Data JPA
- Spring Security
- Hibernate
- MySQL
- Maven
- Postman
- IntelliJ IDEA
- XAMPP

---

## Base de Datos

Motor utilizado:

MySQL

Nombre:

```sql
gestionpedidos
```

Importar:

```plaintext
evaluacion_springboot_relaciones.sql
```

---

## Ejecutar el proyecto

### Clonar repositorio

```bash
git clone https://github.com/Piero-HO/delivery.git
```

### Entrar al proyecto

```bash
cd delivery
```

### Instalar dependencias

```bash
mvn clean install
```

### Ejecutar

```bash
mvn spring-boot:run
```

Servidor:

```plaintext
http://localhost:8080
```

---

## Seguridad

Usuarios configurados:

### ADMIN

```plaintext
usuario: admin
password: 1234
```

Permisos:
- Clientes
- Productos
- Pedidos
- Auditoría

---

### USER

```plaintext
usuario: user
password: 1234
```

Permisos:
- Consultas limitadas

---

## Endpoints

### Clientes

GET

```http
GET /clientes
```

POST

```http
POST /clientes
```

Ejemplo:

```json
{
"nombres":"Piero",
"apellidos":"Huaytalla",
"correo":"piero@gmail.com",
"telefono":"999999999",
"direccion":"Lima",
"rol":"ADMIN"
}
```

---

### Productos

GET

```http
GET /productos
```

POST

```http
POST /productos
```

Ejemplo:

```json
{
"nombre":"Laptop Lenovo",
"descripcion":"i7 16GB",
"precio":3500,
"stock":20,
"categoria":{
"id":1
}
}
```

---

### Pedidos

GET

```http
GET /pedidos
```

POST

```http
POST /pedidos
```

Ejemplo:

```json
{
"fecha":"2026-05-23",
"cliente":{
"id":1
},
"detalles":[
{
"producto":{
"id":1
},
"cantidad":2
}
]
}
```

---

## Funcionalidades implementadas

✔ CRUD Clientes  
✔ CRUD Productos  
✔ Registro de pedidos  
✔ Validaciones  
✔ Seguridad por roles  
✔ Disminución automática de stock  
✔ Auditoría  
✔ Pruebas con Postman  

---

## Evidencias

Incluye:

- Capturas BD
- Modelo relacional
- CRUD funcionando
- Seguridad
- Auditoría
- Export Postman

---

## Autor

Piero Huaytalla