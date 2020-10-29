import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void checkNumber(){
        int number = 1;

        FizzBuzzCounter fz = new FizzBuzzCounter();
        String currentCount = fz.getResult(number);

        Assert.assertEquals("1",currentCount);
    }

    @Test
    public void checkFizz(){
        int number = 3;
        FizzBuzzCounter fz = new FizzBuzzCounter();
        String currentCount1 = fz.getResult(number);
        Assert.assertEquals("Fizz",currentCount1);
    }

    @Test
    public void checkBuzz(){
        int number = 5;
        FizzBuzzCounter fz = new FizzBuzzCounter();
        String currentCount = fz.getResult(number);
        Assert.assertEquals("Buzz" ,currentCount);
    }

    @Test
    public void checkFizzBuzz(){
        int number = 15;
        FizzBuzzCounter fz= new FizzBuzzCounter();
        String currentCount = fz.getResult(number);
        Assert.assertEquals("FizzBuzz",currentCount);
    }

    @Test
    public void checkInvalidNumber(){
        int number = 0;
        FizzBuzzCounter fz= new FizzBuzzCounter();
        String currentCount = fz.getResult(number);
        Assert.assertEquals("",currentCount);
    }
}
