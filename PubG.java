class PubG 
{
	static void signup()
	{
		String username="Raina";
		long phonenum=1234567890;
		String emailid="sureshraina@gmail.com";
		String password="********";
		String gender="Male";
		String dob="DD/MM/YYYY";
		String country="India";
		int pincode=560001;
		System.out.println("First name is "+username);
		System.out.println("Phone Number is "+phonenum);
		System.out.println("Email-id is "+emailid);
		System.out.println("Gender is "+gender);
		System.out.println("DOB is "+dob);
		System.out.println("Country is "+country);
		System.out.println("Pincode is "+pincode);
		System.out.println("Signup Successfully Done");
	}
	static void login()
	{
		String username="sureshraina@gmail.com";
		String password="********";
		System.out.println("Login successfully Done");
    }
	static void homepage()
	{
		String s1="Brothers in Arms";
		String s2="Team-up Platform";
		String s3="Workshop";
		String s4="Start";
        System.out.println(s1+" "+s2+" "+s3+" "+s4);
	}
	static void order()
    {
		String o1="UC";
		String o2="Skin";
		String o3="outfit";
		System.out.println("Your orders are");
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o3);
	}
	public static void main(String[] args) 
	{
		System.out.println("New Theme : Winter Festival");
		signup();
		login();
		homepage();
		order();
		System.out.println("Logged out successfully");
    }
}
