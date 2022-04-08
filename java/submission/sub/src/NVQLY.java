
import java.util.Scanner;

class NVQLY extends NVCLC {
	private long phucap;

	@Override
	long tinhluong() {
		// TODO Auto-generated method stub
		return getLuongcb() + this.phucap;
	}

	public NVQLY() {
		this.phucap = 0;
	}

	public NVQLY(long phucap) {
		this.phucap = phucap;
	}

	public void setPhucap(long phucap) {
		this.phucap = phucap;
	}

	public long getPhucap() {
		return phucap;
	}

	@Override
	public void nhap() {
		// TODO Auto-generated method stub
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap phu cap: ");
		this.phucap = sc.nextLong();
	}

	@Override
	public void xuat() {
		// TODO Auto-generated method stub
		super.xuat();
		System.out.println("Phu cap la: " + this.phucap);
		System.out.println("Tong long la: " + this.tinhluong());
	}
}
