public class App {
    public static void main(String[] args) throws Exception {
        PhanSo phanSo1 = new PhanSo();
        phanSo1.Nhap();
        PhanSo phanSo2 = new PhanSo(1, 2);
        PhanSo ketQua = phanSo1.Cong(phanSo2);
        ketQua.Xuat();
    }
}
