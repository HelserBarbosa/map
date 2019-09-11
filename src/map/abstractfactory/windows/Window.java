package map.abstractfactory.windows;

import java.util.ArrayList;
import java.util.List;

import map.abstractfactory.input.Input;
import map.abstractfactory.scroll.Scroll;

public abstract class Window {

	private double altura;
	
	private double largura;
	
	private List<Input> listsInput = new ArrayList<>();
	
	private Scroll scroll;

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public List<Input> getListsInput() {
		return listsInput;
	}

	public void addInput(Input input) {
		this.listsInput.add(input);
	}

	public Scroll getScroll() {
		return scroll;
	}

	public void setScroll(Scroll scroll) {
		this.scroll = scroll;
	}
	
	
	
	
	
}
