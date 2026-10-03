package com.heytap.log.strategy;

import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.heytap.log.consts.LogConstants;
import com.heytap.log.dto.TraceConfigDto;
import com.heytap.log.uploader.FileZipper;
import com.heytap.log.util.AppUtil;
import com.heytap.log.util.FileUtil;
import com.heytap.log.util.SPUtil;
import java.io.File;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes19.dex */
public class KitUploadHelper {
    private static final String TAG = "HLog_KitUploadHelper";

    public static void granteKitUploadZipFils(final String str, final FileZipper.OnZipFileListener onZipFileListener) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            if (AppUtil.isSystemApp()) {
                Log.d(TAG, "granteKitUploadZipFils system app can not support kit mode !");
                return;
            }
            Log.d(TAG, "granteKitUploadZipFils jsonConfig : " + str);
            Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: com.heytap.log.strategy.KitUploadHelper.1
                @Override // java.lang.Runnable
                public void run() {
                    final TraceConfigDto traceConfigDtoConvKitToDto = TaskConv.convKitToDto(str);
                    if (traceConfigDtoConvKitToDto == null) {
                        FileZipper.OnZipFileListener onZipFileListener2 = onZipFileListener;
                        if (onZipFileListener2 != null) {
                            onZipFileListener2.onZipError(-101, "没有匹配的文件");
                            return;
                        }
                        return;
                    }
                    Log.d(KitUploadHelper.TAG, "granteKitUploadZipFils TraceConfigDto : " + traceConfigDtoConvKitToDto);
                    String string = SPUtil.getInstance().getString(LogConstants.OPUSH_NX_DIR_KEY);
                    if (!KitUploadHelper.verifyPath(string)) {
                        Log.d(KitUploadHelper.TAG, "granteKitUploadZipFils zipLogPath verify failure ");
                        FileZipper.OnZipFileListener onZipFileListener3 = onZipFileListener;
                        if (onZipFileListener3 != null) {
                            onZipFileListener3.onZipError(-101, "没有匹配的文件");
                            return;
                        }
                        return;
                    }
                    String str2 = string + File.separator + ".zip";
                    Log.d(KitUploadHelper.TAG, "granteKitUploadZipFils zipLogPath : " + str2);
                    Intent intent = new Intent(LogConstants.ACTION_SYNC_HLOG_FLUSH);
                    if (AppUtil.getAppContext() != null) {
                        intent.setPackage(AppUtil.getAppContext().getPackageName());
                        intent.putExtra("business", traceConfigDtoConvKitToDto.getBusiness());
                        AppUtil.getAppContext().sendBroadcast(intent);
                    }
                    try {
                        Thread.sleep(LogConstants.MILLIONS_TIME_UNIT * 2);
                    } catch (InterruptedException unused) {
                    }
                    long maxLogSize = traceConfigDtoConvKitToDto.getMaxLogSize() * 1024 * 1024;
                    if (maxLogSize < 1048576) {
                        maxLogSize = 10485760;
                    }
                    String business = traceConfigDtoConvKitToDto.getBusiness();
                    long beginTime = traceConfigDtoConvKitToDto.getBeginTime();
                    long endTime = traceConfigDtoConvKitToDto.getEndTime();
                    String logPathToZip = FileUtil.getLogPathToZip(traceConfigDtoConvKitToDto, string);
                    FileZipper.makeUploadFiles(business, beginTime, endTime, logPathToZip, str2, traceConfigDtoConvKitToDto.getTraceId() + "", maxLogSize, new FileZipper.OnZipFileListener() { // from class: com.heytap.log.strategy.KitUploadHelper.1.1
                        @Override // com.heytap.log.uploader.FileZipper.OnZipFileListener
                        public void onZipError(int i, String str3) {
                            FileZipper.OnZipFileListener onZipFileListener4 = onZipFileListener;
                            if (onZipFileListener4 != null) {
                                onZipFileListener4.onZipError(i, str3);
                            }
                        }

                        @Override // com.heytap.log.uploader.FileZipper.OnZipFileListener
                        public void onZipOk(int i, File file) {
                            if (onZipFileListener != null) {
                                Log.d(KitUploadHelper.TAG, "granteKitUploadZipFils onZipOk uploadCode : " + i);
                                Log.d(KitUploadHelper.TAG, "granteKitUploadZipFils onZipOk file size : " + file.length());
                                Log.d(KitUploadHelper.TAG, "granteKitUploadZipFils onZipOk file info : " + file.getAbsolutePath());
                                File fileReNameFile = FileUtil.reNameFile("act_" + traceConfigDtoConvKitToDto.getTraceId() + "", file);
                                if (fileReNameFile.exists() && fileReNameFile.isFile() && fileReNameFile.length() > 0) {
                                    onZipFileListener.onZipOk(i, fileReNameFile);
                                    return;
                                }
                                Log.e(KitUploadHelper.TAG, "granteKitUploadZipFils rename file failure");
                                FileZipper.OnZipFileListener onZipFileListener4 = onZipFileListener;
                                if (onZipFileListener4 != null) {
                                    onZipFileListener4.onZipError(-103, "");
                                }
                            }
                        }
                    });
                }
            });
        } catch (Throwable th) {
            Log.e(TAG, "granteKitUploadZipFils Throwable : " + th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean verifyPath(String str) {
        return !TextUtils.isEmpty(str) && str.contains("cache") && str.contains("HeyTap") && str.contains("HLog_file");
    }
}
