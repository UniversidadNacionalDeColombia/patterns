# Patterns
Patrones de diseño
## Integrantes:
>* Jaime Estupiñan
>* Juan Betancourt
>* Tom Perez

## Explicacion
>* El 1er punto:
> En el cual dependiendo de las 3 opciones que se muestran la persona va a escoger, esto ocurre en un switch case que dependiendo de la respuesta pasa la informacion a un context, el context pasa la estrategia y entre las 3 estrategias estan los 3 posibles medios de transporte.<br/>
> Una vez que se pasa el contexto a la estrategia se devuelve el medio de transporte que se debe usar.<br/>
>* En el 2do punto:
> Se agrego una nueva franquicia correspondiente a medellin, con la clase: MedellinPizzaStore <br/>
> En esta clase de agregaros 3 stilos de pizza: Hawaiana, peperoni y ranchera. Cada una con su correspondiente clase que extiende de Pizza<br/>
> Cada una de las clases style de medellin llenan los datos correspondientes de las clases y agregan ingredientes locales, ademas algunas de ellas modifican algunos meotodos como por ejemplo el de coccion.
>* En el 3er punto:
> Es un builder de combos para canciones y peliculas. Hay 2 diferentes canciones y 2 diferentes peliculas, el builder construye el combo teniendo como los items basicos a las peliculas y las canciones, al final da un combo con la descripcion de los 2 productos y precio.
>* En el 4to punto:
> Se implemento dos antipatrones:
> >* The Blob
> > En el cual se trabajo con una clase que se llama TheBlop en donde se ejecuta parte de la logica que se tiene.<br/>
> > Se cuenta con una clase principal: MainControllerClass la cual es la clase que monopoliza todo el procesamiento, esta cuenta con una gran cantidad de metodos que controlan todo el procesamiento, donde las otras clases basicamente solo encapsulan datos, y en la que todas las responsabilidades se le estan asignando a esta clase
