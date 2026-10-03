package com.platform.usercenter.tools.io;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.text.TextUtils;
import com.oplus.weatherservicesdk.data.Weather;
import com.platform.usercenter.tools.log.UCLogUtil;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes9.dex */
public class FileUtils {
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final String TAG = "FileUtils";

    private FileUtils() {
        throw new IllegalArgumentException();
    }

    public static String basename(String str) {
        int i;
        if (str == null) {
            return str;
        }
        int iLastIndexOf = str.lastIndexOf(47);
        return (iLastIndexOf == -1 || (i = iLastIndexOf + 1) >= str.length()) ? str : str.substring(i);
    }

    public static byte[] bmpToByteArray(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            try {
                byteArrayOutputStream.close();
            } catch (Exception e2) {
                UCLogUtil.e(TAG, e2);
            }
            return byteArray;
        } finally {
            bitmap.recycle();
        }
    }

    public static void cleanFilesInDir(File file, String str) {
        if (file == null || !file.exists() || file.isFile() || TextUtils.isEmpty(str)) {
            return;
        }
        for (File file2 : file.listFiles()) {
            if (file2.isFile()) {
                String name = file2.getName();
                if (!TextUtils.isEmpty(name) && !str.equals(name)) {
                    file2.delete();
                }
            }
        }
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
                    UCLogUtil.e(TAG, e2);
                }
            } catch (Throwable th) {
                Closeables.close(inputStream, false);
                throw th;
            }
        }
        Closeables.close(inputStream, false);
        return sb.toString();
    }

    public static boolean copy(String str, String str2, boolean z) {
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
            UCLogUtil.e(TAG, e2);
            return false;
        }
    }

    public static void copyFile(File file, File file2) throws IOException {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i = bufferedInputStream.read(bArr);
                        if (i == -1) {
                            bufferedOutputStream.flush();
                            bufferedOutputStream.close();
                            bufferedInputStream.close();
                            return;
                        }
                        bufferedOutputStream.write(bArr, 0, i);
                        try {
                            bufferedInputStream.close();
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    try {
                        bufferedOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                bufferedInputStream.close();
                throw th4;
            }
        } catch (Exception e2) {
            UCLogUtil.e(TAG, e2);
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

    public static void deleteDir(File file) {
        File[] fileArrListFiles;
        if (file.isFile()) {
            file.delete();
            return;
        }
        if (!file.isDirectory() || (fileArrListFiles = file.listFiles()) == null || fileArrListFiles.length == 0) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            deleteDir(file2);
        }
        file.delete();
    }

    public static boolean fileExists(String str) {
        return str != null && new File(str).isFile();
    }

    public static File getExternalCacheDir(Context context) {
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir != null) {
            return externalCacheDir;
        }
        return new File(Environment.getExternalStorageDirectory().getPath() + ("/Android/data/" + context.getPackageName() + "/cache"));
    }

    public static long getFileLength(File file) {
        if (file != null && file.exists() && file.isFile()) {
            return file.length();
        }
        return 0L;
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
                UCLogUtil.e(TAG, e);
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e3) {
                        UCLogUtil.e(TAG, e3);
                    }
                }
                return null;
            } catch (OutOfMemoryError e4) {
                e = e4;
                UCLogUtil.e(TAG, e.getMessage());
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e5) {
                        UCLogUtil.e(TAG, e5);
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

    public static String getLegalFileName(String str) {
        String strReplaceAll = str.replaceAll("[?*|<>:\\/\"]+", "_");
        return strReplaceAll != null ? strReplaceAll.replace("&", "_") : strReplaceAll;
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
            UCLogUtil.i(TAG, "Failed to make directory:" + file.getAbsolutePath());
        }
        return file.isDirectory();
    }

    public static boolean makeSureFileDelete(String str) {
        return str != null && makeSureFileDelete(new File(str));
    }

    public static boolean makeSureFileExist(String str) {
        return str != null && makeSureFileExist(new File(str));
    }

    public static Bitmap readCompressBitmapIfOversized(String str, int i) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        int i2 = options.outWidth * options.outHeight;
        if (i2 <= i) {
            return null;
        }
        options.inSampleSize = (int) Math.ceil(Math.sqrt(((double) i2) / ((double) i)));
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(str, options);
    }

    public static String readStringFromAssert(Context context, String str) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open(str), StandardCharsets.UTF_8));
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                bufferedReader.close();
                return sb.toString();
            }
            sb.append(line);
        }
    }

    public static String readStringFromFile(String str) throws Exception {
        FileInputStream fileInputStream = new FileInputStream(new File(str));
        String strConvertStreamToString = convertStreamToString(fileInputStream);
        Closeables.close(fileInputStream, true);
        return strConvertStreamToString;
    }

    public static boolean saveFile(Bitmap bitmap, String str, int i) throws IOException {
        boolean zCompress = false;
        if (bitmap != null && str != null) {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
            File parentFile = file.getParentFile();
            if (!parentFile.exists()) {
                parentFile.mkdir();
            }
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                if (i < 0 || i > 100) {
                    i = 80;
                }
                try {
                    zCompress = bitmap.compress(Bitmap.CompressFormat.PNG, i, bufferedOutputStream);
                    bufferedOutputStream.flush();
                    bufferedOutputStream.close();
                } catch (Throwable th) {
                    try {
                        bufferedOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Exception e2) {
                UCLogUtil.e(TAG, e2);
            }
        }
        return zCompress;
    }

    public static void saveToFile(File file, InputStream inputStream) throws IOException {
        byte[] bArr = new byte[4096];
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                while (true) {
                    try {
                        int i = bufferedInputStream.read(bArr);
                        if (i == -1) {
                            fileOutputStream.close();
                            bufferedInputStream.close();
                            return;
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
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                bufferedInputStream.close();
                throw th4;
            }
        } catch (Exception e2) {
            UCLogUtil.e(TAG, e2);
        }
    }

    public static String toHexString(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            char[] cArr = HEX_DIGITS;
            sb.append(cArr[(bArr[i] & 240) >>> 4]);
            sb.append(cArr[bArr[i] & 15]);
        }
        return sb.toString();
    }

    public static String urlToCacheLocalPath(Context context, String str) {
        String strUrlToNormalBaseName;
        if (str == null || (strUrlToNormalBaseName = urlToNormalBaseName(str)) == null) {
            return null;
        }
        return getExternalCacheDir(context) + File.separator + strUrlToNormalBaseName;
    }

    public static String urlToNormalBaseName(String str) {
        return getLegalFileName(basename(str));
    }

    public static void writeFile(InputStream inputStream, File file) throws IOException {
        if (inputStream == null || file == null) {
            return;
        }
        saveToFile(file, inputStream);
    }

    public static boolean writeToFile(InputStream inputStream, String str) {
        boolean z = false;
        if (inputStream == null || str == null) {
            return z;
        }
        z = true;
        try {
            writeFile(inputStream, str);
            return z;
        } catch (IOException e2) {
            UCLogUtil.e(TAG, e2);
            return z;
        } finally {
            try {
                Closeables.close(inputStream, z);
            } catch (IOException e3) {
                UCLogUtil.e(TAG, e3);
            }
        }
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
                UCLogUtil.e(TAG, e2);
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

    public static boolean copy(String str, String str2) {
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
        } catch (IOException e2) {
            UCLogUtil.e(TAG, e2);
            return false;
        }
    }
}
