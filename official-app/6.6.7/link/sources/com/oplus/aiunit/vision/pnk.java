package com.oplus.aiunit.vision;

import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.PowerManager;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import com.oplus.phonenoareainquire.PhoneNoInquireProvider;
import com.oplus.phonenoareainquire.c;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class pnk {
    public static final int REVERT_NOTFOUND_FILE = 30;
    public static final int REVERT_SUCCESS = 28;
    public static final int REVERT_UNKNOWN_ERROR = 31;
    public static final int UPDATE_ERROR = 27;
    public static final int UPDATE_FILE_ERROR = 32;
    public static final int UPDATE_LAST_VER = 25;
    public static final int UPDATE_SUCCESS = 26;
    public static final int UPDATE_UNKNOWN_ERROR = 23;
    public static final int UPDATE_VER_ERROR = 29;
    public static final int UPDATE_VER_READ_ERROR = 24;
    public static final boolean e = c.DEBUG;
    public static final Object f = new Object();
    public final Context a;
    public PowerManager.WakeLock b;
    public int d = 0;
    public final ArrayList<ContentProviderOperation> c = new ArrayList<>();

    public pnk(Context context) {
        this.a = context;
    }

    public static int d(ArrayList<String> arrayList) {
        if (arrayList == null) {
            return 0;
        }
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next.startsWith("version_")) {
                try {
                    return Integer.parseInt(next.replace("version_", ""));
                } catch (NumberFormatException e2) {
                    g3e.b("UpdateDbFileUtils", " " + e2);
                }
            }
        }
        return 0;
    }

    public static ArrayList<String> e(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        File file = new File(str);
        if (!file.exists() || !file.isDirectory()) {
            g3e.a("UpdateDbFileUtils", "file is not exist ");
            return arrayList;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                g3e.a("UpdateDbFileUtils", "file name  = " + file2.getName());
                arrayList.add(file2.getName());
            }
        }
        return arrayList;
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

    public final int b() {
        int i = 66;
        try {
            Cursor cursorQuery = this.a.getContentResolver().query(Uri.parse("content://health_inquirenoarea/areano_and_citynames/"), new String[]{PhoneNoInquireProvider.AREANO, PhoneNoInquireProvider.CITYNAME}, null, null, null);
            if (cursorQuery != null) {
                try {
                    int count = cursorQuery.getCount();
                    if (e) {
                        g3e.a("UpdateDbFileUtils", "city count = " + count);
                    }
                    if (count < 375) {
                        cursorQuery.close();
                        return 67;
                    }
                    boolean z = true;
                    while (cursorQuery.moveToNext()) {
                        String string = cursorQuery.getString(0);
                        for (int i2 = 0; i2 < string.length(); i2++) {
                            if ("0123456789".indexOf(string.charAt(i2)) == -1) {
                                i = 67;
                                z = false;
                                break;
                            }
                        }
                        if (!z) {
                            break;
                        }
                    }
                    return i;
                } catch (Throwable th) {
                    if (cursorQuery != null) {
                        try {
                            cursorQuery.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
                g3e.b("UpdateDbFileUtils", "" + e);
            } else {
                i = 67;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (Exception e2) {
            g3e.b("UpdateDbFileUtils", "" + e2);
        }
        return i;
    }

    public final boolean c(String str, String str2, String str3) {
        File file = new File(str + str3);
        if (!file.exists()) {
            g3e.a("UpdateDbFileUtils", "[updateIndiaPhoneAreaInfo]update file is not exist :" + file);
            return false;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                File file2 = new File(str2 + str3);
                if (file2.exists()) {
                    file2.delete();
                } else {
                    File parentFile = file2.getParentFile();
                    if (parentFile != null && !parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                }
                file2.createNewFile();
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    try {
                        byte[] bArr = new byte[m08.MAX_BUFFER_SIZE];
                        while (true) {
                            int i = fileInputStream.read(bArr);
                            if (i == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, i);
                        }
                        fileOutputStream.flush();
                        fileOutputStream.close();
                    } catch (Throwable th) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Exception e2) {
                    g3e.b("UpdateDbFileUtils", "currentFileStream error" + e2.getMessage());
                }
                fileInputStream.close();
                return true;
            } catch (Throwable th3) {
                try {
                    fileInputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Exception e3) {
            g3e.b("UpdateDbFileUtils", "copyFile：" + e3);
            return false;
        }
    }

    public String f() throws Throwable {
        Cursor cursor = null;
        strSubstring = null;
        String strSubstring = null;
        cursor = null;
        try {
            try {
                Cursor cursorQuery = this.a.getContentResolver().query(Uri.parse(PhoneNoInquireProvider.CONTENT_URI + "/version"), new String[]{PhoneNoInquireProvider.VER}, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndex(PhoneNoInquireProvider.VER));
                            strSubstring = string.substring(string.length() - 8);
                        }
                        cursorQuery.close();
                    } catch (Exception e2) {
                        e = e2;
                        cursor = cursorQuery;
                        g3e.b("UpdateDbFileUtils", "getVersion fail." + e);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return "";
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return strSubstring;
            } catch (Exception e3) {
                e = e3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final String g(FileInputStream fileInputStream) throws IOException {
        byte[] bArr = new byte[12];
        int i = fileInputStream.read(bArr);
        String str = new String(bArr, StandardCharsets.UTF_8);
        return (i != 12 || str.length() + (-8) < 0) ? "error" : str;
    }

    public void h(boolean z) {
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(this.a).edit();
        editorEdit.putBoolean("update_state", z);
        editorEdit.commit();
    }

    public final void i() {
        PowerManager.WakeLock wakeLock = this.b;
        if (wakeLock != null) {
            wakeLock.release();
        }
        this.b = null;
    }

    public int j() {
        synchronized (f) {
            boolean z = e;
            if (z) {
                g3e.a("UpdateDbFileUtils", "revertDbFile ");
            }
            try {
                try {
                    try {
                        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) this.a.getSystemService("power")).newWakeLock(1, "PhoneNumberAttribution:updateDbFile");
                        this.b = wakeLockNewWakeLock;
                        wakeLockNewWakeLock.acquire();
                        File file = new File(PhoneNoInquireProvider.sResourceFile);
                        File file2 = new File(PhoneNoInquireProvider.sOriginalResourceFile);
                        if (file.exists()) {
                            file.delete();
                            file.createNewFile();
                        } else {
                            file.createNewFile();
                        }
                        if (z) {
                            g3e.a("UpdateDbFileUtils", "[revertDbFile]revertDbFile.exists()=" + file2.exists());
                        }
                        byte[] bArr = new byte[m08.MAX_BUFFER_SIZE];
                        if (!file2.exists()) {
                            file2.createNewFile();
                            try {
                                InputStream inputStreamOpen = this.a.getResources().getAssets().open("PhoneNumberData_3_1_0.dat");
                                try {
                                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                    while (true) {
                                        try {
                                            int i = inputStreamOpen.read(bArr);
                                            if (i == -1) {
                                                break;
                                            }
                                            if (e) {
                                                g3e.c("UpdateDbFileUtils", "in copySourceFile num=" + i);
                                            }
                                            fileOutputStream.write(bArr, 0, i);
                                        } catch (Throwable th) {
                                            try {
                                                fileOutputStream.close();
                                            } catch (Throwable th2) {
                                                th.addSuppressed(th2);
                                            }
                                            throw th;
                                        }
                                    }
                                    fileOutputStream.close();
                                    inputStreamOpen.close();
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
                            } catch (Exception e2) {
                                g3e.b("UpdateDbFileUtils", "in copySourceFile " + e2.getMessage());
                            }
                        }
                        try {
                            FileInputStream fileInputStream = new FileInputStream(file2);
                            try {
                                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                                try {
                                    n(fileOutputStream2, fileInputStream, g(fileInputStream));
                                    fileOutputStream2.close();
                                    fileInputStream.close();
                                    i();
                                } catch (Throwable th5) {
                                    try {
                                        fileOutputStream2.close();
                                    } catch (Throwable th6) {
                                        th5.addSuppressed(th6);
                                    }
                                    throw th5;
                                }
                            } catch (Throwable th7) {
                                try {
                                    fileInputStream.close();
                                } catch (Throwable th8) {
                                    th7.addSuppressed(th8);
                                }
                                throw th7;
                            }
                        } catch (Exception e3) {
                            g3e.b("UpdateDbFileUtils", "e = " + e3);
                        }
                    } catch (Throwable th9) {
                        i();
                        throw th9;
                    }
                } catch (IOException e4) {
                    g3e.b("UpdateDbFileUtils", "e = " + e4);
                    i();
                    return 31;
                }
            } catch (FileNotFoundException e5) {
                g3e.b("UpdateDbFileUtils", "e = " + e5);
                i();
                return 30;
            }
        }
        return 28;
    }

    public void k(String str, String str2, String str3) {
        String str4 = str + str3;
        File file = new File(str4);
        if (!file.exists() || !file.isDirectory()) {
            g3e.a("UpdateDbFileUtils", "[updateCarrieDataIfNeed]update file is error return ");
            return;
        }
        String str5 = str2 + str3;
        ArrayList<String> arrayListE = e(str4);
        ArrayList<String> arrayListE2 = e(str5);
        int iD = d(arrayListE);
        try {
            if (iD <= Math.max(d(arrayListE2), 2)) {
                g3e.a("UpdateDbFileUtils", "[updateCarrieDataIfNeed] sau version is below current");
                return;
            }
            try {
                PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) this.a.getSystemService("power")).newWakeLock(1, "PhoneNumberAttribution:updateCarrierDataIfNeed");
                this.b = wakeLockNewWakeLock;
                wakeLockNewWakeLock.acquire();
                String str6 = str2 + "carrier_temp";
                File file2 = new File(str6);
                f3e.b(file2);
                for (String str7 : arrayListE) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str4);
                    String str8 = File.separator;
                    sb.append(str8);
                    if (!c(sb.toString(), str6 + str8, str7)) {
                        g3e.a("UpdateDbFileUtils", "[updateCarrieDataIfNeed] sau copyFile failed return, fail File: " + str7);
                        i();
                        return;
                    }
                }
                File file3 = new File(str5);
                f3e.b(file3);
                if (file3.exists() && !file3.delete()) {
                    g3e.a("UpdateDbFileUtils", "[updateCarrieDataIfNeed] appDataCarrieFile old data delete failed return");
                    i();
                    return;
                }
                g3e.a("UpdateDbFileUtils", "[updateCarrieDataIfNeed] rename : " + file2.renameTo(file3));
                cke.b(iD);
                i();
            } catch (Exception e2) {
                g3e.b("UpdateDbFileUtils", "updateCarrierDataIfNeed：" + e2);
            }
        } catch (Throwable th) {
            i();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x009c A[Catch: all -> 0x01e0, TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x001f, B:9:0x0026, B:12:0x002a, B:13:0x004c, B:15:0x005d, B:17:0x0065, B:20:0x0074, B:22:0x0096, B:24:0x009c, B:32:0x00b2, B:33:0x00b9, B:38:0x00d1, B:41:0x00d5, B:44:0x00de, B:46:0x00e2, B:47:0x00e9, B:57:0x0109, B:61:0x010f, B:63:0x0128, B:66:0x0142, B:67:0x0165, B:71:0x0187, B:72:0x0194, B:70:0x0171, B:74:0x0196, B:75:0x019f, B:79:0x01a4, B:80:0x01c0, B:49:0x00ee, B:51:0x00f2, B:52:0x00f9, B:53:0x00fc, B:54:0x00fd, B:56:0x0101, B:35:0x00be, B:36:0x00c8, B:37:0x00c9, B:83:0x01c3, B:84:0x01dc, B:43:0x00db, B:31:0x00af), top: B:92:0x0003, inners: #3, #4, #5, #6, #8 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x00a9 A[LOOP:0: B:22:0x0096->B:28:0x00a9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x00d5 A[Catch: all -> 0x01e0, TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x001f, B:9:0x0026, B:12:0x002a, B:13:0x004c, B:15:0x005d, B:17:0x0065, B:20:0x0074, B:22:0x0096, B:24:0x009c, B:32:0x00b2, B:33:0x00b9, B:38:0x00d1, B:41:0x00d5, B:44:0x00de, B:46:0x00e2, B:47:0x00e9, B:57:0x0109, B:61:0x010f, B:63:0x0128, B:66:0x0142, B:67:0x0165, B:71:0x0187, B:72:0x0194, B:70:0x0171, B:74:0x0196, B:75:0x019f, B:79:0x01a4, B:80:0x01c0, B:49:0x00ee, B:51:0x00f2, B:52:0x00f9, B:53:0x00fc, B:54:0x00fd, B:56:0x0101, B:35:0x00be, B:36:0x00c8, B:37:0x00c9, B:83:0x01c3, B:84:0x01dc, B:43:0x00db, B:31:0x00af), top: B:92:0x0003, inners: #3, #4, #5, #6, #8 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00e2 A[Catch: all -> 0x01e0, TryCatch #2 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x001f, B:9:0x0026, B:12:0x002a, B:13:0x004c, B:15:0x005d, B:17:0x0065, B:20:0x0074, B:22:0x0096, B:24:0x009c, B:32:0x00b2, B:33:0x00b9, B:38:0x00d1, B:41:0x00d5, B:44:0x00de, B:46:0x00e2, B:47:0x00e9, B:57:0x0109, B:61:0x010f, B:63:0x0128, B:66:0x0142, B:67:0x0165, B:71:0x0187, B:72:0x0194, B:70:0x0171, B:74:0x0196, B:75:0x019f, B:79:0x01a4, B:80:0x01c0, B:49:0x00ee, B:51:0x00f2, B:52:0x00f9, B:53:0x00fc, B:54:0x00fd, B:56:0x0101, B:35:0x00be, B:36:0x00c8, B:37:0x00c9, B:83:0x01c3, B:84:0x01dc, B:43:0x00db, B:31:0x00af), top: B:92:0x0003, inners: #3, #4, #5, #6, #8 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x010d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0128 A[Catch: Exception -> 0x01a3, all -> 0x01e0, TryCatch #5 {Exception -> 0x01a3, blocks: (B:61:0x010f, B:63:0x0128, B:66:0x0142, B:71:0x0187, B:70:0x0171, B:74:0x0196), top: B:97:0x010f, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0142 A[Catch: Exception -> 0x01a3, all -> 0x01e0, TRY_LEAVE, TryCatch #5 {Exception -> 0x01a3, blocks: (B:61:0x010f, B:63:0x0128, B:66:0x0142, B:71:0x0187, B:70:0x0171, B:74:0x0196), top: B:97:0x010f, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0196 A[Catch: Exception -> 0x01a3, all -> 0x01e0, TRY_ENTER, TRY_LEAVE, TryCatch #5 {Exception -> 0x01a3, blocks: (B:61:0x010f, B:63:0x0128, B:66:0x0142, B:71:0x0187, B:70:0x0171, B:74:0x0196), top: B:97:0x010f, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x00db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:63:0x0128, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:66:0x0142, please report this as an issue */
    public int l(String str, String str2) {
        int i;
        boolean z;
        int iB;
        synchronized (f) {
            boolean z2 = e;
            if (z2) {
                g3e.a("UpdateDbFileUtils", "nowVer = " + str);
            }
            if (str == null) {
                g3e.d("UpdateDbFileUtils", "error error ,Unable to read the version info");
                return 29;
            }
            PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) this.a.getSystemService("power")).newWakeLock(1, "PhoneNumberAttribution:updateDbFile");
            this.b = wakeLockNewWakeLock;
            wakeLockNewWakeLock.acquire();
            File file = new File(PhoneNoInquireProvider.sResourceFile);
            try {
                FileInputStream fileInputStream = new FileInputStream(new File(str2));
                String strG = g(fileInputStream);
                String strSubstring = (strG.equals("error") || strG.length() + (-8) < 0) ? "error" : strG.substring(strG.length() - 8);
                if (!z2) {
                    i = 0;
                    while (true) {
                        if (i < strSubstring.length()) {
                            z = true;
                            break;
                        }
                        if ("0123456789".indexOf(strSubstring.charAt(i)) == -1) {
                            z = false;
                            break;
                        }
                        i++;
                    }
                    if (!z) {
                        fileInputStream.close();
                        g3e.d("UpdateDbFileUtils", "the download database file is a error file");
                        return 24;
                    }
                    if (str.compareTo(strSubstring) >= 0) {
                        fileInputStream.close();
                        if (e) {
                            g3e.a("UpdateDbFileUtils", "the current database is latest");
                        }
                        i();
                        return 25;
                    }
                    h(false);
                    file.delete();
                    file.createNewFile();
                    n(new FileOutputStream(file), fileInputStream, strG);
                    iB = b();
                    if (e) {
                        g3e.a("UpdateDbFileUtils", "checkResult = " + iB);
                    }
                    if (iB == 67) {
                        fileInputStream.close();
                        h(true);
                        i();
                        return 26;
                    }
                    Uri uriWithAppendedPath = Uri.withAppendedPath(PhoneNoInquireProvider.CONTENT_URI, "version");
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(PhoneNoInquireProvider.VER, "0000" + str);
                    this.a.getContentResolver().update(uriWithAppendedPath, contentValues, null, null);
                    h(true);
                    i();
                    g3e.d("UpdateDbFileUtils", "the download file is not right,but already updated database.so revert it.");
                    return 27;
                }
                g3e.a("UpdateDbFileUtils", "version:" + strG + " updateVer:" + strSubstring);
                i = 0;
                while (true) {
                    if (i < strSubstring.length()) {
                        z = true;
                        break;
                    }
                    if ("0123456789".indexOf(strSubstring.charAt(i)) == -1) {
                        z = false;
                        break;
                    }
                    i++;
                }
                if (!z) {
                    try {
                        fileInputStream.close();
                        g3e.d("UpdateDbFileUtils", "the download database file is a error file");
                    } catch (IOException unused) {
                        g3e.d("UpdateDbFileUtils", "the download database file is a error file");
                    } finally {
                        g3e.d("UpdateDbFileUtils", "the download database file is a error file");
                        i();
                    }
                    return 24;
                }
                if (str.compareTo(strSubstring) >= 0) {
                    try {
                        try {
                            fileInputStream.close();
                            if (e) {
                                g3e.a("UpdateDbFileUtils", "the current database is latest");
                            }
                        } catch (IOException unused2) {
                            if (e) {
                                g3e.a("UpdateDbFileUtils", "the current database is latest");
                            }
                        }
                        i();
                        return 25;
                    } catch (Throwable th) {
                        if (e) {
                            g3e.a("UpdateDbFileUtils", "the current database is latest");
                        }
                        i();
                        throw th;
                    }
                }
                try {
                    h(false);
                    file.delete();
                    file.createNewFile();
                    n(new FileOutputStream(file), fileInputStream, strG);
                    iB = b();
                    if (e) {
                        g3e.a("UpdateDbFileUtils", "checkResult = " + iB);
                    }
                    if (iB == 67) {
                        fileInputStream.close();
                        h(true);
                        i();
                        return 26;
                    }
                    Uri uriWithAppendedPath2 = Uri.withAppendedPath(PhoneNoInquireProvider.CONTENT_URI, "version");
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put(PhoneNoInquireProvider.VER, "0000" + str);
                    try {
                        this.a.getContentResolver().update(uriWithAppendedPath2, contentValues2, null, null);
                    } catch (Exception e2) {
                        g3e.b("UpdateDbFileUtils", "" + e2);
                    }
                    h(true);
                    i();
                    g3e.d("UpdateDbFileUtils", "the download file is not right,but already updated database.so revert it.");
                    return 27;
                } catch (Exception e3) {
                    h(true);
                    i();
                    g3e.b("UpdateDbFileUtils", "database insert failed." + e3);
                    return 27;
                }
            } catch (IOException e4) {
                g3e.d("UpdateDbFileUtils", "IOException:" + e4);
                i();
                return 23;
            }
            throw th;
        }
    }

    public synchronized void m(String str, String str2, String str3) {
        try {
            try {
                PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) this.a.getSystemService("power")).newWakeLock(1, "PhoneNumberAttribution:updateDbFile");
                this.b = wakeLockNewWakeLock;
                wakeLockNewWakeLock.acquire();
                c(str, str2, str3);
            } catch (Exception e2) {
                g3e.b("UpdateDbFileUtils", "updateFromSDToData：" + e2);
            }
            i();
        } catch (Throwable th) {
            i();
            throw th;
        }
    }

    public final void n(FileOutputStream fileOutputStream, FileInputStream fileInputStream, String str) throws IOException {
        byte[] bArr = new byte[m08.MAX_BUFFER_SIZE];
        fileInputStream.getChannel().position(0L);
        while (true) {
            int i = fileInputStream.read(bArr);
            if (i == -1) {
                break;
            }
            if (e) {
                g3e.c("UpdateDbFileUtils", "in copySourceFile num=" + i);
            }
            fileOutputStream.write(bArr, 0, i);
        }
        fileOutputStream.flush();
        fileOutputStream.close();
        fileInputStream.getChannel().position(0L);
        DataInputStream dataInputStream = new DataInputStream(a(fileInputStream));
        byte[] bArr2 = new byte[2000];
        byte[] bArr3 = new byte[8000];
        byte[] bArr4 = new byte[2000];
        dataInputStream.skip(dataInputStream.available() - 12002);
        dataInputStream.read(new byte[2]);
        dataInputStream.read(bArr2);
        dataInputStream.read(bArr3);
        dataInputStream.read(bArr4);
        dataInputStream.close();
        ContentResolver contentResolver = this.a.getContentResolver();
        if (e) {
            g3e.a("UpdateDbFileUtils", "deleting current database...");
        }
        try {
            contentResolver.delete(PhoneNoInquireProvider.CONTENT_URI, null, null);
        } catch (Exception e2) {
            g3e.b("UpdateDbFileUtils", "" + e2);
        }
        if (e) {
            g3e.a("UpdateDbFileUtils", "updating current database...");
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Uri uri = PhoneNoInquireProvider.AREANO_AND_CITYNAMEURI;
        int i2 = 0;
        while (i2 < 400) {
            String strTrim = new String(bArr2, i2 * 5, 5).trim();
            String strTrim2 = new String(bArr3, i2 * 20, 20, "gbk").trim();
            if (strTrim.equals("") && strTrim2.equals("")) {
                if (this.c.size() <= 0) {
                    break;
                }
                try {
                    this.a.getContentResolver().applyBatch(PhoneNoInquireProvider.AUTHORITY, this.c);
                    this.c.clear();
                    this.d = 0;
                    break;
                } catch (Exception e3) {
                    h(false);
                    g3e.b("UpdateDbFileUtils", "batch insert city failed." + e3);
                    break;
                }
            }
            ContentValues contentValues = new ContentValues();
            byte[] bArr5 = bArr2;
            contentValues.put(PhoneNoInquireProvider.AREANO, strTrim);
            contentValues.put(PhoneNoInquireProvider.CITYNAME, strTrim2);
            ContentProviderOperation.Builder builderNewInsert = ContentProviderOperation.newInsert(uri);
            builderNewInsert.withValues(contentValues);
            this.c.add(builderNewInsert.build());
            int i3 = this.d + 1;
            this.d = i3;
            if (i3 >= 50) {
                try {
                    this.a.getContentResolver().applyBatch(PhoneNoInquireProvider.AUTHORITY, this.c);
                    this.c.clear();
                    this.d = 0;
                } catch (Exception e4) {
                    h(false);
                    g3e.b("UpdateDbFileUtils", "batch insert city failed." + e4);
                }
            }
            i2++;
            bArr2 = bArr5;
        }
        if (e) {
            g3e.a("UpdateDbFileUtils", "update time = " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
        }
        Uri uriWithAppendedPath = Uri.withAppendedPath(PhoneNoInquireProvider.CONTENT_URI, "version");
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put(PhoneNoInquireProvider.VER, str);
        try {
            contentResolver.insert(uriWithAppendedPath, contentValues2);
        } catch (Exception e5) {
            g3e.b("UpdateDbFileUtils", "" + e5);
        }
        SharedPreferences.Editor editorEdit = this.a.getSharedPreferences(xje.EXPAND_NUM, 0).edit();
        editorEdit.clear();
        for (int i4 = 0; i4 < 1000; i4++) {
            int i5 = i4 * 2;
            int i6 = (bArr4[i5] & 255) << 8;
            int i7 = bArr4[i5 + 1] & 255;
            if (i6 == 0 && i7 == 0) {
                break;
            }
            editorEdit.putString(Integer.toString(i4), Integer.toString(i6 + i7));
        }
        editorEdit.commit();
        if (e) {
            g3e.a("UpdateDbFileUtils", "update the current database end");
        }
    }
}
