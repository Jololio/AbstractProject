package abstrct.model;

public abstract class Country
{
	private String name;
	private boolean hasNatnlAnthem;
	private int yearFounded;
	
	
	public Country(String name)
	{
		this.name = name;
	}
	
	public Country(boolean hasNatnlAnthem)
	{
		
	}
	
	public Country(int yearFounded)
	{
		
	}
	
	public String getName()
	{
		return name;
	}
	
	public boolean getNatnlAnthem()
	{
		return true;
	}
	
	public int getYearFounded()
	{
		return yearFounded;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setNatnlAnthem(boolean hasNatnlAnthem)
	{
		this.hasNatnlAnthem = true;
	}
	
	public void setYearFounded(int yearFounded)
	{
		this.yearFounded = yearFounded;
	}
	
	
}
