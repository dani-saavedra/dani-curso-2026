package co.edu.unisabana.creacional.absfactory.factory;

public abstract class Dialog {

    abstract Button createButton();

    public void render() {
        Button b = createButton();
        b.render();
        b.onClick();
    }
}
