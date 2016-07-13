package br.com.esec.colors;

import br.com.esec.interfaces.DrawAPI;

//Classe concreta, implementando a interface DrawAPI
public class RedCircle implements DrawAPI {
	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
	}
}