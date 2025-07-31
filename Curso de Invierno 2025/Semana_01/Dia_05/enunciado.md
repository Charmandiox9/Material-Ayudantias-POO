# 🧪 Ejercicio 1: Sistema de Gestión de Supermercado

## 📝 Descripción
Eres el desarrollador de un sistema de gestión para una cadena de supermercados. Necesitas crear una aplicación que utilice herencia, matrices y ArrayList para gestionar el inventario de productos distribuidos en diferentes bodegas del supermercado. El sistema debe permitir operaciones como agregar productos, buscar por categorías, gestionar stock y generar reportes de inventario. Cada supermercado tiene múltiples bodegas especializadas, y cada bodega contiene diferentes tipos de productos con características específicas.

## 🎯 Objetivos
- Aplicar conceptos de herencia con clases Producto y sus subclases.
- Utilizar matrices para organizar bodegas y ArrayList para gestionar productos.
- Implementar polimorfismo en el manejo de diferentes tipos de productos.
- Desarrollar operaciones CRUD para la gestión de inventario.
- Crear un sistema de reportes y consultas avanzadas.

## 📥 Entrada
- Archivo `inventario.txt` con el siguiente formato:
```
BODEGA_0,ELECTRODOMESTICO,Refrigerador Samsung,599.99,15,24,A++
BODEGA_0,ELECTRODOMESTICO,Microondas LG,199.99,8,12,B+
BODEGA_1,ALIMENTO,Leche Entera,2.50,50,2025-08-15,LACTEO
BODEGA_1,ALIMENTO,Pan Integral,1.25,30,2025-08-05,PANADERIA
BODEGA_2,ROPA,Camisa Polo,29.99,25,M,ALGODON
BODEGA_2,ROPA,Jeans Azul,49.99,15,32,MEZCLILLA
```
Cada línea contiene: BODEGA_ID,TIPO_PRODUCTO,NOMBRE,PRECIO,STOCK,ATRIBUTO1,ATRIBUTO2

- Archivo `bodegas.txt` con el siguiente formato:
```
Coquimbo,250,BODEGA_2
Coquiimbo,250,BODEGA_2
Santiago,500,BODEGA_0
Santiago,500,BODEGA_0
Osorno,150,BODEGA_1
Osorno,150,BODEGA_1
```
Cada línea contiene: CIUDAD,STOCK_MAX,BODEGA_ID

## 📤 Salida esperada
- Menú interactivo con opciones:

```
=== SISTEMA SUPERMERCADO VIRTUAL ===
1. Mostrar inventario completo
2. Buscar productos por bodega
3. Agregar nuevo producto
4. Buscar por tipo de producto
5. Eliminar producto
6. Estadísticas generales
0. Salir
```

## Extras
- Clase base `Producto` con atributos comunes (nombre, precio, stock)
- Subclases: `Electrodomestico` (meses garantía, eficiencia energética), `Alimento` (fecha vencimiento, categoría), `Ropa` (talla, material)
- Clase `Bodega` con lista de productos.
- Clase `Supermercado` con matriz de bodegas
- Implementar métodos polimórficos como `mostrarDetalles()` y `calcularPrecioEspecial()`
- Para los precios especiales: Ropa = (precio * stock) / talla; Alimento = (precio * stock) / mes de vencimiento; Electrodomestico = (precio * stock) / (meses garantía * eficiencia energética).

---

🕓 **Dificultad estimada**: Alta
📚 **Contenidos relacionados**: Herencia avanzada, polimorfismo, simulación de comportamientos
🗂️ **Ayudantía**: Día 5 – Herencia, Abstracción y Polimorfismo
