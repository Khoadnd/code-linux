
import java.util.Scanner;

class GIAOV extends NVCLC {
	private long thulao;

	@Override
	long tinhluong() {
		// TODO Auto-generated method stub
		return getLuongcb() * this.thulao;
	}

	public GIAOV() {
		this.thulao = 0;
	}

	public GIAOV(long thulao) {
		this.thulao = thulao;
	}

	public long getThulao() {
		return thulao;
	}

	public void setThulao(long thulao) {
		this.thulao = thulao;
	}

	@Override
	public void nhap() {
		// TODO Auto-generated method stub
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap thu lao: ");
		this.thulao = sc.nextLong();
	}

	@Override
	public void xuat() {
		// TODO Auto-generated method stub
		super.xuat();
		System.out.println("Thu lao " + this.thulao);
		System.out.println("Tong luong" + tinhluong());
	}
}
