import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Staff.Management.Manager manager;

    @Before
    public void setUp() throws Exception{
        manager = new Staff.Management.Manager("Gillian", "AA202384C", 45000.00, "IT");

    }

    @Test
    public void hasName() {
        assertEquals("Gillian", manager.getName());
    }

    @Test
    public void hasSalary() {
        assert(45000.00==manager.getSalary());
    }

    @Test
    public void hasNINumber() {
        assertEquals("AA202384C", manager.getNiNumber());
    }

    @Test
    public void hasDeptName() {
        assertEquals("IT", manager.getDeptName());
    }

    @Test
    public void canSetName() {
        manager.setName("Dana");
        assertEquals("Dana", manager.getName());

    }

    @Test
    public void canSetName__NameNull() {
        manager.setName(null);
        assertEquals("Gillian", manager.getName());
    }

    @Test
    public void canSetName__NameEmptyString() {
        manager.setName("");
        assertEquals("Gillian", manager.getName());
    }

    @Test
    public void canSetSalary() {
        manager.setSalary(25000.00);
        assert(25000.00==manager.getSalary());

    }

    @Test
    public void canSetNINumber() {
        manager.setNiNumber("JJ395723A");
        assertEquals("JJ395723A", manager.getNiNumber());

    }

    @Test
    public void canSetDeptName() {
        manager.setDeptName("Development");
        assertEquals("Development", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(15000);
        assert(60000.00==manager.getSalary());
    }

    @Test
    public void canPayBonus() {
        assertEquals(450, manager.payBonus(),0.01);

    }
}
