package com.dgd.dgdback.simple;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SimpleService {

    private final SimpleRepository repository;
    public void jpaTest(){
        SimpleEntity entity = new SimpleEntity("Dummy Data");
        repository.save(entity);
    }
}
