# 🧪 Ejercicio 1: Inventario de Productos

## 📝 Descripción
Trabajas en una pequeña tienda y necesitas digitalizar el inventario. Los productos están listados en un archivo de texto con su nombre, precio y stock. Debes crear un sistema que lea esta información, instancie objetos ```Producto``` y genere un resumen del inventario con estadísticas importantes.

## 🎯 Objetivos
- Aplicar conceptos de clases y objetos.
- Desarrollar habilidades de procesamiento de datos desde archivo.
- Implementar cálculos estadísticos básicos.

## 📥 Entrada
Archivo `productos.txt` con el siguiente formato:
```
Laptop,800000,5
Mouse,15000,20
Teclado,45000,10
Monitor,250000,8
```
Cada línea contiene: nombre del producto, precio, stock.

## 📤 Salida esperada
Mostrar resultados por consola.
Ejemplo de salida esperada:

```
RESUMEN DEL INVENTARIO:
Total de productos únicos: 4
Valor total del inventario: $4,525,000
Producto más caro: Laptop ($800,000)
Producto con mayor stock: Mouse (20 unidades)
```

---

# 🧪 Ejercicio 2: Agenda médica

## 📝 Descripción
Eres el recepcionista de una clínica médica y necesitas gestionar las citas del día. La información de las citas está almacenada en un archivo de texto, y necesitas crear un sistema que permita construir objetos ```CitaMedica``` y buscar citas por nombre de paciente para brindar información rápida cuando los pacientes consulten.

## 🎯 Objetivos
- Aplicar conceptos de clases y objetos.
- Desarrollar habilidades de búsqueda en vectores.
- Implementar funcionalidad de consulta por criterios.

## 📥 Entrada
Archivo `citas.txt` con el siguiente formato:
```
Juan Perez,Dr. Rodriguez,09:00,Consulta general
Maria Lopez,Dr. Gonzalez,10:30,Cardiología
Pedro Silva,Dr. Rodriguez,14:00,Control
Ana Torres,Dr. Martinez,16:15,Pediatría
```
Cada línea contiene: nombre del paciente, nombre del doctor, hora de consulta y tipo de consulta.

## 📤 Salida esperada
Mostrar resultados por consola.
Ejemplo de salida esperada:

```
Ingrese nombre del paciente: Maria Lopez
Cita encontrada:
Paciente: Maria Lopez
Médico: Dr. Gonzalez
Hora: 10:30
Especialidad: Cardiología
```

---

# 🧪 Ejercicio 3: Administración académica

## 📝 Descripción
Eres el administrador de un sistema educativo y necesitas gestionar cursos con sus respectivos estudiantes. Cada curso contiene una lista de estudiantes inscritos, y necesitas generar reportes detallados que muestren la información completa de cada curso, incluyendo estadísticas de los estudiantes inscritos.

## 🎯 Objetivos
- Aplicar conceptos de composición con colecciones.
- Desarrollar habilidades de manejo de listas de objetos.
- Implementar generación de reportes con estadísticas.

## 📥 Entrada
- Archivo `cursos.txt` con el siguiente formato:
```
Matemáticas I,MAT101,Prof. Rodriguez
Física I,FIS101,Prof. Gonzalez
```
Cada línea contiene: nombre de la asignatura, NRC de la signatura y nombre del profesor.

- Archivo `inscripciones.txt` con el siguiente formato:
```
MAT101,Juan Perez,18,4.5
MAT101,Maria Lopez,17,2.2
FIS101,Pedro Silva,19,5.8
FIS101,Ana Torres,18,6.9
MAT101,Carlos Ruiz,17,3.5
```
Cada línea contiene: NRC de la asignatura, nombre del estudiante, edad y promedio.

## 📤 Salida esperada
- Listar estudiantes agrupados por profesor:

```
CURSO: Matemáticas I (MAT101)
Profesor: Prof. Rodriguez
Estudiantes inscritos: 3
Lista de estudiantes:
- Juan Perez (18 años) - Promedio: 4.5
- Maria Lopez (17 años) - Promedio: 2.2
- Carlos Ruiz (17 años) - Promedio: 3.5
Promedio del curso: 3.4

CURSO: Física I (FIS101)
Profesor: Prof. Gonzalez
Estudiantes inscritos: 2
Lista de estudiantes:
- Pedro Silva (19 años) - Promedio: 5.8
- Ana Torres (18 años) - Promedio: 6.9
Promedio del curso: 6.4
```

---

🕓 Dificultad estimada: Media
📚 Contenidos relacionados: Clases básicas, Referencias
🗂️ Ayudantía: Día 3 – Intro POO/Referencias