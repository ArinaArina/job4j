package ru.job4j.calculate;
/**
 * Class Calculate для вывода на консоль.
 * @author Arina Vakurova.
 * @since 31.01.2019.
 * @version 1.
*/
public class Calculate {
	/**
	 * Выводит на консоль "Hello World".
	 * @param args - args.
	*/
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
	/**
	 * Возвращает строку "Echo, echo, echo: " с вашим именем.
	 * @param name - ваше имя.
	 * @return "Echo, echo, echo: " + ваше имя.
	*/
	public String echo(String name) {
		return "Echo, echo, echo: " + name;
	}
}