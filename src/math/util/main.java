/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.util;

/**
 *
 * @author Khoa Pham
 */
public class main {
    public static void main(String[] args) {
        //Test hàm = mắt
        System.out.println("5!: " + MathUtil.getFactorial(5));
        //expected:120,            actual:120
        //Kì vọng kết quả trả về 120 khi gọi hàm getFactorial
        
        //Test bộ data khác, test case, tình huống khác
        System.out.println("0!: " + MathUtil.getFactorial(0));
        //expected:1,            actual:1
        
        
        //e: ném về ngoại lệ IllegalArgumentException
        System.out.println("a" + MathUtil.getFactorial(-1));
        
        
        
        System.out.println("CI for today.");
    }
}

        // Code viết ra thì Dev phải test trước 
        // Có vài hình thức test code khác nhau

        // 1.TDD, Test Driven Development
        // Viết dàn khung của hàm getFactorial
        // Sau đó dựng hàm test()
        // Chạy thử coi xanh đỏ, đỏ nghĩa là lỗi, xanh nghĩa là ổn
        // Cứ liên tục xanh đỏ như thế trong quá trình viết code
        // và sửa code, ngta gọi là lập trình hướng theo thỏa mãn 
        // việc test, TDD
//Cách 2: sout(hàm kèm data) để coi kqua có đúng như mình kì vọng
        //Nó phải trả về như thế hay không -> Xem kết quả test = mắt

//Cách 3: JOPane của bên JavaDesktop để popup kết quả lên màn hình,
        // Vẫn phải xem bằng mắt
//Cách 4: Viết 1 trang web gọi hàm xử lí, ... Hao sức


// -> Dùng cách 1 & 2