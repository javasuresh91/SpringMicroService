package com.demo.microservice.EX_10_MS_LimitService.bean;

public class LimitConfiguration {
	private int maximum;
	private int minimum;

	protected LimitConfiguration() {
	}

	public LimitConfiguration(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}

	/**
	 * @return the maximum
	 */
	public int getMaximum() {
		return maximum;
	}

	/**
	 * @param maximum
	 *            the maximum to set
	 */
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

	/**
	 * @return the minimum
	 */
	public int getMinimum() {
		return minimum;
	}

	/**
	 * @param minimum
	 *            the minimum to set
	 */
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

}
