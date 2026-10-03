package com.platform.account.webview.util;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public enum AccountLogLevel {
    LEVEL_VERBOSE(1),
    LEVEL_DEBUG(2),
    LEVEL_INFO(3),
    LEVEL_WARNING(4),
    LEVEL_ERROR(5),
    LEVEL_NONE(6);

    public final int logLevel;

    AccountLogLevel(int i) {
        this.logLevel = i;
    }
}
