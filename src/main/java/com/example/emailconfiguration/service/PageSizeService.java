package com.example.emailconfiguration.service;

import com.example.emailconfiguration.model.PageSize;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PageSizeService {
    private static List<PageSize> pageSizeList = new ArrayList<>();

    static {
        pageSizeList.add(new PageSize(1, 5));
        pageSizeList.add(new PageSize(2, 10));
        pageSizeList.add(new PageSize(3, 15));
        pageSizeList.add(new PageSize(4, 25));
        pageSizeList.add(new PageSize(5, 50));
        pageSizeList.add(new PageSize(6, 100));
    }

    public List<PageSize> findAll() {
        return pageSizeList;
    }
}
