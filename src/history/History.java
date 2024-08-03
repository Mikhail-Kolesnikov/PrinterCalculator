package history;

import java.util.ArrayList;
import java.util.List;

public class History {

    private List<OperationWithHistory> listHistory = new ArrayList<>();

    public void operations (OperationWithHistory operationWithHistory){
        listHistory.add(operationWithHistory);
    }
    public void printHistory(){
        for (OperationWithHistory operation : listHistory) {
            System.out.println(operation);

        }

        }
    }

