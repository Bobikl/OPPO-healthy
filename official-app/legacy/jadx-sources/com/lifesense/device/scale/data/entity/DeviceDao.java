package com.lifesense.device.scale.data.entity;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.heytap.store.base.core.http.HttpConst;
import com.lifesense.device.scale.infrastructure.entity.Device;
import com.lifesense.device.scale.infrastructure.protocol.ApplyDeviceIdRequest;
import com.oplus.aiunit.vision.a6;
import com.oplus.aiunit.vision.alf;
import com.oplus.aiunit.vision.cs4;
import com.oplus.aiunit.vision.d05;
import com.oplus.aiunit.vision.dj8;
import com.oplus.aiunit.vision.wz4;
import com.oplus.aiunit.vision.yye;
import com.oplus.mydevices.sdk.compat.DeviceInfoCompat;

/* JADX INFO: loaded from: classes4.dex */
public class DeviceDao extends a6<Device, String> {
    public static final String TABLENAME = "DEVICE";

    public static class Properties {
        public static final yye Id = new yye(0, String.class, "id", true, alf.ID);
        public static final yye UserId = new yye(1, Long.class, "userId", false, "USER_ID");
        public static final yye Name = new yye(2, String.class, "name", false, "NAME");
        public static final yye OtaVersion = new yye(3, String.class, HttpConst.OTA_VERSION, false, "OTA_VERSION");
        public static final yye Mac = new yye(4, String.class, "mac", false, "MAC");
        public static final yye HardwareVersion = new yye(5, String.class, "hardwareVersion", false, "HARDWARE_VERSION");
        public static final yye PhonePower = new yye(6, String.class, "phonePower", false, "PHONE_POWER");
        public static final yye PhoneOs = new yye(7, String.class, "phoneOs", false, "PHONE_OS");
        public static final yye OsVersion = new yye(8, String.class, "osVersion", false, "OS_VERSION");
        public static final yye PhoneModel = new yye(9, String.class, "phoneModel", false, "PHONE_MODEL");
        public static final yye PhoneImei = new yye(10, String.class, "phoneImei", false, "PHONE_IMEI");
        public static final yye Connected = new yye(11, Boolean.TYPE, DeviceInfoCompat.DeviceState.CONNECTED, false, "CONNECTED");
        public static final yye ImageUrl = new yye(12, String.class, "imageUrl", false, "IMAGE_URL");
        public static final yye TransferName = new yye(13, String.class, "transferName", false, "TRANSFER_NAME");
        public static final yye ProductTypeCode = new yye(14, String.class, ApplyDeviceIdRequest.kRequestParam_ProductTypeCode, false, "PRODUCT_TYPE_CODE");
        public static final yye Model = new yye(15, String.class, "model", false, "MODEL");
        public static final yye VenderId = new yye(16, String.class, ApplyDeviceIdRequest.kRequestParam_VenderId, false, "VENDER_ID");
        public static final yye Sn = new yye(17, String.class, dj8.KEY_SN, false, "SN");
    }

    public DeviceDao(cs4 cs4Var) {
        super(cs4Var);
    }

    public static void createTable(wz4 wz4Var, boolean z) {
        wz4Var.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"DEVICE\" (\"ID\" TEXT PRIMARY KEY NOT NULL ,\"USER_ID\" INTEGER,\"NAME\" TEXT,\"OTA_VERSION\" TEXT,\"MAC\" TEXT,\"HARDWARE_VERSION\" TEXT,\"PHONE_POWER\" TEXT,\"PHONE_OS\" TEXT,\"OS_VERSION\" TEXT,\"PHONE_MODEL\" TEXT,\"PHONE_IMEI\" TEXT,\"CONNECTED\" INTEGER NOT NULL ,\"IMAGE_URL\" TEXT,\"TRANSFER_NAME\" TEXT,\"PRODUCT_TYPE_CODE\" TEXT,\"MODEL\" TEXT,\"VENDER_ID\" TEXT,\"SN\" TEXT);");
    }

    public static void dropTable(wz4 wz4Var, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"DEVICE\"");
        wz4Var.execSQL(sb.toString());
    }

    @Override // com.oplus.aiunit.vision.a6
    public final void bindValues(SQLiteStatement sQLiteStatement, Device device) {
        sQLiteStatement.clearBindings();
        String id = device.getId();
        if (id != null) {
            sQLiteStatement.bindString(1, id);
        }
        Long userId = device.getUserId();
        if (userId != null) {
            sQLiteStatement.bindLong(2, userId.longValue());
        }
        String name = device.getName();
        if (name != null) {
            sQLiteStatement.bindString(3, name);
        }
        String otaVersion = device.getOtaVersion();
        if (otaVersion != null) {
            sQLiteStatement.bindString(4, otaVersion);
        }
        String mac = device.getMac();
        if (mac != null) {
            sQLiteStatement.bindString(5, mac);
        }
        String hardwareVersion = device.getHardwareVersion();
        if (hardwareVersion != null) {
            sQLiteStatement.bindString(6, hardwareVersion);
        }
        String phonePower = device.getPhonePower();
        if (phonePower != null) {
            sQLiteStatement.bindString(7, phonePower);
        }
        String phoneOs = device.getPhoneOs();
        if (phoneOs != null) {
            sQLiteStatement.bindString(8, phoneOs);
        }
        String osVersion = device.getOsVersion();
        if (osVersion != null) {
            sQLiteStatement.bindString(9, osVersion);
        }
        String phoneModel = device.getPhoneModel();
        if (phoneModel != null) {
            sQLiteStatement.bindString(10, phoneModel);
        }
        String phoneImei = device.getPhoneImei();
        if (phoneImei != null) {
            sQLiteStatement.bindString(11, phoneImei);
        }
        sQLiteStatement.bindLong(12, device.getConnected() ? 1L : 0L);
        String imageUrl = device.getImageUrl();
        if (imageUrl != null) {
            sQLiteStatement.bindString(13, imageUrl);
        }
        String transferName = device.getTransferName();
        if (transferName != null) {
            sQLiteStatement.bindString(14, transferName);
        }
        String productTypeCode = device.getProductTypeCode();
        if (productTypeCode != null) {
            sQLiteStatement.bindString(15, productTypeCode);
        }
        String model = device.getModel();
        if (model != null) {
            sQLiteStatement.bindString(16, model);
        }
        String venderId = device.getVenderId();
        if (venderId != null) {
            sQLiteStatement.bindString(17, venderId);
        }
        String sn = device.getSn();
        if (sn != null) {
            sQLiteStatement.bindString(18, sn);
        }
    }

    @Override // com.oplus.aiunit.vision.a6
    public boolean hasKey(Device device) {
        return device.getId() != null;
    }

    @Override // com.oplus.aiunit.vision.a6
    public final boolean isEntityUpdateable() {
        return true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.oplus.aiunit.vision.a6
    public Device readEntity(Cursor cursor, int i) {
        int i2 = i + 0;
        String string = cursor.isNull(i2) ? null : cursor.getString(i2);
        int i3 = i + 1;
        Long lValueOf = cursor.isNull(i3) ? null : Long.valueOf(cursor.getLong(i3));
        int i4 = i + 2;
        String string2 = cursor.isNull(i4) ? null : cursor.getString(i4);
        int i5 = i + 3;
        String string3 = cursor.isNull(i5) ? null : cursor.getString(i5);
        int i6 = i + 4;
        String string4 = cursor.isNull(i6) ? null : cursor.getString(i6);
        int i7 = i + 5;
        String string5 = cursor.isNull(i7) ? null : cursor.getString(i7);
        int i8 = i + 6;
        String string6 = cursor.isNull(i8) ? null : cursor.getString(i8);
        int i9 = i + 7;
        String string7 = cursor.isNull(i9) ? null : cursor.getString(i9);
        int i10 = i + 8;
        String string8 = cursor.isNull(i10) ? null : cursor.getString(i10);
        int i11 = i + 9;
        String string9 = cursor.isNull(i11) ? null : cursor.getString(i11);
        int i12 = i + 10;
        String string10 = cursor.isNull(i12) ? null : cursor.getString(i12);
        boolean z = cursor.getShort(i + 11) != 0;
        int i13 = i + 12;
        String string11 = cursor.isNull(i13) ? null : cursor.getString(i13);
        int i14 = i + 13;
        String string12 = cursor.isNull(i14) ? null : cursor.getString(i14);
        int i15 = i + 14;
        String string13 = cursor.isNull(i15) ? null : cursor.getString(i15);
        int i16 = i + 15;
        String string14 = cursor.isNull(i16) ? null : cursor.getString(i16);
        int i17 = i + 16;
        String string15 = cursor.isNull(i17) ? null : cursor.getString(i17);
        int i18 = i + 17;
        return new Device(string, lValueOf, string2, string3, string4, string5, string6, string7, string8, string9, string10, z, string11, string12, string13, string14, string15, cursor.isNull(i18) ? null : cursor.getString(i18));
    }

    public DeviceDao(cs4 cs4Var, DaoSession daoSession) {
        super(cs4Var, daoSession);
    }

    @Override // com.oplus.aiunit.vision.a6
    public String getKey(Device device) {
        if (device != null) {
            return device.getId();
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
    public final String updateKeyAfterInsert(Device device, long j2) {
        return device.getId();
    }

    @Override // com.oplus.aiunit.vision.a6
    public final void bindValues(d05 d05Var, Device device) {
        d05Var.clearBindings();
        String id = device.getId();
        if (id != null) {
            d05Var.bindString(1, id);
        }
        Long userId = device.getUserId();
        if (userId != null) {
            d05Var.bindLong(2, userId.longValue());
        }
        String name = device.getName();
        if (name != null) {
            d05Var.bindString(3, name);
        }
        String otaVersion = device.getOtaVersion();
        if (otaVersion != null) {
            d05Var.bindString(4, otaVersion);
        }
        String mac = device.getMac();
        if (mac != null) {
            d05Var.bindString(5, mac);
        }
        String hardwareVersion = device.getHardwareVersion();
        if (hardwareVersion != null) {
            d05Var.bindString(6, hardwareVersion);
        }
        String phonePower = device.getPhonePower();
        if (phonePower != null) {
            d05Var.bindString(7, phonePower);
        }
        String phoneOs = device.getPhoneOs();
        if (phoneOs != null) {
            d05Var.bindString(8, phoneOs);
        }
        String osVersion = device.getOsVersion();
        if (osVersion != null) {
            d05Var.bindString(9, osVersion);
        }
        String phoneModel = device.getPhoneModel();
        if (phoneModel != null) {
            d05Var.bindString(10, phoneModel);
        }
        String phoneImei = device.getPhoneImei();
        if (phoneImei != null) {
            d05Var.bindString(11, phoneImei);
        }
        d05Var.bindLong(12, device.getConnected() ? 1L : 0L);
        String imageUrl = device.getImageUrl();
        if (imageUrl != null) {
            d05Var.bindString(13, imageUrl);
        }
        String transferName = device.getTransferName();
        if (transferName != null) {
            d05Var.bindString(14, transferName);
        }
        String productTypeCode = device.getProductTypeCode();
        if (productTypeCode != null) {
            d05Var.bindString(15, productTypeCode);
        }
        String model = device.getModel();
        if (model != null) {
            d05Var.bindString(16, model);
        }
        String venderId = device.getVenderId();
        if (venderId != null) {
            d05Var.bindString(17, venderId);
        }
        String sn = device.getSn();
        if (sn != null) {
            d05Var.bindString(18, sn);
        }
    }

    @Override // com.oplus.aiunit.vision.a6
    public void readEntity(Cursor cursor, Device device, int i) {
        int i2 = i + 0;
        device.setId(cursor.isNull(i2) ? null : cursor.getString(i2));
        int i3 = i + 1;
        device.setUserId(cursor.isNull(i3) ? null : Long.valueOf(cursor.getLong(i3)));
        int i4 = i + 2;
        device.setName(cursor.isNull(i4) ? null : cursor.getString(i4));
        int i5 = i + 3;
        device.setOtaVersion(cursor.isNull(i5) ? null : cursor.getString(i5));
        int i6 = i + 4;
        device.setMac(cursor.isNull(i6) ? null : cursor.getString(i6));
        int i7 = i + 5;
        device.setHardwareVersion(cursor.isNull(i7) ? null : cursor.getString(i7));
        int i8 = i + 6;
        device.setPhonePower(cursor.isNull(i8) ? null : cursor.getString(i8));
        int i9 = i + 7;
        device.setPhoneOs(cursor.isNull(i9) ? null : cursor.getString(i9));
        int i10 = i + 8;
        device.setOsVersion(cursor.isNull(i10) ? null : cursor.getString(i10));
        int i11 = i + 9;
        device.setPhoneModel(cursor.isNull(i11) ? null : cursor.getString(i11));
        int i12 = i + 10;
        device.setPhoneImei(cursor.isNull(i12) ? null : cursor.getString(i12));
        device.setConnected(cursor.getShort(i + 11) != 0);
        int i13 = i + 12;
        device.setImageUrl(cursor.isNull(i13) ? null : cursor.getString(i13));
        int i14 = i + 13;
        device.setTransferName(cursor.isNull(i14) ? null : cursor.getString(i14));
        int i15 = i + 14;
        device.setProductTypeCode(cursor.isNull(i15) ? null : cursor.getString(i15));
        int i16 = i + 15;
        device.setModel(cursor.isNull(i16) ? null : cursor.getString(i16));
        int i17 = i + 16;
        device.setVenderId(cursor.isNull(i17) ? null : cursor.getString(i17));
        int i18 = i + 17;
        device.setSn(cursor.isNull(i18) ? null : cursor.getString(i18));
    }
}
