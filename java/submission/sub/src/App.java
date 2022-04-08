import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Hocjava HJV = new Hocjava();
    Scanner o = new Scanner(System.in);
    int chon = 0;
    do {
      System.out.println("1:NHAP");
      System.out.println("2:XUAT");
      System.out.println("0:THOAT");
      chon = Integer.parseInt(o.nextLine());
      switch (chon) {
        case 1: {
          HJV.nhap();
          break;
        }
        case 2: {
          if (HJV.isEmpty()) {
            System.out.println("Danh sach rong");
            break;
          }
          HJV.xuat();
          break;
        }
        case 0: {
          break;
        }
        default:
          throw new IllegalArgumentException("Unexpected value: " + chon);
      }
    } while (chon != 0);
  }
}
