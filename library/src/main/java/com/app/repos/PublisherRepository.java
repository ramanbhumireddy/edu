package com.app.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.models.Publisher;

public interface PublisherRepository extends JpaRepository<Publisher, Integer>{
}