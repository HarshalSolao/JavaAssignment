package com.assignment.anjali;

public class CommonUtil implements CommonUtilInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isEmpty(String str) {
		if(null != str || !str.isEmpty()) {
			return false;
		}
		return true;
	}

}
