class PHANSO {
    private int tu;
    private int mau;

    public PHANSO() {
        this.tu = 0;
        this.mau = 0;
    }

    public PHANSO(int tu, int mau) {
        super();
        this.tu = tu;
        this.mau = mau;
    }

    public PHANSO(PHANSO PS) {
        this.tu = PS.tu;
        this.mau = PS.mau;
    }

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }

    public int timUSCLN(int a, int b) {
        return (a == 0) ? b : (b == 0) ? a : (a == b) ? a : (a > b) ? timUSCLN(a - b, b) : timUSCLN(b, b - a);
    }

    public void toiGianPhanSo() {
        int i = timUSCLN(this.getTu(), this.getMau());
        this.setTu(this.getTu() / i);
        this.setMau(this.getMau() / i);
    }

    public PHANSO cong(PHANSO ps) {
        int ts = this.getTu() * ps.getMau() + ps.getTu() * this.getMau();
        int ms = this.getMau() * ps.getMau();
        PHANSO tong = new PHANSO(ts, ms);
        tong.toiGianPhanSo();
        System.out.println("Tong 2 phan so = " + tong.tu + "/" + tong.mau);
        return tong;
    }

    public PHANSO tru(PHANSO ps) {
        int ts = this.getTu() * ps.getMau() - ps.getTu() * this.getMau();
        int ms = this.getMau() * ps.getMau();
        PHANSO hieu = new PHANSO(ts, ms);
        hieu.toiGianPhanSo();
        System.out.println("Hieu 2 phan so = " + hieu.tu + "/" + hieu.mau);
        return hieu;
    }

    public void nhan(PHANSO ps) {
        int ts = this.getTu() * ps.getTu();
        int ms = this.getMau() * ps.getMau();
        PHANSO tich = new PHANSO(ts, ms);
        tich.toiGianPhanSo();
        System.out.println("Tich 2 phan so = " + tich.tu + "/" + tich.mau);
    }

    public void chia(PHANSO ps) {
        int ts = this.getTu() * ps.getMau();
        int ms = this.getMau() * ps.getTu();
        PHANSO hieu = new PHANSO(ts, ms);
        hieu.toiGianPhanSo();
        System.out.println("Hieu 2 phan so = " + hieu.tu + "/" + hieu.mau);

    }

}

public class App {
    public static void main(String[] args) {
        PHANSO ps2 = new PHANSO(4, 3);
        PHANSO ps1 = new PHANSO(2, 3);
        // System.out.println("Phan so 1 la :" + ps1.tu + "/" + ps1.mau);
        // System.out.println("Phan so 2 la : " + ps2.tu + "/" + ps2.mau);
        ps1.cong(ps2);
        ps1.tru(ps2);
        ps1.nhan(ps2);
        ps1.chia(ps2);
    }
}