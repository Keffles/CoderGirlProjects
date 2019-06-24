public class ZigZagLinesPattern extends Pattern {
    public ZigZagLinesPattern() {
    }

    public void pattern(int col, int row) {
        ZigZagStitch zz = new ZigZagStitch();
        FillStitch fs = new FillStitch();

        for (int p2td = 0; p2td < row; p2td++) {
            for (int p2t = 0; p2t < col; p2t++) {

                for (int p2 = 0; p2 < 2; p2++) {
                    zz.sew();
                    zz.sew();
                    zz.sew();
                    fs.sew();
                    fs.sew();
                    fs.sew();
                }
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}




