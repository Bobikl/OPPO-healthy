package com.heytap.store.platform.tools;

import android.util.Log;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.smartenginehelper.entity.TextEntity;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.Charsets;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001$B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u001c\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u001c\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u001a\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ*\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004J2\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\nJ$\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\nJ\u001a\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\u00102\b\u0010\t\u001a\u0004\u0018\u00010\nJ*\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\u00102\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004J4\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\u00102\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\nJ$\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\u00102\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\nJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u001c\u0010\u0014\u001a\u0004\u0018\u00010\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\nJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u001c\u0010\u0014\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\nJ\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0004J\"\u0010\u0018\u001a\u00020\u00192\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001b\u001a\u00020\u0019J*\u0010\u0018\u001a\u00020\u00192\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019J\"\u0010\u0018\u001a\u00020\u00192\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001b\u001a\u00020\u0019J*\u0010\u0018\u001a\u00020\u00192\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019J\"\u0010\u001d\u001a\u00020\u00192\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001b\u001a\u00020\u0019J*\u0010\u001d\u001a\u00020\u00192\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019J\"\u0010\u001d\u001a\u00020\u00192\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001b\u001a\u00020\u0019J*\u0010\u001d\u001a\u00020\u00192\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019J\u001a\u0010\u001e\u001a\u00020\u00192\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006J$\u0010\u001e\u001a\u00020\u00192\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\"\u0010\u001e\u001a\u00020\u00192\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001c\u001a\u00020\u0019J,\u0010\u001e\u001a\u00020\u00192\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001c\u001a\u00020\u00192\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u001a\u0010\u001e\u001a\u00020\u00192\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006J$\u0010\u001e\u001a\u00020\u00192\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\"\u0010\u001e\u001a\u00020\u00192\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001c\u001a\u00020\u0019J,\u0010\u001e\u001a\u00020\u00192\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001c\u001a\u00020\u00192\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u001a\u0010\u001f\u001a\u00020\u00192\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010 \u001a\u0004\u0018\u00010!J$\u0010\u001f\u001a\u00020\u00192\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\"\u0010\u001f\u001a\u00020\u00192\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\u001c\u001a\u00020\u0019J,\u0010\u001f\u001a\u00020\u00192\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\u001c\u001a\u00020\u00192\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u001a\u0010\u001f\u001a\u00020\u00192\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010 \u001a\u0004\u0018\u00010!J$\u0010\u001f\u001a\u00020\u00192\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\"\u0010\u001f\u001a\u00020\u00192\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\u001c\u001a\u00020\u0019J,\u0010\u001f\u001a\u00020\u00192\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\u001c\u001a\u00020\u00192\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u001a\u0010\"\u001a\u00020\u00192\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010#\u001a\u0004\u0018\u00010\nJ\"\u0010\"\u001a\u00020\u00192\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010#\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001c\u001a\u00020\u0019J\u001a\u0010\"\u001a\u00020\u00192\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010#\u001a\u0004\u0018\u00010\nJ\"\u0010\"\u001a\u00020\u00192\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010#\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001c\u001a\u00020\u0019R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/heytap/store/platform/tools/FileIOUtils;", "", "()V", "sBufferSize", "", "readFile2BytesByChannel", "", Const.Scheme.SCHEME_FILE, "Ljava/io/File;", "filePath", "", "readFile2BytesByMap", "readFile2BytesByStream", "listener", "Lcom/heytap/store/platform/tools/FileIOUtils$OnProgressUpdateListener;", "readFile2List", "", "st", TextEntity.ELLIPSIZE_END, "charsetName", "readFile2String", "setBufferSize", "", "bufferSize", "writeFileFromBytesByChannel", "", "bytes", "isForce", "append", "writeFileFromBytesByMap", "writeFileFromBytesByStream", "writeFileFromIS", "is", "Ljava/io/InputStream;", "writeFileFromString", "content", "OnProgressUpdateListener", "utils_release"}, k = 1, mv = {1, 4, 0})
public final class FileIOUtils {
    public static final FileIOUtils INSTANCE = new FileIOUtils();
    private static int sBufferSize = 524288;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/heytap/store/platform/tools/FileIOUtils$OnProgressUpdateListener;", "", "onProgressUpdate", "", "progress", "", "utils_release"}, k = 1, mv = {1, 4, 0})
    public interface OnProgressUpdateListener {
        void onProgressUpdate(double progress);
    }

    private FileIOUtils() {
    }

    @Nullable
    public final byte[] readFile2BytesByChannel(@Nullable String filePath) {
        return readFile2BytesByChannel(FileUtils.INSTANCE.getFileByPath(filePath));
    }

    @Nullable
    public final byte[] readFile2BytesByMap(@Nullable String filePath) {
        return readFile2BytesByMap(FileUtils.INSTANCE.getFileByPath(filePath));
    }

    @Nullable
    public final byte[] readFile2BytesByStream(@Nullable String filePath) {
        return readFile2BytesByStream(FileUtils.INSTANCE.getFileByPath(filePath), (OnProgressUpdateListener) null);
    }

    @Nullable
    public final List<String> readFile2List(@Nullable String filePath) {
        return readFile2List(FileUtils.INSTANCE.getFileByPath(filePath), (String) null);
    }

    @Nullable
    public final String readFile2String(@Nullable String filePath) {
        return readFile2String(FileUtils.INSTANCE.getFileByPath(filePath), (String) null);
    }

    public final void setBufferSize(int bufferSize) {
        sBufferSize = bufferSize;
    }

    public final boolean writeFileFromBytesByChannel(@Nullable String filePath, @Nullable byte[] bytes, boolean isForce) {
        return writeFileFromBytesByChannel(FileUtils.INSTANCE.getFileByPath(filePath), bytes, false, isForce);
    }

    public final boolean writeFileFromBytesByMap(@Nullable String filePath, @Nullable byte[] bytes, boolean isForce) {
        return writeFileFromBytesByMap(filePath, bytes, false, isForce);
    }

    public final boolean writeFileFromBytesByStream(@Nullable String filePath, @Nullable byte[] bytes) {
        return writeFileFromBytesByStream(FileUtils.INSTANCE.getFileByPath(filePath), bytes, false, (OnProgressUpdateListener) null);
    }

    public final boolean writeFileFromIS(@Nullable String filePath, @Nullable InputStream is) {
        return writeFileFromIS(FileUtils.INSTANCE.getFileByPath(filePath), is, false, (OnProgressUpdateListener) null);
    }

    public final boolean writeFileFromString(@Nullable String filePath, @Nullable String content) {
        return writeFileFromString(FileUtils.INSTANCE.getFileByPath(filePath), content, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.nio.channels.spi.AbstractInterruptibleChannel] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean] */
    @Nullable
    public final byte[] readFile2BytesByChannel(@Nullable File file) throws Throwable {
        FileChannel channel;
        ?? IsFileExists = FileUtils.INSTANCE.isFileExists(file);
        byte[] bArrArray = null;
        bArrArray = null;
        bArrArray = null;
        ?? r0 = 0;
        try {
            try {
                if (IsFileExists == 0) {
                    return null;
                }
                try {
                    channel = new RandomAccessFile(file, "r").getChannel();
                    try {
                        if (channel == null) {
                            Log.e("FileIOUtils", "fc is null.");
                            return new byte[0];
                        }
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((int) channel.size());
                        Intrinsics.checkNotNullExpressionValue(byteBufferAllocate, "ByteBuffer.allocate(fc.size().toInt())");
                        while (channel.read(byteBufferAllocate) > 0) {
                        }
                        bArrArray = byteBufferAllocate.array();
                        channel.close();
                    } catch (IOException e2) {
                        e = e2;
                        e.printStackTrace();
                        if (channel != null) {
                            channel.close();
                        }
                        return bArrArray;
                    }
                } catch (IOException e3) {
                    e = e3;
                    channel = null;
                } catch (Throwable th) {
                    th = th;
                    if (r0 != 0) {
                        try {
                            r0.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                r0 = IsFileExists;
            }
        } catch (IOException e5) {
            e5.printStackTrace();
        }
        return bArrArray;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.nio.channels.spi.AbstractInterruptibleChannel] */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean] */
    @Nullable
    public final byte[] readFile2BytesByMap(@Nullable File file) throws Throwable {
        FileChannel channel;
        ?? IsFileExists = FileUtils.INSTANCE.isFileExists(file);
        ?? r0 = 0;
        try {
            if (IsFileExists == 0) {
                return null;
            }
            try {
                channel = new RandomAccessFile(file, "r").getChannel();
                try {
                    if (channel == null) {
                        Log.e("FileIOUtils", "fc is null.");
                        return new byte[0];
                    }
                    int size = (int) channel.size();
                    MappedByteBuffer mappedByteBufferLoad = channel.map(FileChannel.MapMode.READ_ONLY, 0L, size).load();
                    Intrinsics.checkNotNullExpressionValue(mappedByteBufferLoad, "fc.map(FileChannel.MapMo… 0, size.toLong()).load()");
                    byte[] bArr = new byte[size];
                    mappedByteBufferLoad.get(bArr, 0, size);
                    try {
                        channel.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                    return bArr;
                } catch (IOException e3) {
                    e = e3;
                    e.printStackTrace();
                    if (channel == null) {
                        return null;
                    }
                    try {
                        channel.close();
                        return null;
                    } catch (IOException e4) {
                        e4.printStackTrace();
                        return null;
                    }
                }
            } catch (IOException e5) {
                e = e5;
                channel = null;
            } catch (Throwable th) {
                th = th;
                if (r0 != 0) {
                    try {
                        r0.close();
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            r0 = IsFileExists;
        }
    }

    @Nullable
    public final byte[] readFile2BytesByStream(@Nullable File file) {
        return readFile2BytesByStream(file, (OnProgressUpdateListener) null);
    }

    @Nullable
    public final List<String> readFile2List(@Nullable String filePath, @Nullable String charsetName) {
        return readFile2List(FileUtils.INSTANCE.getFileByPath(filePath), charsetName);
    }

    @Nullable
    public final String readFile2String(@Nullable String filePath, @Nullable String charsetName) {
        return readFile2String(FileUtils.INSTANCE.getFileByPath(filePath), charsetName);
    }

    public final boolean writeFileFromBytesByChannel(@Nullable String filePath, @Nullable byte[] bytes, boolean append, boolean isForce) {
        return writeFileFromBytesByChannel(FileUtils.INSTANCE.getFileByPath(filePath), bytes, append, isForce);
    }

    public final boolean writeFileFromBytesByMap(@Nullable String filePath, @Nullable byte[] bytes, boolean append, boolean isForce) {
        return writeFileFromBytesByMap(FileUtils.INSTANCE.getFileByPath(filePath), bytes, append, isForce);
    }

    public final boolean writeFileFromBytesByStream(@Nullable String filePath, @Nullable byte[] bytes, boolean append) {
        return writeFileFromBytesByStream(FileUtils.INSTANCE.getFileByPath(filePath), bytes, append, (OnProgressUpdateListener) null);
    }

    public final boolean writeFileFromIS(@Nullable String filePath, @Nullable InputStream is, boolean append) {
        return writeFileFromIS(FileUtils.INSTANCE.getFileByPath(filePath), is, append, (OnProgressUpdateListener) null);
    }

    public final boolean writeFileFromString(@Nullable String filePath, @Nullable String content, boolean append) {
        return writeFileFromString(FileUtils.INSTANCE.getFileByPath(filePath), content, append);
    }

    @Nullable
    public final byte[] readFile2BytesByStream(@Nullable String filePath, @Nullable OnProgressUpdateListener listener) {
        return readFile2BytesByStream(FileUtils.INSTANCE.getFileByPath(filePath), listener);
    }

    @Nullable
    public final List<String> readFile2List(@Nullable File file) {
        return readFile2List(file, 0, Integer.MAX_VALUE, (String) null);
    }

    @Nullable
    public final String readFile2String(@Nullable File file) {
        return readFile2String(file, (String) null);
    }

    public final boolean writeFileFromBytesByChannel(@Nullable File file, @Nullable byte[] bytes, boolean isForce) {
        return writeFileFromBytesByChannel(file, bytes, false, isForce);
    }

    public final boolean writeFileFromBytesByMap(@Nullable File file, @Nullable byte[] bytes, boolean isForce) {
        return writeFileFromBytesByMap(file, bytes, false, isForce);
    }

    public final boolean writeFileFromBytesByStream(@Nullable File file, @Nullable byte[] bytes) {
        return writeFileFromBytesByStream(file, bytes, false, (OnProgressUpdateListener) null);
    }

    public final boolean writeFileFromIS(@Nullable File file, @Nullable InputStream is) {
        return writeFileFromIS(file, is, false, (OnProgressUpdateListener) null);
    }

    public final boolean writeFileFromString(@Nullable File file, @Nullable String content) {
        return writeFileFromString(file, content, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.io.BufferedInputStream, java.io.InputStream] */
    @Nullable
    public final byte[] readFile2BytesByStream(@Nullable File file, @Nullable OnProgressUpdateListener listener) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        ?? IsFileExists = FileUtils.INSTANCE.isFileExists((File) file);
        if (IsFileExists == 0) {
            return null;
        }
        try {
            try {
                IsFileExists = new BufferedInputStream(new FileInputStream((File) file), sBufferSize);
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[sBufferSize];
                        if (listener != null) {
                            double dAvailable = IsFileExists.available();
                            listener.onProgressUpdate(0.0d);
                            int i = 0;
                            while (true) {
                                int i2 = IsFileExists.read(bArr, 0, sBufferSize);
                                if (i2 == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, i2);
                                i += i2;
                                listener.onProgressUpdate(((double) i) / dAvailable);
                            }
                        } else {
                            while (true) {
                                int i3 = IsFileExists.read(bArr, 0, sBufferSize);
                                if (i3 == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, i3);
                            }
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        try {
                            IsFileExists.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                        return byteArray;
                    } catch (IOException e4) {
                        e = e4;
                        e.printStackTrace();
                        try {
                            IsFileExists.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                        if (byteArrayOutputStream == null) {
                            return null;
                        }
                        try {
                            byteArrayOutputStream.close();
                            return null;
                        } catch (IOException e6) {
                            e6.printStackTrace();
                            return null;
                        }
                    }
                } catch (IOException e7) {
                    e = e7;
                    byteArrayOutputStream = null;
                } catch (Throwable th) {
                    th = th;
                    file = 0;
                    try {
                        IsFileExists.close();
                    } catch (IOException e8) {
                        e8.printStackTrace();
                    }
                    if (file != 0) {
                        try {
                            file.close();
                            throw th;
                        } catch (IOException e9) {
                            e9.printStackTrace();
                            throw th;
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (FileNotFoundException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    @Nullable
    public final List<String> readFile2List(@Nullable File file, @Nullable String charsetName) {
        return readFile2List(file, 0, Integer.MAX_VALUE, charsetName);
    }

    @Nullable
    public final String readFile2String(@Nullable File file, @Nullable String charsetName) {
        byte[] file2BytesByStream = readFile2BytesByStream(file);
        if (file2BytesByStream == null) {
            return null;
        }
        if (charsetName == null || StringsKt__StringsJVMKt.isBlank(charsetName)) {
            return new String(file2BytesByStream, Charsets.UTF_8);
        }
        try {
            Charset charsetForName = Charset.forName(charsetName);
            Intrinsics.checkNotNullExpressionValue(charsetForName, "Charset.forName(charsetName)");
            return new String(file2BytesByStream, charsetForName);
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public final boolean writeFileFromBytesByChannel(@Nullable File file, @Nullable byte[] bytes, boolean append, boolean isForce) {
        if (bytes == null) {
            Log.e("FileIOUtils", "bytes is null.");
            return false;
        }
        if (!FileUtils.INSTANCE.createOrExistsFile(file)) {
            Log.e("FileIOUtils", "create file <" + file + "> failed.");
            return false;
        }
        AbstractInterruptibleChannel abstractInterruptibleChannel = null;
        try {
            try {
                FileChannel channel = new FileOutputStream(file, append).getChannel();
                if (channel == null) {
                    Log.e("FileIOUtils", "fc is null.");
                    return false;
                }
                channel.position(channel.size());
                channel.write(ByteBuffer.wrap(bytes));
                if (isForce) {
                    channel.force(true);
                }
                try {
                    channel.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
                return true;
            } catch (IOException e3) {
                e3.printStackTrace();
                if (0 == 0) {
                    return false;
                }
                try {
                    abstractInterruptibleChannel.close();
                    return false;
                } catch (IOException e4) {
                    e4.printStackTrace();
                    return false;
                }
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    abstractInterruptibleChannel.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            }
            throw th;
        }
    }

    public final boolean writeFileFromBytesByMap(@Nullable File file, @Nullable byte[] bytes, boolean append, boolean isForce) {
        if (bytes != null && FileUtils.INSTANCE.createOrExistsFile(file)) {
            AbstractInterruptibleChannel abstractInterruptibleChannel = null;
            try {
                try {
                    FileChannel channel = new FileOutputStream(file, append).getChannel();
                    if (channel == null) {
                        Log.e("FileIOUtils", "fc is null.");
                        return false;
                    }
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_WRITE, channel.size(), bytes.length);
                    Intrinsics.checkNotNullExpressionValue(map, "fc.map(FileChannel.MapMo…e(), bytes.size.toLong())");
                    map.put(bytes);
                    if (isForce) {
                        map.force();
                    }
                    try {
                        channel.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                    return true;
                } catch (IOException e3) {
                    e3.printStackTrace();
                    if (0 == 0) {
                        return false;
                    }
                    try {
                        abstractInterruptibleChannel.close();
                        return false;
                    } catch (IOException e4) {
                        e4.printStackTrace();
                        return false;
                    }
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        abstractInterruptibleChannel.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
                throw th;
            }
        }
        Log.e("FileIOUtils", "create file <" + file + "> failed.");
        return false;
    }

    public final boolean writeFileFromBytesByStream(@Nullable File file, @Nullable byte[] bytes, boolean append) {
        return writeFileFromBytesByStream(file, bytes, append, (OnProgressUpdateListener) null);
    }

    public final boolean writeFileFromIS(@Nullable File file, @Nullable InputStream is, boolean append) {
        return writeFileFromIS(file, is, append, (OnProgressUpdateListener) null);
    }

    public final boolean writeFileFromString(@Nullable File file, @Nullable String content, boolean append) throws Throwable {
        if (file == null || content == null) {
            return false;
        }
        if (!FileUtils.INSTANCE.createOrExistsFile(file)) {
            Log.e("FileIOUtils", "create file <" + file + "> failed.");
            return false;
        }
        BufferedWriter bufferedWriter = null;
        try {
            try {
                BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(file, append));
                try {
                    bufferedWriter2.write(content);
                    try {
                        bufferedWriter2.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                    return true;
                } catch (IOException e3) {
                    e = e3;
                    bufferedWriter = bufferedWriter2;
                    e.printStackTrace();
                    if (bufferedWriter == null) {
                        return false;
                    }
                    try {
                        bufferedWriter.close();
                        return false;
                    } catch (IOException e4) {
                        e4.printStackTrace();
                        return false;
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    if (bufferedWriter != null) {
                        try {
                            bufferedWriter.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (IOException e6) {
                e = e6;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Nullable
    public final List<String> readFile2List(@Nullable String filePath, int st, int end) {
        return readFile2List(FileUtils.INSTANCE.getFileByPath(filePath), st, end, (String) null);
    }

    public final boolean writeFileFromBytesByStream(@Nullable String filePath, @Nullable byte[] bytes, @Nullable OnProgressUpdateListener listener) {
        return writeFileFromBytesByStream(FileUtils.INSTANCE.getFileByPath(filePath), bytes, false, listener);
    }

    public final boolean writeFileFromIS(@Nullable String filePath, @Nullable InputStream is, @Nullable OnProgressUpdateListener listener) {
        return writeFileFromIS(FileUtils.INSTANCE.getFileByPath(filePath), is, false, listener);
    }

    @Nullable
    public final List<String> readFile2List(@Nullable String filePath, int st, int end, @Nullable String charsetName) {
        return readFile2List(FileUtils.INSTANCE.getFileByPath(filePath), st, end, charsetName);
    }

    public final boolean writeFileFromBytesByStream(@Nullable String filePath, @Nullable byte[] bytes, boolean append, @Nullable OnProgressUpdateListener listener) {
        return writeFileFromBytesByStream(FileUtils.INSTANCE.getFileByPath(filePath), bytes, append, listener);
    }

    public final boolean writeFileFromIS(@Nullable String filePath, @Nullable InputStream is, boolean append, @Nullable OnProgressUpdateListener listener) {
        return writeFileFromIS(FileUtils.INSTANCE.getFileByPath(filePath), is, append, listener);
    }

    @Nullable
    public final List<String> readFile2List(@Nullable File file, int st, int end) {
        return readFile2List(file, st, end, (String) null);
    }

    public final boolean writeFileFromBytesByStream(@Nullable File file, @Nullable byte[] bytes, @Nullable OnProgressUpdateListener listener) {
        return writeFileFromBytesByStream(file, bytes, false, listener);
    }

    public final boolean writeFileFromIS(@Nullable File file, @Nullable InputStream is, @Nullable OnProgressUpdateListener listener) {
        return writeFileFromIS(file, is, false, listener);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Nullable
    public final List<String> readFile2List(@Nullable File file, int st, int end, @Nullable String charsetName) throws Throwable {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        if (!FileUtils.INSTANCE.isFileExists(file) || st > end) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            int i = 1;
            if (charsetName == null || StringsKt__StringsJVMKt.isBlank(charsetName)) {
                bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            } else {
                bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charsetName));
            }
            while (true) {
                try {
                    try {
                        String it = bufferedReader.readLine();
                        Intrinsics.checkNotNullExpressionValue(it, "it");
                        if (it == null || i > end) {
                            break;
                            break;
                        }
                        if (st <= i && end >= i) {
                            arrayList.add(it);
                        }
                        i++;
                    } catch (IOException e2) {
                        e = e2;
                        e.printStackTrace();
                        if (bufferedReader == null) {
                            return null;
                        }
                        try {
                            bufferedReader.close();
                            return null;
                        } catch (IOException e3) {
                            e3.printStackTrace();
                            return null;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedReader2 = bufferedReader;
                    if (bufferedReader2 != null) {
                        try {
                            bufferedReader2.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    throw th;
                }
            }
            try {
                bufferedReader.close();
            } catch (IOException e5) {
                e5.printStackTrace();
            }
            return arrayList;
        } catch (IOException e6) {
            e = e6;
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
            if (bufferedReader2 != null) {
                bufferedReader2.close();
            }
            throw th;
        }
    }

    public final boolean writeFileFromBytesByStream(@Nullable File file, @Nullable byte[] bytes, boolean append, @Nullable OnProgressUpdateListener listener) {
        if (bytes == null) {
            return false;
        }
        return writeFileFromIS(file, new ByteArrayInputStream(bytes), append, listener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final boolean writeFileFromIS(@Nullable File file, @Nullable InputStream is, boolean append, @Nullable OnProgressUpdateListener listener) throws Throwable {
        boolean z = false;
        if (is != null && FileUtils.INSTANCE.createOrExistsFile(file)) {
            ?? r0 = 0;
            r0 = 0;
            r0 = 0;
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file, append), sBufferSize);
                try {
                    try {
                        try {
                            if (listener == null) {
                                byte[] bArr = new byte[sBufferSize];
                                while (true) {
                                    int i = is.read(bArr);
                                    if (i == -1) {
                                        break;
                                    }
                                    bufferedOutputStream.write(bArr, 0, i);
                                }
                                is.close();
                                bufferedOutputStream.close();
                                z = true;
                                return z;
                            }
                            double dAvailable = is.available();
                            listener.onProgressUpdate(0.0d);
                            byte[] bArr2 = new byte[sBufferSize];
                            int i2 = 0;
                            while (true) {
                                int i3 = is.read(bArr2);
                                r0 = i2;
                                if (i3 == -1) {
                                    break;
                                }
                                bufferedOutputStream.write(bArr2, 0, i3);
                                int i4 = (i2 == true ? 1 : 0) + i3;
                                listener.onProgressUpdate(((double) i4) / dAvailable);
                                i2 = i4;
                            }
                            is.close();
                            bufferedOutputStream.close();
                            z = true;
                            return z;
                            is.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                        bufferedOutputStream.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                    z = true;
                } catch (IOException e4) {
                    e = e4;
                    r0 = bufferedOutputStream;
                    e.printStackTrace();
                    try {
                        is.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                    if (r0 != 0) {
                        try {
                            r0.close();
                        } catch (IOException e6) {
                            e6.printStackTrace();
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    r0 = bufferedOutputStream;
                    try {
                        is.close();
                    } catch (IOException e7) {
                        e7.printStackTrace();
                    }
                    if (r0 != 0) {
                        try {
                            r0.close();
                            throw th;
                        } catch (IOException e8) {
                            e8.printStackTrace();
                            throw th;
                        }
                    }
                    throw th;
                }
            } catch (IOException e9) {
                e = e9;
            }
            return z;
        }
        Log.e("FileIOUtils", "create file <" + file + "> failed.");
        return false;
    }
}
