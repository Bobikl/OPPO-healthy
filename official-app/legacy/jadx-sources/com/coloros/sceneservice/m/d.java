package com.coloros.sceneservice.m;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public class d {
    public static final String TAG = "IoUtils";

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e2) {
                f.e(TAG, "closeQuietly error :" + e2);
            }
        }
    }
}
