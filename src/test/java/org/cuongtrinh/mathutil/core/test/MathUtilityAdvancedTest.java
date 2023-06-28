/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.cuongtrinh.mathutil.core.test;

import org.cuongtrinh.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;


/**
 *
 * @author HIEP PC
 */
public class MathUtilityAdvancedTest {

    //CHUẨN BỊ SẴN RIÊNG TEST DATA, LÁT HỒI FILL VÀO HÀM
    //DDT
    //hàm trả về mảng 2 chiều, kiểu WRAPPER CLASS/OBJECT
    //mảng chứa các cặp n -> expected, ví dụ 0! -> 1, 1! -> 1,...
    public static Object[][] initTestData() {
        Object[][] testData = {
                               {0, 1}, 
                               {1, 1}, 
                               {2, 2}, 
                               {5, 120}, 
                               {6, 7200}
                              };
        return testData;
    }
    
    @ParameterizedTest
    @MethodSource(value = "initTestData")
    public void testFactorialGivenRightArgumentReturnsWell(int n, long expected) {
        //tham số hóa việc đưa test data vào hàm assertE()
        //biến đổi dữ liệu thành tham số cho tổng quát
        //PARAMETERIZED
        assertEquals(expected, MathUtility.getFactorial(n));
    }

}

//TDD vs DDT
//TDD - Test Driven Development
//Kĩ thuật viết code chính đan xen, xen kẽ cùng với viết Test Case/
//Script, tức là quá trình viết code lm app ta viết luôn những đoạn code
//dùng thư viện để test hàm ta vừa lm

// Viết code và viets code test cùng với nhau gọi là kĩ thuật lập trình hướng về kiểm thử


//DDT - Data Driven Testing
//Là kĩ thuật bổt trợ thêm cho kĩ năng TDD
//là kĩ huật viết code mà ta tách riêng những bộ data ra 1 chỗ
//câu lệnh so sánh ra 1 chỗ
//kết nối, map/fill data vào hàm test thông qua các tham số
//{6,120} ->  fill voà 2 biến n, expected và lát hồi 2 biến này
//đc fill vào tiếp cái hàm assertEquals(expected,getF())

//Data đc tách riêng ra.  biến thành tham số cho hàm kiểm thử 
// kĩ thủa nyaf đc gọi là tách data hướng cho việc hiểm thử
//DDT
//Còn gọi 1 tên khác là PARAMETERIZED TESTING
//Kĩ thuật kiểm thử code mà hướng về số hoá các data test

