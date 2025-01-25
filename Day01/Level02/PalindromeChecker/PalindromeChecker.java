package PalindromeChecker;

public class PalindromeChecker {
   private String text;

    public PalindromeChecker(String text)
    {
        this.text=text;
    }
    public boolean isPalindrome()
    {
        String reverse="";
        for(int i=text.length()-1;i>=0;i--)

        {
             reverse+=text.charAt(i);

        }
        return text.equals(reverse);
       
    }
    public void displayResult()
    {
        if(isPalindrome())
        {
            System.out.println("Text is palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
    public static void main(String[] args) {
        PalindromeChecker checker1 = new PalindromeChecker("madam");
        checker1.displayResult();
        
        
        
    }
}
