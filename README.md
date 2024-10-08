# git-taller

Se ha añadido una nueva funcionalidad para filtrar vehículos por año en la clase `Main`. Ahora puedes buscar vehículos que sean mayores o menores al año especificado usando el método `buscarPorAño`. Este método acepta dos parámetros: el año de referencia y un booleano `esMayor`. Si `esMayor` es `true`, se filtran los vehículos con año mayor al especificado; si es `false`, se filtran los vehículos con año menor.

Para usar esta funcionalidad, primero agrega vehículos usando el método `agregarVehiculo`. Luego, llama a `buscarPorAño` con el año deseado y el parámetro de filtro adecuado. Finalmente, utiliza `mostrarVehiculos` para ver los vehículos que cumplen con el criterio de búsqueda. Este enfoque facilita la gestión y visualización de los vehículos según su año de fabricación.
