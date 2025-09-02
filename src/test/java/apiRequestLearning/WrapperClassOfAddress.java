package apiRequestLearning;

import java.util.List;

public class WrapperClassOfAddress 
{
	private List<InnerAddressClass> address;
	WrapperClassOfAddress()
	{
		
	}
	WrapperClassOfAddress( List<InnerAddressClass> address)
	{
		this.address=address;
	}

	public List<InnerAddressClass> getAddress() 
	{
		return address;
	}

	public void setAddress(List<InnerAddressClass> address) 
	{
		this.address = address;
	}
	

}
