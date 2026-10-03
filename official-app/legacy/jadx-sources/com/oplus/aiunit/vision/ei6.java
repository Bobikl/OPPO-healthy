package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes19.dex */
public interface ei6 extends Closeable {
    boolean b();

    @Nullable
    String c();

    @Nullable
    String d();

    @NonNull
    InputStream e() throws IOException;
}
