package com.google.firebase.encoders;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public interface DataEncoder {
    @NonNull
    String encode(@NonNull Object obj);

    void encode(@NonNull Object obj, @NonNull Writer writer) throws IOException;
}
