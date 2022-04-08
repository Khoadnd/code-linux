
import java.util.Scanner;

class NV extends NG {
	private long Luongcb;
	private int ngay;
	pbk phongbankhoa = new pbk();

	public NV() {
		super();
		this.Luongcb = 0;
		this.ngay = 0;
	}

	public NV(long luongcb, int ngay) {
		super();
		Luongcb = luongcb;
		this.ngay = ngay;
	}

	public void setLuongcb(long luongcb) {
		Luongcb = luongcb;
	}

	public void setNgay(int ngay) {
		this.ngay = ngay;
	}

	public long getLuongcb() {
		return Luongcb;
	}

	public int getNgay() {
		return ngay;
	}

	@Override
	public void nhap() {
		// TODO Auto-generated method stub
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap luong: ");
		this.Luongcb = sc.nextLong();
		System.out.println("Nhap ngay: ");
		this.ngay = sc.nextInt();
		phongbankhoa.nhappbk();
	}

	@Override
	public void xuat() {
		// TODO Auto-generated method stub
		super.xuat();
		System.out.println("Luong cb: " + this.Luongcb);
		System.out.println("Ngay: " + this.ngay);
		phongbankhoa.xuatpbk();
	}

}
