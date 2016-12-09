package team4.model;

/**
 * @author Team Four
 * @version 201610
 *
 */
public class VideoGame {

    private int id;
    private String name;
    private String developer;
    private String console;
    private String rating;

    /**
     *This is the defult constracter.
     */
    public VideoGame() {
        id = 0;
        name = "";
        developer = "";
        console = "";
        rating = "";
    }

    /**
     *This constructor recieves all paramaters.
     * @param id
     * @param name
     * @param developer
     * @param console
     * @param rating
     */
    public VideoGame(int id, String name, String developer, String console, String rating) {
        this.id = id;
        this.name = name;
        this.developer = developer;
        this.console = console;
        this.rating = rating;
    }

    VideoGame(String megaman, String nintendo, String wii, String everyone) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *This method returns the ID
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     *This method sets the ID.
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *This method returns the Developer
     * @return
     */
    public String getDeveloper() {
        return developer;
    }

    /**
     *This method sets the Developer
     * @param developer
     */
    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    /**
     *This method returns the Name.
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *This method sets the Name.
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *This method returns the Console.
     * @return
     */
    public String getConsole() {
        return console;
    }

    /**
     *This method sets the Console.
     * @param console
     */
    public void setConsole(String console) {
        this.console = console;
    }

    /**
     *This method returns the Rating.
     * @return
     */
    public String getRating() {
        return rating;
    }

    /**
     *This method sets the Rating.
     * @param rating
     */
    public void setRating(String rating) {
        this.rating = rating;
    }

    /**
     *This method Sets the format.
     * @return
     */
    @Override
    public String toString() {
        return String.format("%5d, %s, %s, %s, %s", this.getId(), this.getName(),
                this.getDeveloper(), this.getConsole(), this.getRating());
    }
}
