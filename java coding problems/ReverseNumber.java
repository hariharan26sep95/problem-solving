class ReverseNumber {
    public static void main(String[] args) {
        Integer number = 6789;
        Integer remainder;
        Integer reverse = 0;
        
        while (true) {
            remainder = number % 10; //last digit
            number = number / 10;
            reverse = reverse * 10 + remainder;
            
            if (number == 0) {
                break;
            }
        }
        
        System.out.println(reverse);
    }