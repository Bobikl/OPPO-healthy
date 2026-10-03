package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes13.dex */
public interface ona {
    public static final Charset CHARSET = Charset.forName("UTF-8");
    public static final String STRING_CHARSET_NAME = "UTF-8";

    boolean equals(Object obj);

    int hashCode();

    void updateDiskCacheKey(@NonNull MessageDigest messageDigest);
}
