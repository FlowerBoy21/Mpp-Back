
package com.example.demo;
import java.util.List;

public interface CowService {
    List<Cow> getAllCows();
    Cow getCowById(int id);
    Cow createCow(Cow cow);
    Cow updateCow(int id, Cow cow);
    void deleteCow(int id);
}