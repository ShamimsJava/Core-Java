/*
* Some rules for nested interface
*  1) Nested interface must be public 
*  2) Nested interface are static implicitely (i.e by default nested  is public and static).
*
*
*
*
 */

package pkgclass.pkg26_nestedinterface;

/**
 *
 * @author HP PC
 */
public interface Displayable_Interface {
    
    void show();
    
    //Nested interface
    interface Message{
        void msg();
    }
    
}
