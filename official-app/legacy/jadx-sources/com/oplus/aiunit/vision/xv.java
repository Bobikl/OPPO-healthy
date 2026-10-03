package com.oplus.aiunit.vision;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.provider.MediaStore;
import com.heytap.health.watchface.business.legacy.creation.album.bean.AlbumItem;
import com.heytap.health.watchface.business.legacy.creation.album.bean.ImageItem;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.heytap.speech.engine.constant.EngineConstant;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes19.dex */
public class xv {
    public static final String TAG = "AlbumLoader";
    public static final String[] a = {"_id", "title", "mime_type", "datetaken", "date_added", "date_modified", "_data", "orientation", "bucket_id", "_size", Fields.WIDTH_FIELD, Fields.HEIGHT_FIELD, "duration", "media_type"};

    public static void a(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th) {
            ltl.i(TAG, "[closeSilently] close fail" + th);
        }
    }

    public static String b(Context context, String str) {
        Cursor cursorQuery;
        String string = null;
        try {
            cursorQuery = context.getContentResolver().query(MediaStore.Files.getContentUri(EngineConstant.ENGINE_CONFIG_EXTERNAL), a, "_id IN (?)", new String[]{str}, "datetaken DESC, _id DESC");
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        string = cursorQuery.getString(cursorQuery.getColumnIndex("_data"));
                    }
                } catch (Throwable th) {
                    th = th;
                    try {
                        ltl.b(TAG, "[getFilePathFromMediaId], Throwable is " + th);
                    } finally {
                        a(cursorQuery);
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            cursorQuery = null;
        }
        return string;
    }

    public static List<ImageItem> c(Context context, List<ImageItem> list, String str, int i) {
        List<ImageItem> listG = g(context, str);
        if (listG.size() == 0) {
            return null;
        }
        return e(listG, list, i);
    }

    public static <T> List<T> d(List<T> list, int i) {
        Random random = new Random();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int size = list.size();
        while (arrayList.size() != i) {
            int iNextInt = random.nextInt(size);
            if (hashSet.add(Integer.valueOf(iNextInt))) {
                arrayList.add(list.get(iNextInt));
            }
        }
        return arrayList;
    }

    public static <T> List<T> e(List<T> list, List<T> list2, int i) {
        if (list == null || list.size() == 0) {
            return null;
        }
        int iMin = Math.min(i, list.size());
        if (list2 == null || list2.size() == 0) {
            return d(list, iMin);
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.removeAll(list2);
        int size = arrayList.size();
        if (size >= iMin) {
            return d(arrayList, iMin);
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        arrayList2.addAll(d(list2, iMin - size));
        return arrayList2;
    }

    public static List<AlbumItem> f(Context context) {
        Cursor cursorB;
        ArrayList arrayList = null;
        try {
            cursorB = n28.b(context, null);
        } catch (Exception e2) {
            ltl.a(TAG, "getRecommendMemoriesAlbums Exception " + e2.getMessage());
            cursorB = null;
        }
        if (cursorB != null) {
            arrayList = new ArrayList();
            String[] strArr = n28.GROUP_PROJECTION;
            int columnIndex = cursorB.getColumnIndex(strArr[1]);
            int columnIndex2 = cursorB.getColumnIndex(strArr[2]);
            int columnIndex3 = cursorB.getColumnIndex(strArr[3]);
            int columnIndex4 = cursorB.getColumnIndex(strArr[4]);
            int columnIndex5 = cursorB.getColumnIndex(strArr[5]);
            int columnIndex6 = cursorB.getColumnIndex(strArr[6]);
            while (cursorB.moveToNext()) {
                String string = cursorB.getString(columnIndex6);
                String string2 = cursorB.getString(columnIndex);
                String string3 = cursorB.getString(columnIndex2);
                String string4 = cursorB.getString(columnIndex3);
                arrayList.add(new AlbumItem(string, b(context, string4), ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, Integer.parseInt(string4)).toString(), cursorB.getInt(columnIndex4), string2, string3, cursorB.getString(columnIndex5)));
            }
            cursorB.moveToLast();
            a(cursorB);
        }
        return arrayList;
    }

    public static List<ImageItem> g(Context context, String str) {
        Cursor cursorC;
        ArrayList arrayList = new ArrayList();
        try {
            cursorC = n28.c(context, str);
        } catch (Exception e2) {
            ltl.a(TAG, "getSearchAlbumsInfo Exception " + e2.getMessage());
            cursorC = null;
        }
        if (cursorC != null && cursorC.getCount() > 0) {
            String[] strArr = n28.ITEM_PROJECTION;
            int columnIndex = cursorC.getColumnIndex(strArr[0]);
            int columnIndex2 = cursorC.getColumnIndex(strArr[1]);
            int columnIndex3 = cursorC.getColumnIndex(strArr[3]);
            int columnIndex4 = cursorC.getColumnIndex(strArr[4]);
            int columnIndex5 = cursorC.getColumnIndex(strArr[5]);
            while (cursorC.moveToNext()) {
                String string = cursorC.getString(columnIndex);
                String string2 = cursorC.getString(columnIndex2);
                long j2 = cursorC.getLong(columnIndex3);
                String string3 = cursorC.getString(columnIndex4);
                long j3 = cursorC.getLong(columnIndex5);
                ImageItem imageItem = new ImageItem();
                imageItem.mPath = string2;
                imageItem.mUriPath = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, Integer.parseInt(string)).toString();
                imageItem.mSize = j2;
                imageItem.mMimeType = string3;
                imageItem.mAddTime = j3;
                arrayList.add(imageItem);
                columnIndex = columnIndex;
                columnIndex5 = columnIndex5;
            }
        }
        a(cursorC);
        return arrayList;
    }
}
