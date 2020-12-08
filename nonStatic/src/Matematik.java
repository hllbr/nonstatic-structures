
import java.util.Scanner;


public class Matematik {//pane class 
    private double pı = Math.PI ;
    public class Factorial{//Inner Class
        public void faktoriyel(){
            Scanner scn = new Scanner(System.in);
            System.out.println("bir sayı giriniz :");
            int sayı = scn.nextInt();
            int fact = 1;
            for(int i = 2 ;i<=sayı ;i++){
                fact*=i;
                
            }
            System.out.println("Fakoriyel işleminizin sonucu :" +fact);
        }
    
}
    public class asal{//Inner Class
        public boolean asalmı(int sayı){
            int i = 2 ;
            while(i<sayı){
                if(sayı%i ==0){
                    return false;
                }
                i++;
            }
            return true;
        }
    }
    public class Alan{//Inner Class
        public class DaireAlan{
            public void daire_alan(int yarı_cap){
            //Inner classlar private alanlara direkt oalrak erişebiliyor şimdi bu özellik ile pi yi kullanmaya çalışıyoruz
            System.out.println("Dairenin alanı : "+(yarı_cap*yarı_cap*pı));
        }
        }

    }

}
