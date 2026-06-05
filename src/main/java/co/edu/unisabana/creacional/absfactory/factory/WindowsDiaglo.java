package co.edu.unisabana.creacional.absfactory.factory;

public class WindowsDiaglo extends Dialog {
    @Override
    Button createButton() {
        return new WindowsButton();
    }
}
