package com.oplus.aiunit.vision;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import com.heytap.health.watchface.business.creation.category.video.VideoRepository;
import com.heytap.log.consts.LogSenderConst;
import io.protostuff.MapSchema;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.io.ByteStreamsKt;
import p010kotlin.io.CloseableKt;
import p010kotlin.jvm.JvmName;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a&\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u001a&\u0010\t\u001a\u0004\u0018\u00010\u0006*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u001a\u0016\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002\u001a&\u0010\u0010\u001a\u00020\u000f*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0000H\u0002\u001a\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u0003*\u00020\u0003H\u0002\u001a,\u0010\u0014\u001a\u0004\u0018\u00010\u0006*\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002\"\u001c\u0010\u0017\u001a\n \u0015*\u0004\u0018\u00010\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016¨\u0006\u0018"}, d2 = {"Ljava/io/File;", "Landroid/content/Context;", "context", "", LogSenderConst.FILENAME, "relativePath", "Landroid/net/Uri;", "a", "Ljava/io/InputStream;", "f", "Landroid/content/ContentResolver;", "resolver", "Ljava/io/OutputStream;", MapSchema.FIELD_NAME_ENTRY, "outputFile", "", "b", "c", "Lcom/oplus/aiunit/vision/mxd;", "outputFileTaker", "d", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "ALBUM_DIR", "device_settings_impl_release"}, k = 2, mv = {1, 8, 0})
@JvmName(name = "ImageExt")
public final class u3a {
    public static final String a = Environment.DIRECTORY_PICTURES;

    @Nullable
    public static final Uri a(@NotNull File file, @NotNull Context context, @NotNull String fileName, @Nullable String str) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        if (!file.canRead() || !file.exists()) {
            a7b.f("ImageExt", "check: read file error: " + file);
            return null;
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            Uri uriF = f(fileInputStream, context, fileName, str);
            CloseableKt.closeFinally(fileInputStream, null);
            return uriF;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static final void b(Uri uri, Context context, ContentResolver contentResolver, File file) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("is_pending", (Integer) 0);
        contentResolver.update(uri, contentValues, null, null);
    }

    public static final String c(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (StringsKt__StringsJVMKt.endsWith$default(lowerCase, ".png", false, 2, null)) {
            return "image/png";
        }
        if (StringsKt__StringsJVMKt.endsWith$default(lowerCase, ".jpg", false, 2, null) || StringsKt__StringsJVMKt.endsWith$default(lowerCase, ".jpeg", false, 2, null)) {
            return j.MIME_TYPE_JPEG;
        }
        if (StringsKt__StringsJVMKt.endsWith$default(lowerCase, ".webp", false, 2, null)) {
            return j.MIME_TYPE_WEBP;
        }
        if (StringsKt__StringsJVMKt.endsWith$default(lowerCase, ".gif", false, 2, null)) {
            return VideoRepository.MIME_TYPE_GIF;
        }
        return null;
    }

    public static final Uri d(ContentResolver contentResolver, String str, String str2, mxd mxdVar) {
        String str3;
        ContentValues contentValues = new ContentValues();
        String strC = c(str);
        if (strC != null) {
            contentValues.put("mime_type", strC);
        }
        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
        contentValues.put("date_added", Long.valueOf(jCurrentTimeMillis));
        contentValues.put("date_modified", Long.valueOf(jCurrentTimeMillis));
        if (str2 != null) {
            str3 = a + "/" + str2;
        } else {
            str3 = a;
        }
        contentValues.put("_display_name", str);
        contentValues.put("relative_path", str3);
        contentValues.put("is_pending", (Integer) 1);
        Uri contentUri = MediaStore.Images.Media.getContentUri("external_primary");
        Intrinsics.checkNotNullExpressionValue(contentUri, "getContentUri(MediaStore.VOLUME_EXTERNAL_PRIMARY)");
        return contentResolver.insert(contentUri, contentValues);
    }

    public static final OutputStream e(Uri uri, ContentResolver contentResolver) {
        try {
            return contentResolver.openOutputStream(uri);
        } catch (FileNotFoundException e2) {
            a7b.b("ImageExt", "save: open stream error: " + e2);
            return null;
        }
    }

    @Nullable
    public static final Uri f(@NotNull InputStream inputStream, @NotNull Context context, @NotNull String fileName, @Nullable String str) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        ContentResolver resolver = context.getContentResolver();
        mxd mxdVar = new mxd(null, 1, null);
        Intrinsics.checkNotNullExpressionValue(resolver, "resolver");
        Uri uriD = d(resolver, fileName, str, mxdVar);
        if (uriD == null) {
            a7b.m("ImageExt", "insert: error: uri == null");
            return null;
        }
        OutputStream outputStreamE = e(uriD, resolver);
        if (outputStreamE == null) {
            return null;
        }
        try {
            try {
                ByteStreamsKt.copyTo$default(inputStream, outputStreamE, 0, 2, null);
                b(uriD, context, resolver, mxdVar.getCom.heytap.webview.extension.protocol.Const.Scheme.SCHEME_FILE java.lang.String());
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(inputStream, null);
                CloseableKt.closeFinally(outputStreamE, null);
                return uriD;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(outputStreamE, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                CloseableKt.closeFinally(inputStream, th3);
                throw th4;
            }
        }
    }
}
