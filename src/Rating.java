public enum Rating {
    VeryDissatisfied(1),
    Dissatisfied(2),
    Neutral(3),
    Satisfied(4),
    VerySatisfied(4);

    private int value;

    private Rating(int value) {
        this.value = value;
    }
}
