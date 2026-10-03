package com.oplus.mydevices.sdk.compat;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.heytap.health.watch.notification.impl.pull.NotificationApiService;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public class DeviceInfoHelper {
    private static final String TAG = "DeviceInfoHelper";
    private Context mContext;

    public DeviceInfoHelper(@NonNull Context context) {
        this.mContext = context;
    }

    @SuppressLint({"Range"})
    private ActionMenu createActionMenuItemFromCursor(Cursor cursor) {
        String string = cursor.getString(cursor.getColumnIndex("device_id"));
        String string2 = cursor.getString(cursor.getColumnIndex("menu_id"));
        String string3 = cursor.getString(cursor.getColumnIndex(ActionMenu.DB_KEY_ACTION_MENU_NAME));
        int i = cursor.getInt(cursor.getColumnIndex(ActionMenu.DB_KEY_ACTION_MENU_ICON_RES_ID));
        int i2 = cursor.getInt(cursor.getColumnIndex(ActionMenu.DB_KEY_ACTION_MENU_ICON_RES_ID_DARK));
        String string4 = cursor.getString(cursor.getColumnIndex(ActionMenu.DB_KEY_ACTION_MENU_ACTION_TYPE));
        String string5 = cursor.getString(cursor.getColumnIndex(ActionMenu.DB_KEY_ACTION_MENU_INTENT_ACTION));
        String string6 = cursor.getString(cursor.getColumnIndex(ActionMenu.DB_KEY_ACTION_MENU_INTENT_PACKAGE));
        String string7 = cursor.getString(cursor.getColumnIndex(ActionMenu.DB_KEY_ACTION_MENU_INTENT_CLASS));
        int i3 = cursor.getInt(cursor.getColumnIndex(ActionMenu.DB_KEY_ACTION_MENU_INTENT_HAVE_EXTRA));
        ActionMenu actionMenu = new ActionMenu(string, string2);
        actionMenu.setMenuName(string3);
        actionMenu.setMenuIconResId(i);
        actionMenu.setMenuIconResIdDark(i2);
        actionMenu.setMenuActionType(string4);
        actionMenu.setMenuIntentAction(string5);
        actionMenu.setMenuIntentPackage(string6);
        actionMenu.setMenuIntentClass(string7);
        actionMenu.setMenuIntentHaveExtra(i3);
        OLog.d(TAG, actionMenu.toString());
        return actionMenu;
    }

    @SuppressLint({"Range"})
    private DeviceInfoCompat createDeviceInfoFromCursor(Cursor cursor) {
        String string = cursor.getString(cursor.getColumnIndex("device_id"));
        String string2 = cursor.getString(cursor.getColumnIndex(DeviceInfoCompat.DB_KEY_DEVICE_NAME));
        int i = cursor.getInt(cursor.getColumnIndex(DeviceInfoCompat.DB_KEY_DEVICE_ICON_RES_ID));
        int i2 = cursor.getInt(cursor.getColumnIndex(DeviceInfoCompat.DB_KEY_DEVICE_ICON_RES_ID_DARK));
        String string3 = cursor.getString(cursor.getColumnIndex("device_type"));
        String string4 = cursor.getString(cursor.getColumnIndex(DeviceInfoCompat.DB_KEY_DEVICE_STATE));
        DeviceInfoCompat deviceInfoCompat = new DeviceInfoCompat(string);
        deviceInfoCompat.setDeviceName(string2);
        deviceInfoCompat.setDeviceIconResId(i);
        deviceInfoCompat.setDeviceIconResIdDark(i2);
        deviceInfoCompat.setDeviceType(string3);
        deviceInfoCompat.setDeviceState(string4);
        OLog.d(TAG, deviceInfoCompat.toString());
        return deviceInfoCompat;
    }

    @SuppressLint({"Range"})
    private IntentExtra createIntentExtraFromCursor(Cursor cursor) {
        String string = cursor.getString(cursor.getColumnIndex("device_id"));
        String string2 = cursor.getString(cursor.getColumnIndex("menu_id"));
        String string3 = cursor.getString(cursor.getColumnIndex(IntentExtra.DB_KEY_INTENT_EXTRA_KEY));
        String string4 = cursor.getString(cursor.getColumnIndex(IntentExtra.DB_KEY_INTENT_EXTRA_VALUE));
        IntentExtra intentExtra = new IntentExtra(string, string2);
        intentExtra.setIntentExtraKey(string3);
        intentExtra.setIntentExtraValue(string4);
        OLog.d(TAG, intentExtra.toString());
        return intentExtra;
    }

    private String genContentAuthority(String str) {
        return NotificationApiService.CONTENT + str;
    }

    private Uri getUri(String str, String str2) {
        if (str != null && !str.isEmpty()) {
            return (str2 == null || str2.isEmpty()) ? Uri.parse(genContentAuthority(str)).buildUpon().build() : Uri.parse(genContentAuthority(str)).buildUpon().appendPath(str2).build();
        }
        OLog.e(TAG, "getUri, authority is empty!");
        throw new IllegalArgumentException("authority is null or empty.");
    }

    private void insertActionMenuToProvider(ActionMenu actionMenu, String str) {
        if (paramCheckFail("insertActionMenuToProvider", actionMenu, str)) {
            OLog.e(TAG, "insertActionMenuToProvider failed for illegal params!");
            return;
        }
        Uri uri = getUri(str, DeviceInfoDbOpenHelper.ACTION_MENU_TABLE_NAME);
        ContentValues contentValues = new ContentValues();
        actionMenu.saveToContentValues(contentValues);
        this.mContext.getContentResolver().insert(uri, contentValues);
        ArrayList<IntentExtra> intentExtraList = actionMenu.getIntentExtraList();
        int size = intentExtraList.size();
        if (size <= 0) {
            OLog.w(TAG, "insertActionMenuToProvider ignore for intent extra list empty!");
            return;
        }
        for (int i = 0; i < size; i++) {
            insertIntentExtraToProvider(intentExtraList.get(i), str);
        }
    }

    private void insertIntentExtraToProvider(IntentExtra intentExtra, String str) {
        if (paramCheckFail("insertIntentExtraToProvider", intentExtra, str)) {
            OLog.e(TAG, "insertIntentExtraToProvider failed for illegal params!");
            return;
        }
        Uri uri = getUri(str, DeviceInfoDbOpenHelper.INTENT_EXTRA_TABLE_NAME);
        ContentValues contentValues = new ContentValues();
        intentExtra.saveToContentValues(contentValues);
        this.mContext.getContentResolver().insert(uri, contentValues);
    }

    private boolean paramCheckFail(String str, String str2) {
        if (str2 == null || str2.isEmpty()) {
            OLog.e(TAG, "paramCheck[" + str + "] failed for illegal authority!");
            return true;
        }
        if (this.mContext != null) {
            return false;
        }
        OLog.e(TAG, "paramCheck[" + str + "] failed for context empty!");
        return true;
    }

    private ArrayList<ActionMenu> queryActionMenuFromProvider(@NonNull String str, String str2) {
        ArrayList<ActionMenu> arrayList = new ArrayList<>();
        if (paramCheckFail("queryActionMenuFromProvider", str2)) {
            OLog.e(TAG, "queryActionMenuFromProvider failed for illegal params!");
            return arrayList;
        }
        ContentResolver contentResolver = this.mContext.getContentResolver();
        Uri uri = getUri(str2, DeviceInfoDbOpenHelper.ACTION_MENU_TABLE_NAME);
        OLog.d(TAG, "queryActionMenuFromProvider, uri:" + uri);
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = contentResolver.query(uri, null, "device_id = ?", new String[]{str}, null);
                if (cursorQuery != null) {
                    OLog.d(TAG, "queryActionMenuFromProvider, cursor count:" + cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        ActionMenu actionMenuCreateActionMenuItemFromCursor = createActionMenuItemFromCursor(cursorQuery);
                        actionMenuCreateActionMenuItemFromCursor.setAuthority(str2);
                        if (1 == actionMenuCreateActionMenuItemFromCursor.getMenuIntentHaveExtra()) {
                            actionMenuCreateActionMenuItemFromCursor.getIntentExtraList().addAll(queryIntentExtraFromProvider(actionMenuCreateActionMenuItemFromCursor.getDeviceId(), actionMenuCreateActionMenuItemFromCursor.getMenuId(), str2));
                        }
                        arrayList.add(actionMenuCreateActionMenuItemFromCursor);
                    }
                } else {
                    OLog.e(TAG, "queryActionMenuFromProvider, query provider, no record.");
                }
            } catch (Exception e2) {
                OLog.e(TAG, "queryActionMenuFromProvider" + e2.getMessage());
            }
            return arrayList;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    private ArrayList<IntentExtra> queryIntentExtraFromProvider(@NonNull String str, @NonNull String str2, String str3) {
        ArrayList<IntentExtra> arrayList = new ArrayList<>();
        if (paramCheckFail("queryIntentExtraFromProvider", str3)) {
            OLog.e(TAG, "queryIntentExtraFromProvider failed for illegal params!");
            return arrayList;
        }
        ContentResolver contentResolver = this.mContext.getContentResolver();
        Uri uri = getUri(str3, DeviceInfoDbOpenHelper.INTENT_EXTRA_TABLE_NAME);
        OLog.d(TAG, "queryIntentExtraFromProvider, uri:" + uri);
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = contentResolver.query(uri, null, "device_id = ? and menu_id = ?", new String[]{str, str2}, null);
                if (cursorQuery != null) {
                    OLog.d(TAG, "queryIntentExtraFromProvider, cursor count:" + cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        arrayList.add(createIntentExtraFromCursor(cursorQuery));
                    }
                } else {
                    OLog.e(TAG, "queryIntentExtraFromProvider, query provider, no record.");
                }
            } catch (Exception e2) {
                OLog.e(TAG, "queryIntentExtraFromProvider" + e2.getMessage());
            }
            return arrayList;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    private boolean updateActionMenuToProvider(ActionMenu actionMenu, String str) {
        int iUpdate;
        if (paramCheckFail("updateActionMenuToProvider", actionMenu, str)) {
            OLog.e(TAG, "updateActionMenuToProvider failed for illegal params!");
            return false;
        }
        ContentResolver contentResolver = this.mContext.getContentResolver();
        Uri uri = getUri(str, DeviceInfoDbOpenHelper.ACTION_MENU_TABLE_NAME);
        OLog.d(TAG, "updateActionMenuToProvider, uri:" + uri);
        ContentValues contentValues = new ContentValues();
        actionMenu.saveToContentValues(contentValues);
        try {
            iUpdate = contentResolver.update(uri, contentValues, "device_id = ? and menu_id = ?", new String[]{actionMenu.getDeviceId(), actionMenu.getMenuId()});
        } catch (Exception e2) {
            OLog.e(TAG, "updateActionMenuToProvider" + e2.getMessage());
            iUpdate = 0;
        }
        OLog.d(TAG, "updateActionMenuToProvider finish, updatedRow:" + iUpdate + ", " + actionMenu.toString());
        return iUpdate > 0;
    }

    public boolean deleteDeviceInfoFromProvider(@Nullable String str, String str2) {
        String[] strArr;
        String str3;
        if (paramCheckFail("deleteDeviceInfoFromProvider", str2)) {
            OLog.e(TAG, "deleteDeviceInfoFromProvider failed for illegal params!");
            return false;
        }
        ContentResolver contentResolver = this.mContext.getContentResolver();
        Uri uri = getUri(str2, DeviceInfoDbOpenHelper.DEVICE_INFO_TABLE_NAME);
        Uri uri2 = getUri(str2, DeviceInfoDbOpenHelper.ACTION_MENU_TABLE_NAME);
        Uri uri3 = getUri(str2, DeviceInfoDbOpenHelper.INTENT_EXTRA_TABLE_NAME);
        if (str == null || str.isEmpty()) {
            strArr = null;
            str3 = null;
        } else {
            strArr = new String[]{str};
            str3 = "device_id = ?";
        }
        contentResolver.delete(uri, str3, strArr);
        contentResolver.delete(uri2, str3, strArr);
        contentResolver.delete(uri3, str3, strArr);
        return true;
    }

    public void insertDeviceInfoToProvider(DeviceInfoCompat deviceInfoCompat, String str) {
        if (paramCheckFail("insertDeviceInfoToProvider", deviceInfoCompat, str)) {
            OLog.e(TAG, "insertDeviceInfoToProvider failed for illegal params!");
            return;
        }
        Uri uri = getUri(str, DeviceInfoDbOpenHelper.DEVICE_INFO_TABLE_NAME);
        ContentValues contentValues = new ContentValues();
        deviceInfoCompat.saveToContentValues(contentValues);
        this.mContext.getContentResolver().insert(uri, contentValues);
        ArrayList<ActionMenu> actionMenuList = deviceInfoCompat.getActionMenuList();
        int size = actionMenuList.size();
        if (size <= 0) {
            OLog.w(TAG, "insertActionMenuToProvider ignore for action menu list empty!");
            return;
        }
        for (int i = 0; i < size; i++) {
            insertActionMenuToProvider(actionMenuList.get(i), str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0082 A[EXC_TOP_SPLITTER, PHI: r7 r8
  0x0082: PHI (r7v8 ??) = (r7v6 ??), (r7v7 ??), (r7v9 ??) binds: [B:43:0x00a1, B:52:0x00b6, B:30:0x0080] A[DONT_GENERATE, DONT_INLINE]
  0x0082: PHI (r8v7 ??) = (r8v5 ??), (r8v6 ??), (r8v13 ??) binds: [B:43:0x00a1, B:52:0x00b6, B:30:0x0080] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.content.ContentResolver] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.net.Uri, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [android.content.res.AssetFileDescriptor] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [android.content.res.AssetFileDescriptor] */
    /* JADX WARN: Type inference failed for: r7v9, types: [android.content.res.AssetFileDescriptor] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [android.graphics.Bitmap] */
    @RequiresApi(api = 29)
    public Bitmap loadBitmapFromAssetFile(String str, @IdRes int i) throws Throwable {
        ?? r8;
        ?? r4 = 0;
        Bitmap bitmapDecodeStream = null;
         = 0;
        ?? r5 = 0;
         = 0;
         = 0;
        ?? r6 = 0;
        r4 = 0;
        ?? r7 = 0;
        ?? r9 = 0;
        if (paramCheckFail("queryIntentExtraFromProvider", str)) {
            OLog.e(TAG, "queryIntentExtraFromProvider failed for illegal params!");
            return null;
        }
        ?? contentResolver = this.mContext.getContentResolver();
        ?? uri = getUri(str, String.valueOf(i));
        OLog.d(TAG, "queryIntentExtraFromProvider, uri:" + uri);
        try {
            try {
                uri = contentResolver.openAssetFile(uri, "r", null);
                try {
                    if (uri != 0) {
                        OLog.d(TAG, "queryIntentExtraFromProvider open pass.");
                        ?? CreateInputStream = uri.createInputStream();
                        try {
                            if (CreateInputStream != 0) {
                                bitmapDecodeStream = BitmapFactory.decodeStream(CreateInputStream);
                                OLog.d(TAG, "queryIntentExtraFromProvider create bitmap success.");
                            } else {
                                OLog.w(TAG, "queryIntentExtraFromProvider createInputStream failed.");
                            }
                            Bitmap bitmap = bitmapDecodeStream;
                            r5 = CreateInputStream;
                            CreateInputStream = bitmap;
                            r6 = r5;
                            r8 = CreateInputStream;
                        } catch (FileNotFoundException e2) {
                            e = e2;
                            ?? r10 = r5;
                            r7 = CreateInputStream;
                            r8 = r10;
                            uri = uri;
                            e.printStackTrace();
                            OLog.w(TAG, "queryIntentExtraFromProvider open failed.");
                            if (r7 != 0) {
                                try {
                                    r7.close();
                                } catch (Exception unused) {
                                    OLog.e(TAG, "queryIntentExtraFromProvider close input stream failed.");
                                }
                            }
                            if (uri != 0) {
                                try {
                                    uri.close();
                                } catch (Exception unused2) {
                                    OLog.e(TAG, "queryIntentExtraFromProvider close fd failed.");
                                }
                            }
                        } catch (IOException e3) {
                            e = e3;
                            ?? r11 = r5;
                            r9 = CreateInputStream;
                            r8 = r11;
                            uri = uri;
                            e.printStackTrace();
                            OLog.w(TAG, "queryIntentExtraFromProvider open failed for io.");
                            if (r9 != 0) {
                                try {
                                    r9.close();
                                } catch (Exception unused3) {
                                    OLog.e(TAG, "queryIntentExtraFromProvider close input stream failed.");
                                }
                            }
                            if (uri != 0) {
                                uri.close();
                            }
                        } catch (Throwable th) {
                            th = th;
                            r4 = CreateInputStream;
                            if (r4 != 0) {
                                try {
                                    r4.close();
                                } catch (Exception unused4) {
                                    OLog.e(TAG, "queryIntentExtraFromProvider close input stream failed.");
                                }
                            }
                            if (uri == 0) {
                                throw th;
                            }
                            try {
                                uri.close();
                                throw th;
                            } catch (Exception unused5) {
                                OLog.e(TAG, "queryIntentExtraFromProvider close fd failed.");
                                throw th;
                            }
                        }
                    } else {
                        OLog.w(TAG, "queryIntentExtraFromProvider open failed.");
                        r8 = 0;
                    }
                    if (r6 != 0) {
                        try {
                            r6.close();
                        } catch (Exception unused6) {
                            OLog.e(TAG, "queryIntentExtraFromProvider close input stream failed.");
                        }
                    }
                    if (uri != 0) {
                        uri.close();
                    }
                } catch (FileNotFoundException e4) {
                    e = e4;
                    r8 = r6;
                    r7 = r6;
                    uri = uri;
                } catch (IOException e5) {
                    e = e5;
                    r8 = r6;
                    r9 = r6;
                    uri = uri;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (FileNotFoundException e6) {
            e = e6;
            uri = 0;
            r8 = 0;
        } catch (IOException e7) {
            e = e7;
            uri = 0;
            r8 = 0;
        } catch (Throwable th3) {
            th = th3;
            uri = 0;
        }
        return r8;
    }

    public void notifyProviderChange(String str) {
        if (paramCheckFail("notifyProviderChange", str)) {
            OLog.e(TAG, "notifyProviderChange failed for illegal params!");
        } else {
            this.mContext.getContentResolver().notifyChange(getUri(str, null), null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0051 A[Catch: all -> 0x0077, Exception -> 0x007a, TRY_ENTER, TryCatch #4 {Exception -> 0x007a, all -> 0x0077, blocks: (B:14:0x0051, B:16:0x006f, B:21:0x007f), top: B:39:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:16:0x006f A[Catch: all -> 0x0077, Exception -> 0x007a, TryCatch #4 {Exception -> 0x007a, all -> 0x0077, blocks: (B:14:0x0051, B:16:0x006f, B:21:0x007f), top: B:39:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:21:0x007f A[Catch: all -> 0x0077, Exception -> 0x007a, TRY_LEAVE, TryCatch #4 {Exception -> 0x007a, all -> 0x0077, blocks: (B:14:0x0051, B:16:0x006f, B:21:0x007f), top: B:39:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0086  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00af  */
    /* JADX WARN: Code duplicated, block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:14:0x0051, please report this as an issue */
    public DeviceInfoCompat queryDeviceInfoFromProvider(@Nullable String str, String str2) throws Throwable {
        Cursor cursorQuery;
        Throwable th;
        DeviceInfoCompat deviceInfoCompat;
        Exception e2;
        Cursor cursor = null;
        deviceInfoCompatCreateDeviceInfoFromCursor = null;
        deviceInfoCompatCreateDeviceInfoFromCursor = null;
        DeviceInfoCompat deviceInfoCompatCreateDeviceInfoFromCursor = null;
        cursor = null;
        if (paramCheckFail("logTag", str2)) {
            OLog.e(TAG, "queryDeviceInfoFromProvider failed for illegal params!");
            return null;
        }
        ContentResolver contentResolver = this.mContext.getContentResolver();
        Uri uri = getUri(str2, DeviceInfoDbOpenHelper.DEVICE_INFO_TABLE_NAME);
        OLog.d(TAG, "queryDeviceInfoFromProvider uri:" + uri);
        try {
            if (str != null) {
                try {
                    try {
                        if (!str.isEmpty()) {
                            cursorQuery = contentResolver.query(uri, null, "device_id = ?", new String[]{str}, null);
                        }
                        if (cursorQuery != null) {
                            OLog.d(TAG, "queryDeviceInfoFromProvider, count:" + cursorQuery.getCount());
                            if (cursorQuery.moveToFirst()) {
                                deviceInfoCompatCreateDeviceInfoFromCursor = createDeviceInfoFromCursor(cursorQuery);
                                deviceInfoCompatCreateDeviceInfoFromCursor.setAuthority(str2);
                            }
                        } else {
                            OLog.e(TAG, "queryDeviceInfoFromProvider, query provider, no record");
                        }
                        if (cursorQuery != null) {
                            return deviceInfoCompatCreateDeviceInfoFromCursor;
                        }
                        cursorQuery.close();
                        return deviceInfoCompatCreateDeviceInfoFromCursor;
                    } catch (Exception e3) {
                        e2 = e3;
                        deviceInfoCompat = null;
                        OLog.e(TAG, "queryDeviceInfoFromProvider" + e2.getMessage());
                        if (cursor != null) {
                            cursor.close();
                        }
                        return deviceInfoCompat;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                OLog.d(TAG, "queryDeviceInfoFromProvider, count:" + cursorQuery.getCount());
                if (cursorQuery.moveToFirst()) {
                    deviceInfoCompatCreateDeviceInfoFromCursor = createDeviceInfoFromCursor(cursorQuery);
                    deviceInfoCompatCreateDeviceInfoFromCursor.setAuthority(str2);
                }
            } else {
                OLog.e(TAG, "queryDeviceInfoFromProvider, query provider, no record");
            }
            if (cursorQuery != null) {
                return deviceInfoCompatCreateDeviceInfoFromCursor;
            }
            cursorQuery.close();
            return deviceInfoCompatCreateDeviceInfoFromCursor;
        } catch (Exception e4) {
            e2 = e4;
            DeviceInfoCompat deviceInfoCompat2 = deviceInfoCompatCreateDeviceInfoFromCursor;
            cursor = cursorQuery;
            deviceInfoCompat = deviceInfoCompat2;
            OLog.e(TAG, "queryDeviceInfoFromProvider" + e2.getMessage());
            if (cursor != null) {
                cursor.close();
            }
            return deviceInfoCompat;
        } catch (Throwable th3) {
            th = th3;
            cursor = cursorQuery;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        cursorQuery = contentResolver.query(uri, null, null, null, null);
    }

    public boolean updateDeviceInfoToProvider(DeviceInfoCompat deviceInfoCompat, String str, boolean z) {
        int iUpdate;
        if (paramCheckFail("updateDeviceInfoToProvider", deviceInfoCompat, str)) {
            OLog.e(TAG, "updateDeviceInfoToProvider failed for illegal params!");
            return false;
        }
        ContentResolver contentResolver = this.mContext.getContentResolver();
        Uri uri = getUri(str, DeviceInfoDbOpenHelper.DEVICE_INFO_TABLE_NAME);
        OLog.d(TAG, "updateDeviceInfoToProvider, uri:" + uri);
        ContentValues contentValues = new ContentValues();
        deviceInfoCompat.saveToContentValues(contentValues);
        boolean zUpdateActionMenuToProvider = true;
        try {
            iUpdate = contentResolver.update(uri, contentValues, "device_id = ?", new String[]{deviceInfoCompat.getDeviceId()});
            try {
                OLog.d(TAG, "updateDeviceInfoToProvider finish, updatedRow:" + iUpdate + ", " + deviceInfoCompat.toString());
            } catch (Exception e2) {
                e = e2;
                OLog.e(TAG, "updateDeviceInfoToProvider" + e.getMessage());
            }
        } catch (Exception e3) {
            e = e3;
            iUpdate = 0;
        }
        if (iUpdate <= 0) {
            return false;
        }
        if (z) {
            return true;
        }
        ArrayList<ActionMenu> actionMenuList = deviceInfoCompat.getActionMenuList();
        int size = actionMenuList.size();
        if (size <= 0) {
            OLog.w(TAG, "updateActionMenuToProvider ignore for action menu list empty!");
            return true;
        }
        for (int i = 0; i < size; i++) {
            zUpdateActionMenuToProvider &= updateActionMenuToProvider(actionMenuList.get(i), str);
        }
        return zUpdateActionMenuToProvider;
    }

    private boolean paramCheckFail(String str, Object obj, String str2) {
        if (obj == null) {
            OLog.e(TAG, "paramCheck[" + str + "] failed for illegal dataObj!");
            return true;
        }
        if (str2 != null && !str2.isEmpty()) {
            if (this.mContext != null) {
                return false;
            }
            OLog.e(TAG, "paramCheck[" + str + "] failed for context empty!");
            return true;
        }
        OLog.e(TAG, "paramCheck[" + str + "] failed for illegal authority!");
        return true;
    }
}
