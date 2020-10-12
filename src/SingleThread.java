public class SingleThread {

    public static void main(String[] args) {

        int result = 1/0;

        try{
            System.out.println(result);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}
