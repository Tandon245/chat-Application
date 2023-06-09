package com.tandon.chat.Application.service;

import com.tandon.chat.Application.dao.IStatusRepository;
import com.tandon.chat.Application.model.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatusService {
    @Autowired
    IStatusRepository repository;
    public int saveStatus(Status status){
        Status statusObj=repository.save(status);
        return statusObj.getStatusId();
    }

}
