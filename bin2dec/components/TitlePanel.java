package beginner.bin2dec.components;

import javax.swing.*;
import java.awt.*;

public class TitlePanel extends JPanel {
    protected static JLabel title;

    public TitlePanel(){

        title = new JLabel();

        title.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
        title.setText("BINARY TO DECIMAL");

        add(title);

        setVisible(true);
    }
}
