package com.heytap.webview.extension.utils;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import androidx.core.content.MimeTypeFilter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J)\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0002J\u0016\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0006J\u0018\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\rH\u0002¨\u0006\u0017"}, d2 = {"Lcom/heytap/webview/extension/utils/ChooserIntentUtil;", "", "()V", "createCameraIntent", "Landroid/content/Intent;", "contentUri", "Landroid/net/Uri;", "createCaptureIntent", "Lcom/heytap/webview/extension/utils/IntentInfo;", "context", "Landroid/content/Context;", "acceptTypes", "", "", "capture", "", "(Landroid/content/Context;[Ljava/lang/String;Z)Lcom/heytap/webview/extension/utils/IntentInfo;", "imageContentUri", "isImageUriValid", "imageUri", "matches", "mimeType", "filter", "lib_webext_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nChooserIntentUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChooserIntentUtil.kt\ncom/heytap/webview/extension/utils/ChooserIntentUtil\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,81:1\n37#2,2:82\n*S KotlinDebug\n*F\n+ 1 ChooserIntentUtil.kt\ncom/heytap/webview/extension/utils/ChooserIntentUtil\n*L\n61#1:82,2\n*E\n"})
public final class ChooserIntentUtil {

    @NotNull
    public static final ChooserIntentUtil INSTANCE = new ChooserIntentUtil();

    private ChooserIntentUtil() {
    }

    private final Intent createCameraIntent(Uri contentUri) {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.addFlags(3);
        intent.putExtra("output", contentUri);
        return intent;
    }

    private final Uri imageContentUri(Context context) throws IOException {
        Uri uriForFile = androidx.core.content.FileProvider.getUriForFile(context, context.getPackageName() + ".WebExt.fileProvider", File.createTempFile(String.valueOf(System.currentTimeMillis()), ".jpg", context.getFilesDir()));
        Intrinsics.checkNotNullExpressionValue(uriForFile, "getUriForFile(context,\n …\",\n            mediaFile)");
        return uriForFile;
    }

    private final boolean matches(String mimeType, String filter) {
        try {
            return MimeTypeFilter.matches(mimeType, filter);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @NotNull
    public final IntentInfo createCaptureIntent(@NotNull Context context, @NotNull String[] acceptTypes, boolean capture) throws IOException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(acceptTypes, "acceptTypes");
        Uri uriImageContentUri = null;
        if ((!capture) || (acceptTypes.length == 0)) {
            return new IntentInfo(null, null, 3, null);
        }
        String str = acceptTypes[0];
        ArrayList arrayList = new ArrayList();
        if (matches("*/*", str)) {
            uriImageContentUri = imageContentUri(context);
            arrayList.add(createCameraIntent(uriImageContentUri));
            arrayList.add(new Intent("android.media.action.VIDEO_CAPTURE"));
            arrayList.add(new Intent("android.provider.MediaStore.RECORD_SOUND"));
        } else if (matches(str, "image/*")) {
            uriImageContentUri = imageContentUri(context);
            arrayList.add(createCameraIntent(uriImageContentUri));
        } else if (MimeTypeFilter.matches(str, "video/*")) {
            arrayList.add(new Intent("android.media.action.VIDEO_CAPTURE"));
        } else if (MimeTypeFilter.matches(str, "audio/*")) {
            arrayList.add(new Intent("android.provider.MediaStore.RECORD_SOUND"));
        }
        return new IntentInfo((Intent[]) arrayList.toArray(new Intent[0]), uriImageContentUri);
    }

    public final boolean isImageUriValid(@NotNull Context context, @NotNull Uri imageUri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageUri, "imageUri");
        Cursor cursorQuery = context.getContentResolver().query(imageUri, null, null, null, null);
        if (cursorQuery != null) {
            cursorQuery.moveToFirst();
        }
        return cursorQuery != null && cursorQuery.getLong(cursorQuery.getColumnIndex("_size")) > 0;
    }
}
