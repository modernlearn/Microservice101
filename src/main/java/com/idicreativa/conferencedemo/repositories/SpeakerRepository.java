package com.idicreativa.conferencedemo.repositories;

import com.idicreativa.conferencedemo.models.Session;
import com.idicreativa.conferencedemo.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
