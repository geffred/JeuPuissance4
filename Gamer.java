public class Gamer {

    private String name;
    private String jetonColor;

    public Gamer(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJetonColor(String jetonColor) {
        this.jetonColor = jetonColor;
    }

    public String getJetonColor() {
        return jetonColor;
    }
}
