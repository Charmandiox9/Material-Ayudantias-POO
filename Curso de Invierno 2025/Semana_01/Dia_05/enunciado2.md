# 🧪 Ejercicio 1: Sistema de Gestión de Biblioteca Digital

## 📝 Descripción
Eres el desarrollador de un sistema de gestión para una biblioteca digital moderna. Necesitas crear una aplicación que utilice múltiples 
clases interconectadas, referencias entre objetos y ArrayList para gestionar libros, usuarios y préstamos. 
El sistema debe permitir operaciones como registrar usuarios, agregar libros al catálogo, realizar préstamos, procesar devoluciones y 
generar reportes estadísticos. La biblioteca maneja diferentes tipos de información y debe mantener un control detallado de todas 
las transacciones de préstamos, validando disponibilidad y restricciones de usuarios.

## 🎯 Objetivos
- Implementar múltiples clases con referencias cruzadas entre objetos.
- Utilizar ArrayList para gestionar colecciones de libros, usuarios y préstamos.
- Desarrollar métodos que reciban y retornen objetos como parámetros.
- Crear un sistema completo de validaciones y control de estados.
- Implementar operaciones CRUD para la gestión integral de la biblioteca.

## 📥 Entrada
Toda la información se ingresa por teclado a través de un menú interactivo. El sistema solicitará:

Para libros: código único, título, autor, año de publicación
Para usuarios: cédula, nombre completo, email, teléfono
Para préstamos: código de libro, cédula de usuario, fecha de préstamo
Para devoluciones: código de préstamo específico

## 📤 Salida esperada

Menú interactivo con opciones:

```
=== SISTEMA BIBLIOTECA DIGITAL ===
1. Agregar nuevo libro al catálogo
2. Registrar nuevo usuario
3. Realizar préstamo de libro
4. Procesar devolución de libro
5. Mostrar catálogo de libros disponibles
6. Mostrar usuarios con préstamos activos
7. Generar reporte de préstamos
8. Buscar libro por código
9. Buscar usuario por cédula
10. Mostrar libros prestados por usuario
0. Salir
```
## Extras

- Clase `Libro` con métodos para gestionar disponibilidad y mostrar información completa
- Clase `Usuario` con ArrayList de libros prestados y métodos para agregar/devolver libros
- Clase `Prestamo` con referencias a Usuario y Libro, cálculo de días transcurridos y validación de vencimientos
- Clase `Biblioteca` como controlador principal con ArrayList para catálogo, usuarios y préstamos
- Implementar validaciones: máximo 3 libros por usuario, verificar disponibilidad, préstamos existentes
- Métodos de búsqueda personalizados que retornen objetos o null
- Sistema de reportes con estadísticas: total de préstamos activos, libros más prestados, usuarios más activos
- Generar códigos únicos automáticos para préstamos
- Validar formatos de entrada y campos obligatorios

---

🕓 **Dificultad estimada**: Alta 
📚 **Contenidos relacionados**: Referencias entre objetos, ArrayList avanzado, validaciones complejas 
🗂️ **Ayudantía**: Día 5 – Clases, Referencias y Colecciones
