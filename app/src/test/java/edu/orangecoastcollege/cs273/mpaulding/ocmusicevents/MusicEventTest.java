package edu.orangecoastcollege.cs273.mpaulding.ocmusicevents;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.*;

/**
 * Created by rbarron11 on 11/22/2016.
 */
public class MusicEventTest {

    private MusicEvent mMusicEvent;
    @Before
    public void setUp() throws Exception {

        mMusicEvent = new MusicEvent();
        mMusicEvent.setTitle("Test Title");
        mMusicEvent.setTime("12:00");
        mMusicEvent.setAddress1("Here");
        mMusicEvent.setAddress2("There");
        mMusicEvent.setDate("Now");
        mMusicEvent.setDay("Today");
        mMusicEvent.setImageName("Image");
        mMusicEvent.setLocation("0");


    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void getTitle() throws Exception {

        //assertEquals("You done goofed.", null, mMusicEvent.getTitle());
        //assertNull("Expected the title to be NULL", mMusicEvent.getTitle());
        assertEquals("Test Title", mMusicEvent.getTitle());

    }

    @Test
    public void getDate() throws Exception {
        assertEquals("Now", mMusicEvent.getDate());
    }


    @Test
    public void getDay() throws Exception {
        assertEquals("Today", mMusicEvent.getDay());
    }

    @Test
    public void getTime() throws Exception {
        assertEquals("12:00", mMusicEvent.getTime());
    }

    @Test
    public void getLocation() throws Exception {
        assertEquals("0", mMusicEvent.getLocation());
    }

    @Test
    public void getAddress1() throws Exception {
        assertEquals("Here", mMusicEvent.getAddress1());
    }

    @Test
    public void getAddress2() throws Exception {
        assertEquals("There", mMusicEvent.getAddress2());
    }

    @Test
    public void getImageName() throws Exception {
        assertEquals("Image",  mMusicEvent.getImageName());
        //omg
    }

}