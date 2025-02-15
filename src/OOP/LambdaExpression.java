package OOP;
//Lambda Expressions only work with functional interface.

@java.lang.FunctionalInterface
interface Lambda {
    int add(int i, int j);
}

public class LambdaExpression {
    public static void main(String[] args) {
        Lambda obj = (i, j) ->  i + j;
        int result = obj.add(5,4);
        System.out.println(result);
    }
}
