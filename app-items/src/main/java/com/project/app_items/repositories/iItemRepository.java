package com.project.app_items.repositories;

import com.project.app_items.entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iItemRepository extends JpaRepository<Item,Long> {

}
