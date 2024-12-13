package ajou.usedkoi.test1213.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder  // @builder를 쓰면 생성자를 사용할 필요가 없음
public class MemoDTO {
    private Long mno;
    private String memoText;
}
