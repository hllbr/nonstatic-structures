
import java.util.Scanner;

/*
nonstatic class = (Static olmayan inner class)
1)nonStatic Inner class
2)Static Inner class
3)Lokal(Yerel) Inner Class
4)Anonymous(Anonim) Inner Class
INNER CLASS NE ANLAMA GELİYOR = (Dahili Sınıflar)
belirli bir görevi yapan classların başka bir class içerisinde gruplanmasıyla ortaya çıkan yapılardır.
class içinde class ve onuniçinde de class ve onun içinde de class şeklinde düşünüleblir biraz karmalış teorisi uygulaması açıklamadan daha kolaydır.


*/
public class Main {
    //nonStatic Inner Class
    public static void main(String[] args) {
        Matematik.Factorial faktoo = new Matematik().new Factorial();//Inner Classlarda obje oluşturulması bu şekilde 
        Matematik.asal masal = new Matematik().new asal();
        Matematik.Alan malan = new Matematik().new Alan();
        Matematik.Alan.DaireAlan daireAlan = new Matematik().new Alan().new DaireAlan();
        Scanner scn = new Scanner(System.in);
        System.out.println("bir sayı giriniz : ");
        int sayı = scn.nextInt();
        if(masal.asalmı(sayı)){
            System.out.println("Bu sayı asaldır.");
        }else{
            System.out.println("bu sayı asal değildir.");
        }
       // malan.daire_alan(sayı);
       daireAlan.daire_alan(7);
        faktoo.faktoriyel();
        
    }
    
}
