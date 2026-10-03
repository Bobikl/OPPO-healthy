package com.heytap.accessory.pair.common.db;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.heytap.accessory.constant.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public final class KscDao_Impl implements KscDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<EncryptedKscInfo> __insertionAdapterOfEncryptedKscInfo;
    private final SharedSQLiteStatement __preparedStmtOfDelete;
    private final EntityDeletionOrUpdateAdapter<EncryptedKscInfo> __updateAdapterOfEncryptedKscInfo;

    public KscDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfEncryptedKscInfo = new EntityInsertionAdapter<EncryptedKscInfo>(roomDatabase) { // from class: com.heytap.accessory.pair.common.db.KscDao_Impl.1
            public String createQuery() {
                return "INSERT OR REPLACE INTO `ksc_info` (`deviceId`,`alias`,`autoId`,`ksc`,`iv`,`date`) VALUES (?,?,nullif(?, 0),?,?,?)";
            }

            public void bind(SupportSQLiteStatement supportSQLiteStatement, EncryptedKscInfo encryptedKscInfo) {
                String str = encryptedKscInfo.deviceId;
                if (str == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, str);
                }
                String str2 = encryptedKscInfo.alias;
                if (str2 == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, str2);
                }
                supportSQLiteStatement.bindLong(3, encryptedKscInfo.autoId);
                String str3 = encryptedKscInfo.encryptedKsc;
                if (str3 == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, str3);
                }
                String str4 = encryptedKscInfo.iv;
                if (str4 == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindString(5, str4);
                }
                supportSQLiteStatement.bindLong(6, encryptedKscInfo.date);
            }
        };
        this.__updateAdapterOfEncryptedKscInfo = new EntityDeletionOrUpdateAdapter<EncryptedKscInfo>(roomDatabase) { // from class: com.heytap.accessory.pair.common.db.KscDao_Impl.2
            public String createQuery() {
                return "UPDATE OR ABORT `ksc_info` SET `deviceId` = ?,`alias` = ?,`autoId` = ?,`ksc` = ?,`iv` = ?,`date` = ? WHERE `autoId` = ?";
            }

            public void bind(SupportSQLiteStatement supportSQLiteStatement, EncryptedKscInfo encryptedKscInfo) {
                String str = encryptedKscInfo.deviceId;
                if (str == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, str);
                }
                String str2 = encryptedKscInfo.alias;
                if (str2 == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, str2);
                }
                supportSQLiteStatement.bindLong(3, encryptedKscInfo.autoId);
                String str3 = encryptedKscInfo.encryptedKsc;
                if (str3 == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, str3);
                }
                String str4 = encryptedKscInfo.iv;
                if (str4 == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindString(5, str4);
                }
                supportSQLiteStatement.bindLong(6, encryptedKscInfo.date);
                supportSQLiteStatement.bindLong(7, encryptedKscInfo.autoId);
            }
        };
        this.__preparedStmtOfDelete = new SharedSQLiteStatement(roomDatabase) { // from class: com.heytap.accessory.pair.common.db.KscDao_Impl.3
            public String createQuery() {
                return "DELETE FROM ksc_info WHERE deviceId = ? AND alias = ?";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.heytap.accessory.pair.common.db.KscDao
    public void delete(String str, String str2) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.__preparedStmtOfDelete.acquire();
        if (str == null) {
            supportSQLiteStatementAcquire.bindNull(1);
        } else {
            supportSQLiteStatementAcquire.bindString(1, str);
        }
        if (str2 == null) {
            supportSQLiteStatementAcquire.bindNull(2);
        } else {
            supportSQLiteStatementAcquire.bindString(2, str2);
        }
        this.__db.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDelete.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.heytap.accessory.pair.common.db.KscDao
    public List<EncryptedKscInfo> getAllKscInfos() {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM ksc_info ORDER BY date", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, (CancellationSignal) null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constants.EXTRA_DEVICE_ID);
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "alias");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "autoId");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "ksc");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "iv");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "date");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                EncryptedKscInfo encryptedKscInfo = new EncryptedKscInfo();
                if (cursorQuery.isNull(columnIndexOrThrow)) {
                    encryptedKscInfo.deviceId = null;
                } else {
                    encryptedKscInfo.deviceId = cursorQuery.getString(columnIndexOrThrow);
                }
                if (cursorQuery.isNull(columnIndexOrThrow2)) {
                    encryptedKscInfo.alias = null;
                } else {
                    encryptedKscInfo.alias = cursorQuery.getString(columnIndexOrThrow2);
                }
                encryptedKscInfo.autoId = cursorQuery.getInt(columnIndexOrThrow3);
                if (cursorQuery.isNull(columnIndexOrThrow4)) {
                    encryptedKscInfo.encryptedKsc = null;
                } else {
                    encryptedKscInfo.encryptedKsc = cursorQuery.getString(columnIndexOrThrow4);
                }
                if (cursorQuery.isNull(columnIndexOrThrow5)) {
                    encryptedKscInfo.iv = null;
                } else {
                    encryptedKscInfo.iv = cursorQuery.getString(columnIndexOrThrow5);
                }
                encryptedKscInfo.date = cursorQuery.getLong(columnIndexOrThrow6);
                arrayList.add(encryptedKscInfo);
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.heytap.accessory.pair.common.db.KscDao
    public List<EncryptedKscInfo> getKscInfo(String str, String str2) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM ksc_info WHERE deviceId = ? AND alias = ?", 2);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        if (str2 == null) {
            roomSQLiteQueryAcquire.bindNull(2);
        } else {
            roomSQLiteQueryAcquire.bindString(2, str2);
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, (CancellationSignal) null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constants.EXTRA_DEVICE_ID);
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "alias");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "autoId");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "ksc");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "iv");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "date");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                EncryptedKscInfo encryptedKscInfo = new EncryptedKscInfo();
                if (cursorQuery.isNull(columnIndexOrThrow)) {
                    encryptedKscInfo.deviceId = null;
                } else {
                    encryptedKscInfo.deviceId = cursorQuery.getString(columnIndexOrThrow);
                }
                if (cursorQuery.isNull(columnIndexOrThrow2)) {
                    encryptedKscInfo.alias = null;
                } else {
                    encryptedKscInfo.alias = cursorQuery.getString(columnIndexOrThrow2);
                }
                encryptedKscInfo.autoId = cursorQuery.getInt(columnIndexOrThrow3);
                if (cursorQuery.isNull(columnIndexOrThrow4)) {
                    encryptedKscInfo.encryptedKsc = null;
                } else {
                    encryptedKscInfo.encryptedKsc = cursorQuery.getString(columnIndexOrThrow4);
                }
                if (cursorQuery.isNull(columnIndexOrThrow5)) {
                    encryptedKscInfo.iv = null;
                } else {
                    encryptedKscInfo.iv = cursorQuery.getString(columnIndexOrThrow5);
                }
                encryptedKscInfo.date = cursorQuery.getLong(columnIndexOrThrow6);
                arrayList.add(encryptedKscInfo);
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.heytap.accessory.pair.common.db.KscDao
    public void insert(EncryptedKscInfo encryptedKscInfo) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfEncryptedKscInfo.insert(encryptedKscInfo);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.heytap.accessory.pair.common.db.KscDao
    public void update(EncryptedKscInfo encryptedKscInfo) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__updateAdapterOfEncryptedKscInfo.handle(encryptedKscInfo);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.heytap.accessory.pair.common.db.KscDao
    public List<EncryptedKscInfo> getKscInfo(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM ksc_info WHERE deviceId = ?", 1);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, (CancellationSignal) null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constants.EXTRA_DEVICE_ID);
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "alias");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "autoId");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "ksc");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "iv");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "date");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                EncryptedKscInfo encryptedKscInfo = new EncryptedKscInfo();
                if (cursorQuery.isNull(columnIndexOrThrow)) {
                    encryptedKscInfo.deviceId = null;
                } else {
                    encryptedKscInfo.deviceId = cursorQuery.getString(columnIndexOrThrow);
                }
                if (cursorQuery.isNull(columnIndexOrThrow2)) {
                    encryptedKscInfo.alias = null;
                } else {
                    encryptedKscInfo.alias = cursorQuery.getString(columnIndexOrThrow2);
                }
                encryptedKscInfo.autoId = cursorQuery.getInt(columnIndexOrThrow3);
                if (cursorQuery.isNull(columnIndexOrThrow4)) {
                    encryptedKscInfo.encryptedKsc = null;
                } else {
                    encryptedKscInfo.encryptedKsc = cursorQuery.getString(columnIndexOrThrow4);
                }
                if (cursorQuery.isNull(columnIndexOrThrow5)) {
                    encryptedKscInfo.iv = null;
                } else {
                    encryptedKscInfo.iv = cursorQuery.getString(columnIndexOrThrow5);
                }
                encryptedKscInfo.date = cursorQuery.getLong(columnIndexOrThrow6);
                arrayList.add(encryptedKscInfo);
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }
}
