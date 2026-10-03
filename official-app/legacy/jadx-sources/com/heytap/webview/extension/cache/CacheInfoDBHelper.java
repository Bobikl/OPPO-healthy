package com.heytap.webview.extension.cache;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.oplus.smartenginehelper.ParserTag;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0012\u0010\f\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\"\u0010\u000f\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u0014J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0016\u001a\u00020\u0005J\u000e\u0010\u0017\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u0018"}, d2 = {"Lcom/heytap/webview/extension/cache/CacheInfoDBHelper;", "Landroid/database/sqlite/SQLiteOpenHelper;", "context", "Landroid/content/Context;", "name", "", "(Landroid/content/Context;Ljava/lang/String;)V", "deleteByConfig", "", "cacheBean", "Lcom/heytap/webview/extension/cache/CacheBean;", "insertConfig", "onCreate", "db", "Landroid/database/sqlite/SQLiteDatabase;", "onUpgrade", "oldVersion", "", "newVersion", "queryAllConfig", "", "queryByUrl", "url", "updateByConfig", "lib_webcache_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCacheInfoDBHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CacheInfoDBHelper.kt\ncom/heytap/webview/extension/cache/CacheInfoDBHelper\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,125:1\n13579#2,2:126\n13579#2,2:128\n13579#2,2:130\n13579#2,2:132\n13579#2,2:134\n*S KotlinDebug\n*F\n+ 1 CacheInfoDBHelper.kt\ncom/heytap/webview/extension/cache/CacheInfoDBHelper\n*L\n22#1:126,2\n43#1:128,2\n67#1:130,2\n88#1:132,2\n114#1:134,2\n*E\n"})
public final class CacheInfoDBHelper extends SQLiteOpenHelper {
    public CacheInfoDBHelper(@Nullable Context context, @Nullable String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
    }

    public final void deleteByConfig(@NotNull CacheBean cacheBean) {
        Intrinsics.checkNotNullParameter(cacheBean, "cacheBean");
        LogUtil.d(CacheConstants.Debug.MODEL_TAG, "字段名：" + cacheBean.getUri());
        getReadableDatabase().delete(CacheConstants.Word.CONFIGURATION, "uri = ?", new String[]{cacheBean.getUri()});
        close();
    }

    public final void insertConfig(@NotNull CacheBean cacheBean) throws IllegalAccessException {
        Intrinsics.checkNotNullParameter(cacheBean, "cacheBean");
        ContentValues contentValues = new ContentValues();
        Field[] fields = CacheBean.class.getDeclaredFields();
        Intrinsics.checkNotNullExpressionValue(fields, "fields");
        for (Field field : fields) {
            LogUtil.d(CacheConstants.Debug.MODEL_TAG, "字段名：" + field.getName());
            field.setAccessible(true);
            String name = field.getName();
            Object obj = field.get(cacheBean);
            Intrinsics.checkNotNull(obj);
            contentValues.put(name, obj.toString());
        }
        getReadableDatabase().insert(CacheConstants.Word.CONFIGURATION, null, contentValues);
        close();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(@Nullable SQLiteDatabase db) {
        StringBuilder sb = new StringBuilder();
        sb.append("创建数据库 ");
        sb.append(db != null ? db.getPath() : null);
        LogUtil.d(CacheConstants.Debug.MODEL_TAG, sb.toString());
        Field[] fields = CacheBean.class.getDeclaredFields();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("CREATE TABLE configuration (");
        Intrinsics.checkNotNullExpressionValue(fields, "fields");
        for (Field field : fields) {
            LogUtil.d(CacheConstants.Debug.MODEL_TAG, "字段名：" + field.getName());
            stringBuffer.append(field.getName() + " VARCHAR(120)");
            if (field.getName().equals(ParserTag.TAG_URI)) {
                stringBuffer.append("PRIMARY KEY");
            }
            stringBuffer.append(",");
        }
        stringBuffer.deleteCharAt(StringsKt__StringsKt.getLastIndex(stringBuffer));
        stringBuffer.append(")");
        if (db != null) {
            db.execSQL(stringBuffer.toString());
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(@Nullable SQLiteDatabase db, int oldVersion, int newVersion) {
    }

    @NotNull
    public final List<CacheBean> queryAllConfig() throws IllegalAccessException {
        Cursor cursorQuery = getReadableDatabase().query(CacheConstants.Word.CONFIGURATION, null, null, null, null, null, null);
        Field[] fields = CacheBean.class.getDeclaredFields();
        ArrayList arrayList = new ArrayList();
        while (cursorQuery.moveToNext()) {
            CacheBean cacheBean = new CacheBean(null, null, null, null, 15, null);
            Intrinsics.checkNotNullExpressionValue(fields, "fields");
            for (Field field : fields) {
                LogUtil.d(CacheConstants.Debug.MODEL_TAG, "字段名：" + field.getName());
                field.setAccessible(true);
                field.set(cacheBean, cursorQuery.getString(cursorQuery.getColumnIndex(field.getName())));
            }
            arrayList.add(cacheBean);
        }
        cursorQuery.close();
        close();
        return arrayList;
    }

    @Nullable
    public final CacheBean queryByUrl(@NotNull String url) throws IllegalAccessException {
        Intrinsics.checkNotNullParameter(url, "url");
        Cursor cursorQuery = getReadableDatabase().query(CacheConstants.Word.CONFIGURATION, null, null, null, null, null, null);
        CacheBean cacheBean = new CacheBean(null, null, null, null, 15, null);
        Field[] fields = CacheBean.class.getDeclaredFields();
        while (cursorQuery.moveToNext()) {
            String string = cursorQuery.getString(cursorQuery.getColumnIndex(ParserTag.TAG_URI));
            Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(cursor.getColumnIndex(\"uri\"))");
            if (StringsKt__StringsKt.contains$default((CharSequence) url, (CharSequence) string, false, 2, (Object) null)) {
                Intrinsics.checkNotNullExpressionValue(fields, "fields");
                for (Field field : fields) {
                    LogUtil.d(CacheConstants.Debug.MODEL_TAG, "字段名：" + field.getName());
                    field.setAccessible(true);
                    field.set(cacheBean, cursorQuery.getString(cursorQuery.getColumnIndex(field.getName())));
                }
                cursorQuery.close();
                close();
                return cacheBean;
            }
        }
        cursorQuery.close();
        close();
        return null;
    }

    public final void updateByConfig(@NotNull CacheBean cacheBean) {
        Intrinsics.checkNotNullParameter(cacheBean, "cacheBean");
        ContentValues contentValues = new ContentValues();
        Field[] fields = CacheBean.class.getDeclaredFields();
        Intrinsics.checkNotNullExpressionValue(fields, "fields");
        for (Field field : fields) {
            LogUtil.d(CacheConstants.Debug.MODEL_TAG, "字段名：" + field.getName());
            field.setAccessible(true);
            contentValues.put(field.getName(), field.get(cacheBean).toString());
        }
        getReadableDatabase().update(CacheConstants.Word.CONFIGURATION, contentValues, "uri = ?", new String[]{cacheBean.getUri()});
        close();
    }
}
