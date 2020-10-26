import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestOperation {

    @Test
    /*
    Test de 5 + 7, resultat attendu : 12
     */
    public void testAddition(){
        assertEquals(12,Operation.addition(5,7));
    }
}
