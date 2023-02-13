package beginner.bin2dec.assembler;

import beginner.bin2dec.components.ConversionArea;
import beginner.bin2dec.components.TitlePanel;

import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame{

    public GUI() {
        setSize(400, 300);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        add(new TitlePanel(), BorderLayout.NORTH);
        add(new ConversionArea(), BorderLayout.CENTER);

        setVisible(true);
    }
}
