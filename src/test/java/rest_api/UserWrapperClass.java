package rest_api;

public class UserWrapperClass 
{
	private InnerUser user;
	public InnerUser getUser() 
	{
		return user;
	}
	public void setUser(InnerUser user)
	{
		this.user = user;
	}
	UserWrapperClass(InnerUser user)
	{
		this.user=user;
	}

}
