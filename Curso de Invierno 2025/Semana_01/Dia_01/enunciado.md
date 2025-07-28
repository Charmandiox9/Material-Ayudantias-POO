# 🧪 Ejercicio 1: Simulador de sensor ambiental

## 📝 Descripción
Ejemplo:
> Eres un trabajador de la DMC (Dirección Meteorológica de Chile). El sensor de la estación va dándote temperaturas, las cuales se deben clasificar, además de anotar los registros históricos.
Escriba un programa que simule un sensor ambiental, se deben ingresar temperaturas y clasificarlas como frías, templadas o calidas. Además, deberán registrar la temperatura mayor, menor y promedio. 

## 🎯 Objetivos

- Aplicar estructuras de control como condicionales, ciclos.
- Desarrollar habilidades de creación de variables, manejo de condicionales y ciclos.

## 📥 Entrada

- 32
- -70
- 15

## 📤 Salida esperada

Mostrar resultados por consola.

Temperaturas:
- frías: 1
- templadas: 1
- calidas: 1

Registros historicos:
- Temperatura promedio: -7.67°
- Temperatura mínima: -70°
- Temperatura máxima: 32°

## Extras
Para la clasificación se considerarán los siguientes parámetros.
- Menor a 5: Temperatura fría.
- Entre 5 y 25: Temperatura templada.
- Mayor a 25: Temperatura calida.

---

# 🧪 Ejercicio 2: Calculadora de Operaciones

## 📝 Descripción
Eres un programador encargado de desarrollar una calculadora que procese operaciones matemáticas básicas desde un archivo de texto. La calculadora debe ser capaz de leer operaciones (suma, resta, multiplicación, división) y sus operandos desde un archivo, procesarlas usando switch-case y mostrar los resultados.

> Tu programa debe ser lo suficientemente robusto para manejar diferentes tipos de operaciones y validar que no haya divisiones por cero.

## 🎯 Objetivos
- Aplicar estructuras de control switch-case.
- Desarrollar habilidades de lectura desde archivo y procesamiento de datos.
- Implementar validación de datos (división por cero).

## 📥 Entrada
Archivo `operaciones.txt` con el siguiente formato:
```
+,5,3
-,10,4
*,7,2
/,15,3
/,8,0
```
Cada línea contiene: operador, primer número, segundo número (separados por comas).

## 📤 Salida esperada
Mostrar resultados por consola.
Ejemplo de salida esperada:

```
=== CALCULADORA DE OPERACIONES ===
Operación: 5 + 3 = 8.0
Operación: 10 - 4 = 6.0
Operación: 7 * 2 = 14.0
Operación: 15 / 3 = 5.0
Error: División por cero detectada en 8 / 0

=== RESUMEN ===
Operaciones procesadas: 5
Operaciones exitosas: 4
Errores encontrados: 1
```
---

# 🧪 Ejercicio 3: Análisis de Matriz de Sensores de Temperatura

## 📝 Descripción
Eres el encargado de monitorear una granja de servidores que cuenta con sensores de temperatura distribuidos en una matriz. Cada sensor registra la temperatura en diferentes momentos del día. Tu programa debe cargar estos datos desde un archivo y realizar análisis estadísticos para identificar patrones de temperatura por ubicación (fila) y por horario (columna).

> Es crucial mantener los servidores en temperaturas óptimas para evitar fallos del sistema. Tu análisis ayudará a identificar zonas críticas y horarios de mayor riesgo.

## 🎯 Objetivos
- Aplicar matrices bidimensionales para representar datos de sensores.
- Desarrollar habilidades de lectura desde archivo y procesamiento de matrices.
- Implementar cálculos estadísticos (promedios, máximos, mínimos).
- Generar reportes de análisis de temperatura.

## 📥 Entrada
Archivo `sensores.txt` con el siguiente formato:

```
4,6
25.5,26.2,27.1,26.8,25.9,26.5
24.8,25.1,26.3,27.2,26.7,25.4
26.1,27.0,28.5,29.1,28.3,27.2
25.2,25.8,26.4,27.5,26.9,26.1
```
La primera línea indica filas y columnas (4 sensores x 6 mediciones).
Las siguientes líneas contienen las temperaturas separadas por comas.

## 📤 Salida esperada
- Mostrar análisis por consola.
- Ejemplo de salida esperada:

```
=== ANÁLISIS DE SENSORES DE TEMPERATURA ===

MATRIZ DE TEMPERATURAS:
Sensor 1: 25.5  26.2  27.1  26.8  25.9  26.5
Sensor 2: 24.8  25.1  26.3  27.2  26.7  25.4
Sensor 3: 26.1  27.0  28.5  29.1  28.3  27.2
Sensor 4: 25.2  25.8  26.4  27.5  26.9  26.1

=== PROMEDIOS POR SENSOR ===
Sensor 1: 26.33°C
Sensor 2: 25.92°C
Sensor 3: 27.70°C
Sensor 4: 26.32°C

=== PROMEDIOS POR HORARIO ===
Horario 1: 25.40°C
Horario 2: 26.03°C
Horario 3: 27.08°C
Horario 4: 27.65°C
Horario 5: 26.95°C
Horario 6: 26.30°C

=== ESTADÍSTICAS GENERALES ===
Temperatura promedio general: 26.57°C
Temperatura máxima: 29.1°C
Temperatura mínima: 24.8°C
```

---

🕓 **Dificultad estimada**: Baja 
📚 **Contenidos relacionados**: Variables, condicionales, ciclos, vectores, matrices.
🗂️ **Ayudantía**: Día 1 - Nivelación.