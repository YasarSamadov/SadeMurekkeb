import java.util.Scanner;

public class SadeMurekkeb {

    public static void main(String[] args) {
        SadeMurekkeb();
    }

    public static void SadeMurekkeb() {
        System.out.println("Bu proqram istifadecinin daxil etdiyi ededin sade ya murekkeb olmadughunu yoxlamaq ucundur");

        System.out.println("zehmet olmasa eded daxil edin");

        int eded = new Scanner(System.in).nextInt();
        boolean bolundu = false;

        for (int i = 2; i < eded; i++) {

            if (eded % i == 0) {
                bolundu = true;
            }
        }

        if (bolundu) {
            System.out.println("murekkeb");
        } else {
            System.out.println("sade");
        }
    }
}

