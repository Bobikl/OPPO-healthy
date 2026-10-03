package com.oplus.backup.sdk.component.plugin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.system.Os;
import android.text.TextUtils;
import com.google.gson.JsonParseException;
import com.oplus.backup.sdk.common.bean.FileWrapper;
import com.oplus.backup.sdk.common.bean.FileWrapperList;
import com.oplus.backup.sdk.common.bean.TransferFile;
import com.oplus.backup.sdk.common.host.BREngineConfig;
import com.oplus.backup.sdk.common.utils.BRLog;
import com.oplus.backup.sdk.common.utils.Constants;
import com.oplus.backup.sdk.common.utils.GsonUtil;
import com.oplus.backup.sdk.component.BRPluginHandler;
import com.oplus.backup.sdk.event.FileConfirmEvent;
import java.io.File;
import java.io.FileDescriptor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public abstract class AbstractPlugin implements IBRPlugin {
    private static final String DATA_PATH = "/data/data/";
    private static final String TAG = "AbstractPlugin";
    private BREngineConfig mBREngineConfig;
    private BRPluginHandler mBRPluginHandler;
    private String mCacheAppDataFolder;
    private Context mContext;
    private LockManager mLockManager;

    private FileWrapperList listFile(String str, int i) {
        BRLog.d(TAG, "listFile " + str + ", startIndex:" + i);
        Intent intent = new Intent(Constants.MessagerConstants.INTENT_LIST_FILES);
        intent.putExtra(Constants.MessagerConstants.INTENT_LIST_FILE_PATH, str);
        intent.putExtra(Constants.MessagerConstants.INTENT_LIST_FILE_START_INDEX, i);
        LockManager.BooleanLock booleanLockApplyLock = this.mLockManager.applyLock(Constants.MessagerConstants.INTENT_LIST_FILES, str, "" + i);
        getPluginHandler().sendMsg(intent, true);
        try {
            return (FileWrapperList) this.mLockManager.waitResult(booleanLockApplyLock);
        } catch (ClassCastException e2) {
            BRLog.d(TAG, "listFiles exception " + e2.getMessage());
            return null;
        }
    }

    private void sendFileListMsg(List<TransferFile> list) {
        Intent intent = new Intent(Constants.MessagerConstants.INTENT_SEND_PLUGIN_FILE);
        intent.putExtra(Constants.MessagerConstants.INTENT_SEND_FILE_LIST, GsonUtil.toJson(list));
        getPluginHandler().sendMsg(intent, true);
    }

    public int backupAppData(String str, String str2) {
        Intent intent = new Intent(Constants.MessagerConstants.INTENT_BACKUP_APP_DATA);
        intent.putExtra(Constants.MessagerConstants.INTENT_BACKUP_SRC_FOLDER, str);
        intent.putExtra(Constants.MessagerConstants.INTENT_BACKUP_DST_FOLDER, str2);
        LockManager.BooleanLock booleanLockApplyLock = this.mLockManager.applyLock(Constants.MessagerConstants.INTENT_BACKUP_APP_DATA, str, str2);
        getPluginHandler().sendMsg(intent, true);
        return ((Integer) this.mLockManager.waitResult(booleanLockApplyLock)).intValue();
    }

    public boolean deleteFile(String str) {
        if ((this.mBREngineConfig.getBackupRootPath() == null || !str.startsWith(this.mBREngineConfig.getBackupRootPath())) && ((this.mBREngineConfig.getRestoreRootPath() == null || !str.startsWith(this.mBREngineConfig.getRestoreRootPath())) && (this.mBREngineConfig.getCacheAppDataFolder() == null || !str.startsWith(this.mBREngineConfig.getCacheAppDataFolder())))) {
            BRLog.d(TAG, "deleteFile, target filePath is now allow to delete " + str + " , check input!");
            return false;
        }
        BRLog.d(TAG, "deleteFile " + str);
        Intent intent = new Intent(Constants.MessagerConstants.INTENT_DELETE_FILE);
        intent.putExtra(Constants.MessagerConstants.INTENT_DELETE_FILE_PATH, str);
        getPluginHandler().sendMsg(intent, true);
        return true;
    }

    public BREngineConfig getBREngineConfig() {
        return this.mBREngineConfig;
    }

    public final String getCacheAppDataFolder(String str) {
        return this.mCacheAppDataFolder + File.separator + str + DATA_PATH + str;
    }

    public Context getContext() {
        return this.mContext;
    }

    public FileDescriptor getFileDescriptor(String str) {
        if (!TextUtils.isEmpty(str)) {
            return getFileDescriptor(str, 939524096);
        }
        BRLog.w(TAG, "getFileDescriptor, path is null");
        return null;
    }

    public BRPluginHandler getPluginHandler() {
        return this.mBRPluginHandler;
    }

    public Bundle invokeOtherPluginMethod(String str, String str2, Bundle bundle) {
        BRLog.d(TAG, "invokePluginMethod, " + str + ", " + str2);
        Intent intent = new Intent(Constants.MessagerConstants.INTENT_INVOKE_PLUGIN_METHOD);
        intent.putExtra(Constants.MessagerConstants.INTENT_INVOKE_PLUGIN_METHOD, str2);
        intent.putExtra(Constants.MessagerConstants.INTENT_INVOKE_PLUGIN_METHOD_PLUGIN_ID, str);
        intent.putExtra(Constants.MessagerConstants.INTENT_INVOKE_PLUGIN_METHOD_NAME, str2);
        intent.putExtra(Constants.MessagerConstants.INTENT_INVOKE_PLUGIN_METHOD_ARGS, bundle);
        LockManager.BooleanLock booleanLockApplyLock = this.mLockManager.applyLock(Constants.MessagerConstants.INTENT_INVOKE_PLUGIN_METHOD, str, str2);
        getPluginHandler().sendMsg(intent, true);
        BRLog.d(TAG, "invokePluginMethod waitResult " + str + ", " + str2);
        return (Bundle) this.mLockManager.waitResult(booleanLockApplyLock);
    }

    public ArrayList<FileWrapper> listFiles(String str) {
        if (!getBREngineConfig().hasFeature(BREngineConfig.FEATURE_SUPPORT_LIST_FILE)) {
            BRLog.w(TAG, "listFiles, not support");
            return null;
        }
        ArrayList<FileWrapper> arrayList = new ArrayList<>();
        FileWrapperList fileWrapperListListFile = listFile(str, 0);
        while (fileWrapperListListFile != null) {
            if (fileWrapperListListFile.getList() != null && fileWrapperListListFile.getList().size() > 0) {
                arrayList.addAll(fileWrapperListListFile.getList());
            }
            if (fileWrapperListListFile.getEndIndex() >= fileWrapperListListFile.getTotalCount()) {
                break;
            }
            fileWrapperListListFile = listFile(str, fileWrapperListListFile.getEndIndex());
        }
        return arrayList;
    }

    public void onCreate(Context context, BRPluginHandler bRPluginHandler, BREngineConfig bREngineConfig) {
        this.mContext = context;
        this.mBRPluginHandler = bRPluginHandler;
        LockManager lockManager = LockManager.getInstance();
        this.mLockManager = lockManager;
        lockManager.clearLock();
        this.mCacheAppDataFolder = bREngineConfig.getCacheAppDataFolder();
        this.mBREngineConfig = bREngineConfig;
    }

    public void onFileSentSuccess(String str) {
    }

    @Override // com.oplus.backup.sdk.component.plugin.IBRPlugin
    public void onReveiveMsg(Intent intent, boolean z) {
        FileWrapperList fileWrapperList;
        if (intent == null) {
            BRLog.e(TAG, "onReceiveMsg intent == null");
            return;
        }
        String action = intent.getAction();
        LockManager.BooleanLock lock = null;
        if (Constants.MessagerConstants.INTENT_GET_FD.equals(action)) {
            String stringExtra = intent.getStringExtra(Constants.MessagerConstants.INTENT_GET_FD_FILE_PATH);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) intent.getParcelableExtra(Constants.MessagerConstants.INTENT_FD_KEY);
            LockManager.BooleanLock lock2 = this.mLockManager.getLock(Constants.MessagerConstants.INTENT_GET_FD, stringExtra);
            BRLog.d(TAG, "onReceiveMsg INTENT_GET_FD, path:" + BRLog.getModifiedPath(stringExtra) + ", getLock: " + lock2);
            if (lock2 == null) {
                BRLog.e(TAG, "getFileDescriptor failed: lock is null, it's a bug!");
            } else if (parcelFileDescriptor != null) {
                lock2.setResult(parcelFileDescriptor.getFileDescriptor());
            } else {
                lock2.setResult(null);
                BRLog.e(TAG, "getFileDescriptor failed:" + BRLog.getModifiedPath(stringExtra));
            }
            lock = lock2;
        } else if (Constants.MessagerConstants.INTENT_BACKUP_APP_DATA.equals(action)) {
            String stringExtra2 = intent.getStringExtra(Constants.MessagerConstants.INTENT_BACKUP_SRC_FOLDER);
            lock = this.mLockManager.getLock(Constants.MessagerConstants.INTENT_BACKUP_APP_DATA, stringExtra2, intent.getStringExtra(Constants.MessagerConstants.INTENT_BACKUP_DST_FOLDER));
            BRLog.d(TAG, "onReceiveMsg INTENT_BACKUP_APP_DATA, srcFolder:" + BRLog.getModifiedPath(stringExtra2) + ", getLock: " + lock);
            if (lock != null) {
                int intExtra = intent.getIntExtra(Constants.MessagerConstants.INTENT_BACKUP_RESTORE_APP_DATA_RESULT, -1);
                BRLog.d(TAG, "onReceiveMsg INTENT_BACKUP_APP_DATA, result:" + intExtra);
                lock.setResult(Integer.valueOf(intExtra));
            } else {
                BRLog.e(TAG, "backup app data failed: lock is null, it's a bug!");
            }
        } else if (Constants.MessagerConstants.INTENT_RESTORE_APP_DATA.equals(action)) {
            String stringExtra3 = intent.getStringExtra(Constants.MessagerConstants.INTENT_RESTORE_SRC_FOLDER);
            lock = this.mLockManager.getLock(Constants.MessagerConstants.INTENT_RESTORE_APP_DATA, stringExtra3, intent.getStringExtra(Constants.MessagerConstants.INTENT_RESTORE_DST_FOLDER));
            BRLog.d(TAG, "onReceiveMsg INTENT_RESTORE_APP_DATA, srcFolder:" + BRLog.getModifiedPath(stringExtra3) + ", getLock: " + lock);
            if (lock != null) {
                int intExtra2 = intent.getIntExtra(Constants.MessagerConstants.INTENT_BACKUP_RESTORE_APP_DATA_RESULT, -1);
                BRLog.d(TAG, "onReceiveMsg INTENT_BACKUP_APP_DATA, result:" + intExtra2);
                lock.setResult(Integer.valueOf(intExtra2));
            } else {
                BRLog.e(TAG, "restore app data failed: lock is null, it's a bug!");
            }
        } else if (Constants.MessagerConstants.INTENT_TAR.equals(action)) {
            String stringExtra4 = intent.getStringExtra(Constants.MessagerConstants.INTENT_TAR_FILE);
            lock = this.mLockManager.getLock(Constants.MessagerConstants.INTENT_TAR, stringExtra4, intent.getStringExtra(Constants.MessagerConstants.INTENT_TAR_SOURCE_FOLDER));
            BRLog.d(TAG, "onReceiveMsg INTENT_TAR, tarFile:" + BRLog.getModifiedPath(stringExtra4) + ", getLock: " + lock);
            if (lock != null) {
                int intExtra3 = intent.getIntExtra(Constants.MessagerConstants.INTENT_TAR_RESULT, -1);
                BRLog.d(TAG, "onReceiveMsg INTENT_TAR, result:" + intExtra3);
                lock.setResult(Integer.valueOf(intExtra3));
            } else {
                BRLog.e(TAG, "tar failed: lock is null, it's a bug!");
            }
        } else if (Constants.MessagerConstants.INTENT_RESTORE_TAR.equals(action)) {
            String stringExtra5 = intent.getStringExtra(Constants.MessagerConstants.INTENT_RESTORE_TAR_FILE);
            lock = this.mLockManager.getLock(Constants.MessagerConstants.INTENT_TAR, stringExtra5, intent.getStringExtra(Constants.MessagerConstants.INTENT_RESTORE_TAR_PACKAGE), intent.getStringExtra(Constants.MessagerConstants.INTENT_RESTORE_TAR_APP_DATA_DST_FOLDER));
            BRLog.d(TAG, "onReceiveMsg INTENT_RESTORE_TAR, tarFile:" + BRLog.getModifiedPath(stringExtra5) + ", getLock: " + lock);
            if (lock != null) {
                int intExtra4 = intent.getIntExtra(Constants.MessagerConstants.INTENT_RESTORE_TAR_RESULT, -1);
                BRLog.d(TAG, "onReceiveMsg INTENT_RESTORE_TAR, result:" + intExtra4);
                lock.setResult(Integer.valueOf(intExtra4));
            } else {
                BRLog.e(TAG, "restore tar failed: lock is null, it's a bug!");
            }
        } else if (Constants.MessagerConstants.INTENT_INVOKE_PLUGIN_METHOD.equals(action)) {
            String stringExtra6 = intent.getStringExtra(Constants.MessagerConstants.INTENT_INVOKE_PLUGIN_METHOD_PLUGIN_ID);
            String stringExtra7 = intent.getStringExtra(Constants.MessagerConstants.INTENT_INVOKE_PLUGIN_METHOD_NAME);
            lock = this.mLockManager.getLock(Constants.MessagerConstants.INTENT_INVOKE_PLUGIN_METHOD, stringExtra6, stringExtra7);
            BRLog.d(TAG, "onReceiveMsg INTENT_INVOKE_PLUGIN_METHOD, methodName:" + stringExtra7);
            if (lock != null) {
                Bundle bundleExtra = intent.getBundleExtra(Constants.MessagerConstants.INTENT_INVOKE_PLUGIN_METHOD_RESULT);
                BRLog.d(TAG, "onReceiveMsg INTENT_INVOKE_PLUGIN_METHOD, result:" + bundleExtra);
                lock.setResult(bundleExtra);
            } else {
                BRLog.e(TAG, "invoke method failed: lock is null, it's a bug!");
            }
        } else if (Constants.MessagerConstants.INTENT_LIST_FILES.equals(action)) {
            BRLog.d(TAG, "onReceiveMsg INTENT_LIST_FILES  ");
            String stringExtra8 = intent.getStringExtra(Constants.MessagerConstants.INTENT_LIST_FILES_RESULT);
            int intExtra5 = intent.getIntExtra(Constants.MessagerConstants.INTENT_LIST_FILE_START_INDEX, 0);
            try {
                fileWrapperList = (FileWrapperList) GsonUtil.fromJson(stringExtra8, FileWrapperList.class);
            } catch (JsonParseException unused) {
                BRLog.w(TAG, "onReceiveMsg INTENT_LIST_FILES JsonParseException :" + stringExtra8);
                fileWrapperList = null;
            }
            String stringExtra9 = intent.getStringExtra(Constants.MessagerConstants.INTENT_LIST_FILE_PATH);
            BRLog.d(TAG, "onReceiveMsg INTENT_LIST_FILES srcPath " + stringExtra9);
            if (stringExtra9 != null) {
                LockManager.BooleanLock lock3 = this.mLockManager.getLock(Constants.MessagerConstants.INTENT_LIST_FILES, stringExtra9, "" + intExtra5);
                if (lock3 != null && fileWrapperList != null) {
                    BRLog.d(TAG, "onReceiveMsg INTENT_LIST_FILES srcPath " + stringExtra9 + ", listSize:" + fileWrapperList.getList().size());
                    lock3.setResult(fileWrapperList);
                }
                lock = lock3;
            }
        } else if (FileConfirmEvent.isFileConfirmEvent(action)) {
            String sentFile = new FileConfirmEvent(intent).getSentFile();
            if (sentFile != null) {
                onFileSentSuccess(sentFile);
            }
        } else {
            BRLog.d(TAG, "onReceiveMsg" + intent + ", " + z);
        }
        this.mLockManager.notifyLock(lock);
    }

    public int restoreAppData(String str, String str2) {
        Intent intent = new Intent(Constants.MessagerConstants.INTENT_RESTORE_APP_DATA);
        intent.putExtra(Constants.MessagerConstants.INTENT_RESTORE_SRC_FOLDER, str);
        intent.putExtra(Constants.MessagerConstants.INTENT_RESTORE_DST_FOLDER, str2);
        LockManager.BooleanLock booleanLockApplyLock = this.mLockManager.applyLock(Constants.MessagerConstants.INTENT_RESTORE_APP_DATA, str, str2);
        getPluginHandler().sendMsg(intent, true);
        return ((Integer) this.mLockManager.waitResult(booleanLockApplyLock)).intValue();
    }

    public int restoreTar(String str, String str2, String str3) {
        Intent intent = new Intent(Constants.MessagerConstants.INTENT_RESTORE_TAR);
        intent.putExtra(Constants.MessagerConstants.INTENT_RESTORE_TAR_FILE, str);
        intent.putExtra(Constants.MessagerConstants.INTENT_RESTORE_TAR_PACKAGE, str2);
        intent.putExtra(Constants.MessagerConstants.INTENT_RESTORE_TAR_APP_DATA_DST_FOLDER, str3);
        LockManager.BooleanLock booleanLockApplyLock = this.mLockManager.applyLock(Constants.MessagerConstants.INTENT_TAR, str, str2, str3);
        getPluginHandler().sendMsg(intent, true);
        return ((Integer) this.mLockManager.waitResult(booleanLockApplyLock)).intValue();
    }

    public boolean sendFile(String str, String str2) {
        if (!getBREngineConfig().hasFeature(BREngineConfig.FEATURE_SUPPORT_DIRECT_SEND)) {
            BRLog.w(TAG, "sendFileListMsg not support");
            return false;
        }
        File file = new File(str);
        if (file.exists() && !file.isDirectory()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new TransferFile(str, str2, 8));
            sendFileList(arrayList);
            return true;
        }
        BRLog.w(TAG, "sendFileListMsg , file invalid! " + str);
        return false;
    }

    public boolean sendFileList(List<TransferFile> list) {
        int i = 0;
        if (!getBREngineConfig().hasFeature(BREngineConfig.FEATURE_SUPPORT_DIRECT_SEND)) {
            BRLog.w(TAG, "sendFileListMsg not support");
            return false;
        }
        if (list == null || list.size() == 0) {
            return false;
        }
        for (TransferFile transferFile : list) {
            File file = new File(transferFile.getSrcPath());
            if (transferFile.getType() == 8) {
                if (!file.exists() || file.isDirectory()) {
                    BRLog.w(TAG, "sendFileListMsg , one of file is invalid! check! " + file.getAbsolutePath());
                    return false;
                }
            } else if (transferFile.getType() == 4 && (!file.exists() || !file.isDirectory())) {
                BRLog.w(TAG, "sendFileListMsg , one of folder is invalid! check! " + file.getAbsolutePath());
                return false;
            }
        }
        int size = list.size();
        if (size <= 100) {
            sendFileListMsg(list);
            return true;
        }
        int i2 = size + 0;
        while (i2 > 100) {
            int i3 = i + 100;
            sendFileListMsg(list.subList(i, i3));
            i2 = size - i3;
            i = i3;
        }
        sendFileListMsg(list.subList(i, i2 + i));
        return true;
    }

    public boolean sendFolder(String str, String str2) {
        if (!getBREngineConfig().hasFeature(BREngineConfig.FEATURE_SUPPORT_DIRECT_SEND)) {
            BRLog.w(TAG, "sendFileListMsg not support");
            return false;
        }
        File file = new File(str);
        if (file.exists() && file.isDirectory()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new TransferFile(str, str2, 4));
            sendFileList(arrayList);
            return true;
        }
        BRLog.w(TAG, "sendFileListMsg , folder invalid! " + str);
        return false;
    }

    public int tar(String str, String str2, String str3) {
        Intent intent = new Intent(Constants.MessagerConstants.INTENT_TAR);
        intent.putExtra(Constants.MessagerConstants.INTENT_TAR_FILE, str);
        intent.putExtra(Constants.MessagerConstants.INTENT_TAR_SOURCE_FOLDER, str2);
        intent.putExtra(Constants.MessagerConstants.INTENT_TAR_EXCLUDE_ARGS, str3);
        LockManager.BooleanLock booleanLockApplyLock = this.mLockManager.applyLock(Constants.MessagerConstants.INTENT_TAR, str, str2);
        getPluginHandler().sendMsg(intent, true);
        return ((Integer) this.mLockManager.waitResult(booleanLockApplyLock)).intValue();
    }

    public FileDescriptor getFileDescriptor(String str, int i) {
        Intent intent = new Intent(Constants.MessagerConstants.INTENT_GET_FD);
        intent.putExtra(Constants.MessagerConstants.INTENT_GET_FD_FILE_PATH, str);
        intent.putExtra(Constants.MessagerConstants.INTENT_GET_FD_FILE_FLAG, i);
        LockManager.BooleanLock booleanLockApplyLock = this.mLockManager.applyLock(Constants.MessagerConstants.INTENT_GET_FD, str);
        getPluginHandler().sendMsg(intent, true);
        FileDescriptor fileDescriptor = (FileDescriptor) this.mLockManager.waitResult(booleanLockApplyLock);
        try {
            return Os.dup(fileDescriptor);
        } catch (Exception e2) {
            BRLog.e(TAG, "getFileDescriptor, e =" + e2.getMessage());
            return fileDescriptor;
        } catch (NoClassDefFoundError unused) {
            BRLog.e(TAG, "getFileDescriptor, can't find the Class");
            return fileDescriptor;
        }
    }
}
