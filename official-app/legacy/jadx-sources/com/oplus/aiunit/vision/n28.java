package com.oplus.aiunit.vision;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

/* JADX INFO: loaded from: classes19.dex */
public class n28 {
    public static final String AUTHORITY = "com.oppo.gallery3d.open.provider";
    public static final Uri BASE_URI = Uri.parse("content://com.oppo.gallery3d.open.provider");
    public static final String[] GROUP_PROJECTION = {"type", "name", "key", "cover_id", "count", "memory_sub_title", "memory_id"};
    public static final String[] ITEM_PROJECTION = {"media_id", "path", "datetaken", "size", "mime_type", "date_added"};
    public static final String KEYWORD = "keyword";
    public static final String QUERY_RECOMMEND_MEMORIES = "recommend/memories";
    public static final String REGEX_FORCE_FALSE = "&force=true";
    public static final String REGEX_INPUT = "?input=";
    public static final String TABLE_ALBUM_INFO = "albumInfo";
    public static final String TABLE_RECOMMEND_ALBUMS = "recommendAlbums";

    public static Cursor a(Context context, String str, String str2, String[] strArr, String str3) {
        return context.getContentResolver().query(BASE_URI.buildUpon().appendEncodedPath(TABLE_RECOMMEND_ALBUMS).build(), strArr, KEYWORD, new String[]{str + REGEX_INPUT + str2 + REGEX_FORCE_FALSE}, str3);
    }

    public static Cursor b(Context context, String str) {
        return a(context, QUERY_RECOMMEND_MEMORIES, str, GROUP_PROJECTION, null);
    }

    public static Cursor c(Context context, String str) {
        return context.getContentResolver().query(BASE_URI.buildUpon().appendEncodedPath(TABLE_ALBUM_INFO).build(), ITEM_PROJECTION, KEYWORD, new String[]{str}, null);
    }
}
