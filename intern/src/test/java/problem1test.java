import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class problem1test {
    @Test
    public  void testsum1(){
        int except=problem1.getsum(10,30);
            assertEquals(except,40);
    }


}