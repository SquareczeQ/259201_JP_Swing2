package tb.soft;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	try {
	    Window window = new Window("Swing 2");
	    window.setVisible(true);
	}
	catch (Exception e) {
	    e.printStackTrace(System.err);
    }
    }
}
