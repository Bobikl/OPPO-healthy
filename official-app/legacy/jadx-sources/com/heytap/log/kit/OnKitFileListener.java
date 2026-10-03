package com.heytap.log.kit;

import java.io.File;

/* JADX INFO: loaded from: classes19.dex */
public interface OnKitFileListener {
    void onZipError(int i, String str);

    void onZipOk(int i, File file);
}
