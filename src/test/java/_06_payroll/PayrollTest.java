package _06_payroll;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PayrollTest {

    Payroll payroll = new Payroll();

    @Test
    void itShouldCalculatePaycheck() {
        //given
double a = 15.5;
int b = 4;
int expected = 62;
        //when
double actual = payroll.calculatePaycheck(a, b);
        //then
assertEquals(expected, actual);
    }

    @Test
    void itShouldCalculateMileageReimbursement() {
        //given
int b = 12;
double expected = 12 * .575;
        //when
//double actual = payroll.calculateMileageReimbursement(b);
        //then
assertEquals(expected, payroll.calculateMileageReimbursement(b));
    }

    @Test
    void itShouldCreateOfferLetter() {
        //given
String a = "John";
double b = 15.5;
String expected = "Hello " + a + ", We are pleased to offer you an hourly wage of " + b;
        //when
String actual = payroll.createOfferLetter(a, b);
        //then
assertEquals(expected, actual);
    }

}