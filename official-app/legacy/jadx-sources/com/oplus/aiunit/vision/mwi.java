package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes12.dex */
public class mwi {
    public static int a(@NonNull InputStream inputStream, @NonNull byte[] bArr, int i, int i2) throws IOException {
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = 0;
        while (i3 < i2) {
            int i4 = inputStream.read(bArr, i + i3, i2 - i3);
            if (i4 < 0) {
                break;
            }
            i3 += i4;
        }
        return i3;
    }
}
