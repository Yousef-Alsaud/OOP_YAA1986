package org.howard.edu.lsp.finalexam.problem;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SongsDatabase {
    private Map<String, HashSet<String>> map = new HashMap<String, HashSet<String>>();

    public void addSong(String genre, String songTitle) {
        if (!map.containsKey(genre)) {
            map.put(genre, new HashSet<String>());
        }
        map.get(genre).add(songTitle);
    }

    public Set<String> getSongs(String genre) {
        if (map.containsKey(genre)) {
            return map.get(genre);
        }
        return new HashSet<String>();
    }

    public String getGenreOfSong(String songTitle) {
        for (Map.Entry<String, HashSet<String>> entry : map.entrySet()) {
            if (entry.getValue().contains(songTitle)) {
                return entry.getKey();
            }
        }
        return null;
    }

    /* The JUnit test cases */

    @Test
    public void testAddSong() {
        SongsDatabase db = new SongsDatabase();
        db.addSong("Rap", "Savage");
        db.addSong("Rap", "Gin and Juice");
        db.addSong("Jazz", "Always There");

        Set<String> expectedRap = new HashSet<String>();
        expectedRap.add("Savage");
        expectedRap.add("Gin and Juice");
        assertEquals(expectedRap, db.getSongs("Rap"));

        Set<String> expectedJazz = new HashSet<String>();
        expectedJazz.add("Always There");
        assertEquals(expectedJazz, db.getSongs("Jazz"));
    }

    @Test
    public void testGetSongs() {
        SongsDatabase db = new SongsDatabase();
        db.addSong("Rap", "Savage");
        db.addSong("Rap", "Gin and Juice");
        db.addSong("Jazz", "Always There");

        Set<String> expectedRap = new HashSet<String>();
        expectedRap.add("Savage");
        expectedRap.add("Gin and Juice");
        assertEquals(expectedRap, db.getSongs("Rap"));

        Set<String> expectedJazz = new HashSet<String>();
        expectedJazz.add("Always There");
        assertEquals(expectedJazz, db.getSongs("Jazz"));

        Set<String> expectedEmpty = new HashSet<String>();
        assertEquals(expectedEmpty, db.getSongs("Pop"));
    }

    @Test
    public void testGetGenreOfSong() {
        SongsDatabase db = new SongsDatabase();
        db.addSong("Rap", "Savage");
        db.addSong("Rap", "Gin and Juice");
        db.addSong("Jazz", "Always There");

        assertEquals("Rap", db.getGenreOfSong("Savage"));
        assertEquals("Jazz", db.getGenreOfSong("Always There"));
        assertNull(db.getGenreOfSong("Stairway to Heaven"));
    }
}
