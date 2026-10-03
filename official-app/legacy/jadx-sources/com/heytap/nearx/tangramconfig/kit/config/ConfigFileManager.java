package com.heytap.nearx.tangramconfig.kit.config;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.heytap.mspsdk.log.MspLog;
import com.heytap.nearx.tangramconfig.kit.bean.ConfigIpcResponse;
import com.heytap.nearx.tangramconfig.kit.bean.IpcConfigData;
import com.heytap.nearx.tangramconfig.util.FileUtils;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes17.dex */
public class ConfigFileManager {
    private static final String TAG = "com.heytap.nearx.tangramconfig.kit.config.ConfigFileManager";

    public static File copyConfigFile(Context context, Uri uri, File file) throws Exception {
        String str = TAG;
        MspLog.d(str, "copySalvageLog:" + uri + " to " + file);
        File fileCopyFile = FileUtils.copyFile(context, uri, file);
        StringBuilder sb = new StringBuilder();
        sb.append("targetFile:");
        sb.append(fileCopyFile);
        MspLog.d(str, sb.toString());
        if (fileCopyFile != null) {
            if (!fileCopyFile.exists()) {
                throw new Exception("Copying file does not exist");
            }
            MspLog.d(str, "copyFile:" + fileCopyFile);
        }
        return fileCopyFile;
    }

    public static boolean fileVerify(File file, long j2) {
        return j2 == FileUtils.getFileSize(file);
    }

    public static ConfigIpcResponse getConfigFile(Context context, String str, ConfigIpcResponse configIpcResponse) throws Exception {
        StringBuilder sb = new StringBuilder();
        sb.append("cloudcovnfig-");
        String str2 = TAG;
        sb.append(str2);
        MspLog.d(sb.toString(), "getConfigFile:" + str);
        if (context != null && configIpcResponse != null && configIpcResponse.getConfigDatas() != null) {
            MspLog.d("cloudcovnfig-" + str2, "configIpcResponse:" + configIpcResponse);
            ArrayList arrayList = new ArrayList();
            for (IpcConfigData ipcConfigData : configIpcResponse.getConfigDatas()) {
                MspLog.d("cloudcovnfig-" + TAG, "configData:" + ipcConfigData);
                if (ipcConfigData.getVersionCode() > 0) {
                    File uriAndCopyFile = getUriAndCopyFile(context, str, ipcConfigData.getConfigUrl(), getConfigFileDir(context, configIpcResponse), getConfigFileName(ipcConfigData));
                    if (!fileVerify(uriAndCopyFile, ipcConfigData.getConfigFileSize())) {
                        throw new Exception("file copy failed, file size verify failed");
                    }
                    ipcConfigData.setConfigUrl(uriAndCopyFile.getAbsolutePath());
                    ipcConfigData.setContent(ipcConfigData.getContent());
                }
                arrayList.add(ipcConfigData);
            }
            configIpcResponse.setConfigDatas(arrayList);
        }
        return configIpcResponse;
    }

    public static File getConfigFileDir(Context context, ConfigIpcResponse configIpcResponse) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getExternalFilesDir("kit"));
        String str = File.separator;
        sb.append(str);
        sb.append(configIpcResponse.getProductId());
        sb.append("_Kit");
        sb.append(str);
        sb.append(configIpcResponse.getSpkey());
        sb.append(str);
        sb.append("files");
        return new File(sb.toString());
    }

    public static String getConfigFileName(IpcConfigData ipcConfigData) {
        return "Nearx_" + ipcConfigData.getConfigCode() + "@" + ipcConfigData.getVersionCode();
    }

    public static synchronized File getUriAndCopyFile(Context context, String str, String str2, File file, String str3) throws Exception {
        Uri uri;
        File file2;
        String str4 = TAG;
        MspLog.d(str4, "getUriAndCopyFile:" + str);
        if (TextUtils.isEmpty(str2) || !str2.contains("/") || str2.endsWith("/")) {
            throw new Exception("fileUri is invalid:" + str2);
        }
        uri = Uri.parse(str2);
        MspLog.d(str4, "getUriAndCopyFile:" + uri);
        FileUtils.createDirs(file.getAbsolutePath());
        file2 = new File(file, str3);
        if (file2.exists()) {
            file2.delete();
        }
        return copyConfigFile(context, uri, file2);
    }
}
