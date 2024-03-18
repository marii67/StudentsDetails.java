import Java.utill.scanner;
Public class StudentsDetails{
public Static void main(String [] args){
Scanner scanner=new Scanner(System.in);
System.out.println("Enter your marks");
Int marks=Scanner.nextInt();
If(marks<39){
 System.out.println("F");
} else if(marks>=39&&marks<40){
system.out.println("E");
} else if(marks>=40&&marks<49){
system.out.println("D");
} else if(marks>=50&&marks<59){
system.out.println("C");
} else if(marks>=60&&marks<69){
system.out.println("B");
} else if(marks>=70&&marks<579){
system.out.println("A");
}else{
System.out.println("No Marks Awarded");
}
}
}