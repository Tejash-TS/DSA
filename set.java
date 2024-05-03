import java.util.*;
class tejashset{
   
    public static void insert(Set<Integer> set,String name)
{
Scanner s=new Scanner(System.in);
System.out.println("enter a how many element wnats to enter");
int a=s.nextInt();
for(int i=0;a>=i;i++){
    System.out.println("enter element");
    int x=s.nextInt();
    set.add(x);
    System.out.println(set);
}
System.out.println("element added sucessfully");
}
public static void delete(Set<Integer>set,String name){
    Scanner s=new Scanner(System.in);
    System.out.println("enter element to delet");
    int x=s.nextInt();
    set.remove(x);
    System.out.println("element delrte sucessfully");

}
public static void display(Set<Integer>set,String name){
   
    
    
    System.out.println("set is"+set);

    
}
public static boolean search(Set<Integer>set,String name){
    Scanner s=new Scanner(System.in);
    System.out.println("emter element to search");
    int x=s.nextInt();
  return(set.contains(x));
}

public static void union(Set<Integer> setA,Set<Integer> setB){
    Set<Integer>U = new HashSet<>(setA);
    U.addAll(setB);
    System.out.println("union of set="+U);
}
public static void Intersection(Set<Integer> setA,Set<Integer> setB) {
    Set<Integer>I=new HashSet<>(setA);
    I.retainAll(setB);
    System.out.println("Intersection="+I);
}
public static void diffrence(Set<Integer> setA,Set<Integer> setB){
Set<Integer> I= new HashSet<>(setA);
I.removeAll(setB);
System.out.println("diffrence="+I);
}
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    Set<Integer> setA=new HashSet<>();
    Set<Integer> setB=new HashSet<>();

      
           

  while(true){
    System.out.println("\nMenu:");
    System.out.println("1. Add element to set A");
    System.out.println("2. Add element to set B");
    System.out.println("3. Delete element from set A");
    System.out.println("4. Delete element from set B");
    System.out.println("5. Display elements from set A");
    System.out.println("6. Display elements from set B");
    System.out.println("7. Search element in set A");
    System.out.println("8. Search element in set B");
    System.out.println("9. Size of set A");
    System.out.println("10. Size of set B");
    System.out.println("11. Union of sets");
    System.out.println("12. Intersection of sets");
    System.out.println("13. Difference of sets");
  
    System.out.println("0. Exit");


    
    int ch = s.nextInt();
 switch (ch) {
                case 1:
                insert(setA, "A");
                    break;
                case 2:
                insert(setB, "B");
                    break;
                case 3:
                delete(setA, "A");
                    break;
                case 4:
                delete(setB, "B");
                    break;
                case 5:
                    display(setA, "A");
                    break;
                case 6:
                    display(setB, "B");
                    break;
                case 7:
                    search(setA, "A");
                    break;
                case 8:
                    search(setB, "B");
                    break;
                case 9:
                    System.out.println("Size of set A: " + setA.size());
                    break;
                case 10:
                    System.out.println("Size of set B: " + setB.size());
                    break;
                case 11:
                union(setA, setB);
                    break;
                case 12:
                    Intersection(setA, setB);
                    break;
                case 13:
                diffrence(setA, setB);
                    break;
                case 14:
                  
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");  
 }
}

    
}

}
