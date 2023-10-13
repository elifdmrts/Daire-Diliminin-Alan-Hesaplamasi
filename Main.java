import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double r,pi,a,daireDilimininAlanı;
        pi=3.14;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Yarıçapı Giriniz: ");
        r=scanner.nextDouble();
        System.out.print("Merkez Açının Ölçüsünü Giriniz: " );
        a=scanner.nextDouble();

        daireDilimininAlanı= (pi*(r*r)*a)/360;
        System.out.println("Daire Diliminin Alanı: "+daireDilimininAlanı);


    }
}