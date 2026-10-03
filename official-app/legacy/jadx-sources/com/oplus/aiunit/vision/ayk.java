package com.oplus.aiunit.vision;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import androidx.compose.runtime.internal.StabilityInferred;
import io.protostuff.MapSchema;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.io.ByteStreamsKt;
import p010kotlin.io.CloseableKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002J\u001e\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002J\u0016\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0002J \u0010\u0011\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0002J \u0010\u0012\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/ayk;", "", "", "name", b2n.f, MapSchema.FIELD_NAME_ENTRY, "saveName", "d", "Landroid/content/Context;", "context", "tempPath", "savePath", "", "c", "", "f", "deleteTemp", "a", "b", "<init>", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final class ayk {
    public static final int $stable = 0;

    @NotNull
    public static final ayk INSTANCE = new ayk();

    public final boolean a(String tempPath, String savePath, boolean deleteTemp) {
        try {
            File file = new File(savePath);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileInputStream fileInputStream = new FileInputStream(new File(tempPath));
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    ByteStreamsKt.copyTo$default(fileInputStream, fileOutputStream, 0, 2, null);
                    CloseableKt.closeFinally(fileOutputStream, null);
                    CloseableKt.closeFinally(fileInputStream, null);
                    if (deleteTemp) {
                        new File(tempPath).delete();
                    }
                    return true;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(fileOutputStream, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    CloseableKt.closeFinally(fileInputStream, th3);
                    throw th4;
                }
            }
        } catch (Exception e2) {
            a7b.b("VideoFileManager", "copyToLegacyPath failed: " + e2.getMessage());
            return false;
        }
    }

    public final boolean b(Context context, String tempPath, String savePath) {
        File file = new File(tempPath);
        if (!file.exists()) {
            return false;
        }
        String name = new File(savePath).getName();
        String str = Environment.DIRECTORY_DCIM + File.separator + "HeytapHealth";
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", name);
        contentValues.put("mime_type", "video/mp4");
        contentValues.put("relative_path", str);
        contentValues.put("is_pending", (Integer) 1);
        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
        contentValues.put("date_added", Long.valueOf(jCurrentTimeMillis));
        contentValues.put("date_modified", Long.valueOf(jCurrentTimeMillis));
        Uri uriInsert = context.getContentResolver().insert(MediaStore.Video.Media.getContentUri("external_primary"), contentValues);
        if (uriInsert == null) {
            return false;
        }
        try {
            OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uriInsert);
            if (outputStreamOpenOutputStream == null) {
                return false;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    ByteStreamsKt.copyTo$default(fileInputStream, outputStreamOpenOutputStream, 0, 2, null);
                    CloseableKt.closeFinally(fileInputStream, null);
                    CloseableKt.closeFinally(outputStreamOpenOutputStream, null);
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("is_pending", (Integer) 0);
                    context.getContentResolver().update(uriInsert, contentValues2, null, null);
                    return true;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(fileInputStream, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    CloseableKt.closeFinally(outputStreamOpenOutputStream, th3);
                    throw th4;
                }
            }
        } catch (Exception e2) {
            a7b.b("VideoFileManager", "copyToMediaStore failed: " + e2.getMessage());
            return false;
        }
    }

    public final boolean c(@NotNull Context context, @NotNull String tempPath, @NotNull String savePath) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tempPath, "tempPath");
        Intrinsics.checkNotNullParameter(savePath, "savePath");
        if (!b(context, tempPath, savePath)) {
            return a(tempPath, savePath, true);
        }
        new File(tempPath).delete();
        return true;
    }

    @NotNull
    public final String d(@NotNull String saveName) {
        Intrinsics.checkNotNullParameter(saveName, "saveName");
        String strG = g(saveName);
        File file = new File(strG);
        if (file.exists()) {
            file.delete();
        } else {
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
        }
        return strG;
    }

    @NotNull
    public final String e() {
        String path;
        File parentFile;
        Context contextA = b78.a();
        File externalCacheDir = contextA.getExternalCacheDir();
        if (externalCacheDir == null || (path = externalCacheDir.getPath()) == null) {
            path = contextA.getCacheDir().getPath();
        }
        String str = path + "/track/dynamic_track_temp_" + System.currentTimeMillis() + ".mp4";
        File file = new File(str);
        File parentFile2 = file.getParentFile();
        boolean z = false;
        if (parentFile2 != null && !parentFile2.exists()) {
            z = true;
        }
        if (z && (parentFile = file.getParentFile()) != null) {
            parentFile.mkdirs();
        }
        if (file.exists()) {
            file.delete();
        }
        return str;
    }

    public final void f(@NotNull Context context, @NotNull String savePath) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(savePath, "savePath");
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(Uri.fromFile(new File(savePath)));
        context.sendBroadcast(intent);
    }

    @NotNull
    public final String g(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM) + "/HeytapHealth/" + name + ".mp4";
    }
}
