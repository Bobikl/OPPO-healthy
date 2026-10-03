package com.heytap.store.platform.tools;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import com.heytap.webview.extension.protocol.Const;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.annotation.AnnotationRetention;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.StringCompanionObject;
import p010kotlin.text.StringsKt__StringsJVMKt;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002>?B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J,\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u000bH\u0002J.\u0010\u0015\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u000bH\u0002J\u0010\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0019\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u0019\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u001b\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u001b\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u001c\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u001c\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004J\u0012\u0010\u001f\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\rH\u0002J\u0012\u0010 \u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\rH\u0002J\u0010\u0010!\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\rJ\u0010\u0010!\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004J\u001a\u0010\"\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\r2\b\u0010#\u001a\u0004\u0018\u00010$J\u001a\u0010\"\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00042\b\u0010#\u001a\u0004\u0018\u00010$J\u0010\u0010%\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\rH\u0002J\u0012\u0010&\u001a\u0004\u0018\u00010\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\rJ\u0010\u0010&\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0018\u001a\u00020\u0004J\u0012\u0010'\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001e\u001a\u00020\rH\u0002J\u0012\u0010(\u001a\u0004\u0018\u00010\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004J\u0012\u0010)\u001a\u0004\u0018\u00010\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\rJ\u0010\u0010)\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0018\u001a\u00020\u0004J\u0010\u0010*\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\rJ\u0010\u0010*\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004J\u0010\u0010+\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\rH\u0002J\u0012\u0010,\u001a\u0004\u0018\u00010\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\rJ\u0010\u0010,\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0018\u001a\u00020\u0004J\u0012\u0010-\u001a\u0004\u0018\u00010\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\rJ\u0010\u0010-\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0018\u001a\u00020\u0004J\u0012\u0010.\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\rH\u0002J\u0010\u0010/\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\rJ\u0010\u0010/\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004J\u0012\u00100\u001a\u0004\u0018\u00010\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\rJ\u0012\u00100\u001a\u0004\u0018\u00010\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004J\u0010\u00101\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\rJ\u0010\u00101\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004J\u0010\u00102\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\rJ\u0010\u00102\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004J\u0010\u00103\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\rJ\u0010\u00103\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004J\u0012\u00104\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u0002J\u0018\u00105\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u0001062\b\u0010\u001e\u001a\u0004\u0018\u00010\rJ(\u00105\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u0001062\b\u0010\u001e\u001a\u0004\u0018\u00010\r2\u000e\u00107\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u000108J \u00105\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u0001062\b\u0010\u001e\u001a\u0004\u0018\u00010\r2\u0006\u00109\u001a\u00020\u000bJ0\u00105\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u0001062\b\u0010\u001e\u001a\u0004\u0018\u00010\r2\u0006\u00109\u001a\u00020\u000b2\u000e\u00107\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u000108J\u0018\u00105\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u0001062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004J(\u00105\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u0001062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00042\u000e\u00107\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u000108J \u00105\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u0001062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00042\u0006\u00109\u001a\u00020\u000bJ0\u00105\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u0001062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00042\u0006\u00109\u001a\u00020\u000b2\u000e\u00107\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u000108J8\u0010:\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u0001062\b\u0010\u001e\u001a\u0004\u0018\u00010\r2\u0006\u0010#\u001a\u00020$2\u0006\u00109\u001a\u00020\u000b2\u000e\u00107\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u000108J(\u0010;\u001a\b\u0012\u0004\u0012\u00020\r062\b\u0010\u001e\u001a\u0004\u0018\u00010\r2\u0006\u0010#\u001a\u00020$2\u0006\u00109\u001a\u00020\u000bH\u0002J\u0010\u0010<\u001a\u00020=2\b\u0010\u0017\u001a\u0004\u0018\u00010\rJ\u0010\u0010<\u001a\u00020=2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Lcom/heytap/store/platform/tools/FileUtils;", "", "()V", "LINE_SEP", "", "byte2FitMemorySize", "byteSize", "", "precision", "", "copyFile", "", "srcFile", "Ljava/io/File;", "destFile", "listener", "Lcom/heytap/store/platform/tools/FileUtils$OnReplaceListener;", "copyOrMoveDir", "srcDir", "destDir", "isMove", "copyOrMoveFile", "createFileByDeleteOldFile", Const.Scheme.SCHEME_FILE, "filePath", "createOrExistsDir", "dirPath", "createOrExistsFile", "delete", "deleteAllInDir", "dir", "deleteDir", "deleteFile", "deleteFilesInDir", "deleteFilesInDirWithFilter", "filter", "Ljava/io/FileFilter;", "getDirLength", "getDirName", "getDirSize", "getFileByPath", "getFileExtension", "getFileLastModified", "getFileLength", "getFileName", "getFileNameNoExtension", "getFileSize", "getLength", "getSize", "isDir", "isFile", "isFileExists", "isFileExistsApi29", "listFilesInDir", "", "comparator", "Ljava/util/Comparator;", "isRecursive", "listFilesInDirWithFilter", "listFilesInDirWithFilterInner", "notifySystemToScan", "", "MemoryConstants", "OnReplaceListener", "utils_release"}, k = 1, mv = {1, 4, 0})
public final class FileUtils {
    public static final FileUtils INSTANCE = new FileUtils();
    private static final String LINE_SEP = System.getProperty("line.separator");

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/heytap/store/platform/tools/FileUtils$MemoryConstants;", "", "()V", "BYTE", "", "GB", "KB", "MB", "Unit", "utils_release"}, k = 1, mv = {1, 4, 0})
    public static final class MemoryConstants {
        public static final int BYTE = 1;
        public static final int GB = 1073741824;
        public static final MemoryConstants INSTANCE = new MemoryConstants();
        public static final int KB = 1024;
        public static final int MB = 1048576;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/heytap/store/platform/tools/FileUtils$MemoryConstants$Unit;", "", "utils_release"}, k = 1, mv = {1, 4, 0})
        @Retention(RetentionPolicy.SOURCE)
        @p010kotlin.annotation.Retention(AnnotationRetention.SOURCE)
        public @interface Unit {
        }

        private MemoryConstants() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/heytap/store/platform/tools/FileUtils$OnReplaceListener;", "", "onReplace", "", "srcFile", "Ljava/io/File;", "destFile", "utils_release"}, k = 1, mv = {1, 4, 0})
    public interface OnReplaceListener {
        boolean onReplace(@Nullable File srcFile, @Nullable File destFile);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/io/File;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 4, 0})
    public static final class a implements FileFilter {
        public static final a INSTANCE = new a();

        @Override // java.io.FileFilter
        public final boolean accept(File file) {
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "pathname", "Ljava/io/File;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 4, 0})
    public static final class b implements FileFilter {
        public static final b INSTANCE = new b();

        @Override // java.io.FileFilter
        public final boolean accept(File pathname) {
            Intrinsics.checkNotNullExpressionValue(pathname, "pathname");
            return pathname.isFile();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/io/File;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 4, 0})
    public static final class c implements FileFilter {
        public static final c INSTANCE = new c();

        @Override // java.io.FileFilter
        public final boolean accept(File file) {
            return true;
        }
    }

    private FileUtils() {
    }

    private final boolean copyFile(File srcFile, File destFile, OnReplaceListener listener) {
        return copyOrMoveFile(srcFile, destFile, listener, false);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005f  */
    private final boolean copyOrMoveDir(File srcDir, File destDir, OnReplaceListener listener, boolean isMove) {
        boolean z;
        if (srcDir == null || destDir == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(srcDir.getPath());
        String str = File.separator;
        sb.append(str);
        String string = sb.toString();
        String str2 = destDir.getPath() + str;
        if (StringsKt__StringsKt.contains$default((CharSequence) str2, (CharSequence) string, false, 2, (Object) null) || !srcDir.exists() || !srcDir.isDirectory() || !createOrExistsDir(destDir)) {
            return false;
        }
        File[] fileArrListFiles = srcDir.listFiles();
        if (fileArrListFiles == null) {
            z = true;
        } else if (fileArrListFiles.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            for (File file : fileArrListFiles) {
                File file2 = new File(str2 + file.getName());
                if (file.isFile()) {
                    if (!copyOrMoveFile(file, file2, listener, isMove)) {
                        return false;
                    }
                } else if (file.isDirectory() && !copyOrMoveDir(file, file2, listener, isMove)) {
                    return false;
                }
            }
        }
        return !isMove || deleteDir(srcDir);
    }

    private final boolean copyOrMoveFile(File srcFile, File destFile, OnReplaceListener listener, boolean isMove) {
        if (srcFile == null || destFile == null || Intrinsics.areEqual(srcFile, destFile) || !srcFile.exists() || !srcFile.isFile()) {
            return false;
        }
        if (destFile.exists()) {
            if (listener != null && !listener.onReplace(srcFile, destFile)) {
                return true;
            }
            if (!destFile.delete()) {
                return false;
            }
        }
        if (!createOrExistsDir(destFile.getParentFile())) {
            return false;
        }
        try {
            if (FileIOUtils.INSTANCE.writeFileFromIS(destFile.getAbsolutePath(), new FileInputStream(srcFile))) {
                return !isMove || deleteFile(srcFile);
            }
            return false;
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    private final boolean deleteDir(File dir) {
        if (dir == null) {
            return false;
        }
        boolean z = true;
        if (!dir.exists()) {
            return true;
        }
        if (!dir.isDirectory()) {
            return false;
        }
        File[] fileArrListFiles = dir.listFiles();
        if (fileArrListFiles != null) {
            if (!(fileArrListFiles.length == 0)) {
                z = false;
            }
        }
        if (!z) {
            for (File file : fileArrListFiles) {
                if (file.isFile()) {
                    if (!file.delete()) {
                        return false;
                    }
                } else if (file.isDirectory() && !deleteDir(file)) {
                    return false;
                }
            }
        }
        return dir.delete();
    }

    private final boolean deleteFile(File file) {
        return file != null && (!file.exists() || (file.isFile() && file.delete()));
    }

    private final long getDirLength(File dir) {
        if (!isDir(dir)) {
            return -1L;
        }
        File[] fileArrListFiles = dir.listFiles();
        boolean z = true;
        if (fileArrListFiles != null) {
            if (!(fileArrListFiles.length == 0)) {
                z = false;
            }
        }
        long dirLength = 0;
        if (!z) {
            for (File file : fileArrListFiles) {
                dirLength += file.isDirectory() ? getDirLength(file) : file.length();
            }
        }
        return dirLength;
    }

    private final String getDirSize(File dir) {
        long dirLength = getDirLength(dir);
        return dirLength == -1 ? "" : byte2FitMemorySize(dirLength, 3);
    }

    private final long getFileLength(File file) {
        if (isFile(file)) {
            return file.length();
        }
        return -1L;
    }

    private final String getFileSize(File file) {
        long fileLength = getFileLength(file);
        return fileLength == -1 ? "" : byte2FitMemorySize(fileLength, 3);
    }

    private final boolean isFileExistsApi29(String filePath) {
        try {
            Uri uri = Uri.parse(filePath);
            Intrinsics.checkNotNullExpressionValue(uri, "Uri.parse(filePath)");
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = ContextGetterUtils.INSTANCE.getApp().getContentResolver().openAssetFileDescriptor(uri, "r");
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                return false;
            }
            Intrinsics.checkNotNullExpressionValue(assetFileDescriptorOpenAssetFileDescriptor, "cr.openAssetFileDescript…uri, \"r\") ?: return false");
            try {
                assetFileDescriptorOpenAssetFileDescriptor.close();
            } catch (IOException unused) {
            }
            return true;
        } catch (FileNotFoundException unused2) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0023  */
    private final List<File> listFilesInDirWithFilterInner(File dir, FileFilter filter, boolean isRecursive) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (!isDir(dir)) {
            return arrayList;
        }
        File[] fileArrListFiles = dir != null ? dir.listFiles() : null;
        if (fileArrListFiles == null) {
            z = true;
        } else if (fileArrListFiles.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            for (File file : fileArrListFiles) {
                if (filter.accept(file)) {
                    arrayList.add(file);
                }
                if (isRecursive && file.isDirectory()) {
                    arrayList.addAll(listFilesInDirWithFilterInner(file, filter, true));
                }
            }
        }
        return arrayList;
    }

    @SuppressLint({"DefaultLocale"})
    @Nullable
    public final String byte2FitMemorySize(long byteSize, int precision) {
        if (byteSize < 0) {
            throw new IllegalArgumentException("byteSize shouldn't be less than zero!");
        }
        if (byteSize < 1024) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("%." + precision + "fB", Arrays.copyOf(new Object[]{Double.valueOf(byteSize)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
            return str;
        }
        if (byteSize < 1048576) {
            return String.format("%." + precision + "fKB", Double.valueOf(byteSize / ((double) 1024)));
        }
        if (byteSize < 1073741824) {
            return String.format("%." + precision + "fMB", Double.valueOf(byteSize / ((double) 1048576)));
        }
        return String.format("%." + precision + "fGB", Double.valueOf(byteSize / ((double) 1073741824)));
    }

    public final boolean createFileByDeleteOldFile(@Nullable String filePath) {
        return createFileByDeleteOldFile(getFileByPath(filePath));
    }

    public final boolean createOrExistsDir(@Nullable String dirPath) {
        return createOrExistsDir(getFileByPath(dirPath));
    }

    public final boolean createOrExistsFile(@Nullable String filePath) {
        return createOrExistsFile(getFileByPath(filePath));
    }

    public final boolean delete(@Nullable String filePath) {
        return delete(getFileByPath(filePath));
    }

    public final boolean deleteAllInDir(@Nullable String dirPath) {
        return deleteAllInDir(getFileByPath(dirPath));
    }

    public final boolean deleteFilesInDir(@Nullable String dirPath) {
        return deleteFilesInDir(getFileByPath(dirPath));
    }

    public final boolean deleteFilesInDirWithFilter(@Nullable String dirPath, @Nullable FileFilter filter) {
        return deleteFilesInDirWithFilter(getFileByPath(dirPath), filter);
    }

    @Nullable
    public final String getDirName(@Nullable File file) {
        if (file == null) {
            return "";
        }
        String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "file.absolutePath");
        return getDirName(absolutePath);
    }

    @Nullable
    public final File getFileByPath(@Nullable String filePath) {
        if (filePath == null || StringsKt__StringsJVMKt.isBlank(filePath)) {
            return null;
        }
        return new File(filePath);
    }

    @Nullable
    public final String getFileExtension(@Nullable File file) {
        if (file == null) {
            return "";
        }
        String path = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "file.path");
        return getFileExtension(path);
    }

    public final long getFileLastModified(@Nullable String filePath) {
        return getFileLastModified(getFileByPath(filePath));
    }

    @Nullable
    public final String getFileName(@Nullable File file) {
        if (file == null) {
            return "";
        }
        String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "file.absolutePath");
        return getFileName(absolutePath);
    }

    @Nullable
    public final String getFileNameNoExtension(@Nullable File file) {
        if (file == null) {
            return "";
        }
        String path = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "file.path");
        return getFileNameNoExtension(path);
    }

    public final long getLength(@Nullable String filePath) {
        return getLength(getFileByPath(filePath));
    }

    @Nullable
    public final String getSize(@Nullable String filePath) {
        return getSize(getFileByPath(filePath));
    }

    public final boolean isDir(@Nullable String dirPath) {
        return isDir(getFileByPath(dirPath));
    }

    public final boolean isFile(@Nullable String filePath) {
        return isFile(getFileByPath(filePath));
    }

    public final boolean isFileExists(@Nullable File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return true;
        }
        return isFileExists(file.getAbsolutePath());
    }

    @Nullable
    public final List<File> listFilesInDir(@Nullable String dirPath) {
        return listFilesInDir(dirPath, (Comparator<File>) null);
    }

    @Nullable
    public final List<File> listFilesInDirWithFilter(@Nullable File dir, @NotNull FileFilter filter, boolean isRecursive, @Nullable Comparator<File> comparator) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        List<File> listListFilesInDirWithFilterInner = listFilesInDirWithFilterInner(dir, filter, isRecursive);
        if (comparator != null) {
            Collections.sort(listListFilesInDirWithFilterInner, comparator);
        }
        return listListFilesInDirWithFilterInner;
    }

    public final void notifySystemToScan(@Nullable String filePath) {
        notifySystemToScan(getFileByPath(filePath));
    }

    public final boolean createFileByDeleteOldFile(@Nullable File file) {
        if (file == null) {
            return false;
        }
        if ((file.exists() && !file.delete()) || !createOrExistsDir(file.getParentFile())) {
            return false;
        }
        try {
            return file.createNewFile();
        } catch (IOException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public final boolean createOrExistsDir(@Nullable File file) {
        if (file != null) {
            if (file.exists() ? file.isDirectory() : file.mkdirs()) {
                return true;
            }
        }
        return false;
    }

    public final boolean createOrExistsFile(@Nullable File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return file.isFile();
        }
        if (!createOrExistsDir(file.getParentFile())) {
            return false;
        }
        try {
            return file.createNewFile();
        } catch (IOException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public final boolean delete(@Nullable File file) {
        if (file == null) {
            return false;
        }
        return file.isDirectory() ? deleteDir(file) : deleteFile(file);
    }

    public final boolean deleteAllInDir(@Nullable File dir) {
        return deleteFilesInDirWithFilter(dir, a.INSTANCE);
    }

    public final boolean deleteFilesInDir(@Nullable File dir) {
        return deleteFilesInDirWithFilter(dir, b.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0026  */
    public final boolean deleteFilesInDirWithFilter(@Nullable File dir, @Nullable FileFilter filter) {
        boolean z;
        if (dir == null || filter == null) {
            return false;
        }
        if (!dir.exists()) {
            return true;
        }
        if (!dir.isDirectory()) {
            return false;
        }
        File[] fileArrListFiles = dir.listFiles();
        if (fileArrListFiles == null) {
            z = true;
        } else if (fileArrListFiles.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            for (File file : fileArrListFiles) {
                if (filter.accept(file)) {
                    if (file.isFile()) {
                        if (!file.delete()) {
                            return false;
                        }
                    } else if (file.isDirectory() && !deleteDir(file)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Nullable
    public final String getDirName(@NotNull String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        if (filePath.length() == 0) {
            return "";
        }
        String str = File.separator;
        Intrinsics.checkNotNullExpressionValue(str, "File.separator");
        int iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) filePath, str, 0, false, 6, (Object) null);
        if (iLastIndexOf$default == -1) {
            return "";
        }
        String strSubstring = filePath.substring(0, iLastIndexOf$default + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @Nullable
    public final String getFileExtension(@NotNull String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        if (StringsKt__StringsJVMKt.isBlank(filePath)) {
            return "";
        }
        int iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) filePath, '.', 0, false, 6, (Object) null);
        String str = File.separator;
        Intrinsics.checkNotNullExpressionValue(str, "File.separator");
        int iLastIndexOf$default2 = StringsKt__StringsKt.lastIndexOf$default((CharSequence) filePath, str, 0, false, 6, (Object) null);
        if (iLastIndexOf$default == -1 || iLastIndexOf$default2 >= iLastIndexOf$default) {
            return "";
        }
        String strSubstring = filePath.substring(iLastIndexOf$default + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    public final long getFileLastModified(@Nullable File file) {
        if (file != null) {
            return file.lastModified();
        }
        return -1L;
    }

    @Nullable
    public final String getFileName(@NotNull String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        if (filePath.length() == 0) {
            return "";
        }
        String str = File.separator;
        Intrinsics.checkNotNullExpressionValue(str, "File.separator");
        int iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) filePath, str, 0, false, 6, (Object) null);
        if (iLastIndexOf$default == -1) {
            return filePath;
        }
        String strSubstring = filePath.substring(iLastIndexOf$default + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    @Nullable
    public final String getFileNameNoExtension(@NotNull String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        if (filePath.length() == 0) {
            return "";
        }
        int iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) filePath, '.', 0, false, 6, (Object) null);
        String str = File.separator;
        Intrinsics.checkNotNullExpressionValue(str, "File.separator");
        int iLastIndexOf$default2 = StringsKt__StringsKt.lastIndexOf$default((CharSequence) filePath, str, 0, false, 6, (Object) null);
        if (iLastIndexOf$default2 == -1) {
            if (iLastIndexOf$default == -1) {
                return filePath;
            }
            String strSubstring = filePath.substring(0, iLastIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return strSubstring;
        }
        if (iLastIndexOf$default == -1 || iLastIndexOf$default2 > iLastIndexOf$default) {
            String strSubstring2 = filePath.substring(iLastIndexOf$default2 + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "(this as java.lang.String).substring(startIndex)");
            return strSubstring2;
        }
        String strSubstring3 = filePath.substring(iLastIndexOf$default2 + 1, iLastIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring3;
    }

    public final long getLength(@Nullable File file) {
        if (file == null) {
            return 0L;
        }
        return file.isDirectory() ? getDirLength(file) : getFileLength(file);
    }

    @Nullable
    public final String getSize(@Nullable File file) {
        if (file == null) {
            return "";
        }
        return file.isDirectory() ? getDirSize(file) : getFileSize(file);
    }

    public final boolean isDir(@Nullable File file) {
        return file != null && file.exists() && file.isDirectory();
    }

    public final boolean isFile(@Nullable File file) {
        return file != null && file.exists() && file.isFile();
    }

    @Nullable
    public final List<File> listFilesInDir(@Nullable File dir) {
        return listFilesInDir(dir, (Comparator<File>) null);
    }

    public final void notifySystemToScan(@Nullable File file) {
        if (file == null || !file.exists()) {
            return;
        }
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(Uri.parse("file://" + file.getAbsolutePath()));
        ContextGetterUtils.INSTANCE.getApp().sendBroadcast(intent);
    }

    public final boolean isFileExists(@Nullable String filePath) {
        File fileByPath = getFileByPath(filePath);
        if (fileByPath == null) {
            return false;
        }
        if (fileByPath.exists()) {
            return true;
        }
        return isFileExistsApi29(filePath);
    }

    @Nullable
    public final List<File> listFilesInDir(@Nullable String dirPath, @Nullable Comparator<File> comparator) {
        return listFilesInDir(getFileByPath(dirPath), false, comparator);
    }

    @Nullable
    public final List<File> listFilesInDir(@Nullable File dir, @Nullable Comparator<File> comparator) {
        return listFilesInDir(dir, false, comparator);
    }

    @Nullable
    public final List<File> listFilesInDir(@Nullable String dirPath, boolean isRecursive) {
        return listFilesInDir(getFileByPath(dirPath), isRecursive);
    }

    @Nullable
    public final List<File> listFilesInDir(@Nullable File dir, boolean isRecursive) {
        return listFilesInDir(dir, isRecursive, (Comparator<File>) null);
    }

    @Nullable
    public final List<File> listFilesInDir(@Nullable String dirPath, boolean isRecursive, @Nullable Comparator<File> comparator) {
        return listFilesInDir(getFileByPath(dirPath), isRecursive, comparator);
    }

    @Nullable
    public final List<File> listFilesInDir(@Nullable File dir, boolean isRecursive, @Nullable Comparator<File> comparator) {
        return listFilesInDirWithFilter(dir, c.INSTANCE, isRecursive, comparator);
    }
}
