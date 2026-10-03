package com.heytap.log.kit.file;

import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.heytap.log.strategy.KitUploadHelper;
import com.heytap.log.uploader.FileZipper;
import com.heytap.mspsdk.log.MspLog;
import java.io.File;

/* JADX INFO: loaded from: classes19.dex */
public class LogFileTransmitter {
    private static final String TAG = "LogFileTransmitter";

    public static Uri getGrantFileUri(Context context, String str, File file) {
        String str2 = TAG;
        MspLog.d(str2, "getGrantFileUri:" + str);
        Uri uriForFile = FileProvider.getUriForFile(context, context.getPackageName() + ".hlog.FILEPROVIDER", file);
        context.grantUriPermission(str, uriForFile, 1);
        MspLog.d(str2, "contentUri:" + uriForFile.toString());
        return uriForFile;
    }

    public static void getReportLogFileToTransmit(Context context, String str, String str2, String str3, LogFileGrantListener logFileGrantListener) {
    }

    public static void getSalvageLogFileToTransmit(final Context context, String str, String str2, final String str3, final LogFileGrantListener logFileGrantListener) {
        KitUploadHelper.granteKitUploadZipFils(str2, new FileZipper.OnZipFileListener() { // from class: com.heytap.log.kit.file.LogFileTransmitter.1
            @Override // com.heytap.log.uploader.FileZipper.OnZipFileListener
            public void onZipError(int i, String str4) {
                LogFileGrantListener logFileGrantListener2 = logFileGrantListener;
                if (logFileGrantListener2 != null) {
                    logFileGrantListener2.onGrantFail(i, str4);
                }
            }

            @Override // com.heytap.log.uploader.FileZipper.OnZipFileListener
            public void onZipOk(int i, File file) {
                MspLog.d(LogFileTransmitter.TAG, "onZipOk:" + file.getAbsolutePath());
                Uri grantFileUri = LogFileTransmitter.getGrantFileUri(context, str3, file);
                LogFileGrantListener logFileGrantListener2 = logFileGrantListener;
                if (logFileGrantListener2 != null) {
                    logFileGrantListener2.onGrantSuc(i, grantFileUri.toString(), file);
                }
            }
        });
    }
}
