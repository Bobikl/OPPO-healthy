package com.heytap.store.base.core.util;

import android.content.Context;
import android.text.TextUtils;
import com.heytap.store.base.core.util.file.FileUtils;
import com.heytap.store.base.core.util.thread.AppThreadExecutor;
import com.heytap.store.platform.tools.ContextGetterUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes3.dex */
public class UUIDHelper {
    private static final String UUID_FIlE = ".uuid";
    private static final String SAVA_PATH1 = new File(FileUtils.TRIBUNE_STORAGE_PATH_TEMP, UUID_FIlE).getAbsolutePath();
    private static final String SAVA_PATH2 = new File(FileUtils.getExternalCacheDir(ContextGetterUtils.INSTANCE.getApp()).getAbsolutePath(), UUID_FIlE).getAbsolutePath();

    public static class UUIDExistInfo {
        boolean existInPath1;
        boolean existInPath2;
        String uuid;

        private UUIDExistInfo() {
        }
    }

    private static UUIDExistInfo checkUUIDExist() throws IOException {
        UUIDExistInfo uUIDExistInfo = new UUIDExistInfo();
        String uUIDFile = readUUIDFile(new File(SAVA_PATH1));
        uUIDExistInfo.uuid = uUIDFile;
        if (TextUtils.isEmpty(uUIDFile)) {
            uUIDExistInfo.existInPath1 = false;
            String uUIDFile2 = readUUIDFile(new File(SAVA_PATH2));
            uUIDExistInfo.uuid = uUIDFile2;
            uUIDExistInfo.existInPath2 = !TextUtils.isEmpty(uUIDFile2);
        } else {
            uUIDExistInfo.existInPath1 = true;
            uUIDExistInfo.existInPath2 = !TextUtils.isEmpty(readUUIDFile(new File(SAVA_PATH2)));
        }
        return uUIDExistInfo;
    }

    private static String formatUUID() {
        return null;
    }

    public static synchronized String readUUID(Context context) {
        UUIDExistInfo uUIDExistInfoCheckUUIDExist;
        try {
            uUIDExistInfoCheckUUIDExist = checkUUIDExist();
            if (TextUtils.isEmpty(uUIDExistInfoCheckUUIDExist.uuid)) {
                uUIDExistInfoCheckUUIDExist.uuid = formatUUID();
            }
            sysnUUIDIfNeed(uUIDExistInfoCheckUUIDExist);
        } catch (IOException e2) {
            e2.printStackTrace();
            return null;
        }
        return uUIDExistInfoCheckUUIDExist.uuid;
    }

    private static String readUUIDFile(File file) throws IOException {
        if (file == null || !file.exists()) {
            return null;
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        byte[] bArr = new byte[(int) randomAccessFile.length()];
        randomAccessFile.readFully(bArr);
        randomAccessFile.close();
        return new String(bArr);
    }

    private static void sysnUUIDIfNeed(final UUIDExistInfo uUIDExistInfo) {
        AppThreadExecutor.getInstance().executeNormalTask(new Runnable() { // from class: com.heytap.store.base.core.util.UUIDHelper.1
            @Override // java.lang.Runnable
            public void run() {
                UUIDExistInfo uUIDExistInfo2 = uUIDExistInfo;
                if (uUIDExistInfo2 == null || TextUtils.isEmpty(uUIDExistInfo2.uuid)) {
                    return;
                }
                try {
                    UUIDExistInfo uUIDExistInfo3 = uUIDExistInfo;
                    if (!uUIDExistInfo3.existInPath1) {
                        UUIDHelper.writeUUIDFile(uUIDExistInfo3.uuid, UUIDHelper.SAVA_PATH1);
                    }
                    UUIDExistInfo uUIDExistInfo4 = uUIDExistInfo;
                    if (uUIDExistInfo4.existInPath2) {
                        return;
                    }
                    UUIDHelper.writeUUIDFile(uUIDExistInfo4.uuid, UUIDHelper.SAVA_PATH2);
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void writeUUIDFile(String str, String str2) throws IOException {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        FileUtils.makeSureFileExist(str2);
        FileOutputStream fileOutputStream = new FileOutputStream(str2);
        fileOutputStream.write(str.getBytes());
        fileOutputStream.close();
    }
}
