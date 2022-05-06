package sg.kata.sgkata.entites;

public enum TypeTransaction {
    DEBIT("debit"),CREDIT("credit");

    private final String value;

    private TypeTransaction(String value ) {
        this.value = value;
    }
}
