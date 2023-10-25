package com.tech.w01;


interface Bank{
	void save();
}

class Customer {
	public void deposit(Bank saveMoney) {
		saveMoney.save();
	}
}

public class LamdaTest1 {
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.deposit(new Bank() {
			
			@Override
			public void save() {
				System.out.println("1번 입금액 1000");
			}
		});
		System.out.println("-------------------");
		customer.deposit(()->{
			System.out.println("람다식 1번 입금액 1000");
		});
	}
}
