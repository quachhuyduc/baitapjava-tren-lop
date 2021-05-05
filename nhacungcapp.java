package main;
import java.util.Scanner;
public class nhacungcapp implements NhaCungCap{
	 public String MaNhaCungCap;
	    public String TenNhaCungCap;
	    public String DiaChi;
	   nhacungcapp obj2[] = new nhacungcapp [3];
		Scanner scanner = new Scanner(System.in);
	    
	    @Override
	    public void NhapThongTin () {
	     
	        System.out.println("thong tin nha cung cap: ");
	        
	        System.out.println("nhap ma nha cung cap: ");
	        MaNhaCungCap = scanner.nextLine();
	        System.out.println("nhap ten nha cung cap: ");
	        TenNhaCungCap = scanner.nextLine();
	        System.out.println("nhap dia chi: ");
	        DiaChi = scanner.nextLine();
	 }
	    @Override
	    public void XuatThongTin() {
	    	   System.out.println(" ma nha cung cap: " + MaNhaCungCap);
	    	   System.out.println(" ten nha cung cap: " + TenNhaCungCap);
	    	   System.out.println("dia chi: " + DiaChi);
	    	   
	    	
	    }
	    	
	    }
