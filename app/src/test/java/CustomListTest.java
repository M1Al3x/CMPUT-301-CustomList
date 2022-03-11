import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    @BeforeAll
    public void createList(){
        list = new CustomList(null, new ArrayList<>());
    }

    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Halifax", "NS"));
        assertEquals(list.getCount(), listSize+1);
    }
}
