package com.ktdsuniversity;

public interface Unit {
	// abstract 생략 가능
	/**
	 * 이동
	 */
	public void move();
	/**
	 * 정지
	 */
	public void stop();
	/**
	 * 홀드
	 */
	public void hold();
	/**
	 * 정찰
	 */
	public void patrol();
	
}
