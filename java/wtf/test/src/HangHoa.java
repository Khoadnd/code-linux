import java.util.Scanner;

public class HangHoa {
  protected String Mahang;
  protected String Tenhang;
  protected float Gia;

  public HangHoa() {
    Mahang = "";
    Tenhang = "";
    Gia = 0;
  }

  public HangHoa(String mahang, String tenhang, float gia) {
    Mahang = mahang;
    Tenhang = tenhang;
    Gia = gia;
  }

  public float getGia() {
    return Gia;
  }

  public String getMahang() {
    return Mahang;
  }

  public String getTenhang() {
    return Tenhang;
  }

  public void setGia(float gia) {
    Gia = gia;
  }

  public void setMahang(String mahang) {
    Mahang = mahang;
  }

  public void setTenhang(String tenhang) {
    Tenhang = tenhang;
  }

  public void input() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap ma hang: ");
    Mahang = sc.nextLine();
    System.out.println("Nhap ten hang: ");
    Tenhang = sc.nextLine();
    System.out.println("Nhap gia: ");
    Gia = sc.nextFloat();
  }

  public void output() {
    System.out.println("Ma hang: " + Mahang);
    System.out.println("Ten hang: " + Tenhang);
    System.out.println("Gia: " + Gia);
  }
}
