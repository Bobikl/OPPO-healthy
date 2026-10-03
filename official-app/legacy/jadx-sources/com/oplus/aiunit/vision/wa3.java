package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import androidx.core.content.FileProvider;
import androidx.core.content.MimeTypeFilter;
import io.protostuff.MapSchema;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0002J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0004H\u0002J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\u0018"}, d2 = {"Lcom/oplus/aiunit/vision/wa3;", "", "Landroid/content/Context;", "context", "Landroid/net/Uri;", "imageUri", "", "d", "", "", "acceptTypes", "capture", "Lcom/oplus/aiunit/vision/rca;", "b", "(Landroid/content/Context;[Ljava/lang/String;Z)Lcom/oplus/aiunit/vision/rca;", "mimeType", "filter", MapSchema.FIELD_NAME_ENTRY, "contentUri", "Landroid/content/Intent;", "a", "c", "<init>", "()V", "lib_webpro_release"}, k = 1, mv = {1, 4, 0})
public final class wa3 {
    public static final wa3 INSTANCE = new wa3();

    public final Intent a(Uri contentUri) {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.addFlags(3);
        intent.putExtra("output", contentUri);
        return intent;
    }

    @NotNull
    public final rca b(@NotNull Context context, @NotNull String[] acceptTypes, boolean capture) throws IOException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(acceptTypes, "acceptTypes");
        Uri uriC = null;
        if ((!capture) || (acceptTypes.length == 0)) {
            return new rca(null, null, 3, null);
        }
        String str = acceptTypes[0];
        ArrayList arrayList = new ArrayList();
        if (e("*/*", str)) {
            uriC = c(context);
            arrayList.add(a(uriC));
            arrayList.add(new Intent("android.media.action.VIDEO_CAPTURE"));
            arrayList.add(new Intent("android.provider.MediaStore.RECORD_SOUND"));
        } else if (e(str, "image/*")) {
            uriC = c(context);
            arrayList.add(a(uriC));
        } else if (MimeTypeFilter.matches(str, "video/*")) {
            arrayList.add(new Intent("android.media.action.VIDEO_CAPTURE"));
        } else if (MimeTypeFilter.matches(str, "audio/*")) {
            arrayList.add(new Intent("android.provider.MediaStore.RECORD_SOUND"));
        }
        Object[] array = arrayList.toArray(new Intent[0]);
        if (array != null) {
            return new rca((Intent[]) array, uriC);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public final Uri c(Context context) throws IOException {
        Uri uriForFile = FileProvider.getUriForFile(context, context.getPackageName() + ".WebPro.fileProvider", File.createTempFile(String.valueOf(System.currentTimeMillis()), ".jpg", context.getFilesDir()));
        Intrinsics.checkNotNullExpressionValue(uriForFile, "FileProvider.getUriForFi…\",\n            mediaFile)");
        return uriForFile;
    }

    public final boolean d(@NotNull Context context, @NotNull Uri imageUri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageUri, "imageUri");
        Cursor cursorQuery = context.getContentResolver().query(imageUri, null, null, null, null);
        if (cursorQuery != null) {
            cursorQuery.moveToFirst();
        }
        return cursorQuery != null && cursorQuery.getLong(cursorQuery.getColumnIndex("_size")) > 0;
    }

    public final boolean e(String mimeType, String filter) {
        try {
            return MimeTypeFilter.matches(mimeType, filter);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }
}
