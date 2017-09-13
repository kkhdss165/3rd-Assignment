class Sports 
{
	String getName() 
	{
		return "Generic Sports";
	}
	void getNumberOfTeamMembers()
	{
		System.out.println("Each team has n players in " + getName() );
	}
}
class Soccer extends Sports
{
	int scrN = 11;	//축구 경기 인원수
	@Override
	String getName() 
	{
		return "Soccer Class";
	}	
	@Override
	void getNumberOfTeamMembers()
	{
		System.out.println("Each team has " + scrN + " players in a " + getName());
	}
}
public class Assignment_3rd 
{
	public static void main(String[] args)
	{	// TODO 자동 생성된 메소드 스텁
		Sports spt = new Sports();
		Soccer scr = new Soccer();
		
		System.out.println(spt.getName());
		spt.getNumberOfTeamMembers();
		
		System.out.println(scr.getName());
		scr.getNumberOfTeamMembers();
	}
}