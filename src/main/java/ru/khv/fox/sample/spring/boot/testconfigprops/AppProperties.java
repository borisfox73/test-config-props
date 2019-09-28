/*
 * Copyright (c) 2019 Boris Fox.
 * All rights reserved.
 */

package ru.khv.fox.sample.spring.boot.testconfigprops;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

// Test application properties
@Component
@ConfigurationProperties("app.config")
public class AppProperties {
	private String a;
	private Nested1 nested1;
	private Nested2 nested2;


	public AppProperties() {
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public Nested1 getNested1() {
		return nested1;
	}

	public void setNested1(Nested1 nested1) {
		this.nested1 = nested1;
	}

	public Nested2 getNested2() {
		return nested2;
	}

	public void setNested2(Nested2 nested2) {
		this.nested2 = nested2;
	}

	public static class Nested1 {
		private int b;

		public Nested1() {
		}

		public int getB() {
			return b;
		}

		public void setB(int b) {
			this.b = b;
		}
	}

	public static class Nested2 {
		private long c;
		private boolean d;

		public Nested2() {
		}

		public long getC() {
			return c;
		}

		public void setC(long c) {
			this.c = c;
		}

		public boolean isD() {
			return d;
		}

		public void setD(boolean d) {
			this.d = d;
		}
	}
}
