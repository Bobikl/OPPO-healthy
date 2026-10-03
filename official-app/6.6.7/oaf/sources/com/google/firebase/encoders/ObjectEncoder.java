package com.google.firebase.encoders;

import androidx.annotation.NonNull;
import java.io.IOException;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public interface ObjectEncoder<T> extends Encoder<T, ObjectEncoderContext> {
    @Override // com.google.firebase.encoders.Encoder
    /* synthetic */ void encode(@NonNull Object obj, @NonNull ObjectEncoderContext objectEncoderContext) throws IOException;
}
