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
        System.out.println("---------------lay phan tu--------------");
        System.out.println(myList.get(2));
        System.out.println("------------------lay kich thuoc mang---------------");
        System.out.println(myList.size());
        System.out.println("-------------Gia tri xoa------------------");
        System.out.println("remove" + myList.remove(2));
        System.out.println("---------Danh sach cac phan tu trong mang------------");
        myList.show();
        System.out.println("----------Clone phan tu trong mang---------------------");
        MyList myList1 = (MyList<String>) myList.clone();
        myList1.show();
        System.out.println("----------clear cac phan tu trong mang------------");
        myList.clear();
        myList.show();
    }
}
