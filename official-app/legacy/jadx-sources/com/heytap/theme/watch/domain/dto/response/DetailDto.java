package com.heytap.theme.watch.domain.dto.response;

import io.protostuff.Tag;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class DetailDto {

    @Tag(3)
    private List<Object> cards;

    @Tag(1)
    private ThemewProductItemDto item;

    @Tag(2)
    private List<Object> tags;

    public List<Object> getCards() {
        return this.cards;
    }

    public ThemewProductItemDto getItem() {
        return this.item;
    }

    public List<Object> getTags() {
        return this.tags;
    }

    public void setCards(List<Object> list) {
        this.cards = list;
    }

    public void setItem(ThemewProductItemDto themewProductItemDto) {
        this.item = themewProductItemDto;
    }

    public void setTags(List<Object> list) {
        this.tags = list;
    }

    public String toString() {
        return "DetailDto{item=" + this.item + ", tags=" + this.tags + ", cards=" + this.cards + '}';
    }
}
