package dev.java10x.magicfridgeai.repository;
import dev.java10x.magicfridgeai.model.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodItemRepository extends JpaRepository<FoodItem, Long> {
}
