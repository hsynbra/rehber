package firstproject;
import java.util.Scanner;
import java.util.ArrayList;

public class Rehberislemleri {	
	
		ArrayList<kisi> kisilist = new ArrayList();
		int id = 1;
		
	public void ekle() {
		kisi k = new kisi();
		Scanner in = new Scanner(System.in);
		System.out.println("kiþinin adý");
		k.setKisiad(in.nextLine());
		System.out.println("kiþinin soyadý");
		k.setSoyad(in.nextLine());
		System.out.println("kiþinin telefonu");
		k.setTelefon(in.nextInt());
		kisilist.add(k);
		k.setId(id);
		id++;
		
	}
	public void sil() {	
		
		for (kisi kisi : kisilist) {
			System.out.print(kisi.getId()+"  ");
			System.out.print(kisi.getKisiad()+"  ");
			System.out.print(kisi.getSoyad()+"  ");
			System.out.println(kisi.getTelefon()+"  ");
		}	
		
		Scanner in =new Scanner(System.in);
		int girilenId = in.nextInt();	
		
		int sayac = 0;
		for (kisi kisi : kisilist) {
			if(kisi.getId()==girilenId) {
				kisilist.remove(sayac);	
				break;	
			}
			sayac++;
		}			
	}
	
	public void arama() {
		Scanner in =new Scanner(System.in);		
		String girilenId = in.nextLine();
		
		for (kisi kisi : kisilist) {
			if(kisi.getKisiad().contains(girilenId)) System.out.println(kisi.getKisiad());
			
		}			
	}	
	
	public void listele() {
		for (kisi kisi : kisilist) {
			System.out.print(kisi.getId()+"  ");
			System.out.print(kisi.getKisiad()+"  ");
			System.out.print(kisi.getSoyad()+"  ");
			System.out.println(kisi.getTelefon()+"  ");
		}	
	}
}
