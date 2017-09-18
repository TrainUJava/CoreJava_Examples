interface Inter
{
void show();
void fun();
}

class Inter1 implements Inter
{
public void show()
{
System.out.println("This is show()....");
}

public void fun()
{
System.out.println("This is fun()....");
}

};


class InterDemo
{
public static void main(String[] s)
{
Inter1 i = new Inter1();

i.show();
i.fun();
}

};