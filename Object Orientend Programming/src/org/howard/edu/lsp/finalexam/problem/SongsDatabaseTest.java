package org.howard.edu.lsp.finalexam.problem;
 
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Set;

	public class SongsDatabaseTest {
	    
	    @Test
	    public void testAddSong() {
	        SongsDatabase db = new SongsDatabase();
	        db.addSong("Rap", "Savage");
	        db.addSong("Rap", "Gin and Juice");
	        db.addSong("Jazz", "Always There");
	        Set<String> rapSongs = db.getSongs("Rap");
	        assertTrue(rapSongs.contains("Savage"));
	        assertTrue(rapSongs.contains("Gin and Juice"));
	        Set<String> jazzSongs = db.getSongs("Jazz");
	        assertTrue(jazzSongs.contains("Always There"));
	    }
	    
	    @Test
	    public void testGetSongs() {
	        SongsDatabase db = new SongsDatabase();
	        db.addSong("Rap", "Savage");
	        db.addSong("Rap", "Gin and Juice");
	        db.addSong("Jazz", "Always There");
	        Set<String> rapSongs = db.getSongs("Rap");
	        assertEquals(2, rapSongs.size());
	        Set<String> jazzSongs = db.getSongs("Jazz");
	        assertEquals(1, jazzSongs.size());
	    }
	    
	    @Test
	    public void testGetGenreOfSong() {
	        SongsDatabase db = new SongsDatabase();
	        db.addSong("Rap", "Savage");
	        db.addSong("Rap", "Gin and Juice");
	        db.addSong("Jazz", "Always There");
	        assertEquals("Rap", db.getGenreOfSong("Savage"));
	        assertEquals("Jazz", db.getGenreOfSong("Always There"));
	    }
	}
