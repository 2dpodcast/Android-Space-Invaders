package com.brosapps.PolePosition;

import java.util.ArrayList;

public class Enemy2 {
	
	int health;
	static int x;
	static int y;
	
	
	
	
	Enemy2(int newX, int newY)
	{
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
