package com.heytap.store.platform.barcode.util;

import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.util.Log;

/* JADX INFO: loaded from: classes6.dex */
public final class UriUtils {
    private UriUtils() {
        throw new AssertionError();
    }

    public static String getImagePath(Context context, Intent intent) {
        String imagePath;
        Uri data = intent.getData();
        Log.d("uri=intent.getData :", "" + data);
        if (!DocumentsContract.isDocumentUri(context, data)) {
            if ("content".equalsIgnoreCase(data.getScheme())) {
                return getImagePath(context, data, null);
            }
            return null;
        }
        String documentId = DocumentsContract.getDocumentId(data);
        Log.d("getDocumentId(uri) :", "" + documentId);
        Log.d("uri.getAuthority() :", "" + data.getAuthority());
        if ("com.android.providers.media.documents".equals(data.getAuthority())) {
            imagePath = getImagePath(context, MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "_id=" + documentId.split(":")[1]);
        } else {
            if (!"com.android.providers.downloads.documents".equals(data.getAuthority())) {
                return null;
            }
            imagePath = getImagePath(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(documentId).longValue()), null);
        }
        return imagePath;
    }

    private static String getImagePath(Context context, Uri uri, String str) {
        Cursor cursorQuery = context.getContentResolver().query(uri, null, str, null, null);
        String string = null;
        if (cursorQuery != null) {
            string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndex("_data")) : null;
            cursorQuery.close();
        }
        return string;
    }
}
