import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //https://chuidiang.org/index.php?title=Generar_n%C3%BAmeros_aleatorios_en_Java
        //https://codegym.cc/es/groups/posts/es.584.mtodo-java-mathrandom
        //Math.floor para quitamos los decimales (Aquí no hace falta)
        //Math.random para numero aleatorio entre el 1 y el 0

        Scanner sc = new Scanner(System.in);
        int a = (int) (Math.random()*99)+1;
        int b = (int) (Math.random()*99)+1;
        System.out.println("a es "+a+" b es "+b+", dime la suma de los dos");
        int numero = sc.nextInt();
        int suma = a+b;

        sc.close();

        if(a>=1 && a<=99 && b>=1 && b<=99) {
            if(numero == suma){
                System.out.println("Suma correcta");
            }else{
                System.out.println("Suma incorrecta");
            }
        }else{
            System.out.println("Los datos no cumplen con las características de ser mayores o iguales que uno y menores de 100");
        }

    }
}

//del 25 al 30 (incluidos)
/*
int a = (int) (Math.random()*6)+25;
int b = (int) (Math.random()*6)+25;
if(numero == suma){
                System.out.println("Suma correcta");
            }else{
                System.out.println("Suma incorrecta");
            }
 */
//string mensaje = (suma == nuero)?sout("Suma correcta"):sout...;