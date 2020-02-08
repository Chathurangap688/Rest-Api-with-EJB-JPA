package com.test.dao.DAO;

import java.util.ArrayList;
import java.util.List;

public class ListResult<I> {
    // Keep list record
    private List<I> list;

    // Keep record count form db
    private Integer totalCount;

    public ListResult(List<I> list, Integer totalCount) {
        this.list = list;
        this.totalCount = totalCount;
    }

    public ListResult(List<I> list) {
        this.list = list;
        if(list != null){
            this.totalCount = list.size();
        } else {
            this.totalCount = 0;
        }
    }

    public ListResult() {
        this.list = new ArrayList<>();
        this.totalCount = 0;
    }

    public List<I> getList() {
        return list;
    }

    public void setList(List<I> list) {
        this.list = list;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
}