interface Inter1
{
void show();
}

interface Inter2
{
void fun();
}


class InterImpl implements Inter1,Inter2
{
public void show()
{
System.out.println("This is show().......");
}

public void fun()
{
System.out.println("This is fun().......");
}

};


class InterDemo2
{
public static void main(String[] s)
{
InterImpl i = new InterImpl();

i.fun();
i.show();

Inter1 i1 = new Interimpl();

i1.fun();//Error!!!

inter2 i2 = new InterImpl();
i2.show();//Error!!!!
}
};