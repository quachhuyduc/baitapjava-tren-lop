package util;

public class configs {
public static final int NHAN_VIEN_SEP = 1;
public static final int NHAN_VIEN_LINH = 2;
public static final long LUONG_NHAN_VIEN_FULL_TIME_SEP = 20000000;
public static final long LUONG_NHAN_VIEN_FULL_TIME_LINH = 10000000;
public static final long LUONG_LAM_THEM_MOI_NGAY = 800000;
public static final long LUONG_NHAN_VIEN_PART_TIME_MOI_GIO = 100000;

}
package model;

public class NhanVienFullTime {
	protected String ten;
	protected long luong;
	public NhanVienFullTime () {
		
	}
	public NhanVien (String ten) {
		this.ten = ten;
		
	}
	protected String loaiNhanVien() {
		return " ";
	}
	public void xuatThongTin() {
		System.out.println("=== nhan vien " + ten + "====");
		System.out.println("Loai nhan vien"  + loaiNhanVien());
		System.out.println("Luong " + luong + "VND");

}
package model;
import util.configs;
public class NhanVienPartTime extends NhanVien {
	private int giolamviec;
	public NhanVienPartTime(String ten, int giolamviec) {
		this.ten = ten;
		this.giolamviec = giolamviec;
	}
	@Override
public String loaiNhanVien() {
		return "nhan vien thoi vu";
	}
	public void tinhluong () {
		luong = configs.LUONG_NHAN_VIEN_PART_TIME_MOI_GIO * giolamviec;
	}

}
package main;​

import model.NhanVienFullTime;

import model.NhanVienPartTime;​

import util.configs;​

public class MainClass {​

	  NhanVienFullTime sep = new NhanVienFullTime("Trần Văn Sếp");​

      sep.setLoaiChucVu(Configs.NHAN_VIEN_SEP);​

      NhanVienFullTime linh1 = new NhanVienFullTime("Nguyễn Văn Lính"); ​

      NhanVienFullTime linh2 = new NhanVienFullTime("Lê Thị Lính", 3); 
      NhanVienPartTime thoiVu = new NhanVienPartTime("Phan Thị Thời Vụ", 240);​
​

      sep.tinhLuong();​

      linh1.tinhLuong();​

      linh2.tinhLuong();​

      thoiVu.tinhLuong();​​

      sep.xuatThongTin();​

      linh1.xuatThongTin();​

      linh2.xuatThongTin();​

      thoiVu.xuatThongTin();​​
    }​

}​​
