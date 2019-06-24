public class BaublePattern extends Pattern {
    public BaublePattern() {
    }

    public void pattern(int col, int row) {
        ShortLineStitch sls = new ShortLineStitch();
        CircleStitch cs = new CircleStitch();

        for (int p3td = 0; p3td < row; p3td++) {
            for (int p3t = 0; p3t < col; p3t++) {

                for (int p3 = 0; p3 < 5; p3++) {
                    sls.sew();
                    sls.sew();
                    cs.sew();
                }
                System.out.print(" ");
            }
            System.out.print(" ");

        }
    }
}