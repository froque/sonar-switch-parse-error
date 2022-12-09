package org.example.module2;

import org.example.module1.Bar1;

public class Foo1 {

	public static int process(final Bar1 bar) {
		return switch (bar) {
			case VALUE1 -> 1;
			case VALUE2 -> 2;
			case VALUE3 -> 3;
		};
	}

}