public class Problem3 {
    private int number;

    public Problem3(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String Prime(int n){
        if(number < 2) return "Not Prime";
        if(number == 2) return "Is Prime";
        if(number % 2 == 0) return "Not Prime";
        for(int i=3; (i*i)<=number; i+=2){ //checking prime of number
            if(number % i == 0 ) return "Not Prime";
        }
        return "Is Prime";
    }
}

