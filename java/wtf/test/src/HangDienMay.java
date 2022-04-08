import java.util.Scanner;

public class HangDienMay extends HangHoa {
  private int Thoigianbaohanh;
  private int Dienap;
  private float Congsuat;

  public HangDienMay() {
    this.Congsuat = 0;
    this.Dienap = 0;
    this.Thoigianbaohanh = 0;
  }

  public HangDienMay(int thoigianbaohanh, int dienap, float congsuat) {
    this.Thoigianbaohanh = thoigianbaohanh;
    this.Dienap = dienap;
    this.Congsuat = congsuat;
  }

  public int getThoigianbaohanh() {
    return Thoigianbaohanh;
  }

  public int getDienap() {
    return Dienap;
  }

  public float getCongsuat() {
    return Congsuat;
  }

  public void setThoigianbaohanh(int thoigianbaohanh) {
    Thoigianbaohanh = thoigianbaohanh;
  }

  public void setDienap(int dienap) {
    Dienap = dienap;
  }

  public void setCongsuat(float congsuat) {
    Congsuat = congsuat;
  }

  @Override
  public void input() {
    // TODO Auto-generated method stub
    super.input();
    Scanner x = new Scanner(System.in);
    System.out.println("Nhap thoi gia bao hanh: ");
    this.Thoigianbaohanh = x.nextInt();
    System.out.println("Nhap dien ap: ");
    this.Dienap = x.nextInt();
    System.out.println("Nhap cong suat: ");
    this.Congsuat = x.nextFloat();
  }

  @Override
  public void output() {
    // TODO Auto-generated method stub
    super.output();
    System.out.println("Thoi gia bao hanh: " + this.Thoigianbaohanh);
    System.out.println("Diien ap: " + this.Dienap);
    System.out.println("Cong suat: " + this.Congsuat);
  }
}
