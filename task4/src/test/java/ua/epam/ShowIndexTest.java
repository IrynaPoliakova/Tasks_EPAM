package ua.epam;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

/**
 * Created by Iryna_Poliakova on 9/23/2016.
 */
public class ShowIndexTest {


        @Rule
        public final ExpectedException exp = ExpectedException.none();

        @Test
        public void displayIndexNormal() throws Exception {
            int[] testedArray = {1, 2, 2, 4, 6 };
            int[] res = ShowIndex.displayIndex(testedArray, 2);
            int[] exactResult = {1, 2};
            for (int i = 0; i < exactResult.length; i++){
                if (res[i] != exactResult[i]) {
                    Assert.fail();
                }
            }
        }

        @Test
        public void displayIndexOneElement() throws Exception {
            int[] testedArray = {1, 2, 3, 4, 6 };
            int[] res = ShowIndex.displayIndex(testedArray, 3);
            int[] exactResult = {2};
            for (int i = 0; i < exactResult.length; i++){
                if (res[i] != exactResult[i]) {
                    Assert.fail();
                }
            }
        }

        @Test
        public void displayIndexNullExeptin() throws Exception {
            exp.expect(IllegalArgumentException.class);
            int[] testedArray = null;
            int[] res = ShowIndex.displayIndex(testedArray, 3);
        }


}