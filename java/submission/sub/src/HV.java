import java.util.Scanner;

class HV extends NG {

	private int a;
	private int b;
	private int c;

	public HV() {
		super();
		this.a = 0;
		this.b = 0;
		this.c = 0;
	}

	public HV(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public void seta(int a) {
		this.a = a;
	}

	public void setb(int b) {
		this.b = b;
	}

	public void setc(int c) {
		this.c = c;
	}

	public int geta() {
		return a;
	}

	public int getb() {
		return b;
	}

	public int getc() {
		return c;
	}

	@Override
	public void nhap() {
		// TODO Auto-generated method stub
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap diem a: ");
		this.a = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap diem b: ");
		this.b = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap diem c: ");
		this.c = Integer.parseInt(sc.nextLine());
	}

	@Override
	public void xuat() {
		// TODO Auto-generated method stub
		super.xuat();
		System.out.println("Diem a: " + this.a);
		System.out.println("Diem b: " + this.b);
		System.out.println("Diem c: " + this.c);
	}

}
