package main;
import Shapes.SinhVien;


public class MainClass {

	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien();
		SinhVien sv2 = new SinhVien();
		sv1.setten(" ");
		sv1.settuoi(23);
		sv2.setten("Peter");
		sv2.settuoi(17);
		System.out.println("sv 1 co ten" + sv1.getTen() + "tuoi " + sv1.gettuoi());
System.out.println("sv 2 co ten" + sv2.getTen() + "tuoi " + sv2.gettuoi());	
      	}

}
