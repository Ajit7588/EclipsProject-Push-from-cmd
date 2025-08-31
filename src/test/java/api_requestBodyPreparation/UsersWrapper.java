package api_requestBodyPreparation;

public class UsersWrapper 
{
	private InnerClass user;
	UsersWrapper(InnerClass user)
	{
		this.user=user;
	}

	public InnerClass getUser() {
		return user;
	}

	public void setUser(InnerClass user)
	{
		this.user = user;
	}
	

}
