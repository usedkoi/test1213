package ajou.usedkoi.test1213.service;

import ajou.usedkoi.test1213.dto.MemoDTO;
import ajou.usedkoi.test1213.entity.Memo;
import ajou.usedkoi.test1213.persistence.MemoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemoServiceImpl implements MemoService {
    private final MemoRepository memoRepository;

    public MemoDTO saveMemo(MemoDTO memoDTO) {
        //데이터 유효성 검사

        //삽입이나 수정 삭제의 경우는 매개변수로 Repository의 매개변수를 생성
        Memo memo = Memo.builder().memoText(memoDTO.getMemoText()).build();
        //삽입
        memoRepository.save(memo);
        //memoDTO에 삽입된 데이터의 mno가 저장
        memoDTO.setMno(memo.getMno());

        return memoDTO;
    }
}

