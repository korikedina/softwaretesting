package uni.sw.unit.testing;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UserTest {
    @Test
    public void testUserName(){
        User user=new User();
        assertNull(user.getUserName());
    }
    @Test
    public void testPassword(){
        User user=new User();
        assertNull(user.getPassword());
    }
    @Test
    public void testId(){
        User user=new User();
        assertEquals(0,user.getId());
    }
    @Test
    public void testIsLoggedIn(){
        User user=new User();
        assertThrows(UnsupportedOperationException.class, 
        user::isLoggedIn,
        "method should throw an UnsupportedOperationException");
    }
}
