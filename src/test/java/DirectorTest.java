import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Staff.Management.Director director;
    @Before
    public void setUp() throws Exception {
        director = new Staff.Management.Director("Danny", "JH192837D", 89000.00, "CEO", 1000000.00);
    }


    @Test
    public void hasName() {
        assertEquals("Danny", director.getName());
    }

    @Test
    public void hasSalary() {
        assert(89000.00==director.getSalary());
    }

    @Test
    public void hasNINumber() {
        assertEquals("JH192837D", director.getNiNumber());
    }

    @Test
    public void hasDeptName() {
        assertEquals("CEO", director.getDeptName());
    }

    @Test
    public void canSetName() {
        director.setName("Kay");
        assertEquals("Kay", director.getName());

    }

    @Test
    public void canSetSalary() {
        director.setSalary(25000.00);
        assert(25000.00==director.getSalary());

    }

    @Test
    public void canSetNINumber() {
        director.setNiNumber("JH192837C");
        assertEquals("JH192837C", director.getNiNumber());

    }

    @Test
    public void canSetDeptName() {
        director.setDeptName("CO");
        assertEquals("CO", director.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(15000);
        assert(104000.00==director.getSalary());
    }

    @Test
    public void canRaiseSalary__negativeValueNotAllowed() {
        director.raiseSalary(-15000.00);
        assert(89000.00==director.getSalary());
    }

    @Test
    public void canPayBonus() {
        assertEquals(1780.00, director.payBonus(),0.01);

    }
}
