import java.util.Arrays;
import java.util.Scanner;

class project {
   private class Arrays_Operations implements Arrays_Operations_Interfaces {
        public static Scanner sc = new Scanner(System.in);

        public int[] insert(int arr[]) {
            System.out.println("Enter the element value: ");
            int ele = sc.nextInt();
            System.out.println("Enter the position for insertion");
            int pos = sc.nextInt();
            if (pos <= 0 || pos > arr.length + 1) {
                System.out.println("cant be possible");
            } else {
                int[] temp = new int[arr.length + 1];
                for (int j = 0, i = 0; i < temp.length; i++) {
                    if (i == pos - 1) {
                        temp[i] = ele;
                    } else {
                        temp[i] = arr[j++];
                    }
                }
                return temp;
            }
            return arr;
        }

        public int[] delete(int[] a) {
            System.out.println("enter the value to delete");
            int del = sc.nextInt();
            int index = search(a, del);
            if (a.length == 0) {
                System.out.println("array is empty");
            } else if (index == -1) {
                System.out.println("deleting is not possible");
            } else {
                int[] res = new int[a.length - 1];
                for (int j = 0, i = 0; i < a.length; i++) {
                    if (index != i) {
                        res[j++] = a[i];
                    }
                }
                return res;
            }
            return a;
        }

        public int search(int[] a, int del) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] == del) {
                    return i;
                }
            }
            return -1;
        }

        public void update(int[] a) {
            System.out.println("enter the element");
            int new_ele = sc.nextInt();
            System.out.println("enter the old value u want to update");
            int old_ele = sc.nextInt();
            int ind = search(a, old_ele);
            if (a.length == 0) {
                System.out.println("Array is empty");
            } else if (ind == -1) {
                System.out.println("replecing element is not found");
            } else {
                for (int i = 0; i < a.length; i++) {
                    if (i == ind) {
                        a[i] = new_ele;
                    }
                }
            }
        }

        public int firstOccur(int[] a) {
            System.out.println("Enter value for firstOccur");
            int del = sc.nextInt();
            for (int i = 0; i < a.length; i++) {
                if (a[i] == del) {
                    return i;
                }
            }
            return -1;
        }

        public int lastOccur(int[] a) {
            System.out.println("Enter value for LastOccur");
            int del = sc.nextInt();
            for (int i = a.length - 1; i >= 0; i--) {
                if (a[i] == del) {
                    return i;
                }
            }
            return -1;
        }

        public int max(int[] a) {
            int maxValue = 0;
            for (int i = 0; i < a.length; i++) {
                maxValue = Math.max(a[i], maxValue);
            }
            return maxValue;
        }

        public void sort(int[] a) {
            for (int i = 0; i < a.length; i++) {
                for (int j = i; j < a.length - 1 - i; j++) {
                    if (a[j] > a[j + 1]) {
                        int temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                    }
                }
            }
        }

        public int min(int[] a) {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < a.length; i++) {
                min = Math.min(min, a[i]);
            }
            return min;
        }

        public int[] reverse(int[] a) {
            int temp[] = new int[a.length];
            for (int i = a.length - 1; i >= 0; i--) {
                temp[i] = a[i];
                System.out.println(a[i]);
            }
            return temp;
        }

        public void display(int[] a) {
            System.out.println(Arrays.toString(a));
        }

        public void isEmpty(int[] a) {
            if (a.length == 0) {
                System.out.println("Array is empty");
            }
        }

        public int[] clear(int[] a) {
            return new int[0];
        }
    }
    public Arrays_Operations_Interfaces arrays_operations(){
        return new Arrays_Operations();
    }
}
