package com.brosapps.PolePosition;

import java.util.ArrayList;

public class Enemy1 {
	
	int health;
	 int x;
	 int y;
	
	Enemy1(int newX, int newY){
		health = 1;
		x = newX;
		y = newY;
	}
	
	int getX()
	{
		return x;
	}
	int getY()
	{
		return y;
	}
	void setX(int newX)
	{
		x = newX;
	}
	void setY(int newY)
	{
		y = newY;
	}
	
	
}
