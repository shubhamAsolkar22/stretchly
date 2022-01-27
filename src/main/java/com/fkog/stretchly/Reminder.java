package com.fkog.stretchly;

interface Reminder extends Startable,Ringable,Dismissable,TimeUnitPrintable{
	
	String getName();
}
