package com.liulishuo.okdownload;

import android.net.Uri;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.SparseArray;
import com.liulishuo.okdownload.core.IdentifiedTask;
import com.liulishuo.okdownload.core.Util;
import com.liulishuo.okdownload.core.breakpoint.BreakpointInfo;
import com.liulishuo.okdownload.core.download.DownloadStrategy;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes5.dex */
public class DownloadTask extends IdentifiedTask implements Comparable<DownloadTask> {
    private final boolean autoCallbackToUIThread;

    @Nullable
    private final Integer connectionCount;

    @NonNull
    private final File directoryFile;
    private final boolean filenameFromResponse;

    @NonNull
    private final DownloadStrategy.FilenameHolder filenameHolder;
    private final int flushBufferSize;
    private final Map<String, List<String>> headerMapFields;
    private final int id;

    @Nullable
    private BreakpointInfo info;

    @Nullable
    private final Boolean isPreAllocateLength;
    private volatile SparseArray<Object> keyTagMap;
    private final AtomicLong lastCallbackProcessTimestamp = new AtomicLong();
    private volatile DownloadListener listener;
    private final int minIntervalMillisCallbackProcess;
    private final boolean passIfAlreadyCompleted;
    private final int priority;

    @NonNull
    private final File providedPathFile;
    private final int readBufferSize;

    @Nullable
    private String redirectLocation;
    private final int syncBufferIntervalMills;
    private final int syncBufferSize;
    private Object tag;

    @Nullable
    private File targetFile;
    private final Uri uri;

    @NonNull
    private final String url;
    private final boolean wifiRequired;

    public static class TaskHideWrapper {
        public static long getLastCallbackProcessTs(DownloadTask downloadTask) {
            return downloadTask.getLastCallbackProcessTs();
        }

        public static void setBreakpointInfo(@NonNull DownloadTask downloadTask, @NonNull BreakpointInfo breakpointInfo) {
            downloadTask.setBreakpointInfo(breakpointInfo);
        }

        public static void setLastCallbackProcessTs(DownloadTask downloadTask, long j2) {
            downloadTask.setLastCallbackProcessTs(j2);
        }
    }

    public DownloadTask(String str, Uri uri, int i, int i2, int i3, int i4, int i5, boolean z, int i6, Map<String, List<String>> map, @Nullable String str2, boolean z2, boolean z3, Boolean bool, @Nullable Integer num, @Nullable Boolean bool2) {
        Boolean bool3;
        String name = str2;
        this.url = str;
        this.uri = uri;
        this.priority = i;
        this.readBufferSize = i2;
        this.flushBufferSize = i3;
        this.syncBufferSize = i4;
        this.syncBufferIntervalMills = i5;
        this.autoCallbackToUIThread = z;
        this.minIntervalMillisCallbackProcess = i6;
        this.headerMapFields = map;
        this.passIfAlreadyCompleted = z2;
        this.wifiRequired = z3;
        this.connectionCount = num;
        this.isPreAllocateLength = bool2;
        if (Util.isUriFileScheme(uri)) {
            File file = new File(uri.getPath());
            if (bool != null) {
                if (bool.booleanValue()) {
                    if (file.exists() && file.isFile()) {
                        throw new IllegalArgumentException("If you want filename from response please make sure you provide path is directory " + file.getPath());
                    }
                    if (!Util.isEmpty(str2)) {
                        Util.w("DownloadTask", "Discard filename[" + name + "] because you set filenameFromResponse=true");
                        name = null;
                    }
                    this.directoryFile = file;
                } else {
                    if (file.exists() && file.isDirectory() && Util.isEmpty(str2)) {
                        throw new IllegalArgumentException("If you don't want filename from response please make sure you have already provided valid filename or not directory path " + file.getPath());
                    }
                    if (Util.isEmpty(str2)) {
                        name = file.getName();
                        this.directoryFile = Util.getParentFile(file);
                    } else {
                        this.directoryFile = file;
                    }
                }
                bool3 = bool;
            } else if (file.exists() && file.isDirectory()) {
                bool3 = Boolean.TRUE;
                this.directoryFile = file;
            } else {
                bool3 = Boolean.FALSE;
                if (file.exists()) {
                    if (!Util.isEmpty(str2) && !file.getName().equals(name)) {
                        throw new IllegalArgumentException("Uri already provided filename!");
                    }
                    name = file.getName();
                    this.directoryFile = Util.getParentFile(file);
                } else if (Util.isEmpty(str2)) {
                    name = file.getName();
                    this.directoryFile = Util.getParentFile(file);
                } else {
                    this.directoryFile = file;
                }
            }
            this.filenameFromResponse = bool3.booleanValue();
        } else {
            this.filenameFromResponse = false;
            this.directoryFile = new File(uri.getPath());
        }
        if (Util.isEmpty(name)) {
            this.filenameHolder = new DownloadStrategy.FilenameHolder();
            this.providedPathFile = this.directoryFile;
        } else {
            this.filenameHolder = new DownloadStrategy.FilenameHolder(name);
            File file2 = new File(this.directoryFile, name);
            this.targetFile = file2;
            this.providedPathFile = file2;
        }
        this.id = OkDownload.with().breakpointStore().findOrCreateId(this);
    }

    public static void enqueue(DownloadTask[] downloadTaskArr, DownloadListener downloadListener) {
        for (DownloadTask downloadTask : downloadTaskArr) {
            downloadTask.listener = downloadListener;
        }
        OkDownload.with().downloadDispatcher().enqueue(downloadTaskArr);
    }

    public static MockTaskForCompare mockTaskForCompare(int i) {
        return new MockTaskForCompare(i);
    }

    public synchronized DownloadTask addTag(int i, Object obj) {
        if (this.keyTagMap == null) {
            synchronized (this) {
                if (this.keyTagMap == null) {
                    this.keyTagMap = new SparseArray<>();
                }
            }
        }
        this.keyTagMap.put(i, obj);
        return this;
    }

    public void cancel() {
        OkDownload.with().downloadDispatcher().cancel(this);
    }

    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return true;
        }
        if (!(obj instanceof DownloadTask)) {
            return false;
        }
        DownloadTask downloadTask = (DownloadTask) obj;
        if (downloadTask.id == this.id) {
            return true;
        }
        return compareIgnoreId(downloadTask);
    }

    public void execute(DownloadListener downloadListener) {
        this.listener = downloadListener;
        OkDownload.with().downloadDispatcher().execute(this);
    }

    public int getConnectionCount() {
        BreakpointInfo breakpointInfo = this.info;
        if (breakpointInfo == null) {
            return 0;
        }
        return breakpointInfo.getBlockCount();
    }

    @Nullable
    public File getFile() {
        String str = this.filenameHolder.get();
        if (str == null) {
            return null;
        }
        if (this.targetFile == null) {
            this.targetFile = new File(this.directoryFile, str);
        }
        return this.targetFile;
    }

    @Override // com.liulishuo.okdownload.core.IdentifiedTask
    @Nullable
    public String getFilename() {
        return this.filenameHolder.get();
    }

    public DownloadStrategy.FilenameHolder getFilenameHolder() {
        return this.filenameHolder;
    }

    public int getFlushBufferSize() {
        return this.flushBufferSize;
    }

    @Nullable
    public Map<String, List<String>> getHeaderMapFields() {
        return this.headerMapFields;
    }

    @Override // com.liulishuo.okdownload.core.IdentifiedTask
    public int getId() {
        return this.id;
    }

    @Nullable
    public BreakpointInfo getInfo() {
        if (this.info == null) {
            this.info = OkDownload.with().breakpointStore().get(this.id);
        }
        return this.info;
    }

    public long getLastCallbackProcessTs() {
        return this.lastCallbackProcessTimestamp.get();
    }

    public DownloadListener getListener() {
        return this.listener;
    }

    public int getMinIntervalMillisCallbackProcess() {
        return this.minIntervalMillisCallbackProcess;
    }

    @Override // com.liulishuo.okdownload.core.IdentifiedTask
    @NonNull
    public File getParentFile() {
        return this.directoryFile;
    }

    public int getPriority() {
        return this.priority;
    }

    @Override // com.liulishuo.okdownload.core.IdentifiedTask
    @NonNull
    public File getProvidedPathFile() {
        return this.providedPathFile;
    }

    public int getReadBufferSize() {
        return this.readBufferSize;
    }

    @Nullable
    public String getRedirectLocation() {
        return this.redirectLocation;
    }

    @Nullable
    public Integer getSetConnectionCount() {
        return this.connectionCount;
    }

    @Nullable
    public Boolean getSetPreAllocateLength() {
        return this.isPreAllocateLength;
    }

    public int getSyncBufferIntervalMills() {
        return this.syncBufferIntervalMills;
    }

    public int getSyncBufferSize() {
        return this.syncBufferSize;
    }

    public Object getTag(int i) {
        if (this.keyTagMap == null) {
            return null;
        }
        return this.keyTagMap.get(i);
    }

    public Uri getUri() {
        return this.uri;
    }

    @Override // com.liulishuo.okdownload.core.IdentifiedTask
    @NonNull
    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (this.url + this.providedPathFile.toString() + this.filenameHolder.get()).hashCode();
    }

    public boolean isAutoCallbackToUIThread() {
        return this.autoCallbackToUIThread;
    }

    public boolean isFilenameFromResponse() {
        return this.filenameFromResponse;
    }

    public boolean isPassIfAlreadyCompleted() {
        return this.passIfAlreadyCompleted;
    }

    public boolean isWifiRequired() {
        return this.wifiRequired;
    }

    @NonNull
    public MockTaskForCompare mock(int i) {
        return new MockTaskForCompare(i, this);
    }

    public synchronized void removeTag(int i) {
        if (this.keyTagMap != null) {
            this.keyTagMap.remove(i);
        }
    }

    public void replaceListener(@NonNull DownloadListener downloadListener) {
        this.listener = downloadListener;
    }

    public void setBreakpointInfo(@NonNull BreakpointInfo breakpointInfo) {
        this.info = breakpointInfo;
    }

    public void setLastCallbackProcessTs(long j2) {
        this.lastCallbackProcessTimestamp.set(j2);
    }

    public void setRedirectLocation(@Nullable String str) {
        this.redirectLocation = str;
    }

    public void setTag(Object obj) {
        this.tag = obj;
    }

    public void setTags(DownloadTask downloadTask) {
        this.tag = downloadTask.tag;
        this.keyTagMap = downloadTask.keyTagMap;
    }

    public Builder toBuilder(String str, Uri uri) {
        Builder passIfAlreadyCompleted = new Builder(str, uri).setPriority(this.priority).setReadBufferSize(this.readBufferSize).setFlushBufferSize(this.flushBufferSize).setSyncBufferSize(this.syncBufferSize).setSyncBufferIntervalMillis(this.syncBufferIntervalMills).setAutoCallbackToUIThread(this.autoCallbackToUIThread).setMinIntervalMillisCallbackProcess(this.minIntervalMillisCallbackProcess).setHeaderMapFields(this.headerMapFields).setPassIfAlreadyCompleted(this.passIfAlreadyCompleted);
        if (Util.isUriFileScheme(uri) && !new File(uri.getPath()).isFile() && Util.isUriFileScheme(this.uri) && this.filenameHolder.get() != null && !new File(this.uri.getPath()).getName().equals(this.filenameHolder.get())) {
            passIfAlreadyCompleted.setFilename(this.filenameHolder.get());
        }
        return passIfAlreadyCompleted;
    }

    public String toString() {
        return super.toString() + "@" + this.id + "@" + this.url + "@" + this.directoryFile.toString() + "/" + this.filenameHolder.get();
    }

    public static void cancel(DownloadTask[] downloadTaskArr) {
        OkDownload.with().downloadDispatcher().cancel(downloadTaskArr);
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull DownloadTask downloadTask) {
        return downloadTask.getPriority() - getPriority();
    }

    public Object getTag() {
        return this.tag;
    }

    public synchronized void removeTag() {
        this.tag = null;
    }

    public static class Builder {
        public static final boolean DEFAULT_AUTO_CALLBACK_TO_UI_THREAD = true;
        public static final int DEFAULT_FLUSH_BUFFER_SIZE = 16384;
        public static final boolean DEFAULT_IS_WIFI_REQUIRED = false;
        public static final int DEFAULT_MIN_INTERVAL_MILLIS_CALLBACK_PROCESS = 3000;
        public static final boolean DEFAULT_PASS_IF_ALREADY_COMPLETED = true;
        public static final int DEFAULT_READ_BUFFER_SIZE = 4096;
        public static final int DEFAULT_SYNC_BUFFER_INTERVAL_MILLIS = 2000;
        public static final int DEFAULT_SYNC_BUFFER_SIZE = 65536;
        private boolean autoCallbackToUIThread;
        private Integer connectionCount;
        private String filename;
        private int flushBufferSize;
        private volatile Map<String, List<String>> headerMapFields;
        private Boolean isFilenameFromResponse;
        private Boolean isPreAllocateLength;
        private boolean isWifiRequired;
        private int minIntervalMillisCallbackProcess;
        private boolean passIfAlreadyCompleted;
        private int priority;
        private int readBufferSize;
        private int syncBufferIntervalMillis;
        private int syncBufferSize;

        @NonNull
        final Uri uri;

        @NonNull
        final String url;

        public Builder(@NonNull String str, @NonNull String str2, @Nullable String str3) {
            this(str, Uri.fromFile(new File(str2)));
            if (Util.isEmpty(str3)) {
                this.isFilenameFromResponse = Boolean.TRUE;
            } else {
                this.filename = str3;
            }
        }

        public synchronized void addHeader(String str, String str2) {
            if (this.headerMapFields == null) {
                this.headerMapFields = new HashMap();
            }
            List<String> arrayList = this.headerMapFields.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.headerMapFields.put(str, arrayList);
            }
            arrayList.add(str2);
        }

        public DownloadTask build() {
            return new DownloadTask(this.url, this.uri, this.priority, this.readBufferSize, this.flushBufferSize, this.syncBufferSize, this.syncBufferIntervalMillis, this.autoCallbackToUIThread, this.minIntervalMillisCallbackProcess, this.headerMapFields, this.filename, this.passIfAlreadyCompleted, this.isWifiRequired, this.isFilenameFromResponse, this.connectionCount, this.isPreAllocateLength);
        }

        public Builder setAutoCallbackToUIThread(boolean z) {
            this.autoCallbackToUIThread = z;
            return this;
        }

        public Builder setConnectionCount(@IntRange(from = 1) int i) {
            this.connectionCount = Integer.valueOf(i);
            return this;
        }

        public Builder setFilename(String str) {
            this.filename = str;
            return this;
        }

        public Builder setFilenameFromResponse(@Nullable Boolean bool) {
            if (!Util.isUriFileScheme(this.uri)) {
                throw new IllegalArgumentException("Uri isn't file scheme we can't let filename from response");
            }
            this.isFilenameFromResponse = bool;
            return this;
        }

        public Builder setFlushBufferSize(int i) {
            if (i < 0) {
                throw new IllegalArgumentException("Value must be positive!");
            }
            this.flushBufferSize = i;
            return this;
        }

        public Builder setHeaderMapFields(Map<String, List<String>> map) {
            this.headerMapFields = map;
            return this;
        }

        public Builder setMinIntervalMillisCallbackProcess(int i) {
            this.minIntervalMillisCallbackProcess = i;
            return this;
        }

        public Builder setPassIfAlreadyCompleted(boolean z) {
            this.passIfAlreadyCompleted = z;
            return this;
        }

        public Builder setPreAllocateLength(boolean z) {
            this.isPreAllocateLength = Boolean.valueOf(z);
            return this;
        }

        public Builder setPriority(int i) {
            this.priority = i;
            return this;
        }

        public Builder setReadBufferSize(int i) {
            if (i < 0) {
                throw new IllegalArgumentException("Value must be positive!");
            }
            this.readBufferSize = i;
            return this;
        }

        public Builder setSyncBufferIntervalMillis(int i) {
            if (i < 0) {
                throw new IllegalArgumentException("Value must be positive!");
            }
            this.syncBufferIntervalMillis = i;
            return this;
        }

        public Builder setSyncBufferSize(int i) {
            if (i < 0) {
                throw new IllegalArgumentException("Value must be positive!");
            }
            this.syncBufferSize = i;
            return this;
        }

        public Builder setWifiRequired(boolean z) {
            this.isWifiRequired = z;
            return this;
        }

        public Builder(@NonNull String str, @NonNull File file) {
            this.readBufferSize = 4096;
            this.flushBufferSize = 16384;
            this.syncBufferSize = 65536;
            this.syncBufferIntervalMillis = 2000;
            this.autoCallbackToUIThread = true;
            this.minIntervalMillisCallbackProcess = 3000;
            this.passIfAlreadyCompleted = true;
            this.isWifiRequired = false;
            this.url = str;
            this.uri = Uri.fromFile(file);
        }

        public Builder(@NonNull String str, @NonNull Uri uri) {
            this.readBufferSize = 4096;
            this.flushBufferSize = 16384;
            this.syncBufferSize = 65536;
            this.syncBufferIntervalMillis = 2000;
            this.autoCallbackToUIThread = true;
            this.minIntervalMillisCallbackProcess = 3000;
            this.passIfAlreadyCompleted = true;
            this.isWifiRequired = false;
            this.url = str;
            this.uri = uri;
            if (Util.isUriContentScheme(uri)) {
                this.filename = Util.getFilenameFromContentUri(uri);
            }
        }
    }

    public void enqueue(DownloadListener downloadListener) {
        this.listener = downloadListener;
        OkDownload.with().downloadDispatcher().enqueue(this);
    }

    public static class MockTaskForCompare extends IdentifiedTask {

        @Nullable
        final String filename;
        final int id;

        @NonNull
        final File parentFile;

        @NonNull
        final File providedPathFile;

        @NonNull
        final String url;

        public MockTaskForCompare(int i) {
            this.id = i;
            this.url = "";
            File file = IdentifiedTask.EMPTY_FILE;
            this.providedPathFile = file;
            this.filename = null;
            this.parentFile = file;
        }

        @Override // com.liulishuo.okdownload.core.IdentifiedTask
        @Nullable
        public String getFilename() {
            return this.filename;
        }

        @Override // com.liulishuo.okdownload.core.IdentifiedTask
        public int getId() {
            return this.id;
        }

        @Override // com.liulishuo.okdownload.core.IdentifiedTask
        @NonNull
        public File getParentFile() {
            return this.parentFile;
        }

        @Override // com.liulishuo.okdownload.core.IdentifiedTask
        @NonNull
        public File getProvidedPathFile() {
            return this.providedPathFile;
        }

        @Override // com.liulishuo.okdownload.core.IdentifiedTask
        @NonNull
        public String getUrl() {
            return this.url;
        }

        public MockTaskForCompare(int i, @NonNull DownloadTask downloadTask) {
            this.id = i;
            this.url = downloadTask.url;
            this.parentFile = downloadTask.getParentFile();
            this.providedPathFile = downloadTask.providedPathFile;
            this.filename = downloadTask.getFilename();
        }
    }

    public Builder toBuilder() {
        return toBuilder(this.url, this.uri);
    }
}
