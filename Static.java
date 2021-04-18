package main;

public class Configs {
	public static final int SO_LUONG_HINH_TOI_THIEU = 0;
	public static final int SO_LUONG_HINH_TOI_DA = 5;
	public static final float PI = 3.14f;
	public static final float INCH_CM = 2.54f;
	public static final int DON_VI_CM = 1;
	public static final int DON_VI_INC = 2;
	public static int donvi = DON_VI_CM;
	public static float chuyencentimetsanginch(float cm) {
		float inch = cm / INCH_CM;
		return inch;
		
		
	}
	public static float chuyeninchsangcentimet(float inch) {
		float cm = inch * INCH_CM;
		return cm;
	}
	

}

import java.util.Scanner;

public class HinhTron  {
	protected float bankinh;
	private Scanner sc;
	public HinhTron() {
			super();
			sc = new Scanner(System.in);
			
	}
	public void nhapbankinh() {
		System.out.println("ban dung don vi tinh nao: ");
		System.out.println("\t1 - Centimet");
		System.out.println("\t2 - inch");
		Configs.donvi = sc.nextInt();
		System.out.println("hay nhap vao ban kinh hinh tron");
		bankinh = sc.nextFloat();
		
	}
	public void inthongtin() {
		if (Configs.donvi == Configs.DON_VI_CM) {
			System.out.println("Hinh tron co ban kinh " + bankinh + "cm");
			System.out.println("tuong duong  " + Configs.chuyencentimetsanginch(bankinh) + "inch");
		}else {
			System.out.println("Hinh tron co ban kinh" + bankinh + "inch");
			System.out.println("tuong duong " + Configs.chuyeninchsangcentimet(bankinh) + "cm");
		}
	}
}
public class MainClass {

	public static void main(String[] args) {
	Configs cf = new Configs();
	HinhTron ht = new HinhTron();
	ht.nhapbankinh();
	ht.inthongtin();

	
      	}

}

