package map.abstractfactory.factorys;

import map.abstractfactory.input.AndroidInput;
import map.abstractfactory.input.Input;
import map.abstractfactory.scroll.AndroidScroll;
import map.abstractfactory.scroll.Scroll;
import map.abstractfactory.windows.AndroidWindow;
import map.abstractfactory.windows.Window;

public class AndroidComponnentFactory extends ComponnentFactory {

	@Override
	public Input createInput() {
		return new AndroidInput();
	}

	@Override
	public Scroll createScroll() {
		return new AndroidScroll();
	}

	@Override
	public Window createWindow() {
		return new AndroidWindow();
	}

}
