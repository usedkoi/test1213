package ajou.usedkoi.test1213;

import ajou.usedkoi.test1213.entity.Memo;
import ajou.usedkoi.test1213.persistence.MemoRepository;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.stream.IntStream;


@SpringBootTest
public class RepositoryTest {
    @Autowired
    MemoRepository memoRepository;


    //주입 확인
    //bean이 제대로 생성되고 주입이 되었는지 확인
    @Test
    public void testDependency(){
        System.out.println(memoRepository.getClass().getName());
    }


    //테이블 과 연결되었는지 확인
    @Test
    public void testInsert(){
        IntStream.range(1, 100).forEach(i -> {
            Memo memo = Memo.builder().memoText("Sample..." + i).build();
            memoRepository.save(memo);
        });
    }
}

