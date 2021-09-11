package com.hmall.common.client;

import com.hmall.common.dto.Item;
import com.hmall.common.dto.PageDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "itemservice")
public interface ItemClient {
    @GetMapping("/item/list")
    PageDTO<Item> queryItemByPage(@RequestParam("page") Integer page, @RequestParam("size") Integer size);
}
