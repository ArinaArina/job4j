package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * CalculateTest
 * Тестирует метод echo
 * @author Arina Vakurova
 * @version $Id$
 * @since 1.02.2019
*/
public class CalculateTest{
	/**
	 * Test echo
	*/
	@Test
	public void whenTakeNameThenThreeEchoPlusName(){
		String input = "Arina";
		String expect = "Echo, echo, echo: Arina";
		Calculate calc = new Calculate();
		String result = calc.echo(input);
		assertThat(result, is(expect));
	}
}