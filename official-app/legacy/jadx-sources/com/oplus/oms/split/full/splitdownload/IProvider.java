package com.oplus.oms.split.full.splitdownload;

import android.content.Context;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes8.dex */
public interface IProvider {
    InputStream getSplitFileStream(Context context, String str) throws FileNotFoundException;

    int getSplitVersionCode(Context context, String str);

    String getSplitVersionName(Context context, String str);
}
