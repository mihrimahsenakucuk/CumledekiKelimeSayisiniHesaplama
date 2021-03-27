import java.util.Scanner;

public class KelimeHesaplama {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sayac = 1;

        System.out.print("Cümlenizi giriniz: ");
        String cumle = scan.nextLine();

        for(int i = 0; i < cumle.length(); i++)
        {
            if(cumle.charAt(i) == ' ') {
                sayac++;
            }
        }
        System.out.println("Girilen cümlede " + sayac + " tane kelime vardır");
    }
}

