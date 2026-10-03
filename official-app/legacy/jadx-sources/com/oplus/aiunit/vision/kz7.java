package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.oplus.wearable.linkservice.sdk.internal.file.FileTransferTask;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes15.dex */
public class kz7 {
    public static final String OAF_PREFIX = "Oaf_";

    public static String a(String str, int i) {
        if (TextUtils.isEmpty(str) || i == -1) {
            return FileTransferTask.ERROR_TASK_ID;
        }
        String str2 = str + "#" + i;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str2.getBytes(StandardCharsets.UTF_8));
            return OAF_PREFIX + fe8.a(messageDigest.digest());
        } catch (NoSuchAlgorithmException unused) {
            wil.b("FileTransferTask", "generateTaskId: can not get MD5 MessageDigest");
            return null;
        }
    }
}
