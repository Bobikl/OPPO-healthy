package com.heytap.accessory.base.database;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public final class g implements f {
    public final RoomDatabase a;
    public final EntityInsertionAdapter<h> b;
    public final EntityDeletionOrUpdateAdapter<h> c;

    public class a extends EntityInsertionAdapter<h> {
        public a(g gVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, h hVar) {
            supportSQLiteStatement.bindLong(1, hVar.c());
            supportSQLiteStatement.bindLong(2, hVar.e());
            if (hVar.d() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, hVar.d());
            }
            supportSQLiteStatement.bindLong(4, hVar.f());
            if (hVar.b() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, hVar.b());
            }
            supportSQLiteStatement.bindLong(6, hVar.a());
        }

        public String createQuery() {
            return "INSERT OR REPLACE INTO `Device` (`_id`,`transportId`,`transportAddress`,`uuidType`,`deviceName`,`checkSum`) VALUES (nullif(?, 0),?,?,?,?,?)";
        }
    }

    public class b extends EntityDeletionOrUpdateAdapter<h> {
        public b(g gVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, h hVar) {
            supportSQLiteStatement.bindLong(1, hVar.c());
            supportSQLiteStatement.bindLong(2, hVar.e());
            if (hVar.d() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, hVar.d());
            }
            supportSQLiteStatement.bindLong(4, hVar.f());
            if (hVar.b() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, hVar.b());
            }
            supportSQLiteStatement.bindLong(6, hVar.a());
            supportSQLiteStatement.bindLong(7, hVar.c());
        }

        public String createQuery() {
            return "UPDATE OR ABORT `Device` SET `_id` = ?,`transportId` = ?,`transportAddress` = ?,`uuidType` = ?,`deviceName` = ?,`checkSum` = ? WHERE `_id` = ?";
        }
    }

    public g(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(this, roomDatabase);
        this.c = new b(this, roomDatabase);
    }

    @Override // com.heytap.accessory.base.database.f
    public long a(h hVar) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            long jInsertAndReturnId = this.b.insertAndReturnId(hVar);
            this.a.setTransactionSuccessful();
            return jInsertAndReturnId;
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.heytap.accessory.base.database.f
    public int b(h hVar) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            int iHandle = this.c.handle(hVar) + 0;
            this.a.setTransactionSuccessful();
            return iHandle;
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.heytap.accessory.base.database.f
    public List<h> a(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM Device WHERE transportAddress = (?)", 1);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, (CancellationSignal) null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "_id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "transportId");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "transportAddress");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "uuidType");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceName");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "checkSum");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                h hVar = new h();
                hVar.b(cursorQuery.getInt(columnIndexOrThrow));
                hVar.c(cursorQuery.getInt(columnIndexOrThrow2));
                hVar.b(cursorQuery.getString(columnIndexOrThrow3));
                hVar.d(cursorQuery.getInt(columnIndexOrThrow4));
                hVar.a(cursorQuery.getString(columnIndexOrThrow5));
                hVar.a(cursorQuery.getInt(columnIndexOrThrow6));
                arrayList.add(hVar);
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

    @Override // com.heytap.accessory.base.database.f
    public List<h> a(String str, int i, int i2) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM Device WHERE transportAddress = (?) and transportId=(?) and uuidType=(?)", 3);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        roomSQLiteQueryAcquire.bindLong(2, i);
        roomSQLiteQueryAcquire.bindLong(3, i2);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, (CancellationSignal) null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "_id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "transportId");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "transportAddress");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "uuidType");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceName");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "checkSum");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                h hVar = new h();
                hVar.b(cursorQuery.getInt(columnIndexOrThrow));
                hVar.c(cursorQuery.getInt(columnIndexOrThrow2));
                hVar.b(cursorQuery.getString(columnIndexOrThrow3));
                hVar.d(cursorQuery.getInt(columnIndexOrThrow4));
                hVar.a(cursorQuery.getString(columnIndexOrThrow5));
                hVar.a(cursorQuery.getInt(columnIndexOrThrow6));
                arrayList.add(hVar);
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
}
