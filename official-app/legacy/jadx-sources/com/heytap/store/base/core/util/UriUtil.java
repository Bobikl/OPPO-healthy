package com.heytap.store.base.core.util;

import android.net.Uri;
import com.heytap.store.platform.tools.ContextGetterUtils;
import com.heytap.store.platform.tools.LogUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public class UriUtil {
    private static final String TAG = "UriUtil";

    public static Uri imagePathToUri(Uri uri, String str) {
        try {
            OutputStream outputStreamOpenOutputStream = ContextGetterUtils.INSTANCE.getApp().getContentResolver().openOutputStream(uri);
            if (outputStreamOpenOutputStream == null) {
                LogUtils.INSTANCE.w(TAG, "outputStream is null");
                return null;
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(new File(str)));
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStreamOpenOutputStream);
            byte[] bArr = new byte[1024];
            for (int i = bufferedInputStream.read(bArr); i >= 0; i = bufferedInputStream.read(bArr)) {
                bufferedOutputStream.write(bArr, 0, i);
                bufferedOutputStream.flush();
            }
            bufferedOutputStream.close();
            bufferedInputStream.close();
            return uri;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
