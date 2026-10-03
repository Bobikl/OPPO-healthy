package com.oplus.aiunit.vision;

import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import io.netty.util.internal.StringUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class ko3 implements jo3 {
    public final SQLiteOpenHelper a;

    public ko3(x56 x56Var) {
        this.a = x56Var;
    }

    public static void q(SQLiteStatement sQLiteStatement, int i, byte[] bArr) {
        if (bArr != null) {
            sQLiteStatement.bindBlob(i, bArr);
        } else {
            sQLiteStatement.bindNull(i);
        }
    }

    public static void r(SQLiteStatement sQLiteStatement, int i, long j2) {
        sQLiteStatement.bindLong(i, j2);
    }

    public static void s(SQLiteStatement sQLiteStatement, int i, String str) {
        if (str != null) {
            sQLiteStatement.bindString(i, str);
        } else {
            sQLiteStatement.bindNull(i);
        }
    }

    public static String t(String str, int i) {
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

    public static String u(String str, int i) {
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

    @Override // com.oplus.aiunit.vision.jo3
    public int a(SQLiteDatabase sQLiteDatabase, zs6 zs6Var) {
        if (sQLiteDatabase == null || zs6Var == null) {
            return 0;
        }
        sQLiteDatabase.execSQL("UPDATE common_info_rt SET cache_flag=0, event_key_long=?, upload_type=?, network_type=?, head_switch=?, event_level=? WHERE cache_flag=1 AND common_appid=? AND common_logtag=? AND common_eventid=?", new Object[]{Long.valueOf(zs6Var.f()), Integer.valueOf(zs6Var.j()), Integer.valueOf(zs6Var.b()), Integer.valueOf(zs6Var.h()), Integer.valueOf(zs6Var.g()), zs6Var.c(), zs6Var.d(), zs6Var.e()});
        return (int) DatabaseUtils.longForQuery(sQLiteDatabase, "SELECT changes()", null);
    }

    @Override // com.oplus.aiunit.vision.jo3
    public Map<String, List<Long>> b(long j2) throws Throwable {
        SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
        HashMap map = new HashMap();
        long jQueryNumEntries = DatabaseUtils.queryNumEntries(writableDatabase, "common_info_rt");
        if (jQueryNumEntries <= j2) {
            return map;
        }
        long j3 = jQueryNumEntries - j2;
        Cursor cursor = null;
        try {
            Cursor cursorRawQuery = writableDatabase.rawQuery("SELECT common_appid, event_time FROM common_info_rt WHERE cache_flag=1 ORDER BY event_time ASC LIMIT " + j3, null);
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
            writableDatabase.delete("common_info_rt", "_id IN (SELECT _id FROM common_info_rt WHERE cache_flag=1 ORDER BY event_time ASC LIMIT " + j3 + ")", null);
            return map;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.oplus.aiunit.vision.jo3
    public Map<String, List<Long>> c(long j2) {
        SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
        HashMap map = new HashMap();
        Cursor cursorQuery = null;
        try {
            cursorQuery = writableDatabase.query("common_info_rt", new String[]{"common_appid", "event_time"}, "event_time<?", new String[]{String.valueOf(j2)}, null, null, null);
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
            writableDatabase.delete("common_info_rt", "event_time<?", new String[]{String.valueOf(j2)});
            return map;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    @Override // com.oplus.aiunit.vision.jo3
    public int d(List<Long> list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }
        SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            String strT = t("_id", list.size());
            String[] strArr = new String[list.size()];
            for (int i = 0; i < list.size(); i++) {
                strArr[i] = String.valueOf(list.get(i));
            }
            int iDelete = writableDatabase.delete("common_info_rt", strT, strArr);
            writableDatabase.setTransactionSuccessful();
            return iDelete;
        } finally {
            writableDatabase.endTransaction();
        }
    }

    @Override // com.oplus.aiunit.vision.jo3
    public int e(SQLiteDatabase sQLiteDatabase, zs6 zs6Var) {
        if (sQLiteDatabase == null || zs6Var == null) {
            return 0;
        }
        sQLiteDatabase.execSQL("DELETE FROM common_info_rt WHERE cache_flag=1 AND common_appid=? AND common_logtag=? AND common_eventid=?", new Object[]{zs6Var.c(), zs6Var.d(), zs6Var.e()});
        return (int) DatabaseUtils.longForQuery(sQLiteDatabase, "SELECT changes()", null);
    }

    @Override // com.oplus.aiunit.vision.jo3
    public int f(List<co3> list) {
        int i = 0;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
        SQLiteStatement sQLiteStatementCompileStatement = writableDatabase.compileStatement("INSERT INTO common_info_rt (event_key_long, header_index, common_header, body_blob, sequence_id, common_appid, common_logtag, common_eventid, head_switch, event_level, network_type, upload_type, event_time, cache_flag, event_source, raw_size) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        writableDatabase.beginTransaction();
        try {
            for (co3 co3Var : list) {
                sQLiteStatementCompileStatement.clearBindings();
                r(sQLiteStatementCompileStatement, 1, co3Var.b);
                r(sQLiteStatementCompileStatement, 2, co3Var.f10169c);
                s(sQLiteStatementCompileStatement, 3, co3Var.f10170e);
                q(sQLiteStatementCompileStatement, 4, co3Var.g);
                s(sQLiteStatementCompileStatement, 5, co3Var.h);
                s(sQLiteStatementCompileStatement, 6, co3Var.i);
                s(sQLiteStatementCompileStatement, 7, co3Var.f10171j);
                s(sQLiteStatementCompileStatement, 8, co3Var.k);
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

    @Override // com.oplus.aiunit.vision.jo3
    public List<String> g() {
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQuery = this.a.getReadableDatabase().rawQuery("SELECT DISTINCT common_appid FROM common_info_rt", null);
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

    @Override // com.oplus.aiunit.vision.jo3
    public List<co3> h(String str, int i, long j2, int i2, boolean z, boolean z2) {
        if (str == null || i2 <= 0) {
            return new ArrayList();
        }
        SQLiteDatabase readableDatabase = this.a.getReadableDatabase();
        String[] strArr = {"_id", "event_key_long", "header_index", "common_header", "body_blob", "sequence_id", "common_appid", "common_logtag", "common_eventid", "head_switch", "event_level", "network_type", "upload_type", "event_time", "cache_flag", "event_source", "raw_size"};
        StringBuilder sb = new StringBuilder("cache_flag=0 AND common_appid=? AND upload_type=?");
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        arrayList.add(String.valueOf(i));
        if (!z2) {
            sb.append(" AND event_source NOT IN (2,4)");
        }
        if (j2 > 0) {
            sb.append(" AND event_time < ?");
            arrayList.add(String.valueOf(j2));
        }
        if (!z) {
            sb.append(" AND network_type=?");
            arrayList.add("0");
        }
        Cursor cursorQuery = readableDatabase.query("common_info_rt", strArr, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, "event_time ASC, _id ASC", String.valueOf(i2));
        ArrayList arrayList2 = new ArrayList();
        while (cursorQuery.moveToNext()) {
            try {
                byte[] blob = cursorQuery.getBlob(4);
                String string = cursorQuery.getString(3);
                co3 co3Var = new co3(cursorQuery.getString(6), cursorQuery.getString(7), cursorQuery.getString(8), blob, cursorQuery.getString(5), cursorQuery.getLong(13), cursorQuery.getInt(15));
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
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        cursorQuery.close();
        return arrayList2;
    }

    @Override // com.oplus.aiunit.vision.jo3
    public List<co3> i(String str, long j2, long j3, long j4, int i, boolean z, boolean z2, int... iArr) {
        SQLiteDatabase readableDatabase = this.a.getReadableDatabase();
        String[] strArr = {"_id", "event_key_long", "header_index", "common_header", "body_blob", "sequence_id", "common_appid", "common_logtag", "common_eventid", "head_switch", "event_level", "network_type", "upload_type", "event_time", "cache_flag", "event_source", "raw_size"};
        StringBuilder sb = new StringBuilder("cache_flag=0 AND common_appid=? AND event_level=0 AND event_key_long=?");
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        arrayList.add(String.valueOf(j2));
        if (!z2) {
            sb.append(" AND event_source NOT IN (2,4)");
        }
        if (!z) {
            sb.append(" AND network_type=0");
        }
        if (iArr != null && iArr.length > 0) {
            sb.append(" AND ");
            sb.append(t("upload_type", iArr.length));
            for (int i2 : iArr) {
                arrayList.add(String.valueOf(i2));
            }
        }
        if (j3 > 0 || j4 > 0) {
            sb.append(" AND (event_time > ? OR (event_time = ? AND _id > ?))");
            arrayList.add(String.valueOf(j3));
            arrayList.add(String.valueOf(j3));
            arrayList.add(String.valueOf(j4));
        }
        return v(readableDatabase.query("common_info_rt", strArr, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, "event_time ASC, _id ASC", String.valueOf(i)), i);
    }

    @Override // com.oplus.aiunit.vision.jo3
    public Object[] j(long j2, long j3, boolean z, boolean z2, Set<String> set, int... iArr) {
        SQLiteDatabase readableDatabase = this.a.getReadableDatabase();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT common_appid, upload_type, event_key_long ");
        sb.append("FROM ");
        sb.append("common_info_rt");
        sb.append(" WHERE cache_flag=0 AND event_level=0");
        ArrayList arrayList = new ArrayList();
        if (!z) {
            sb.append(" AND network_type=0");
        }
        if (!z2) {
            sb.append(" AND event_source NOT IN (2,4)");
        }
        if (set != null && !set.isEmpty()) {
            sb.append(" AND ");
            sb.append(u("common_appid", set.size()));
            arrayList.addAll(set);
        }
        if (iArr != null && iArr.length > 0) {
            sb.append(" AND ");
            sb.append(t("upload_type", iArr.length));
            for (int i : iArr) {
                arrayList.add(String.valueOf(i));
            }
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
            return new Object[]{string, Integer.valueOf((i2 == 4 || i2 == 5) ? 0 : 1), Long.valueOf(cursorRawQuery.getLong(2))};
        } finally {
            cursorRawQuery.close();
        }
    }

    @Override // com.oplus.aiunit.vision.jo3
    public long[] k(String str, long j2, long j3, boolean z, boolean z2, int... iArr) {
        if (str == null) {
            return null;
        }
        SQLiteDatabase readableDatabase = this.a.getReadableDatabase();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT event_time, _id FROM ");
        sb.append("common_info_rt");
        sb.append(" WHERE cache_flag=0 AND common_appid=? AND event_level!=0");
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        if (!z2) {
            sb.append(" AND event_source NOT IN (2,4)");
        }
        if (!z) {
            sb.append(" AND network_type=0");
        }
        if (iArr != null && iArr.length > 0) {
            sb.append(" AND ");
            sb.append(t("upload_type", iArr.length));
            for (int i : iArr) {
                arrayList.add(String.valueOf(i));
            }
        }
        if (j2 > 0 || j3 > 0) {
            sb.append(" AND (event_time > ? OR (event_time = ? AND _id > ?))");
            arrayList.add(String.valueOf(j2));
            arrayList.add(String.valueOf(j2));
            arrayList.add(String.valueOf(j3));
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

    @Override // com.oplus.aiunit.vision.jo3
    public List<co3> l(int i, boolean z) {
        String[] strArr;
        String str;
        SQLiteDatabase readableDatabase = this.a.getReadableDatabase();
        String[] strArr2 = {"_id", "event_key_long", "header_index", "common_header", "body_blob", "sequence_id", "common_appid", "common_logtag", "common_eventid", "head_switch", "event_level", "network_type", "upload_type", "event_time", "cache_flag", "event_source", "raw_size"};
        if (z) {
            strArr = new String[]{"0"};
            str = "cache_flag=?";
        } else {
            strArr = new String[]{"0", "0"};
            str = "cache_flag=? AND network_type=?";
        }
        Cursor cursorQuery = readableDatabase.query("common_info_rt", strArr2, str, strArr, null, null, "event_time ASC", String.valueOf(i));
        ArrayList arrayList = new ArrayList();
        long length = 0;
        for (int i2 = 0; cursorQuery.moveToNext() && i2 < i; i2++) {
            try {
                byte[] blob = cursorQuery.getBlob(4);
                String string = cursorQuery.getString(3);
                length += ((long) (blob != null ? blob.length : 0)) + (string != null ? ((long) string.length()) * 2 : 0L);
                if (length > 1048576 && !arrayList.isEmpty()) {
                    break;
                }
                co3 co3Var = new co3(cursorQuery.getString(6), cursorQuery.getString(7), cursorQuery.getString(8), cursorQuery.getBlob(4), cursorQuery.getString(5), cursorQuery.getLong(13), cursorQuery.getInt(15));
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
                arrayList.add(co3Var);
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        cursorQuery.close();
        return arrayList;
    }

    @Override // com.oplus.aiunit.vision.jo3
    public Object[] m(long j2, long j3, boolean z, boolean z2, Set<String> set, int... iArr) {
        SQLiteDatabase readableDatabase = this.a.getReadableDatabase();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT common_appid, upload_type ");
        sb.append("FROM ");
        sb.append("common_info_rt");
        sb.append(" WHERE cache_flag=0 AND event_level!=0");
        ArrayList arrayList = new ArrayList();
        if (!z) {
            sb.append(" AND network_type=0");
        }
        if (!z2) {
            sb.append(" AND event_source NOT IN (2,4)");
        }
        if (set != null && !set.isEmpty()) {
            sb.append(" AND ");
            sb.append(u("common_appid", set.size()));
            arrayList.addAll(set);
        }
        if (iArr != null && iArr.length > 0) {
            sb.append(" AND ");
            sb.append(t("upload_type", iArr.length));
            for (int i : iArr) {
                arrayList.add(String.valueOf(i));
            }
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
            return new Object[]{string, Integer.valueOf((i2 == 4 || i2 == 5) ? 0 : 1)};
        } finally {
            cursorRawQuery.close();
        }
    }

    @Override // com.oplus.aiunit.vision.jo3
    public List<co3> n(String str, long j2, long j3, int i, boolean z, boolean z2, int... iArr) {
        SQLiteDatabase readableDatabase = this.a.getReadableDatabase();
        String[] strArr = {"_id", "event_key_long", "header_index", "common_header", "body_blob", "sequence_id", "common_appid", "common_logtag", "common_eventid", "head_switch", "event_level", "network_type", "upload_type", "event_time", "cache_flag", "event_source", "raw_size"};
        StringBuilder sb = new StringBuilder("cache_flag=0 AND common_appid=? AND event_level!=0");
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        if (!z2) {
            sb.append(" AND event_source NOT IN (2,4)");
        }
        if (!z) {
            sb.append(" AND network_type=0");
        }
        if (iArr != null && iArr.length > 0) {
            sb.append(" AND ");
            sb.append(t("upload_type", iArr.length));
            for (int i2 : iArr) {
                arrayList.add(String.valueOf(i2));
            }
        }
        if (j2 > 0 || j3 > 0) {
            sb.append(" AND (event_time > ? OR (event_time = ? AND _id > ?))");
            arrayList.add(String.valueOf(j2));
            arrayList.add(String.valueOf(j2));
            arrayList.add(String.valueOf(j3));
        }
        return v(readableDatabase.query("common_info_rt", strArr, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, "event_time ASC, _id ASC", String.valueOf(i)), i);
    }

    @Override // com.oplus.aiunit.vision.jo3
    public Map<String, List<Long>> o(int i) {
        if (i <= 0) {
            return Collections.emptyMap();
        }
        SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
        HashMap map = new HashMap();
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = writableDatabase.rawQuery("SELECT common_appid, event_time FROM common_info_rt ORDER BY event_time ASC LIMIT " + i, null);
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
            writableDatabase.execSQL("DELETE FROM common_info_rt WHERE _id IN (SELECT _id FROM common_info_rt ORDER BY event_time ASC LIMIT " + i + ")");
            return map;
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    @Override // com.oplus.aiunit.vision.jo3
    public long[] p(String str, long j2, long j3, long j4, boolean z, boolean z2, int... iArr) {
        if (str == null) {
            return null;
        }
        SQLiteDatabase readableDatabase = this.a.getReadableDatabase();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT event_time, _id FROM ");
        sb.append("common_info_rt");
        sb.append(" WHERE cache_flag=0 AND common_appid=? AND event_level=0 AND event_key_long=?");
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        arrayList.add(String.valueOf(j2));
        if (!z2) {
            sb.append(" AND event_source NOT IN (2,4)");
        }
        if (!z) {
            sb.append(" AND network_type=0");
        }
        if (iArr != null && iArr.length > 0) {
            sb.append(" AND ");
            sb.append(t("upload_type", iArr.length));
            for (int i : iArr) {
                arrayList.add(String.valueOf(i));
            }
        }
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

    public final List<co3> v(Cursor cursor, int i) {
        ArrayList arrayList = new ArrayList();
        long length = 0;
        for (int i2 = 0; cursor.moveToNext() && i2 < i; i2++) {
            try {
                byte[] blob = cursor.getBlob(4);
                String string = cursor.getString(3);
                length += (long) ((blob != null ? blob.length : 0) + (string != null ? string.length() : 0));
                if (length > 1048576 && i2 > 0) {
                    break;
                }
                co3 co3Var = new co3(cursor.getString(6), cursor.getString(7), cursor.getString(8), blob, cursor.getString(5), cursor.getLong(13), cursor.getInt(15));
                co3Var.a = cursor.getLong(0);
                co3Var.b = cursor.getLong(1);
                co3Var.f10169c = cursor.getLong(2);
                co3Var.f10170e = string;
                co3Var.f10172l = cursor.getInt(9);
                co3Var.m = cursor.getInt(10);
                co3Var.f10173n = cursor.getInt(11);
                co3Var.o = cursor.getInt(12);
                co3Var.q = cursor.getInt(14);
                co3Var.v = cursor.getInt(16);
                arrayList.add(co3Var);
            } catch (Throwable th) {
                cursor.close();
                throw th;
            }
        }
        cursor.close();
        return arrayList;
    }

    public ko3(hdf hdfVar) {
        this.a = hdfVar;
    }
}
