import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //TAREA2 JUEGO DE JAVA juego de ahorcado
     //Clase Scanner
        Scanner scanner = new Scanner(System.in);

        //Declaraciones y asignaciones
        String palabraSecreta = "arbol";

        int intetnosMaximos = 10;

        int intentos = 0;

        boolean palabraCorrecta = false;

        //Arreglos
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        
        //Bucle o estructura de control
        for(int i = 0; i < letrasAdivinadas.length; i++){
            letrasAdivinadas[i] ='_';
            

        }

        //Bucle o estructura de control
        while(!palabraCorrecta && intentos < intetnosMaximos){
            //Esto se usa cuando tenemos una palabr para adivinar
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas));
            System.out.println("Introduce una letra, por favor");
            //Usamos la clase scanner para pedir una leta
            char letra = Character.toLowerCase(scanner.next().charAt(0));
            boolean letraCorrecta = false;

            for(int i = 0; i < palabraSecreta.length();i++){
                //Estructura control condicional
                if(palabraSecreta.charAt(i) == letra){
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;

                }
            }

            if(!letraCorrecta){
                intentos++;
                System.out.println("¡Incorrecto! te quedan " + (intetnosMaximos - intentos) + " intentos");
            }

            if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                palabraCorrecta = true;
                System.out.println("Felicidades: adivinaste la palabra correcta");
            }

        }

        if(!palabraCorrecta){
            System.out.println("Game Over");
        }

        scanner.close();
        





    }
}
