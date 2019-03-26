package com.kodilla.testing.forum;
import com.kodilla.testing.user.SimpleUser;     // polecenie dołączenia kodu kod klasy SimpleUser, bez tego nie widzą się bo są w innych pakietach
import org.junit.*;     // import z biblioteki JUnit

public class ForumTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }
    @Test
    public void testCaseUserName(){
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");
        //When
        String result = simpleUser.getUserName();
        System.out.println("Testing " + result);
        //Then
        Assert.assertEquals("theForumUser", result);    // metoda statyczna klasy Assert
    }
    @Test
    public void testCaseRealName(){
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");
        //When
        String result = simpleUser.getRealName();
        System.out.println("Testing " + result);
        //Then
        Assert.assertEquals("John Smith", result);      // metoda statyczna klasy Assert
    }
}
