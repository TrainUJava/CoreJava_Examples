interface Inter3
{
int i=10;
int j=30;
}

class IntvarDemo implements Inter3
{
public static void main(String[] s)
{
IntvarDemo d = new IntvarDemo();

d.i = 20;
d.j = 40;
}
};