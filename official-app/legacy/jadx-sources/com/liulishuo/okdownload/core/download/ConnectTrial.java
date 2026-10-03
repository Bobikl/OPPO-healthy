package com.liulishuo.okdownload.core.download;

import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.liulishuo.okdownload.DownloadListener;
import com.liulishuo.okdownload.DownloadTask;
import com.liulishuo.okdownload.OkDownload;
import com.liulishuo.okdownload.core.Util;
import com.liulishuo.okdownload.core.breakpoint.BreakpointInfo;
import com.liulishuo.okdownload.core.connection.DownloadConnection;
import com.liulishuo.okdownload.core.exception.DownloadSecurityException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
public class ConnectTrial {
    private static final String TAG = "ConnectTrial";
    private boolean acceptRange;

    @NonNull
    private final BreakpointInfo info;

    @IntRange(from = -1)
    private long instanceLength;
    private int responseCode;

    @Nullable
    private String responseEtag;

    @Nullable
    private String responseFilename;

    @NonNull
    private final DownloadTask task;
    private static final Pattern CONTENT_DISPOSITION_QUOTED_PATTERN = Pattern.compile("attachment;\\s*filename\\s*=\\s*\"([^\"]*)\"");
    private static final Pattern CONTENT_DISPOSITION_NON_QUOTED_PATTERN = Pattern.compile("attachment;\\s*filename\\s*=\\s*(.*)");

    public ConnectTrial(@NonNull DownloadTask downloadTask, @NonNull BreakpointInfo breakpointInfo) {
        this.task = downloadTask;
        this.info = breakpointInfo;
    }

    @Nullable
    private static String findEtag(DownloadConnection.Connected connected) {
        return connected.getResponseHeaderField(Util.ETAG);
    }

    @Nullable
    private static String findFilename(DownloadConnection.Connected connected) throws IOException {
        return parseContentDisposition(connected.getResponseHeaderField(Util.CONTENT_DISPOSITION));
    }

    private static long findInstanceLength(DownloadConnection.Connected connected) {
        long contentRangeFoInstanceLength = parseContentRangeFoInstanceLength(connected.getResponseHeaderField(Util.CONTENT_RANGE));
        if (contentRangeFoInstanceLength != -1) {
            return contentRangeFoInstanceLength;
        }
        if (!parseTransferEncoding(connected.getResponseHeaderField(Util.TRANSFER_ENCODING))) {
            Util.w(TAG, "Transfer-Encoding isn't chunked but there is no valid instance length found either!");
        }
        return -1L;
    }

    @Nullable
    private static String parseContentDisposition(String str) throws IOException {
        String strGroup;
        if (str == null) {
            return null;
        }
        try {
            Matcher matcher = CONTENT_DISPOSITION_QUOTED_PATTERN.matcher(str);
            if (matcher.find()) {
                strGroup = matcher.group(1);
            } else {
                Matcher matcher2 = CONTENT_DISPOSITION_NON_QUOTED_PATTERN.matcher(str);
                strGroup = matcher2.find() ? matcher2.group(1) : null;
            }
            if (strGroup != null && strGroup.contains("../")) {
                throw new DownloadSecurityException("The filename [" + strGroup + "] from the response is not allowable, because it contains '../', which can raise the directory traversal vulnerability");
            }
            return strGroup;
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    private static long parseContentRangeFoInstanceLength(@Nullable String str) {
        if (str == null) {
            return -1L;
        }
        String[] strArrSplit = str.split("/");
        if (strArrSplit.length >= 2) {
            try {
                return Long.parseLong(strArrSplit[1]);
            } catch (NumberFormatException unused) {
                Util.w(TAG, "parse instance length failed with " + str);
            }
        }
        return -1L;
    }

    private static boolean parseTransferEncoding(@Nullable String str) {
        return str != null && str.equals("chunked");
    }

    public void executeTrial() throws IOException {
        OkDownload.with().downloadStrategy().inspectNetworkOnWifi(this.task);
        OkDownload.with().downloadStrategy().inspectNetworkAvailable();
        DownloadConnection downloadConnectionCreate = OkDownload.with().connectionFactory().create(this.task.getUrl());
        try {
            if (!Util.isEmpty(this.info.getEtag())) {
                downloadConnectionCreate.addHeader(Util.IF_MATCH, this.info.getEtag());
            }
            downloadConnectionCreate.addHeader("Range", "bytes=0-0");
            Map<String, List<String>> headerMapFields = this.task.getHeaderMapFields();
            if (headerMapFields != null) {
                Util.addUserRequestHeaderField(headerMapFields, downloadConnectionCreate);
            }
            DownloadListener downloadListenerDispatch = OkDownload.with().callbackDispatcher().dispatch();
            downloadListenerDispatch.connectTrialStart(this.task, downloadConnectionCreate.getRequestProperties());
            DownloadConnection.Connected connectedExecute = downloadConnectionCreate.execute();
            this.task.setRedirectLocation(connectedExecute.getRedirectLocation());
            Util.d(TAG, "task[" + this.task.getId() + "] redirect location: " + this.task.getRedirectLocation());
            this.responseCode = connectedExecute.getResponseCode();
            this.acceptRange = isAcceptRange(connectedExecute);
            this.instanceLength = findInstanceLength(connectedExecute);
            this.responseEtag = findEtag(connectedExecute);
            this.responseFilename = findFilename(connectedExecute);
            Map<String, List<String>> responseHeaderFields = connectedExecute.getResponseHeaderFields();
            if (responseHeaderFields == null) {
                responseHeaderFields = new HashMap<>();
            }
            downloadListenerDispatch.connectTrialEnd(this.task, this.responseCode, responseHeaderFields);
            boolean zIsNeedTrialHeadMethodForInstanceLength = isNeedTrialHeadMethodForInstanceLength(this.instanceLength, connectedExecute);
            downloadConnectionCreate.release();
            if (zIsNeedTrialHeadMethodForInstanceLength) {
                trialHeadMethodForInstanceLength();
            }
        } catch (Throwable th) {
            downloadConnectionCreate.release();
            throw th;
        }
    }

    public long getInstanceLength() {
        return this.instanceLength;
    }

    public int getResponseCode() {
        return this.responseCode;
    }

    @Nullable
    public String getResponseEtag() {
        return this.responseEtag;
    }

    @Nullable
    public String getResponseFilename() {
        return this.responseFilename;
    }

    public boolean isAcceptRange() {
        return this.acceptRange;
    }

    public boolean isChunked() {
        return this.instanceLength == -1;
    }

    public boolean isEtagOverdue() {
        return (this.info.getEtag() == null || this.info.getEtag().equals(this.responseEtag)) ? false : true;
    }

    public boolean isNeedTrialHeadMethodForInstanceLength(long j2, @NonNull DownloadConnection.Connected connected) {
        String responseHeaderField;
        if (j2 != -1) {
            return false;
        }
        String responseHeaderField2 = connected.getResponseHeaderField(Util.CONTENT_RANGE);
        return (responseHeaderField2 == null || responseHeaderField2.length() <= 0) && !parseTransferEncoding(connected.getResponseHeaderField(Util.TRANSFER_ENCODING)) && (responseHeaderField = connected.getResponseHeaderField("Content-Length")) != null && responseHeaderField.length() > 0;
    }

    public void trialHeadMethodForInstanceLength() throws IOException {
        DownloadConnection downloadConnectionCreate = OkDownload.with().connectionFactory().create(this.task.getUrl());
        DownloadListener downloadListenerDispatch = OkDownload.with().callbackDispatcher().dispatch();
        try {
            downloadConnectionCreate.setRequestMethod("HEAD");
            Map<String, List<String>> headerMapFields = this.task.getHeaderMapFields();
            if (headerMapFields != null) {
                Util.addUserRequestHeaderField(headerMapFields, downloadConnectionCreate);
            }
            downloadListenerDispatch.connectTrialStart(this.task, downloadConnectionCreate.getRequestProperties());
            DownloadConnection.Connected connectedExecute = downloadConnectionCreate.execute();
            downloadListenerDispatch.connectTrialEnd(this.task, connectedExecute.getResponseCode(), connectedExecute.getResponseHeaderFields());
            this.instanceLength = Util.parseContentLength(connectedExecute.getResponseHeaderField("Content-Length"));
        } finally {
            downloadConnectionCreate.release();
        }
    }

    private static boolean isAcceptRange(@NonNull DownloadConnection.Connected connected) throws IOException {
        if (connected.getResponseCode() == 206) {
            return true;
        }
        return "bytes".equals(connected.getResponseHeaderField(Util.ACCEPT_RANGES));
    }
}
