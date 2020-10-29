public class FizzBuzzCounter {
    public String getResult(int number) {
        String result = null;
        if (number > 0) {
            if (number % 3 == 0) {
                if (number % 5 == 0) {
                    result = "FizzBuzz";
                } else
                    result = "Fizz";
            } else if (number % 5 == 0) {
                result = "Buzz";
            } else
                result = Integer.toString(number);
        }
        return result;
    }
}
