public class App {
    public static void main(String[] args) throws Exception {
        StringBuffer strBuf = new StringBuffer();
        strBuf.append("    Bảng cửu chương" + '\n');
        strBuf.append("    ----------------" + '\n');
        strBuf.append("  | ");
        for (int i = 1; i <= 9; i++) {
            strBuf.append("  " + i + " | ");
        }
        strBuf.append('\n');
        for (int i = 1; i <= 9; i++) {
            strBuf.append("  | ");
            for (int j = 1; j <= 9; j++) {
                if (i * j < 10) {
                    strBuf.append("  " + i * j + " | ");
                } else {
                    strBuf.append(" " + i * j + " | ");
                }
            }
            strBuf.append('\n');
        }
        System.out.println(strBuf);
    }
}
