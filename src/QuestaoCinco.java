import java.util.ArrayList;
import java.util.Scanner;

public class QuestaoCinco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra ou frase: ");
        String palavra = sc.nextLine();
        ArrayList<Character> listaUm = new ArrayList<>();
        for(int i = 0; i < palavra.length(); i++){
            char letra = palavra.charAt(i);
            listaUm.add(letra);
        }
        int ultimo = listaUm.size();
        for(int i = ultimo; i>0; i--){
            System.out.print(listaUm.get(i -1));
        }


    }
}
