class InsufficientBalanceException extends Exception{

double amt;
InsufficientBalanceException( String name,double a){
super(name);
amt = a;
}

public String toString(){
return " Exception Thrown is  [" + amt+"]";
}
};

class Withdraw {
double balance=500;
public void withdraw( double amount){
try{
	if(balance<amount)
throw new InsufficientBalanceException( "Insufficient balance",amount);
System.out.println(" Transaction Successful!!");
}
catch(InsufficientBalanceException e){
System.out.println(e.getMessage());

}
}
};

class MyCustomException{ 
public static void main( String[] args){

Withdraw w= new Withdraw();
w.withdraw(700);
w.withdraw(300);
w.withdraw(600);
}
};

