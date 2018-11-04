import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {

    @Test
    public void twoSum_CheckFindSum(){

        TwoSum sum = new TwoSum();

        int[] arrayTest = {2, 5, 80, 6};
        int[] expected = {0,3};
        Assert.assertArrayEquals(expected, sum.find(arrayTest, 8));

    }

    @Test(expected = IllegalStateException.class)
    public void twoSum_arrayEmpty(){

        TwoSum sum = new TwoSum();
        int[] arrayTest = {};
        sum.find(arrayTest, 8);
    }

}
