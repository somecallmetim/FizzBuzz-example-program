public class FizzBuzzGame {
    public String fizzBuzz(int i) {
        boolean divisableByThree = false, divisableByFive = false;

        if(i%3 == 0) divisableByThree = true;
        if(i%5 == 0) divisableByFive = true;

        if(divisableByThree && divisableByFive) return "FizzBuzz";
        if(divisableByThree) return "Fizz";
        if(divisableByFive) return "Buzz";

        return ""+i;
    }
}
