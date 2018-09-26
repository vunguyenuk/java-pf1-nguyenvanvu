package OOP;

/*
Viết chương trình thực thi như sau:

Nhập vào 3 giá trị cho a, b, c và hiển thị kết quả dựa trên việc tính delta.
Nếu delta >= 0, hiển thị 2 nghiệm. Nếu delta bằng 0,
hiển thị một nghiệm (do 2 nghiệm bằng nhau).
Còn lại hiển thị chuỗi “The equation has no roots”
Chú ý: Sử dụng Math.pow(x, 0.5) để tính căn bậc hai của x.

*/

public class QuadraticEquationMain {
    public static void main(String[] args) {
        QuadraticEquation qe = new QuadraticEquation(1,-8,16);

        if(qe.getDiscriminant() > 0){
            System.out.println("Roots are real and unequal: ");
            System.out.println("x1 = " + qe.getRoot1());
            System.out.println("x2 = " + qe.getRoot2());
            System.out.println(qe.getDiscriminant());
        } else if(qe.getDiscriminant() == 0){
            System.out.println("Roots are real and equal x1 = x2 = " + qe.getEquationSolution());
        } else {
            System.out.println("The equation has no roots");
        }

    }
}
