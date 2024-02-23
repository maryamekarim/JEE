package metier;

import org.junit.Assert;
import org.junit.Test;

@Test
public class CalculTest {
    public Calcul calcul;
    public void testSomme(){
        calcul = new Calcul();
        double a=5; double b=9;
        double expected = 14;
        double res= calcul.somme(a,b);
        Assert.assertTrue(res==expected);
    }
}
