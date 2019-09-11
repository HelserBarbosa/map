package map.abstractfactory.factorys;

import map.abstractfactory.input.Input;
import map.abstractfactory.input.WindowsPhoneInput;
import map.abstractfactory.scroll.Scroll;
import map.abstractfactory.scroll.WindowsPhoneScroll;
import map.abstractfactory.windows.Window;
import map.abstractfactory.windows.WindowsPhoneWindow;

public class WindowsPhoneComponnentFactory extends ComponnentFactory{

	@Override
	public Input createInput() {
		return new WindowsPhoneInput();
	}

	@Override
	public Scroll createScroll() {
		return new WindowsPhoneScroll();
	}

	@Override
	public Window createWindow() {
		return new WindowsPhoneWindow();
	}

}
