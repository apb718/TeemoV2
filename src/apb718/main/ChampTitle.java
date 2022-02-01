package apb718.main;

import javax.swing.*;
import java.awt.*;

public class ChampTitle extends JLabel{

    private static final long serialVersionUID = 1L;

    public ChampTitle(Champion champ){

        String name = champ.getName();
        JLabel label = champ.getLabelPic();

        Font font = new Font(Font.SERIF, Font.BOLD, 20);
        label.setFont(font);
        label.setBackground(Color.BLUE);
        label.setForeground(Color.WHITE);
        label.setOpaque(true);
        label.setHorizontalAlignment(JLabel.CENTER);

    }
}

