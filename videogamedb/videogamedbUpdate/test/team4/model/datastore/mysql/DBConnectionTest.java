
package team4.model.datastore.mysql;

import java.sql.Connection;
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
public class DBConnectionTest {
    
    public DBConnectionTest() {
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
     * Test of getConnection method, of class DBConnection.
     */
    @Test
    public void testGetConnection() {
        System.out.println("getConnection");
        Connection TVG = DBConnection.getConnection();
        Connection expResult = TVG;
        Connection result = TVG;
        assertEquals(expResult, result);
 
    }

    /**
     * Test of main method, of class DBConnection.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        DBConnection.main(args);
      
    }
    
}
