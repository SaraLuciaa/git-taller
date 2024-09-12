# Guía de Estilo de Codificación (CODESTYLE.md)

Este documento define el estándar de codificación acordado para el proyecto.

## 1. Nombres de Variables y Funciones

- **Variables y parámetros**: `camelCase`.
- **Funciones**: `camelCase`.
- **Clases**: `PascalCase`.
- **Constantes**: `UPPER_SNAKE_CASE`.

## 2. Reglas de Indentación

- Usar **espacios** en lugar de tabuladores.
- Cada nivel de indentación será de **4 espacios**.

## 3. Longitud Máxima de Líneas

- El límite máximo de longitud de línea es de **80 caracteres**.

## 4. Formato de Comentarios

- **Comentarios de una línea**: `// Comentario de una línea`.
- **Bloques de comentarios**:
  ```javascript
  /*
   * Este es un bloque de comentarios.
   * Puede usarse para explicar secciones más grandes del código.
   */

### 2.2 Tipos de Commit

- **feat**: Nueva funcionalidad o feature añadida.
- **fix**: Arreglo de un bug.
- **docs**: Cambios en la documentación (README, comentarios, etc.).
- **style**: Cambios de formato, espacios, puntos y comas, etc., que no afectan el código.
- **refactor**: Cambios en el código que no afectan el comportamiento externo, como la mejora de la estructura o el rendimiento.
- **test**: Añadir, corregir o modificar pruebas (unitarias, de integración, etc.).
- **chore**: Cambios en el proceso de construcción o herramientas auxiliares y bibliotecas, como la actualización de paquetes.
- **build**: Cambios que afectan el sistema de build o dependencias externas (ej: `gulp`, `npm`, `gradle`).
- **perf**: Cambios realizados para mejorar el rendimiento.
- **ci**: Cambios en los archivos de configuración de integración continua y scripts de automatización (ej: Jenkins, Travis).
- **revert**: Revertir un commit anterior.
- **merge**: Merge de ramas.
- **hotfix**: Cambio rápido y crítico para resolver un bug en producción.
