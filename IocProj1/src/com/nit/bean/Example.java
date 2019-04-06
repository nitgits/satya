package com.nit.bean;

public class Example {

	
		// TODO Auto-generated method stub

	    private int age;
		private long salary;
		
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public long getSalary() {
			return salary;
		}
		public void setSalary(long salary) {
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Age-->"+age+"salary-->"+salary;
		}
		
	}


