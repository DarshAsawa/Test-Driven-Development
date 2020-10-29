import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void checkNumber(){
        int number = 1;

        FizzBuzzCounter fz = new FizzBuzzCounter();
        String currentCount = fz.getResult(number);

        Assert.assertEquals(1,currentCount);
    }

    public void checkFizz(){
        int number = 3;
        FizzBuzzCounter fz = new FizzBuzzCounter();
        String currentCount1 = fz.getResult(number);
        Assert.assertEquals("Fizz",currentCount1);
    }

    public void checkBuzz(){
        int number = 5;
        FizzBuzzCounter fz = new FizzBuzzCounter();
        String currentCount = fz.getResult(number);
        Assert.assertEquals("Buzz" ,currentCount);
    }

    public void checkFizzBuzz(){
        int number = 15;
        FizzBuzzCounter fz= new FizzBuzzCounter();
        String currentCount = fz.getResult(number);
        Assert.assertEquals("FizzBuzz",currentCount);

    }
}
