package com.chatApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chatApp.entities.Message;

public interface MessageRepository extends JpaRepository<Message, Long> {

}
