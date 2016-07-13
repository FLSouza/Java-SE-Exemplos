package br.com.esec.shapes;

public class PrototypePattern {
	public static void main(String[] args) {
		ShapeCache.loadCache();
		// Depois de criados em ShapeCache(), os shapes são clonados.
		Shape clonedShape = (Shape) ShapeCache.getShape("1");
		System.out.println("Shape : " + clonedShape.getType());

		Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
		System.out.println("Shape : " + clonedShape2.getType());

		Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
		System.out.println("Shape : " + clonedShape3.getType());
	}
}
