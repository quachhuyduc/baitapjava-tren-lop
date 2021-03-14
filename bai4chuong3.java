import java.util.Scanner;
public class bai4chuong3{
	public static void main(String[] args) {
		SV sinhvien1= new SV();
		SV sinhvien2= new SV();
		
		sinhvien1.nhap();
		sinhvien1.in();
		
		sinhvien2.nhap();
		sinhvien2.in();
		
		
	}
}
	class SV {
		String hten;
		int nsinh;
		String gtinh;
		String lop;
		float dt;
		float dl;
		float dh;
		
	void in() {	
		System.out.println("Hoten SV: " + hten);
		System.out.println("Ngaysinh SV: " + nsinh);
		System.out.println("Gioitinh SV: " + gtinh);
		System.out.println("Lop SV: " + lop);
		System.out.println("DT SV: " + dt);
		System.out.println("DL SV: " + dl);
		System.out.println("DH SV: " + dh);
		System.out.println("DTB SV: " + dtb());
		
		
}
	float dtb() {
		return(dt+dl+dh)/3;
	}
	void nhap() {
		Scanner s = new Scanner(System.in);
		System.out.println("Nhap ho ten SV: ");
		hten=s.nextLine();
		System.out.println("Nhap ngaysinh  SV: ");
		nsinh=s.nextInt();
		System.out.println("Nhap gioi tinh SV: ");
		gtinh=s.nextLine();
		System.out.println("Nhap lop SV: ");
		lop=s.nextLine();
		System.out.println("Nhap diem toan SV: ");
		dt=s.nextFloat();
		System.out.println("Nhap diem ly SV: ");
		dl=s.nextFloat();
		System.out.println("Nhap diem hoa SV: ");
		dh=s.nextFloat();
	}
}