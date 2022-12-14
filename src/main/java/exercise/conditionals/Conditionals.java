/*
En este ejercicio practicarás las estructuras de control, para ello deberás crear:

1. Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
    Pista: Los números inferiores a 0 son negativos y los superiores, positivos.

2. Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
    a Incrementar el valor de la variable en uno cada vez que se ejecute.
    b Mostrarlo por pantalla cada vez que se ejecute.

3. Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.

4. Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, 
    se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.

5. Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. 
    Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. 
    También habrá que poner un default para cuando el valor de la variable no sea una estación.
 
** @author Johanasev

*/

package exercise.conditionals;


public class Conditionals {

    public static void main(String[] args) {
        
       // condición if
       
       int numeroif = 3;
       
        System.out.println("1. Resultado del la condición IF");
       
       if(numeroif>0){
           System.out.println(numeroif + " es mayor a 0 \n");
       }else if(numeroif==0){
           System.out.println(numeroif +" es cero \n");
       }else{
           System.out.println(numeroif + " es negativo \n");
       }
        
       //fin condición if
       
       // Bucle while
       
       int numeroWhile = 0;
       
        System.out.println("2. Resultado del Bucle While");
        
       while(numeroWhile<3){
           
           System.out.println(numeroWhile);
           numeroWhile ++;

       }//fin while
       
       //Fin bulce while
       
       //Bucle Do While
       
        System.out.println("\n 3. Resutlado Bucle Do-while");
        
       do{
           System.out.println(numeroWhile);
           numeroWhile ++;
       
       }while(numeroWhile<=0);
       
       //Fin bucle Do-while
       
       //Bucle For
       
        System.out.println("\n 4. Resultado del bulce For");
       
       for(int numeroFor =0;numeroFor<=3;numeroFor++){
           System.out.println(numeroFor);
       }
       
       //Fin bucle For
       
       //Switch case
       
        var estacion = "gato";
        
        System.out.println("\n 5. El resutlado del Switch");
        
        switch (estacion){
            case "verano":
                System.out.println("Es verano");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            case "otoño":
                System.out.println("Es invierno");
                break;
            case "primavera":
                System.out.println("Es invierno");
                break;    
            default:
                System.out.println("La palabra " +estacion+ " no es una estación");
        }// fin switch
               
               
        
        
    }
}
