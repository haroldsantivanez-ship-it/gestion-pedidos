package com.tecsup.delivery.repository;

import com.tecsup.delivery.model.AuditoriaLog;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuditoriaLogRepository
        extends JpaRepository<
        AuditoriaLog,
        Long
        > {
}