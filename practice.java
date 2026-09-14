 import javax.swing.*;
import java.awt.event.*;

public class MyFrame extends JFrame {
    public static void setFrame(String title, int wide, int height, boolean closeProgram) {
        JFrame frame = new JFrame(title);
        frame.setSize(wide, height);

        if (closeProgram) {
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } else {
            frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            frame.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    frame.dispose(); // close the frame
                }
            });
        }

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            setFrame("Topicos", 400, 300, false);     // close the frame without terminating the program
            setFrame("Avanzados", 200, 150, true);    // close the frame and terminate the program
            setFrame("Programacion", 500, 400, false); // close the frame without terminating the program
        });
    }
}
