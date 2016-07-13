package br.com.esec.main;

import br.com.esec.interfaces.Image;
import br.com.esec.proxy.ProxyImage;

public class ProxyPattern {
	public static void main(String[] args) {
		Image image = new ProxyImage("test_10mb.jpg");

		// A imagem vai ser carregada do disco.
		image.display();
		System.out.println("");

		// A imagem não vai ser carregada do disco.
		image.display();
	}
}
