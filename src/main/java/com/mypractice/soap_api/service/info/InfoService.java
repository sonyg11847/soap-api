package com.mypractice.soap_api.service.info;

import com.mypractice.soap_api.domain.InfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class InfoService {
    private final InfoRepository infoRepository;
    public String get(String filename) {
        System.out.println("I am in InfoService.get");

        return infoRepository.get(filename);
//        return "dummy_response";
    }
}
