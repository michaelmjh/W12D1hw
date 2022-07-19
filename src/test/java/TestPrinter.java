import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestPrinter {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 50);
    }

    @Test
    public void testGetPaperRemaining(){
        assertEquals(100, printer.getPaperRemaining());
    }

    @Test
    public void testPrintPass(){
        printer.print(2,5);
        assertEquals(90, printer.getPaperRemaining());
    }

    @Test
    public void testPrintFailNotEnoughPaper(){
        printer.print(75,2);
        assertEquals(100, printer.getPaperRemaining());
    }

    @Test
    public void testPrintFailNotEnoughToner(){
        printer.print(30,2);
        assertEquals(100, printer.getPaperRemaining());
    }

    @Test
    public void testGetTonerRemaining(){
        assertEquals(50, printer.getTonerRemaining());
    }
}
