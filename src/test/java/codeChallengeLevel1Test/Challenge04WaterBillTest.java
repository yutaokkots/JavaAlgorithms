package codeChallengeLevel1Test;
import static org.junit.Assert.assertEquals;

import org.example.codeChallengeLevel1.Challenge04WaterBill;
import org.junit.Test;
public class Challenge04WaterBillTest {

    @Test
    public void calculateWaterBill() {
        assertEquals(22.74, Challenge04WaterBill.calculateWaterBill(1800), 0);
        assertEquals(22.74, Challenge04WaterBill.calculateWaterBill(2244), 0);
        assertEquals(26.64, Challenge04WaterBill.calculateWaterBill(2245), 0);
        assertEquals(26.64, Challenge04WaterBill.calculateWaterBill(2992), 0);
        assertEquals(46.14, Challenge04WaterBill.calculateWaterBill(6000), 0);
        assertEquals(53.94, Challenge04WaterBill.calculateWaterBill(8000), 0);

        assertEquals(18.84, Challenge04WaterBill.calculateWaterBill(0), 0);
        assertEquals(18.84, Challenge04WaterBill.calculateWaterBill(1496), 0);
        assertEquals(22.74, Challenge04WaterBill.calculateWaterBill(1497), 0);
        assertEquals(18.84, Challenge04WaterBill.calculateWaterBill(-20), 0);
    }
}
