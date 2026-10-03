package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.oplus.phonenoareainquire.PhoneNoInquireProvider;
import com.oplus.phonenoareainquire.c;
import com.oplus.phonenoareainquire.service.OplusLocaleChangeJobIntentService;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class xje extends SQLiteOpenHelper {
    public static final String AREA_DATABASE_PRESENCE = "area_presence_db";
    public static final String EXPAND_NUM = "expand";
    public static final String METHOD_REFRESH_PROVINCE_AND_CITY_TABLE = "refresh_province_and_city_table";
    public static final String PRESENCE_NUMBERS_TABLE = "presence_numbers_table";
    public static final String UPDATE_AREA_LIST_METHOD = "update_area_list_method";
    public static final boolean j = c.DEBUG;

    @SuppressLint({"StaticFieldLeak"})
    public static xje k;
    public final Context i;

    public xje(Context context) {
        super(context, "inquirenoarea.db", (SQLiteDatabase.CursorFactory) null, 42);
        this.i = context;
        d97.b(context);
    }

    public static synchronized xje l(Context context) {
        if (k == null) {
            k = new xje(context);
        }
        return k;
    }

    public final InputStream a(InputStream inputStream) throws IOException {
        int iAvailable = inputStream.available();
        byte[] bArr = new byte[iAvailable];
        int i = 0;
        while (i < iAvailable) {
            i += inputStream.read(bArr, i, iAvailable - i);
        }
        return new ByteArrayInputStream(bArr);
    }

    public void g() {
        try {
            this.i.getContentResolver().call(Uri.parse("content://com.oplus.provider.BlackListProvider"), UPDATE_AREA_LIST_METHOD, (String) null, (Bundle) null);
        } catch (Exception e) {
            g3e.b("PhoneNoDbHelper", "callBlacklistUpdateArealist error " + e.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:131:0x0131 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x0117 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:? A[Catch: all -> 0x0121, SYNTHETIC, TRY_LEAVE, TryCatch #1 {all -> 0x0121, blocks: (B:8:0x0053, B:29:0x00f3, B:52:0x0120, B:51:0x011d, B:9:0x0063, B:28:0x00f0, B:43:0x0112, B:42:0x010f, B:47:0x0117), top: B:114:0x0053, outer: #9, inners: #10, #15 }] */
    /* JADX WARN: Code duplicated, block: B:151:? A[Catch: all -> 0x013b, SYNTHETIC, TRY_LEAVE, TryCatch #16 {all -> 0x013b, blocks: (B:6:0x003e, B:31:0x00f9, B:69:0x013a, B:68:0x0137, B:7:0x004e, B:30:0x00f6, B:60:0x012c, B:59:0x0129, B:8:0x0053, B:29:0x00f3, B:52:0x0120, B:51:0x011d, B:9:0x0063, B:28:0x00f0, B:43:0x0112, B:42:0x010f, B:47:0x0117, B:55:0x0123, B:64:0x0131), top: B:139:0x003e, outer: #4, inners: #9, #12 }] */
    public void h(SQLiteDatabase sQLiteDatabase) throws IOException {
        File fileA = f3e.a(PhoneNoInquireProvider.sResourceFile);
        File fileA2 = f3e.a(PhoneNoInquireProvider.sExtendNumberFile);
        File fileA3 = f3e.a(PhoneNoInquireProvider.sProvinceCityRelationCity);
        try {
            InputStream inputStreamOpen = this.i.getResources().getAssets().open("PhoneNumberData_3_1_0.dat");
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(fileA);
                try {
                    DataInputStream dataInputStream = new DataInputStream(a(new FileInputStream(fileA)));
                    try {
                        InputStream inputStreamOpen2 = this.i.getResources().getAssets().open("ExtendNumber.dat");
                        try {
                            FileOutputStream fileOutputStream2 = new FileOutputStream(fileA2);
                            try {
                                InputStream inputStreamOpen3 = this.i.getResources().getAssets().open("city_name_table.txt");
                                try {
                                    FileOutputStream fileOutputStream3 = new FileOutputStream(fileA3);
                                    try {
                                        byte[] bArr = new byte[m08.MAX_BUFFER_SIZE];
                                        g3e.c("PhoneNoDbHelper", "copy PhoneNumberData.dat to /data/data/");
                                        while (true) {
                                            int i = inputStreamOpen.read(bArr);
                                            if (i == -1) {
                                                break;
                                            } else {
                                                fileOutputStream.write(bArr, 0, i);
                                            }
                                            if (inputStreamOpen3 == null) {
                                                throw th;
                                            }
                                            try {
                                                inputStreamOpen3.close();
                                                throw th;
                                            } catch (Throwable th) {
                                                th.addSuppressed(th);
                                                throw th;
                                            }
                                            if (inputStreamOpen2 != null) {
                                                throw th;
                                            }
                                            try {
                                                inputStreamOpen2.close();
                                                throw th;
                                            } catch (Throwable th2) {
                                                th.addSuppressed(th2);
                                                throw th;
                                            }
                                            try {
                                                fileOutputStream.close();
                                                throw th;
                                            } catch (Throwable th3) {
                                                th.addSuppressed(th3);
                                                throw th;
                                            }
                                        }
                                        inputStreamOpen.close();
                                        fileOutputStream.close();
                                        byte[] bArr2 = new byte[12];
                                        dataInputStream.read(bArr2, 0, 12);
                                        String str = new String(bArr2, StandardCharsets.UTF_8);
                                        g3e.c("PhoneNoDbHelper", "version =" + str);
                                        try {
                                            ContentValues contentValues = new ContentValues();
                                            contentValues.put(PhoneNoInquireProvider.VER, str);
                                            sQLiteDatabase.insert("version", null, contentValues);
                                            while (true) {
                                                int i2 = inputStreamOpen2.read(bArr);
                                                if (i2 == -1) {
                                                    break;
                                                } else {
                                                    fileOutputStream2.write(bArr, 0, i2);
                                                }
                                                if (inputStreamOpen3 == null) {
                                                    throw th;
                                                }
                                                inputStreamOpen3.close();
                                                throw th;
                                                if (inputStreamOpen2 != null) {
                                                    throw th;
                                                }
                                                inputStreamOpen2.close();
                                                throw th;
                                                fileOutputStream.close();
                                                throw th;
                                            }
                                            while (true) {
                                                int i3 = inputStreamOpen3.read(bArr);
                                                if (i3 == -1) {
                                                    break;
                                                } else {
                                                    fileOutputStream3.write(bArr, 0, i3);
                                                }
                                            }
                                        } catch (Exception e) {
                                            g3e.b("PhoneNoDbHelper", "" + e.getMessage());
                                        }
                                        inputStreamOpen2.close();
                                        fileOutputStream2.close();
                                        m(dataInputStream, sQLiteDatabase);
                                        fileOutputStream3.close();
                                        inputStreamOpen3.close();
                                        fileOutputStream2.close();
                                        inputStreamOpen2.close();
                                        dataInputStream.close();
                                        fileOutputStream.close();
                                        inputStreamOpen.close();
                                    } catch (Throwable th4) {
                                        try {
                                            fileOutputStream3.close();
                                            throw th4;
                                        } catch (Throwable th5) {
                                            th4.addSuppressed(th5);
                                            throw th4;
                                        }
                                    }
                                } catch (Throwable th6) {
                                    if (inputStreamOpen3 == null) {
                                        throw th6;
                                    }
                                    inputStreamOpen3.close();
                                    throw th6;
                                    if (inputStreamOpen2 != null) {
                                        throw th;
                                    }
                                    inputStreamOpen2.close();
                                    throw th;
                                    fileOutputStream.close();
                                    throw th;
                                }
                            } catch (Throwable th7) {
                                try {
                                    fileOutputStream2.close();
                                    throw th7;
                                } catch (Throwable th8) {
                                    th7.addSuppressed(th8);
                                    throw th7;
                                }
                            }
                        } catch (Throwable th9) {
                            if (inputStreamOpen2 != null) {
                                throw th9;
                            }
                            inputStreamOpen2.close();
                            throw th9;
                            fileOutputStream.close();
                            throw th;
                        }
                    } catch (Throwable th10) {
                        try {
                            dataInputStream.close();
                            throw th10;
                        } catch (Throwable th11) {
                            th10.addSuppressed(th11);
                            throw th10;
                        }
                    }
                } catch (Throwable th12) {
                    fileOutputStream.close();
                    throw th12;
                }
            } catch (Throwable th13) {
                if (inputStreamOpen == null) {
                    throw th13;
                }
                try {
                    inputStreamOpen.close();
                    throw th13;
                } catch (Throwable th14) {
                    th13.addSuppressed(th14);
                    throw th13;
                }
            }
        } catch (Exception e2) {
            g3e.b("PhoneNoDbHelper", "copySourceFile fail " + e2.getMessage());
        }
        i(sQLiteDatabase);
        try {
            o(sQLiteDatabase);
        } catch (Exception e3) {
            g3e.b("PhoneNoDbHelper", "updateCityCode fail " + e3.getMessage());
        }
        try {
            f3e.b(new File(PhoneNoInquireProvider.sMultiLanguageTableFile));
            OplusLocaleChangeJobIntentService.c(c.b("Multi_Language_Table.txt", PhoneNoInquireProvider.sMultiLanguageTableFile), this.i, sQLiteDatabase);
        } catch (Exception e4) {
            try {
                OplusLocaleChangeJobIntentService.c(null, this.i, sQLiteDatabase);
            } catch (Exception e5) {
                g3e.b("PhoneNoDbHelper", "e = " + e5.getMessage());
            }
            g3e.b("PhoneNoDbHelper", "e = " + e4.getMessage());
        }
    }

    public void i(SQLiteDatabase sQLiteDatabase) throws IOException {
        try {
            FileInputStream fileInputStream = new FileInputStream(PhoneNoInquireProvider.sProvinceCityRelationCity);
            try {
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                try {
                    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null || line.trim().length() <= 0) {
                                break;
                                break;
                            }
                            String strTrim = line.trim();
                            if (strTrim.length() <= 0) {
                                break;
                            }
                            int iIndexOf = strTrim.indexOf(" ");
                            if (iIndexOf > 0) {
                                sQLiteDatabase.execSQL("insert into province_and_city_relation(province,city) values ('" + strTrim.substring(0, iIndexOf) + "','" + strTrim.substring(iIndexOf) + "');");
                            } else {
                                sQLiteDatabase.execSQL("insert into province_and_city_relation(province) values ('" + strTrim + "');");
                            }
                        } catch (Throwable th) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    bufferedReader.close();
                    inputStreamReader.close();
                    fileInputStream.close();
                } catch (Throwable th3) {
                    try {
                        inputStreamReader.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                try {
                    fileInputStream.close();
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                }
                throw th5;
            }
        } catch (Exception e) {
            g3e.b("PhoneNoDbHelper", "the file may have encounter error try to self heal the file, e = " + e.getMessage());
        }
    }

    public final void m(DataInputStream dataInputStream, SQLiteDatabase sQLiteDatabase) throws IOException {
        byte[] bArr = new byte[2];
        byte[] bArr2 = new byte[2000];
        byte[] bArr3 = new byte[8000];
        byte[] bArr4 = new byte[2000];
        dataInputStream.skip(dataInputStream.available() - 12002);
        dataInputStream.read(bArr);
        dataInputStream.read(bArr2);
        dataInputStream.read(bArr3);
        dataInputStream.read(bArr4);
        if (j) {
            g3e.a("PhoneNoDbHelper", "cityNum:" + ((bArr[1] & 255) | (bArr[0] << 8)));
        }
        g3e.a("PhoneNoDbHelper", "start insert areano_and_citynames table");
        for (int i = 0; i < 400; i++) {
            try {
                String strTrim = new String(bArr2, i * 5, 5).trim();
                String strTrim2 = new String(bArr3, i * 20, 20, "gbk").trim();
                if (strTrim.equals("") && strTrim2.equals("")) {
                    break;
                }
                sQLiteDatabase.execSQL("insert into areano_and_citynames(areano,cityname) values ('" + strTrim + "','" + strTrim2 + "');");
            } catch (Exception unused) {
                g3e.b("PhoneNoDbHelper", "init database failed");
                return;
            }
        }
        SharedPreferences.Editor editorEdit = this.i.getSharedPreferences(EXPAND_NUM, 0).edit();
        editorEdit.clear();
        for (int i2 = 0; i2 < 1000; i2++) {
            int i3 = i2 * 2;
            int i4 = (bArr4[i3] & 255) << 8;
            int i5 = bArr4[i3 + 1] & 255;
            if (i4 == 0 && i5 == 0) {
                break;
            }
            editorEdit.putString(Integer.toString(i2), Integer.toString(i4 + i5));
        }
        editorEdit.commit();
        dataInputStream.close();
        g3e.a("PhoneNoDbHelper", "init database sucess");
    }

    public void n(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS province_and_city_relation");
        sQLiteDatabase.execSQL("CREATE TABLE province_and_city_relation (_id INTEGER PRIMARY KEY ,province TEXT NOT NULL, city TEXT);");
        try {
            i(sQLiteDatabase);
        } catch (IOException e) {
            g3e.b("PhoneNoDbHelper", "e = " + e.getMessage());
        }
    }

    public void o(SQLiteDatabase sQLiteDatabase) throws Exception {
        try {
            InputStream inputStreamOpen = this.i.getAssets().open("Multi_Areano_Table.txt");
            try {
                if (inputStreamOpen == null || sQLiteDatabase == null) {
                    g3e.a("PhoneNoDbHelper", "updateCityCode inputStream or db is null");
                    if (inputStreamOpen != null) {
                        inputStreamOpen.close();
                        return;
                    }
                    return;
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen));
                    boolean z = true;
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (TextUtils.isEmpty(line)) {
                                break;
                            }
                            String strTrim = line.trim();
                            if (TextUtils.isEmpty(strTrim)) {
                                break;
                            }
                            if (z) {
                                z = false;
                            } else {
                                String[] strArrSplit = strTrim.split("\t");
                                if (strArrSplit.length == 4) {
                                    sQLiteDatabase.execSQL("UPDATE areano_and_citynames SET equal_id = '" + strArrSplit[2] + "' WHERE _id = '" + strArrSplit[0] + "';");
                                }
                            }
                        } catch (Throwable th) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    g3e.a("PhoneNoDbHelper", "updateCityCode use " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
                    bufferedReader.close();
                } catch (Exception unused) {
                    g3e.b("PhoneNoDbHelper", "updateCityCode city code error");
                }
                inputStreamOpen.close();
                return;
            } catch (Throwable th3) {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (Exception unused2) {
            g3e.b("PhoneNoDbHelper", "update city code error");
        }
        g3e.b("PhoneNoDbHelper", "update city code error");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS areano_and_citynames (_id INTEGER PRIMARY KEY ,areano TEXT NOT NULL, cityname TEXT NOT NULL, equal_id INTEGER DEFAULT 0 );");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS version (_id INTEGER ,ver TEXT);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS province_and_city_relation (_id INTEGER PRIMARY KEY ,province TEXT NOT NULL, city TEXT);");
        try {
            h(sQLiteDatabase);
        } catch (IOException e) {
            g3e.b("PhoneNoDbHelper", "e = " + e.getMessage());
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        g3e.a("PhoneNoDbHelper", "------onDowngrade------");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS areano_and_citynames");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS version");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS specialnumber");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS internationalcode");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS province_and_city_relation");
        onCreate(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ATTACH DATABASE ':memory:' AS area_presence_db;");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS area_presence_db.presence_numbers_table (_id TEXT,display_name TEXT,data1 TEXT,phonebook_bucket INTEGER DEFAULT 0,_index INTEGER,cityname TEXT,areano TEXT,photo_id TEXT,UNIQUE(_id, data1));");
        super.onOpen(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        g3e.a("PhoneNoDbHelper", "------onUpgrade------");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS areano_and_citynames");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS version");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS specialnumber");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS internationalcode");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS province_and_city_relation");
        onCreate(sQLiteDatabase);
        if (i < 41) {
            g();
        }
    }
}
