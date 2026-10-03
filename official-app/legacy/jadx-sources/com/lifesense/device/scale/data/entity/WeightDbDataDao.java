package com.lifesense.device.scale.data.entity;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.heytap.databaseengine.apiv3.data.Element;
import com.oplus.aiunit.vision.a6;
import com.oplus.aiunit.vision.alf;
import com.oplus.aiunit.vision.cs4;
import com.oplus.aiunit.vision.d05;
import com.oplus.aiunit.vision.wz4;
import com.oplus.aiunit.vision.yye;

/* JADX INFO: loaded from: classes4.dex */
public class WeightDbDataDao extends a6<a, String> {
    public static final String TABLENAME = "WEIGHT_DB_DATA";

    public static class Properties {
        public static final yye Battery;
        public static final yye Bmi;
        public static final yye Bone;
        public static final yye DeviceId;
        public static final yye DeviceMode;
        public static final yye HasPbf;
        public static final yye Id = new yye(0, String.class, "id", true, alf.ID);
        public static final yye IsTreated;
        public static final yye MeasurementTime;
        public static final yye Muscle;
        public static final yye Pbf;
        public static final yye Resistance50K;
        public static final yye Resistance5K;
        public static final yye UserId;
        public static final yye UserNo;
        public static final yye Water;
        public static final yye Weight;
        public static final yye WeightLevel;

        static {
            Class cls = Long.TYPE;
            UserId = new yye(1, cls, "userId", false, "USER_ID");
            DeviceId = new yye(2, String.class, "deviceId", false, "DEVICE_ID");
            MeasurementTime = new yye(3, cls, "measurementTime", false, "MEASUREMENT_TIME");
            DeviceMode = new yye(4, String.class, "deviceMode", false, "DEVICE_MODE");
            Class cls2 = Integer.TYPE;
            UserNo = new yye(5, cls2, "userNo", false, "USER_NO");
            Weight = new yye(6, Double.TYPE, "weight", false, "WEIGHT");
            Bmi = new yye(7, Double.TYPE, Element.ELEMENT_NAME_BMI, false, "BMI");
            Class cls3 = Boolean.TYPE;
            HasPbf = new yye(8, cls3, "hasPbf", false, "HAS_PBF");
            Pbf = new yye(9, Double.TYPE, "pbf", false, "PBF");
            Bone = new yye(10, Double.TYPE, "bone", false, "BONE");
            Water = new yye(11, Double.TYPE, "water", false, "WATER");
            Muscle = new yye(12, Double.TYPE, "muscle", false, "MUSCLE");
            WeightLevel = new yye(13, Double.TYPE, "weightLevel", false, "WEIGHT_LEVEL");
            Resistance5K = new yye(14, Double.TYPE, "resistance5K", false, "RESISTANCE5_K");
            Resistance50K = new yye(15, Double.TYPE, "resistance50K", false, "RESISTANCE50_K");
            Battery = new yye(16, cls2, "battery", false, "BATTERY");
            IsTreated = new yye(17, cls3, "isTreated", false, "IS_TREATED");
        }
    }

    public WeightDbDataDao(cs4 cs4Var) {
        super(cs4Var);
    }

    public static void createTable(wz4 wz4Var, boolean z) {
        wz4Var.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"WEIGHT_DB_DATA\" (\"ID\" TEXT PRIMARY KEY NOT NULL ,\"USER_ID\" INTEGER NOT NULL ,\"DEVICE_ID\" TEXT,\"MEASUREMENT_TIME\" INTEGER NOT NULL ,\"DEVICE_MODE\" TEXT,\"USER_NO\" INTEGER NOT NULL ,\"WEIGHT\" REAL NOT NULL ,\"BMI\" REAL NOT NULL ,\"HAS_PBF\" INTEGER NOT NULL ,\"PBF\" REAL NOT NULL ,\"BONE\" REAL NOT NULL ,\"WATER\" REAL NOT NULL ,\"MUSCLE\" REAL NOT NULL ,\"WEIGHT_LEVEL\" REAL NOT NULL ,\"RESISTANCE5_K\" REAL NOT NULL ,\"RESISTANCE50_K\" REAL NOT NULL ,\"BATTERY\" INTEGER NOT NULL ,\"IS_TREATED\" INTEGER NOT NULL );");
    }

    public static void dropTable(wz4 wz4Var, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"WEIGHT_DB_DATA\"");
        wz4Var.execSQL(sb.toString());
    }

    @Override // com.oplus.aiunit.vision.a6
    public final void bindValues(SQLiteStatement sQLiteStatement, a aVar) {
        sQLiteStatement.clearBindings();
        String strG = aVar.g();
        if (strG != null) {
            sQLiteStatement.bindString(1, strG);
        }
        sQLiteStatement.bindLong(2, aVar.n());
        String strD = aVar.d();
        if (strD != null) {
            sQLiteStatement.bindString(3, strD);
        }
        sQLiteStatement.bindLong(4, aVar.i());
        String strE = aVar.e();
        if (strE != null) {
            sQLiteStatement.bindString(5, strE);
        }
        sQLiteStatement.bindLong(6, aVar.o());
        sQLiteStatement.bindDouble(7, aVar.q());
        sQLiteStatement.bindDouble(8, aVar.b());
        sQLiteStatement.bindLong(9, aVar.f() ? 1L : 0L);
        sQLiteStatement.bindDouble(10, aVar.k());
        sQLiteStatement.bindDouble(11, aVar.c());
        sQLiteStatement.bindDouble(12, aVar.p());
        sQLiteStatement.bindDouble(13, aVar.j());
        sQLiteStatement.bindDouble(14, aVar.r());
        sQLiteStatement.bindDouble(15, aVar.m());
        sQLiteStatement.bindDouble(16, aVar.l());
        sQLiteStatement.bindLong(17, aVar.a());
        sQLiteStatement.bindLong(18, aVar.h() ? 1L : 0L);
    }

    @Override // com.oplus.aiunit.vision.a6
    public boolean hasKey(a aVar) {
        return aVar.g() != null;
    }

    @Override // com.oplus.aiunit.vision.a6
    public final boolean isEntityUpdateable() {
        return true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.oplus.aiunit.vision.a6
    public a readEntity(Cursor cursor, int i) {
        int i2 = i + 0;
        String string = cursor.isNull(i2) ? null : cursor.getString(i2);
        long j2 = cursor.getLong(i + 1);
        int i3 = i + 2;
        String string2 = cursor.isNull(i3) ? null : cursor.getString(i3);
        int i4 = i + 4;
        return new a(string, j2, string2, cursor.getLong(i + 3), cursor.isNull(i4) ? null : cursor.getString(i4), cursor.getInt(i + 5), cursor.getDouble(i + 6), cursor.getDouble(i + 7), cursor.getShort(i + 8) != 0, cursor.getDouble(i + 9), cursor.getDouble(i + 10), cursor.getDouble(i + 11), cursor.getDouble(i + 12), cursor.getDouble(i + 13), cursor.getDouble(i + 14), cursor.getDouble(i + 15), cursor.getInt(i + 16), cursor.getShort(i + 17) != 0);
    }

    public WeightDbDataDao(cs4 cs4Var, DaoSession daoSession) {
        super(cs4Var, daoSession);
    }

    @Override // com.oplus.aiunit.vision.a6
    public String getKey(a aVar) {
        if (aVar != null) {
            return aVar.g();
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.a6
    public String readKey(Cursor cursor, int i) {
        int i2 = i + 0;
        if (cursor.isNull(i2)) {
            return null;
        }
        return cursor.getString(i2);
    }

    @Override // com.oplus.aiunit.vision.a6
    public final String updateKeyAfterInsert(a aVar, long j2) {
        return aVar.g();
    }

    @Override // com.oplus.aiunit.vision.a6
    public final void bindValues(d05 d05Var, a aVar) {
        d05Var.clearBindings();
        String strG = aVar.g();
        if (strG != null) {
            d05Var.bindString(1, strG);
        }
        d05Var.bindLong(2, aVar.n());
        String strD = aVar.d();
        if (strD != null) {
            d05Var.bindString(3, strD);
        }
        d05Var.bindLong(4, aVar.i());
        String strE = aVar.e();
        if (strE != null) {
            d05Var.bindString(5, strE);
        }
        d05Var.bindLong(6, aVar.o());
        d05Var.bindDouble(7, aVar.q());
        d05Var.bindDouble(8, aVar.b());
        d05Var.bindLong(9, aVar.f() ? 1L : 0L);
        d05Var.bindDouble(10, aVar.k());
        d05Var.bindDouble(11, aVar.c());
        d05Var.bindDouble(12, aVar.p());
        d05Var.bindDouble(13, aVar.j());
        d05Var.bindDouble(14, aVar.r());
        d05Var.bindDouble(15, aVar.m());
        d05Var.bindDouble(16, aVar.l());
        d05Var.bindLong(17, aVar.a());
        d05Var.bindLong(18, aVar.h() ? 1L : 0L);
    }

    @Override // com.oplus.aiunit.vision.a6
    public void readEntity(Cursor cursor, a aVar, int i) {
        int i2 = i + 0;
        aVar.c(cursor.isNull(i2) ? null : cursor.getString(i2));
        aVar.b(cursor.getLong(i + 1));
        int i3 = i + 2;
        aVar.a(cursor.isNull(i3) ? null : cursor.getString(i3));
        aVar.a(cursor.getLong(i + 3));
        int i4 = i + 4;
        aVar.b(cursor.isNull(i4) ? null : cursor.getString(i4));
        aVar.b(cursor.getInt(i + 5));
        aVar.h(cursor.getDouble(i + 6));
        aVar.a(cursor.getDouble(i + 7));
        aVar.a(cursor.getShort(i + 8) != 0);
        aVar.d(cursor.getDouble(i + 9));
        aVar.b(cursor.getDouble(i + 10));
        aVar.g(cursor.getDouble(i + 11));
        aVar.c(cursor.getDouble(i + 12));
        aVar.i(cursor.getDouble(i + 13));
        aVar.f(cursor.getDouble(i + 14));
        aVar.e(cursor.getDouble(i + 15));
        aVar.a(cursor.getInt(i + 16));
        aVar.b(cursor.getShort(i + 17) != 0);
    }
}
