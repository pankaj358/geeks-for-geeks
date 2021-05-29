
/**
*
*  https://practice.geeksforgeeks.org/problems/minimum-deletitions1648/1
*
*/


public class PalindromeIII
{
  
  public int minimumNumberOfDel(String str)
  {
     int pos[] = tillPalindrome(str);
     
     if(pos[0] == 0 && pos[1] == 0)
      return 0;

     return 1 + Math.min(minimumNumberOfDel(str.substring(pos[0], pos[1])), minimumNumberOfDel(str.substring(pos[0] + 1, pos[1] + 1)));
  }

  
  private int[] tillPalindrome(String str)
  {
     int l = 0;
     int r = str.length() - 1;

     while(l < r && str.charAt(l) == str.charAt(r))
     {
        l++;
        r--;
     }
   
    int tmp[] = new int[2];
    
    if(l < r)
    {
       tmp[0] = l;
       tmp[1] = r;
    }
  
    return tmp; 
  }
   
  public static void main(String[] args)
  {
     PalindromeIII pali=new PalindromeIII();
     int ans = pali.minimumNumberOfDel("hello");
     System.out.println(3 == ans);
  }
 
}
