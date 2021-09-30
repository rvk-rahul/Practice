package practice;

public enum TempEnum {
    Standard ("Standard"),
    Program ("Program"),
    Reward ("Reward"),
    Alcohol("Alcohol");

    private TempEnum(final String text) {
        this.text = text;
    }

    private final String text;

    @Override
    public String toString() {
        return text;
    }

}
