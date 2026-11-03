# Estación 1: Comprender el problema y modelar el flujo

## Diagrama de flujo

Ver: `docs/estacion-1-diagrama.mmd`

## Responsabilidades que no deben concentrarse en `Main`

1. Consultar salas disponibles  
2. Seleccionar una sala según el criterio  
3. Construir y validar la reserva  
4. Registrar y coordinar la confirmación  
5. Gestionar el estado de la reserva  
6. Notificar los cambios de estado  

## Punto de control

Si toda la lógica estuviera concentrada en la clase Main, tendría demasiadas responsabilidades, como consultar salas, validar datos, construir reservas, registrar información y enviar notificaciones. Esto dificultaría el mantenimiento y los cambios del sistema.
