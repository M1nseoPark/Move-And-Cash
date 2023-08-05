package com.moveandcash.moveandcash.repository;

import com.moveandcash.moveandcash.dto.MainItemDto;
import com.moveandcash.moveandcash.dto.QMainItemDto;
import com.moveandcash.moveandcash.entity.QItem;
import com.querydsl.jpa.impl.JPAQueryFactory;

import javax.persistence.EntityManager;
import java.util.List;

public class ItemRepositoryCustomImpl implements ItemRepositoryCustom {

    private JPAQueryFactory queryFactory;

    public ItemRepositoryCustomImpl(EntityManager em) {
        this.queryFactory = new JPAQueryFactory(em);
    }

    @Override
    public List<MainItemDto> getMainItemList(Long memberId) {

        QItem item = QItem.item;

        return queryFactory
                .select(
                        new QMainItemDto(
                                item.id,
                                item.lastOfferedRate,
                                item.repayOrgCode,
                                item.balanceAmt,
                                item.member)
                )
                .from(item)
                .where(item.member.id.eq(memberId))
                .fetch();
    }
}
