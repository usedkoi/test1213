package ajou.usedkoi.test1213;

import org.junit.jupiter.api.*;

public class TestLifeCycle {

    @Test
    public void test1() {
        System.out.println("test1");
    }

    @Test
    @DisplayName("Test Case 2")
    public void test2() {
        System.out.println("test2");
    }

    //이 Test는 Test를 할 때 제외 됨
    @Test
    @DisplayName("Test Case 3")
    @Disabled
    public void test3() {
        System.out.println("test3");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("beforeAll");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("afterAll");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("beforeEach");
    }

    @AfterEach
    void afterEach() {
        System.out.println("afterEach");
    }
}
