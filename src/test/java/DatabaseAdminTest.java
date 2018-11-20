import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    Staff.TechStaff.DatabaseAdmin dbAdmin;

    @Before
    public void setUp() throws Exception {
        dbAdmin = new Staff.TechStaff.DatabaseAdmin("John", "JG109283B", 27000.00);
    }

    @Test
    public void hasName() {
        assertEquals("John", dbAdmin.getName());
    }

    @Test
    public void hasSalary() {
        assert(27000.00==dbAdmin.getSalary());
    }

    @Test
    public void hasNINumber() {
        assertEquals("JG109283B", dbAdmin.getNiNumber());
    }

    @Test
    public void canSetName() {
        dbAdmin.setName("Arvind");
        assertEquals("Arvind", dbAdmin.getName());

    }

    @Test
    public void canSetSalary() {
        dbAdmin.setSalary(30000.00);
        assert(30000.00==dbAdmin.getSalary());

    }

    @Test
    public void canSetNINumber() {
        dbAdmin.setNiNumber("JJ2826354C");
        assertEquals("JJ2826354C", dbAdmin.getNiNumber());

    }

    @Test
    public void canRaiseSalary() {
        dbAdmin.raiseSalary(15000);
        assert(42000.00==dbAdmin.getSalary());
    }
    @Test
    public void canRaiseSalary__negativeValueNotAllowed() {
        dbAdmin.raiseSalary(-15000.00);
        assert(27000.00==dbAdmin.getSalary());
    }


    @Test
    public void canPayBonus() {
        assertEquals(270, dbAdmin.payBonus(),0.01);

    }

}
