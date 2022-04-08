
import java.util.Scanner;

abstract class NVCLC extends NV {
	private String nganh;
	private String trinhdo;
	private String daotao;

	abstract long tinhluong();

	public NVCLC() {
		this.daotao = "";
		this.nganh = "";
		this.trinhdo = "";
	}

	public NVCLC(String daotao, String nganh, String trinhdo) {
		this.daotao = daotao;
		this.nganh = nganh;
		this.trinhdo = trinhdo;
	}

	public void setNganh(String nganh) {
		this.nganh = nganh;
	}

	public void setDaotao(String daotao) {
		this.daotao = daotao;
	}

	public void setTrinhdo(String trinhdo) {
		this.trinhdo = trinhdo;
	}

	public String getNganh() {
		return nganh;
	}

	public String getDaotao() {
		return daotao;
	}

	public String getTrinhdo() {
		return trinhdo;
	}

	@Override
	public void nhap() {
		// TODO Auto-generated method stub
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap nganh: ");
		this.nganh = sc.nextLine();
		System.out.println("Nhap dao tao: ");
		this.daotao = sc.nextLine();
		System.out.println("Nhap trinh do: ");
		this.trinhdo = sc.nextLine();
	}

	@Override
	public void xuat() {
		// TODO Auto-generated method stub
		super.xuat();
		System.out.println("Nganh: " + this.nganh);
		System.out.println("Dao tao: " + this.daotao);
		System.out.println("Trinh do: " + this.trinhdo);
	}
}
