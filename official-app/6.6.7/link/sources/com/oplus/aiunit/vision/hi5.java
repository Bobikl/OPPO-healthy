package com.oplus.aiunit.vision;

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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public final class hi5 implements fi5 {
    public final RoomDatabase a;
    public final EntityInsertionAdapter<qj5> b;
    public final EntityDeletionOrUpdateAdapter<qj5> c;
    public final EntityDeletionOrUpdateAdapter<qj5> d;
    public final SharedSQLiteStatement e;

    public class a extends EntityInsertionAdapter<qj5> {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, qj5 qj5Var) {
            supportSQLiteStatement.bindLong(1, qj5Var.b());
            if (qj5Var.e() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, qj5Var.e());
            }
            supportSQLiteStatement.bindLong(3, qj5Var.f());
            if (qj5Var.c() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, qj5Var.c());
            }
            supportSQLiteStatement.bindLong(5, qj5Var.d());
            if (qj5Var.g() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, qj5Var.g());
            }
            supportSQLiteStatement.bindLong(7, qj5Var.h());
            if (qj5Var.a() == null) {
                supportSQLiteStatement.bindNull(8);
            } else {
                supportSQLiteStatement.bindString(8, qj5Var.a());
            }
        }

        public String createQuery() {
            return "INSERT OR REPLACE INTO `device_info` (`_id`,`node_id`,`product_type`,`main_mac`,`main_type`,`stub_mac`,`stub_type`,`encrypt_key`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
        }
    }

    public class b extends EntityDeletionOrUpdateAdapter<qj5> {
        public b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, qj5 qj5Var) {
            supportSQLiteStatement.bindLong(1, qj5Var.b());
        }

        public String createQuery() {
            return "DELETE FROM `device_info` WHERE `_id` = ?";
        }
    }

    public class c extends EntityDeletionOrUpdateAdapter<qj5> {
        public c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, qj5 qj5Var) {
            supportSQLiteStatement.bindLong(1, qj5Var.b());
            if (qj5Var.e() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, qj5Var.e());
            }
            supportSQLiteStatement.bindLong(3, qj5Var.f());
            if (qj5Var.c() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, qj5Var.c());
            }
            supportSQLiteStatement.bindLong(5, qj5Var.d());
            if (qj5Var.g() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, qj5Var.g());
            }
            supportSQLiteStatement.bindLong(7, qj5Var.h());
            if (qj5Var.a() == null) {
                supportSQLiteStatement.bindNull(8);
            } else {
                supportSQLiteStatement.bindString(8, qj5Var.a());
            }
            supportSQLiteStatement.bindLong(9, qj5Var.b());
        }

        public String createQuery() {
            return "UPDATE OR ABORT `device_info` SET `_id` = ?,`node_id` = ?,`product_type` = ?,`main_mac` = ?,`main_type` = ?,`stub_mac` = ?,`stub_type` = ?,`encrypt_key` = ? WHERE `_id` = ?";
        }
    }

    public class d extends SharedSQLiteStatement {
        public d(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String createQuery() {
            return "DELETE FROM device_info WHERE NODE_ID=?";
        }
    }

    public hi5(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(roomDatabase);
        this.c = new b(roomDatabase);
        this.d = new c(roomDatabase);
        this.e = new d(roomDatabase);
    }

    public static List<Class<?>> a() {
        return Collections.emptyList();
    }

    @Override // com.oplus.aiunit.vision.fi5
    public List<qj5> b() {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM device_info", 0);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, (CancellationSignal) null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "_id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "node_id");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "product_type");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "main_mac");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "main_type");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "stub_mac");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "stub_type");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "encrypt_key");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                qj5 qj5Var = new qj5();
                qj5Var.j(cursorQuery.getInt(columnIndexOrThrow));
                qj5Var.m(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                qj5Var.n(cursorQuery.getInt(columnIndexOrThrow3));
                qj5Var.k(cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4));
                qj5Var.l(cursorQuery.getInt(columnIndexOrThrow5));
                qj5Var.o(cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6));
                qj5Var.p(cursorQuery.getInt(columnIndexOrThrow7));
                qj5Var.i(cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8));
                arrayList.add(qj5Var);
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.oplus.aiunit.vision.fi5
    public long c(qj5 qj5Var) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            long jInsertAndReturnId = this.b.insertAndReturnId(qj5Var);
            this.a.setTransactionSuccessful();
            return jInsertAndReturnId;
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.oplus.aiunit.vision.fi5
    public qj5 d(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM device_info WHERE NODE_ID=?", 1);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        this.a.assertNotSuspendingTransaction();
        qj5 qj5Var = null;
        String string = null;
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, (CancellationSignal) null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "_id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "node_id");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "product_type");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "main_mac");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "main_type");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "stub_mac");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "stub_type");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "encrypt_key");
            if (cursorQuery.moveToFirst()) {
                qj5 qj5Var2 = new qj5();
                qj5Var2.j(cursorQuery.getInt(columnIndexOrThrow));
                qj5Var2.m(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                qj5Var2.n(cursorQuery.getInt(columnIndexOrThrow3));
                qj5Var2.k(cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4));
                qj5Var2.l(cursorQuery.getInt(columnIndexOrThrow5));
                qj5Var2.o(cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6));
                qj5Var2.p(cursorQuery.getInt(columnIndexOrThrow7));
                if (!cursorQuery.isNull(columnIndexOrThrow8)) {
                    string = cursorQuery.getString(columnIndexOrThrow8);
                }
                qj5Var2.i(string);
                qj5Var = qj5Var2;
            }
            return qj5Var;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.oplus.aiunit.vision.fi5
    public int delete(String str) {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.e.acquire();
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
            this.e.release(supportSQLiteStatementAcquire);
        }
    }
}
