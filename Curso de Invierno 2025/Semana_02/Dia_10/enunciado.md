# 🎯 EJERCICIOS UML - PATRONES DE DISEÑO

## 🧪 Ejercicio 1: Sistema de Base de Datos (Patrón Singleton)

### 📝 Enunciado
Una empresa de software necesita diseñar un sistema de conexión a base de datos que garantice que solo exista una única conexión activa en toda la aplicación. El sistema debe manejar la conexión, permitir ejecutar consultas y mantener un log de todas las operaciones realizadas.

### 🎯 Requerimientos a modelar:
Una clase que maneje la conexión única a la base de datos
Métodos para conectar, desconectar y verificar estado de conexión
Funcionalidad para ejecutar consultas SQL
Sistema de logging de operaciones
Clase cliente que use la conexión desde diferentes partes del sistema

### 📋 Pregunta:
Diseña el diagrama UML que implemente el patrón Singleton para este sistema de base de datos, mostrando:

La clase Singleton con sus atributos y métodos
Las relaciones con las clases cliente
La forma de garantizar una única instancia

---

## 🧪 Ejercicio 2: Tienda de Mascotas (Patrón Factory)

### 📝 Enunciado
Una tienda de mascotas necesita un sistema para crear diferentes tipos de mascotas (Perro, Gato, Pájaro) según la solicitud del cliente. Cada tipo de mascota tiene características específicas como sonido, comida favorita y cuidados especiales. El sistema debe poder crear mascotas sin que el vendedor conozca los detalles específicos de cada tipo.

### 🎯 Requerimientos a modelar:
Una clase base común para todas las mascotas
Diferentes tipos específicos: Perro, Gato, Pájaro
Una fábrica que cree mascotas según el tipo solicitado
Cada mascota debe poder hacer sonido, comer y mostrar sus cuidados
Una clase vendedor que use la fábrica para crear mascotas para los clientes

### 📋 Pregunta:
Diseña el diagrama UML que implemente el patrón Factory Method para esta tienda de mascotas, mostrando:

La jerarquía de clases de mascotas con comportamientos comunes
La clase fábrica con su método de creación
Las relaciones entre fábrica, mascotas y vendedor
Los atributos y métodos específicos de cada tipo de mascota

---

## 🧪 Ejercicio 3: Sistema de Descuentos en E-commerce (Patrón Strategy)

### 📝 Enunciado
Una tienda online necesita aplicar diferentes estrategias de descuento según el tipo de cliente y promociones activas. Los descuentos pueden ser: por volumen de compra, por tipo de cliente VIP, por cupón promocional, o descuento de temporada. El sistema debe poder cambiar la estrategia de descuento dinámicamente durante el proceso de compra.

### 🎯 Requerimientos a modelar:
Una interfaz común para todas las estrategias de descuento
Implementaciones concretas para cada tipo de descuento
Una clase calculadora de precios que use las estrategias
Cada estrategia debe calcular el descuento basado en el monto de compra
Una clase carrito de compras que gestione la calculadora

### 📋 Pregunta:
Diseña el diagrama UML que implemente el patrón Strategy para este sistema de descuentos, mostrando:

La interfaz Strategy y sus implementaciones concretas
La clase Context que usa las estrategias
Las relaciones y el flujo de cambio de estrategias

---

## 🧪 Ejercicio 4: Sistema de Exportación de Documentos (Patrón Visitor)

### 📝 Enunciado
Una aplicación de gestión documental maneja diferentes tipos de documentos (Texto, Imagen, Video, Audio) y necesita exportarlos a diferentes formatos (PDF, HTML, XML) sin modificar las clases de documentos existentes. Cada tipo de documento requiere un procesamiento específico para cada formato de exportación.

### 🎯 Requerimientos a modelar:
Una jerarquía de documentos con diferentes tipos
Una interfaz visitor para las operaciones de exportación
Implementaciones concretas para cada formato de exportación
Cada documento debe poder aceptar diferentes visitors
Una clase gestora que coordine el proceso de exportación

### 📋 Pregunta:
Diseña el diagrama UML que implemente el patrón Visitor para este sistema de exportación, mostrando:

La estructura de documentos con la interfaz Visitable
La jerarquía de Visitors para cada formato
Las relaciones de doble dispatch entre visitors y elementos