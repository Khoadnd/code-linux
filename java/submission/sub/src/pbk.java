import java.util.Scanner;

public class pbk {
  private String mapbk;
  private String tenpbk;

  public pbk() {
    this.mapbk = "";
    this.tenpbk = "";
  }

  public pbk(String mapbk, String tenbk) {
    this.mapbk = mapbk;
    this.tenpbk = tenbk;
  }

  public void setMapbk(String mapbk) {
    this.mapbk = mapbk;
  }

  public void setTenpbk(String tenpbk) {
    this.tenpbk = tenpbk;
  }

  public String getMapbk() {
    return mapbk;
  }

  public String getTenpbk() {
    return tenpbk;
  }

  public void nhappbk() {
    Scanner x = new Scanner(System.in);
    System.out.println("Nhap mapbk: ");
    this.mapbk = x.nextLine();
    System.out.println("Nhap ten pbk: ");
    this.tenpbk = x.nextLine();
  }

  public void xuatpbk() {
    System.out.println("Ma pbk: " + this.mapbk);
    System.out.println("Ten pbk: " + this.tenpbk);
  }
}
