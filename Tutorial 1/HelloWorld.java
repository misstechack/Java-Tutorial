class HelloWorld {
public static void main (String args[]) {
int n = args.length;
System.out.println("Hello World!");
while(n > 0) {
System.out.print(args[n-1] + " ");
n--;
}
}
}