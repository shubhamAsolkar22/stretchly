package com.fkog.stretchly;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;

public class TestStretchly {

	public static void main(String[] args) throws InterruptedException {
		Reminder r = JswingReminder.getInstance(1, TimeUnit.SECONDS);
		r.start();
	}

}
