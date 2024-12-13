package ajou.usedkoi.test1213;

import ajou.usedkoi.test1213.dto.MemoDTO;
import ajou.usedkoi.test1213.service.MemoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ServiceTest {
    // 대입되는 인스턴스는 MemberServiceImpl 클래스의 인스턴스 형태
    // 변수를 선언할 때는 MemberService 인터페이스 타입으로 설명
    // 확인하고자 하는 것은 메서드의 수행여부인데, MemberServiceImpl은 구현체이고
    // 실제 외부에서 바라볼 때는 MemberService 인터페이스를 바라보기 때문

    // 주입을 받는 방법
    // 변수 위에 @Autowired를 이용해서 주입, setter를 이용해서 주입
    //final로 변수를 선언하고, 클래스 상단에 @RequiredArgsCOnstructor를 이용

    @Autowired
    MemoService memoService;

    @Test
    public void testDependency(){
        System.out.println(memoService.getClass().getName());
    }

    @Test
    public void testInsert(){
        MemoDTO memoDTO = MemoDTO.builder().memoText("서비스테스트").build();
        System.out.println(memoService.saveMemo(memoDTO));
    }
}
