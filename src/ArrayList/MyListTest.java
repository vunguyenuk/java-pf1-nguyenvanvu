package ArrayList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> myList = new MyList <String>();
        myList.add(0, "Vu");
        myList.add(1,"Dung");
        myList.add(2,"Loc");
        myList.add(3,"An");

        System.out.println("lay phan tu: ");
        System.out.println(myList.get(1));

        System.out.println(myList.size());
        System.out.println("Gia tri xoa: ");
        System.out.println(myList.remove(0));
        System.out.println("Gia tri cu: ");
        System.out.println(myList.remove(0));
    }
}
