package com.moveandcash.moveandcash.service;

import com.moveandcash.moveandcash.dto.MainItemDto;
import com.moveandcash.moveandcash.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;

    @Transactional(readOnly = true)
    public List<MainItemDto> getMainItemList(Long memberId) {
        return itemRepository.getMainItemList(memberId);
    }
}
