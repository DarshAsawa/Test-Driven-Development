public class FizzBuzzCounter {
    public String getResult(int number) {
        String result = null;
        if (number > 0) {
            if (number % 3 == 0) {
                if (number % 5 == 0) {
                    result = "FizzBuzz";
                } else{
                    result = "Fizz";
                }
            } else if (number % 5 == 0) {
                result = "Buzz";
            }
            else {
                result = Integer.toString(number);
                if(result.contains("3")){
                    result = "Fizz";
                }
                else
                    if(result.contains("5")){
                        result = "Buzz";
                    }
            }
            return result;
        }
        else
            throw new NullPointerException("Not a valid number");
    }
    public static void main(String[] args){
        FizzBuzzCounter fz = new FizzBuzzCounter();
        int start = 1;
        int end = 100;
        for(int i=start;i<=end;i++){
            String number = fz.getResult(i);
            System.out.println(number);
        }
    }
}
