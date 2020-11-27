                                                            # Desarrollo de Software Dirigido por Modelos

                                                                        ## Proyecto Final

###¿Qué nos permite realizar si estamos a cargo de un proyecto?

Nos permite generar código a través de un modelo UML pero con mejoras y enriquecerlo con información visual para nuestros programadores, a continuación se detallan algunas características:

- El diseño de la UI que se debe realizar para mostrar una relación o conjunto de relaciones.
- Como será la persistencia entre objetos relacionados.
- Definir diferentes paquetes para mantener las clases ordenadas.
- Mostrar si una clase es abstracta, asociativa o si se realizará su ABM o CRUD, en base a distintos colores: rojo claro, verde claro y gris claro respectivamente.
- Modelar con los artefactos definidos por UML.
- Definir distintas configuraciones como: artefacto; docker; lenguaje a utilizar; base de datos; microservicios.
- Muchas otras para lograr un mejor manejo de nuestro proyecto a cargo.

**Lo más importante**

Todo lo definido anteriormente se puede generar en cualquier código de programación sólo debemos generar las plantillas Acceleo en el lenguaje que deseamos, al utilizar Java podrémos dar provecho al tipo de cascada para persistir objetos, ya que los tipos del mismo se han cargado en base a lo establecido en JPA, si utilizamos otro lenguaje ¡No hay problema!, podemos utilizar esta información visual para indicarles a nuestros programadores como deben hacer la lógica para persistir la relación entre uno o más clases asociadas.

###¿Qué nos permite interpretar si somos programadores?

Nos permite visualizar información que con UML no podemos, ya que el mismo es muy acotado. A partir de nuestro metamodelo podemos darle a nuestros programadores una interpretación extra sobre los artefactos (clases, relaciones, interfaces, etc.) que van a componer la arquitectura del software, por ejemplo:

- Si se utiliza un lenguaje distinto a Java nuestro programador podrá visualizar en la relación el tipo de persistencia que existe, es decir, podrá escribir la lógica para guardar un objeto de forma correcta.
- Al especificar en la relación cómo será el tipo de UI para mostrar la relación (por ejemplo: maestro - detalle), nuestro programador podra escribir su HTML presentando los objetos de está forma.
- Con sólo mirar la clase podrá saber si es abstracta o asociativa con solo observar su color.
- Muchas otras para lograr una mejor visualización de nuestro diagrama de clases.

