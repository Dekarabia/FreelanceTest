import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.Netology.javaqa.HW_CYCLES.services.Freelance;

public class FreelanceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/freelance.csv")
    public void YouCanRest(int income, int expenses, int threshold, int rest) {
        Freelance service = new Freelance();
        /*
        int rest = 3;
        int income = 10_000;
        int expenses = 3000;
        int threshold = 20_000;
        */

        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(rest, actual);
    }

//    @Test
//    public void YouCanRestMore() {
//        Freelance service = new Freelance();//
//        int rest = 2;
//        int income = 100_000;
//        int expenses = 60_000;
//        int threshold = 150_000;//
//        int actual = service.calculate(income, expenses, threshold);
//        Assertions.assertEquals(rest, actual);
//    }
}