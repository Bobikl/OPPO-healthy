package com.lifesense.device.scale.data.entity;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.lifesense.device.scale.infrastructure.entity.DeviceSetting;
import com.oplus.aiunit.vision.a6;
import com.oplus.aiunit.vision.alf;
import com.oplus.aiunit.vision.cs4;
import com.oplus.aiunit.vision.d05;
import com.oplus.aiunit.vision.wz4;
import com.oplus.aiunit.vision.yye;
import com.oplus.utrace.lib.HLogConst;
import java.util.Date;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;

/* JADX INFO: loaded from: classes4.dex */
public class DeviceSettingDao extends a6<DeviceSetting, String> {
    public static final String TABLENAME = "DEVICE_SETTING";

    public static class Properties {
        public static final yye Content;
        public static final yye Created;
        public static final yye Deleted;
        public static final yye SettingTime;
        public static final yye Updated;
        public static final yye UploadFlag;
        public static final yye Id = new yye(0, String.class, "id", true, alf.ID);
        public static final yye DeviceId = new yye(1, String.class, "deviceId", false, "DEVICE_ID");
        public static final yye SettingClass = new yye(2, String.class, "settingClass", false, "SETTING_CLASS");

        static {
            Class cls = Long.TYPE;
            SettingTime = new yye(3, cls, "settingTime", false, "SETTING_TIME");
            Content = new yye(4, String.class, "content", false, "CONTENT");
            Created = new yye(5, Date.class, "created", false, DebugCoroutineInfoImplKt.CREATED);
            Updated = new yye(6, cls, "updated", false, "UPDATED");
            Class cls2 = Boolean.TYPE;
            UploadFlag = new yye(7, cls2, HLogConst.KEY_UPLOAD_FLAG, false, "UPLOAD_FLAG");
            Deleted = new yye(8, cls2, "deleted", false, "DELETED");
        }
    }

    public DeviceSettingDao(cs4 cs4Var) {
        super(cs4Var);
    }

    public static void createTable(wz4 wz4Var, boolean z) {
        wz4Var.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"DEVICE_SETTING\" (\"ID\" TEXT PRIMARY KEY NOT NULL ,\"DEVICE_ID\" TEXT,\"SETTING_CLASS\" TEXT,\"SETTING_TIME\" INTEGER NOT NULL ,\"CONTENT\" TEXT,\"CREATED\" INTEGER,\"UPDATED\" INTEGER NOT NULL ,\"UPLOAD_FLAG\" INTEGER NOT NULL ,\"DELETED\" INTEGER NOT NULL );");
    }

    public static void dropTable(wz4 wz4Var, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"DEVICE_SETTING\"");
        wz4Var.execSQL(sb.toString());
    }

    @Override // com.oplus.aiunit.vision.a6
    public final void bindValues(SQLiteStatement sQLiteStatement, DeviceSetting deviceSetting) {
        sQLiteStatement.clearBindings();
        String id = deviceSetting.getId();
        if (id != null) {
            sQLiteStatement.bindString(1, id);
        }
        String deviceId = deviceSetting.getDeviceId();
        if (deviceId != null) {
            sQLiteStatement.bindString(2, deviceId);
        }
        String settingClass = deviceSetting.getSettingClass();
        if (settingClass != null) {
            sQLiteStatement.bindString(3, settingClass);
        }
        sQLiteStatement.bindLong(4, deviceSetting.getSettingTime());
        String content = deviceSetting.getContent();
        if (content != null) {
            sQLiteStatement.bindString(5, content);
        }
        Date created = deviceSetting.getCreated();
        if (created != null) {
            sQLiteStatement.bindLong(6, created.getTime());
        }
        sQLiteStatement.bindLong(7, deviceSetting.getUpdated());
        sQLiteStatement.bindLong(8, deviceSetting.getUploadFlag() ? 1L : 0L);
        sQLiteStatement.bindLong(9, deviceSetting.getDeleted() ? 1L : 0L);
    }

    @Override // com.oplus.aiunit.vision.a6
    public boolean hasKey(DeviceSetting deviceSetting) {
        return deviceSetting.getId() != null;
    }

    @Override // com.oplus.aiunit.vision.a6
    public final boolean isEntityUpdateable() {
        return true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.oplus.aiunit.vision.a6
    public DeviceSetting readEntity(Cursor cursor, int i) {
        int i2 = i + 0;
        String string = cursor.isNull(i2) ? null : cursor.getString(i2);
        int i3 = i + 1;
        String string2 = cursor.isNull(i3) ? null : cursor.getString(i3);
        int i4 = i + 2;
        String string3 = cursor.isNull(i4) ? null : cursor.getString(i4);
        long j2 = cursor.getLong(i + 3);
        int i5 = i + 4;
        String string4 = cursor.isNull(i5) ? null : cursor.getString(i5);
        int i6 = i + 5;
        return new DeviceSetting(string, string2, string3, j2, string4, cursor.isNull(i6) ? null : new Date(cursor.getLong(i6)), cursor.getLong(i + 6), cursor.getShort(i + 7) != 0, cursor.getShort(i + 8) != 0);
    }

    public DeviceSettingDao(cs4 cs4Var, DaoSession daoSession) {
        super(cs4Var, daoSession);
    }

    @Override // com.oplus.aiunit.vision.a6
    public String getKey(DeviceSetting deviceSetting) {
        if (deviceSetting != null) {
            return deviceSetting.getId();
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
    public final String updateKeyAfterInsert(DeviceSetting deviceSetting, long j2) {
        return deviceSetting.getId();
    }

    @Override // com.oplus.aiunit.vision.a6
    public final void bindValues(d05 d05Var, DeviceSetting deviceSetting) {
        d05Var.clearBindings();
        String id = deviceSetting.getId();
        if (id != null) {
            d05Var.bindString(1, id);
        }
        String deviceId = deviceSetting.getDeviceId();
        if (deviceId != null) {
            d05Var.bindString(2, deviceId);
        }
        String settingClass = deviceSetting.getSettingClass();
        if (settingClass != null) {
            d05Var.bindString(3, settingClass);
        }
        d05Var.bindLong(4, deviceSetting.getSettingTime());
        String content = deviceSetting.getContent();
        if (content != null) {
            d05Var.bindString(5, content);
        }
        Date created = deviceSetting.getCreated();
        if (created != null) {
            d05Var.bindLong(6, created.getTime());
        }
        d05Var.bindLong(7, deviceSetting.getUpdated());
        d05Var.bindLong(8, deviceSetting.getUploadFlag() ? 1L : 0L);
        d05Var.bindLong(9, deviceSetting.getDeleted() ? 1L : 0L);
    }

    @Override // com.oplus.aiunit.vision.a6
    public void readEntity(Cursor cursor, DeviceSetting deviceSetting, int i) {
        int i2 = i + 0;
        deviceSetting.setId(cursor.isNull(i2) ? null : cursor.getString(i2));
        int i3 = i + 1;
        deviceSetting.setDeviceId(cursor.isNull(i3) ? null : cursor.getString(i3));
        int i4 = i + 2;
        deviceSetting.setSettingClass(cursor.isNull(i4) ? null : cursor.getString(i4));
        deviceSetting.setSettingTime(cursor.getLong(i + 3));
        int i5 = i + 4;
        deviceSetting.setContent(cursor.isNull(i5) ? null : cursor.getString(i5));
        int i6 = i + 5;
        deviceSetting.setCreated(cursor.isNull(i6) ? null : new Date(cursor.getLong(i6)));
        deviceSetting.setUpdated(cursor.getLong(i + 6));
        deviceSetting.setUploadFlag(cursor.getShort(i + 7) != 0);
        deviceSetting.setDeleted(cursor.getShort(i + 8) != 0);
    }
}
