package mirea.isbo1016.mateyuk.lab6.task3;

import javax.swing.*;
import java.awt.*;

public class AppFrame extends JFrame {

    private JMenuBar menuBar = new JMenuBar();
    private JMenu colorTextMenu = new JMenu("Цвет текста");
    private JMenu textTypeMenu = new JMenu("Шрифт текста");
    private Font[] Fonts = new Font[3];

    private JTextArea textField = new JTextArea("");


    AppFrame()
    {
        this.setResizable(false);
        this.setSize(400,300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Notepad");
        this.setJMenuBar(menuBar);

        Fonts[0] = new Font("Times New Roman", Font.PLAIN, 13);
        Fonts[1] = new Font("SansSerif", Font.PLAIN, 13);
        Fonts[2] = new Font("Courier New", Font.PLAIN,13);

        textField.setFont(Fonts[0]);

        JMenuItem blueColorSet = new JMenuItem("Blue");
        colorTextMenu.add(blueColorSet);

        JMenuItem redColorSet = new JMenuItem("Red");
        colorTextMenu.add(redColorSet);

        JMenuItem blackColorSet = new JMenuItem("Black");
        colorTextMenu.add(blackColorSet);

        JMenuItem tnmFontSet = new JMenuItem("Times New Roman");
        textTypeMenu.add(tnmFontSet);

        JMenuItem msssFontSet = new JMenuItem("MS Sans Serif");
        textTypeMenu.add(msssFontSet);

        JMenuItem cnFontSet = new JMenuItem("Courier New");
        textTypeMenu.add(cnFontSet);

        blueColorSet.addActionListener(e -> textField.setForeground(Color.BLUE));
        redColorSet.addActionListener(e -> textField.setForeground(Color.RED));
        blackColorSet.addActionListener(e -> textField.setForeground(Color.BLACK))  ;

        tnmFontSet.addActionListener(e -> textField.setFont(Fonts[0]));
        msssFontSet.addActionListener(e -> textField.setFont(Fonts[1]));
        cnFontSet.addActionListener(e -> textField.setFont(Fonts[2]));

        menuBar.add(colorTextMenu);
        menuBar.add(textTypeMenu);

        this.add(textField);

    }
}
