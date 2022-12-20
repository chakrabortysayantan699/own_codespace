import java.security.SecureRandom;

public class test{

    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int num = random.nextInt(100000);
        String formatted = String.format("%05d", num); 
        int getid=Integer.parseInt(formatted);
        System.out.println(getid);
    }
}

