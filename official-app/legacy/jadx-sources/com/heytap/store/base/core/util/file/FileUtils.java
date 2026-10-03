package com.heytap.store.base.core.util.file;

import android.annotation.TargetApi;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.heytap.store.base.core.util.IOUtils;
import com.heytap.store.base.core.util.download.util.LocalFileUtils;
import com.heytap.store.platform.tools.ContextGetterUtils;
import com.heytap.store.platform.tools.LogUtils;
import com.heytap.store.platform.tools.ToastUtils;
import com.oplus.aiunit.vision.iim;
import com.oplus.aiunit.vision.j;
import com.oplus.weatherservicesdk.data.Weather;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public class FileUtils {
    public static String Announce_gif = null;
    private static final String[] CATCH_PATH_ARRAY;
    public static final String DBPATH;
    public static final String DOWNLOAD_STORE_PATH = "Download/Store";
    public static final String FRESCO_CACHE_PATH;
    public static final String GLIDE_CACHE_PATH;
    public static final String GOODS_INVOICE;
    private static final char[] HEX_DIGITS;
    public static final String HOMEPAGE_BG_SAVE_DIR;
    public static final String HOMEPAGE_BG_SAVE_FILE;
    public static final String IMAGE_PIPELINE_CACHE_DIR = "cache/";
    public static final boolean IS_SDK_SUPPORT_WEBP;
    public static final String PDF_FILE = ".pdf";
    public static final int SAVE_COMPRESS_QUALITY = 90;
    public static final String SAVE_FORMAT_NAME_JPEG = ".jpg";
    public static final String SAVE_FORMAT_NAME_PNG = ".png";
    public static final String SAVE_FORMAT_NAME_WBMP = ".bmp";
    public static final String SMILEY_CACHE_PATH;
    public static final String SPLASH_ADD_VIDEO_PATH;
    public static final String STATE_SCENE_CACHE_PATH;
    public static final String TAG = "FileUtils";
    public static final String TIME_STAMP_NAME = "'POST_IMG'_yyyyMMdd_HHmmss";
    public static final String TRIBUNE_EX_DIR = "/ColorOS/Store/";
    public static final String TRIBUNE_IMAGECACHE_PATH_DRAFT_TEMP;
    public static final String TRIBUNE_IMAGECACHE_PATH_TEMP;
    public static final String TRIBUNE_STORAGE_DOCUMENTS_PATH;
    public static final String TRIBUNE_STORAGE_PATH_BLUR_BG;
    public static final String TRIBUNE_STORAGE_PATH_CAMERA;
    public static final String TRIBUNE_STORAGE_PATH_INIT_PIC;
    public static final String TRIBUNE_STORAGE_PATH_TEMP;
    public static final String TRIBUNE_STORAGE_PATH_TEMP_ICONS;
    public static final String TRIBUNE_STORAGE_PATH_TEMP_USER_HEAD;
    public static final String TRIBUNE_STORAGE_PIC_PATH;
    public static final String TRIBUNE_UPLOAD_IMAGE_PATH;
    public static final String VIDEO_CACHE_STORAGE_PATH;
    public static final String VIDEO_STORAGE_PATH;
    public static final String WEB_QR_CODE_FILE_NAME = "web_photo";
    public static final String WEB_QR_CODE_PHOTO_PATH;
    public static final String dbDir;
    public static final String storagePath;

    static {
        StringBuilder sb = new StringBuilder();
        ContextGetterUtils contextGetterUtils = ContextGetterUtils.INSTANCE;
        sb.append(contextGetterUtils.getApp().getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS));
        sb.append("/");
        String string = sb.toString();
        TRIBUNE_STORAGE_DOCUMENTS_PATH = string;
        String str = contextGetterUtils.getApp().getExternalFilesDir(Environment.DIRECTORY_PICTURES) + "/";
        TRIBUNE_STORAGE_PIC_PATH = str;
        TRIBUNE_STORAGE_PATH_CAMERA = str + "photo/";
        String str2 = str + ".TEMP/";
        TRIBUNE_STORAGE_PATH_TEMP = str2;
        String str3 = str2 + "icons/";
        TRIBUNE_STORAGE_PATH_TEMP_ICONS = str3;
        TRIBUNE_STORAGE_PATH_BLUR_BG = str2 + "BLUR_BG";
        String str4 = str2 + IMAGE_PIPELINE_CACHE_DIR;
        TRIBUNE_IMAGECACHE_PATH_TEMP = str4;
        TRIBUNE_UPLOAD_IMAGE_PATH = str2 + "upload/";
        HOMEPAGE_BG_SAVE_DIR = str2 + "homepage/";
        HOMEPAGE_BG_SAVE_FILE = str2 + "homepage/home_bg.jpg";
        String str5 = str2 + "usehead/user_head.jpg";
        TRIBUNE_STORAGE_PATH_TEMP_USER_HEAD = str5;
        SMILEY_CACHE_PATH = str2 + "smiley/";
        VIDEO_STORAGE_PATH = str + "video/";
        SPLASH_ADD_VIDEO_PATH = str + "splash_video/";
        WEB_QR_CODE_PHOTO_PATH = str + "web_qr_code/";
        TRIBUNE_IMAGECACHE_PATH_DRAFT_TEMP = str2 + "draft/";
        GOODS_INVOICE = string + "download/";
        TRIBUNE_STORAGE_PATH_INIT_PIC = str2 + "initpic/";
        VIDEO_CACHE_STORAGE_PATH = str4 + "video/";
        String str6 = string + "/db";
        storagePath = str6;
        String str7 = str6 + "/databases";
        dbDir = str7;
        String str8 = str7 + "/store_db";
        DBPATH = str8;
        String str9 = contextGetterUtils.getApp().getCacheDir() + "/image_manager_disk_cache";
        GLIDE_CACHE_PATH = str9;
        String str10 = contextGetterUtils.getApp().getCacheDir() + "/image_cache";
        FRESCO_CACHE_PATH = str10;
        STATE_SCENE_CACHE_PATH = contextGetterUtils.getApp().getCacheDir() + "/state_scene_cache";
        IS_SDK_SUPPORT_WEBP = Long.parseLong(Build.VERSION.SDK) >= 14;
        HEX_DIGITS = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        Announce_gif = "Announce.gif";
        CATCH_PATH_ARRAY = new String[]{str2, str3, str5, str8, str9, str10};
    }

    private FileUtils() {
        throw new IllegalArgumentException();
    }

    public static boolean base64ToFile(String str, String str2) {
        if (str.contains("data:image")) {
            str = str.split(",")[1];
        }
        byte[] bArrDecode = Base64.decode(str, 0);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(str2);
            fileOutputStream.write(bArrDecode);
            fileOutputStream.close();
            return true;
        } catch (IOException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static String basename(String str) {
        int i;
        if (str == null) {
            return str;
        }
        int iLastIndexOf = str.lastIndexOf(47);
        return (iLastIndexOf == -1 || (i = iLastIndexOf + 1) >= str.length()) ? str : str.substring(i);
    }

    private static String bytesToHexString(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (byte b : bArr) {
            String upperCase = Integer.toHexString(b & 255).toUpperCase();
            if (upperCase.length() < 2) {
                sb.append(0);
            }
            sb.append(upperCase);
        }
        return sb.toString();
    }

    public static boolean cachePathMkdir() {
        File file = new File(TRIBUNE_IMAGECACHE_PATH_TEMP);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.isDirectory();
    }

    public static long calculateFileSize() {
        long folderSize = 0;
        for (String str : CATCH_PATH_ARRAY) {
            if (!TextUtils.isEmpty(str)) {
                File file = new File(str);
                if (file.exists() && file.isDirectory()) {
                    folderSize += getFolderSize(file);
                }
            }
        }
        return folderSize;
    }

    public static boolean checkCosmeticsFoldExist(String str) {
        File file = new File(str);
        if (!file.exists()) {
            return false;
        }
        if (file.isDirectory()) {
            return true;
        }
        file.delete();
        return false;
    }

    public static boolean checkSDcard(Context context) {
        boolean zEquals = Environment.getExternalStorageState().equals("mounted");
        if (!zEquals) {
            ToastUtils.INSTANCE.show("请插入手机存储卡再使用本功能", 0, 0, 0);
        }
        return zEquals;
    }

    private static void cleanAllCacheFile() {
        for (String str : CATCH_PATH_ARRAY) {
            if (!TextUtils.isEmpty(str)) {
                File file = new File(str);
                if (file.exists()) {
                    cleanAllFilesInDir(file);
                }
            }
        }
    }

    public static boolean cleanAllFilesInDir(File file) {
        if (file == null || !file.exists() || file.isFile() || file.listFiles() == null) {
            return false;
        }
        for (File file2 : file.listFiles()) {
            if (file2.isFile() && !file2.delete()) {
                Log.w(TAG, "Failed to delete:" + file2.getAbsolutePath());
            }
            if (file2.isDirectory()) {
                cleanAllFilesInDir(file2);
            }
        }
        return true;
    }

    public static void cleanCacheSetting() {
        cleanAllCacheFile();
    }

    public static File compressFile(String str, String str2) {
        return new File(str);
    }

    public static String convertStreamToString(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line + Weather.SEPARATOR);
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            } catch (Throwable th) {
                IOUtils.closeQuietly(inputStream);
                throw th;
            }
        }
        IOUtils.closeQuietly(inputStream);
        return sb.toString();
    }

    public static boolean copy(String str, String str2, boolean z) throws Throwable {
        File file = new File(str);
        if (!file.isFile()) {
            return false;
        }
        File file2 = new File(str2);
        if (file2.exists()) {
            if (!z) {
                return true;
            }
            file2.delete();
        }
        if (!makeSureFileExist(file2)) {
            return false;
        }
        try {
            copyFile(file, file2);
            return true;
        } catch (IOException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static void copyFile(File file, File file2) throws Throwable {
        BufferedInputStream bufferedInputStream;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file2));
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i = bufferedInputStream.read(bArr);
                        if (i == -1) {
                            bufferedOutputStream2.flush();
                            IOUtils.closeQuietly((OutputStream) bufferedOutputStream2);
                            IOUtils.closeQuietly((InputStream) bufferedInputStream);
                            return;
                        }
                        bufferedOutputStream2.write(bArr, 0, i);
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedOutputStream = bufferedOutputStream2;
                    IOUtils.closeQuietly((OutputStream) bufferedOutputStream);
                    IOUtils.closeQuietly((InputStream) bufferedInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedInputStream = null;
        }
    }

    public static void copyFolder(File file, File file2) throws Throwable {
        if (!file.isDirectory()) {
            copyFile(file, file2);
            return;
        }
        if (!file2.exists()) {
            file2.mkdir();
        }
        for (String str : file.list()) {
            copyFolder(new File(file, str), new File(file2, str));
        }
    }

    public static void copyStream(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (inputStream == null || outputStream == null) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                outputStream.flush();
                return;
            }
            outputStream.write(bArr, 0, i);
        }
    }

    public static boolean createCameraPath() {
        File file = new File(TRIBUNE_STORAGE_PATH_CAMERA);
        if (file.exists()) {
            return true;
        }
        file.mkdirs();
        return file.isDirectory();
    }

    @TargetApi(29)
    public static Uri createDownloadPathUri(String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("datetaken", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("relative_path", DOWNLOAD_STORE_PATH);
        contentValues.put("mime_type", "application/pdf");
        return ContextGetterUtils.INSTANCE.getApp().getContentResolver().insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues);
    }

    public static void deleteAllFilesOfDir(File file) {
        if (file.exists()) {
            if (file.isFile()) {
                file.delete();
                return;
            }
            for (File file2 : file.listFiles()) {
                deleteAllFilesOfDir(file2);
            }
            file.delete();
        }
    }

    public static boolean deleteFile(String str) {
        return deleteFile(new File(str));
    }

    public static int deleteFiles(File file, long j2) {
        int i = 0;
        if (file == null || !file.isDirectory()) {
            return 0;
        }
        try {
            File[] fileArrListFiles = file.listFiles();
            int length = fileArrListFiles.length;
            int iDeleteFiles = 0;
            while (i < length) {
                try {
                    File file2 = fileArrListFiles[i];
                    if (file2.isDirectory()) {
                        iDeleteFiles += deleteFiles(file2, j2);
                    }
                    if (file2.lastModified() < j2 && file2.delete()) {
                        iDeleteFiles++;
                    }
                    i++;
                } catch (Exception e2) {
                    e = e2;
                    i = iDeleteFiles;
                    e.printStackTrace();
                    return i;
                }
            }
            return iDeleteFiles;
        } catch (Exception e3) {
            e = e3;
        }
    }

    public static int deleteOverdueFiles(String str, long j2) {
        return deleteFiles(new File(str), j2);
    }

    public static boolean fileExist(String str) {
        return new File(str).exists();
    }

    public static boolean fileExists(String str) {
        return str != null && new File(str).isFile();
    }

    public static String generateFormatImageFilepath() {
        return TRIBUNE_UPLOAD_IMAGE_PATH + (new SimpleDateFormat(TIME_STAMP_NAME).format((Date) new java.sql.Date(System.currentTimeMillis())) + new Random(System.currentTimeMillis()).nextLong()) + ".jpg";
    }

    public static String getBitmapPath() {
        return getPath() + "/TabIcon";
    }

    public static File getExternalCacheDir(Context context) {
        File externalCacheDir = context.getExternalCacheDir();
        return externalCacheDir != null ? externalCacheDir : new File(TRIBUNE_STORAGE_DOCUMENTS_PATH);
    }

    public static ParcelFileDescriptor getFileDescriptorW(Uri uri) {
        try {
            return ContextGetterUtils.INSTANCE.getApp().getContentResolver().openFileDescriptor(uri, "w");
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String getFileHeader(String str) throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        strBytesToHexString = null;
        String strBytesToHexString = null;
        try {
            fileInputStream = new FileInputStream(str);
            try {
                byte[] bArr = new byte[3];
                fileInputStream.read(bArr, 0, 3);
                strBytesToHexString = bytesToHexString(bArr);
            } catch (Exception unused) {
                if (fileInputStream != null) {
                }
                return strBytesToHexString;
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Exception unused3) {
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            fileInputStream.close();
        } catch (IOException unused4) {
        }
        return strBytesToHexString;
    }

    public static String getFileMD5(File file) {
        FileInputStream fileInputStream;
        byte[] bArr = new byte[1024];
        try {
            fileInputStream = new FileInputStream(file);
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                while (true) {
                    int i = fileInputStream.read(bArr);
                    if (i <= 0) {
                        fileInputStream.close();
                        return toHexString(messageDigest.digest());
                    }
                    messageDigest.update(bArr, 0, i);
                }
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                }
                return null;
            } catch (OutOfMemoryError e4) {
                e = e4;
                e.printStackTrace();
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
                return null;
            }
        } catch (Exception e6) {
            e = e6;
            fileInputStream = null;
        } catch (OutOfMemoryError e7) {
            e = e7;
            fileInputStream = null;
        }
    }

    private static long getFileSize(File file) {
        FileChannel channel = null;
        try {
            if (!file.exists() || !file.isFile()) {
                return 0L;
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            channel = fileInputStream.getChannel();
            long jAvailable = fileInputStream.available();
            if (channel != null) {
                try {
                    channel.close();
                } catch (IOException unused) {
                }
            }
            return jAvailable;
        } catch (FileNotFoundException unused2) {
            if (channel == null) {
                return 0L;
            }
            try {
                channel.close();
                return 0L;
            } catch (IOException unused3) {
                return 0L;
            }
        } catch (IOException unused4) {
            if (channel == null) {
                return 0L;
            }
            channel.close();
            return 0L;
        } catch (Throwable th) {
            if (channel != null) {
                try {
                    channel.close();
                } catch (IOException unused5) {
                }
            }
            throw th;
        }
    }

    public static String getFileType(String str) {
        HashMap map = new HashMap();
        map.put("FFD8FF", "jpg");
        map.put("89504E47", "png");
        map.put("47494638", "gif");
        map.put("49492A00", "tif");
        map.put("424D", "bmp");
        return (String) map.get(getFileHeader(str));
    }

    private static long getFolderSize(File file) {
        long folderSize = 0;
        try {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                return 0L;
            }
            for (int i = 0; i < fileArrListFiles.length; i++) {
                folderSize += fileArrListFiles[i].isDirectory() ? getFolderSize(fileArrListFiles[i]) : getFileSize(fileArrListFiles[i]);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return folderSize;
    }

    public static String getGifPath() {
        return TRIBUNE_STORAGE_PATH_TEMP + Announce_gif;
    }

    public static Bitmap getImage(String str, String str2) throws Exception {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.setConnectTimeout(10000);
        if (httpURLConnection.getResponseCode() == 200) {
            return BitmapFactory.decodeStream(httpURLConnection.getInputStream());
        }
        return null;
    }

    public static String getPath() {
        return ContextGetterUtils.INSTANCE.getApp().getFilesDir().getAbsolutePath();
    }

    public static String getRealPathFromURI(Uri uri, Context context) {
        try {
            Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, null, null, null);
            int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_data");
            cursorQuery.moveToFirst();
            String string = cursorQuery.getString(columnIndexOrThrow);
            cursorQuery.close();
            return string;
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static File getShareImgFile() {
        String str = TRIBUNE_STORAGE_PATH_INIT_PIC;
        new File(str).mkdirs();
        return new File(str + File.separator + "share.jpg");
    }

    public static final byte[] input2byte(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int i = inputStream.read(bArr, 0, 4096);
            if (i <= 0) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    public static boolean isFileExists(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        return file.exists() && file.isFile();
    }

    public static boolean makeSureDirectoryExists(String str) {
        if (str == null) {
            return false;
        }
        File file = new File(str);
        if (!file.isDirectory() && !file.mkdirs()) {
            Log.i(TAG, "Failed to make directory:" + file.getAbsolutePath());
        }
        return file.isDirectory();
    }

    public static boolean makeSureFileDelete(String str) {
        return str != null && makeSureFileDelete(new File(str));
    }

    public static boolean makeSureFileExist(String str) {
        return str != null && makeSureFileExist(new File(str));
    }

    public static boolean mkdirFile(String str) {
        if (!Environment.getExternalStorageState().equals("mounted")) {
            return false;
        }
        File file = new File(str);
        if (!file.exists() && !file.isDirectory()) {
            file.mkdir();
            if (!file.exists() && !file.isDirectory()) {
                File file2 = new File(TRIBUNE_STORAGE_PATH_TEMP);
                if (!file2.exists() && !file2.isDirectory()) {
                    file2.mkdir();
                }
                if (file2.exists() && file2.isDirectory()) {
                    file = new File(str);
                }
            }
        }
        return file.isDirectory();
    }

    public static String readFile(File file) {
        String str = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            str = "";
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                str = str + line;
            }
            fileInputStream.close();
        } catch (Exception unused) {
        }
        return str;
    }

    public static Bitmap readGifBitmap() {
        try {
            FileInputStream fileInputStream = new FileInputStream(getPath() + "/" + Announce_gif);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFileDescriptor(fileInputStream.getFD(), null, options);
            options.inJustDecodeBounds = false;
            options.inSampleSize = 1;
            return BitmapFactory.decodeFileDescriptor(fileInputStream.getFD(), null, options);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String readJson(String str) {
        return LocalFileUtils.INSTANCE.readJson(str);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x0095 A[Catch: IOException -> 0x0091, TryCatch #5 {IOException -> 0x0091, blocks: (B:43:0x008d, B:47:0x0095, B:49:0x009a), top: B:54:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:49:0x009a A[Catch: IOException -> 0x0091, TRY_LEAVE, TryCatch #5 {IOException -> 0x0091, blocks: (B:43:0x008d, B:47:0x0095, B:49:0x009a), top: B:54:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:54:0x008d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static String readStringFromAssets(Context context, String str) throws Throwable {
        InputStream inputStreamOpen;
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        IOException e2;
        AssetManager assets = context.getApplicationContext().getAssets();
        StringBuffer stringBuffer = new StringBuffer();
        BufferedReader bufferedReader2 = null;
        try {
            try {
                inputStreamOpen = assets.open(str);
                try {
                    inputStreamReader = new InputStreamReader(inputStreamOpen);
                    try {
                        bufferedReader = new BufferedReader(inputStreamReader);
                        try {
                            try {
                                stringBuffer.append(bufferedReader.readLine());
                                while (true) {
                                    String line = bufferedReader.readLine();
                                    if (line == null) {
                                        break;
                                    }
                                    stringBuffer.append(Weather.SEPARATOR + line);
                                }
                                bufferedReader.close();
                                inputStreamReader.close();
                                inputStreamOpen.close();
                                bufferedReader.close();
                                inputStreamReader.close();
                                inputStreamOpen.close();
                            } catch (IOException e3) {
                                e2 = e3;
                                e2.printStackTrace();
                                if (bufferedReader != null) {
                                    bufferedReader.close();
                                }
                                if (inputStreamReader != null) {
                                    inputStreamReader.close();
                                }
                                if (inputStreamOpen != null) {
                                    inputStreamOpen.close();
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader2 = bufferedReader;
                            if (bufferedReader2 != null) {
                                try {
                                    bufferedReader2.close();
                                    if (inputStreamReader != null) {
                                        inputStreamReader.close();
                                    }
                                    if (inputStreamOpen != null) {
                                        inputStreamOpen.close();
                                    }
                                } catch (IOException e4) {
                                    e4.printStackTrace();
                                    throw th;
                                }
                            } else {
                                if (inputStreamReader != null) {
                                    inputStreamReader.close();
                                }
                                if (inputStreamOpen != null) {
                                    inputStreamOpen.close();
                                }
                            }
                            throw th;
                        }
                    } catch (IOException e5) {
                        bufferedReader = null;
                        e2 = e5;
                    } catch (Throwable th2) {
                        th = th2;
                        if (bufferedReader2 != null) {
                            bufferedReader2.close();
                            if (inputStreamReader != null) {
                                inputStreamReader.close();
                            }
                            if (inputStreamOpen != null) {
                                inputStreamOpen.close();
                            }
                        } else {
                            if (inputStreamReader != null) {
                                inputStreamReader.close();
                            }
                            if (inputStreamOpen != null) {
                                inputStreamOpen.close();
                            }
                        }
                        throw th;
                    }
                } catch (IOException e6) {
                    bufferedReader = null;
                    e2 = e6;
                    inputStreamReader = null;
                } catch (Throwable th3) {
                    th = th3;
                    inputStreamReader = null;
                }
            } catch (IOException e7) {
                e7.printStackTrace();
            }
        } catch (IOException e8) {
            inputStreamReader = null;
            bufferedReader = null;
            e2 = e8;
            inputStreamOpen = null;
        } catch (Throwable th4) {
            th = th4;
            inputStreamOpen = null;
            inputStreamReader = null;
        }
        return stringBuffer.toString();
    }

    public static String readStringFromFile(String str) throws Exception {
        FileInputStream fileInputStream = new FileInputStream(new File(str));
        String strConvertStreamToString = convertStreamToString(fileInputStream);
        IOUtils.closeQuietly((InputStream) fileInputStream);
        return strConvertStreamToString;
    }

    public static Bitmap readTabIconBitmap(String str, int i, int i2) {
        try {
            FileInputStream fileInputStream = new FileInputStream(getBitmapPath() + "/" + str);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFileDescriptor(fileInputStream.getFD(), null, options);
            options.inJustDecodeBounds = false;
            options.inSampleSize = 1;
            return BitmapFactory.decodeFileDescriptor(fileInputStream.getFD(), null, options);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean saveBitmap(Bitmap bitmap, String str) {
        if (bitmap == null || bitmap.isRecycled() || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            File file = new File(getBitmapPath());
            if (!file.exists()) {
                file.mkdirs();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(new File(file, str + ".png"));
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            return true;
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
            return false;
        } catch (IOException e3) {
            e3.printStackTrace();
            return false;
        }
    }

    public static boolean saveBitmapToFile(Bitmap bitmap, String str, int i, boolean z) {
        boolean zCompress = false;
        if (bitmap == null || str == null) {
            return false;
        }
        File file = new File(str);
        if (file.exists() && file.length() > 0) {
            if (!z) {
                return true;
            }
            file.delete();
        }
        File parentFile = file.getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            zCompress = bitmap.compress(Bitmap.CompressFormat.JPEG, i, bufferedOutputStream);
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return zCompress;
        }
    }

    public static String saveGif(String str, byte[] bArr) throws Throwable {
        if (!str.contains(".gif")) {
            return "";
        }
        File file = new File(getPath());
        LogUtils.INSTANCE.d(TAG, "saveGif: " + TRIBUNE_STORAGE_PATH_TEMP);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(getPath(), Announce_gif);
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
            try {
                fileOutputStream2.write(bArr);
                String path = file2.getPath();
                try {
                    fileOutputStream2.close();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                return path;
            } catch (Exception e3) {
                e = e3;
                fileOutputStream = fileOutputStream2;
                e.printStackTrace();
                Log.e("存储出错", e.getMessage());
                try {
                    fileOutputStream.close();
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
                return "";
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                try {
                    fileOutputStream.close();
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                throw th;
            }
        } catch (Exception e6) {
            e = e6;
        }
    }

    public static boolean savePictureToAlbum(Context context, Bitmap bitmap, String str) {
        ContentValues contentValues = new ContentValues();
        String str2 = Environment.DIRECTORY_DCIM + "/Store";
        contentValues.put("_display_name", str);
        contentValues.put(iim.a.f, str);
        contentValues.put("mime_type", j.MIME_TYPE_JPEG);
        contentValues.put("relative_path", str2);
        try {
            OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(context.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues));
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, outputStreamOpenOutputStream);
            outputStreamOpenOutputStream.close();
            String str3 = Environment.getExternalStorageDirectory().getPath() + "/" + str2 + "/" + str;
            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            intent.setData(Uri.fromFile(new File(str3)));
            context.sendBroadcast(intent);
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static void saveToFile(File file, InputStream inputStream) throws IOException {
        byte[] bArr = new byte[4096];
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        while (true) {
            int i = bufferedInputStream.read(bArr);
            if (i == -1) {
                IOUtils.closeQuietly((OutputStream) fileOutputStream);
                IOUtils.closeQuietly((InputStream) bufferedInputStream);
                return;
            }
            fileOutputStream.write(bArr, 0, i);
        }
    }

    public static String toHexString(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            char[] cArr = HEX_DIGITS;
            sb.append(cArr[(bArr[i] & 240) >>> 4]);
            sb.append(cArr[bArr[i] & 15]);
        }
        return sb.toString();
    }

    public static String uidToHeadLocalPath(long j2) {
        if (IS_SDK_SUPPORT_WEBP) {
            return TRIBUNE_STORAGE_PATH_TEMP_USER_HEAD + j2 + ".webp";
        }
        return TRIBUNE_STORAGE_PATH_TEMP_USER_HEAD + j2 + ".jpg";
    }

    public static void updatePhotoMedia(File file, Context context) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(Uri.fromFile(file));
        context.sendBroadcast(intent);
    }

    public static String urlToNormalBaseName(String str) {
        if (str.endsWith("gif") || str.endsWith("GIF")) {
            return MD5Sign.hexDigest(str).substring(0, 16) + ".gif";
        }
        return MD5Sign.hexDigest(str).substring(0, 16) + ".jpg";
    }

    public static boolean videoPathMkdir() {
        File file = new File(VIDEO_STORAGE_PATH);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.isDirectory();
    }

    public static void writeFile(InputStream inputStream, File file) throws IOException {
        if (inputStream == null || file == null) {
            return;
        }
        saveToFile(file, inputStream);
    }

    public static boolean writeToFile(InputStream inputStream, String str) {
        if (inputStream == null || str == null) {
            return false;
        }
        try {
            writeFile(inputStream, str);
            return true;
        } catch (IOException e2) {
            e2.printStackTrace();
            return false;
        } finally {
            IOUtils.closeQuietly(inputStream);
        }
    }

    public static boolean writeToJsonFile(String str, String str2) {
        return LocalFileUtils.INSTANCE.writeToJsonFile(str, str2);
    }

    public static boolean makeSureFileDelete(File file) {
        if (file == null) {
            return false;
        }
        if (file.isFile()) {
            file.delete();
        }
        return !file.isFile();
    }

    public static boolean makeSureFileExist(File file) {
        if (file == null) {
            return false;
        }
        if (!file.isFile()) {
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.isDirectory()) {
                parentFile.mkdirs();
            }
            try {
                file.createNewFile();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        return file.isFile();
    }

    public static void writeFile(InputStream inputStream, String str) throws IOException {
        if (inputStream == null || str == null) {
            return;
        }
        writeFile(inputStream, new File(str));
    }

    public static boolean deleteFile(File file) {
        if (file != null && file.exists()) {
            try {
                return file.delete();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }

    public static void writeFile(String str, String str2, InputStream inputStream) throws Throwable {
        writeFile(str + str2, inputStream);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0051 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static void writeFile(String str, InputStream inputStream) throws Throwable {
        Throwable th;
        BufferedOutputStream bufferedOutputStream;
        Exception e2;
        if (inputStream != null) {
            try {
                try {
                    bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(str)));
                    try {
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int i = inputStream.read(bArr);
                                if (i > 0) {
                                    bufferedOutputStream.write(bArr, 0, i);
                                } else {
                                    try {
                                        break;
                                    } catch (IOException e3) {
                                        e3.printStackTrace();
                                    }
                                }
                            }
                            bufferedOutputStream.close();
                            inputStream.close();
                        } catch (Exception e4) {
                            e2 = e4;
                            e2.printStackTrace();
                            if (bufferedOutputStream != null) {
                                try {
                                    bufferedOutputStream.close();
                                } catch (IOException e5) {
                                    e5.printStackTrace();
                                }
                            }
                            inputStream.close();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (bufferedOutputStream != null) {
                            try {
                                bufferedOutputStream.close();
                            } catch (IOException e6) {
                                e6.printStackTrace();
                            }
                        }
                        try {
                            inputStream.close();
                            throw th;
                        } catch (IOException e7) {
                            e7.printStackTrace();
                            throw th;
                        }
                    }
                } catch (IOException e8) {
                    e8.printStackTrace();
                }
            } catch (Exception e9) {
                e2 = e9;
                bufferedOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                bufferedOutputStream = null;
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
                inputStream.close();
                throw th;
            }
        }
    }

    public static String readFile(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str);
        if (file.exists()) {
            return readFile(file);
        }
        return null;
    }

    public static boolean copy(String str, String str2) throws Throwable {
        File file = new File(str);
        if (!file.isFile()) {
            return false;
        }
        File file2 = new File(str2);
        if (file2.exists()) {
            return true;
        }
        if (!makeSureFileExist(file2)) {
            return false;
        }
        try {
            copyFile(file, file2);
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static void copyFolder(String str, String str2) throws Throwable {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        copyFolder(new File(str), new File(str2));
    }

    public static boolean saveBitmapToFile(Bitmap bitmap, String str) {
        return saveBitmapToFile(bitmap, str, Bitmap.CompressFormat.PNG, 100);
    }

    public static boolean saveBitmapToFile(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat, int i) throws Throwable {
        if (bitmap == null || bitmap.isRecycled() || TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        makeSureFileExist(file);
        BufferedOutputStream bufferedOutputStream = null;
        try {
            try {
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file));
                try {
                    bitmap.compress(compressFormat, i, bufferedOutputStream2);
                    bufferedOutputStream2.flush();
                    try {
                        bufferedOutputStream2.close();
                        return true;
                    } catch (IOException e2) {
                        e2.printStackTrace();
                        return true;
                    }
                } catch (Exception e3) {
                    e = e3;
                    bufferedOutputStream = bufferedOutputStream2;
                    makeSureFileDelete(str);
                    e.printStackTrace();
                    if (bufferedOutputStream == null) {
                        return false;
                    }
                    try {
                        bufferedOutputStream.close();
                        return false;
                    } catch (IOException e4) {
                        e4.printStackTrace();
                        return false;
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedOutputStream = bufferedOutputStream2;
                    if (bufferedOutputStream != null) {
                        try {
                            bufferedOutputStream.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Exception e6) {
                e = e6;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
