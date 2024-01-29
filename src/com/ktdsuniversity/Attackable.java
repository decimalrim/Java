package com.ktdsuniversity;

/**
 * 공격 가능한 유닛 인터페이스
 * 인터페이스는 인터페이스만 상속할 수 있다.
 * 
 * 변경변경
 */
public interface Attackable extends Unit {
	
	public void attack();

}
