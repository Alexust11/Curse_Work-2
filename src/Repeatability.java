public enum Repeatability {
    ONETIME("однократная"),
    DAILY("ежедневная"),
    WEEKLY("еженедельная"),
    MONTHLY("ежемесячная"),
    ANNUAL("ежегодная");

    private String period;

    Repeatability(String period) {
        this.period = period;
    }
}
