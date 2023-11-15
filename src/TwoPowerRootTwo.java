//√(2^√(2^√(2^√(2))))....



public class TwoPowerRootTwo {
    public static void main(String[] args) {
        int counter = 0;
        double incrementalVal = Math.sqrt(2);
        while(incrementalVal < 3) {
            incrementalVal = getVal(incrementalVal);
            counter++;
            System.out.println("counter :" + counter);
            System.out.println("Val :" + incrementalVal);
        }
    }
    public static double getVal(double incrementalVal) {
        double val = Math.sqrt(Math.pow(2,incrementalVal));
        return val;
    }
}
