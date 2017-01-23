import java.util.Scanner; 

public class GitCalculator {
  public static void main (String [] args) { 
    Scanner input = new Scanner(System.in);
    
    int firstNum=0, secNum=0, ans=0 ; 
    for(int i=0;i<args.length;i++)
    {
      if(args[1].equalsIgnoreCase("+"))
      {
        System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[2]));
      }
       if(args[1].equalsIgnoreCase("-"))
      {
        System.out.println(Integer.parseInt(args[0])-Integer.parseInt(args[2]));
      if(args[1].equalsIgnoreCase("*"))
      {
        System.out.println(Integer.parseInt(args[0]) * Integer.parseInt(args[2]));
      }
	
      if(args[1].equalsIgnoreCase("/"))
      {
        System.out.println(Integer.parseInt(args[0]) / Integer.parseInt(args[2]));
      }

      break;
    }
  }
  
}
}