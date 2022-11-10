package com.idicreativa.conferencedemo.repositories;

import com.idicreativa.conferencedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
