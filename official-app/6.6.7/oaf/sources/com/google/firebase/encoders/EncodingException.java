package com.google.firebase.encoders;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public final class EncodingException extends RuntimeException {
    public EncodingException(@NonNull String str) {
        super(str);
    }

    public EncodingException(@NonNull String str, @NonNull Exception exc) {
        super(str, exc);
    }
}
