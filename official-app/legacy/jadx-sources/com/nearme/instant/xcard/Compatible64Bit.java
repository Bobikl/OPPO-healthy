package com.nearme.instant.xcard;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class Compatible64Bit {
    private static final String ASSETS_SO_LIB = "64libs";
    public static final String LIB_DIR = "quickapp_private_arm64";
    private static int READ_BYTE_COUNT = 1024;
    private static final String TAG = "Compatible64Bit";
    private static final String TEMP = "_temp";
    private static String VERSION_CODE = null;
    private static final String VERSION_XML = "64bit_so_version.xml";
    public static String sSoLibPath;

    private static synchronized void copySo(Context context) {
        try {
            File dir = context.getDir(LIB_DIR, 0);
            if (!dir.exists()) {
                dir.mkdirs();
            }
            Context hapContext = CardUtils.getHapContext(context);
            if (!isNeedUpdateSo(context, hapContext)) {
                Log.d(TAG, "no need to update SO");
                return;
            }
            try {
                File[] fileArrListFiles = dir.listFiles();
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        Log.d(TAG, "delete file:" + file + " " + file.delete());
                    }
                }
            } catch (Exception unused) {
            }
            String[] list = hapContext.getResources().getAssets().list(ASSETS_SO_LIB);
            byte[] bArr = new byte[READ_BYTE_COUNT];
            for (String str : list) {
                Log.d(TAG, "file name:" + str);
                File file2 = VERSION_XML.equals(str) ? new File(dir.getPath() + "/" + str + TEMP) : new File(dir.getPath() + "/" + str);
                if (file2.exists()) {
                    Log.d(TAG, "so exists, delete and reload it");
                    file2.delete();
                }
                file2.createNewFile();
                InputStream inputStreamOpen = hapContext.getResources().getAssets().open("64libs/" + str);
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                while (true) {
                    int i = inputStreamOpen.read(bArr);
                    if (i != -1) {
                        fileOutputStream.write(bArr, 0, i);
                    }
                }
                fileOutputStream.flush();
                inputStreamOpen.close();
                fileOutputStream.close();
            }
            File file3 = new File(dir.getPath() + "/" + VERSION_XML + TEMP);
            VERSION_CODE = getVersionCode(new FileInputStream(file3));
            file3.renameTo(new File(dir.getPath() + "/" + VERSION_XML));
        } catch (Exception e2) {
            File file4 = new File(context.getDir(LIB_DIR, 0).getPath() + "/" + VERSION_XML);
            if (file4.exists()) {
                file4.delete();
            }
            Log.d(TAG, "Exception on copy so.", e2);
        }
    }

    public static String getNativeLibraryDir(Context context) {
        if (!TextUtils.isEmpty(sSoLibPath)) {
            return sSoLibPath;
        }
        try {
            String path = isArm64(context) ? context.getDir(LIB_DIR, 0).getPath() : CardUtils.getHapContext(context).getApplicationInfo().nativeLibraryDir;
            Log.d(TAG, "getNativeLibraryDir:" + path);
            return path;
        } catch (Exception e2) {
            Log.d(TAG, "getNativeLibraryDir:exception:", e2);
            return "";
        }
    }

    private static String getVersionCode(InputStream inputStream) {
        try {
            try {
                XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                xmlPullParserNewPullParser.setInput(inputStream, "UTF-8");
                for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.next()) {
                    if (eventType == 2 && "value".equals(xmlPullParserNewPullParser.getName())) {
                        String strNextText = xmlPullParserNewPullParser.nextText();
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        return strNextText;
                    }
                }
                if (inputStream == null) {
                    return null;
                }
                inputStream.close();
                return null;
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException | XmlPullParserException e2) {
            Log.w(TAG, "Exception on get so version", e2);
            return null;
        }
    }

    public static void init64So(Context context) {
        if (isArm64(context)) {
            copySo(context);
        } else {
            Log.d(TAG, "is32so");
        }
    }

    public static boolean isArm64(Context context) {
        return context.getApplicationInfo().nativeLibraryDir.contains("arm64");
    }

    private static boolean isNeedUpdateSo(Context context, Context context2) {
        try {
            File file = new File(context.getDir(LIB_DIR, 0).getPath() + "/" + VERSION_XML);
            if (!file.exists()) {
                return true;
            }
            if (TextUtils.isEmpty(VERSION_CODE)) {
                VERSION_CODE = getVersionCode(new FileInputStream(file));
            }
            Log.d(TAG, "host so version code:" + VERSION_CODE);
            String versionCode = getVersionCode(context2.getResources().getAssets().open("64libs/64bit_so_version.xml"));
            Log.d(TAG, "engine so version code:" + versionCode);
            return (TextUtils.isEmpty(VERSION_CODE) || VERSION_CODE.equals(versionCode)) ? false : true;
        } catch (Exception e2) {
            Log.w(TAG, "fail to get so version.", e2);
            return true;
        }
    }
}
