package org.example.module2;

public class Foo2 {

	public static int process(final Bar2 bar) {
		return switch (bar) {
			case VALUE1 -> 1;
			case VALUE2 -> 2;
			case VALUE3 -> 3;
		};
	}

}