package com.fkog.stretchly;

import java.util.concurrent.TimeUnit;

abstract class AbstractReminder implements Reminder {

	private final int interval;
	private final TimeUnit timeUnit;
	private boolean isStarted = false;

	AbstractReminder(int minuteInterval,TimeUnit timeUnit) {
		this.interval = minuteInterval;
		this.timeUnit = timeUnit;
	}

	@Override
	public void start() throws InterruptedException {
		if (!isStarted) {
			isStarted = true;
			int counter = 0;
			while (true) {
				timeUnit.sleep(interval);
				counter++;
				ring(counter * interval);

			}
		}else {
			throw new IllegalStateException();
		}
	}
	
	@Override
	public String getTimeUnitAsString() {
		return timeUnit.name();
	}
	

}
