import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class SILab2Test {
    private List<Item> create(Item... items){
        return new ArrayList<Item>(Arrays.asList(items));
    }

    @Test
    void checkEveryBranch() {
        RuntimeException ex;
        ex=assertThrows(RuntimeException.class, ()-> SILab2.checkCart(null,0));
        assertTrue(ex.getMessage().contains("allItems list can't be null!"));

        assertFalse(SILab2.checkCart(new ArrayList<Item>(), -1));
        assertTrue(SILab2.checkCart(new ArrayList<Item>(), 0));

        ex=assertThrows(RuntimeException.class, ()-> SILab2.checkCart(create(new Item("",null,30,0.3f)),0)); //t
        assertTrue(ex.getMessage().contains("No barcode!"));

        assertFalse(SILab2.checkCart(create(new Item("","05678",430,0.3f)),0));

        ex=assertThrows(RuntimeException.class, ()-> SILab2.checkCart(create(new Item("item123","05678c",430,0.3f)),0));
        assertTrue(ex.getMessage().contains("Invalid character in item barcode!"));

        assertFalse(SILab2.checkCart(create(new Item("item123","05678",150,-0.3f)),0));

    }

    @Test
    void checkMultipleCondition() {

        assertTrue(SILab2.checkCart(create(new Item("item123","0987",450,0.3f)),2300));

        assertFalse(SILab2.checkCart(create(new Item("item123","1987",500,0.3f)),4));

        assertFalse(SILab2.checkCart(create(new Item("item123","0987",550,-3f)),4));

        assertFalse(SILab2.checkCart(create(new Item("item123","0987",150,0.3f)),4));

    }
}