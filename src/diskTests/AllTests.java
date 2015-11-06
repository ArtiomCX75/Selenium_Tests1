package diskTests;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
//import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
//@SuiteClasses({ Test_Reg_Aud.class, Test_Reg_Pred.class })
@Suite.SuiteClasses({
TestLogin.class,
TestInviteAndReg.class

})
public class AllTests {
}