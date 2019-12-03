package firstproject;
import java.util.Scanner;


public class Anafonks {
	
	public static void main(String[] args) {
		Rehberislemleri r = new Rehberislemleri();
		int whileici = 0 ;
		while(whileici==0) {
			System.out.println("Kiþi eklemek için 1'e,");
			System.out.println("Kiþi silmek için 2'ye,");
			System.out.println("Kiþileri listelemek için 3'e,");
			System.out.println("Kiþi aramak için 4'e,");
			System.out.println("Çýkmak için 5'e basýn");		
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
				System.out.println("iyi günler.");
	
			}
			else System.out.println("hatalý giriþ. tekrar deneyin.");
			
		}
	}
}