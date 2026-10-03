package com.heytap.store.base.core.util.download;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import android.os.StatFs;
import com.heytap.store.base.core.util.download.util.IOUtils;
import com.heytap.store.platform.tools.LogUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public class CommonSaveFileTask {
    public static final int CREATE_FILE_FAILED = 4;
    public static final int SAVE_FAILED_COMPRESS_FAILED = 3;
    public static final int SAVE_FAILED_LOW_MEMORY = 2;
    public static final int SAVE_FAILED_STORAGE_FULL = 1;
    public static final int SAVE_SUCCESS = 0;
    private static final String TAG = "CommonSaveFileTask";
    private String errorMsg;
    private String savePath;
    private int whatMsg = -1;
    private boolean mIsCancel = false;

    /* JADX INFO: renamed from: com.heytap.store.base.core.util.download.CommonSaveFileTask$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$android$graphics$Bitmap$CompressFormat;

        static {
            int[] iArr = new int[Bitmap.CompressFormat.values().length];
            $SwitchMap$android$graphics$Bitmap$CompressFormat = iArr;
            try {
                iArr[Bitmap.CompressFormat.JPEG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$CompressFormat[Bitmap.CompressFormat.PNG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$CompressFormat[Bitmap.CompressFormat.WEBP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public interface IUnZipListener {
        void unzipSuccess();
    }

    public interface ProgressHandler {
        void updateProgress(long j2, long j3);
    }

    private CommonSaveFileTask() {
    }

    private boolean checkCreateFileOk(long j2, String str) {
        File file = new File(str);
        if (!file.exists() && !file.mkdirs()) {
            this.whatMsg = 4;
            return false;
        }
        LogUtils logUtils = LogUtils.INSTANCE;
        String str2 = TAG;
        logUtils.d(str2, "[savefiletask] file size is:" + j2);
        StatFs statFs = new StatFs(str);
        long availableBlocks = ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        logUtils.d(str2, "[savefiletask] availablespace:" + availableBlocks);
        if (j2 < availableBlocks) {
            return true;
        }
        this.whatMsg = 1;
        return false;
    }

    public static CommonSaveFileTask newInstance() {
        return new CommonSaveFileTask();
    }

    public void cancel() {
        this.mIsCancel = true;
    }

    public String getErrorMsg() {
        int i = this.whatMsg;
        if (i == 1) {
            this.errorMsg = "not enough storage available";
        } else if (i == 3) {
            this.errorMsg = "error occurred while save picture";
        } else if (i == 4) {
            this.errorMsg = "error  occurred while create file";
        }
        return this.errorMsg;
    }

    public String getSavePath() {
        return this.savePath;
    }

    public int getWhatMsg() {
        return this.whatMsg;
    }

    @TargetApi(19)
    public boolean save(Bitmap bitmap, String str, String str2, int i, Bitmap.CompressFormat compressFormat) throws Throwable {
        if (bitmap == null || bitmap.isRecycled() || !checkCreateFileOk(bitmap.getAllocationByteCount() / 1048576, str)) {
            return false;
        }
        if (compressFormat != null) {
            int i2 = AnonymousClass1.$SwitchMap$android$graphics$Bitmap$CompressFormat[compressFormat.ordinal()];
            if (i2 == 1) {
                str2 = str2 + ".jpg";
            } else if (i2 == 2) {
                str2 = str2 + ".png";
            } else if (i2 == 3) {
                str2 = str2 + ".bmp";
            }
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                this.savePath = str + str2;
                FileOutputStream fileOutputStream2 = new FileOutputStream(this.savePath);
                if (compressFormat == null) {
                    try {
                        compressFormat = Bitmap.CompressFormat.JPEG;
                    } catch (Exception e2) {
                        e = e2;
                        fileOutputStream = fileOutputStream2;
                        LogUtils.INSTANCE.d(TAG, e.toString());
                        this.whatMsg = 3;
                        IOUtils.closeQuietly((OutputStream) fileOutputStream);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        IOUtils.closeQuietly((OutputStream) fileOutputStream);
                        throw th;
                    }
                }
                boolean zCompress = bitmap.compress(compressFormat, i, fileOutputStream2);
                IOUtils.closeQuietly((OutputStream) fileOutputStream2);
                return zCompress;
            } catch (Exception e3) {
                e = e3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @TargetApi(19)
    public boolean save(Bitmap bitmap, String str, String str2, int i) {
        return save(bitmap, str, str2, i, (Bitmap.CompressFormat) null);
    }

    public boolean save(InputStream inputStream, String str, long j2) {
        return save(inputStream, str, j2, (ProgressHandler) null);
    }

    public boolean save(InputStream inputStream, String str, long j2, ProgressHandler progressHandler) {
        return save(inputStream, str, false, j2, (ProgressHandler) null);
    }

    public boolean save(InputStream inputStream, String str, boolean z, long j2, ProgressHandler progressHandler) throws Throwable {
        int i;
        this.savePath = str;
        File file = new File(str);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                if (checkCreateFileOk(j2, file.getParent())) {
                    if (!file.exists()) {
                        file.getParentFile().mkdirs();
                        file.createNewFile();
                    }
                    byte[] bArr = new byte[2048];
                    long length = z ? file.length() : 0L;
                    FileOutputStream fileOutputStream2 = new FileOutputStream(str);
                    while (!this.mIsCancel && (i = inputStream.read(bArr)) != -1) {
                        try {
                            fileOutputStream2.write(bArr, 0, i);
                            length += (long) i;
                            if (progressHandler != null) {
                                progressHandler.updateProgress(j2, length);
                            }
                            LogUtils.INSTANCE.d(TAG, "file download: " + length + " of " + j2);
                        } catch (IOException unused) {
                            fileOutputStream = fileOutputStream2;
                            this.whatMsg = 4;
                            IOUtils.closeQuietly(inputStream);
                            IOUtils.closeQuietly((OutputStream) fileOutputStream);
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            fileOutputStream = fileOutputStream2;
                            IOUtils.closeQuietly(inputStream);
                            IOUtils.closeQuietly((OutputStream) fileOutputStream);
                            throw th;
                        }
                    }
                    fileOutputStream2.flush();
                    IOUtils.closeQuietly(inputStream);
                    IOUtils.closeQuietly((OutputStream) fileOutputStream2);
                    return true;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException unused2) {
        }
        IOUtils.closeQuietly(inputStream);
        IOUtils.closeQuietly((OutputStream) fileOutputStream);
        return false;
    }

    public boolean save(InputStream inputStream, ParcelFileDescriptor parcelFileDescriptor, long j2, ProgressHandler progressHandler) {
        FileOutputStream fileOutputStream = new FileOutputStream(parcelFileDescriptor.getFileDescriptor());
        try {
            byte[] bArr = new byte[2048];
            long j3 = 0;
            while (true) {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    fileOutputStream.flush();
                    return true;
                }
                fileOutputStream.write(bArr, 0, i);
                j3 += (long) i;
                if (progressHandler != null) {
                    progressHandler.updateProgress(j2, j3);
                }
                LogUtils.INSTANCE.d(TAG, "file download: " + j3 + " of " + j2);
                IOUtils.closeQuietly(inputStream);
                IOUtils.closeQuietly((OutputStream) fileOutputStream);
            }
        } catch (IOException unused) {
            this.whatMsg = 4;
            return false;
        } finally {
            IOUtils.closeQuietly(inputStream);
            IOUtils.closeQuietly((OutputStream) fileOutputStream);
        }
    }
}
