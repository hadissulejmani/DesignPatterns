package strategy_2;

public abstract class Character {
	WeaponBehavior weapon;
	
	public void fight() {
		weapon.useWeapon();
	};
}
