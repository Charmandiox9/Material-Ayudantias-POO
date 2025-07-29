# 🧪 Ejercicio 1: Agenda inteligente

## 📝 Descripción
Eres el desarrollador de una aplicación de contactos moderna. Necesitas crear un sistema que utilice ```ArrayList``` para gestionar contactos de manera eficiente, permitiendo operaciones como agregar, buscar y eliminar contactos. Los contactos iniciales se cargan desde un archivo, y el sistema debe ser capaz de manejar operaciones dinámicas en tiempo real.

## 🎯 Objetivos
- Aplicar conceptos de ```ArrayList``` y sus métodos.
- Desarrollar habilidades de búsqueda y manipulación de colecciones.
- Implementar operaciones CRUD básicas con listas.

## 📥 Entrada
- Archivo `contactos.txt` con el siguiente formato:
```
Juan Perez,555-1234,juan@email.com
Maria Lopez,555-5678,maria@email.com
Pedro Silva,555-9012,pedro@email.com
Ana Torres,555-3456,ana@email.com
```
Cada línea contiene: nombre, teléfono y email.

## 📤 Salida esperada
- Menú interactivo con opciones:

```
=== AGENDA INTELIGENTE ===
1. Mostrar todos los contactos
2. Buscar contacto por nombre
3. Agregar nuevo contacto
4. Eliminar contacto
5. Salir

Total de contactos: 4
```

---

# 🧪 Ejercicio 2: Gestor de tareas con prioridad

## 📝 Descripción
Eres el coordinador de un equipo de trabajo y necesitas gestionar tareas con diferentes niveles de prioridad. Utilizando ```LinkedList```, debes implementar un sistema que permita agregar tareas, reordenarlas dinámicamente según su prioridad y procesarlas en el orden adecuado para optimizar la productividad del equipo.

## 🎯 Objetivos
- Aplicar conceptos de ```LinkedList``` y sus ventajas.
- Desarrollar habilidades de reordenamiento dinámico.
- Implementar lógica de priorización de tareas.

## 📥 Entrada
- Archivo `tareas.txt` con el siguiente formato:
```
Revisar documentos,2,Juan
Preparar presentación,1,Maria
Enviar reportes,3,Pedro
Reunión con cliente,1,Ana
Actualizar base de datos,2,Carlos
```
Cada línea contiene: tarea, prioridad y nombre del encargado.

## 📤 Salida esperada
- Mostrar tareas ordenadas por prioridad:

```
=== GESTOR DE TAREAS ===
Tareas por prioridad (1=Alta, 2=Media, 3=Baja):

PRIORIDAD ALTA:
- Preparar presentación (Asignado: Maria)
- Reunión con cliente (Asignado: Ana)

PRIORIDAD MEDIA:
- Revisar documentos (Asignado: Juan)
- Actualizar base de datos (Asignado: Carlos)

PRIORIDAD BAJA:
- Enviar reportes (Asignado: Pedro)
```

---

🕓 Dificultad estimada: Media
📚 Contenidos relacionados: Arrays, ArrayList, LinkedList, Clases
🗂️ Ayudantía: Día 3 – Colecciones