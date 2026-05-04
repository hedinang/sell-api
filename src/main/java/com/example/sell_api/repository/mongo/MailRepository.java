package com.example.sell_api.repository.mongo;

import com.example.sell_api.model.entity.Mail;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MailRepository extends MongoRepository<Mail, String> {
    Mail findByMailId(String mailId);

    void deleteByMailId(String mailId);
}
