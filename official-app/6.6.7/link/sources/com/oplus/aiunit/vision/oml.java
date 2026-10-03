package com.oplus.aiunit.vision;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.oplus.health.apiprovider.ClientManager;
import com.oplus.wearable.linkservice.sdk.internal.file.FileTransferTask;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class oml implements ClientManager.d {
    public static final String IWEARABLESERVICE = "olink.IWearableService";

    public interface a {
        boolean receiveFile(String str, int i, String str2, String str3, String str4) throws RemoteException;
    }

    public static FileTransferTask d(Context context, String str, String str2, int i, String str3, Uri uri) {
        String strD = xml.d(context, str3);
        if (TextUtils.isEmpty(strD)) {
            return null;
        }
        File file = new File(strD);
        if (!file.exists()) {
            uml.b("WearableClient", "File does not exist");
            return null;
        }
        if (file.isDirectory()) {
            uml.b("WearableClient", "File is a directory");
            return null;
        }
        if (file.length() == 0) {
            uml.b("WearableClient", "File length is 0");
            return null;
        }
        Uri uriG = xml.g(context, strD, 1);
        String string = uriG != null ? uriG.toString() : null;
        int length = (int) file.length();
        byte[] bArrB = uri != null ? qdb.b(context, uri) : qdb.a(strD);
        FileTransferTask fileTransferTask = new FileTransferTask();
        fileTransferTask.setUri(str2);
        fileTransferTask.setFileName(file.getName());
        fileTransferTask.setFilePath(string);
        fileTransferTask.setMD5(bArrB);
        fileTransferTask.setFileSize(length);
        fileTransferTask.setNodeId(str);
        fileTransferTask.setServiceId(i);
        fileTransferTask.setReceiveTask(false);
        fileTransferTask.setFileAndroidUri(uri);
        return fileTransferTask;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f4  */
    /* JADX WARN: Instruction removed from duplicated block: B:38:0x00d9, please report this as an issue */
    public static boolean e(Context context, String str, @Nullable String str2, a aVar) {
        boolean zCreateNewFile;
        Uri uriG;
        File file;
        int i;
        String str3;
        uml.a("WearableClient", "receiveFile: taskId=" + str + " filePath=" + str2);
        if (TextUtils.isEmpty(str2)) {
            uml.b("WearableClient", "receiveFile: filePath is empty");
            i = 513;
            file = null;
            str3 = null;
        } else {
            File file2 = new File(str2);
            int i2 = 521;
            int i3 = 522;
            if (file2.isDirectory()) {
                uml.b("WearableClient", "receiveFile: filePath is directory");
            } else {
                File parentFile = file2.getParentFile();
                if (parentFile == null) {
                    uml.b("WearableClient", "receiveFile: rcvFile parent is null");
                } else if (parentFile.exists() || parentFile.mkdirs()) {
                    i2 = 0;
                } else {
                    uml.b("WearableClient", "receiveFile: rcvFile parent mkdirs error");
                    i2 = 522;
                }
            }
            File file3 = new File(xml.c(str, str2));
            if (i2 == 0) {
                try {
                    zCreateNewFile = file3.createNewFile();
                } catch (IOException e) {
                    uml.b("WearableClient", "receiveFile: IOException: " + e.getMessage());
                    i2 = 522;
                    zCreateNewFile = false;
                }
                if (zCreateNewFile) {
                    if (file3.canWrite()) {
                        try {
                            uriG = xml.g(context, file3.getAbsolutePath(), 2);
                        } catch (IllegalArgumentException e2) {
                            uml.b("WearableClient", "receiveFile: rcvFile tempFileUri exception " + e2.getMessage());
                            uriG = null;
                            i2 = 522;
                        }
                        if (uriG == null) {
                            uml.b("WearableClient", "receiveFile: rcvFile create tempFileUri error ");
                        }
                    } else {
                        uml.b("WearableClient", "receiveFile: rcvFile tempFile can not write");
                    }
                    if (i3 != 0) {
                        uml.k("WearableClient", "receiveFile: failed, delete temp file " + file3.delete());
                    }
                    String string = uriG != null ? uriG.toString() : null;
                    file = file3;
                    i = i3;
                    str3 = string;
                } else {
                    uml.b("WearableClient", "receiveFile: rcvFile create tempFile error");
                }
                uriG = null;
                if (i3 != 0) {
                    uml.k("WearableClient", "receiveFile: failed, delete temp file " + file3.delete());
                }
                if (uriG != null) {
                }
                file = file3;
                i = i3;
                str3 = string;
            } else {
                uriG = null;
            }
            i3 = i2;
            if (i3 != 0) {
                uml.k("WearableClient", "receiveFile: failed, delete temp file " + file3.delete());
            }
            if (uriG != null) {
            }
            file = file3;
            i = i3;
            str3 = string;
        }
        try {
            boolean zReceiveFile = aVar.receiveFile(context.getPackageName(), i, str, str3, str2);
            if (!zReceiveFile && file != null) {
                uml.d("WearableClient", "receiveFile: failed, delete temp file" + file.delete());
            }
            return zReceiveFile;
        } catch (RemoteException e3) {
            uml.b("WearableClient", "receiveFile: RemoteException: " + e3.getMessage());
            return false;
        }
    }
}
