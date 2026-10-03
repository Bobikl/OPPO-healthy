package com.oplus.aiunit.vision;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import io.netty.util.internal.StringUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class jva implements iva {
    public final SQLiteOpenHelper a;

    public jva(SQLiteOpenHelper sQLiteOpenHelper) {
        this.a = sQLiteOpenHelper;
    }

    public static String d(String str, int i) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(" IN (");
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(StringUtil.COMMA);
            }
            sb.append('?');
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // com.oplus.aiunit.vision.iva
    public List<Object> a(String str, int i) {
        Cursor cursorQuery = this.a.getReadableDatabase().query(str, new String[]{"_id", "data", "event_time", "encrypt_type"}, "event_cache_status IN (?, ?)", new String[]{"0", "1"}, null, null, "event_time ASC", String.valueOf(i));
        ArrayList arrayList = new ArrayList();
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(new Object[]{Long.valueOf(cursorQuery.getLong(0)), cursorQuery.getString(1), Long.valueOf(cursorQuery.getLong(2)), Integer.valueOf(cursorQuery.getInt(3))});
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        cursorQuery.close();
        return arrayList;
    }

    @Override // com.oplus.aiunit.vision.iva
    public int b(long j2) {
        SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
        String[] strArr = {"event_all_net", "event_wifi", "event_real_time", "event_hash_all_net", "event_hash_wifi"};
        int iDelete = 0;
        for (int i = 0; i < 5; i++) {
            String str = strArr[i];
            iDelete = iDelete + writableDatabase.delete(str, "event_time > 0 AND event_time < ?", new String[]{String.valueOf(j2)}) + writableDatabase.delete(str, "event_time <= 0", null);
        }
        return iDelete;
    }

    @Override // com.oplus.aiunit.vision.iva
    public int c(String str, List<Long> list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }
        SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
        String strD = d("_id", list.size());
        String[] strArr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            strArr[i] = String.valueOf(list.get(i));
        }
        return writableDatabase.delete(str, strD, strArr);
    }
}
