package com.moveandcash.moveandcash.repository;

import com.moveandcash.moveandcash.dto.MainItemDto;
import com.moveandcash.moveandcash.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long>, ItemRepositoryCustom {

    List<MainItemDto> getMainItemList(Long memberId);
}
