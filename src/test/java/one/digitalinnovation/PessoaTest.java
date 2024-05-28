package one.digitalinnovation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {

    @Test
    void deveCalcularIdadeCorretamente() {
        Pessoa pessoa = new Pessoa("Kaio", LocalDate.of(2003, 3, 27));
        Assertions.assertEquals(21, pessoa.getIdade());

    }

    @Test
    void deveRetornarSeEhMaiorDeIdade() {
        Pessoa pessoa = new Pessoa("Kaio", LocalDate.of(2003, 3, 27));
        Assertions.assertTrue(pessoa.ehMaiorDeIdade());

        Pessoa pessoa1 = new Pessoa("João", LocalDate.now());
        Assertions.assertFalse(pessoa1.ehMaiorDeIdade());
    }
}
