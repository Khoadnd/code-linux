
import java.util.Scanner;

abstract class NG {
	private String ten;
	private String Namsinh;

	public NG() {
		this.ten = "";
		this.Namsinh = "";
	}

	public NG(String ten, String namsinh) {
		this.ten = ten;
		this.Namsinh = namsinh;
	}

	public void setten(String ten) {
		this.ten = ten;
	}

	public void setNamsinh(String Namsinh) {
		this.Namsinh = Namsinh;
	}

	public String getten() {
		return ten;
	}

	public String getNamsinh() {
		return Namsinh;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten: ");
		this.ten = sc.nextLine();
		System.out.println("Nhap nam sinh: ");
		this.Namsinh = sc.nextLine();
	}

	public void xuat() {
		System.out.println("Ten: " + this.ten);
		System.out.println("Nam sinh: " + this.Namsinh);
	}
}
