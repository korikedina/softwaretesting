package uni.sw.unit.testing;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyBoolean;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

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
    @Test
    public void testGetters(){
        User user=mock(User.class);
        when(user.getId()).thenReturn(1);
        when(user.getUserName()).thenReturn("TesztElek");
        when(user.getPassword()).thenReturn("pwd");
        when(user.isLoggedIn()).thenReturn(true);
        
        assertEquals(user.getId(), 1, "ID should be 1");
        assertEquals(user.getUserName(), "TesztElek", "Username should be TesztElek");
        assertEquals(user.getPassword(), "pwd", "Password should be pwd");
        assertEquals(3, user.getPassword().length());
        assertTrue(user.isLoggedIn(), "LoggedIn should be true");

        doThrow(new UnsupportedOperationException()).when(user).isLoggedIn();
        assertThrows(UnsupportedOperationException.class, user::isLoggedIn, "method should throw UnsupportedOperationException");

        when(user.getAcademicAverage(anyInt())).thenReturn(4.6);
        assertEquals(4.6, user.getAcademicAverage(2));
        assertEquals(4.6, user.getAcademicAverage(3));

        verify(user).getId();
        verify(user).getUserName();
        verify(user, times(2)).getPassword();
        verify(user, times(2)).isLoggedIn();
        verify(user).getAcademicAverage(2);
        verify(user).getAcademicAverage(3);
    }

    @Test
    public void updateTest(){
        User user=mock(User.class);
        

        when(user.update(anyString(), anyBoolean())).thenReturn(user);
        assertEquals(user, user.update("sanyi", false), "method should return user");
        verify(user).update("sanyi", false);

        doThrow(new UnsupportedOperationException()).when(user).update(anyString(), anyBoolean());
                assertThrows(UnsupportedOperationException.class, () -> {
                    user.update(anyString(), anyBoolean());
                }, "method should throw UnsupportedOperationException");
            }
}
