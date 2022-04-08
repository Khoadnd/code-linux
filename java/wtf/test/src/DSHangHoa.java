import java.util.Scanner;

public class DSHangHoa {
  private HangHoa DS[];
  private int SL;

  public DSHangHoa() {
    this.SL = 0;
    this.DS = null;
  }

  public void ThemMH() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap sl: ");
    this.SL = sc.nextInt();
    this.DS = new HangHoa[this.SL];
    for (int i = 0; i < SL; i++) {
      DS[i] = new HangHoa();
      DS[i].input();
      System.out.println("HANGHOA");
    }
  }

  public void XuatMH() {
    DS.
  }
  public void XuatDStheoloai() {
    HangDienMay temp;
    System.out.println("Danh sach hoc sinh la :\n");
    for (int i = 0; i < SL; i++)
      if (DS[i].getMahang() == "DM") {
        DS[i].output();
      }
  }
}
