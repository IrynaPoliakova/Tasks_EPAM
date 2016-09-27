package ua.epam;

import org.junit.Test;
import org.omg.PortableInterceptor.Interceptor;

import static org.junit.Assert.*;

/**
 * Created by Iryna_Poliakova on 9/27/2016.
 */
public class OrderedPairTest {

    @Test
    public void testOrdered(){
        Integer first = 3;
        Integer second = 4;
        OrderedPair<Integer> pair = new OrderedPair<>(first,second);
        assertSame("first element failed: ", first, pair.getFirst());
        assertSame("second element failed: ", second, pair.getSecond());
    }

    @Test
    public void testNotOrdered(){
        Integer first = 4;
        Integer second = 3;
        OrderedPair<Integer> pair = new OrderedPair<>(first,second);
        assertSame("first element failed: ", second, pair.getFirst());
        assertSame("second element failed: ", first, pair.getSecond());
    }

    @Test
    public void testSetFirstNull(){
        OrderedPair<String> pair = new OrderedPair<>();
        pair.setFirst(null);
    }

    @Test
    public void testSetFirst(){
        OrderedPair<String> pair = new OrderedPair<>();
        String first = "aab";
        pair.setFirst(first);
        assertSame("first element failed: ", first, pair.getFirst());
        String second = "aaa";
        pair.setSecond(second);
        assertSame("first element failed: ", second, pair.getFirst());
        assertSame("second element failed: ", first, pair.getSecond());
    }

    @Test
    public void testSet(){
        String first = "aab";
        String second = "aaa";
        OrderedPair<String> pair = new OrderedPair<>(first,second);
        pair.set(null, second);
        assertSame("setting null failed", null, pair.getFirst());
    }


}