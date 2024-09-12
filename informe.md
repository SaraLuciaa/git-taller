Aquí tienes un ejemplo de cómo podría quedar el informe basado en los retos y _merges_ que podrían haber surgido durante el desarrollo de las funcionalidades:

---

# **Informe del Proyecto**

### **Participantes:**
- Ricardo Urbina
- Sara Diaz
- Raul Alfonso Quigua
- Kevin Nieto
- Joseph Velez

---

## **Descripción del Proyecto**

Este proyecto consistió en desarrollar un sistema de gestión de vehículos utilizando Git y GitHub para la colaboración en equipo. A lo largo del desarrollo, implementamos varias clases y funcionalidades relacionadas con la gestión de la flota de vehículos, incluyendo su información técnica, historial de mantenimiento, y la posibilidad de filtrar los vehículos por características específicas.

---

## **Estándares de Codificación**

El equipo acordó las siguientes reglas de codificación, documentadas en el archivo `CODESTYLE.md`:
- Uso de `camelCase` para los nombres de variables y métodos.
- Indentación de 4 espacios por nivel.
- Comentarios de una línea usando `//` y de múltiples líneas usando `/** ... */`.
- Las líneas de código no deben exceder 80 caracteres.

---

## **Commits y Evidencias**

### **Raul Quigua**
- **Tarea:** Creación de la clase `Vehiculo`.


### **Kevin Nieto**
- **Tarea:** Implementación de la clase `Main` con la capacidad de agregar y buscar vehículos por año`.


### **Joseph Velez**
- **Tarea:** Implementación de la clase `Main` con la capacidad de agregar y buscar vehículos por año.


### **Ricardo Urbina**
- **Tarea:** Validaciones adicionales en la clase `Vehiculo`.
   

### **Sara Diaz**
- **Tarea:** Método en la clase `Main` para imprimir todos los vehículos de la flota.

---

## **Merges y Resolución de Conflictos**

### **Merge 1:**
- **Funcionalidad:** Integración de la clase `Vehiculo` (Ricardo) con la clase `Main` (Raul).
- **Conflicto:** Durante el merge, hubo un conflicto en el archivo `Main.java` debido a diferencias en la inicialización de los atributos de la clase `Vehiculo`.
- **Resolución:** El equipo acordó utilizar la versión de Raul en la que los vehículos se creaban con valores predeterminados para los atributos. El conflicto se resolvió manualmente utilizando Visual Studio Code.

### **Merge 2:**
- **Funcionalidad:** Validación de tipo de combustible (Ricardo) y búsqueda de vehículos por año (Joseph).
- **Conflicto:** Se produjo un conflicto en el archivo `Vehiculo.java` debido a una validación redundante que se había implementado en ambas ramas.
- **Resolución:** Eliminamos la validación duplicada y mantuvimos la lógica propuesta por Joseph, que era más completa. Esto fue hablado y aprobado por Joseph y Ricardo antes de realizar el merge.

### **Merge 3:**
- **Funcionalidad:** Impresión de vehículos (Sara) y busqueda por rango de año de vehiculo (Kevin).
- **Conflicto:** Hubo un conflicto menor en el método de impresión en la clase `Main`, ya que ambos cambios modificaban la forma en que se mostraba la información de los vehículos.
- **Resolución:** Modificamos el método para que imprima tanto los atributos del vehículo como su historial de mantenimiento. Los cambios fueron revisados por Sara antes de realizar el merge.

---

## **Reflexiones**

1. **Clonación vs. Fork:**  
   Clonar un repositorio nos permitió trabajar directamente sobre el proyecto en equipo, mientras que un _fork_ habría sido útil si alguno de nosotros hubiese querido hacer contribuciones a un repositorio ajeno.

2. **Convenciones de ramas:**  
   Usar una convención para nombrar las ramas, como `feat/nueva-funcionalidad`, nos permitió trabajar de manera organizada y eficiente, evitando confusiones y facilitando la revisión de código.

3. **Documentación útil:**  
   Mantener la documentación actualizada, especialmente el `README.md` y el `CODESTYLE.md`, resultó clave para la fluidez del proyecto. Esta práctica será útil para cualquier colaborador que quiera trabajar en el proyecto en el futuro.

---

### **Evidencias Adicionales**



---

Este informe incluye un resumen de las tareas y actividades realizadas, así como los retos que enfrentamos en el proceso de colaboración. También hemos documentado cómo resolvimos los conflictos para asegurar que el proyecto se mantuviera organizado y funcional.


