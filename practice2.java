// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
import java.util.stream.*;
import java.lang.*;
class Main {
    public static <T> void print(List<T>list){
        int n = list.size();
        for(int i = 0; i<n; i++){
            System.out.print(list.get(i) + " ");
        }
    }
    public static void solve_problem1(List<Integer> list)
    {
        //problem 1
//         ## 1. The Filtering Challenge (Easy)
// Task: Given a list of integers, find all even numbers that are greater than 10. Return them as a new list. [1] 

// * Input: [5, 12, 3, 21, 8, 14, 1, 10]
// * Expected Output: [12, 14]

    List<Integer> evenGreaterThan10 = list.stream() //initialization phase
                                      .filter(x -> x > 10 && x%2 == 0) //intermediate phase
                                      .collect(Collectors.toList()); //termination phase
    System.out.println("list of number which are even and greatern than 10");
    print(evenGreaterThan10);
        
    }
    public static  void solve_problem2(List<String>list){
        //problem2
//         ## 2. Name Formatter (Easy)
// Task: Given a list of strings representing names, convert them all to uppercase and sort them alphabetically. [2, 3, 4] 

// * Input: ["arjun", "riya", "amit", "sneha"]
// * Expected Output: ["AMIT", "ARJUN", "RIYA", "SNEHA"]
List<String> answer = list.stream()
                .map(x -> x.toUpperCase())
                .collect(Collectors.toList());
                
                print(answer);


        
    }
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        List<Integer> list1 = new ArrayList<>();
        int n;
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter the size of the list");
        n = sc.nextInt();
        // System.out.println("enter " + n + " numbers!");
        // for(int i = 0; i<n; i++){
        //     int tempvalue = sc.nextInt();
        //     list1.add(tempvalue);
        // }
        // solve_problem1(list1);
        List<String> list2 = new ArrayList<>();
        System.out.println("enter " + n + " string!");
        for(int i = 0; i<n; i++){
            String tempvalue = sc.next();
            list2.add(tempvalue);
        }
        solve_problem2(list2);
        sc.close();
    }
}
