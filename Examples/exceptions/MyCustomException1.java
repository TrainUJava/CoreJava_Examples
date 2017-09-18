class BalanceException extends Exception
{
public String toString()
{
return " You do not have Sufficient balance..";
}

};

class Withdraw {
double balance=500;
public void withdraw( double amount){
try{
	if(balance<amount)
throw new BalanceException();
System.out.println(" Transaction Successful!!");
}
catch(BalanceException e){
System.out.println(e);

}
}
};

class MyCustomException1{ 
public static void main( String[] args){

Withdraw w= new Withdraw();
w.withdraw(700);
w.withdraw(300);
w.withdraw(600);
}
};