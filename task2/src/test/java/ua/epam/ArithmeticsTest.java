package ua.epam;

import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

/**
 * Created by Iryna_Poliakova on 9/23/2016.
 */
public class ArithmeticsTest {
    private static Arithmetics a;

    @Rule
    public final ExpectedException exp = ExpectedException.none();

    @Rule
    public Timeout time = new Timeout(1000);

    @BeforeClass
    public static  void runT(){
        a = new Arithmetics();
    }

    @AfterClass
    public static void afterRunT(){
        a = null;
    }

    @Test
    public void add() throws Exception {
        double res = a.add(3, 3);
        if (res != 6.0){
            Assert.fail();
        }
    }

    @Test
    public void deduct() throws Exception {
        Arithmetics a = new Arithmetics();
        double res = a.deduct(6, 3);
        if (res != 3.0){
            Assert.fail();
        }
    }

    @Test
    public void mult() throws Exception {
        Arithmetics a = new Arithmetics();
        double res = a.mult(3, 3);
        Assert.assertTrue(res == 9.0);
    }

    @Ignore
    @Test
    public void div() throws Exception {
        Arithmetics a = new Arithmetics();
        double res = a.div(6, 3);
        if (res != 2.0){
            Assert.fail();
        }
    }

    //@Test(expected=ArithmeticException.class)
    @Test
    public void testDivExeption() {
        exp.expect(ArithmeticException.class);
        a.div(10.0, 0.0);
    }

    //@Test(timeout = 1000)
    @Test
    public void testN(){
        a.div(10.0,2.0);
    }

}