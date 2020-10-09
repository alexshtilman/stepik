package appl;

import static base.FlipBit.*;
import static base.IsPowerOfTwo.*;
import static base.Factorial.*;
import static base.MergeArrays.*;
import static base.PrintTextPerRole.*;

public class Appl {

	public static void main(String[] args) {
		// System.out.println(flipBit(0, 1));
		// isPowerOfTwo(8);
		// System.out.println(factorial(3));
		//int[] a1 = { 0, 2, 2, 10, 10, 20 };
		//int[] a2 = { 1, 3, 5, 7, 8, 10, 10 };

		//mergeArrays(a1, a2);
		String[] roles = { "Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука", "Лука Лукич" };
		String[] textLines = {
				"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
				"Аммос Федорович: Как ревизор?", "Артемий Филиппович: Как ревизор?",
				"Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
				"Аммос Федорович: Вот те на!", "Артемий Филиппович: Вот не было заботы, так подай!",
				"Лука Лукич: Господи боже! еще и с секретным предписаньем!",
				"Лука: Господи боже! Я уронил своё пасхальное яйцо от неожиданности!" };
		System.out.println(printTextPerRole(roles,textLines));
	}

}
