package prog1;

public class Data {
	
	public String ownerid;
	public double value;
	public String ownername;
	
	public int hash;
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ownerid == null) ? 0 : ownerid.hashCode());
		result = prime * result + ((ownername == null) ? 0 : ownername.hashCode());
		long temp;
		temp = Double.doubleToLongBits(value);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}



	public void encrypt(int key)
	{
		this.ownerid= this.convert(this.ownerid, key);
		
		this.ownername= this.convert(this.ownername, key);
		
		this.value= this.value+key;
		
		this.hash= this.hash;
	}
	
	public void decrypt(int key)
	{
		this.ownerid= this.convertRev(this.ownerid, key);
		
		this.ownername= this.convertRev(this.ownername, key);
		
		this.value= this.value-key;
		
		this.hash= this.hash;
	}
	
	
	
	public String convert(String s, int key)
	{
		String ans="";
		for(char ch: s.toCharArray())
		{
			ans=ans+(ch+1);
		}
		return ans;
	}
	
	public String convertRev(String s, int key)
	{
		String ans="";
		for(char ch: s.toCharArray())
		{
			ans=ans+(ch-1);
		}
		return ans;
	}



	public Data(String ownerid, double value, String ownername) {
		super();
		this.ownerid = ownerid;
		this.value = value;
		this.ownername = ownername;
	}
	
	
	
	

}
