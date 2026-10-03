package com.heytap.accessory.base.database;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public final class c implements com.heytap.accessory.base.database.b {
    public final RoomDatabase a;
    public final EntityInsertionAdapter<d> b;
    public final SharedSQLiteStatement c;

    public class a extends EntityInsertionAdapter<d> {
        public a(c cVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, d dVar) {
            supportSQLiteStatement.bindLong(1, dVar.e());
            supportSQLiteStatement.bindLong(2, dVar.b());
            supportSQLiteStatement.bindLong(3, dVar.c());
            supportSQLiteStatement.bindLong(4, dVar.f());
            supportSQLiteStatement.bindLong(5, dVar.d());
            supportSQLiteStatement.bindLong(6, dVar.a());
        }

        public String createQuery() {
            return "INSERT OR IGNORE INTO `ChannelDescription` (`_id`,`channelId`,`class`,`priority`,`dataType`,`agentId`) VALUES (nullif(?, 0),?,?,?,?,?)";
        }
    }

    public class b extends SharedSQLiteStatement {
        public b(c cVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String createQuery() {
            return "DELETE FROM ChannelDescription WHERE agentId = ?";
        }
    }

    public c(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(this, roomDatabase);
        this.c = new b(this, roomDatabase);
    }

    @Override // com.heytap.accessory.base.database.b
    public List<Long> a(List<d> list) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            List<Long> listInsertAndReturnIdsList = this.b.insertAndReturnIdsList(list);
            this.a.setTransactionSuccessful();
            return listInsertAndReturnIdsList;
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.heytap.accessory.base.database.b
    public int a(String str) {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.c.acquire();
        if (str == null) {
            supportSQLiteStatementAcquire.bindNull(1);
        } else {
            supportSQLiteStatementAcquire.bindString(1, str);
        }
        this.a.beginTransaction();
        try {
            int iExecuteUpdateDelete = supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
            return iExecuteUpdateDelete;
        } finally {
            this.a.endTransaction();
            this.c.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.heytap.accessory.base.database.b
    public List<d> a(long j) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM ChannelDescription WHERE agentId = ?", 1);
        roomSQLiteQueryAcquire.bindLong(1, j);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, (CancellationSignal) null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "_id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "channelId");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "class");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "priority");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "dataType");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "agentId");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                d dVar = new d();
                dVar.d(cursorQuery.getInt(columnIndexOrThrow));
                dVar.a(cursorQuery.getInt(columnIndexOrThrow2));
                dVar.b(cursorQuery.getInt(columnIndexOrThrow3));
                dVar.e(cursorQuery.getInt(columnIndexOrThrow4));
                dVar.c(cursorQuery.getInt(columnIndexOrThrow5));
                dVar.a(cursorQuery.getLong(columnIndexOrThrow6));
                arrayList.add(dVar);
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
