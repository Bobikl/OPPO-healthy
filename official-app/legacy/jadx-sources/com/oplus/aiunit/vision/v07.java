package com.oplus.aiunit.vision;

import android.text.TextUtils;
import androidx.core.app.FrameMetricsAggregator;
import com.oplus.wearable.linkservice.sdk.internal.file.FileTransferTask;
import java.io.File;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class v07 {
    public static synchronized void a(FileTransferTask fileTransferTask) {
        try {
            if (fileTransferTask == null) {
                wil.b("FTUtils", "checkFileInfo: FileTransferTask is null");
                return;
            }
            if (fileTransferTask.isChecked()) {
                wil.d("FTUtils", "checkFileInfo: has checked");
                return;
            }
            int errorCode = fileTransferTask.getErrorCode();
            wil.d("FTUtils", "checkFileInfo: " + fileTransferTask + ",errorCode=" + errorCode);
            xc7.a().c(fileTransferTask.getNodeId(), fileTransferTask.getTaskId());
            if (fileTransferTask.isReceiveTask() && errorCode == 0) {
                String tempFilePath = fileTransferTask.getTempFilePath();
                if (TextUtils.isEmpty(tempFilePath)) {
                    wil.b("FTUtils", "checkFileInfo: tempFilePath is empty");
                } else {
                    byte[] md5 = fileTransferTask.getMD5();
                    long fileSize = fileTransferTask.getFileSize();
                    byte[] bArrA = bcb.a(tempFilePath);
                    long length = new File(tempFilePath).length();
                    if (length != fileSize) {
                        wil.b("FTUtils", "checkFileInfo: check size error remote size=" + fileSize + ",local size=" + length);
                        errorCode = 512;
                    } else {
                        if (bArrA == null || bArrA.length == 0) {
                            wil.b("FTUtils", "checkFileInfo: localMD5 is empty");
                        } else if (!Arrays.equals(md5, bArrA)) {
                            wil.b("FTUtils", "checkFileInfo: check crc error remote md5=" + fe8.a(md5) + ",local localMD5=" + fe8.a(bArrA));
                        }
                        errorCode = 508;
                    }
                    if (errorCode == 0) {
                        if (b(tempFilePath, fileTransferTask.getFinalSavePath())) {
                            wil.a("FTUtils", "checkFileInfo check success " + fileTransferTask.getTransferId());
                        } else {
                            wil.a("FTUtils", "checkFileInfo: rename fail");
                            errorCode = FrameMetricsAggregator.EVERY_DURATION;
                        }
                    }
                }
            } else {
                File file = new File(fileTransferTask.getTempFilePath());
                if (file.exists()) {
                    wil.a("FTUtils", "checkFileInfo: delete tempFile " + file.delete() + " ,taskId" + fileTransferTask.getTransferId());
                }
            }
            fileTransferTask.setChecked(true);
            fileTransferTask.setErrorCode(errorCode);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static boolean b(String str, String str2) {
        boolean zRenameTo = new File(str).renameTo(new File(str2));
        wil.a("FTUtils", "renameTo: from " + str + " to " + str2 + " : " + zRenameTo);
        return zRenameTo;
    }
}
