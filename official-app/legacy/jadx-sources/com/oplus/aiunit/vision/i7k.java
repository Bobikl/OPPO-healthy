package com.oplus.aiunit.vision;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: loaded from: classes8.dex */
public class i7k extends SQLiteOpenHelper {
    public static volatile i7k i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static volatile SQLiteDatabase f12414j;

    public i7k(Context context) {
        super(context, "track_crash_collector_db", (SQLiteDatabase.CursorFactory) null, 1);
    }

    public static SQLiteDatabase i() {
        if (i == null) {
            synchronized (i7k.class) {
                if (i == null) {
                    i = new i7k(w84.a());
                }
            }
        }
        if (f12414j == null || !f12414j.isOpen()) {
            synchronized (i7k.class) {
                if (f12414j == null || !f12414j.isOpen()) {
                    f12414j = i.getWritableDatabase();
                }
            }
        }
        return f12414j;
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE table_exception_cache (_id INTEGER PRIMARY KEY AUTOINCREMENT,module_id INTEGER,event_time INTEGER,exception Text,count INTEGER,module_version Text,md5 Text,kv_properties Text);");
    }

    public final void g(SQLiteDatabase sQLiteDatabase, String[] strArr) {
        int i2 = 0;
        while (strArr != null) {
            try {
                if (i2 >= strArr.length) {
                    return;
                }
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + strArr[i2]);
                i2++;
            } catch (Exception unused) {
                return;
            }
        }
    }

    public final String h(SQLiteDatabase sQLiteDatabase, String str) throws Throwable {
        String[] strArr;
        Cursor cursor = null;
        strArr = null;
        String[] strArr2 = null;
        Cursor cursor2 = null;
        try {
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery("PRAGMA table_info(" + str + ")", null);
            if (cursorRawQuery != null) {
                try {
                    int columnIndex = cursorRawQuery.getColumnIndex("name");
                    if (-1 == columnIndex) {
                        try {
                            cursorRawQuery.close();
                        } catch (Exception unused) {
                        }
                        return null;
                    }
                    strArr2 = new String[cursorRawQuery.getCount()];
                    cursorRawQuery.moveToFirst();
                    int i2 = 0;
                    while (!cursorRawQuery.isAfterLast()) {
                        strArr2[i2] = cursorRawQuery.getString(columnIndex);
                        i2++;
                        cursorRawQuery.moveToNext();
                    }
                } catch (Exception unused2) {
                    String[] strArr3 = strArr2;
                    cursor2 = cursorRawQuery;
                    strArr = strArr3;
                    if (cursor2 != null) {
                        try {
                            cursor2.close();
                        } catch (Exception unused3) {
                        }
                    }
                    strArr2 = strArr;
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorRawQuery;
                    if (cursor != null) {
                        try {
                            cursor.close();
                        } catch (Exception unused4) {
                        }
                    }
                    throw th;
                }
            }
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Exception unused5) {
                }
            }
        } catch (Exception unused6) {
            strArr = null;
        } catch (Throwable th2) {
            th = th2;
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (strArr2 != null) {
            for (int i3 = 0; i3 < strArr2.length; i3++) {
                if (i3 == strArr2.length - 1) {
                    stringBuffer.append(strArr2[i3]);
                } else {
                    stringBuffer.append(strArr2[i3] + ",");
                }
            }
        }
        return stringBuffer.toString();
    }

    public final boolean l(SQLiteDatabase sQLiteDatabase, String str) {
        boolean z = false;
        if (str == null) {
            return false;
        }
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = sQLiteDatabase.rawQuery("select count(*) as c from sqlite_master where type ='table' and name ='" + str.trim() + "' ", null);
                if (cursorRawQuery.moveToNext() && cursorRawQuery.getInt(0) > 0) {
                    z = true;
                }
            } catch (Exception unused) {
                if (cursorRawQuery != null) {
                }
                return z;
            } catch (Throwable th) {
                if (cursorRawQuery != null) {
                    try {
                        cursorRawQuery.close();
                    } catch (Exception unused2) {
                    }
                }
                throw th;
            }
            cursorRawQuery.close();
        } catch (Exception unused3) {
        }
        return z;
    }

    public final void m(SQLiteDatabase sQLiteDatabase, String[] strArr) {
        try {
            if (strArr != null) {
                try {
                    if (strArr.length != 0) {
                        sQLiteDatabase.beginTransaction();
                        for (String str : strArr) {
                            if (l(sQLiteDatabase, str)) {
                                sQLiteDatabase.execSQL("ALTER TABLE " + str + " RENAME TO " + (str + "_temp"));
                            }
                        }
                        a(sQLiteDatabase);
                        for (String str2 : strArr) {
                            String str3 = str2 + "_temp";
                            if (l(sQLiteDatabase, str3)) {
                                String strH = h(sQLiteDatabase, str3);
                                try {
                                    sQLiteDatabase.execSQL("INSERT INTO " + str2 + " (" + strH + ")  SELECT " + strH + " FROM " + str3);
                                } catch (Exception unused) {
                                }
                                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str3);
                            }
                        }
                        sQLiteDatabase.setTransactionSuccessful();
                    }
                } catch (Exception unused2) {
                    g(sQLiteDatabase, strArr);
                    a(sQLiteDatabase);
                }
            }
        } finally {
            try {
                sQLiteDatabase.endTransaction();
            } catch (Exception unused3) {
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        a(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        m(sQLiteDatabase, new String[]{"table_exception_cache"});
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        m(sQLiteDatabase, new String[]{"table_exception_cache"});
    }
}
