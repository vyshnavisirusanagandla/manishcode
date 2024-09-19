package javapackage;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.Vector;
public class Upcasting_vectortoList_HashsettoSet {
	public static void main(String[] args) {
		               List l1=new Vector();
                               l1.add("vyshu");
                               l1.add(null);
                               l1.add(null);
                           //    System.out.println(l1);
                    ListIterator    k1       = l1. listIterator();
                    while(k1.hasNext())
                    
                    {
                    	System.out.println(k1.next());
                    }
                    while(k1.hasPrevious())
                    {
                    	System.out.println("hashset to set"+k1.previous());
                    }
                
                                     Set s1 = new  HashSet();  
                                     s1.add("vyshu");
                                     s1.add(null);
                                     s1.add(null);
                        Iterator   k3      =  s1.   iterator();
                        while(k3.hasNext())
                        {
                        	System.out.println("hashset to set"+k3.next());
                        }
                       
                       
                    
	}
	

}
