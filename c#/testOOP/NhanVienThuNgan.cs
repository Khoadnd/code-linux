
namespace QuanLyNhanVien
{
  class NhanVienThuNgan : NhanVien
  {
    private int soTienThu;
    public NhanVienThuNgan() : base()
    {
      soTienThu = 0;
    }
    public NhanVienThuNgan(String ten, int tuoi, String diaChi, String sdt, String chucVu, int luong, int soTienThu) : base(ten, tuoi, diaChi, sdt, chucVu, luong)
    {
      this.soTienThu = soTienThu;
    }
    public void setSoTienThu(int soTienThu)
    {
      this.soTienThu = soTienThu;
    }
    public int getSoTienThu()
    {
      return this.soTienThu;
    }
    public override void lamViec()
    {
      Console.WriteLine(this.ten + " làm việc thu tiền");
    }
  }
}