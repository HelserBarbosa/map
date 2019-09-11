package map.abstractfactory;


import map.abstractfactory.factorys.AndroidComponnentFactory;
import map.abstractfactory.factorys.ComponnentFactory;
import map.abstractfactory.factorys.IOSComponnentFactory;
import map.abstractfactory.factorys.WindowsPhoneComponnentFactory;
import map.abstractfactory.input.Input;
import map.abstractfactory.scroll.Scroll;
import map.abstractfactory.windows.Window;

public class Main {

	public static void main(String[] args) {
		
		//utilizando android
		ComponnentFactory androidCF = new AndroidComponnentFactory();
		Scroll androidScroll = androidCF.createScroll();
		Window androidWindow = androidCF.createWindow();
		Input androidInput = androidCF.createInput();
		
		androidWindow.setScroll(androidScroll);
		androidWindow.addInput(androidInput);

		//utilizando IOS
		ComponnentFactory IOSComponnents = new IOSComponnentFactory();
		Scroll scrollIOS = IOSComponnents.createScroll();
		Window windowIOS = IOSComponnents.createWindow();
		Input inputIOS = IOSComponnents.createInput();
		
		windowIOS.setScroll(scrollIOS);
		windowIOS.addInput(inputIOS);
		
		///utilizando WindowsPhone
		ComponnentFactory winPComponnents = new WindowsPhoneComponnentFactory();
		
		Scroll winPScroll = winPComponnents.createScroll();
		Window winPWindow = winPComponnents.createWindow();
		Input winPinput = winPComponnents.createInput();
		
		winPWindow.setScroll(winPScroll);
		winPWindow.addInput(winPinput);
		
		
	}
	
}
