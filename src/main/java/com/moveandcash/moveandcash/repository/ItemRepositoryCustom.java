package com.moveandcash.moveandcash.repository;

import com.moveandcash.moveandcash.dto.MainItemDto;

import java.util.List;

public interface ItemRepositoryCustom {

    List<MainItemDto> getMainItemList(Long memberId);
}
