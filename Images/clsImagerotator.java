package Images;

/*
 * slideshow  
 */
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.Timer;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.*;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Duvelke
 */

public class clsImagerotator implements ActionListener {
    
public static int pics = 0;
public static boolean check = false;

int i;
int x;


public Timer t = new Timer(1000,this);
public JLabel over = new JLabel();
public JPanel IPanel = new JPanel();

public class ImagePanel extends JPanel{

    private BufferedImage image;

    public ImagePanel() {
       try {                
          image = ImageIO.read(new File("TCscene"+pics+".png"));
       } catch (IOException ex) {
            // handle exception...
       }
    }

    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(image, 0, 0, null); // see javadoc for more info on the parameters

    }

}




public Dimension picdim = new Dimension(450,800);

  public clsImagerotator() {
      
      over.setIcon(new javax.swing.ImageIcon(getClass().getResource("TCscene"+pics+".png")));
     
          t.start();
          
     
    }

  public static void main(String args[]) {
    //clsImagerotator td = new clsImagerotator();
    
    java.awt.Frame dummy = new java.awt.Frame();
    dummy.setVisible(false);
    }

  public void actionPerformed(ActionEvent e) {
 
    if (e.getSource() == t) {
        //dient enkel als check 
//      System.out.println 
//             
//        ( Calendar.getInstance().getTime());
      ++i;
      if(i==10)
      {  
          ++x;
          pics = x;
          
          
       
         
          over.setIcon(new javax.swing.ImageIcon(getClass().getResource("TCscene"+pics+".png")));
     
          i=0;
          if (check == true)
          {
          check = false;
          }
          if(x==5)
          {
          x=0;
          }
      }
    }
}
}



       
   


    


    

