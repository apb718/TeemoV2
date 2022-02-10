package apb718.main;
import javax.swing.*;
import java.awt.*;

class Champion extends JFrame {

  private String name;
  private JLabel pic = new JLabel();

  private final Dimension ICONSIZE = new Dimension(200,100);

  public Champion(String champ){
    name = champ;
    pic.setSize(ICONSIZE);
    ImageIcon img = new ImageIcon("H:/images/league/" + champ + ".png");
    Image image = img.getImage();
    Image newImage = image.getScaledInstance(200,200, Image.SCALE_SMOOTH);
    pic.setIcon(new ImageIcon(newImage));
  }

  public String getName(){
    return name;
  }
  public JLabel getLabelPic() {
    return pic;
  }


  public String toString(){
    return "\nName: " + name + "\nPic Location:H:/images/league" + name + ".png\n";
  }
}