package com.tandon.chat.Application.dao;

import com.tandon.chat.Application.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStatusRepository extends JpaRepository<Status,Integer> {
}
