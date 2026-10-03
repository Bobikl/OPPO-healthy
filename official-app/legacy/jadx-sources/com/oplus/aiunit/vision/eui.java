package com.oplus.aiunit.vision;

import android.os.Environment;
import android.os.StatFs;
import com.heytap.accessory.file.model.Constant;
import java.text.DecimalFormat;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\t\u001a\u00020\bH\u0002R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/eui;", "", "", Constant.FILE_SIZE, "", "a", "", "c", "", "b", "TAG", "Ljava/lang/String;", "BASE_KBYTE", "I", "BASE_MBYTE", "BASE_GBYTE", "J", "MIN_CAP_LIMIT", "<init>", "()V", "recordfilemanager_impl_release"}, k = 1, mv = {1, 8, 0})
public final class eui {
    public static final long BASE_GBYTE = 1073741824;
    public static final int BASE_KBYTE = 1024;
    public static final int BASE_MBYTE = 1048576;

    @NotNull
    public static final eui INSTANCE = new eui();
    public static final long MIN_CAP_LIMIT = 4294967296L;

    @NotNull
    public static final String TAG = "StorageUtil";

    @NotNull
    public final String a(int fileSize) {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        if (fileSize < 1024) {
            return decimalFormat.format(fileSize) + c8l.KEY_B;
        }
        if (fileSize < 1048576) {
            return decimalFormat.format(((double) fileSize) / ((double) 1024)) + "KB";
        }
        if (fileSize < 1073741824) {
            return decimalFormat.format(((double) fileSize) / ((double) 1048576)) + "MB";
        }
        return decimalFormat.format(((double) fileSize) / 1073741824) + "G";
    }

    public final long b() {
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        long blockSizeLong = statFs.getBlockSizeLong();
        long availableBlocksLong = statFs.getAvailableBlocksLong();
        long j2 = blockSizeLong * availableBlocksLong;
        pwf.a(TAG, "getAvailableMemorySize blockSize " + blockSizeLong + " availableBlockCount " + availableBlocksLong + " totalSize " + j2);
        return j2;
    }

    public final boolean c() {
        return b() < MIN_CAP_LIMIT;
    }
}
