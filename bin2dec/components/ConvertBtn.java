package beginner.bin2dec.components;

import beginner.bin2dec.business.Bin;
import beginner.bin2dec.business.NumericBases;
import beginner.bin2dec.business.Rules;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConvertBtn extends JButton implements ActionListener {
    protected NumberField numberField;
    protected NumberField convertedNumber;

    public ConvertBtn(NumberField numberField, NumberField convertedNumber) {
        this.numberField        = numberField;
        this.convertedNumber    = convertedNumber;
        setText("CONVERT");
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (SwitchBtn.control == NumericBases.DECIMAL){
            int number = Integer.parseInt(numberField.getText());
            convertedNumber.setText(Rules.toBin(number).toString());
        }
        else {
            Bin number = new Bin(numberField.getText());
            convertedNumber.setText(String.valueOf(Rules.toDec(number)));
        }
    }
}
