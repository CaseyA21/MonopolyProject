import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PropertyElementTests {

    /**
     * Test method for testing compiler.
     * @author Mael Tshiyonga
     */
    @Test
    public void testNothing() {

    }

    /**
     * Test method for testing the constructor of the PropertyElement class.
     * @author Mael Tshiyonga
     */
    @Test
    public void testPropertyElement() {
        PropertyElement propertyElement = new PropertyElement("Moravian University", 50, 20);
        assertEquals("Moravian University", propertyElement.getName());
    }

    /**
     * Test method for testing the getPrice method in the PropertyElement class.
     * @author Mael Tshiyonga
     */
    @Test
    public void testGetPrice() {
        PropertyElement propertyElement = new PropertyElement("Moravian University", 50, 20);
        assertEquals(50, propertyElement.getPrice());
    }

    /**
     * Test method for testing the getRent method in the PropertyElement class.
     * @author Mael Tshiyonga
     */
    @Test
    public void testGetRent() {
        PropertyElement propertyElement = new PropertyElement("Moravian University", 50, 20);
        assertEquals(20, propertyElement.getRent());
    }

    /**
     * Test method for testing the getOwner method in the PropertyElement class.
     * @author Mael Tshiyonga
     */
    @Test
    public void testGetOwner() {
        PropertyElement propertyElement = new PropertyElement("Moravian University", 50, 20);
        assertNull(propertyElement.getOwner());
    }

    /**
     * Test method for testing the setOwner method in the PropertyElement class.
     * @author Mael Tshiyonga
     */
    @Test
    public void testSetOwner() {
        PropertyElement propertyElement = new PropertyElement("Moravian University", 50, 20);
        Player player = new Player("Mael");
        propertyElement.setOwner(player);
        assertEquals(player, propertyElement.getOwner());
    }

    /**
     * Test method for testing the triggerAction method in the PropertyElement class.
     * @author Mael Tshiyonga
     */
    @Test
    public void testTriggerAction() {
        PropertyElement propertyElement = new PropertyElement("Moravian University", 50, 20);
        Player player = new Player("Mael");
        propertyElement.triggerAction(player);
    }

}
