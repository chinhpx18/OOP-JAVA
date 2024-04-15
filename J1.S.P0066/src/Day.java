

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public static Day getDay(String day) {
        try {
            return Day.valueOf(day.toUpperCase()); // chuyển đổi chuỗi đầu vào daythành chữ hoa toUpperCase()
            //để đảm bảo so sánh không phân biệt chữ hoa chữ thường.
        } catch (IllegalArgumentException e) {  // Day.valueOf(day)để lấy Daygiá trị enum tương ứng. 
            return null;  //Nếu đầu vào không khớp với bất kỳ giá trị enum nào, nó sẽ đưa ra IllegalArgumentException.
        }
    }
}
