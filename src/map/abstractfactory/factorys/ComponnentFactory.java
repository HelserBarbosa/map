package map.abstractfactory.factorys;


import map.abstractfactory.input.Input;
import map.abstractfactory.scroll.Scroll;
import map.abstractfactory.windows.Window;

public abstract class ComponnentFactory {

	public abstract Input createInput();
	
	public abstract Scroll createScroll();
	
	public abstract Window createWindow();
}
