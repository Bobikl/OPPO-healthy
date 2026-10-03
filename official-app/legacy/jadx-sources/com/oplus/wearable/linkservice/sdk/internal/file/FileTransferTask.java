package com.oplus.wearable.linkservice.sdk.internal.file;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.oplus.aiunit.vision.fe8;
import com.oplus.aiunit.vision.gdb;
import com.oplus.aiunit.vision.mc7;
import com.oplus.aiunit.vision.wil;
import com.oplus.aiunit.vision.zil;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public class FileTransferTask implements Parcelable {
    public static final Parcelable.Creator<FileTransferTask> CREATOR = new a();
    public static final String ERROR_TASK_ID = null;
    public static final int ERROR_TRANSFER_ID = -1;
    private static final String TAG = "FileTransferTask";
    private boolean autoTransferWhenConnected;
    private int errorCode;
    private String fileName;
    private String filePath;
    private long fileTransferSize;
    private String finalSavePath;
    private boolean isReceiveTask;
    private boolean mChecked;
    private Uri mFileAndroidUri;
    private String nodeId;
    private int progress;
    private int serviceId;
    private State state;
    private String targetPath;
    private int transferId;
    private String uri;
    private String mTaskId = ERROR_TASK_ID;
    private byte[] md5 = null;
    private long fileSize = 0;
    private final Map<String, Object> mExtra = new ConcurrentHashMap();

    public enum State {
        DEFAULT,
        READY,
        TRANSFERING,
        PAUSED,
        CHECK,
        COMPLETE,
        CANCEL,
        FAILED
    }

    public class a implements Parcelable.Creator<FileTransferTask> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FileTransferTask createFromParcel(Parcel parcel) {
            return new FileTransferTask(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FileTransferTask[] newArray(int i) {
            return new FileTransferTask[i];
        }
    }

    public FileTransferTask() {
    }

    public static FileTransferTask fromSendRequest(String str, String str2, int i, Uri uri, String str3, int i2, byte[] bArr, String str4) {
        FileTransferTask fileTransferTask = new FileTransferTask();
        fileTransferTask.setUri(str2);
        fileTransferTask.setFileName(str4);
        fileTransferTask.setFilePath(str3);
        fileTransferTask.setMD5(bArr);
        fileTransferTask.setFileSize(i2);
        fileTransferTask.setNodeId(str);
        fileTransferTask.setServiceId(i);
        fileTransferTask.setReceiveTask(false);
        fileTransferTask.setFileAndroidUri(uri);
        return fileTransferTask;
    }

    public static String generateTaskId(String str, int i) {
        if (TextUtils.isEmpty(str) || i == -1) {
            return ERROR_TASK_ID;
        }
        String str2 = str + "#" + i;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str2.getBytes(Charset.forName("utf-8")));
            return fe8.a(messageDigest.digest());
        } catch (NoSuchAlgorithmException unused) {
            wil.b(TAG, "generateTaskId: can not get MD5 MessageDigest");
            return null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public Map<String, Object> getExtra() {
        return this.mExtra;
    }

    public Uri getFileAndroidUri() {
        return this.mFileAndroidUri;
    }

    public String getFileName() {
        return this.fileName;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public long getFileSize() {
        return this.fileSize;
    }

    public long getFileTransferSize() {
        return this.fileTransferSize;
    }

    public String getFinalSavePath() {
        return this.finalSavePath;
    }

    public byte[] getMD5() {
        return this.md5;
    }

    public String getNodeId() {
        return this.nodeId;
    }

    public int getProgress() {
        return this.progress;
    }

    public int getServiceId() {
        return this.serviceId;
    }

    public synchronized State getState() {
        return this.state;
    }

    public String getTargetPath() {
        return this.targetPath;
    }

    public String getTaskId() {
        if (this.mTaskId == null) {
            this.mTaskId = generateTaskId(this.nodeId, this.transferId);
        }
        return this.mTaskId;
    }

    public String getTempFilePath() {
        if (!TextUtils.isEmpty(this.finalSavePath)) {
            return zil.c(getTaskId(), this.finalSavePath);
        }
        wil.b(TAG, "getTempFilePath: error finalSavePath is empty");
        return "";
    }

    public int getTransferId() {
        return this.transferId;
    }

    public String getUri() {
        return this.uri;
    }

    public boolean isAutoTransferWhenConnected() {
        return this.autoTransferWhenConnected;
    }

    public boolean isChecked() {
        return this.mChecked;
    }

    public boolean isHighPriority() {
        return false;
    }

    public boolean isReceiveTask() {
        return this.isReceiveTask;
    }

    public void readFromParcel(Parcel parcel) {
        this.uri = parcel.readString();
        this.filePath = parcel.readString();
        this.fileName = parcel.readString();
        this.targetPath = parcel.readString();
        this.nodeId = parcel.readString();
        this.autoTransferWhenConnected = parcel.readByte() != 0;
        this.md5 = parcel.createByteArray();
        this.fileSize = parcel.readLong();
        this.transferId = parcel.readInt();
        this.fileTransferSize = parcel.readLong();
        this.isReceiveTask = parcel.readByte() != 0;
        this.serviceId = parcel.readInt();
        this.errorCode = parcel.readInt();
        this.progress = parcel.readInt();
        this.mChecked = parcel.readByte() != 0;
        this.finalSavePath = parcel.readString();
        this.mTaskId = parcel.readString();
    }

    public void setAutoTransferWhenConnected(boolean z) {
        this.autoTransferWhenConnected = z;
    }

    public void setChecked(boolean z) {
        this.mChecked = z;
    }

    public void setErrorCode(int i) {
        this.errorCode = i;
    }

    public void setFileAndroidUri(Uri uri) {
        this.mFileAndroidUri = uri;
    }

    public void setFileName(String str) {
        this.fileName = str;
    }

    public void setFilePath(String str) {
        this.filePath = str;
    }

    public void setFileSize(long j2) {
        this.fileSize = j2;
    }

    public void setFileTransferSize(long j2) {
        this.fileTransferSize = j2;
    }

    public void setFinalSavePath(String str) {
        this.finalSavePath = str;
    }

    public void setMD5(byte[] bArr) {
        this.md5 = bArr;
    }

    public void setNodeId(String str) {
        if (!TextUtils.isEmpty(str) && TextUtils.isEmpty(this.nodeId)) {
            this.nodeId = str;
            return;
        }
        wil.a(TAG, "setNodeId: nodeId can not set to " + str);
    }

    public void setProgress(int i) {
        this.progress = i;
    }

    public void setReceiveTask(boolean z) {
        this.isReceiveTask = z;
    }

    public void setServiceId(int i) {
        this.serviceId = i;
    }

    public synchronized void setState(State state) {
        this.state = state;
    }

    public void setTargetPath(String str) {
        this.targetPath = str;
    }

    public void setTaskId(String str) {
        this.mTaskId = str;
    }

    public void setTransferId(int i) {
        this.transferId = i;
    }

    public void setUri(String str) {
        this.uri = str;
    }

    public mc7 toFileTaskInfo() {
        mc7 mc7Var = new mc7();
        mc7Var.r(getTaskId());
        mc7Var.l(getFileName());
        mc7Var.m(getFileSize());
        mc7Var.p(isReceiveTask());
        mc7Var.q(getServiceId());
        mc7Var.s(getUri());
        mc7Var.n(getFileTransferSize());
        mc7Var.k(getErrorCode());
        mc7Var.o(getProgress());
        wil.a(TAG, "toFileTaskInfo -> " + mc7Var);
        return mc7Var;
    }

    public String toString() {
        return "FileTransferTask{uri='" + this.uri + "', filePath='" + this.filePath + "', fileName='" + this.fileName + "', targetPath='" + this.targetPath + "', nodeId='" + gdb.a(this.nodeId) + "', autoTransferWhenConnected=" + this.autoTransferWhenConnected + ", md5=" + fe8.a(this.md5) + ", fileSize=" + this.fileSize + ", transferId=" + this.transferId + ", fileTransferSize=" + this.fileTransferSize + ", serviceId=" + this.serviceId + ", isReceiveTask=" + this.isReceiveTask + ", state=" + this.state + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uri);
        parcel.writeString(this.filePath);
        parcel.writeString(this.fileName);
        parcel.writeString(this.targetPath);
        parcel.writeString(this.nodeId);
        parcel.writeByte(this.autoTransferWhenConnected ? (byte) 1 : (byte) 0);
        parcel.writeByteArray(this.md5);
        parcel.writeLong(this.fileSize);
        parcel.writeInt(this.transferId);
        parcel.writeLong(this.fileTransferSize);
        parcel.writeByte(this.isReceiveTask ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.serviceId);
        parcel.writeInt(this.errorCode);
        parcel.writeInt(this.progress);
        parcel.writeByte(this.mChecked ? (byte) 1 : (byte) 0);
        parcel.writeString(this.finalSavePath);
        parcel.writeString(this.mTaskId);
    }

    public FileTransferTask(Parcel parcel) {
        readFromParcel(parcel);
    }
}
