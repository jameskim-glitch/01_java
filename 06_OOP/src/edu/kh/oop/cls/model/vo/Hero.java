package edu.kh.oop.cls.model.vo;

public class Hero {
	private String nickname;
	private String job;
	private int hp;
	private int mp;
	private int level;
	private double exp;
	
	public Hero(String nickname, String job , int hp,
			int mp, int level,double exp) {
		this.nickname = nickname;
		this.job = job;
		this.hp = hp;
		this.mp = mp;
		this.level = level;
		this.exp = exp;
	}
	
	public void attck(double exp) {
		
	}
	
	public void dash() {
		
	}

	@Override
	public String toString() {
		return "==========캐릭터생성=========\n" + job + "직업으로 " + nickname + "님이 생성되었습니다.\n" +"현재 레벨 :" 
	+ level +"\n" + "현재 HP : " + hp +  "\n" + "현재 MP : " + mp + "\n" + "현재 경험치 : " + exp ;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public double getExp() {
		return exp;
	}

	public void setExp(double exp) {
		this.exp = exp;
	}

}
