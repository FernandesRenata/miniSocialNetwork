import java.util.List;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    
        int userId = 1;
        String username;

        HashMap<Integer, User> users = new HashMap<>();
        
        Scanner scanner = new Scanner(System.in);

        while(true){
          
            String command = scanner.nextLine();
            String[] parts = command.split(" ");

            if(parts[0].equals("END")){
                break;
            }else if(parts[0].equals("ADD_USER")){
                 username = parts[1];

                 User user = new User(username, userId);
                 
                 users.put(userId, user);

                 userId++;

            }

        }
        

    }

}
