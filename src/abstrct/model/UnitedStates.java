package abstrct.model;

public class UnitedStates extends Country implements Government
{

	public UnitedStates(boolean hasNatnlAnthem) 
	{
		super(hasNatnlAnthem);
	}
	
	public UnitedStates(String name)
	{
		super(name);
	}
	
	public UnitedStates(int yearFounded)
	{
		super(1776);
	}
	
	public void legislate()
	{
		
	}
	
	public void elect()
	{
		
	}

}
