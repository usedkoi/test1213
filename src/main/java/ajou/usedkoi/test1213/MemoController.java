package ajou.usedkoi.test1213;

import ajou.usedkoi.test1213.dto.MemoDTO;
import ajou.usedkoi.test1213.service.MemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemoController {
    @Autowired
    //@Qualifier("클래스의이름을 상급자만 소문자로")
    private final MemoService memoService;

    @PostMapping("/save")
    public ResponseEntity<MemoDTO> saveMemo(@RequestBody MemoDTO memoDTO){
        MemoDTO result = memoService.saveMemo(memoDTO);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
}
