package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes12.dex */
public interface vab extends Closeable {
    boolean b();

    @Nullable
    String c();

    @Nullable
    String d();

    @NonNull
    InputStream e() throws IOException;
}
