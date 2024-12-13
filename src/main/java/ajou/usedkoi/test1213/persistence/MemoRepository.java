package ajou.usedkoi.test1213.persistence;

import ajou.usedkoi.test1213.entity.Memo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemoRepository extends JpaRepository <Memo, Long> {
}
