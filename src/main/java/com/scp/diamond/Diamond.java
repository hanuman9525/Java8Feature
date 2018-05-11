
package com.scp.diamond;

public class Diamond implements Left, Right{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Diamond d=new Diamond();
		d.m();
	}

	@Override
	public void m() {
		// TODO Auto-generated method stub
		Right.super.m();
		Left.super.m();
	}

}
