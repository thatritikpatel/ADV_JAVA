package utils;

import java.util.*;

public class Utility{
	public static String getVfCode(){
		return Math.abs(new Random().nextLong())+"_"+new Date().getTime();
	}
}