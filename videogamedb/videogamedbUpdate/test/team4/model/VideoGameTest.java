
package team4.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author keely
 */
public class VideoGameTest {
    VideoGame instance = new VideoGame(5, "Megaman", "Nintendo", "Wii", "Everyone");
    public VideoGameTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class VideoGame.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        //VideoGame instance = new VideoGame();
        
        int expResult = 5;
        int result = instance.getId();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setId method, of class VideoGame.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 5;
        //VideoGame instance = new VideoGame();
        instance.setId(id);
        
    }

    /**
     * Test of getDeveloper method, of class VideoGame.
     */
    @Test
    public void testGetDeveloper() {
        System.out.println("getDeveloper");
        //VideoGame instance = new VideoGame();
        String expResult = "Nintendo";
        String result = instance.getDeveloper();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setDeveloper method, of class VideoGame.
     */
    @Test
    public void testSetDeveloper() {
        System.out.println("setDeveloper");
        String developer = "";
        //VideoGame instance = new VideoGame();
        instance.setDeveloper(developer);
        
    }

    /**
     * Test of getName method, of class VideoGame.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        //VideoGame instance = new VideoGame();
        String expResult = "Megaman";
        String result = instance.getName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setName method, of class VideoGame.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        //VideoGame instance = new VideoGame();
        instance.setName(name);
        
    }

    /**
     * Test of getConsole method, of class VideoGame.
     */
    @Test
    public void testGetConsole() {
        System.out.println("getConsole");
        //VideoGame instance = new VideoGame();
        String expResult = "Wii";
        String result = instance.getConsole();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setConsole method, of class VideoGame.
     */
    @Test
    public void testSetConsole() {
        System.out.println("setConsole");
        String console = "";
        //VideoGame instance = new VideoGame();
        instance.setConsole(console);
       
    }

    /**
     * Test of getRating method, of class VideoGame.
     */
    @Test
    public void testGetRating() {
        System.out.println("getRating");
        //VideoGame instance = new VideoGame();
        String expResult = "Everyone";
        String result = instance.getRating();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setRating method, of class VideoGame.
     */
    @Test
    public void testSetRating() {
        System.out.println("setRating");
        String rating = "";
        //VideoGame instance = new VideoGame();
        instance.setRating(rating);
        
    }


    
}
