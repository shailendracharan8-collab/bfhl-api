package com.shailendra.bfhl_api.service;

import com.shailendra.bfhl.model.ResponseData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BfhlService {

    public ResponseData process(List<String> input) {

        List<String> numbers = new ArrayList<>();
        List<String> alphabets = new ArrayList<>();

        for(String item : input){

            if(item.matches("\\d+")){
                numbers.add(item);
            }else{
                alphabets.add(item);
            }
        }

        ResponseData response = new ResponseData();

        response.setIs_success(true);
        response.setUser_id("shailendra_charan_26052026");
        response.setEmail("yourmail@gmail.com");
        response.setRoll_number("BT22CY001");
        response.setNumbers(numbers);
        response.setAlphabets(alphabets);

        return response;
    }
}