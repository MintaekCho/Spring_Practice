package com.codestates.order;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/v1/orders", produces = MediaType.APPLICATION_JSON_VALUE)
public class OrderController {
    @PostMapping
    public ResponseEntity  postOrder(@RequestParam("memberId") long memberId,
                            @RequestParam("coffeeId") long coffeeId){

        Map<String, Object> map = new LinkedHashMap<>();
        map.put("memberId", memberId);
        map.put("coffeeId", coffeeId);

        return new ResponseEntity<>(map, HttpStatus.CREATED);
    }

    //특정 주문 정보를 클라이언트 쪽에 제공하는 핸들러 메서드
    @GetMapping("/{order-id}")
    public ResponseEntity  getOrder(@PathVariable("orderId") long orderId){
        System.out.println("# orderId: " + orderId);

        //not implementation
        return new ResponseEntity<>(HttpStatus.OK);
    }

    //주문 목록을 클라이언트에게 제공하는 핸들러 메서드
    @GetMapping
    public ResponseEntity  getOrders(){
        System.out.println("# get Orders");

        //not implementation
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
