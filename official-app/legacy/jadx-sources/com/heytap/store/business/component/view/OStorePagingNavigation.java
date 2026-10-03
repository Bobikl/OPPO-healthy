package com.heytap.store.business.component.view;

import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/heytap/store/business/component/view/OStorePagingNavigation;", "", "type", "", "(Ljava/lang/String;II)V", "getType", "()I", "TYPE_PIC_UP_NOT_WHITE_BACK", "TYPE_PIC_UP", "TYPE_PIC_LEFT", "TYPE_SCROLL_HORIZONTAL", "TYPE_PIC_UP_DYNAMIC", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public enum OStorePagingNavigation {
    TYPE_PIC_UP_NOT_WHITE_BACK(0),
    TYPE_PIC_UP(1),
    TYPE_PIC_LEFT(2),
    TYPE_SCROLL_HORIZONTAL(3),
    TYPE_PIC_UP_DYNAMIC(4);

    private final int type;

    OStorePagingNavigation(int i) {
        this.type = i;
    }

    public final int getType() {
        return this.type;
    }
}
