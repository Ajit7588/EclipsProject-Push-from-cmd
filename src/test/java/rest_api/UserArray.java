package rest_api;

import java.util.List;

public class UserArray 
{
	private List<InnerUser> users;
	public List<InnerUser> getUsers() {
		return users;
	}
	public void setUsers(List<InnerUser> users) {
		this.users = users;
	}
	UserArray(List<InnerUser> users)
	{
		this.users=users;
	}

}
