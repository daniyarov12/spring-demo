package kg.megalab.springdemo.controller;

import kg.megalab.springdemo.Service.StorageService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/storage")

public class StorageController {
   @Autowired
   private StorageService storageService;
   @GetMapping(value = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> getAllStrings(){
       return storageService.getList();
   }
   @PostMapping(value ="/add")
    public void addToList(@RequestParam String str){
       storageService.addToList(str);
   }
   @DeleteMapping(value = "/delete/{str}")
    public boolean deleteFromList(@PathVariable String str){
       return storageService.deleteStringFromList(str);
   }
@GetMapping(value = "/get/{str}")
public boolean inExist(@PathVariable String str){
       return storageService.isExistInList(str);
}
    }


