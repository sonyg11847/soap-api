package com.mypractice.soap_api.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;


import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;

@RequiredArgsConstructor
@Repository
public class InfoRepository {
    public String get(String filename) {
        System.out.println("I am in Repository.get");

        String pathStr = "C:\\Work\\Project\\soap-api\\src\\main\\resources\\data\\";

        Path path = Path.of(pathStr + filename);
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader br = Files.newBufferedReader(path);
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
        } catch (Exception e) {}

        return sb.toString();
    }


}
