package br.com.esec.main;

import br.com.esec.interfaces.Image;
import br.com.esec.proxy.ProxyImage;

public class ProxyPattern {
	public static void main(String[] args) {
		Image image = new ProxyImage("test_10mb.jpg");

		// image will be loaded from disk
		image.display();
		System.out.println("");

		// image will not be loaded from disk
		image.display();
	}
}
