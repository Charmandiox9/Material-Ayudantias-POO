# 🧪 Ejercicio 1: Zoológico virtual

## 📝 Descripción
Eres el director de un zoológico virtual y necesitas crear un sistema que maneje diferentes tipos de animales. Cada animal tiene comportamientos específicos, especialmente en cuanto a los sonidos que producen. Utilizando herencia, debes crear una clase base `Animal` y subclases como `Perro`, `Gato` y `Pez`, donde cada uno redefine el método `hacerSonido()` según su especie.

## 🎯 Objetivos
- Aplicar conceptos de herencia entre clases.
- Desarrollar habilidades de polimorfismo.
- Implementar sobrescritura de métodos.

## 📥 Entrada
- Archivo `animales.txt` con el siguiente formato:
```
Perro,Firulais,5,Labrador
Gato,Garfield,3,Persa
Pez,Nemo,1,Payaso
Perro,Rex,7,Pastor Alemán
Gato,Whiskers,2,Siamés
```
Cada línea contiene: tipo de animal, nombre, edad y raza.

## 📤 Salida esperada
- Simulación del zoológico con sonidos:

```
=== ZOOLÓGICO VIRTUAL ===

Firulais (Perro Labrador, 5 años): ¡Guau guau!
Garfield (Gato Persa, 3 años): ¡Miau miau!
Nemo (Pez Payaso, 1 año): *burbujeo*
Rex (Perro Pastor Alemán, 7 años): ¡Guau guau!
Whiskers (Gato Siamés, 2 años): ¡Miau miau!

Total de animales: 5
```

---

# 🧪 Ejercicio 2: Calculadora de figuras geométricas

## 📝 Descripción
Eres el desarrollador de una aplicación de geometría que necesita calcular áreas de diferentes figuras geométricas. Utilizando una clase abstracta `Figura`, debes crear subclases como `Círculo`, `Rectángulo` y `Triángulo`, donde cada una implementa el método abstracto `calcularArea()` según su fórmula específica.

## 🎯 Objetivos
- Aplicar conceptos de clases abstractas.
- Desarrollar habilidades de abstracción.
- Implementar métodos abstractos en subclases.

## 📥 Entrada
- Archivo `figuras.txt` con el siguiente formato:
```
Círculo,5.0
Rectángulo,4.0,6.0
Triángulo,3.0,4.0
Círculo,2.5
Rectángulo,8.0,3.0
```
Cada línea contiene: tipo de figura y parámetro (radio, baso o altura).

## 📤 Salida esperada
- Cálculo de áreas de diferentes figuras:

```
=== CALCULADORA DE FIGURAS GEOMÉTRICAS ===

Círculo (radio: 5.0): Área = 78.54 cm²
Rectángulo (4.0 x 6.0): Área = 24.0 cm²
Triángulo (base: 3.0, altura: 4.0): Área = 6.0 cm²
Círculo (radio: 2.5): Área = 19.63 cm²
Rectángulo (8.0 x 3.0): Área = 24.0 cm²

Área total calculada: 152.17 cm²
```

---

🕓 **Dificultad estimada**: Alta
📚 **Contenidos relacionados**: Herencia avanzada, polimorfismo, simulación de comportamientos
🗂️ **Ayudantía**: Día 9 – Herencia, Abstracción y Polimorfismo