package team4.model;

import java.util.List;

/**
 *
 * @author Team Four
 * @version 201610
 *
 */
public interface IVideoGameDAO {

    /**
     *This creates the VideoGame record.
     * @param videogame
     */
    void createRecord(VideoGame videogame);

    /**
     *This  creates the VideoGame ID.
     * @param id
     * @return
     */
    VideoGame retrieveRecordById(int id);
    
    /**
     *This creates the VideoGame Name.
     * @param name
     * @return
     */
    VideoGame retrieveRecordByName(String name);
    
    /**
     *This creates the VideoGame Console.
     * @param console
     * @return
     */
    VideoGame retrieveRecordByConsole(String console);
    
    /**
     *This creates the VideoGame Rating.
     * @param rating
     * @return
     */
    VideoGame retrieveRecordByRating(String rating);
    
    /**
     *This creates the VideoGame retrieveRecordByDeveloper.
     * @param developer
     * @return
     */
    VideoGame retrieveRecordByDeveloper(String developer);
    
    /**
     *This creates the VideoGame retrieveAllRecords.
     * @return
     */
    List<VideoGame> retrieveAllRecords();
    
    /**
     *This creates the VideoGame retrieveAllRecords in Decending.
     * @return
     */
    List<VideoGame> retrieveAllRecordsDec();

    /**
     *This creates the VideoGame updateRecords
     * @param updatedVideoGame
     */
    void updateRecord(VideoGame updatedVideoGame);

    /**
     *This creates the VideoGame deleateRecord.
     * @param id
     */
    void deleteRecord(int id);

    /**
     *
     * @param videogame
     */
    void deleteRecord(VideoGame videogame);



}
