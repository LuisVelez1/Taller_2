# 1

a. ¿Qué patrón de diseño utilizaría?
El patrón Decorator
b. ¿Por qué este patrón es más apropiado que crear una clase diferente para cada combinación?

Porque como el enunciado indica la clase original no se debe modificar, el decorador permite envolver al objeto 
message, sin tener que modificar directamente la clase, es decir cada funcionalidad es un decorador que se puede combinar sin necesidad de generar muchas clases. 


# 2
a. ¿Qué patrón de diseño utilizaría?
EL patron FACADE

b. ¿ Explique en 2 o 3 líneas por qué considera que este patrón es apropiado.?
Porque Facade Usa Interfaz simplificada para un grupo de clases.con una sola operacion como Purchase, la fachase se encargaría
de cordinar internamente todos los pasos, ya sea revisar el inventario, procesar el pago, organizar el envio y mandar notificación.
De esta forma el controlador no tiene forma de saber como funciona ni que orden se ejecuta internamente.