package com.oplus.aiunit.vision;

import com.heytap.log.consts.LogSenderConst;
import io.protostuff.MapSchema;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004J\u0016\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004J\u0016\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004J\u0016\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0004¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/dzk;", "", "Lcom/oplus/aiunit/vision/i11;", "baseDataManager", "", "b", "j", "c", "i", b2n.g, "uuid", MapSchema.FIELD_NAME_KEY, "f", MapSchema.FIELD_NAME_ENTRY, LogSenderConst.FILENAME, b2n.f, "<init>", "()V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final class dzk {

    @NotNull
    public static final dzk INSTANCE = new dzk();

    public static final boolean d(File obj) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        return obj.isFile();
    }

    @NotNull
    public final String b(@NotNull i11 baseDataManager) throws IOException {
        Intrinsics.checkNotNullParameter(baseDataManager, "baseDataManager");
        File file = new File(baseDataManager.m().f0(), System.currentTimeMillis() + ".mp4");
        if (!file.exists()) {
            file.createNewFile();
        }
        String path = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "tempVideoFile.path");
        return path;
    }

    @NotNull
    public final String c(@NotNull i11 baseDataManager) {
        File[] fileArrListFiles;
        Intrinsics.checkNotNullParameter(baseDataManager, "baseDataManager");
        File file = new File(baseDataManager.m().f0());
        if (!file.exists() || !file.isDirectory() || (fileArrListFiles = file.listFiles(new FileFilter() { // from class: com.oplus.aiunit.vision.czk
            @Override // java.io.FileFilter
            public final boolean accept(File file2) {
                return dzk.d(file2);
            }
        })) == null) {
            return "";
        }
        for (File file2 : fileArrListFiles) {
            String name = file2.getName();
            Intrinsics.checkNotNullExpressionValue(name, "file.name");
            if (StringsKt__StringsJVMKt.endsWith(name, ".mp4", true) && file2.length() > 0) {
                String path = file2.getPath();
                Intrinsics.checkNotNullExpressionValue(path, "file.path");
                return path;
            }
        }
        return "";
    }

    @NotNull
    public final String e(@NotNull i11 baseDataManager, @NotNull String uuid) throws IOException {
        Intrinsics.checkNotNullParameter(baseDataManager, "baseDataManager");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        File file = new File(baseDataManager.m().g0(uuid), "bg.png");
        if (!file.exists()) {
            file.createNewFile();
        }
        String path = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "bgFile.path");
        return path;
    }

    @NotNull
    public final String f(@NotNull i11 baseDataManager, @NotNull String uuid) throws IOException {
        Intrinsics.checkNotNullParameter(baseDataManager, "baseDataManager");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        File file = new File(baseDataManager.m().g0(uuid), "config.json");
        if (!file.exists()) {
            file.createNewFile();
        }
        String path = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "configFile.path");
        return path;
    }

    @NotNull
    public final String g(@NotNull i11 baseDataManager, @NotNull String fileName) throws IOException {
        Intrinsics.checkNotNullParameter(baseDataManager, "baseDataManager");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        File file = new File(baseDataManager.m().d0(), fileName + ".png");
        if (!file.exists()) {
            file.createNewFile();
        }
        String path = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "previewFile.path");
        return path;
    }

    @NotNull
    public final String h(@NotNull i11 baseDataManager) throws IOException {
        Intrinsics.checkNotNullParameter(baseDataManager, "baseDataManager");
        File file = new File(baseDataManager.m().f0(), "bg.png");
        if (!file.exists()) {
            file.createNewFile();
        }
        String path = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "tempBgFile.path");
        return path;
    }

    @NotNull
    public final String i(@NotNull i11 baseDataManager) throws IOException {
        Intrinsics.checkNotNullParameter(baseDataManager, "baseDataManager");
        File file = new File(baseDataManager.m().f0(), "config.json");
        if (!file.exists()) {
            file.createNewFile();
        }
        String path = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "tempConfigFile.path");
        return path;
    }

    @NotNull
    public final String j(@NotNull i11 baseDataManager) throws IOException {
        Intrinsics.checkNotNullParameter(baseDataManager, "baseDataManager");
        File file = new File(baseDataManager.m().f0(), "video.mp4");
        if (!file.exists()) {
            file.createNewFile();
        }
        String path = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "tempVideoFile.path");
        return path;
    }

    @NotNull
    public final String k(@NotNull i11 baseDataManager, @NotNull String uuid) throws IOException {
        Intrinsics.checkNotNullParameter(baseDataManager, "baseDataManager");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        File file = new File(baseDataManager.m().g0(uuid), "video.mp4");
        if (!file.exists()) {
            file.createNewFile();
        }
        String path = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "videoFile.path");
        return path;
    }
}
