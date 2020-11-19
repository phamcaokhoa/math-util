/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khoapc.util.test;

import math.util.MathUtil;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Khoa Pham
 */
public class MathUtilityTest {
    
        // Test các tình huống xài hàm getFactorial() ở đây
        // Tình huống là các tham số đưa vào: dương, âm, dương trong khoảng 0-20, ngoài khoảng
        // Tình huống xài hàm, test hàm gọi là TEST CASE
        // Thường ta có tình huống thành công và thất bại
        // Thành công: đưa vào value hợp lệ 0-20
        // Thất bại: đưa vào âm, > 20, Error
        // Hàm phải bắt các tình huống này, và giờ ta test thử coi hàm xử lí đúng không
        
        @Test //biến hàm này thành public static void main()
        //quy tắc đặt tên hàm cho việc test phần mềm rất nhiều quy tấc
        // Nhưng không giống quy tắc đặt tên hàm khi viết app
        // Mình đang viết code để test app
        
        // Mình muốn test hàm trả về ngon nếu đưa tham số ngon
        public void getFactorial_Runwell_IfValidArgument(){
            assertEquals(120, MathUtil.getFactorial(5));
            // Muốn check xem có đúng là gọi hàm 5! trả về 120 hay không?
            // Có Xanh hông, Đỏ hông
            assertEquals(720, MathUtil.getFactorial(6));
            assertEquals(24, MathUtil.getFactorial(4));
            assertEquals(6, MathUtil.getFactorial(3));
            assertEquals(1, MathUtil.getFactorial(0));
            assertEquals(1, MathUtil.getFactorial(1));
            
            // kì vọng thấy xanh trên GIT
        }
        
}

// MẶC ĐỊNH CODE TEST ĐỘC LẬP VỚI CODE CHÍNH
// ĐỘC LẬP VỚI QUÁ TRÌNH CLEAN&BUILD, TỨC LÀ DÙ CODE BẠN XANH HAY ĐỎ
// MIỄN LÀ KHÔNG BỊ ERROR CÚ PHÁP
// BẠN LUÔN ĐÓNG GÓI RA ĐƯỢC FILE .JAR .WAR (CHẤP XANH ĐỎ)


//HỢP LOGIC THÌ MÀU XANH, TỨC LÀ HÀM CHUẨN THÌ MỚI RA ĐƯỢC .JAR .WAR
// VẬY TA CẦN CÓ 1 CÁCH GÀI XANH ĐỎ VÀO QUY TRÌNH BUILD .JAR, .WAR
// CÁCH KHÁC: NẾU CODE TEST ĐANG MÀU ĐỎ THÌ DISABLE CÁI NÚT CLEAN&BUILD