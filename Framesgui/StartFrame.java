/*
 * tijdelijke layout
 */
package Framesgui;

import Basic.*;
import Images.clsImagerotator;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.swing.*;

import javax.swing.JFrame;


/**
 *
 * @author New_gamer
 */
public class StartFrame extends JFrame{
    
    private JFrame f = new JFrame();
    
    private JPanel picPanel = new JPanel();
    private JPanel itemPanel = new JPanel(); 
    private JTextField txtUser = new JTextField("username");
    private JTextField txtPass = new JTextField("password");
    private JButton Log = new JButton("Login");
    private JButton checkUpdate = new JButton("Update");
    private JButton Server = new JButton("Tweakcraft Direct");
    private JMenuBar mb = new JMenuBar();
    private JMenuItem Forum = new JMenuItem();
    public String username;
    public String password;
    public String Versie;
    public String url = "http://www.tweakcraft.net";
    public Dimension txtdim = new Dimension(50,800);
    clsImagerotator slideshow = new clsImagerotator();
    Dimension dim = new Dimension(450,800);
    TCdirectclass site = new TCdirectclass();
    
    
     public class ListenUpdate implements ActionListener{
        public void actionPerformed(ActionEvent e){
        }
      
        }
     
        public class ListenLogin implements ActionListener{
        public void actionPerformed(ActionEvent e){
            username = txtUser.getText();
            password = txtPass.getText();
            
    //LoginClass login = new LoginClass(username,password);
    //Updateclass Update = new Updateclass(versie);
  
    }
    }
         public class ListenDirect implements ActionListener{
         public void actionPerformed(ActionEvent e){
                 
         }
         }     
        
    public void launchFrame() throws IOException{
     f.setBackground(Color.BLUE);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack(); 
        f.setVisible(true);
        f.setSize(800, 600);
        f.getContentPane().setLayout(new BorderLayout());
        
        
        itemPanel.setMaximumSize(txtdim);
        
        f.add(picPanel,BorderLayout.CENTER);
        f.add(itemPanel,BorderLayout.SOUTH);
        
      
        picPanel.add(slideshow.over);
        
        
        itemPanel.add(txtUser);
        itemPanel.add(txtPass);
        itemPanel.add(Log);  
        itemPanel.add(checkUpdate); 
        itemPanel.add(Server);
        
       
        
       
       
  
    }
     

   public StartFrame ()
    {
        Log.addActionListener(new ListenLogin());
        checkUpdate.addActionListener(new ListenUpdate());
        Server.addActionListener(new ListenDirect());
        
       
        
    }
    
    public static void main (String args[]) throws IOException
        {
           
        StartFrame gui = new StartFrame();
       
        gui.launchFrame();
        
        }
}
