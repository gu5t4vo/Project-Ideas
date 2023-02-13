package beginner.bin2dec.components;

import beginner.bin2dec.business.NumericBases;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class SwitchBtn extends JButton implements ActionListener {

    protected static NumericBases control;


    public SwitchBtn() {
        control = NumericBases.BINARY;
        setIcon(new ImageIcon
                (Objects.requireNonNull(getClass().getResource("/beginner/bin2dec/images/Switch.png")))
        );
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ConversionArea.convertArea.setText("");
        ConversionArea.insertArea.setText("");

        if (control == NumericBases.BINARY) {
            TitlePanel.title.setText("DECIMAL TO BINARY");
            ConversionArea.insertMsg.setText(
                    "<html><p style = \"width: 300px\" text-align: left>" + "Insert Decimal" + "</html>"
            );
            control = NumericBases.DECIMAL;
        }
        else {
            TitlePanel.title.setText("BINARY TO DECIMAL");
            ConversionArea.insertMsg.setText(
                    "<html><p style = \"width: 300px\" text-align: left>" + "Insert Binary" + "</html>"
            );
            control = NumericBases.BINARY;
        }
    }
}
