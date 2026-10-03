package com.heytap.log.strategy;

import java.io.File;

/* JADX INFO: loaded from: classes19.dex */
public interface OnKitZipListener {
    void onZipError(int i, String str);

    void onZipOk(String str, int i, File file);
}
