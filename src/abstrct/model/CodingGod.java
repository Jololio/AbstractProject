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
		if(knowledge.contains("Genius"))
		{
			System.out.println("K n o w l e d g e");
		}
		else
		{
			System.out.println("You can't compare to the Coding God Himself");
		}
		return knowledge;
	}
	
	public String getCode()
	{
		if(code.contains("Logic"))
		{
			System.out.println("You're taking the AP test, right?");
		}
		else
		{
			System.out.println("Shameful");
		}
		return code;
	}
	
	public int getSpeed()
	{
		if(speed >= 20)
		{
			System.out.println("Speaking so fast leaving my ears in scorching flames of Coding Heat");
		}
		else
		{
			
			System.out.println("You can't match his speed, nor can you match his momentum");
		}
		return speed;
	}
	
	public boolean getCookingStatus()
	{
		if(isCooking = true);
		{
			System.out.println("He consumes sriracha and spits flames of Knowledge");
		}
		return isCooking;
	}
	
	public void setKnowledge(String knowledge)
	{
		this.knowledge = knowledge;
	}
	
	public void setCode(String code)
	{
		this.code = code;
	}
	
	public void setSpeed(int speed)
	{
		this.speed = speed;
	}
	
	public void setCookingStatus()
	{
		this.isCooking = true;
	}
	
}
