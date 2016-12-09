package team4.viewui;

import team4.util.Validator;
import java.util.Scanner;

import team4.model.VideoGame;
import team4.model.datastore.mysql.VideoGameDAO;
import team4.model.IVideoGameDAO;

/**
 *
 * @author Team Four
 * @version 201610
 *
 */
public class VideoGameApp {

    IVideoGameDAO videogameList = new VideoGameDAO();
    Scanner sc = new Scanner(System.in);

    public VideoGameApp() {
        menuLoop();
    }

    private void menuLoop() {
        int id;
        String name, developer, console = null, rating = null;
        String choice = "1";
        while (!choice.equals("0")) {
            System.out.println("\nVideogame App");
            System.out.println("0 = Quit");
            System.out.println("1 = List All Records");
            System.out.println("2 = Create New Record");
            System.out.println("3 = Retrieve Record by ID");
            System.out.println("4 = Update Record");
            System.out.println("5 = Delete Record");
            System.out.println("6 = Retrieve Record by Name");
            System.out.println("7 = Retrieve Record by Console");
            System.out.println("8 = Retrieve Record by Rating");
            System.out.println("9 = Retrieve Record by Developer");
            System.out.println("10 = List All Records Decending");
            choice = Validator.getLine(sc, "Number of choice: ", "^\\d+$");

            switch (choice) {
                case "1":
                    System.out.println(videogameList.toString());
                    break;
                case "2":
                    id = Validator.getInt(sc, "New game ID: ");
                    name = Validator.getLine(sc, "Name: ");
                    developer = Validator.getLine(sc, "Developer: ");
                    console = Validator.getLine(sc, "Console: ");
                    rating = Validator.getLine(sc, "Rating: ");
                    videogameList.createRecord(new VideoGame(id, name, developer, console, rating));
                    break;
                case "3":
                    id = Validator.getInt(sc, "Game id to retrieve: ");
                    System.out.println(videogameList.retrieveRecordById(id));
                    break;
                case "4":
                    id = Validator.getInt(sc, "Videogame ID to update: ");
                    name = Validator.getLine(sc, "Name: ");
                    developer = Validator.getLine(sc, "Developer: ");
                    console = Validator.getLine(sc, "Console: ");
                    rating = Validator.getLine(sc, "Rating: ");
                    videogameList.updateRecord(new VideoGame(id, name, developer, console, rating));
                    break;
                case "5":
                    id = Validator.getInt(sc, "Game ID to delete: ");
                    System.out.println(videogameList.retrieveRecordById(id));
                    String ok = Validator.getLine(sc, "Delete this record? (y/n) ", "^[yYnN]$");
                    if (ok.equalsIgnoreCase("Y")) {
                        videogameList.deleteRecord(id);
                    }
                    break;
                case "6":
                    name = Validator.getLine(sc, "Game Name to retrieve: ");
                    System.out.println(videogameList.retrieveRecordByName(name));
                    break;
                case "7":
                    console = Validator.getLine(sc, "Game Console to retrieve: ");
                    System.out.println(videogameList.retrieveRecordByConsole(console));
                    break;
                case "8":
                    rating = Validator.getLine(sc, "Game Rating to retrieve: ");
                    System.out.println(videogameList.retrieveRecordByRating(rating));
                    break;
                case "9":
                    developer = Validator.getLine(sc, "Game developer to retrieve: ");
                    System.out.println(videogameList.retrieveRecordByDeveloper(developer));
                    break;
                case "10":
                    System.out.println(videogameList.retrieveAllRecordsDec());
                    break;        
        }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new VideoGameApp();
    }
}
