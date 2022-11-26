package averageage.service;

import org.junit.Test;
import static org.junit.Assert.*;

public class AverageAgeServiceTest {

    private AverageAgeService averageService = new AverageAgeService();

    @Test
    public void shouldThrowErrorInvalidArguments() {
        assertThrows("Invalid arguments.", Error.class, () -> {
            averageService.average(
                    null,
                    null
            );
        });

        assertThrows("Invalid arguments.", Error.class, () -> {
            averageService.average(
                    new String[] { "Mike", "John", "Kate", "Susan" },
                    null
            );
        });

        assertThrows("Invalid arguments.", Error.class, () -> {
            averageService.average(
                null,
                new int[] { 37, 34, 21, 58 }
            );
        });

        assertThrows("Invalid arguments.", Error.class, () -> {
            averageService.average(
                new String[] { "Mike", "John", "Kate", "Susan" },
                new int[] { 34, 33 }
            );
        });

        assertThrows("Invalid arguments.", Error.class, () -> {
            averageService.average(
                new String[] { "Mike", "John", "Kate", "Susan" },
                new int[] { }
            );
        });
    }

    @Test
    public void shouldCalculateAverageRangeAndReturnCorrectly() {
        assertEquals(averageService.average(
                new String[] { "Mike", "John", "Kate", "Susan" },
                new int[] { 37, 34, 21, 58 }
        ), "John is 34 years old\nMike is 37 years old");
    }
}
