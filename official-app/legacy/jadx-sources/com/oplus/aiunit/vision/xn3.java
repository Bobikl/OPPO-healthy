package com.oplus.aiunit.vision;

import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import io.netty.util.internal.StringUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class xn3 implements wn3 {
    public final x56 a;

    public xn3(x56 x56Var) {
        this.a = x56Var;
    }

    public static void l(SQLiteStatement sQLiteStatement, int i, byte[] bArr) {
        if (bArr != null) {
            sQLiteStatement.bindBlob(i, bArr);
        } else {
            sQLiteStatement.bindNull(i);
        }
    }

    public static void m(SQLiteStatement sQLiteStatement, int i, long j2) {
        sQLiteStatement.bindLong(i, j2);
    }

    public static void n(SQLiteStatement sQLiteStatement, int i, String str) {
        if (str != null) {
            sQLiteStatement.bindString(i, str);
        } else {
            sQLiteStatement.bindNull(i);
        }
    }

    public static String o(String str, int i) {
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

    public static String p(String str, int i) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(" NOT IN (");
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(StringUtil.COMMA);
            }
            sb.append('?');
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // com.oplus.aiunit.vision.wn3
    public int a(SQLiteDatabase sQLiteDatabase, zs6 zs6Var) {
        if (sQLiteDatabase == null || zs6Var == null) {
            return 0;
        }
        sQLiteDatabase.execSQL("UPDATE common_info_nr SET cache_flag=0, event_key_long=?, upload_type=?, network_type=?, head_switch=?, event_level=? WHERE cache_flag=1 AND common_appid=? AND common_logtag=? AND common_eventid=?", new Object[]{Long.valueOf(zs6Var.f()), Integer.valueOf(zs6Var.j()), Integer.valueOf(zs6Var.b()), Integer.valueOf(zs6Var.h()), Integer.valueOf(zs6Var.g()), zs6Var.c(), zs6Var.d(), zs6Var.e()});
        return (int) DatabaseUtils.longForQuery(sQLiteDatabase, "SELECT changes()", null);
    }

    @Override // com.oplus.aiunit.vision.wn3
    public Map<String, List<Long>> b(long j2) throws Throwable {
        SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
        HashMap map = new HashMap();
        long jQueryNumEntries = DatabaseUtils.queryNumEntries(writableDatabase, "common_info_nr");
        if (jQueryNumEntries <= j2) {
            return map;
        }
        long j3 = jQueryNumEntries - j2;
        Cursor cursor = null;
        try {
            Cursor cursorRawQuery = writableDatabase.rawQuery("SELECT common_appid, event_time FROM common_info_nr WHERE cache_flag=1 ORDER BY event_time ASC LIMIT " + j3, null);
            while (cursorRawQuery.moveToNext()) {
                try {
                    String string = cursorRawQuery.getString(0);
                    long j4 = cursorRawQuery.getLong(1);
                    List arrayList = (List) map.get(string);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        map.put(string, arrayList);
                    }
                    arrayList.add(Long.valueOf(j4));
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorRawQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            cursorRawQuery.close();
            writableDatabase.delete("common_info_nr", "_id IN (SELECT _id FROM common_info_nr WHERE cache_flag=1 ORDER BY event_time ASC LIMIT " + j3 + ")", null);
            return map;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.oplus.aiunit.vision.wn3
    public Map<String, List<Long>> c(long j2) {
        SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
        HashMap map = new HashMap();
        Cursor cursorQuery = null;
        try {
            cursorQuery = writableDatabase.query("common_info_nr", new String[]{"common_appid", "event_time"}, "event_time<?", new String[]{String.valueOf(j2)}, null, null, null);
            while (cursorQuery.moveToNext()) {
                String string = cursorQuery.getString(0);
                long j3 = cursorQuery.getLong(1);
                List arrayList = (List) map.get(string);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(string, arrayList);
                }
                arrayList.add(Long.valueOf(j3));
            }
            cursorQuery.close();
            writableDatabase.delete("common_info_nr", "event_time<?", new String[]{String.valueOf(j2)});
            return map;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    @Override // com.oplus.aiunit.vision.wn3
    public int d(List<Long> list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }
        SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            String strO = o("_id", list.size());
            String[] strArr = new String[list.size()];
            for (int i = 0; i < list.size(); i++) {
                strArr[i] = String.valueOf(list.get(i));
            }
            int iDelete = writableDatabase.delete("common_info_nr", strO, strArr);
            writableDatabase.setTransactionSuccessful();
            return iDelete;
        } finally {
            writableDatabase.endTransaction();
        }
    }

    @Override // com.oplus.aiunit.vision.wn3
    public int e(SQLiteDatabase sQLiteDatabase, zs6 zs6Var) {
        if (sQLiteDatabase == null || zs6Var == null) {
            return 0;
        }
        sQLiteDatabase.execSQL("DELETE FROM common_info_nr WHERE cache_flag=1 AND common_appid=? AND common_logtag=? AND common_eventid=?", new Object[]{zs6Var.c(), zs6Var.d(), zs6Var.e()});
        return (int) DatabaseUtils.longForQuery(sQLiteDatabase, "SELECT changes()", null);
    }

    @Override // com.oplus.aiunit.vision.wn3
    public int f(List<co3> list) {
        int i = 0;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
        SQLiteStatement sQLiteStatementCompileStatement = writableDatabase.compileStatement("INSERT INTO common_info_nr (event_key_long, header_index, common_header, body_blob, sequence_id, common_appid, common_logtag, common_eventid, head_switch, event_level, network_type, upload_type, event_time, cache_flag, event_source, raw_size) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        writableDatabase.beginTransaction();
        try {
            for (co3 co3Var : list) {
                sQLiteStatementCompileStatement.clearBindings();
                m(sQLiteStatementCompileStatement, 1, co3Var.b);
                m(sQLiteStatementCompileStatement, 2, co3Var.f10169c);
                n(sQLiteStatementCompileStatement, 3, co3Var.f10170e);
                l(sQLiteStatementCompileStatement, 4, co3Var.g);
                n(sQLiteStatementCompileStatement, 5, co3Var.h);
                n(sQLiteStatementCompileStatement, 6, co3Var.i);
                n(sQLiteStatementCompileStatement, 7, co3Var.f10171j);
                n(sQLiteStatementCompileStatement, 8, co3Var.k);
                sQLiteStatementCompileStatement.bindLong(9, co3Var.f10172l);
                sQLiteStatementCompileStatement.bindLong(10, co3Var.m);
                sQLiteStatementCompileStatement.bindLong(11, co3Var.f10173n);
                sQLiteStatementCompileStatement.bindLong(12, co3Var.o);
                sQLiteStatementCompileStatement.bindLong(13, co3Var.p);
                sQLiteStatementCompileStatement.bindLong(14, co3Var.q);
                sQLiteStatementCompileStatement.bindLong(15, co3Var.t);
                sQLiteStatementCompileStatement.bindLong(16, co3Var.v);
                if (sQLiteStatementCompileStatement.executeInsert() != -1) {
                    i++;
                }
            }
            writableDatabase.setTransactionSuccessful();
            return i;
        } finally {
            writableDatabase.endTransaction();
            sQLiteStatementCompileStatement.close();
        }
    }

    @Override // com.oplus.aiunit.vision.wn3
    public List<String> g() {
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQuery = this.a.getReadableDatabase().rawQuery("SELECT DISTINCT common_appid FROM common_info_nr", null);
        while (cursorRawQuery.moveToNext()) {
            try {
                arrayList.add(cursorRawQuery.getString(0));
            } catch (Throwable th) {
                cursorRawQuery.close();
                throw th;
            }
        }
        cursorRawQuery.close();
        return arrayList;
    }

    @Override // com.oplus.aiunit.vision.wn3
    public Object[] h(long j2, long j3, boolean z, boolean z2, boolean z3, Set<String> set, int... iArr) {
        if (iArr == null || iArr.length == 0) {
            return null;
        }
        SQLiteDatabase readableDatabase = this.a.getReadableDatabase();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT common_appid, upload_type, event_level, event_key_long ");
        sb.append("FROM ");
        sb.append("common_info_nr");
        sb.append(" WHERE cache_flag=0");
        sb.append(" AND upload_type IN (");
        for (int i = 0; i < iArr.length; i++) {
            if (i > 0) {
                sb.append(StringUtil.COMMA);
            }
            sb.append(iArr[i]);
        }
        sb.append(")");
        ArrayList arrayList = new ArrayList();
        if (!z) {
            sb.append(" AND network_type=0");
        }
        if (!z3) {
            sb.append(" AND event_source NOT IN (2,4)");
        }
        if (set != null && !set.isEmpty()) {
            sb.append(" AND ");
            sb.append(p("common_appid", set.size()));
            arrayList.addAll(set);
        }
        if (z2) {
            sb.append(" AND event_level=0");
        } else {
            sb.append(" AND event_level!=0");
        }
        if (j2 > 0 || j3 > 0) {
            sb.append(" AND (event_time > ? OR (event_time = ? AND _id > ?))");
            arrayList.add(String.valueOf(j2));
            arrayList.add(String.valueOf(j2));
            arrayList.add(String.valueOf(j3));
        }
        sb.append(" ORDER BY event_time ASC, _id ASC LIMIT 1");
        Cursor cursorRawQuery = readableDatabase.rawQuery(sb.toString(), (String[]) arrayList.toArray(new String[0]));
        try {
            if (!cursorRawQuery.moveToFirst()) {
                return null;
            }
            String string = cursorRawQuery.getString(0);
            int i2 = cursorRawQuery.getInt(1);
            return new Object[]{string, Integer.valueOf((i2 == 4 || i2 == 5) ? 0 : 1), Integer.valueOf(cursorRawQuery.getInt(2)), Long.valueOf(cursorRawQuery.getLong(3))};
        } finally {
            cursorRawQuery.close();
        }
    }

    @Override // com.oplus.aiunit.vision.wn3
    public Map<String, List<Long>> i(int i, int i2) {
        if (i2 <= 0) {
            return Collections.emptyMap();
        }
        SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
        HashMap map = new HashMap();
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = writableDatabase.rawQuery("SELECT common_appid, event_time FROM common_info_nr WHERE event_level = ? ORDER BY event_time ASC LIMIT " + i2, new String[]{String.valueOf(i)});
            while (cursorRawQuery.moveToNext()) {
                String string = cursorRawQuery.getString(0);
                long j2 = cursorRawQuery.getLong(1);
                List arrayList = (List) map.get(string);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(string, arrayList);
                }
                arrayList.add(Long.valueOf(j2));
            }
            cursorRawQuery.close();
            writableDatabase.execSQL("DELETE FROM common_info_nr WHERE _id IN (SELECT _id FROM common_info_nr WHERE event_level = ? ORDER BY event_time ASC LIMIT " + i2 + ")", new Object[]{Integer.valueOf(i)});
            return map;
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    @Override // com.oplus.aiunit.vision.wn3
    public List<co3> j(String str, int i, long j2, long j3, long j4, int i2, boolean z, boolean z2, int... iArr) {
        if (iArr == null || iArr.length == 0) {
            return Collections.emptyList();
        }
        SQLiteDatabase readableDatabase = this.a.getReadableDatabase();
        String[] strArr = {"_id", "event_key_long", "header_index", "common_header", "body_blob", "sequence_id", "common_appid", "common_logtag", "common_eventid", "head_switch", "event_level", "network_type", "upload_type", "event_time", "cache_flag", "event_source", "raw_size"};
        StringBuilder sb = new StringBuilder("cache_flag=0 AND common_appid=?");
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        if (i == 0) {
            sb.append(" AND event_level=0 AND event_key_long=?");
            arrayList.add(String.valueOf(j2));
        } else {
            sb.append(" AND event_level!=0");
        }
        if (!z2) {
            sb.append(" AND event_source NOT IN (2,4)");
        }
        sb.append(" AND ");
        sb.append(o("upload_type", iArr.length));
        int i3 = 0;
        for (int i4 : iArr) {
            arrayList.add(String.valueOf(i4));
        }
        if (!z) {
            sb.append(" AND network_type=0");
        }
        long j5 = 0;
        if (j3 > 0 || j4 > 0) {
            sb.append(" AND (event_time > ? OR (event_time = ? AND _id > ?))");
            arrayList.add(String.valueOf(j3));
            arrayList.add(String.valueOf(j3));
            arrayList.add(String.valueOf(j4));
        }
        Cursor cursorQuery = readableDatabase.query("common_info_nr", strArr, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, "event_time ASC, _id ASC", String.valueOf(i2));
        ArrayList arrayList2 = new ArrayList();
        int i5 = 0;
        long length = 0;
        while (cursorQuery.moveToNext() && i5 < i2) {
            try {
                byte[] blob = cursorQuery.getBlob(4);
                String string = cursorQuery.getString(3);
                length += ((long) (blob != null ? blob.length : i3)) + (string != null ? ((long) string.length()) * 2 : j5);
                if (length > 1048576 && !arrayList2.isEmpty()) {
                    break;
                }
                co3 co3Var = new co3(cursorQuery.getString(6), cursorQuery.getString(7), cursorQuery.getString(8), blob, cursorQuery.getString(5), cursorQuery.getLong(13), cursorQuery.getInt(15));
                i3 = 0;
                co3Var.a = cursorQuery.getLong(0);
                co3Var.b = cursorQuery.getLong(1);
                co3Var.f10169c = cursorQuery.getLong(2);
                co3Var.f10170e = string;
                co3Var.f10172l = cursorQuery.getInt(9);
                co3Var.m = cursorQuery.getInt(10);
                co3Var.f10173n = cursorQuery.getInt(11);
                co3Var.o = cursorQuery.getInt(12);
                co3Var.q = cursorQuery.getInt(14);
                co3Var.v = cursorQuery.getInt(16);
                arrayList2.add(co3Var);
                i5++;
                j5 = 0;
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        cursorQuery.close();
        return arrayList2;
    }

    @Override // com.oplus.aiunit.vision.wn3
    public long[] k(String str, int i, long j2, long j3, long j4, boolean z, boolean z2, int... iArr) {
        if (str == null || iArr == null || iArr.length == 0) {
            return null;
        }
        SQLiteDatabase readableDatabase = this.a.getReadableDatabase();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT event_time, _id FROM ");
        sb.append("common_info_nr");
        sb.append(" WHERE cache_flag=0 AND common_appid=?");
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        if (i == 0) {
            sb.append(" AND event_level=0 AND event_key_long=?");
            arrayList.add(String.valueOf(j2));
        } else {
            sb.append(" AND event_level!=0");
        }
        if (!z2) {
            sb.append(" AND event_source NOT IN (2,4)");
        }
        if (!z) {
            sb.append(" AND network_type=0");
        }
        sb.append(" AND upload_type IN (");
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (i2 > 0) {
                sb.append(StringUtil.COMMA);
            }
            sb.append(iArr[i2]);
        }
        sb.append(")");
        if (j3 > 0 || j4 > 0) {
            sb.append(" AND (event_time > ? OR (event_time = ? AND _id > ?))");
            arrayList.add(String.valueOf(j3));
            arrayList.add(String.valueOf(j3));
            arrayList.add(String.valueOf(j4));
        }
        sb.append(" ORDER BY event_time DESC, _id DESC LIMIT 1");
        Cursor cursorRawQuery = readableDatabase.rawQuery(sb.toString(), (String[]) arrayList.toArray(new String[0]));
        try {
            if (cursorRawQuery.moveToFirst()) {
                return new long[]{cursorRawQuery.getLong(0), cursorRawQuery.getLong(1)};
            }
            return null;
        } finally {
            cursorRawQuery.close();
        }
    }
}
