package com.example.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
//@SuiteClasses({ Test_Reg_Aud.class, Test_Reg_Pred.class })
@Suite.SuiteClasses({
Test_Reg_Aud.class, 
Test_Reg_Pred.class })


public class AllTests {

}
/*
один тестовый класс логин-логаут в котором обычные методы логин и логаут.
в других (тестовых) методах вызывать методы логин/логаут








*/