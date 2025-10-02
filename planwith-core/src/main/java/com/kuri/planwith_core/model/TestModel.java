package com.kuri.planwith_core.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * DB 테이블 매핑 데이터
 */

@Entity
public class TestModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
}
