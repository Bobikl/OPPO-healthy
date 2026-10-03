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
public final class p implements o {
    public final RoomDatabase a;
    public final EntityInsertionAdapter<q> b;
    public final SharedSQLiteStatement c;
    public final SharedSQLiteStatement d;
    public final SharedSQLiteStatement e;
    public final SharedSQLiteStatement f;
    public final SharedSQLiteStatement g;

    public class a extends EntityInsertionAdapter<q> {
        public a(p pVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, q qVar) {
            supportSQLiteStatement.bindLong(1, qVar.i());
            supportSQLiteStatement.bindLong(2, qVar.h());
            if (qVar.d() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, qVar.d());
            }
            if (qVar.c() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, qVar.c());
            }
            if (qVar.m() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, qVar.m());
            }
            if (qVar.b() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, qVar.b());
            }
            supportSQLiteStatement.bindLong(7, qVar.a());
            supportSQLiteStatement.bindLong(8, qVar.n());
            supportSQLiteStatement.bindLong(9, qVar.r());
            supportSQLiteStatement.bindLong(10, qVar.j());
            supportSQLiteStatement.bindLong(11, qVar.q());
            if (qVar.k() == null) {
                supportSQLiteStatement.bindNull(12);
            } else {
                supportSQLiteStatement.bindString(12, qVar.k());
            }
            if (qVar.e() == null) {
                supportSQLiteStatement.bindNull(13);
            } else {
                supportSQLiteStatement.bindString(13, qVar.e());
            }
            supportSQLiteStatement.bindLong(14, qVar.l());
            supportSQLiteStatement.bindLong(15, qVar.p());
            supportSQLiteStatement.bindLong(16, qVar.g());
            supportSQLiteStatement.bindLong(17, qVar.o());
            supportSQLiteStatement.bindLong(18, qVar.f());
        }

        public String createQuery() {
            return "INSERT OR REPLACE INTO `ServiceDescription` (`_id`,`deviceId`,`appName`,`appHash`,`profileId`,`agentImplClass`,`agentId`,`role`,`transportId`,`mexSupport`,`socketSupport`,`persistence`,`aspVer`,`privilegeLevel`,`serviceLimitId`,`connectionTimeOut`,`sdkVersionCode`,`awakenable`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public class b extends EntityDeletionOrUpdateAdapter<q> {
        public b(p pVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, q qVar) {
            supportSQLiteStatement.bindLong(1, qVar.i());
            supportSQLiteStatement.bindLong(2, qVar.h());
            if (qVar.d() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, qVar.d());
            }
            if (qVar.c() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, qVar.c());
            }
            if (qVar.m() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, qVar.m());
            }
            if (qVar.b() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, qVar.b());
            }
            supportSQLiteStatement.bindLong(7, qVar.a());
            supportSQLiteStatement.bindLong(8, qVar.n());
            supportSQLiteStatement.bindLong(9, qVar.r());
            supportSQLiteStatement.bindLong(10, qVar.j());
            supportSQLiteStatement.bindLong(11, qVar.q());
            if (qVar.k() == null) {
                supportSQLiteStatement.bindNull(12);
            } else {
                supportSQLiteStatement.bindString(12, qVar.k());
            }
            if (qVar.e() == null) {
                supportSQLiteStatement.bindNull(13);
            } else {
                supportSQLiteStatement.bindString(13, qVar.e());
            }
            supportSQLiteStatement.bindLong(14, qVar.l());
            supportSQLiteStatement.bindLong(15, qVar.p());
            supportSQLiteStatement.bindLong(16, qVar.g());
            supportSQLiteStatement.bindLong(17, qVar.o());
            supportSQLiteStatement.bindLong(18, qVar.f());
            supportSQLiteStatement.bindLong(19, qVar.i());
        }

        public String createQuery() {
            return "UPDATE OR ABORT `ServiceDescription` SET `_id` = ?,`deviceId` = ?,`appName` = ?,`appHash` = ?,`profileId` = ?,`agentImplClass` = ?,`agentId` = ?,`role` = ?,`transportId` = ?,`mexSupport` = ?,`socketSupport` = ?,`persistence` = ?,`aspVer` = ?,`privilegeLevel` = ?,`serviceLimitId` = ?,`connectionTimeOut` = ?,`sdkVersionCode` = ?,`awakenable` = ? WHERE `_id` = ?";
        }
    }

    public class c extends SharedSQLiteStatement {
        public c(p pVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String createQuery() {
            return "DELETE FROM ServiceDescription WHERE agentId = ?";
        }
    }

    public class d extends SharedSQLiteStatement {
        public d(p pVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String createQuery() {
            return "DELETE FROM ServiceDescription WHERE agentId = ? AND profileId = ? AND deviceId = ? AND appName = ? AND role = ?";
        }
    }

    public class e extends SharedSQLiteStatement {
        public e(p pVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String createQuery() {
            return "UPDATE ServiceDescription SET sdkVersionCode = ? WHERE appName = ? AND agentImplClass = ?";
        }
    }

    public class f extends SharedSQLiteStatement {
        public f(p pVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String createQuery() {
            return "DELETE FROM ServiceDescription WHERE agentId = ? AND deviceId = ?";
        }
    }

    public class g extends SharedSQLiteStatement {
        public g(p pVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String createQuery() {
            return "DELETE FROM ServiceDescription WHERE deviceId = ?";
        }
    }

    public p(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(this, roomDatabase);
        new b(this, roomDatabase);
        this.c = new c(this, roomDatabase);
        this.d = new d(this, roomDatabase);
        this.e = new e(this, roomDatabase);
        this.f = new f(this, roomDatabase);
        this.g = new g(this, roomDatabase);
    }

    @Override // com.heytap.accessory.base.database.o
    public long a(q qVar) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            long jInsertAndReturnId = this.b.insertAndReturnId(qVar);
            this.a.setTransactionSuccessful();
            return jInsertAndReturnId;
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.heytap.accessory.base.database.o
    public int b(int i) {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.g.acquire();
        supportSQLiteStatementAcquire.bindLong(1, i);
        this.a.beginTransaction();
        try {
            int iExecuteUpdateDelete = supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
            return iExecuteUpdateDelete;
        } finally {
            this.a.endTransaction();
            this.g.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.heytap.accessory.base.database.o
    public int a(long j) {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.c.acquire();
        supportSQLiteStatementAcquire.bindLong(1, j);
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

    @Override // com.heytap.accessory.base.database.o
    public List<Integer> b(String str, long j, String str2, int i) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT _id FROM ServiceDescription WHERE profileId = ? AND deviceId = ? AND appName = ? AND role = ?", 4);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        roomSQLiteQueryAcquire.bindLong(2, j);
        if (str2 == null) {
            roomSQLiteQueryAcquire.bindNull(3);
        } else {
            roomSQLiteQueryAcquire.bindString(3, str2);
        }
        roomSQLiteQueryAcquire.bindLong(4, i);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(cursorQuery.isNull(0) ? null : Integer.valueOf(cursorQuery.getInt(0)));
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.heytap.accessory.base.database.o
    public int a(String str, String str2, long j, String str3, int i) {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.d.acquire();
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
        supportSQLiteStatementAcquire.bindLong(3, j);
        if (str3 == null) {
            supportSQLiteStatementAcquire.bindNull(4);
        } else {
            supportSQLiteStatementAcquire.bindString(4, str3);
        }
        supportSQLiteStatementAcquire.bindLong(5, i);
        this.a.beginTransaction();
        try {
            int iExecuteUpdateDelete = supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
            return iExecuteUpdateDelete;
        } finally {
            this.a.endTransaction();
            this.d.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.heytap.accessory.base.database.o
    public void a(int i, String str, String str2) {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.e.acquire();
        supportSQLiteStatementAcquire.bindLong(1, i);
        if (str == null) {
            supportSQLiteStatementAcquire.bindNull(2);
        } else {
            supportSQLiteStatementAcquire.bindString(2, str);
        }
        if (str2 == null) {
            supportSQLiteStatementAcquire.bindNull(3);
        } else {
            supportSQLiteStatementAcquire.bindString(3, str2);
        }
        this.a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.e.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.heytap.accessory.base.database.o
    public int a(int i, String str) {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.f.acquire();
        if (str == null) {
            supportSQLiteStatementAcquire.bindNull(1);
        } else {
            supportSQLiteStatementAcquire.bindString(1, str);
        }
        supportSQLiteStatementAcquire.bindLong(2, i);
        this.a.beginTransaction();
        try {
            int iExecuteUpdateDelete = supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
            return iExecuteUpdateDelete;
        } finally {
            this.a.endTransaction();
            this.f.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.heytap.accessory.base.database.o
    public List<q> a(int i) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM ServiceDescription WHERE deviceId = ?", 1);
        roomSQLiteQueryAcquire.bindLong(1, i);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, (CancellationSignal) null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "_id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constants.EXTRA_DEVICE_ID);
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "appName");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "appHash");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "profileId");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "agentImplClass");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "agentId");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "role");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "transportId");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "mexSupport");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "socketSupport");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "persistence");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "aspVer");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "privilegeLevel");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "serviceLimitId");
                int i2 = columnIndexOrThrow;
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "connectionTimeOut");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sdkVersionCode");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "awakenable");
                int i3 = columnIndexOrThrow15;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    long j = cursorQuery.getLong(columnIndexOrThrow2);
                    String string = cursorQuery.getString(columnIndexOrThrow3);
                    String string2 = cursorQuery.getString(columnIndexOrThrow4);
                    String string3 = cursorQuery.getString(columnIndexOrThrow5);
                    String string4 = cursorQuery.getString(columnIndexOrThrow6);
                    long j2 = cursorQuery.getLong(columnIndexOrThrow7);
                    int i4 = cursorQuery.getInt(columnIndexOrThrow8);
                    int i5 = cursorQuery.getInt(columnIndexOrThrow9);
                    int i6 = cursorQuery.getInt(columnIndexOrThrow10);
                    int i7 = cursorQuery.getInt(columnIndexOrThrow11);
                    String string5 = cursorQuery.getString(columnIndexOrThrow12);
                    String string6 = cursorQuery.getString(columnIndexOrThrow13);
                    int i8 = cursorQuery.getInt(columnIndexOrThrow14);
                    int i9 = i3;
                    int i10 = cursorQuery.getInt(i9);
                    i3 = i9;
                    int i11 = columnIndexOrThrow16;
                    int i12 = cursorQuery.getInt(i11);
                    columnIndexOrThrow16 = i11;
                    int i13 = columnIndexOrThrow17;
                    int i14 = cursorQuery.getInt(i13);
                    columnIndexOrThrow17 = i13;
                    int i15 = columnIndexOrThrow18;
                    columnIndexOrThrow18 = i15;
                    q qVar = new q(string3, i5, string, string2, j, string6, string5, i8, i4, i6, i7, j2, i10, i12, string4, i14, cursorQuery.getInt(i15));
                    int i16 = columnIndexOrThrow2;
                    int i17 = i2;
                    int i18 = columnIndexOrThrow3;
                    qVar.a(cursorQuery.getInt(i17));
                    arrayList.add(qVar);
                    columnIndexOrThrow3 = i18;
                    i2 = i17;
                    columnIndexOrThrow2 = i16;
                }
                cursorQuery.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorQuery.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryAcquire;
        }
    }

    @Override // com.heytap.accessory.base.database.o
    public List<Long> a(String str, long j, String str2, int i) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT agentId FROM ServiceDescription WHERE profileId = ? AND deviceId = ? AND appName = ? AND role = ?", 4);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        roomSQLiteQueryAcquire.bindLong(2, j);
        if (str2 == null) {
            roomSQLiteQueryAcquire.bindNull(3);
        } else {
            roomSQLiteQueryAcquire.bindString(3, str2);
        }
        roomSQLiteQueryAcquire.bindLong(4, i);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(cursorQuery.isNull(0) ? null : Long.valueOf(cursorQuery.getLong(0)));
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.heytap.accessory.base.database.o
    public List<String> a(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT appName FROM ServiceDescription WHERE agentId = ?", 1);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(cursorQuery.getString(0));
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

    @Override // com.heytap.accessory.base.database.o
    public List<Long> a() {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT agentId FROM ServiceDescription", 0);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(cursorQuery.isNull(0) ? null : Long.valueOf(cursorQuery.getLong(0)));
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }
}
