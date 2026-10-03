package com.liulishuo.okdownload.core;

import android.content.Context;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.StatFs;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import com.heytap.webview.extension.protocol.Const;
import com.liulishuo.okdownload.DownloadTask;
import com.liulishuo.okdownload.OkDownload;
import com.liulishuo.okdownload.core.breakpoint.BlockInfo;
import com.liulishuo.okdownload.core.breakpoint.BreakpointInfo;
import com.liulishuo.okdownload.core.breakpoint.BreakpointStoreOnCache;
import com.liulishuo.okdownload.core.breakpoint.BreakpointStoreOnSQLite;
import com.liulishuo.okdownload.core.breakpoint.DownloadStore;
import com.liulishuo.okdownload.core.connection.DownloadConnection;
import com.liulishuo.okdownload.core.connection.DownloadOkHttp3Connection;
import com.liulishuo.okdownload.core.connection.DownloadUrlConnection;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
public class Util {
    public static final String ACCEPT_RANGES = "Accept-Ranges";
    public static final int CHUNKED_CONTENT_LENGTH = -1;
    public static final String CONTENT_DISPOSITION = "Content-Disposition";
    public static final String CONTENT_LENGTH = "Content-Length";
    public static final String CONTENT_RANGE = "Content-Range";
    public static final String ETAG = "Etag";
    public static final String IF_MATCH = "If-Match";
    public static final String METHOD_HEAD = "HEAD";
    public static final String RANGE = "Range";
    public static final int RANGE_NOT_SATISFIABLE = 416;
    public static final String TRANSFER_ENCODING = "Transfer-Encoding";
    public static final String USER_AGENT = "User-Agent";
    public static final String VALUE_CHUNKED = "chunked";
    private static Logger logger = new EmptyLogger();

    public static class EmptyLogger implements Logger {
        @Override // com.liulishuo.okdownload.core.Util.Logger
        public void d(String str, String str2) {
        }

        @Override // com.liulishuo.okdownload.core.Util.Logger
        public void e(String str, String str2, Exception exc) {
        }

        @Override // com.liulishuo.okdownload.core.Util.Logger
        public void i(String str, String str2) {
        }

        @Override // com.liulishuo.okdownload.core.Util.Logger
        public void w(String str, String str2) {
        }
    }

    public interface Logger {
        void d(String str, String str2);

        void e(String str, String str2, Exception exc);

        void i(String str, String str2);

        void w(String str, String str2);
    }

    public static void addDefaultUserAgent(@NonNull DownloadConnection downloadConnection) {
        downloadConnection.addHeader("User-Agent", "OkDownload/1.0.7");
    }

    public static void addRequestHeaderFields(@NonNull Map<String, List<String>> map, @NonNull DownloadConnection downloadConnection) {
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            Iterator<String> it = entry.getValue().iterator();
            while (it.hasNext()) {
                downloadConnection.addHeader(key, it.next());
            }
        }
    }

    public static void addUserRequestHeaderField(@NonNull Map<String, List<String>> map, @NonNull DownloadConnection downloadConnection) throws IOException {
        inspectUserHeader(map);
        addRequestHeaderFields(map, downloadConnection);
    }

    public static void assembleBlock(@NonNull DownloadTask downloadTask, @NonNull BreakpointInfo breakpointInfo, long j2, boolean z) {
        int iDetermineBlockCount = OkDownload.with().downloadStrategy().isUseMultiBlock(z) ? OkDownload.with().downloadStrategy().determineBlockCount(downloadTask, j2) : 1;
        breakpointInfo.resetBlockInfos();
        long j3 = iDetermineBlockCount;
        long j4 = j2 / j3;
        long j5 = 0;
        int i = 0;
        long j6 = 0;
        while (i < iDetermineBlockCount) {
            j5 += j6;
            j6 = i == 0 ? (j2 % j3) + j4 : j4;
            breakpointInfo.addBlock(new BlockInfo(j5, j6));
            i++;
        }
    }

    public static boolean checkPermission(String str) {
        return OkDownload.with().context().checkCallingOrSelfPermission(str) == 0;
    }

    @NonNull
    public static DownloadConnection.Factory createDefaultConnectionFactory() {
        try {
            return (DownloadConnection.Factory) DownloadOkHttp3Connection.Factory.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            return new DownloadUrlConnection.Factory();
        }
    }

    @NonNull
    public static DownloadStore createDefaultDatabase(Context context) {
        try {
            return (DownloadStore) BreakpointStoreOnSQLite.class.getDeclaredConstructor(Context.class).newInstance(context);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            return new BreakpointStoreOnCache();
        }
    }

    @NonNull
    public static DownloadStore createRemitDatabase(@NonNull DownloadStore downloadStore) {
        try {
            downloadStore = (DownloadStore) downloadStore.getClass().getMethod("createRemitSelf", new Class[0]).invoke(downloadStore, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        d("Util", "Get final download store is " + downloadStore);
        return downloadStore;
    }

    public static void d(String str, String str2) {
        Logger logger2 = logger;
        if (logger2 != null) {
            logger2.d(str, str2);
        } else {
            Log.d(str, str2);
        }
    }

    public static void e(String str, String str2, Exception exc) {
        Logger logger2 = logger;
        if (logger2 != null) {
            logger2.e(str, str2, exc);
        } else {
            Log.e(str, str2, exc);
        }
    }

    public static void enableConsoleLog() {
        logger = null;
    }

    @Nullable
    public static String getFilenameFromContentUri(@NonNull Uri uri) {
        Cursor cursorQuery = OkDownload.with().context().getContentResolver().query(uri, null, null, null, null);
        if (cursorQuery == null) {
            return null;
        }
        try {
            cursorQuery.moveToFirst();
            return cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
        } finally {
            cursorQuery.close();
        }
    }

    public static long getFreeSpaceBytes(@NonNull StatFs statFs) {
        return statFs.getAvailableBytes();
    }

    public static Logger getLogger() {
        return logger;
    }

    @SuppressFBWarnings({"DMI"})
    @NonNull
    public static File getParentFile(File file) {
        File parentFile = file.getParentFile();
        return parentFile == null ? new File("/") : parentFile;
    }

    public static long getSizeFromContentUri(@NonNull Uri uri) {
        Cursor cursorQuery = OkDownload.with().context().getContentResolver().query(uri, null, null, null, null);
        if (cursorQuery == null) {
            return 0L;
        }
        try {
            cursorQuery.moveToFirst();
            return cursorQuery.getLong(cursorQuery.getColumnIndex("_size"));
        } finally {
            cursorQuery.close();
        }
    }

    public static String humanReadableBytes(long j2, boolean z) {
        int i = z ? 1000 : 1024;
        if (j2 < i) {
            return j2 + " B";
        }
        double d = j2;
        double d2 = i;
        int iLog = (int) (Math.log(d) / Math.log(d2));
        StringBuilder sb = new StringBuilder();
        sb.append((z ? "kMGTPE" : "KMGTPE").charAt(iLog - 1));
        sb.append(z ? "" : "i");
        return String.format(Locale.ENGLISH, "%.1f %sB", Double.valueOf(d / Math.pow(d2, iLog)), sb.toString());
    }

    public static void i(String str, String str2) {
        Logger logger2 = logger;
        if (logger2 != null) {
            logger2.i(str, str2);
        } else {
            Log.i(str, str2);
        }
    }

    public static void inspectUserHeader(@NonNull Map<String, List<String>> map) throws IOException {
        if (map.containsKey(IF_MATCH) || map.containsKey("Range")) {
            throw new IOException("If-Match and Range only can be handle by internal!");
        }
    }

    public static boolean isCorrectFull(long j2, long j3) {
        return j2 == j3;
    }

    public static boolean isEmpty(@Nullable CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static boolean isNetworkAvailable(ConnectivityManager connectivityManager) {
        if (connectivityManager == null) {
            w("Util", "failed to get connectivity manager!");
            return true;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public static boolean isNetworkNotOnWifiType(ConnectivityManager connectivityManager) {
        if (connectivityManager == null) {
            w("Util", "failed to get connectivity manager!");
            return true;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo == null || activeNetworkInfo.getType() != 1;
    }

    public static boolean isUriContentScheme(@NonNull Uri uri) {
        return uri.getScheme().equals("content");
    }

    public static boolean isUriFileScheme(@NonNull Uri uri) {
        return uri.getScheme().equals(Const.Scheme.SCHEME_FILE);
    }

    @Nullable
    public static String md5(String str) {
        byte[] bArrDigest;
        try {
            bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException unused) {
            bArrDigest = null;
        }
        if (bArrDigest == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(bArrDigest.length * 2);
        for (byte b : bArrDigest) {
            int i = b & 255;
            if (i < 16) {
                sb.append('0');
            }
            sb.append(Integer.toHexString(i));
        }
        return sb.toString();
    }

    public static long parseContentLength(@Nullable String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            d("Util", "parseContentLength failed parse for '" + str + "'");
            return -1L;
        }
    }

    public static long parseContentLengthFromContentRange(@Nullable String str) {
        if (str != null && str.length() != 0) {
            try {
                Matcher matcher = Pattern.compile("bytes (\\d+)-(\\d+)/\\d+").matcher(str);
                if (matcher.find()) {
                    return (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                }
            } catch (Exception e2) {
                w("Util", "parse content-length from content-range failed " + e2);
            }
        }
        return -1L;
    }

    public static void resetBlockIfDirty(BlockInfo blockInfo) {
        boolean z = true;
        if (blockInfo.getCurrentOffset() >= 0 && blockInfo.getCurrentOffset() <= blockInfo.getContentLength()) {
            z = false;
        }
        if (z) {
            w("resetBlockIfDirty", "block is dirty so have to reset: " + blockInfo);
            blockInfo.resetBlock();
        }
    }

    public static void setLogger(@Nullable Logger logger2) {
        logger = logger2;
    }

    public static ThreadFactory threadFactory(final String str, final boolean z) {
        return new ThreadFactory() { // from class: com.liulishuo.okdownload.core.Util.1
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(@NonNull Runnable runnable) {
                Thread thread = new Thread(runnable, str);
                thread.setDaemon(z);
                return thread;
            }
        };
    }

    public static void w(String str, String str2) {
        Logger logger2 = logger;
        if (logger2 != null) {
            logger2.w(str, str2);
        } else {
            Log.w(str, str2);
        }
    }
}
