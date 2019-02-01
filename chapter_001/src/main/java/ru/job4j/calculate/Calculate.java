package ru.job4j.calculate;
/**
 * Calculate
 * Для вывода на консоль "Hello World"
 * @author Arina Vakurova
*/
 
public class Calculate{
	/**
	 * main 
	 * Выводит на консоль "Hello World"
	 * @param args - args
	*/
	public static void main(String[] args){
		System.out.println("Hello World!");
	}
	/**
	 * echo
	 * Возвращает строку "Echo, echo, echo: " с вашим именем
	 * @param name - ваше имя
	 * @return "Echo, echo, echo: " + ваше имя
	*/
	public String echo(String name){
		return "Echo, echo, echo: " + name;
	}
}