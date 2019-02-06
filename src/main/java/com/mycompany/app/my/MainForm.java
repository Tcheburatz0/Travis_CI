package com.mycompany.app.my;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainForm {
    private JTextField txbInput;
    private JButton btnParse;
    public JPanel mainPanel;
    private JLabel lblInfo;
    private JTextPane txtOutPut;
    private JButton Clear;


    private void createUIComponents() {

        // TODO: place custom component creation code here
    }

    public class BtnParseClicked implements ActionListener {

        public BtnParseClicked() {

        }

        /**
         * Invoked when an action occurs.
         *
         * @param e
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            StrHelper strHelper = new StrHelper();
            strHelper.GetFrquency(txbInput.getText());
            txtOutPut.setText(strHelper.toString());
        }
    }

    public class TxbInputTextChanged extends JFrame implements ActionListener {

        /**
         * Invoked when an action occurs.
         *
         * @param e
         */
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    public MainForm() {
        btnParse.setEnabled(txbInput.getText().length() != 0);
        btnParse.addActionListener(new BtnParseClicked());
        txbInput.getDocument().addDocumentListener(
                new DocumentListener() {
                    public void changedUpdate(DocumentEvent e) {
                        disableTxb();
                    }

                    public void removeUpdate(DocumentEvent e) {
                        disableTxb();
                    }

                    public void insertUpdate(DocumentEvent e) {
                        disableTxb();
                    }

                    public void disableTxb() {
                        btnParse.setEnabled(txbInput.getText().length() != 0);
                    }
                }
        );
        Clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txbInput.setText("");
                txtOutPut.setText("");
            }
        });
    }

}
