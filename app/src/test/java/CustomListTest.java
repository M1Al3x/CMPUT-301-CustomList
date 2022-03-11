import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
        list.addCity(new City("Halifax", "NS"));
        City cityToTest = new City("Halifax", "NS");
        ArrayList<City> cities = list.getCities();
        Boolean hasCity = false;
        for(int i=0;i<cities.size();i++){
            City city = cities.get(i);
            if(city == cityToTest){
                hasCity = true;
            }
        }
        assertNotEquals(hasCity, true);
    }
}
