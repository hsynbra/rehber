package firstproject;
import java.util.Scanner;


public class Anafonks {
	
	public static void main(String[] args) {
		Rehberislemleri r = new Rehberislemleri();
		int whileici = 0 ;
		while(whileici==0) {
			System.out.println("Ki�i eklemek i�in 1'e,");
			System.out.println("Ki�i silmek i�in 2'ye,");
			System.out.println("Ki�ileri listelemek i�in 3'e,");
			System.out.println("Ki�i aramak i�in 4'e,");
			System.out.println("��kmak i�in 5'e bas�n");		
			Scanner in = new Scanner(System.in);
			int c = in.nextInt();
			
			if(c==1) {
				r.ekle();		
			}
			else if(c==2) {
				r.sil();
			}
			else if(c==3) {
				r.listele();
			}
			else if(c==4) {
				r.arama();
			}
			
			else if(c==5) {
				whileici=1;
				System.out.println("iyi g�nler.");
	
			}
			else System.out.println("hatal� giri�. tekrar deneyin.");
			
		}
	}
}