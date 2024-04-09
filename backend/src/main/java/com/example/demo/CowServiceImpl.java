package com.example.demo;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CowServiceImpl implements CowService {

    private final Map<Integer, Cow> cows = new HashMap<>();
    private int nextId = 1;

    @Override
    public List<Cow> getAllCows() {
        return new ArrayList<>(cows.values());
    }

    @Override
    public Cow getCowById(int id) {
        return cows.get(id);
    }

    @Override
    public Cow createCow(Cow cow) {
        // Assign the next available ID to the cow
        cow.setId(nextId++);
        cows.put(cow.getId(), cow);
        return cow;
    }

    @Override
    public Cow updateCow(int id, Cow updatedCow) {
        if (cows.containsKey(id)) {
            updatedCow.setId(id);
            cows.put(id, updatedCow);
            return updatedCow;
        }
        return null; // Cow not found
    }

    @Override
    public void deleteCow(int id) {
        cows.remove(id);
        if (id == nextId - 1) {
            // If so, decrement the nextId to maintain a continuous sequence
            nextId--;
        }
    }
}
