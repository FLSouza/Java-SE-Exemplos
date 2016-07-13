package br.com.esec.builder;

import br.com.esec.itens.ChickenBurger;
import br.com.esec.itens.Coke;
import br.com.esec.itens.Meal;
import br.com.esec.itens.Pepsi;
import br.com.esec.itens.VegBurger;

public class MealBuilder {

	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}

	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}