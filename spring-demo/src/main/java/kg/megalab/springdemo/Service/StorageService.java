package kg.megalab.springdemo.Service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class StorageService {

    private List<String> list=new ArrayList<>();
    public List<String> getList(){
        return list;
    }
    public void addToList(String str){
        if (isExist(str)){
            log.error("String {} is already exist", str);
            return;
        }
        list.add(str);
        log.info("String {} added to list",str);
    }

    public boolean deleteStringFromList(String str){
    if (!isExist(str)){
        log.error("String {} not exist in list",str);
        return false;
    }
    boolean isDeleted = list.remove(str);
        log.info("String {} deleted from list",str);
        return isDeleted;
    }


    public boolean isExistInList(String str){
        return isExist(str);
 }
    private  boolean isExist(String str) {
        return list.contains(str);
    }

}


