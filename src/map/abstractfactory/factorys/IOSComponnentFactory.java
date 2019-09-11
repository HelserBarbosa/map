package map.abstractfactory.factorys;

import map.abstractfactory.input.IOSInput;
import map.abstractfactory.input.Input;
import map.abstractfactory.scroll.IOSScroll;
import map.abstractfactory.scroll.Scroll;
import map.abstractfactory.windows.IOSWindow;
import map.abstractfactory.windows.Window;

public class IOSComponnentFactory extends ComponnentFactory{

	@Override
	public Input createInput() {
		return new IOSInput();
	}

	@Override
	public Scroll createScroll() {
		return new IOSScroll();
	}

	@Override
	public Window createWindow() {
		return new IOSWindow();
	}

}
