package io.noties.markwon.core;

import com.oplus.aiunit.vision.uye;

/* JADX INFO: loaded from: classes10.dex */
public abstract class CoreProps {
    public static final uye<ListItemType> LIST_ITEM_TYPE = uye.b("list-item-type");
    public static final uye<Integer> BULLET_LIST_ITEM_LEVEL = uye.b("bullet-list-item-level");
    public static final uye<Integer> ORDERED_LIST_ITEM_NUMBER = uye.b("ordered-list-item-number");
    public static final uye<Integer> HEADING_LEVEL = uye.b("heading-level");
    public static final uye<String> LINK_DESTINATION = uye.b("link-destination");
    public static final uye<Boolean> PARAGRAPH_IS_IN_TIGHT_LIST = uye.b("paragraph-is-in-tight-list");
    public static final uye<String> CODE_BLOCK_INFO = uye.b("code-block-info");

    public enum ListItemType {
        BULLET,
        ORDERED
    }
}
