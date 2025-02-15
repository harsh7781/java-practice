package OOP;
// class -- class -> extends
// interface -- interface -> extends
// class -- interface -> implements

interface AA
{
    //	public abstract void show();
//	public abstract void config();
    int age=44;            // final and static
    String area="Mumbai";

    void show();
    void config();
}

interface X
{
    void run();
}
interface Y extends X
{

}

class BB implements AA,Y
{
    public void show()
    {
        System.out.println("in show");
    }
    public void config()
    {
        System.out.println("in cofing");
    }
    public void run()
    {
        System.out.println("running...");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {

        AA obj;
        obj=new BB();

        obj.show();
        obj.config();

        X obj1=new BB();
        obj1.run();

        //   	A.area="Hyderabad";

        System.out.println(AA.area);

    }
}