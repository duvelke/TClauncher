/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;

/**
 *
 * @author New_gamer
 */
public class LoginClass {
    LoginClass(){}
    
    public String users;
    public String Pass;
    public String currentvers;
    
    
    public LoginClass(String user,String pass,String version)
    {
        
        user = this.users;
        pass = this.Pass;
        version = this.currentvers;
        
         String LoginUrl = "https://login.minecraft.net/?user=<"+user+">&password=<"+pass+">&version="+version;
    
         
           
}
}
        
     
    
    

    
    

