/*
 * @author Dawn Bykowski - Advanced Java Programming 152-135-20746-13
 */
package myinterface;

public interface Employee {
    
    // These methods will all need to be overridden by the classes.
    public String geteNum();
    
    public void seteNum(String eNum);
    
    public String geteLastName();
    
    public void seteLastName(String eLastName);
    
    public String geteFirstName();
    
    public void seteFirstName(String eFirstName);
    
    public String geteDept();
    
    public void seteDept(String eDept);

}
