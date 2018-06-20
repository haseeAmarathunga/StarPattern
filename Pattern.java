
/**
 *
 * @author Hasee Amarathunga
 */
public class Pattern {
    public void Pattern1(int n)
    {
        char sym='*';
        for(int i=0 ; i<n-4 ;i++){
            for(int j=0;j<n;j++){
                System.out.print(sym);
            }
            System.out.println("");
    }
    }
    
    public void Pattern2(int n)
    {
        char sym='*';
        for(int i=0 ; i<n-4 ;i++){
            if (i==0 || i==n-5){
                for(int j=0;j<n;j++){
                    System.out.print(sym);
                }
                System.out.println("");
            }
            else{
                System.out.print("*");
                for(int j=0;j<n-2;j++){
                    System.out.print(" ");
                }
                System.out.print("*\n");
            }
    }
    }
    
    public void Pattern3(int n)
    {
        char sym='*';
        for(int i=1 ; i<n+1 ;i++){
            for(int j=0;j<i;j++){
                System.out.print(sym);
            }
            System.out.println("");
    }
    }
        
    public void Pattern4(int n)
    {
        char sym='*';
        for(int i=n ; i>0 ;i--){
            for (int k=0;k<n-i;k++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print(sym);
            }
            System.out.println("");
    }
    }
    
    public void Pattern5(int n)
    {
        char sym='*';
        for(int i=1 ; i<n+1 ;i++){
            for (int k=0;k<n-i;k++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i-1;j++){
                System.out.print(sym);
            }
            System.out.println("");
        }
        for(int p=n-1 ; p>0 ;p--){
            for (int m=n-p;m>0;m--){
                System.out.print(" ");
            }
            for(int j=0;j<2*p-1;j++){
                System.out.print(sym);
            }
            System.out.println("");
       
    }
    }
    
    public static void main(String[] args)
    {
        Pattern p1=new Pattern();
        p1.Pattern1(12);
        System.out.println(" ");
        p1.Pattern2(10);
        System.out.println(" ");
        p1.Pattern3(6);
        System.out.println(" ");
        p1.Pattern4(6);
        System.out.println(" ");
        p1.Pattern5(6);
    }
}
