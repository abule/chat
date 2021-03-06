package com.ua.chat.repository;

import com.ua.chat.model.Chat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChatRepository extends JpaRepository<Chat,Long> {

    List<Chat> findAllByUser_userName(String userName);
}
