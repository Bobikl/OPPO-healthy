package com.heytap.theme.watch.domain.dto.response;

import io.protostuff.Tag;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class ProductItemListDto {

    @Tag(1)
    private List<ThemewProductItemDto> items;

    public List<ThemewProductItemDto> getItems() {
        return this.items;
    }

    public void setItems(List<ThemewProductItemDto> list) {
        this.items = list;
    }

    public String toString() {
        return "ProductItemListDto{items=" + this.items + '}';
    }
}
