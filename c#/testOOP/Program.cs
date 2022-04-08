using QuanLyNhanVien;


namespace test
{
  class Program
  {
    static void Main(string[] args)
    {
      NhanVien a = new NhanVienThuNgan("Nguyen Van A", 20, "HN", "0123456789", "Thu Ngân", 100000, 1000000);
      a.lamViec();
    }
  }
}