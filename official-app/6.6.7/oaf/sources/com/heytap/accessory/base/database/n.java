package com.heytap.accessory.base.database;

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
import java.util.List;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public final class n implements m {
    public final RoomDatabase a;
    public final EntityInsertionAdapter<k> b;
    public final SharedSQLiteStatement c;

    public class a extends EntityInsertionAdapter<k> {
        public a(n nVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, k kVar) {
            String str = kVar.a;
            if (str == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, str);
            }
            String str2 = kVar.b;
            if (str2 == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, str2);
            }
            supportSQLiteStatement.bindLong(3, kVar.c);
            String str3 = kVar.d;
            if (str3 == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, str3);
            }
            String str4 = kVar.e;
            if (str4 == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, str4);
            }
            supportSQLiteStatement.bindLong(6, kVar.f);
        }

        public String createQuery() {
            return "INSERT OR REPLACE INTO `ksc_info` (`deviceId`,`alias`,`autoId`,`ksc`,`iv`,`date`) VALUES (?,?,nullif(?, 0),?,?,?)";
        }
    }

    public class b extends EntityDeletionOrUpdateAdapter<k> {
        public b(n nVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, k kVar) {
            String str = kVar.a;
            if (str == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, str);
            }
            String str2 = kVar.b;
            if (str2 == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, str2);
            }
            supportSQLiteStatement.bindLong(3, kVar.c);
            String str3 = kVar.d;
            if (str3 == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, str3);
            }
            String str4 = kVar.e;
            if (str4 == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, str4);
            }
            supportSQLiteStatement.bindLong(6, kVar.f);
            supportSQLiteStatement.bindLong(7, kVar.c);
        }

        public String createQuery() {
            return "UPDATE OR ABORT `ksc_info` SET `deviceId` = ?,`alias` = ?,`autoId` = ?,`ksc` = ?,`iv` = ?,`date` = ? WHERE `autoId` = ?";
        }
    }

    public class c extends SharedSQLiteStatement {
        public c(n nVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String createQuery() {
            return "DELETE FROM ksc_info WHERE deviceId = ? AND alias = ?";
        }
    }

    public n(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(this, roomDatabase);
        new b(this, roomDatabase);
        this.c = new c(this, roomDatabase);
    }

    @Override // com.heytap.accessory.base.database.m
    public void a(k kVar) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert(kVar);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.heytap.accessory.base.database.m
    public List<k> b(String str, String str2) {
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
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, (CancellationSignal) null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constants.EXTRA_DEVICE_ID);
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "alias");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "autoId");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "ksc");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "iv");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "date");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                k kVar = new k();
                kVar.a = cursorQuery.getString(columnIndexOrThrow);
                kVar.b = cursorQuery.getString(columnIndexOrThrow2);
                kVar.c = cursorQuery.getInt(columnIndexOrThrow3);
                kVar.d = cursorQuery.getString(columnIndexOrThrow4);
                kVar.e = cursorQuery.getString(columnIndexOrThrow5);
                kVar.f = cursorQuery.getLong(columnIndexOrThrow6);
                arrayList.add(kVar);
            }
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
            return arrayList;
        } catch (Throwable th) {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
            throw th;
        }
    }

    @Override // com.heytap.accessory.base.database.m
    public void a(String str, String str2) {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.c.acquire();
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
        this.a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.c.release(supportSQLiteStatementAcquire);
        }
    }
}
