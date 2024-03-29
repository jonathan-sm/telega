package com.example.telega.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.telega.entity.NotificationTask;

import java.time.LocalDateTime;
import java.util.List;

public interface NotificationTaskRepository extends JpaRepository<NotificationTask, Long> {

    List<NotificationTask> findAllByExecDate(LocalDateTime localDateTime);
}