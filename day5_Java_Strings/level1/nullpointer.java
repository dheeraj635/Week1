public class nullpointer {
    public static void main(String[] args) {
        String str = null;
        check(str);
    }
    public static void check(String str){
        try{
            if (str.equals("abs")){
                System.out.println("Same String");
            }
            else{
                System.out.println("Not the same String");
            }
        }
        catch(NullPointerException e){
            System.out.println("NullPointerException has been found");
        }
    }
}
