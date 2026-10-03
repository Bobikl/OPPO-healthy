package com.heytap.log.kit.file;

import java.io.File;

/* JADX INFO: loaded from: classes19.dex */
public interface LogFileGrantListener {
    void onGrantFail(int i, String str);

    void onGrantSuc(int i, String str, File file);
}
