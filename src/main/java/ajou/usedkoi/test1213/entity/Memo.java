package ajou.usedkoi.test1213.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="tbl_memo")
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Memo {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long mno;

    @Column(length=200, nullable=false)
    private String memoText;

}
