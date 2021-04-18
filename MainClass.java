package main;
import Shapes.HinhTron;
import Shapes.HinhTru;
import Shapes.HinhVuong;
import Shapes.HinhChuNhat;

public class MainClass {

	public static void main(String[] args) {
        HinhTron ht = new HinhTron();
		ht.xuatten();
		ht.nhapbankinh();
		ht.tinhchuvi();
		ht.tinhdientich();
		ht.inchuvi();
		ht.indientich();
		HinhTru hinhTru = new HinhTru();
        hinhTru.xuatten();
		hinhTru.nhapchieucao();
		hinhTru.tinhthetich();
        hinhTru.inthetich();
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.xuatten();
        hcn.nhapchieudai();
        hcn.nhapchieurong();
        hcn.tinhchuvi();
        hcn.tinhdientich();
        hcn.inchuvi();
        hcn.indientich();
        HinhVuong hv = new HinhVuong();
        hv.xuatten();
        hv.nhapcanh();
        hv.tinhchuvi();
        hv.tinhdientich();
        hv.inchuvi();
        hv.indientich();
	}

}
