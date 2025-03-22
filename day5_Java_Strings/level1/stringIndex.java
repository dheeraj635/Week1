public class stringIndex {
    public static void main(String[] args) {
        String str = "Dheeraj";
        check(str);
    }
    public static void check(String str){
        try {
            System.out.println(str.charAt(0));
            System.out.println(str.charAt(9));
        } 
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException is found ");
        }
    }
}
