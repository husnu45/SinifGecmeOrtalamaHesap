
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        Scanner notGirisi = new Scanner(System.in);
        
        int mat , fizik , turkce , kimya , muzik;
        
        int notlarToplami = 0;
        
        int ortDahilDersler = 0;
        
        int gecmeOrtalaması = 55;
        
        System.out.println("Ders Notlarinizi Sirasi ile Girinizi...");
        System.out.println("*******************************************");
        
        System.out.print("Matematik Notunuzu Giriniz : ");
        mat = notGirisi.nextInt();
        
        if(mat >= 0 && mat <= 100){
            
            notlarToplami += mat;
            ortDahilDersler++;
            
        }
        
        System.out.print("Fizik Notunuzu Giriniz : ");
        fizik = notGirisi.nextInt();
        
        if(fizik >= 0 && fizik <= 100){
            
            notlarToplami += fizik;
            ortDahilDersler++;
            
        }
        
        System.out.print("Turkce Notunuzu Giriniz : ");
        turkce = notGirisi.nextInt();
        
        if(turkce >= 0 && turkce <= 100){
            
            notlarToplami += mat;
            ortDahilDersler++;
            
        }
        
        System.out.print("Kimya Notunuzu Giriniz : ");
        kimya = notGirisi.nextInt();
        
        if(kimya >= 0 && kimya <= 100){
            
            notlarToplami += kimya;
            ortDahilDersler++;
            
        }
        
        System.out.print("Muzik Notunuzu Giriniz : ");
        muzik = notGirisi.nextInt();
        
        if(muzik >= 0 && muzik <= 100){
            
            notlarToplami += muzik;
            ortDahilDersler++;
            
        }
        
        notGirisi.close();
        
        if(ortDahilDersler > 0){
            
            double genelOrtalama = (double) notlarToplami / ortDahilDersler;
            
            if(genelOrtalama >= gecmeOrtalaması){
                
                System.out.println("Ortalamaniz : " + genelOrtalama + " Tebrikler Sinifi Gectiniz...");
                
            }
            
            else{
                System.out.println("Ortalamaniz : " + genelOrtalama + " Sinifi Gecemediniz...Daha Cok Calismalisin...");
            }      
            
            
        }
        
        else{
            System.out.println("Girilen Notlar Gecersizdir...");
        }
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
}
