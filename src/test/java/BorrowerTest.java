import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower1;
    private Borrower borrower2;


    @Before
    public void setUp(){
        borrower1 = new Borrower("Tim");
        borrower2 = new Borrower("Ali");
    }

    @Test
    public void startsEmpty(){
        assertEquals(0, borrower1.getTotalBooksOut());
    }

}
