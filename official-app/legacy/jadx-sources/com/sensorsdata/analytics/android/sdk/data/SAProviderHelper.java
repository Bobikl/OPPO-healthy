package com.sensorsdata.analytics.android.sdk.data;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.text.TextUtils;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.sensorsdata.analytics.android.sdk.data.persistent.PersistentLoader;
import com.sensorsdata.analytics.android.sdk.plugin.encrypt.SAStoreManager;
import com.sensorsdata.analytics.android.sdk.util.AppInfoUtils;

/* JADX INFO: loaded from: classes10.dex */
public class SAProviderHelper {
    private static SAProviderHelper INSTANCE = null;
    private static final String TAG = "SA.ProviderHelper";
    private ContentResolver contentResolver;
    private Context mContext;
    private SQLiteOpenHelper mDbHelper;
    private boolean isDbWritable = true;
    private boolean mIsFlushDataState = false;
    private int startActivityCount = 0;
    private long mAppStartTime = 0;
    private int mSessionTime = 30000;

    public interface QueryEventsListener {
        void insert(String str, String str2);
    }

    public interface URI_CODE {
        public static final int ACTIVITY_START_COUNT = 2;
        public static final int APP_EXIT_DATA = 4;
        public static final int APP_PAUSED_TIME = 5;
        public static final int APP_START_TIME = 3;
        public static final int CHANNEL_PERSISTENT = 8;
        public static final int DISABLE_SDK = 11;
        public static final int EVENTS = 1;
        public static final int FIRST_PROCESS_START = 10;
        public static final int FLUSH_DATA = 9;
        public static final int LOGIN_ID = 7;
        public static final int LOGIN_ID_KEY = 14;
        public static final int PUSH_ID_KEY = 15;
        public static final int REMOTE_CONFIG = 12;
        public static final int SESSION_INTERVAL_TIME = 6;
        public static final int USER_IDENTITY_ID = 13;
    }

    private SAProviderHelper(Context context) {
        try {
            this.mDbHelper = new SensorsDataDBHelper(context);
            this.mContext = context.getApplicationContext();
            this.contentResolver = context.getContentResolver();
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    public static synchronized SAProviderHelper getInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = new SAProviderHelper(context);
        }
        return INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SQLiteDatabase getWritableDatabase() {
        try {
            if (!isDBExist()) {
                this.mDbHelper.close();
                this.isDbWritable = true;
            }
            return this.mDbHelper.getWritableDatabase();
        } catch (SQLiteException e2) {
            SALog.printStackTrace(e2);
            this.isDbWritable = false;
            return null;
        }
    }

    private boolean isDBExist() {
        return this.mContext.getDatabasePath(DbParams.DATABASE_NAME).exists();
    }

    public void appendUri(UriMatcher uriMatcher, String str) {
        try {
            uriMatcher.addURI(str, DbParams.TABLE_EVENTS, 1);
            uriMatcher.addURI(str, "activity_started_count", 2);
            uriMatcher.addURI(str, DbParams.TABLE_APP_START_TIME, 3);
            uriMatcher.addURI(str, DbParams.APP_EXIT_DATA, 4);
            uriMatcher.addURI(str, DbParams.TABLE_SESSION_INTERVAL_TIME, 6);
            uriMatcher.addURI(str, DbParams.PersistentName.LOGIN_ID, 7);
            uriMatcher.addURI(str, DbParams.TABLE_CHANNEL_PERSISTENT, 8);
            uriMatcher.addURI(str, DbParams.PersistentName.SUB_PROCESS_FLUSH_DATA, 9);
            uriMatcher.addURI(str, DbParams.TABLE_FIRST_PROCESS_START, 10);
            uriMatcher.addURI(str, DbParams.TABLE_DATA_DISABLE_SDK, 11);
            uriMatcher.addURI(str, DbParams.PersistentName.REMOTE_CONFIG, 12);
            uriMatcher.addURI(str, DbParams.PersistentName.PERSISTENT_USER_ID, 13);
            uriMatcher.addURI(str, DbParams.PersistentName.PERSISTENT_LOGIN_ID_KEY, 14);
            uriMatcher.addURI(str, DbParams.PUSH_ID_KEY, 15);
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    public int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                SQLiteDatabase writableDatabase = this.mDbHelper.getWritableDatabase();
                writableDatabase.beginTransaction();
                int length = contentValuesArr.length;
                for (ContentValues contentValues : contentValuesArr) {
                    insertEvent(uri, contentValues);
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                return length;
            } catch (SQLiteException e2) {
                SALog.printStackTrace(e2);
                return 0;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                sQLiteDatabase.endTransaction();
            }
            throw th;
        }
    }

    public int deleteEvents(String str, String[] strArr) {
        if (!this.isDbWritable) {
            return 0;
        }
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase != null) {
                return writableDatabase.delete(DbParams.TABLE_EVENTS, str, strArr);
            }
        } catch (SQLiteException e2) {
            this.isDbWritable = false;
            SALog.printStackTrace(e2);
        }
        return 0;
    }

    public Uri insertChannelPersistent(Uri uri, ContentValues contentValues) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase != null && contentValues.containsKey(DbParams.KEY_CHANNEL_EVENT_NAME)) {
                return ContentUris.withAppendedId(uri, writableDatabase.insertWithOnConflict(DbParams.TABLE_CHANNEL_PERSISTENT, null, contentValues, 5));
            }
            return uri;
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return uri;
        }
    }

    public Uri insertEvent(Uri uri, ContentValues contentValues) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase != null && contentValues.containsKey("data") && contentValues.containsKey("created_at")) {
                return ContentUris.withAppendedId(uri, writableDatabase.insert(DbParams.TABLE_EVENTS, "_id", contentValues));
            }
            return uri;
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return uri;
        }
    }

    public void insertPersistent(int i, Uri uri, ContentValues contentValues) {
        try {
            switch (i) {
                case 2:
                    this.startActivityCount = contentValues.getAsInteger("activity_started_count").intValue();
                    break;
                case 3:
                    this.mAppStartTime = contentValues.getAsLong(DbParams.TABLE_APP_START_TIME).longValue();
                    break;
                case 4:
                    PersistentLoader.getInstance().getAppExitDataPst().commit(contentValues.getAsString(DbParams.APP_EXIT_DATA));
                    break;
                case 5:
                case 8:
                case 10:
                case 11:
                default:
                    return;
                case 6:
                    this.mSessionTime = contentValues.getAsInteger(DbParams.TABLE_SESSION_INTERVAL_TIME).intValue();
                    this.contentResolver.notifyChange(uri, null);
                    break;
                case 7:
                    PersistentLoader.getInstance().getLoginIdPst().commit(contentValues.getAsString(DbParams.PersistentName.LOGIN_ID));
                    this.contentResolver.notifyChange(uri, null);
                    break;
                case 9:
                    this.mIsFlushDataState = contentValues.getAsBoolean(DbParams.PersistentName.SUB_PROCESS_FLUSH_DATA).booleanValue();
                    break;
                case 12:
                    PersistentLoader.getInstance().getRemoteSDKConfig().commit(contentValues.getAsString(DbParams.PersistentName.REMOTE_CONFIG));
                    break;
                case 13:
                    PersistentLoader.getInstance().getUserIdsPst().commit(contentValues.getAsString(DbParams.PersistentName.PERSISTENT_USER_ID));
                    this.contentResolver.notifyChange(uri, null);
                    break;
                case 14:
                    PersistentLoader.getInstance().getLoginIdKeyPst().commit(contentValues.getAsString(DbParams.PersistentName.PERSISTENT_LOGIN_ID_KEY));
                    break;
                case 15:
                    SAStoreManager.getInstance().setString(contentValues.getAsString(DbParams.PUSH_ID_KEY), contentValues.getAsString(DbParams.PUSH_ID_VALUE));
                    break;
            }
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    public void migratingDB(final Context context) {
        try {
            if (AppInfoUtils.getAppInfoBundle(context).getBoolean("com.sensorsdata.analytics.android.EnableMigratingDB", true)) {
                new Thread(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.data.SAProviderHelper.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            String packageName = context.getPackageName();
                            if (context.getDatabasePath(packageName).exists()) {
                                SALog.i(SAProviderHelper.TAG, "start migratingDB");
                                OldBDatabaseHelper oldBDatabaseHelper = new OldBDatabaseHelper(context, packageName);
                                final SQLiteDatabase writableDatabase = SAProviderHelper.this.getWritableDatabase();
                                if (writableDatabase != null) {
                                    final ContentValues contentValues = new ContentValues();
                                    oldBDatabaseHelper.getAllEvents(writableDatabase, new QueryEventsListener() { // from class: com.sensorsdata.analytics.android.sdk.data.SAProviderHelper.1.1
                                        @Override // com.sensorsdata.analytics.android.sdk.data.SAProviderHelper.QueryEventsListener
                                        public void insert(String str, String str2) {
                                            contentValues.put("data", str);
                                            contentValues.put("created_at", str2);
                                            writableDatabase.insert(DbParams.TABLE_EVENTS, "_id", contentValues);
                                            contentValues.clear();
                                        }
                                    });
                                }
                            }
                            if (SAProviderHelper.this.isDbWritable) {
                                context.deleteDatabase(packageName);
                            }
                        } catch (Exception e2) {
                            SALog.printStackTrace(e2);
                        }
                    }
                }).start();
            } else {
                SALog.i(TAG, "The migrating DB operation is false");
            }
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    public Cursor queryByTable(String str, String[] strArr, String str2, String[] strArr2, String str3) {
        if (!this.isDbWritable) {
            return null;
        }
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase != null) {
                return writableDatabase.query(str, strArr, str2, strArr2, null, null, str3);
            }
            return null;
        } catch (SQLiteException e2) {
            this.isDbWritable = false;
            SALog.printStackTrace(e2);
            return null;
        }
    }

    public Cursor queryPersistent(int i, Uri uri) {
        Object objValueOf;
        String str = DbParams.PUSH_ID_KEY;
        try {
            switch (i) {
                case 2:
                    str = "activity_started_count";
                    objValueOf = Integer.valueOf(this.startActivityCount);
                    break;
                case 3:
                    Long lValueOf = Long.valueOf(this.mAppStartTime);
                    str = DbParams.TABLE_APP_START_TIME;
                    objValueOf = lValueOf;
                    break;
                case 4:
                    String str2 = PersistentLoader.getInstance().getAppExitDataPst().get();
                    boolean zIsEmpty = TextUtils.isEmpty(str2);
                    String str3 = str2;
                    if (zIsEmpty) {
                        String str4 = PersistentLoader.getInstance().getAppEndDataPst().get();
                        PersistentLoader.getInstance().getAppEndDataPst().remove();
                        str3 = str4;
                    }
                    str = DbParams.APP_EXIT_DATA;
                    objValueOf = str3;
                    break;
                case 5:
                case 8:
                case 10:
                case 11:
                default:
                    objValueOf = null;
                    str = null;
                    break;
                case 6:
                    Integer numValueOf = Integer.valueOf(this.mSessionTime);
                    str = DbParams.TABLE_SESSION_INTERVAL_TIME;
                    objValueOf = numValueOf;
                    break;
                case 7:
                    String str5 = PersistentLoader.getInstance().getLoginIdPst().get();
                    str = DbParams.PersistentName.LOGIN_ID;
                    objValueOf = str5;
                    break;
                case 9:
                    Integer numValueOf2 = Integer.valueOf(this.mIsFlushDataState ? 1 : 0);
                    str = DbParams.PersistentName.SUB_PROCESS_FLUSH_DATA;
                    objValueOf = numValueOf2;
                    break;
                case 12:
                    str = null;
                    objValueOf = PersistentLoader.getInstance().getRemoteSDKConfig().get();
                    break;
                case 13:
                    String str6 = PersistentLoader.getInstance().getUserIdsPst().get();
                    str = DbParams.PersistentName.PERSISTENT_USER_ID;
                    objValueOf = str6;
                    break;
                case 14:
                    String str7 = PersistentLoader.getInstance().getLoginIdKeyPst().get();
                    str = DbParams.PersistentName.PERSISTENT_LOGIN_ID_KEY;
                    objValueOf = str7;
                    break;
                case 15:
                    objValueOf = SAStoreManager.getInstance().getString(uri.getQueryParameter(DbParams.PUSH_ID_KEY), "");
                    break;
            }
            MatrixCursor matrixCursor = new MatrixCursor(new String[]{str});
            matrixCursor.addRow(new Object[]{objValueOf});
            return matrixCursor;
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return null;
        }
    }

    public int removeSP(String str) {
        SAStoreManager.getInstance().remove(str);
        return 1;
    }
}
