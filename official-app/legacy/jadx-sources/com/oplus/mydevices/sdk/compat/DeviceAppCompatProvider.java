package com.oplus.mydevices.sdk.compat;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes8.dex */
public abstract class DeviceAppCompatProvider extends ContentProvider {
    private static final String TAG = "DeviceAppProvider";
    public static final int URL_CODE_ACTION_MENU = 2;
    public static final int URL_CODE_DEVICE_INFO = 1;
    public static final int URL_CODE_INTENT_EXTRA = 3;
    private DeviceInfoDbOpenHelper mDbOpenHelper;
    protected UriMatcher mUriMatcher = new UriMatcher(-1);

    private void initUriMatcher() {
        String providerAuthority = getProviderAuthority();
        if (providerAuthority == null || providerAuthority.isEmpty()) {
            OLog.e(TAG, "initUriMatcher failed. Must provide correct authority string by override onCreateAuthority.");
            return;
        }
        this.mUriMatcher.addURI(providerAuthority, DeviceInfoDbOpenHelper.DEVICE_INFO_TABLE_NAME, 1);
        this.mUriMatcher.addURI(providerAuthority, DeviceInfoDbOpenHelper.ACTION_MENU_TABLE_NAME, 2);
        this.mUriMatcher.addURI(providerAuthority, DeviceInfoDbOpenHelper.INTENT_EXTRA_TABLE_NAME, 3);
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        String str2;
        OLog.d(TAG, "delete uri: " + uri + ", selection: " + str);
        if (uri == null) {
            OLog.e(TAG, "delete failed for uri illegal.");
            return 0;
        }
        SQLiteDatabase writableDatabase = this.mDbOpenHelper.getWritableDatabase();
        if (writableDatabase == null) {
            OLog.e(TAG, "delete failed for dp open failed.");
            return 0;
        }
        int iMatch = this.mUriMatcher.match(uri);
        OLog.d(TAG, "delete uriMatchCode: " + iMatch);
        if (iMatch == 1) {
            str2 = DeviceInfoDbOpenHelper.DEVICE_INFO_TABLE_NAME;
        } else if (iMatch != 2) {
            str2 = iMatch != 3 ? null : DeviceInfoDbOpenHelper.INTENT_EXTRA_TABLE_NAME;
        } else {
            str2 = DeviceInfoDbOpenHelper.ACTION_MENU_TABLE_NAME;
        }
        if (str2 == null) {
            OLog.e(TAG, "delete failed for nonsupport uri.");
            return 0;
        }
        int iDelete = writableDatabase.delete(str2, str, strArr);
        OLog.d(TAG, "delete uriMatchCode:" + iMatch + ", count:" + iDelete);
        return iDelete;
    }

    public abstract int getDatabaseVersion();

    public abstract String getProviderAuthority();

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        OLog.d(TAG, "getType");
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        String str;
        OLog.d(TAG, "insert uri:" + uri);
        if (uri == null) {
            OLog.e(TAG, "insert failed for uri null.");
            return null;
        }
        if (contentValues == null || contentValues.size() == 0) {
            OLog.w(TAG, "insert failed for values empty.");
            return null;
        }
        SQLiteDatabase writableDatabase = this.mDbOpenHelper.getWritableDatabase();
        if (writableDatabase == null) {
            OLog.e(TAG, "insert failed for dp open failed.");
            return null;
        }
        int iMatch = this.mUriMatcher.match(uri);
        OLog.d(TAG, "insert urlMatchCode: " + iMatch);
        if (iMatch == 1) {
            str = DeviceInfoDbOpenHelper.DEVICE_INFO_TABLE_NAME;
        } else if (iMatch != 2) {
            str = iMatch != 3 ? null : DeviceInfoDbOpenHelper.INTENT_EXTRA_TABLE_NAME;
        } else {
            str = DeviceInfoDbOpenHelper.ACTION_MENU_TABLE_NAME;
        }
        if (str == null) {
            OLog.e(TAG, "insert failed for nonsupport uri.");
        } else if (-1 == writableDatabase.insert(str, null, contentValues)) {
            OLog.e(TAG, "insert failed -1");
        }
        return uri;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        OLog.init(context);
        OLog.d(TAG, "onCreate");
        this.mDbOpenHelper = new DeviceInfoDbOpenHelper(context, getDatabaseVersion());
        initUriMatcher();
        return true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    @SuppressLint({"ResourceType"})
    public AssetFileDescriptor openAssetFile(@NonNull Uri uri, @NonNull String str) throws SecurityException, FileNotFoundException {
        OLog.d(TAG, "openAssetFile with uri: " + uri + ", mode: " + str);
        String lastPathSegment = uri.getLastPathSegment();
        if (!"r".equals(str)) {
            OLog.e(TAG, "openAssetFile, Only read-only access is supported, mode must be [r].");
            throw new SecurityException();
        }
        if (lastPathSegment == null || lastPathSegment.isEmpty()) {
            OLog.e(TAG, "openAssetFile: illegal resId:");
            throw new FileNotFoundException();
        }
        Context context = getContext();
        if (context == null) {
            OLog.w(TAG, "openAssetFile: failed to get context");
            return null;
        }
        try {
            try {
                return context.getResources().openRawResourceFd(Integer.parseInt(lastPathSegment));
            } catch (Resources.NotFoundException e2) {
                e2.printStackTrace();
                throw new FileNotFoundException();
            }
        } catch (NumberFormatException e3) {
            e3.printStackTrace();
            throw new FileNotFoundException();
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0074  */
    /* JADX WARN: Instruction removed from duplicated block: B:22:0x005f, please report this as an issue */
    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        String str3;
        String str4;
        OLog.d(TAG, "query uri: " + uri);
        if (uri == null) {
            OLog.e(TAG, "query failed for uri null.");
            return null;
        }
        SQLiteDatabase readableDatabase = this.mDbOpenHelper.getReadableDatabase();
        if (readableDatabase == null) {
            OLog.e(TAG, "query failed for dp open failed.");
            return null;
        }
        int iMatch = this.mUriMatcher.match(uri);
        OLog.d(TAG, "query urlMatchCode: " + iMatch);
        if (iMatch == 1) {
            str3 = DeviceInfoDbOpenHelper.DEVICE_INFO_TABLE_NAME;
        } else {
            if (iMatch != 2) {
                if (iMatch != 3) {
                    str4 = null;
                } else {
                    str3 = DeviceInfoDbOpenHelper.INTENT_EXTRA_TABLE_NAME;
                }
                if (str4 == null) {
                    return readableDatabase.query(str4, strArr, str, strArr2, null, null, str2, null);
                }
                OLog.e(TAG, "query failed for nonsupport uri: " + uri);
                return null;
            }
            str3 = DeviceInfoDbOpenHelper.ACTION_MENU_TABLE_NAME;
        }
        str4 = str3;
        if (str4 == null) {
            return readableDatabase.query(str4, strArr, str, strArr2, null, null, str2, null);
        }
        OLog.e(TAG, "query failed for nonsupport uri: " + uri);
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        String str2;
        OLog.d(TAG, "update uri: " + uri + ", selection: " + str);
        if (uri == null) {
            OLog.e(TAG, "update failed for uri null.");
            return 0;
        }
        if (contentValues == null || contentValues.size() == 0) {
            OLog.w(TAG, "update failed for values empty.");
            return 0;
        }
        SQLiteDatabase writableDatabase = this.mDbOpenHelper.getWritableDatabase();
        if (writableDatabase == null) {
            OLog.e(TAG, "update failed for dp open failed.");
            return 0;
        }
        int iMatch = this.mUriMatcher.match(uri);
        OLog.d(TAG, "update uriMatchCode: " + iMatch);
        if (iMatch == 1) {
            str2 = DeviceInfoDbOpenHelper.DEVICE_INFO_TABLE_NAME;
        } else if (iMatch != 2) {
            str2 = iMatch != 3 ? null : DeviceInfoDbOpenHelper.INTENT_EXTRA_TABLE_NAME;
        } else {
            str2 = DeviceInfoDbOpenHelper.ACTION_MENU_TABLE_NAME;
        }
        if (str2 == null) {
            OLog.e(TAG, "update failed for nonsupport uri.");
            return 0;
        }
        int iUpdate = writableDatabase.update(str2, contentValues, str, strArr);
        OLog.d(TAG, "update uriMatchCode:" + iMatch + ", count:" + iUpdate);
        return iUpdate;
    }
}
