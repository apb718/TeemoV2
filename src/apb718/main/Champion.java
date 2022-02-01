import javax.swing.*;
class Champion extends JFrame {

  private String name;
  private JLabel pic = new JLabel();


  public Champion(String champ){
    name = champ;  
    pic.setIcon(new ImageIcon("H:/images/" + champ));
  }

//   JLable  lblPic = new javax.swing.JLabel();
//  lblPic.setIcon(new javax.swing.ImageIcon("D:\\picture\\Image.JPG")); 


  public String toString(){
    return "\nName: " + name + "\nPic Location:H:/images/" + name + "\n";
  }
}