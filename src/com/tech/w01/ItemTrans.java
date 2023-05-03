package com.tech.w01;

public class ItemTrans {
	private int point;
	private int total;
	
	public int getPoint() {
		return point;
	}

	public int getTotal() {
		return total;
	}

	public void getItem(String skill) {
		if(skill=="점프") {
			point=1000;
			total=total+point;
		}else if(skill=="더블점프") {
			point=3000;
			total=total+point;
		}else if(skill=="적군킬") {
			point=5000;
			total=total+point;
		}
	}
}
