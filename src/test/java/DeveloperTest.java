import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Staff.TechStaff.Developer developer;

    @Before
    public void setUp() throws Exception {
        developer = new Staff.TechStaff.Developer("Andrew", "JA091027D", 36000.00);

    }

    @Test
    public void hasName() {
        assertEquals("Andrew", developer.getName());
    }

    @Test
    public void hasSalary() {
        assert(36000.00==developer.getSalary());
    }

    @Test
    public void hasNINumber() {
        assertEquals("JA091027D", developer.getNiNumber());
    }

    @Test
    public void canSetName() {
        developer.setName("Dana");
        assertEquals("Dana", developer.getName());

    }

    @Test
    public void canSetSalary() {
        developer.setSalary(25000.00);
        assert(25000.00==developer.getSalary());

    }

    @Test
    public void canSetNINumber() {
        developer.setNiNumber("JJ395723A");
        assertEquals("JJ395723A", developer.getNiNumber());

    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(15000);
        assert(51000.00==developer.getSalary());
    }

    @Test
    public void canRaiseSalary__negativeValueNotAllowed() {
        developer.raiseSalary(-15000.00);
        assert(36000.00==developer.getSalary());
    }

    @Test
    public void canPayBonus() {
        assertEquals(360, developer.payBonus(),0.01);

    }
}
