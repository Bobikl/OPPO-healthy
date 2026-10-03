package com.oplus.aiunit.vision;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.oplus.drs.rom.sdk.comm.db.ClientDataEntity;
import com.oplus.drs.rom.sdk.comm.log.TrackLogger;
import io.netty.util.internal.StringUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes19.dex */
public class mf3 {
    public final SQLiteDatabase a;
    public final Lock b = new ReentrantLock();

    public mf3(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            this.a = sQLiteDatabase;
        } else {
            TrackLogger.e("DRS_SDK_COMMON_ClientDataDao", "Database cannot be null", new Object[0]);
            throw new IllegalArgumentException("Database cannot be null");
        }
    }

    public final ContentValues a(ClientDataEntity clientDataEntity) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("data", clientDataEntity.getData());
        contentValues.put("event_time", Long.valueOf(clientDataEntity.getEventTime()));
        contentValues.put("app_id", clientDataEntity.getAppId());
        contentValues.put("status", Integer.valueOf(clientDataEntity.getStatus()));
        contentValues.put("retry_count", Integer.valueOf(clientDataEntity.getRetryCount()));
        contentValues.put("create_time", Long.valueOf(clientDataEntity.getCreateTime()));
        contentValues.put("update_time", Long.valueOf(clientDataEntity.getUpdateTime()));
        contentValues.put(ClientDataEntity.COL_DATA_SIZE, Integer.valueOf(clientDataEntity.getDataSize()));
        contentValues.put("priority", Integer.valueOf(clientDataEntity.getPriority()));
        contentValues.put(ClientDataEntity.COL_IS_EXCEPTION_EVENT, Integer.valueOf(clientDataEntity.getIsExceptionEvent()));
        contentValues.put("exception_type", clientDataEntity.getExceptionType());
        contentValues.put(ClientDataEntity.COL_EXCEPTION_CODE, clientDataEntity.getExceptionCode());
        return contentValues;
    }

    public final String[] b(List<Long> list) {
        String[] strArr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            Long l2 = list.get(i);
            strArr[i] = l2 == null ? null : String.valueOf(l2);
        }
        return strArr;
    }

    public final String c(String str, int i) {
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

    public int d(int i) {
        int iF;
        this.b.lock();
        try {
            try {
                List<ClientDataEntity> listP = p("status=?", new String[]{String.valueOf(2)}, "create_time ASC", String.valueOf(i));
                if (listP == null || listP.isEmpty()) {
                    List<ClientDataEntity> listP2 = p("status=?", new String[]{String.valueOf(0)}, "create_time ASC", String.valueOf(i));
                    if (listP2 != null && !listP2.isEmpty()) {
                        ArrayList arrayList = new ArrayList(listP2.size());
                        Iterator<ClientDataEntity> it = listP2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(Long.valueOf(it.next().getId()));
                        }
                        iF = f(arrayList);
                    }
                    return 0;
                }
                ArrayList arrayList2 = new ArrayList(listP.size());
                Iterator<ClientDataEntity> it2 = listP.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Long.valueOf(it2.next().getId()));
                }
                iF = f(arrayList2);
                return iF;
            } catch (SQLException e2) {
                TrackLogger.d("DRS_SDK_COMMON_ClientDataDao", "Failed to clean oldest data", e2, new Object[0]);
            }
        } finally {
            this.b.unlock();
        }
    }

    public int e(long j2) {
        this.b.lock();
        try {
            return o("status = 1 AND update_time < " + j2, null);
        } finally {
            this.b.unlock();
        }
    }

    public int f(List<Long> list) {
        if (list == null || list.isEmpty()) {
            TrackLogger.e("DRS_SDK_COMMON_ClientDataDao", "IDs list is null or empty", new Object[0]);
            return 0;
        }
        this.b.lock();
        try {
            return this.a.delete("client_data", c("_id", list.size()), b(list));
        } catch (SQLException e2) {
            TrackLogger.d("DRS_SDK_COMMON_ClientDataDao", "Failed to delete data", e2, new Object[0]);
            return 0;
        } finally {
            this.b.unlock();
        }
    }

    public final ClientDataEntity g(Cursor cursor) {
        ClientDataEntity clientDataEntity = new ClientDataEntity();
        int columnIndex = cursor.getColumnIndex("_id");
        if (columnIndex >= 0) {
            clientDataEntity.setId(cursor.getLong(columnIndex));
        }
        int columnIndex2 = cursor.getColumnIndex("data");
        if (columnIndex2 >= 0) {
            clientDataEntity.setData(cursor.getString(columnIndex2));
        }
        int columnIndex3 = cursor.getColumnIndex("event_time");
        if (columnIndex3 >= 0) {
            clientDataEntity.setEventTime(cursor.getLong(columnIndex3));
        }
        int columnIndex4 = cursor.getColumnIndex("app_id");
        if (columnIndex4 >= 0) {
            clientDataEntity.setAppId(cursor.getString(columnIndex4));
        }
        int columnIndex5 = cursor.getColumnIndex("status");
        if (columnIndex5 >= 0) {
            clientDataEntity.setStatus(cursor.getInt(columnIndex5));
        }
        int columnIndex6 = cursor.getColumnIndex("retry_count");
        if (columnIndex6 >= 0) {
            clientDataEntity.setRetryCount(cursor.getInt(columnIndex6));
        }
        int columnIndex7 = cursor.getColumnIndex("create_time");
        if (columnIndex7 >= 0) {
            clientDataEntity.setCreateTime(cursor.getLong(columnIndex7));
        }
        int columnIndex8 = cursor.getColumnIndex("update_time");
        if (columnIndex8 >= 0) {
            clientDataEntity.setUpdateTime(cursor.getLong(columnIndex8));
        }
        int columnIndex9 = cursor.getColumnIndex(ClientDataEntity.COL_DATA_SIZE);
        if (columnIndex9 >= 0) {
            clientDataEntity.setDataSize(cursor.getInt(columnIndex9));
        }
        int columnIndex10 = cursor.getColumnIndex("priority");
        if (columnIndex10 >= 0) {
            clientDataEntity.setPriority(cursor.getInt(columnIndex10));
        }
        int columnIndex11 = cursor.getColumnIndex(ClientDataEntity.COL_IS_EXCEPTION_EVENT);
        if (columnIndex11 >= 0) {
            clientDataEntity.setIsExceptionEvent(cursor.getInt(columnIndex11));
        }
        int columnIndex12 = cursor.getColumnIndex("exception_type");
        if (columnIndex12 >= 0) {
            clientDataEntity.setExceptionType(cursor.getString(columnIndex12));
        }
        int columnIndex13 = cursor.getColumnIndex(ClientDataEntity.COL_EXCEPTION_CODE);
        if (columnIndex13 >= 0) {
            clientDataEntity.setExceptionCode(cursor.getString(columnIndex13));
        }
        return clientDataEntity;
    }

    public int h() {
        this.b.lock();
        try {
            return o("status=?", new String[]{String.valueOf(0)});
        } finally {
            this.b.unlock();
        }
    }

    public List<ClientDataEntity> i(int i) {
        this.b.lock();
        try {
            return p("status=?", new String[]{String.valueOf(0)}, "create_time ASC", String.valueOf(i));
        } finally {
            this.b.unlock();
        }
    }

    public int j() {
        this.b.lock();
        try {
            return o("status >= 0", null);
        } finally {
            this.b.unlock();
        }
    }

    public long k() {
        this.b.lock();
        Cursor cursorQuery = null;
        try {
            try {
                try {
                    cursorQuery = this.a.query("client_data", new String[]{ClientDataEntity.COL_DATA_SIZE}, null, null, null, null, null);
                    long j2 = 0;
                    while (cursorQuery != null && cursorQuery.moveToNext()) {
                        int columnIndex = cursorQuery.getColumnIndex(ClientDataEntity.COL_DATA_SIZE);
                        if (columnIndex >= 0) {
                            j2 += cursorQuery.getLong(columnIndex);
                        }
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    this.b.unlock();
                    return j2;
                } catch (SQLException e2) {
                    TrackLogger.d("DRS_SDK_COMMON_ClientDataDao", "Failed to query total data size", e2, new Object[0]);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    this.b.unlock();
                    return 0L;
                }
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            this.b.unlock();
            throw th2;
        }
    }

    public long l(ClientDataEntity clientDataEntity) {
        if (clientDataEntity == null) {
            TrackLogger.e("DRS_SDK_COMMON_ClientDataDao", "Data entity cannot be null", new Object[0]);
            return -1L;
        }
        this.b.lock();
        try {
            long jInsert = this.a.insert("client_data", null, a(clientDataEntity));
            if (jInsert > 0) {
                clientDataEntity.setId(jInsert);
            }
            return jInsert;
        } catch (SQLException e2) {
            TrackLogger.d("DRS_SDK_COMMON_ClientDataDao", "Failed to insert data", e2, new Object[0]);
            return -1L;
        } finally {
            this.b.unlock();
        }
    }

    public int m(List<Long> list) {
        if (list == null || list.isEmpty()) {
            TrackLogger.e("DRS_SDK_COMMON_ClientDataDao", "IDs list is null or empty", new Object[0]);
            return 0;
        }
        this.b.lock();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("status", (Integer) 0);
            contentValues.put("update_time", Long.valueOf(System.currentTimeMillis()));
            return this.a.update("client_data", contentValues, c("_id", list.size()), b(list));
        } catch (SQLException e2) {
            TrackLogger.d("DRS_SDK_COMMON_ClientDataDao", "Failed to mark as pending", e2, new Object[0]);
            return 0;
        } finally {
            this.b.unlock();
        }
    }

    public int n(List<Long> list) {
        if (list == null || list.isEmpty()) {
            TrackLogger.e("DRS_SDK_COMMON_ClientDataDao", "IDs list is null or empty", new Object[0]);
            return 0;
        }
        this.b.lock();
        try {
            TrackLogger.h("DRS_SDK_COMMON_ClientDataDao", "mark as uploading size: %s", Integer.valueOf(list.size()));
            ContentValues contentValues = new ContentValues();
            contentValues.put("status", (Integer) 1);
            contentValues.put("update_time", Long.valueOf(System.currentTimeMillis()));
            return this.a.update("client_data", contentValues, c("_id", list.size()), b(list));
        } catch (SQLException e2) {
            TrackLogger.d("DRS_SDK_COMMON_ClientDataDao", "Failed to mark as uploading", e2, new Object[0]);
            return 0;
        } finally {
            this.b.unlock();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0042  */
    public final int o(String str, String[] strArr) {
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = this.a.query("client_data", new String[]{"COUNT(*) AS cnt"}, str, strArr, null, null, null);
                if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return 0;
                }
                int i = cursorQuery.getInt(0);
                cursorQuery.close();
                return i;
            } catch (SQLException e2) {
                TrackLogger.d("DRS_SDK_COMMON_ClientDataDao", "Query data count failed, selection=%s", e2, str);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return 0;
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        throw th;
    }

    public final List<ClientDataEntity> p(String str, String[] strArr, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = this.a.query("client_data", null, str, strArr, null, null, str2, str3);
                while (cursorQuery != null && cursorQuery.moveToNext()) {
                    arrayList.add(g(cursorQuery));
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return arrayList;
            } catch (SQLException e2) {
                TrackLogger.d("DRS_SDK_COMMON_ClientDataDao", "Query entities failed, selection=%s", e2, str);
                List<ClientDataEntity> listEmptyList = Collections.emptyList();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return listEmptyList;
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public List<ClientDataEntity> q(long j2) {
        this.b.lock();
        try {
            return p("create_time < " + j2, null, "create_time ASC", null);
        } finally {
            this.b.unlock();
        }
    }

    public int r() {
        this.b.lock();
        int iUpdate = 0;
        try {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("status", (Integer) 0);
                contentValues.put("update_time", Long.valueOf(System.currentTimeMillis()));
                iUpdate = this.a.update("client_data", contentValues, "status=?", new String[]{String.valueOf(1)});
            } catch (SQLException e2) {
                TrackLogger.d("DRS_SDK_COMMON_ClientDataDao", "Failed to reset uploading status", e2, new Object[0]);
            }
            return iUpdate;
        } finally {
            this.b.unlock();
        }
    }
}
