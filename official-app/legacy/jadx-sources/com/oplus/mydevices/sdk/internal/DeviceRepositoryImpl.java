package com.oplus.mydevices.sdk.internal;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.gms.actions.SearchIntents;
import com.oplus.aiunit.vision.a8i;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.EventType;
import com.oplus.mydevices.sdk.DeviceConstants;
import com.oplus.mydevices.sdk.Utils;
import com.oplus.mydevices.sdk.device.DeviceInfo;
import com.oplus.mydevices.sdk.utils.Cryptor;
import com.oplus.mydevices.sdk.utils.CursorExtKt;
import com.oplus.mydevices.sdk.utils.LogUtils;
import com.oplus.mydevices.sdk.utils.ShaUtils;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0017J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001a\u001a\u00020\u0018H\u0016J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R#\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/oplus/mydevices/sdk/internal/DeviceRepositoryImpl;", "Lcom/oplus/mydevices/sdk/internal/IDeviceService;", "mContext", "Landroid/content/Context;", "mUri", "Landroid/net/Uri;", "(Landroid/content/Context;Landroid/net/Uri;)V", "mResolver", "Landroid/content/ContentResolver;", "kotlin.jvm.PlatformType", "getMResolver", "()Landroid/content/ContentResolver;", "mResolver$delegate", "Lkotlin/Lazy;", "add", "", "deviceInfo", "Lcom/oplus/mydevices/sdk/device/DeviceInfo;", "clear", "insertOrUpdate", "notifyDevicesChanged", "", SearchIntents.EXTRA_QUERY, "mac", "", "queryDeviceById", "deviceId", "queryDevices", "", EventType.STATE_PACKAGE_CHANGED_REMOVE, a8i.UPDATE, "Companion", "sdk_domesticRelease"}, k = 1, mv = {1, 4, 0})
public final class DeviceRepositoryImpl implements IDeviceService {
    private static final int NOTIFY_NO_DELAY = 32768;
    private static final String TAG = "DeviceRepositoryImpl";

    /* JADX INFO: renamed from: mResolver$delegate, reason: from kotlin metadata */
    private final Lazy mResolver;
    private final Uri mUri;

    public DeviceRepositoryImpl(@NotNull final Context mContext, @NotNull Uri mUri) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(mUri, "mUri");
        this.mUri = mUri;
        this.mResolver = LazyKt__LazyJVMKt.lazy(new Function0<ContentResolver>() { // from class: com.oplus.mydevices.sdk.internal.DeviceRepositoryImpl$mResolver$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            public final ContentResolver invoke() {
                return mContext.getContentResolver();
            }
        });
    }

    private final ContentResolver getMResolver() {
        return (ContentResolver) this.mResolver.getValue();
    }

    @Override // com.oplus.mydevices.sdk.internal.IDeviceService
    public boolean add(@NotNull DeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        ContentValues contentValues = new ContentValues();
        Cryptor.EncryptedContainer encryptedContainerEncrypt = Cryptor.INSTANCE.encrypt(Utils.convertToDeviceJson(deviceInfo), deviceInfo.getDeviceId());
        String strSha256 = ShaUtils.sha256(deviceInfo.getMacAddress());
        contentValues.put("device_id", deviceInfo.getDeviceId());
        contentValues.put("device_mac", strSha256);
        contentValues.put("authority", this.mUri.getAuthority());
        contentValues.put(DeviceConstants.KEY_DEVICE_DATA, encryptedContainerEncrypt.text());
        try {
            Uri uriInsert = getMResolver().insert(this.mUri, contentValues);
            LogUtils.INSTANCE.d(TAG, "insert uri: " + uriInsert);
            return uriInsert != null;
        } catch (Throwable unused) {
            LogUtils.INSTANCE.e(TAG, "insert error");
            return false;
        }
    }

    @Override // com.oplus.mydevices.sdk.internal.IDeviceService
    public boolean clear() {
        int iDelete = getMResolver().delete(this.mUri, null, null);
        LogUtils.INSTANCE.d(TAG, "delete count : " + iDelete);
        return iDelete > 0;
    }

    @Override // com.oplus.mydevices.sdk.internal.IDeviceService
    public boolean insertOrUpdate(@NotNull DeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        return add(deviceInfo);
    }

    @Override // com.oplus.mydevices.sdk.internal.IDeviceService
    @SuppressLint({"WrongConstant"})
    public void notifyDevicesChanged() {
        try {
            getMResolver().notifyChange(this.mUri, (ContentObserver) null, 32768);
        } catch (Throwable unused) {
            LogUtils.INSTANCE.e(TAG, "notify change error!");
        }
    }

    @Override // com.oplus.mydevices.sdk.internal.IDeviceService
    @Nullable
    public DeviceInfo query(@NotNull String mac) {
        Object next;
        Intrinsics.checkNotNullParameter(mac, "mac");
        Iterator<T> it = queryDevices().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.areEqual(((DeviceInfo) next).getMacAddress(), mac)) {
                return (DeviceInfo) next;
            }
        }
        next = null;
        return (DeviceInfo) next;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0055 A[DONT_GENERATE, PHI: r1 r8
  0x0055: PHI (r1v2 com.oplus.mydevices.sdk.device.DeviceInfo) = (r1v1 com.oplus.mydevices.sdk.device.DeviceInfo), (r1v4 com.oplus.mydevices.sdk.device.DeviceInfo) binds: [B:20:0x0062, B:15:0x0053] A[DONT_GENERATE, DONT_INLINE]
  0x0055: PHI (r8v2 android.database.Cursor) = (r8v3 android.database.Cursor), (r8v4 android.database.Cursor) binds: [B:20:0x0062, B:15:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.oplus.mydevices.sdk.internal.IDeviceService
    @Nullable
    public DeviceInfo queryDeviceById(@NotNull String deviceId) {
        Cursor cursorQuery;
        Integer numValueOf;
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        DeviceInfo deviceByJson = null;
        try {
            cursorQuery = getMResolver().query(this.mUri, null, "device_id = ?", new String[]{deviceId}, null);
            if (cursorQuery != null) {
                try {
                    numValueOf = Integer.valueOf(cursorQuery.getCount());
                } catch (Throwable th) {
                    th = th;
                    try {
                        LogUtils.INSTANCE.e(TAG, "query one error", th);
                    } finally {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    }
                }
            } else {
                numValueOf = null;
            }
            LogUtils.INSTANCE.d(TAG, "query count: " + numValueOf);
            if (cursorQuery != null && cursorQuery.moveToFirst()) {
                deviceByJson = Utils.getDeviceByJson(CursorExtKt.getColumnString$default(cursorQuery, DeviceConstants.KEY_DEVICE_DATA, null, 2, null));
            }
            if (cursorQuery != null) {
            }
        } catch (Throwable th2) {
            th = th2;
            cursorQuery = null;
        }
        return deviceByJson;
    }

    @Override // com.oplus.mydevices.sdk.internal.IDeviceService
    @NotNull
    public List<DeviceInfo> queryDevices() throws Throwable {
        Integer numValueOf;
        List<DeviceInfo> listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        Cursor cursor = null;
        try {
            try {
                ContentResolver mResolver = getMResolver();
                Uri uri = this.mUri;
                Cursor cursorQuery = mResolver.query(uri, null, "authority = ?", new String[]{uri.getAuthority()}, null);
                if (cursorQuery != null) {
                    try {
                        numValueOf = Integer.valueOf(cursorQuery.getCount());
                    } catch (Exception e2) {
                        e = e2;
                        cursor = cursorQuery;
                        LogUtils.INSTANCE.e(TAG, "query error!", e);
                        if (cursor != null) {
                            cursor.close();
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                } else {
                    numValueOf = null;
                }
                LogUtils.INSTANCE.d(TAG, "query count: " + numValueOf);
                HashMap map = new HashMap();
                if (cursorQuery != null && cursorQuery.moveToFirst()) {
                    do {
                        DeviceInfo deviceByJson = Utils.getDeviceByJson(CursorExtKt.getColumnString$default(cursorQuery, DeviceConstants.KEY_DEVICE_DATA, null, 2, null));
                        if (deviceByJson != null) {
                            map.put(deviceByJson.getDeviceId(), deviceByJson);
                        }
                    } while (cursorQuery.moveToNext());
                }
                Collection collectionValues = map.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues, "map.values");
                listEmptyList = CollectionsKt___CollectionsKt.toList(collectionValues);
                LogUtils.INSTANCE.d(TAG, this.mUri + ", query list: " + listEmptyList);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Exception e3) {
                e = e3;
            }
            return listEmptyList;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.oplus.mydevices.sdk.internal.IDeviceService
    public boolean remove(@NotNull DeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        try {
            int iDelete = getMResolver().delete(this.mUri, "device_id = ?", new String[]{deviceInfo.getDeviceId()});
            LogUtils.INSTANCE.d(TAG, "delete devices " + iDelete);
            return iDelete > 0;
        } catch (Throwable unused) {
            LogUtils.INSTANCE.e(TAG, "remove error!");
            return false;
        }
    }

    @Override // com.oplus.mydevices.sdk.internal.IDeviceService
    public boolean update(@NotNull DeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        ContentValues contentValues = new ContentValues();
        Cryptor.EncryptedContainer encryptedContainerEncrypt = Cryptor.INSTANCE.encrypt(Utils.convertToDeviceJson(deviceInfo), deviceInfo.getDeviceId());
        String strSha256 = ShaUtils.sha256(deviceInfo.getMacAddress());
        contentValues.put("device_id", deviceInfo.getDeviceId());
        contentValues.put("device_mac", strSha256);
        contentValues.put(DeviceConstants.KEY_DEVICE_DATA, encryptedContainerEncrypt.text());
        try {
            int iUpdate = getMResolver().update(this.mUri, contentValues, "device_id = ?", new String[]{deviceInfo.getDeviceId()});
            LogUtils.INSTANCE.d(TAG, "update devices " + iUpdate);
            return iUpdate > 0;
        } catch (Exception e2) {
            LogUtils.INSTANCE.e(TAG, "update error", e2);
            return false;
        }
    }
}
