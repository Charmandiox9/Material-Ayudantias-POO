# **🧪 Ejercicio 1: Sistema de Gestión de Biblioteca Digital Avanzada**

## **📝 Descripción**
Eres el desarrollador principal de un sistema de gestión para una biblioteca digital universitaria de última generación. Necesitas crear una aplicación compleja que utilice herencia avanzada, interfaces múltiples, patrones de diseño (Singleton, Factory, Strategy, Visitor), lectura de archivos, y modelado de dominio completo para gestionar diferentes tipos de recursos digitales distribuidos en múltiples sedes de la biblioteca.

El sistema debe permitir operaciones avanzadas como préstamos inteligentes, búsquedas especializadas, generación de reportes complejos, y gestión de usuarios con diferentes niveles de acceso. Cada sede tiene recursos especializados, y cada recurso tiene características específicas según su tipo (libros electrónicos, audiolibros, revistas académicas, tesis doctorales).

## **🎯 Objetivos**
* Aplicar herencia compleja con clases `RecursoDigital` y `Usuario` con múltiples subclases
* Implementar interfaces del sistema (`SistemaBiblioteca`, `Prestable`, `EstrategiaBusqueda`, `VisitorReporte`)
* Utilizar patrones de diseño: Singleton, Factory, Strategy y Visitor
* Desarrollar operaciones CRUD avanzadas con manejo de excepciones personalizadas
* Crear sistema de reportes dinámicos y consultas especializadas
* Implementar polimorfismo avanzado y modelado de dominio robusto
* Generar diagramas UML completos del sistema

## **📥 Entrada**
* Archivo `recursos.txt` con el siguiente formato:

```
LIBRO_ELECTRONICO,LIB001,Java: The Complete Reference,Herbert Schildt,2023-06-15,PROGRAMACION,DISPONIBLE,850,PDF,25MB
LIBRO_ELECTRONICO,LIB002,Clean Code,Robert Martin,2022-03-20,INGENIERIA,DISPONIBLE,464,EPUB,12MB
AUDIOLIBRO,AUD001,1984,George Orwell,1949-06-08,FICCION,DISPONIBLE,720,Simon Prebble,256kbps
AUDIOLIBRO,AUD002,Sapiens,Yuval Harari,2014-09-04,HISTORIA,PRESTADO,960,Derek Perkins,320kbps
REVISTA,REV001,Nature,Varios Autores,2024-07-01,CIENCIA,DISPONIBLE,145,MENSUAL,true
REVISTA,REV002,IEEE Computer,Varios Autores,2024-06-15,TECNOLOGIA,MANTENIMIENTO,89,MENSUAL,true
TESIS,TES001,Machine Learning en Medicina,Ana Martinez,2023-12-10,INVESTIGACION,DISPONIBLE,Universidad Nacional,Medicina,DOCTORADO,2023-12-15
TESIS,TES002,Blockchain en Finanzas,Carlos Rodriguez,2024-01-20,TECNOLOGIA,DISPONIBLE,Universidad Tecnica,Ingenieria,MAESTRIA,2024-01-25
```

Cada línea contiene: TIPO,ID,TITULO,AUTOR,FECHA_PUBLICACION,CATEGORIA,ESTADO,ATRIBUTO1,ATRIBUTO2,ATRIBUTO3

* Archivo `usuarios.txt` con el siguiente formato:

```
ESTUDIANTE,USR001,Juan Perez,juan.perez@universidad.cl,2024-01-15,PREMIUM,12345,Universidad Nacional,Ingenieria Informatica
ESTUDIANTE,USR002,Maria Lopez,maria.lopez@universidad.cl,2024-02-10,BASICO,12346,Universidad Nacional,Medicina
PROFESOR,PRF001,Dr. Roberto Silva,roberto.silva@universidad.cl,2023-05-20,PREMIUM,Ciencias Computacionales,Inteligencia Artificial,EMP001
PROFESOR,PRF002,Dra. Carmen Torres,carmen.torres@universidad.cl,2022-08-15,PREMIUM,Medicina,Cardiologia,EMP002
GENERAL,GEN001,Luis Gonzalez,luis.gonzalez@gmail.com,2024-03-01,BASICO,Ingeniero de Software,Tecnologia;IA;Programacion
GENERAL,GEN002,Sofia Mendez,sofia.mendez@hotmail.com,2024-04-05,PREMIUM,Doctora,Medicina;Investigacion;Ciencia
```

Cada línea contiene: TIPO_USUARIO,ID,NOMBRE,EMAIL,FECHA_REGISTRO,MEMBRESIA,ATRIBUTO1,ATRIBUTO2,ATRIBUTO3

* Archivo `prestamos.txt` con el siguiente formato:

```
PRES001,USR001,LIB001,2024-07-15,2024-07-29,null,ACTIVO
PRES002,PRF001,AUD001,2024-07-10,2024-07-24,2024-07-22,DEVUELTO
PRES003,USR002,TES001,2024-07-20,2024-08-03,null,ACTIVO
PRES004,GEN001,REV001,2024-07-05,2024-07-19,null,VENCIDO
```

Cada línea contiene: ID_PRESTAMO,ID_USUARIO,ID_RECURSO,FECHA_PRESTAMO,FECHA_DEVOLUCION_ESPERADA,FECHA_DEVOLUCION_REAL,ESTADO

* Archivo `configuracion.properties` con el siguiente formato:

```
limite.prestamos.estudiante=3
limite.prestamos.profesor=5
limite.prestamos.general=2
tiempo.prestamo.default=14
notificaciones.email=true
```

## **📤 Salida esperada**
* Menú interactivo avanzado con opciones:

```
=== SISTEMA BIBLIOTECA DIGITAL UNIVERSITARIA ===
1. 📚 Gestión de Recursos
   a) Mostrar inventario completo
   b) Agregar nuevo recurso
   c) Buscar recursos (por estrategia)
   d) Eliminar recurso
   e) Cambiar estado de recurso

2. 👥 Gestión de Usuarios  
   a) Registrar nuevo usuario
   b) Buscar usuario
   c) Mostrar historial de préstamos
   d) Actualizar datos de usuario

3. 🔄 Sistema de Préstamos
   a) Realizar préstamo
   b) Procesar devolución
   c) Ver préstamos activos
   d) Gestionar préstamos vencidos

4. 📊 Reportes y Estadísticas
   a) Reporte de inventario (Visitor)
   b) Estadísticas de uso
   c) Recursos más populares
   d) Análisis por categoría

5. ⚙️ Configuración del Sistema
   a) Cargar datos desde archivos
   b) Ver configuración

6. 🔍 Búsquedas Especializadas
   a) Búsqueda por título
   b) Búsqueda por autor
   c) Búsqueda por categoría
   d) Búsqueda avanzada

0. 🚪 Salir del Sistema
```

## **📋 Requerimientos Técnicos**

**Sesión 1 (90 minutos): Arquitectura y Modelado**
* **Jerarquía de Herencia de Recursos:**
  - Clase abstracta `RecursoDigital` con métodos abstractos `calcularTiempoPrestamo()` y `validarAcceso(Usuario usuario)`
  - Subclases: `LibroElectronico`, `Audiolibro`, `Revista`, `Tesis`
  - Cada subclase implementa métodos específicos y sobrescribe métodos abstractos

* **Jerarquía de Herencia de Usuarios:**
  - Clase abstracta `Usuario` con método abstracto `getLimitePrestamos()`
  - Subclases: `Estudiante`, `Profesor`, `UsuarioGeneral`
  - Implementación de diferentes políticas de préstamo

* **Interfaces del Sistema:**
  - `SistemaBiblioteca`: prestarRecurso(), devolverRecurso(), buscarRecursos(), generarReporte()
  - `Prestable`: prestar(), devolver(), estaDisponible()

* **Patrón Singleton:**
  - Clase `ConfiguracionSistema` para manejo centralizado de configuración

* **Patrón Factory:**
  - `RecursoDigitalFactory` para creación dinámica de recursos según tipo

**Sesión 2 (90 minutos): Patrones Avanzados y Funcionalidades**
* **Lectura de Archivos:**
  - Parser complejo para múltiples formatos de archivo
  - Manejo robusto de excepciones personalizadas

* **Patrón Strategy:**
  - Interface `EstrategiaBusqueda` con implementaciones: `BusquedaPorTitulo`, `BusquedaPorAutor`, `BusquedaPorCategoria`, `BusquedaAvanzada`

* **Patrón Visitor:**
  - Interface `VisitorReporte` con implementaciones: `ReporteEstadisticas`, `ReporteInventario`, `ReporteUsuarios`

* **Excepciones Personalizadas:**
  - `RecursoNoDisponibleException`, `LimitePrestamosExcedidoException`, `UsuarioNoEncontradoException`

**🔧 Extras Avanzados**
* **Sistema de Notificaciones:** Alertas para recursos próximos a vencer 
* **Sistema de Reservas:** Funcionalidad para reservar recursos no disponibles
* **Políticas de Penalización:** Gestión de multas y restricciones por retrasos

**🏗️ Diagrama UML Requerido**
* Diagrama de clases completo mostrando:
  - Jerarquías de herencia completas
  - Interfaces y sus implementaciones  
  - Patrones de diseño aplicados
  - Relaciones y cardinalidades
  - Métodos principales de cada clase

**📦 Entregables**
1. **Código fuente completo** con documentación JavaDoc
2. **Diagrama UML detallado** en formato imagen
3. **Archivos de datos de prueba** completos y realistas
4. **Documento de arquitectura** explicando decisiones de diseño y patrones utilizados



**🕓 Dificultad estimada**: Muy Alta  
**📚 Contenidos relacionados**: Herencia avanzada, polimorfismo complejo, patrones de diseño, arquitectura de software, modelado de dominio  
**🗂️ Ayudantía**: Día 8-9 – Patrones de Diseño y Arquitectura Avanzada  
**⏱️ Tiempo de desarrollo**: 3 horas (2 sesiones de 90 minutos)