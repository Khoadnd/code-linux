
namespace QuanLyNhanVien
{
  abstract class NhanVien
  {
    protected String ten;
    protected int tuoi;
    protected String diaChi;
    protected String sdt;
    protected String chucVu;
    protected int luong;
    public NhanVien()
    {
      ten = "";
      tuoi = 0;
      diaChi = "";
      sdt = "";
      chucVu = "";
      luong = 0;
    }
    public NhanVien(String ten, int tuoi, String diaChi, String sdt, String chucVu, int luong)
    {
      this.ten = ten;
      this.tuoi = tuoi;
      this.diaChi = diaChi;
      this.sdt = sdt;
      this.chucVu = chucVu;
      this.luong = luong;
    }
    public void setTen(String ten)
    {
      this.ten = ten;
    }
    public String getTen()
    {
      return this.ten;
    }
    public void setTuoi(int tuoi)
    {
      this.tuoi = tuoi;
    }
    public int getTuoi()
    {
      return this.tuoi;
    }
    public virtual void lamViec()
    {
      Console.WriteLine(this.ten + " làm việc");
    }
  }
}