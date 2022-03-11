import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import android.util.Log;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    @BeforeEach
    public void createList(){
        list = new CustomList(null, new ArrayList<>());
    }

    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Halifax", "NS"));
        assertEquals(list.getCount(), listSize+1);
    }

    @Test
    public void hasCity(){
        City cityToTest = new City("Halifax", "NS");
        list.addCity(cityToTest);
        boolean hasCity = list.hasCity(cityToTest);
        assertEquals(true, hasCity);
    }

    @Test
    public void deleteCity(){
        City cityToTest = new City("Halifax", "NS");
        list.addCity(cityToTest);
        list.deleteCity(cityToTest);
        boolean hasCity = list.hasCity(cityToTest);
        assertEquals(false, hasCity);
    }

}
