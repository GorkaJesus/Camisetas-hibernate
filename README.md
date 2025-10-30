# Proyecto Hibernate ORM - CRUD de Camisetas

## Descripción
Este proyecto es una aplicación sencilla para guardar, mostrar, actualizar y borrar camisetas usando **Java**, **Hibernate** y **MySQL**.  
Sirve para aprender cómo funciona la conexión entre Java y una base de datos con Hibernate.

## Autor
**Gorka Jesus Quesada Vega**  
2º DAM T (Desarrollo de Aplicaciones Multiplataforma)

## Tecnologías usadas
- Java  
- Hibernate ORM 6.3.1  
- MySQL  
- Maven  

## Funcionalidades
- Añadir nuevas camisetas  
- Ver camisetas por su ID  
- Cambiar datos de una camiseta  
- Borrar camisetas  
- Guardar todo automáticamente en la base de datos  


## Atributos de la clase Camiseta
| Atributo  | Tipo    | Descripción |
|------------|---------|-------------|
| id         | Long    | Identificador único |
| nombre     | String  | Nombre de la camiseta |
| categoria  | String  | Tipo o categoría |
| sexo       | String  | Hombre, mujer o unisex |
| talla      | String  | Talla (S, M, L, XL...) |
| color      | String  | Color de la camiseta |
| precio     | Double  | Precio en euros |
| stock      | Integer | Cantidad disponible |

## Configuración
- Base de datos: MySQL  
- Puerto: 3306  
- Nombre de base de datos: `tutorial`  
- Usuario: `root`  

## Ejecución
Para probar el programa, ejecuta la clase `CamisetaView.java` en Eclipse.  
Desde ahí se pueden hacer todas las operaciones CRUD (crear, leer, actualizar y borrar).

## Referencia
Proyecto hecho siguiendo el tutorial de Hibernate ORM:  
[https://www.youtube.com/watch?v=_F_-wNCahL0&t=1670s](https://www.youtube.com/watch?v=_F_-wNCahL0&t=1670s)

