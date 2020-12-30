package excephandling4;

public class Validator2 {
public static boolean validateNumberofGroups(int groups)throws NumberofGroupsExceedException
{
	if(groups<=5)
		return true;
	else
		throw new NumberofGroupsExceedException("You can only share with upto 5 chats");
}
}
