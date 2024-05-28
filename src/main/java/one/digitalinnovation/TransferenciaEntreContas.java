package one.digitalinnovation;

public class TransferenciaEntreContas {

    public void transfere(Conta contaOrigem, Conta contaDestino, int valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("valor deve ser maior do que zero");
        }

        contaDestino.lancaCredito(valor);
        contaOrigem.lancaDebito(valor);
    }
}
