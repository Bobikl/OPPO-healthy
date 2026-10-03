package com.oplus.ocs.oms.downloader.constant;

import androidx.annotation.Keep;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Retention(RetentionPolicy.SOURCE)
public @interface UrlType {
    public static final int CN_MASTER = 2;
    public static final int CN_TEST = 1;
    public static final int GL_MASTER = 4;
    public static final int GL_TEST = 3;
}
