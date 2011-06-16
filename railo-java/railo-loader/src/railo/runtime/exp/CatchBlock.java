package railo.runtime.exp;

import railo.runtime.PageContext;
import railo.runtime.op.Castable;
import railo.runtime.type.Struct;

public interface CatchBlock extends Struct,Castable{

	/**
	 * FUTURE add to interface
	 * @return the pe
	 */
	public PageException getPageException();

	public void print(PageContext pc);

}
