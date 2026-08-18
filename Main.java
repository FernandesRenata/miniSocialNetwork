import java.util.HashMap;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    
        String username;

        HashMap<String, User> users = new HashMap<>();

        
        Scanner scanner = new Scanner(System.in);

        while(true){
          
            String command = scanner.nextLine();
            String[] parts = command.split(" ");
            
            switch(parts[0]){
                case "END":
                    break;

                case "ADD_USER":
                 username = parts[1];
                 User user = new User(username);
                 
                 users.put(username, user);

                case "FIND_USERNAME":
                 username = parts[1];

                 users.get(username);
                

            }
            
        }
        

    }

}
