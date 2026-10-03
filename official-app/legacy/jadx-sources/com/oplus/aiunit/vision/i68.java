package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public interface i68 {
    public static final int STATUS_FORMAT_ERROR = 1;
    public static final int STATUS_OK = 0;
    public static final int STATUS_OPEN_ERROR = 2;
    public static final int STATUS_PARTIAL_DECODE = 3;
    public static final int TOTAL_ITERATION_COUNT_FOREVER = 0;

    public interface a {
        @NonNull
        byte[] a(int i);

        @NonNull
        Bitmap b(int i, int i2, @NonNull Bitmap.Config config);

        void c(@NonNull Bitmap bitmap);

        @NonNull
        int[] d(int i);

        void e(@NonNull byte[] bArr);

        void f(@NonNull int[] iArr);
    }

    void a(@NonNull Bitmap.Config config);

    void b();

    int c();

    void clear();

    int d();

    @Nullable
    Bitmap e();

    void f();

    int g();

    @NonNull
    ByteBuffer getData();

    int h();
}
