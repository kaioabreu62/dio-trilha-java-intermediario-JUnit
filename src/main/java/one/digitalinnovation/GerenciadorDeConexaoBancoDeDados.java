package one.digitalinnovation;

import java.util.logging.Logger;

public class GerenciadorDeConexaoBancoDeDados {

    private static final Logger LOGGER = Logger.getLogger(GerenciadorDeConexaoBancoDeDados.class.getName());

    public static void iniciarConexao() {
        //fez algo
        LOGGER.info("Iniciou conexao");
    }

    public static void finalizarConexao() {
        //fez algo
        LOGGER.info("Finalizou conexao");
    }

    public static void inserirDados(Pessoa pessoa) {
        //insere pessoa no DB
        LOGGER.info("inseriu dados");
    }

    public static void removerDados(Pessoa pessoa) {
        //insere pessoa no DB
        LOGGER.info("removeu dados");
    }
}
