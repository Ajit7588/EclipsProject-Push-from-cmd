package apiRequestLearning;

public class ProfileWrapper 
{
	private InnerBody innerBody;
	ProfileWrapper()
	{
		
	}
	ProfileWrapper(InnerBody innerBody)
	{
		this.innerBody=innerBody;
	}
	
	public void setInnerBody(InnerBody innerBody)
	{
		this.innerBody=innerBody;
	}
	public InnerBody getprofile()
	{
		return innerBody;
	}

}
