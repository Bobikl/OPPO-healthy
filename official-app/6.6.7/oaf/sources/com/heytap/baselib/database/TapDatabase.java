package com.heytap.baselib.database;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.os.Looper;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory;
import com.heytap.baselib.database.utils.SQLiteDowngradeException;
import com.oplus.aiunit.vision.e25;
import com.oplus.aiunit.vision.hq9;
import com.oplus.aiunit.vision.i25;
import com.oplus.aiunit.vision.iq9;
import com.oplus.aiunit.vision.p25;
import com.oplus.aiunit.vision.v8f;
import com.oplus.aiunit.vision.ypj;
import com.oplus.aiunit.vision.yrj;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 12\u00020\u0001:\u00032\b\u0019B\u0017\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u0010,\u001a\u00020*¢\u0006\u0004\b/\u00100J,\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016J$\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0016J\u001e\u0010\u000e\u001a\u00020\r2\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J-\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J&\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0016J\u001e\u0010\u0019\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0016J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u000bH\u0016J\u0010\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\b\u0010 \u001a\u00020\u001bH\u0016J\b\u0010!\u001a\u00020\u001bH\u0002R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010#R\u0017\u0010)\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b\u0019\u0010&\u001a\u0004\b'\u0010(R\u0016\u0010,\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010+¨\u00063"}, d2 = {"Lcom/heytap/baselib/database/TapDatabase;", "Lcom/heytap/baselib/database/ITapDatabase;", "T", "Lcom/oplus/aiunit/vision/v8f;", "queryParam", "Ljava/lang/Class;", "classType", "", "a", "Landroid/content/ContentValues;", "l", "", "whereClause", "", "m", "", "entityList", "Lcom/heytap/baselib/database/ITapDatabase$InsertType;", "insertType", "", "", "e", "(Ljava/util/List;Lcom/heytap/baselib/database/ITapDatabase$InsertType;)[Ljava/lang/Long;", "values", "c", "b", "sql", "", "d", "Lcom/oplus/aiunit/vision/iq9;", "callback", "j", "i", "h", "Lcom/oplus/aiunit/vision/hq9;", "Lcom/oplus/aiunit/vision/hq9;", "mParser", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "k", "()Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "mDbHelper", "Lcom/oplus/aiunit/vision/i25;", "Lcom/oplus/aiunit/vision/i25;", "dbConfig", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Lcom/oplus/aiunit/vision/i25;)V", "Companion", "Callback", "TapDatabase"}, k = 1, mv = {1, 4, 0})
public class TapDatabase implements ITapDatabase {

    @NotNull
    public static final Lazy d = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new Function0<ExecutorService>() { // from class: com.heytap.baselib.database.TapDatabase$Companion$sExecutor$2
        public final ExecutorService invoke() {
            return Executors.newSingleThreadExecutor();
        }
    });
    public final hq9 a;

    @NotNull
    public final SupportSQLiteOpenHelper b;
    public i25 c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0096\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\"\u0010\t\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0016J \u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\r"}, d2 = {"Lcom/heytap/baselib/database/TapDatabase$Callback;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback;", "version", "", "(Lcom/heytap/baselib/database/TapDatabase;I)V", "onCreate", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "onDowngrade", "oldVersion", "newVersion", "onUpgrade", "TapDatabase"}, k = 1, mv = {1, 1, 16})
    public class Callback extends SupportSQLiteOpenHelper.Callback {
        public Callback(int i) {
            super(i);
        }

        public void onCreate(@NotNull SupportSQLiteDatabase db) {
            Intrinsics.checkParameterIsNotNull(db, "db");
            String[] strArrF = TapDatabase.this.a.f();
            if (strArrF != null) {
                for (String str : strArrF) {
                    try {
                        db.execSQL(str);
                    } catch (Exception e) {
                        ypj.b(ypj.INSTANCE, null, null, e, 3, null);
                    }
                }
            }
            String[] strArrD = TapDatabase.this.a.d();
            if (strArrD != null) {
                for (String str2 : strArrD) {
                    try {
                        db.execSQL(str2);
                    } catch (Exception e2) {
                        ypj.b(ypj.INSTANCE, null, null, e2, 3, null);
                    }
                }
            }
        }

        public void onDowngrade(@Nullable SupportSQLiteDatabase db, int oldVersion, int newVersion) {
            TapDatabase.this.c.getE().a(db, oldVersion, newVersion);
        }

        public void onUpgrade(@NotNull SupportSQLiteDatabase db, int oldVersion, int newVersion) {
            String[] strArrB;
            Intrinsics.checkParameterIsNotNull(db, "db");
            if (oldVersion < newVersion && (strArrB = TapDatabase.this.a.b(oldVersion)) != null) {
                for (String str : strArrB) {
                    try {
                        db.execSQL(str);
                    } catch (Exception e) {
                        ypj.b(ypj.INSTANCE, null, null, e, 3, null);
                    }
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u001b\u0012\u0006\u0010 \u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"J,\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016J-\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0016J\u001e\u0010\u0017\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0016J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0013H\u0016R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001f¨\u0006#"}, d2 = {"Lcom/heytap/baselib/database/TapDatabase$b;", "Lcom/heytap/baselib/database/ITapDatabase;", "T", "Lcom/oplus/aiunit/vision/v8f;", "queryParam", "Ljava/lang/Class;", "classType", "", "a", "", "entityList", "Lcom/heytap/baselib/database/ITapDatabase$InsertType;", "insertType", "", "", "e", "(Ljava/util/List;Lcom/heytap/baselib/database/ITapDatabase$InsertType;)[Ljava/lang/Long;", "Landroid/content/ContentValues;", "values", "", "whereClause", "", "c", "b", "sql", "", "d", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "mDb", "Lcom/oplus/aiunit/vision/hq9;", "Lcom/oplus/aiunit/vision/hq9;", "mParser", "<init>", "(Lcom/heytap/baselib/database/TapDatabase;Landroidx/sqlite/db/SupportSQLiteDatabase;Lcom/oplus/aiunit/vision/hq9;)V", "TapDatabase"}, k = 1, mv = {1, 4, 0})
    public final class b implements ITapDatabase {
        public final SupportSQLiteDatabase a;
        public final hq9 b;
        public final /* synthetic */ TapDatabase c;

        public b(@NotNull TapDatabase tapDatabase, @NotNull SupportSQLiteDatabase supportSQLiteDatabase, hq9 hq9Var) {
            Intrinsics.checkParameterIsNotNull(supportSQLiteDatabase, "mDb");
            Intrinsics.checkParameterIsNotNull(hq9Var, "mParser");
            this.c = tapDatabase;
            this.a = supportSQLiteDatabase;
            this.b = hq9Var;
        }

        @Override // com.heytap.baselib.database.ITapDatabase
        @Nullable
        public <T> List<T> a(@NotNull v8f queryParam, @NotNull Class<T> classType) {
            Intrinsics.checkParameterIsNotNull(queryParam, "queryParam");
            Intrinsics.checkParameterIsNotNull(classType, "classType");
            return p25.INSTANCE.d(this.b, classType, this.a, queryParam);
        }

        @Override // com.heytap.baselib.database.ITapDatabase
        public int b(@Nullable String whereClause, @NotNull Class<?> classType) {
            Intrinsics.checkParameterIsNotNull(classType, "classType");
            return p25.INSTANCE.a(this.b, classType, this.a, whereClause);
        }

        @Override // com.heytap.baselib.database.ITapDatabase
        public int c(@NotNull ContentValues values, @Nullable String whereClause, @NotNull Class<?> classType) {
            Intrinsics.checkParameterIsNotNull(values, "values");
            Intrinsics.checkParameterIsNotNull(classType, "classType");
            return p25.INSTANCE.k(this.b, this.a, values, classType, whereClause);
        }

        @Override // com.heytap.baselib.database.ITapDatabase
        public void d(@NotNull String sql) {
            Intrinsics.checkParameterIsNotNull(sql, "sql");
            try {
                this.a.execSQL(sql);
            } catch (Exception e) {
                ypj.b(ypj.INSTANCE, null, null, e, 3, null);
            }
        }

        @Override // com.heytap.baselib.database.ITapDatabase
        @Nullable
        public Long[] e(@NotNull List<? extends Object> entityList, @NotNull ITapDatabase.InsertType insertType) {
            Intrinsics.checkParameterIsNotNull(entityList, "entityList");
            Intrinsics.checkParameterIsNotNull(insertType, "insertType");
            return p25.INSTANCE.g(this.b, this.a, entityList, insertType);
        }
    }

    public TapDatabase(@NotNull Context context, @NotNull i25 i25Var) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(i25Var, "dbConfig");
        this.c = i25Var;
        e25 e25Var = new e25();
        this.a = e25Var;
        context = context instanceof Activity ? ((Activity) context).getApplicationContext() : context;
        e25Var.a(this.c.b());
        SupportSQLiteOpenHelper supportSQLiteOpenHelperCreate = new FrameworkSQLiteOpenHelperFactory().create(SupportSQLiteOpenHelper.Configuration.builder(context).name(this.c.getA()).callback(new Callback(this.c.getB())).build());
        Intrinsics.checkExpressionValueIsNotNull(supportSQLiteOpenHelperCreate, "factory.create(\n        …       .build()\n        )");
        this.b = supportSQLiteOpenHelperCreate;
    }

    @Override // com.heytap.baselib.database.ITapDatabase
    @Nullable
    public <T> List<T> a(@NotNull v8f queryParam, @NotNull Class<T> classType) throws Exception {
        Intrinsics.checkParameterIsNotNull(queryParam, "queryParam");
        Intrinsics.checkParameterIsNotNull(classType, "classType");
        h();
        try {
            SupportSQLiteDatabase readableDatabase = this.b.getReadableDatabase();
            p25 p25Var = p25.INSTANCE;
            hq9 hq9Var = this.a;
            Intrinsics.checkExpressionValueIsNotNull(readableDatabase, "db");
            return p25Var.d(hq9Var, classType, readableDatabase, queryParam);
        } catch (Exception e) {
            if (e instanceof SQLiteDowngradeException) {
                throw e;
            }
            ypj.b(ypj.INSTANCE, null, null, e, 3, null);
            return null;
        }
    }

    @Override // com.heytap.baselib.database.ITapDatabase
    public int b(@Nullable String whereClause, @NotNull Class<?> classType) throws Exception {
        Intrinsics.checkParameterIsNotNull(classType, "classType");
        h();
        try {
            SupportSQLiteDatabase writableDatabase = this.b.getWritableDatabase();
            p25 p25Var = p25.INSTANCE;
            hq9 hq9Var = this.a;
            Intrinsics.checkExpressionValueIsNotNull(writableDatabase, "db");
            p25Var.a(hq9Var, classType, writableDatabase, whereClause);
            return 0;
        } catch (Exception e) {
            if (e instanceof SQLiteDowngradeException) {
                throw e;
            }
            ypj.b(ypj.INSTANCE, null, null, e, 3, null);
            return 0;
        }
    }

    @Override // com.heytap.baselib.database.ITapDatabase
    public int c(@NotNull ContentValues values, @Nullable String whereClause, @NotNull Class<?> classType) throws Exception {
        Intrinsics.checkParameterIsNotNull(values, "values");
        Intrinsics.checkParameterIsNotNull(classType, "classType");
        h();
        try {
            SupportSQLiteDatabase writableDatabase = this.b.getWritableDatabase();
            p25 p25Var = p25.INSTANCE;
            hq9 hq9Var = this.a;
            Intrinsics.checkExpressionValueIsNotNull(writableDatabase, "db");
            p25Var.k(hq9Var, writableDatabase, values, classType, whereClause);
            return 0;
        } catch (Exception e) {
            if (e instanceof SQLiteDowngradeException) {
                throw e;
            }
            ypj.b(ypj.INSTANCE, null, null, e, 3, null);
            return 0;
        }
    }

    @Override // com.heytap.baselib.database.ITapDatabase
    public void d(@NotNull String sql) throws Exception {
        Intrinsics.checkParameterIsNotNull(sql, "sql");
        h();
        try {
            this.b.getWritableDatabase().execSQL(sql);
        } catch (Exception e) {
            if (e instanceof SQLiteDowngradeException) {
                throw e;
            }
            ypj.b(ypj.INSTANCE, null, null, e, 3, null);
        }
    }

    @Override // com.heytap.baselib.database.ITapDatabase
    @Nullable
    public Long[] e(@NotNull List<? extends Object> entityList, @NotNull ITapDatabase.InsertType insertType) throws Exception {
        Intrinsics.checkParameterIsNotNull(entityList, "entityList");
        Intrinsics.checkParameterIsNotNull(insertType, "insertType");
        h();
        try {
            SupportSQLiteDatabase writableDatabase = this.b.getWritableDatabase();
            p25 p25Var = p25.INSTANCE;
            hq9 hq9Var = this.a;
            Intrinsics.checkExpressionValueIsNotNull(writableDatabase, "db");
            return p25Var.g(hq9Var, writableDatabase, entityList, insertType);
        } catch (Exception e) {
            if (e instanceof SQLiteDowngradeException) {
                throw e;
            }
            ypj.b(ypj.INSTANCE, null, null, e, 3, null);
            return null;
        }
    }

    public final void h() {
        if (this.c.getD() && Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper())) {
            throw new RuntimeException("should not run sqlite on main thread");
        }
    }

    public void i() {
        this.b.close();
    }

    public void j(@NotNull iq9 callback) {
        Intrinsics.checkParameterIsNotNull(callback, "callback");
        SupportSQLiteDatabase writableDatabase = null;
        try {
            try {
                writableDatabase = this.b.getWritableDatabase();
                if (writableDatabase != null) {
                    writableDatabase.beginTransaction();
                    if (callback.onTransaction(new b(this, writableDatabase, this.a))) {
                        writableDatabase.setTransactionSuccessful();
                    }
                }
                if (writableDatabase == null) {
                    return;
                }
            } catch (Exception e) {
                if (e instanceof SQLiteDowngradeException) {
                    throw e;
                }
                ypj.b(ypj.INSTANCE, null, null, e, 3, null);
                if (writableDatabase == null) {
                    return;
                }
            }
            yrj.a(writableDatabase);
        } catch (Throwable th) {
            if (writableDatabase != null) {
                yrj.a(writableDatabase);
            }
            throw th;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: k, reason: from getter */
    public final SupportSQLiteOpenHelper getB() {
        return this.b;
    }

    @Nullable
    public List<ContentValues> l(@NotNull v8f queryParam, @NotNull Class<?> classType) throws Exception {
        Intrinsics.checkParameterIsNotNull(queryParam, "queryParam");
        Intrinsics.checkParameterIsNotNull(classType, "classType");
        h();
        try {
            SupportSQLiteDatabase readableDatabase = this.b.getReadableDatabase();
            p25 p25Var = p25.INSTANCE;
            hq9 hq9Var = this.a;
            Intrinsics.checkExpressionValueIsNotNull(readableDatabase, "db");
            return p25Var.b(hq9Var, classType, readableDatabase, queryParam);
        } catch (Exception e) {
            if (e instanceof SQLiteDowngradeException) {
                throw e;
            }
            ypj.b(ypj.INSTANCE, null, null, e, 3, null);
            return null;
        }
    }

    public int m(@NotNull Class<?> classType, @Nullable String whereClause) throws Exception {
        Intrinsics.checkParameterIsNotNull(classType, "classType");
        h();
        try {
            SupportSQLiteDatabase readableDatabase = this.b.getReadableDatabase();
            p25 p25Var = p25.INSTANCE;
            hq9 hq9Var = this.a;
            Intrinsics.checkExpressionValueIsNotNull(readableDatabase, "db");
            return p25Var.j(hq9Var, classType, whereClause, readableDatabase);
        } catch (Exception e) {
            if (e instanceof SQLiteDowngradeException) {
                throw e;
            }
            ypj.b(ypj.INSTANCE, null, null, e, 3, null);
            return 0;
        }
    }
}
