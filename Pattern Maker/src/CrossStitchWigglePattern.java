public class CrossStitchWigglePattern extends Pattern {

    public CrossStitchWigglePattern() {
    }

    public void pattern(int col, int row) {
        SmallCrossStitch scs = new SmallCrossStitch();
        LargeCrossStitch lcs = new LargeCrossStitch();
        for (int p1td = 0; p1td < row; p1td++) {

            for (int p1t = 0; p1t < col; p1t++) {


                for (int p1 = 0; p1 < 5; p1++) {
                        scs.sew();
                        lcs.sew();
                }
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
