package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.oplus.wearable.linkservice.sdk.internal.file.FileTransferTask;
import java.io.File;
import java.util.Arrays;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class w17 {
    public static synchronized void a(FileTransferTask fileTransferTask) {
        try {
            if (fileTransferTask == null) {
                uml.b("FTUtils", "checkFileInfo: FileTransferTask is null");
                return;
            }
            if (fileTransferTask.isChecked()) {
                uml.d("FTUtils", "checkFileInfo: has checked");
                return;
            }
            int errorCode = fileTransferTask.getErrorCode();
            uml.d("FTUtils", "checkFileInfo: " + fileTransferTask + ",errorCode=" + errorCode);
            zd7.a().c(fileTransferTask.getNodeId(), fileTransferTask.getTaskId());
            if (fileTransferTask.isReceiveTask() && errorCode == 0) {
                String tempFilePath = fileTransferTask.getTempFilePath();
                if (TextUtils.isEmpty(tempFilePath)) {
                    uml.b("FTUtils", "checkFileInfo: tempFilePath is empty");
                } else {
                    byte[] md5 = fileTransferTask.getMD5();
                    long fileSize = fileTransferTask.getFileSize();
                    byte[] bArrA = qdb.a(tempFilePath);
                    long length = new File(tempFilePath).length();
                    if (length != fileSize) {
                        uml.b("FTUtils", "checkFileInfo: check size error remote size=" + fileSize + ",local size=" + length);
                        errorCode = 512;
                    } else {
                        if (bArrA == null || bArrA.length == 0) {
                            uml.b("FTUtils", "checkFileInfo: localMD5 is empty");
                        } else if (!Arrays.equals(md5, bArrA)) {
                            uml.b("FTUtils", "checkFileInfo: check crc error remote md5=" + if8.a(md5) + ",local localMD5=" + if8.a(bArrA));
                        }
                        errorCode = 508;
                    }
                    if (errorCode == 0) {
                        if (b(tempFilePath, fileTransferTask.getFinalSavePath())) {
                            uml.a("FTUtils", "checkFileInfo check success " + fileTransferTask.getTransferId());
                        } else {
                            uml.a("FTUtils", "checkFileInfo: rename fail");
                            errorCode = 511;
                        }
                    }
                }
            } else {
                File file = new File(fileTransferTask.getTempFilePath());
                if (file.exists()) {
                    uml.a("FTUtils", "checkFileInfo: delete tempFile " + file.delete() + " ,taskId" + fileTransferTask.getTransferId());
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
        uml.a("FTUtils", "renameTo: from " + str + " to " + str2 + " : " + zRenameTo);
        return zRenameTo;
    }
}
