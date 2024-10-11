import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Llegim la resposta
        String resposta = sc.nextLine();

        // Determinem la casa segons la resposta
        String casa;
        casa = resposta.equals("hola") ? "adios" :
                resposta.equals("Coneixement") ? "Ravenclaw" :
                        resposta.equals("Ambicio") ? "Slytherin" : "Hufflepuff";

        // Mostrem la casa seleccionada
        System.out.println(casa);


    }

}
