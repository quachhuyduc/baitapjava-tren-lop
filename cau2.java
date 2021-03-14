import java.util.Scanner;

public class cau2 {
    String tenSp;
    double donGia;

    void nhapSp(){
        System.out.println("nhap ten san pham 1: ");
        Scanner sc = new Scanner(System.in);
        sc.next();
        System.out.println("nhap don gia: ");
        sc.nextDouble();
        sc.close();
    }
public static void main(String[] args){
    cau2 sp1 = new cau2();
    cau2 sp2 = new cau2();
    sp1.nhapSp();
    sp2.nhapSp();
    }
}
    