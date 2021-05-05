package main;
import java.util.Scanner;

public class PhieuNhap implements NhaCungCap {
	String maphieunhap;
	String ngaynhap;
	String ten;
	PhieuNhap obj[] = new PhieuNhap [3];
	Scanner sc = new Scanner(System.in);

	@Override
public  void NhapThongTin()  {
	System.out.println("Nhap ten nhan vien");
	ten = sc.nextLine();
	
	System.out.println("Nhap ma phieu");
	maphieunhap = sc.nextLine();
	System.out.println("Nhap ngay");
	ngaynhap = sc.nextLine();
}
@Override
 public void XuatThongTin () {
	System.out.println("Ma phieu nhap:"+ maphieunhap);
    System.out.println("Ngay nhap:"+ ngaynhap);
    System.out.println("Ten nhan vien:"+ ten);
            
	
}
}
