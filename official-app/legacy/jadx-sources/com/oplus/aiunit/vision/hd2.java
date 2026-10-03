package com.oplus.aiunit.vision;

import android.util.Log;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public class hd2 implements im6<ByteBuffer> {
    @Override // com.oplus.aiunit.vision.im6
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull ByteBuffer byteBuffer, @NonNull File file, @NonNull erd erdVar) throws Throwable {
        try {
            md2.f(byteBuffer, file);
            return true;
        } catch (IOException e2) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e2);
            }
            return false;
        }
    }
}
