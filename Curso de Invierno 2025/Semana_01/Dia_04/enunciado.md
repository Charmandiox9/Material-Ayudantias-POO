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

# 🧪 Ejercicio 3: Simulador de ecosistema

## 📝 Descripción
Eres un biólogo desarrollador que necesita simular un ecosistema con diferentes tipos de animales. Los animales tienen comportamientos específicos como moverse, alimentarse y reproducirse. Utilizando herencia y polimorfismo, debes crear un sistema que lea diferentes especies desde un archivo y simule sus comportamientos naturales en el ecosistema.

## 🎯 Objetivos
- Aplicar conceptos avanzados de herencia y polimorfismo.
- Desarrollar habilidades de simulación de comportamientos.
- Implementar sistemas complejos con múltiples tipos de objetos.

## 📥 Entrada
- Archivo `ecosistema.txt` con el siguiente formato:
```
Carnívoro,León,8,Sabana,Gacela
Herbívoro,Conejo,2,Bosque,Hierba
Omnívoro,Oso,12,Montaña,Peces y Frutas
Carnívoro,Águila,5,Cielo,Ratones
Herbívoro,Ciervo,6,Bosque,Hojas
```
Cada línea contiene: dieta, animal, edad, hábitat, presa.

## 📤 Salida esperada
- Simulación del ecosistema:

```
=== SIMULADOR DE ECOSISTEMA ===

León (Carnívoro, 8 años):
- Hábitat: Sabana
- Cazando: Gacela
- Comportamiento: Acecha sigilosamente a su presa

Conejo (Herbívoro, 2 años):
- Hábitat: Bosque
- Alimentándose: Hierba
- Comportamiento: Mordisquea plantas cerca de su madriguera

Oso (Omnívoro, 12 años):
- Hábitat: Montaña
- Alimentándose: Peces y Frutas
- Comportamiento: Busca alimento variado en su territorio

Simulación completada - Ecosistema estable
```

---

🕓 **Dificultad estimada**: Alta
📚 **Contenidos relacionados**: Herencia avanzada, polimorfismo, simulación de comportamientos
🗂️ **Ayudantía**: Día 9 – Herencia, Abstracción y Polimorfismo