import java.util.Scanner;

import com.iphone.model.IPhone;

public class Main {
    private static int phoneOption = 1;
    private static int webBrowserOption = 2;
    private static int musicPlayerOption = 3;

    private static String phone = "Phone";
    private static String webBrowser = "Web browser";
    private static String musicPlayer = "Music player";

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, welcome to iPhone!");
        int selectedApp = selectedApp(scanner);

        while (selectedApp == 0)
            selectedApp = selectedApp(scanner);

        String selectedAppFunction = selectedAppFunction(scanner, selectedApp);
        
        while (selectedAppFunction == "")
            selectedAppFunction = selectedAppFunction(scanner, selectedApp);

        IPhone iPhone = new IPhone();

        if (selectedAppFunction == "call") {
            System.out.println("Insert a phone number to call");
            String phoneToCall = scanner.next();
            iPhone.call(phoneToCall);
        }
        else if (selectedAppFunction == "goTo") {
            System.out.println("Insert a URL to go");
            String url = scanner.next();
            iPhone.goTo(url);
        }
        else if (selectedAppFunction == "selectMusic") {
            System.out.println("Type a music name to select");
            String music = scanner.next();
            iPhone.selectMusic(music);
        }
        else if (selectedAppFunction == "play") {
            iPhone.play();
        }
        else if (selectedAppFunction == "pause") {
            iPhone.pause();
        }
        else if (selectedAppFunction == "newTab") {
            iPhone.newTab();
        }
        else if (selectedAppFunction == "refreshPage") {
            iPhone.refreshPage();
        }
        else if (selectedAppFunction == "answer") {
            iPhone.answer();
        }
        else if (selectedAppFunction == "startVoiceMail") {
            iPhone.startVoiceMail();
        }

        scanner.close();
    }

    public static int selectedApp(Scanner scanner) {
        int selectedApp;
        String msg;
        String invalidAppMsg = "Invalid app";

        System.out.println("Please select an app to start:");
        System.out.println(phoneOption + ". " + phone);
        System.out.println(webBrowserOption + ". " + webBrowser);
        System.out.println(musicPlayerOption + ". " + musicPlayer);
        
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

        msg = selectedApp == phoneOption ? phone : selectedApp == webBrowserOption ? webBrowser : musicPlayer;
        msg += " app was selected";

        System.out.println(msg);
        return selectedApp;
    }

    public static String selectedAppFunction(Scanner scanner, int app) {
        int selectedOption;
        String msg;
        String invalidOptionMsg = "Invalid operation";
        String firstOption = "";
        String secondOption = "";
        String thirdOption = "";

        System.out.println("Please choose a operation:");

        if (app == phoneOption) {
            firstOption = "answer";
            secondOption = "startVoiceMail";
            thirdOption = "call";
        }
        else if (app == webBrowserOption) {
            firstOption = "newTab";
            secondOption = "refreshPage";
            thirdOption = "goTo";
        }
        else if (app == musicPlayerOption) {
            firstOption = "play";
            secondOption = "pause";
            thirdOption = "selectMusic";
        }
        else {
            System.out.println(invalidOptionMsg);
            return "";
        }

        System.out.println("1. " + firstOption);
        System.out.println("2. " + secondOption);
        System.out.println("3. " + thirdOption);
        
        String typedOption = scanner.next();
        
        try {
            Integer.parseInt(typedOption);
        }
        catch(Exception ex) {
            System.out.println(invalidOptionMsg);
            return "";
        }

        selectedOption = Integer.parseInt(typedOption);

        if (selectedOption < 1 || selectedOption > 3) {
            System.out.println(invalidOptionMsg);
            return "";
        }       

        msg = selectedOption == 1 ? firstOption : selectedOption == 2 ? secondOption : thirdOption;
        msg += " operation was selected";

        String selectedAppFunction = selectedOption == 1 ? firstOption : selectedOption == 2 ? secondOption : thirdOption;

        System.out.println(msg);
        return selectedAppFunction;
    }
}
