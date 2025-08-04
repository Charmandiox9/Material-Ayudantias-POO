# 🧪 Ejercicio 1: Simulador de vuelo

## 📝 Descripción
Eres el desarrollador de un simulador de vuelo que necesita manejar diferentes tipos de objetos voladores. Utilizando la interfaz `Volador`, debes implementar clases como `Avión`, `Murciélago` y `Dron`, donde cada uno tiene comportamientos de vuelo específicos. El sistema debe demostrar polimorfismo al tratar todos los objetos voladores de manera uniforme.

## 🎯 Objetivos
- Aplicar conceptos de interfaces y polimorfismo.
- Desarrollar habilidades de implementación de contratos.
- Implementar comportamientos específicos por tipo de objeto.

## 📥 Entrada
- Archivo `voladores.txt` con el siguiente formato:
```
Avión,Boeing 747,200,900
Murciélago,Vampiro,0.5,50
Dron,DJI Phantom,2,120
Avión,Cessna 172,4,180
Murciélago,Frugívoro,0.3,40
```
Cada línea contiene: volador, nombre, atributo1, atributo2.

## 📤 Salida esperada
- Simulación de vuelo con comportamientos polimórficos:

```
=== SIMULADOR DE VUELO ===

Boeing 747 (Avión):
- Velocidad: 200 pasajeros, 900 km/h
- Volando: Despegando desde pista, ascendiendo gradualmente
- Navegación: Sistema GPS automático

Vampiro (Murciélago):
- Velocidad: 0.5 kg, 50 km/h
- Volando: Aleteo rápido, vuelo errático
- Navegación: Ecolocación ultrasónica

DJI Phantom (Dron):
- Velocidad: 2 kg, 120 km/h
- Volando: Vuelo estable con hélices
- Navegación: Control remoto y GPS

Todos los objetos voladores en formación
```

---

# 🧪 Ejercicio 2: Red de sensores

## 📝 Descripción
Desarrolla un sistema de gestión para una empresa de alquiler de vehículos. El sistema debe manejar automóviles, motocicletas y camiones usando interfaces, herencia y colecciones. Debe permitir agregar vehículos, alquilarlos, devolverlos y mostrar reportes básicos.

## 🎯 Objetivos
- Implementar interfaces para vehículos y sistema de gestión
- Utilizar herencia con clase abstracta y clases derivadas
- Desarrollar menú interactivo con ArrayList
- Aplicar polimorfismo en el manejo de vehículos

## 📥 Entrada
- Información por teclado: matrícula, marca, modelo, año, kilometraje y datos específicos por tipo de vehículo.

## 📤 Salida esperada
- Un menú con las siguiente opciones:

```
=== SISTEMA DE GESTIÓN DE VEHÍCULOS ===
1. Agregar vehículo
2. Listar vehículos disponibles
3. Alquilar vehículo
4. Devolver vehículo
5. Mostrar todos los vehículos
0. Salir
```

## Extras
La interface para los vehiculos debe implementar: 
- calcular costo de alquiler - Calcula costo según tipo y días
- esta disponible - Verifica disponibilidad
- alquilar - Marca como alquilado
- devolver - Marca como disponible
- mostrar información - Retorna datos del vehículo


La interface del sistema debe implementar: 
- agregar vehiculo - Agrega vehículo a la flota
- buscar vehiculo - Busca por matrícula
- listar disponibles - Lista vehículos disponibles
- alquilar vehiculo - Procesa alquiler
- devolver Vvehiculo - Procesa devolución

---

🕓 **Dificultad estimada**: Media
📚 **Contenidos relacionados**: Interfaces, recopilación de datos, exportación de archivos
🗂️ **Ayudantía**: Día 10 – Interfaces y Sistema de Componentes