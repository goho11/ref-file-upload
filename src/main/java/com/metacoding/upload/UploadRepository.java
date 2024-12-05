package com.metacoding.upload;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class UploadRepository {
    private final EntityManager em;

    public void save(Upload upload) {
        em.persist(upload);
    }

    public Upload findById(int id) {
        return em.find(Upload.class, id);
    }
}