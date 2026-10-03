package com.heytap.store.base.widget.theme;

/* JADX INFO: loaded from: classes3.dex */
public interface OnThemeChangedListener {
    default String getDefaultTextColor() {
        return "#000000";
    }

    default void onIconStyleChanged(String str) {
    }

    default void onTextColorChanged(String str) {
    }
}
