package dev.java10x.magicfridgeai.controller;
import dev.java10x.magicfridgeai.model.FoodItem;
import dev.java10x.magicfridgeai.service.FoodItemService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodItemController {

    private FoodItemService service;

    public FoodItemController(FoodItemService service) {
        this.service = service;
    }

    //POST
    @PostMapping
    public ResponseEntity<FoodItem> criar(@RequestBody FoodItem foodItem) {
        FoodItem salvo = service.salvar(foodItem);
        return ResponseEntity.ok(salvo);
    }

    //GET - Listar Todos
    @GetMapping
    public ResponseEntity<List<FoodItem>> listar() {
        return ResponseEntity.ok(service.listar());
    }

    //GET - Listar por ID
    @GetMapping("/{id}")
    public ResponseEntity<FoodItem> buscarPorId(@PathVariable Long id) {
        FoodItem foodItem = service.buscarPorId(id);
        if (foodItem == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(foodItem);
    }

    //PUT - Alterar
    @PutMapping("/{id}")

    public ResponseEntity<FoodItem> alterar(@PathVariable Long id,
                                            @RequestBody FoodItem foodItem) {
        FoodItem atualizado = service.alterar(id, foodItem);
        if (atualizado == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(atualizado);
    }

    //UPDATE
    @PutMapping("/{id}")
    public ResponseEntity<FoodItem> atualizar(@RequestBody FoodItem foodItem,
                                              @PathVariable Long id) {
        FoodItem atualizado = service.alterar(id, foodItem);
        if (atualizado == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(atualizado);
    }

    //DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        boolean deletado = service.deletar(id);
        if (!deletado) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.noContent().build();

    }
}
