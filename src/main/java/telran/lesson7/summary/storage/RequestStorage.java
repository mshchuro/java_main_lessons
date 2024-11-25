package telran.lesson7.summary.storage;

import java.util.ArrayList;
import java.util.List;

public class RequestStorage {

    private List<List<String>> requestList = new ArrayList<>();

    public RequestStorage(List<List<String>> requestList) {
        this.requestList = requestList;
    }

    public List<List<String>> getRequestList() {
        return requestList;
    }

    public void setRequestList(List<List<String>> requestList) {
        this.requestList = requestList;
    }
}
