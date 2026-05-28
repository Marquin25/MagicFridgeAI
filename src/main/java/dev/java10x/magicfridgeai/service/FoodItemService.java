package dev.java10x.magicfridgeai.service;

import dev.java10x.magicfridgeai.model.FoodItem;
import dev.java10x.magicfridgeai.repository.FoodItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodItemService {

    private FoodItemRepository repository;

    public FoodItemService(FoodItemRepository repository) {
        this.repository = repository;
    }

    // SALVAR
    public FoodItem salvar(FoodItem foodItem) {
        return repository.save(foodItem);
    }

    // LISTAR
    public List<FoodItem> listar() {
        return repository.findAll();
    }

    // BUSCAR POR ID
    public FoodItem buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    // ALTERAR
    public FoodItem alterar(Long id, FoodItem foodItem) {

        FoodItem existente = buscarPorId(id);

        if (existente == null) {
            return null;
        }

        foodItem.setId(id);

        return repository.save(foodItem);
    }

    // DELETAR
    public boolean deletar(Long id) {

        FoodItem existente = buscarPorId(id);

        if (existente == null) {
            return false;
        }

        repository.deleteById(id);

        return true;
    }
}