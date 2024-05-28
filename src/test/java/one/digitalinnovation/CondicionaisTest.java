package one.digitalinnovation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;

import static org.junit.jupiter.api.condition.JRE.JAVA_8;
import static org.junit.jupiter.api.condition.JRE.JAVA_17;

public class CondicionaisTest {

    @Test
    @EnabledForJreRange(min = JAVA_8, max = JAVA_17)
    void validarAlgoSomenteNoUsuarioKaio() {
        Assertions.assertEquals(10, 5 + 5);
    }
}
