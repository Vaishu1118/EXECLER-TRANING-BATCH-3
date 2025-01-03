public class demo7 {
    public static void main(String[] args) {
        String username = "user001";
        String pwd = "user_001";
        for (; username.equals("user001") && pwd.equals("user_001");) {
            System.out.println("Hello user, Happy New Year");
            break;
        }
    }
}
