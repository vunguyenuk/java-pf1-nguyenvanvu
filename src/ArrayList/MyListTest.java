package ArrayList;

public class MyListTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        MyList<String> myList = new MyList <String>();
        myList.add(0, "Vu");
        myList.add(1,"Dung");
        myList.add(2,"Loc");
        myList.add(3,"An");
        myList.add(4,"Hieu");
        myList.add(5,"Van");
        System.out.println("---------------Get the element--------------");
        System.out.println(myList.get(2));
        System.out.println("------------------Get the size---------------");
        System.out.println(myList.size());
        System.out.println("-------------Delete value------------------");
        System.out.println("remove" + myList.remove(2));
        System.out.println("---------List of elements in array------------");
        myList.show();
        System.out.println("----------Clone elements from array---------------------");
        MyList myList1 = (MyList<String>) myList.clone();
        myList1.show();
        System.out.println("----------clear elements------------");
        myList.clear();
        myList.show();
    }
}
