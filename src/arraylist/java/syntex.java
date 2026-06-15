package arraylist.java;
import java.util.* ;
public class syntex {
    public static void swap(ArrayList<Integer> list ,int idx1,int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        ArrayList<Boolean> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();
//        addition in list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
//        get opperation
        int element = list.get(2);
        System.out.println(element);
//        delete operation
        list.remove(2);
        System.out.println(list);
//        set operation or to change the elemment
        list.set(3,10);
        System.out.println(list);
//        contain
        list.contains(5);
        System.out.println(list); //this is wromg way.
        System.out.println(list.contains(56));
        System.out.println(list.contains(4));
//        add at any index
        list.add(1,8);
        System.out.println(list);
//        size on an arraylist
        System.out.println(list.size());
//        printing of an arraylist
        for (int i =0;i<list.size();i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
//        print reverse of an arraylist
        System.out.println("print reverse of an arraylist");
        for (int i = list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
       System.out.println();
//        find maximum element of an arraylist
        int max = Integer.MIN_VALUE;
        for (int i =0 ; i<list.get(i);i++){
//            if (max < list.get(i)){
//                max = list.get(i);
//                we can also write this program in this way
            max = Math.max(max, list.get(i));
            }
        System.out.println(max);
        int idx1 = 1 ;   int idx2 =4 ;
        System.out.println(list);
        swap(list , idx1,idx2);
        System.out.println(list);
        Collections.sort(list); //assending order
        System.out.println(list);
//        desending order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
//        multidimension arraylist
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>() ;
        ArrayList<Integer> lists = new ArrayList<>() ;
        lists.add(3) ; lists.add(5);
        mainlist.add(lists);
        ArrayList<Integer> lists1 = new ArrayList<>();
        lists1.add(5) ; lists1.add(7) ;
        mainlist.add(lists1);
        for (int i =0 ; i<mainlist.size(); i++){
            ArrayList<Integer> currentlist = mainlist.get(i);
            for (int j =0 ; j< currentlist.size(); j++){
                System.out.println(currentlist.get(j) + " ");
            }
            System.out.println();
        }
        System.out.println(mainlist);
        }
    }

