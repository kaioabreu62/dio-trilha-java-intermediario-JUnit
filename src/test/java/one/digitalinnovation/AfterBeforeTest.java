package one.digitalinnovation;

import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class AfterBeforeTest {

    @BeforeAll
    static void configuraConexao() {
        GerenciadorDeConexaoBancoDeDados.iniciarConexao();
        System.out.println("rodou configuraConexao");
    }

    @BeforeEach
    void insereDadosParaTeste() {
        GerenciadorDeConexaoBancoDeDados.inserirDados(new Pessoa("João", LocalDate.of(2000, 1, 13)));
    }

    @AfterEach
    void removeDadosDoTeste() {
        GerenciadorDeConexaoBancoDeDados.removerDados(new Pessoa("João", LocalDate.of(2000, 1, 13)));
    }

    @Test
    void validarDadosDeRetorno() {
        Assertions.assertTrue(true);
    }

    @Test
    void validarDadosDeRetorno2() {
        Assertions.assertNull(null);
    }

    @AfterAll
    static void finalizarConexao() {
        GerenciadorDeConexaoBancoDeDados.finalizarConexao();
        System.out.println("rodou finalizarConexao");
    }

}
