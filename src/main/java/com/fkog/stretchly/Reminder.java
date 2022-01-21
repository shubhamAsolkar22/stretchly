package com.fkog.stretchly;

interface Reminder {
	void start() throws InterruptedException ;
	void ring(int minutesSpent);
	void dismiss();
	String getTimeUnitAsString();
}
