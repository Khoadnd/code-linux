import java.util.Scanner;

public class Hocjava {
	private NG DS[];
	private int SL;
	private int _maxN;

	public Hocjava() {
		this.SL = 0;
		this.DS = new NG[100];
		this._maxN = 100;
	}

	public Hocjava(int maxN) {
		this.SL = 0;
		this.DS = new NG[maxN];
		this._maxN = maxN;
	}
w
	public void nhap() {
		if (SL > _maxN) {
			System.out.println("Danh sach da day");
			return;
		}

		System.out.println("1: Nhap nhan vien quan ly,2: Nhap giao viien ");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		NG temp;
		switch (choice) {
			case 1: {
				temp = new NVQLY();
				temp.nhap();
				DS[this.SL++] = temp;
				break;
			}
			case 2: {
				temp = new GIAOV();
				temp.nhap();
				DS[this.SL++] = temp;
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
		}

		System.out.println("Ban vua nhap");
		temp.xuat();
	}

	public void xuat() {
		System.out.println("1: Xuat nhan vien quan ly,2: Xuat giao vien");
		Scanner x = new Scanner(System.in);
		int choice = x.nextInt();
		switch (choice) {
			case 1: {
				Xuatnhanvienquanly();
				break;
			}
			case 2: {
				Xuatgiaovien();
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
		}
	}

	private void Xuatgiaovien() {
		System.out.println("GIAOVIEN");
		int count = 1;
		for (NG nguoi : DS) {
			if (nguoi == null)
				break;
			if (nguoi instanceof GIAOV) {
				System.out.println("Giao vien thu " + count++);
				nguoi.xuat();
				System.out.println("---------------------------------");
			}
		}
	}

	private void Xuatnhanvienquanly() {
		System.out.println("NVQL");
		int count = 1;
		for (NG nguoi : DS) {
			if (nguoi == null)
				break;
			if (nguoi instanceof NVQLY) {
				System.out.println("Nhan vien quan ly thu " + count++);
				nguoi.xuat();
				System.out.println("---------------------------------");
			}
		}
	}

	public boolean isEmpty() {
		return this.SL == 0;
	}
}
