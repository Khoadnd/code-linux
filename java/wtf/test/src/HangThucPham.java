import java.util.Scanner;

public class HangThucPham extends HangHoa {
  private int ngaysx;
  private int thangsx;
  private int namsx;
  private int ngayhh;
  private int thanghh;
  private int namhh;

  public HangThucPham() {
    this.ngaysx = 0;
    this.thangsx = 0;
    this.namsx = 0;
    this.ngayhh = 0;
    this.thanghh = 0;
    this.namhh = 0;
  }

  public HangThucPham(int ngaysx, int thangsx, int namsx, int ngayhh, int thanghh, int namhh) {
    super();
    this.ngaysx = ngaysx;
    this.thangsx = thangsx;
    this.namsx = namsx;
    this.ngayhh = ngayhh;
    this.thanghh = thanghh;
    this.namhh = namhh;
  }

  public int getNgaysx() {
    return ngaysx;
  }

  public int getThangsx() {
    return thangsx;
  }

  public int getNamsx() {
    return namsx;
  }

  public int getNgayhh() {
    return ngayhh;
  }

  public int getThanghh() {
    return thanghh;
  }

  public int getNamhh() {
    return namhh;
  }

  public void setNgaysx(int ngaysx) {
    this.ngaysx = ngaysx;
  }

  public void setThangsx(int thangsx) {
    this.thangsx = thangsx;
  }

  public void setNamsx(int namsx) {
    this.namsx = namsx;
  }

  public void setNgayhh(int ngayhh) {
    this.ngayhh = ngayhh;
  }

  public void setThanghh(int thanghh) {
    this.thanghh = thanghh;
  }

  public void setNamhh(int namhh) {
    this.namhh = namhh;
  }

  @Override
  public void input() {
    // TODO Auto-generated method stub
    super.input();
    Scanner y = new Scanner(System.in);
    System.out.println("Nhap ngay xx: ");
    this.ngaysx = y.nextInt();
    System.out.println("Nhap thang xx: ");
    this.thangsx = y.nextInt();
    System.out.println("Nhap nam xx: ");
    this.namsx = y.nextInt();
    System.out.println("Nhap ngay hh: ");
    this.ngayhh = y.nextInt();
    System.out.println("Nhap thang hh: ");
    this.thanghh = y.nextInt();
    System.out.println("Nhap nam hh: ");
    this.namhh = y.nextInt();
  }

  @Override
  public void output() {
    // TODO Auto-generated method stub
    super.output();
    System.out.println("Ngay san xuat: " + this.ngaysx + "/" + this.thangsx + "/" + this.namsx);
    System.out.println("Han su dung: " + this.ngayhh + "/" + this.thanghh + "/" + this.namhh);
  }
}
