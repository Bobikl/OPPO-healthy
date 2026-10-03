package com.oplus.aiunit.vision;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.StringsKt__StringsJVMKt;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J(\u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/v7m;", "", "", "sourceFolder", "zipFile", "", "a", "Ljava/io/File;", "fileToZip", "filePathName", "ignorePath", "Ljava/util/zip/ZipOutputStream;", "zipOut", "b", "TAG", "Ljava/lang/String;", "<init>", "()V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nZipUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZipUtil.kt\ncom/heytap/health/watchface/business/creation/engine/util/ZipUtil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n1#2:68\n*E\n"})
public final class v7m {

    @NotNull
    public static final v7m INSTANCE = new v7m();

    @NotNull
    public static final String TAG = "ZipUtil";

    public final void a(@NotNull String sourceFolder, @NotNull String zipFile) throws IOException {
        Intrinsics.checkNotNullParameter(sourceFolder, "sourceFolder");
        Intrinsics.checkNotNullParameter(zipFile, "zipFile");
        FileOutputStream fileOutputStream = new FileOutputStream(zipFile);
        ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);
        File file = new File(sourceFolder);
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "fileToZip.name");
        b(file, name, file.getName() + "/", zipOutputStream);
        zipOutputStream.close();
        fileOutputStream.close();
    }

    public final void b(File fileToZip, String filePathName, String ignorePath, ZipOutputStream zipOut) throws IOException {
        if (fileToZip.isHidden()) {
            return;
        }
        ltl.a(TAG, "filePathName " + filePathName);
        if (StringsKt__StringsJVMKt.startsWith$default(filePathName, ignorePath, false, 2, null)) {
            filePathName = filePathName.substring(StringsKt__StringsKt.indexOf$default((CharSequence) filePathName, ignorePath, 0, false, 6, (Object) null) + ignorePath.length());
            Intrinsics.checkNotNullExpressionValue(filePathName, "substring(...)");
        }
        if (fileToZip.isDirectory()) {
            if (StringsKt__StringsJVMKt.endsWith$default(filePathName, "/", false, 2, null)) {
                ltl.a(TAG, "compress directory fileName " + filePathName);
                zipOut.putNextEntry(new ZipEntry(filePathName));
            } else {
                ltl.a(TAG, "compress directory fileName/ " + filePathName + "/");
                StringBuilder sb = new StringBuilder();
                sb.append(filePathName);
                sb.append("/");
                zipOut.putNextEntry(new ZipEntry(sb.toString()));
            }
            zipOut.closeEntry();
            File[] fileArrListFiles = fileToZip.listFiles();
            Intrinsics.checkNotNull(fileArrListFiles);
            for (File childFile : fileArrListFiles) {
                Intrinsics.checkNotNullExpressionValue(childFile, "childFile");
                b(childFile, filePathName + "/" + childFile.getName(), ignorePath, zipOut);
            }
            return;
        }
        ltl.a(TAG, "compress fileToZip " + fileToZip + " - fileName " + filePathName + "\"");
        FileInputStream fileInputStream = new FileInputStream(fileToZip);
        zipOut.putNextEntry(new ZipEntry(filePathName));
        byte[] bArr = new byte[1024];
        while (true) {
            int i = fileInputStream.read(bArr);
            if (i < 0) {
                fileInputStream.close();
                return;
            }
            zipOut.write(bArr, 0, i);
        }
    }
}
