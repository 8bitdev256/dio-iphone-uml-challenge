import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, welcome to iPhone!");
        int selectedApp = selectedApp(scanner);

        while (selectedApp == 0)
            selectedApp = selectedApp(scanner);

        System.out.println("Hi, welcome to iPhone!");
        scanner.close();
    }

    public static int selectedApp(Scanner scanner) {
        int selectedApp;
        String msg;
        String phone = "Phone";
        String webBrowser = "Web browser";
        String musicPlayer = "Music player";
        String invalidAppMsg = "Invalid app";
        

        System.out.println("Please select an app to start:");
        System.out.println("1. " + phone);
        System.out.println("2. " + webBrowser);
        System.out.println("3. " + musicPlayer);
        
        String typedOption = scanner.next();
        

        try {
            Integer.parseInt(typedOption);
        }
        catch(Exception ex) {
            System.out.println(invalidAppMsg);
            return 0;
        }

        selectedApp = Integer.parseInt(typedOption);

        if (selectedApp < 1 || selectedApp > 3) {
            System.out.println(invalidAppMsg);
            return 0;
        }       

        msg = selectedApp == 1 ? phone : selectedApp == 2 ? webBrowser : musicPlayer;
        msg += " app was selected";

        System.out.println(msg);
        return selectedApp;
    }
}
