package com.google.firebase.encoders;

import androidx.annotation.NonNull;
import java.io.IOException;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
interface Encoder<TValue, TContext> {
    void encode(@NonNull TValue tvalue, @NonNull TContext tcontext) throws IOException;
}
