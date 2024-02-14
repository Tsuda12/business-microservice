package com.tsuda.email.repositories;

import com.tsuda.email.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;


public interface EmailRepository extends JpaRepository<EmailModel, UUID> {
}
