package com.yalantis.ucrop.util;

import androidx.annotation.NonNull;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes10.dex */
public class FileUtils {
    private static final String TAG = "FileUtils";

    private FileUtils() {
    }

    public static long copyFile(@NonNull String str, @NonNull String str2) throws Exception {
        FileChannel fileChannel;
        if (str.equalsIgnoreCase(str2)) {
            return 0L;
        }
        FileChannel channel = null;
        try {
            FileChannel channel2 = new FileInputStream(new File(str)).getChannel();
            try {
                channel = new FileOutputStream(new File(str2)).getChannel();
                long jTransferTo = channel2.transferTo(0L, channel2.size(), channel);
                channel2.close();
                channel2.close();
                if (channel != null) {
                    channel.close();
                }
                return jTransferTo;
            } catch (Throwable th) {
                th = th;
                FileChannel fileChannel2 = channel;
                channel = channel2;
                fileChannel = fileChannel2;
                if (channel != null) {
                    channel.close();
                }
                if (fileChannel != null) {
                    fileChannel.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileChannel = null;
        }
    }
}
