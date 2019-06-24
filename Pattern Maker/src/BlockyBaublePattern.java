public class BlockyBaublePattern extends Pattern {

    public BlockyBaublePattern() {
    }

    public void pattern(int col, int row) {
        BlockStitch bs = new BlockStitch();
        ShortLineStitch sls = new ShortLineStitch();
        CircleStitch cs = new CircleStitch();

        for (int p4td = 0; p4td < row; p4td++) {
            for (int p4t = 0; p4t < col; p4t++) {

                for (int p4 = 0; p4 < 1; p4++) {

                    bs.sew();
                    sls.sew();
                    sls.sew();
                    cs.sew();
                    sls.sew();
                    sls.sew();
                    bs.sew();

                }
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
