package com.oplus.aiunit.ocr.common;

import org.jetbrains.annotations.NotNull;
import p010kotlin.enums.EnumEntries;
import p010kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes5.dex */
public enum GameType {
    WZ("wz"),
    CJ("cj");

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    private final String alias;

    GameType(String str) {
        this.alias = str;
    }

    @NotNull
    public static EnumEntries<GameType> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String getAlias() {
        return this.alias;
    }
}
