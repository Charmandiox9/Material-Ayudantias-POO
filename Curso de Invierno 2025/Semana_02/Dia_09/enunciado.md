# 🎯 EJERCICIOS DE PATRONES DE DISEÑO

## 🧪 Ejercicio 1: Sistema de Configuración Global (Patrón Singleton)

### 📝 Descripción
Desarrolla un sistema de configuración para una aplicación que debe mantener una única instancia de configuración en toda la aplicación. El sistema debe permitir establecer y obtener configuraciones como idioma, tema y nivel de logging.

### 🎯 Objetivos
- Implementar el patrón Singleton correctamente
- Garantizar una única instancia de configuración
- Demostrar el acceso global a la configuración

### 📥 Entrada
Opciones de configuración por teclado: idioma, tema, nivel de logging.

### 📤 Salida esperada
- Un menú con las siguiente opciones:
```
=== SISTEMA DE CONFIGURACIÓN ===
1. Establecer idioma
2. Establecer tema
3. Establecer nivel de logging
4. Mostrar configuración actual
5. Salir
```

---

## 🧪 Ejercicio 2: Fábrica de Vehículos (Patrón Factory)

### 📝 Descripción
Crea un sistema de fabricación de vehículos que utilice el patrón Factory para crear diferentes tipos de vehículos sin exponer la lógica de creación al cliente. El sistema debe crear automóviles, motocicletas y bicicletas según el tipo solicitado.

### 🎯 Objetivos
- Implementar el patrón Factory Method
- Encapsular la creación de objetos
- Demostrar la creación de diferentes tipos sin conocer las clases concretas

### 📥 Entrada
Tipo de vehículo y características básicas.

### 📤 Salida esperada
- Un menú con las siguiente opciones:
```
=== FÁBRICA DE VEHÍCULOS ===
1. Crear automóvil
2. Crear motocicleta
3. Crear bicicleta
4. Mostrar vehículos creados
5. Salir
```

---

## 🧪 Ejercicio 3: Calculadora de Impuestos (Patrón Strategy)

### 📝 Descripción
Desarrolla un sistema de cálculo de impuestos que utilice diferentes estrategias según el tipo de contribuyente. El sistema debe calcular impuestos para personas naturales, empresas pequeñas y grandes corporaciones, cada una con su propia fórmula.

### 🎯 Objetivos
- Implementar el patrón Strategy
- Intercambiar algoritmos de cálculo dinámicamente
- Demostrar diferentes estrategias de cálculo

### 📥 Entrada
Tipo de contribuyente e ingresos anuales.

### 📤 Salida esperada
- Un menú con las siguiente opciones:
```
=== CALCULADORA DE IMPUESTOS ===
1. Calcular impuesto persona natural
2. Calcular impuesto empresa pequeña
3. Calcular impuesto gran corporación
0. Salir
```

---

## 🧪 Ejercicio 4: Calculadora de Formas Geométricas (Patrón Visitor)

### 📝 Descripción
Desarrolla un sistema simple que calcule diferentes propiedades (área, perímetro) de formas geométricas (círculo, cuadrado, triángulo) sin modificar las clases de las formas. El patrón Visitor permite agregar nuevos cálculos fácilmente.

### 🎯 Objetivos
- Implementar el patrón Visitor
- Separar operaciones de cálculo de las formas geométricas
- Demostrar cómo agregar nuevas operaciones sin cambiar las formas

### 📥 Entrada
Datos de formas geométricas y tipo de cálculo deseado.

### 📤 Salida esperada
- Un menú con las siguiente opciones:
```
=== CALCULADORA DE FORMAS ===
1. Agregar círculo
2. Agregar cuadrado
3. Agregar triángulo
4. Calcular áreas
5. Calcular perímetros
0. Salir
```

---

