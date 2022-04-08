
import java.util.Scanner;

public class PhanSo {
  private int _tu;
  private int _mau;

  public PhanSo() { // constructor
    _tu = 0;
    _mau = 0;
  }

  public PhanSo(int tu, int mau) { // constructor
    _tu = tu;
    _mau = mau;
  }

  public PhanSo Cong(PhanSo phanSo) {
    PhanSo ketQua = new PhanSo();
    ketQua.set_mau(this.get_mau() * phanSo.get_mau());
    ketQua.set_tu(this.get_tu() * phanSo.get_mau() + phanSo.get_tu() * this.get_mau());
    return ketQua;
  }

  public void Nhap() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap tu: "); // cout << "Nhap tu: "
    this.set_tu(sc.nextInt()); // cin >> this.Tu
    System.out.println("Nhap mau: "); // cout << "Nhap mau: "
    this.set_mau(sc.nextInt()); // cin >> this.Mau
  }

  public void Xuat() {
    System.out.println(this.get_tu() + "/" + this.get_mau());
  }

  // getters, setters
  public int get_mau() {
    return _mau;
  }

  public int get_tu() {
    return _tu;
  }

  public void set_mau(int _mau) {
    this._mau = _mau;
  }

  public void set_tu(int _tu) {
    this._tu = _tu;
  }
}
