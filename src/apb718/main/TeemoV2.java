package apb718.main;


import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import static java.awt.Color.*;

public class TeemoV2 extends JFrame {

    private static final long serialVersionUID = 1L;
    private static final JPanel samplePanel = new JPanel();

    private static final String[] ALL_CHAMPS = {"Aatrox", "Ahri", "Akali", "Akshan", "Alistar","Amumu","Anivia","Annie","Aphelios","Ashe","Aurelion Sol","Azir","Bard","Blitzcrank","Brand","Braum","Caitlyn","Camille","Cassiopeia","Cho'Gath","Corki","Darius","Diana","Dr. Mundo", "Draven", "Ekko","Elise","Evelynn","Ezreal","Fiddlesticks","Fiora","Fizz","Galio","Gangplank","Garen","Gnar","Gragas","Graves","Gwen","Hecarim","Heimerdinger","Illaoi","Irelia","Ivern","Janna","Jarvin IV","Jax","Jayce","Jhin","Jinx","Kai'Sa","Kalista","Karma","Karthus","Kassadin","Katarina","Kayle","Kayn","Kennen","Kha'Zix","Kindred","Kled","Kog'Maw","LeBlanc","Lee Sin", "Leona","Lillia","Lissandra","Lucian","Lulu","Lux","Malphite","Malzahar","Maokai","Master Yi", "Miss Fortune","Mordekaiser","Morgana","Nami","Nasus","Nautilus","Neeko","Nidalee","Nocturne", "Nunu & Willump", "Olaf", "Orianna", "Ornn", "Pantheon","Poppy", "Pyke", "Qiyana", "Quinn", "Rakan", "Rammus", "Rek'sai", "Rell", "Renekton","Rengar","Riven","Rumble","Ryze","Samira","Sejuani","Senna","Seraphine","Seraphine","Sett","Shaco","Shen","Shyvana","Singed","Sion","Sivir","Skarner","Sona","Soraka","Swain","Sylas","Syndra","Tahm Kench","Taliyah","Talon","Taric","Teemo","Thresh","Tristana","Trundle","Tryndamere","Twisted Fate","Twitch","Udyr","Urgot","Varus","Vayne","Veigar","Vel'Koz","Vex","Vi","Viego","Viktor","Vladimir","Volibear","Warwick","Wukong","Xayah","Xerath","Xin Zhao", "Yasuo","Yone", "Yorick","Yuumi","Zac","Zed","Zeri","Ziggs","Zilean","Zoe","Zyra"};

    public TeemoV2() {
        initGUI();
        for(String item : ALL_CHAMPS){
            System.out.println(item);
        }
        setTitle("Teemo Program V2");
        setResizable(false);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add()
    }


    public static void main(String[] args){
        try {
            String className = UIManager.getCrossPlatformLookAndFeelClassName();
            UIManager.setLookAndFeel(className);
        } catch (Exception e) {
            System.out.println("Smile");
        }
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TeemoV2();
            }
        });
    }

    private void initGUI() {
        Font font = new Font(Font.DIALOG, Font.BOLD, 18);

        TitleLabel titleLabel = new TitleLabel("Teemo Program V2");
        add(titleLabel, BorderLayout.PAGE_START);

        titleLabel.setOpaque(true);
        add(titleLabel, BorderLayout.PAGE_START);

        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(Color.WHITE);
        add(centerPanel, BorderLayout.CENTER);

        Dimension size = new Dimension(1920, 1080);

        samplePanel.setBackground(BLACK);
        samplePanel.setPreferredSize(size);
        centerPanel.add(samplePanel);


    }


}
