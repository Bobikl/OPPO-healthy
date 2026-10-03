package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.io.ByteStreamsKt;
import p010kotlin.io.CloseableKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ$\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u001c\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/z7m;", "", "Ljava/io/File;", "zipFile", "targetDirectory", "", "maxDepth", "", "a", "files", "", "b", "<init>", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nZipUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZipUtils.kt\ncom/heytap/sports/transfer/utils/ZipUtils\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,108:1\n1099#2,3:109\n1855#3,2:112\n*S KotlinDebug\n*F\n+ 1 ZipUtils.kt\ncom/heytap/sports/transfer/utils/ZipUtils\n*L\n60#1:109,3\n98#1:112,2\n*E\n"})
public final class z7m {
    public static final int $stable = 0;

    @NotNull
    public static final z7m INSTANCE = new z7m();

    @NotNull
    public final List<File> a(@NotNull File zipFile, @NotNull File targetDirectory, int maxDepth) {
        Intrinsics.checkNotNullParameter(zipFile, "zipFile");
        Intrinsics.checkNotNullParameter(targetDirectory, "targetDirectory");
        ArrayList arrayList = new ArrayList();
        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(zipFile));
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            while (nextEntry != null) {
                String entryName = nextEntry.getName();
                Intrinsics.checkNotNullExpressionValue(entryName, "entryName");
                int i = 0;
                for (int i2 = 0; i2 < entryName.length(); i2++) {
                    char cCharAt = entryName.charAt(i2);
                    if (cCharAt == '/' || cCharAt == '\\') {
                        i++;
                    }
                }
                if (i > maxDepth) {
                    nextEntry = zipInputStream.getNextEntry();
                } else {
                    File file = new File(targetDirectory, entryName);
                    String canonicalPath = file.getCanonicalPath();
                    String targetPath = targetDirectory.getCanonicalPath();
                    Intrinsics.checkNotNullExpressionValue(canonicalPath, "canonicalPath");
                    Intrinsics.checkNotNullExpressionValue(targetPath, "targetPath");
                    if (StringsKt__StringsJVMKt.startsWith$default(canonicalPath, targetPath, false, 2, null)) {
                        if (!nextEntry.isDirectory()) {
                            File parentFile = file.getParentFile();
                            if (parentFile != null) {
                                parentFile.mkdirs();
                            }
                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file), 65536);
                            try {
                                ByteStreamsKt.copyTo(zipInputStream, bufferedOutputStream, 65536);
                                CloseableKt.closeFinally(bufferedOutputStream, null);
                                arrayList.add(file);
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    CloseableKt.closeFinally(bufferedOutputStream, th);
                                    throw th2;
                                }
                            }
                        } else if (i < maxDepth) {
                            file.mkdirs();
                        }
                        nextEntry = zipInputStream.getNextEntry();
                    } else {
                        nextEntry = zipInputStream.getNextEntry();
                    }
                }
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(zipInputStream, null);
            return arrayList;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                CloseableKt.closeFinally(zipInputStream, th3);
                throw th4;
            }
        }
    }

    public final void b(@NotNull List<? extends File> files, @NotNull File zipFile) {
        Intrinsics.checkNotNullParameter(files, "files");
        Intrinsics.checkNotNullParameter(zipFile, "zipFile");
        ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(zipFile)));
        try {
            for (File file : files) {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    zipOutputStream.putNextEntry(new ZipEntry(file.getName()));
                    ByteStreamsKt.copyTo$default(fileInputStream, zipOutputStream, 0, 2, null);
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(fileInputStream, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(fileInputStream, th);
                        throw th2;
                    }
                }
            }
            Unit unit2 = Unit.INSTANCE;
            CloseableKt.closeFinally(zipOutputStream, null);
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                CloseableKt.closeFinally(zipOutputStream, th3);
                throw th4;
            }
        }
    }
}
