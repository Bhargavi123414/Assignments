class SingletonInheritanceCheck{
    public static SingletonInheritanceCheck sic = null;
    SingletonInheritanceCheck(){
        System.out.println("Instance created");
    }
    public static SingletonInheritanceCheck getInstance(){
        if(sic ==  null){
            sic = new SingletonInheritanceCheck();
        }
        return sic;
    }
}

class createCheck extends SingletonInheritanceCheck{
    
}
public class Assignment2Q1 {
    public static void main(String[] args) {
        SingletonInheritanceCheck sIC = SingletonInheritanceCheck.getInstance();

        
        SingletonInheritanceCheck chk = new SingletonInheritanceCheck();
    }
}