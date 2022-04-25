package strategy_2;

public class King extends Character {

	public King() {
		weapon = new SwordBehavior();
	}
	@Override
	public void fight() {
		// TODO Auto-generated method stub
		weapon.useWeapon();
	}
	
}
