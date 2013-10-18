package railo.runtime.type;

import railo.runtime.Component;
import railo.runtime.ComponentImpl;
import railo.runtime.PageContext;
import railo.runtime.exp.PageException;

public interface UDFPlus extends UDF {
	
	// !!!!!! do not move to public interface, make for example a interface calle UDFMod
	 public void setOwnerComponent(Component component);
	 public void setAccess(int access);
	
	
}
