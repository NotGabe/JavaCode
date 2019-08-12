public class MaxFinderTest
{
    public static void main(String [] args)
    {
        MaxFinder MaxNum = new MaxFinder();
        MaxNum.determineMax();
       //uses MaxFinder object

    }

    public double maximumAlternate(double x, double y, double z) {
        return Math.max(x, Math.max(y, z));
    }

}
