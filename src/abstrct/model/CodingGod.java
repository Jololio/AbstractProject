package abstrct.model;

public abstract class CodingGod implements Cody
{
	private String knowledge;
	private String code;
	private int speed;
	private boolean isCooking;

	public CodingGod()
	{
		this.knowledge = "";
		this.code = "";
		this.speed = 0;
		this.isCooking = false;
	}
	
	public String getKnowledge()
	{
		return knowledge;
	}
	
	public String getCode()
	{
		return code;
	}
	
	public int getSpeed()
	{
		return speed;
	}
	
	public boolean getCookingStatus()
	{
		return false;
	}
	
	public void setKnowledge()
	{
		this.knowledge = knowledge;
	}
	
	public void setCode()
	{
		this.code = code;
	}
	
	public void setSpeed()
	{
		this.speed = speed;
	}
	
	public void setCookingStatus()
	{
		this.isCooking = true;
	}
	
}
