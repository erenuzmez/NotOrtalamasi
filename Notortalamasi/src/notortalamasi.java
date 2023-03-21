import java.util.Scanner;

public class notortalamasi {
    public static void main(String[] args) {
        Scanner inpp =new Scanner(System.in);
        int mat,fiz,kim,tr,tarih,muzik,toplam;
        double ortalama;
        System.out.println("Matematik notunu giriniz:");
        mat=inpp.nextInt();
        System.out.println("Fizik notunu giriniz:");
        fiz=inpp.nextInt();
        System.out.println("Kimya notunu giriniz:");
        kim=inpp.nextInt();
        System.out.println("Türkçe notunu giriniz:");
        tr=inpp.nextInt();
        System.out.println("Tarih notunu giriniz:");
        tarih=inpp.nextInt();
        System.out.println("Müzik notunu giriniz:");
        muzik=inpp.nextInt();
        toplam=(mat+fiz+kim+tr+tarih+muzik);
        ortalama=toplam/6;
        System.out.println("Ortalamanız:"+ortalama);
        boolean kosul1 =ortalama<=60;
        boolean kosul2 =ortalama>0;
        boolean sonuc =kosul1&&kosul2;
        String gecmedurumu = (sonuc) ? "Kaldınız" : "Geçtiniz";
        System.out.println(gecmedurumu);

    }
}
