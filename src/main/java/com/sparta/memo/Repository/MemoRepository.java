package com.sparta.memo.Repository;

import com.sparta.memo.entity.Memo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface MemoRepository extends JpaRepository<Memo, Long>{

    // SQL을 사용하지 않아도 메서드 이름을 읽고 자동으로 생성해줌
    List<Memo> findAllByOrderByModifiedAtDesc();
    }

