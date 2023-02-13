package beginner.bin2dec.components;

import javax.swing.*;
import java.awt.*;

public class ConversionArea extends JPanel {

    protected static JLabel insertMsg;
    protected static NumberField insertArea;
    protected static NumberField convertArea;

    public ConversionArea() {
        insertMsg = new JLabel(
                "<html><p style = \"width: 300px\" text-align: left>" + "Insert Binary" + "</html>"
        );

        insertArea  = new NumberField();
        convertArea = new NumberField();

        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(insertMsg);
        add(insertArea);
        add(new ConvertBtn(insertArea, convertArea));
        add(new JLabel(
                "<html><p style = \"width: 300px\" text-align: left>" +
                        "Conversion Result:"
                        + "</html>"
        ));
        add(convertArea);
        add(new SwitchBtn());
    }
}
