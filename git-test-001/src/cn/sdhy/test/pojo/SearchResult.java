package cn.sdhy.test.pojo;

import java.io.Serializable;
import java.util.List;

public class SearchResult implements Serializable {

    private long totalCount;
    private long totalPages;
    private List<String> stringList;

    public long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }

    public long getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(long totalPages) {
        this.totalPages = totalPages;
    }

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }
}
