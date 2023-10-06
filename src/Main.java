import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        project value1 = new project() ;
        Arrays_Operations_Interfaces value =value1.arrays_operations();
        int[] arr ={1,2,3,4};
        boolean check=true;
        while(check){
            System.out.println("1.insert \n2.delete \n3.update \n4.firstoccur \n5.lastoccur \n6.sort \n7.max \n8.min \n9.reverse \n10.display \n11.isEmpty \n12.clear \n13.exit");
            int n = sc.nextInt();
            switch (n){
                case 1:{
                    arr=value.insert(arr);
                    break;
                }
                case 2:{
                    arr=value.delete(arr);
                    break;
                }
                case 3:{
                    value.update(arr);
                    break;
                }
                case 4:{
                    System.out.println(value.firstOccur(arr));
                    break;
                }
                case 5:{
                    System.out.println(value.lastOccur(arr));
                    break;
                }
                case 6:{
                    value.sort(arr);
                    break;
                }
                case 7:{
                    System.out.println(value.max(arr));
                    break;
                }
                case 8:{
                    System.out.println(value.min(arr));
                    break;
                }
                case 9:{
                    arr=value.reverse(arr);
                    break;
                }
                case 10:{
                    value.display(arr);
                    break;
                }
                case 11:{
                    value.isEmpty(arr);
                    break;
                }
                case 12:{
                    arr=value.clear(arr);
                    break;
                }
                case 13:{
                    check=false;
                    break;
                }
                default:{
                    System.out.println("Invaild Input");
                    check=false;
                    break;
                }
            }
        }
    }
}