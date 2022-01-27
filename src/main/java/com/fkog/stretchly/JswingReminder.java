package com.fkog.stretchly;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JswingReminder extends AbstractReminder {
	private final JFrame jframe = new JFrame("Stretchly Jswing");
	private final JLabel label = new JLabel("Welcome to stretchly! I will remind you to take your strech breaks.");
	private final JButton jButton = new JButton("Dismiss");

	private JswingReminder(int interval,TimeUnit timeUnit) {
		super(interval,timeUnit);
		init();
	}

	public static Reminder getInstance(int interval,TimeUnit timeUnit) {
		return new JswingReminder(interval,timeUnit);
	}

	private void init() {

		jframe.setLayout(new FlowLayout());
		jframe.setSize(500, 100);
		jframe.add(label);
		jButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dismiss();
			}
		});
		jframe.add(jButton);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setLocationRelativeTo(null);
		jframe.setVisible(true);

	}

	@Override
	public void ring(int minutesSpent) {
		label.setText("Take rest! " + minutesSpent +" "+getTimeUnitAsString()+" passed.");
		if (!jframe.isVisible()) {
			jframe.setVisible(true);
		}
	}

	@Override
	public void dismiss() {
		if (jframe.isVisible())
			jframe.setVisible(false);

	}

	@Override
	public String getName() {
		return "Java Swing Stretchly Reminder App";
	}
}
