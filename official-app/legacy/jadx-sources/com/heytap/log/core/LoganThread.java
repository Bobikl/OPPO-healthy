package com.heytap.log.core;

import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import com.heytap.log.Logger;
import com.heytap.log.formatter.SimpleLogFormatter;
import com.heytap.log.util.UTF8Validator;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes19.dex */
class LoganThread extends Thread {
    private static final int CACHE_SIZE = 1024;
    private static final int MINUTE = 60000;
    private static final String TAG = "HLog_LoganThread";
    private Logger logger;
    private long mAllLogsFileSize;
    private LinkedBlockingQueue<LoganModel> mCacheLogQueue;
    private String mCachePath;
    private String mEncryptIv16;
    private String mEncryptKey16;
    private final String mExtKeyDirs;
    private File mFileDirectory;
    private String mFileNamePrefix;
    private final FileStrategy mFileStrategy;
    private final SimpleLogFormatter mFormatter;
    private boolean mIsSDCard;
    private String mKeyCachePath;
    private File mKeyFileDirectory;
    private final FileStrategy mKeyFileStrategy;
    private LoganProtocol mKeyLoganProtocol;
    private String mKeyPath;
    private long mLastTime;
    private LoganProtocol mLoganProtocol;
    private long mMaxLogFile;
    private long mMinSDCard;
    private long mOverFlowLastTime;
    private boolean mOverflow;
    private String mPath;
    private long mSaveTime;
    private int mSendLogStatusCode;
    private ExecutorService mSingleThreadExecutor;
    private OnLoganProtocolStatus sLoganProtocolStatus;
    private final Object sendSync = new Object();
    private volatile boolean mIsRun = true;
    private ConcurrentLinkedQueue<LoganModel> mCacheSendQueue = new ConcurrentLinkedQueue<>();

    public LoganThread(Logger logger, LinkedBlockingQueue<LoganModel> linkedBlockingQueue, String str, String str2, long j2, long j3, long j4, String str3, String str4, String str5, long j5) {
        String str6 = File.separator + "kws";
        this.mExtKeyDirs = str6;
        this.mOverflow = false;
        this.logger = logger;
        this.mCacheLogQueue = linkedBlockingQueue;
        this.mCachePath = str;
        this.mPath = str2;
        this.mFileNamePrefix = str5;
        this.mSaveTime = j2;
        this.mMaxLogFile = j3;
        this.mMinSDCard = j4;
        this.mEncryptKey16 = str3;
        this.mEncryptIv16 = str4;
        this.mFileStrategy = new FileStrategy();
        this.mFormatter = new SimpleLogFormatter();
        this.mKeyFileStrategy = new FileStrategy();
        this.mKeyCachePath = str + str6;
        this.mKeyPath = str2 + str6;
        this.mAllLogsFileSize = j5;
    }

    private void action(LoganModel loganModel) {
        if (loganModel == null || !loganModel.isValid()) {
            return;
        }
        if (this.mLoganProtocol == null) {
            LoganProtocol loganProtocol = new LoganProtocol();
            this.mLoganProtocol = loganProtocol;
            loganProtocol.setOnLoganProtocolStatus(new OnLoganProtocolStatus() { // from class: com.heytap.log.core.LoganThread.1
                @Override // com.heytap.log.core.OnLoganProtocolStatus
                public void loganProtocolStatus(String str, int i) {
                    if (LoganThread.this.sLoganProtocolStatus != null) {
                        LoganThread.this.sLoganProtocolStatus.loganProtocolStatus(str, i);
                    }
                }
            });
            this.mLoganProtocol.logan_init(UTF8Validator.convertToUTF8(this.mCachePath), UTF8Validator.convertToUTF8(this.mPath), (int) this.mMaxLogFile, this.mEncryptKey16, this.mEncryptIv16, this.logger.getLogConfig().getLoganMMapLength());
            this.mLoganProtocol.logan_debug(this.logger.sIsDebug);
        }
        LoganModel.Action action = loganModel.action;
        if (action == LoganModel.Action.WRITE) {
            doWriteLog2File(loganModel.writeAction);
        } else if (action == LoganModel.Action.SEND) {
            if (loganModel.sendAction.sendLogRunnable != null) {
                synchronized (this.sendSync) {
                    if (this.mSendLogStatusCode == 10001) {
                        this.mCacheSendQueue.add(loganModel);
                    } else {
                        doSendLog2Net(loganModel.sendAction);
                    }
                }
            }
        } else if (action == LoganModel.Action.FLUSH) {
            doFlushLog2File();
            LoganModel.OnActionCompleteListener onActionCompleteListener = loganModel.listener;
            if (onActionCompleteListener != null) {
                onActionCompleteListener.onComplete();
            }
        }
        actionKey(loganModel);
    }

    private void actionKey(LoganModel loganModel) {
        if (loganModel == null || !loganModel.isValid()) {
            return;
        }
        if (this.mKeyLoganProtocol == null) {
            LoganProtocol loganProtocol = new LoganProtocol();
            this.mKeyLoganProtocol = loganProtocol;
            loganProtocol.setOnLoganProtocolStatus(new OnLoganProtocolStatus() { // from class: com.heytap.log.core.LoganThread.2
                @Override // com.heytap.log.core.OnLoganProtocolStatus
                public void loganProtocolStatus(String str, int i) {
                    if (LoganThread.this.sLoganProtocolStatus != null) {
                        LoganThread.this.sLoganProtocolStatus.loganProtocolStatus(str, i);
                    }
                }
            });
            this.mKeyLoganProtocol.logan_init(UTF8Validator.convertToUTF8(this.mKeyCachePath), UTF8Validator.convertToUTF8(this.mKeyPath), (int) this.mMaxLogFile, this.mEncryptKey16, this.mEncryptIv16, this.logger.getLogConfig().getLoganMMapLength());
            this.mKeyLoganProtocol.logan_debug(this.logger.sIsDebug);
        }
        LoganModel.Action action = loganModel.action;
        LoganModel.Action action2 = LoganModel.Action.WRITE;
        if (action != action2 || loganModel.writeAction.isKeyFlag) {
            if (action == action2) {
                doWriteLog2File(loganModel.writeAction, this.mKeyLoganProtocol);
            } else if (action == LoganModel.Action.FLUSH) {
                doFlushLog2File(this.mKeyLoganProtocol);
            }
        }
    }

    private boolean allDog3sFilsSizeValid(long j2) {
        File[] fileArrListFiles;
        File file = new File(this.mPath);
        if (!file.isDirectory()) {
            return true;
        }
        try {
            fileArrListFiles = file.listFiles();
        } catch (Exception unused) {
            this.logger.e("HLog", "delete Expired File failure !");
            fileArrListFiles = null;
        }
        File[] fileArr = fileArrListFiles;
        if (fileArr == null) {
            return true;
        }
        int length = fileArr.length;
        char c2 = 0;
        long length2 = 0;
        int i = 0;
        while (i < length) {
            File file2 = fileArr[i];
            if (file2 != null) {
                try {
                    if (file2.getName().split("\\.")[c2].split("_").length >= 5) {
                        length2 += file2.length();
                    }
                } catch (Exception e2) {
                    this.logger.e(TAG, "allDog3sFilsSizeValid : " + e2.toString());
                }
            }
            i++;
            c2 = 0;
        }
        if (this.logger.isDebug()) {
            this.logger.debug("HLog", "allDog3sFilsSizeValid maxLimitFile : " + j2);
            this.logger.debug("HLog", "allDog3sFilsSizeValid dogsSize : " + length2);
        }
        return j2 - length2 > 0;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private synchronized void cleanup() {
        LoganProtocol loganProtocol;
        LoganProtocol loganProtocol2 = this.mLoganProtocol;
        if (loganProtocol2 != null) {
            try {
                try {
                    loganProtocol2.logan_clean();
                } catch (Exception e2) {
                    Log.e(TAG, "Error cleaning main logan protocol: " + e2.getMessage());
                }
                this.mLoganProtocol = null;
                loganProtocol = this.mKeyLoganProtocol;
                if (loganProtocol != null) {
                    try {
                        try {
                            loganProtocol.logan_clean();
                        } catch (Exception e3) {
                            Log.e(TAG, "Error cleaning key logan protocol: " + e3.getMessage());
                        }
                        this.mKeyLoganProtocol = null;
                    } catch (Throwable th) {
                        this.mKeyLoganProtocol = null;
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                this.mLoganProtocol = null;
                throw th2;
            }
        } else {
            loganProtocol = this.mKeyLoganProtocol;
            if (loganProtocol != null) {
                loganProtocol.logan_clean();
                this.mKeyLoganProtocol = null;
            }
        }
        throw th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23, types: [java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.io.FileOutputStream] */
    private boolean copyFile(String str, String str2) throws Throwable {
        Logger logger;
        StringBuilder sb;
        ?? r3 = 0;
        FileInputStream fileInputStream = null;
        FileInputStream fileInputStream2 = null;
        r3 = 0;
        try {
            try {
                FileInputStream fileInputStream3 = new FileInputStream(new File((String) str));
                try {
                    str = new FileOutputStream(new File(str2));
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i = fileInputStream3.read(bArr);
                            if (i >= 0) {
                                str.write(bArr, 0, i);
                                str.flush();
                            } else {
                                try {
                                    break;
                                } catch (Exception e2) {
                                    this.logger.e(TAG, "copyFile : " + e2.toString());
                                }
                            }
                        }
                        fileInputStream3.close();
                        try {
                            str.close();
                        } catch (Exception e3) {
                            this.logger.e(TAG, "copyFile : " + e3.toString());
                        }
                        return true;
                    } catch (FileNotFoundException e4) {
                        e = e4;
                        fileInputStream = fileInputStream3;
                        str = str;
                        this.logger.e(TAG, "copyFile : " + e.toString());
                        r3 = fileInputStream;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                                r3 = fileInputStream;
                            } catch (Exception e5) {
                                Logger logger2 = this.logger;
                                logger2.e(TAG, "copyFile : " + e5.toString());
                                r3 = logger2;
                            }
                        }
                        if (str != 0) {
                            try {
                                str.close();
                            } catch (Exception e6) {
                                e = e6;
                                logger = this.logger;
                                sb = new StringBuilder();
                                sb.append("copyFile : ");
                                sb.append(e.toString());
                                logger.e(TAG, sb.toString());
                                return false;
                            }
                        }
                        return false;
                    } catch (IOException e7) {
                        e = e7;
                        fileInputStream2 = fileInputStream3;
                        str = str;
                        this.logger.e(TAG, "copyFile : " + e.toString());
                        r3 = fileInputStream2;
                        if (fileInputStream2 != null) {
                            try {
                                fileInputStream2.close();
                                r3 = fileInputStream2;
                            } catch (Exception e8) {
                                Logger logger3 = this.logger;
                                logger3.e(TAG, "copyFile : " + e8.toString());
                                r3 = logger3;
                            }
                        }
                        if (str != 0) {
                            try {
                                str.close();
                            } catch (Exception e9) {
                                e = e9;
                                logger = this.logger;
                                sb = new StringBuilder();
                                sb.append("copyFile : ");
                                sb.append(e.toString());
                                logger.e(TAG, sb.toString());
                                return false;
                            }
                        }
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        r3 = fileInputStream3;
                        if (r3 != 0) {
                            try {
                                r3.close();
                            } catch (Exception e10) {
                                this.logger.e(TAG, "copyFile : " + e10.toString());
                            }
                        }
                        if (str == 0) {
                            throw th;
                        }
                        try {
                            str.close();
                            throw th;
                        } catch (Exception e11) {
                            this.logger.e(TAG, "copyFile : " + e11.toString());
                            throw th;
                        }
                    }
                } catch (FileNotFoundException e12) {
                    e = e12;
                    str = 0;
                } catch (IOException e13) {
                    e = e13;
                    str = 0;
                } catch (Throwable th2) {
                    th = th2;
                    str = 0;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (FileNotFoundException e14) {
            e = e14;
            str = 0;
        } catch (IOException e15) {
            e = e15;
            str = 0;
        } catch (Throwable th4) {
            th = th4;
            str = 0;
        }
    }

    private void deleteExpiredFile(long j2) {
        File[] fileArrListFiles;
        File file = new File(this.mPath);
        if (file.isDirectory()) {
            try {
                fileArrListFiles = file.listFiles();
            } catch (Exception unused) {
                this.logger.e("HLog", "delete Expired File failure !");
                fileArrListFiles = null;
            }
            File[] fileArr = fileArrListFiles;
            if (fileArr != null) {
                for (File file2 : fileArr) {
                    if (file2 != null) {
                        try {
                            String[] strArrSplit = file2.getName().split("\\.")[0].split("_");
                            if (strArrSplit.length >= 5) {
                                long time = new SimpleDateFormat("yyyy-MM-dd-HH").parse(strArrSplit[strArrSplit.length - 4] + "-" + strArrSplit[strArrSplit.length - 3] + "-" + strArrSplit[strArrSplit.length - 2] + "-" + strArrSplit[strArrSplit.length - 1]).getTime();
                                if (time <= j2) {
                                    this.logger.debug(TAG, file2.getName() + "被删除");
                                    file2.delete();
                                } else if (time <= System.currentTimeMillis() - 3600000) {
                                    double length = (file2.length() / 1024) / 1024;
                                    long j3 = this.mMaxLogFile;
                                    if (length > j3 + (j3 * 0.5d)) {
                                        this.logger.debug(TAG, file2.getName() + "被删除");
                                        file2.delete();
                                    }
                                }
                            }
                        } catch (Exception e2) {
                            this.logger.e(TAG, "deleteExpiredFile : " + e2.toString());
                        }
                    }
                }
            }
        }
    }

    private boolean deleteOldDog3sFile(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        List<File> listListFilesRecursively = listFilesRecursively(new File(str));
        if (listListFilesRecursively.size() == 1) {
            return false;
        }
        File file = null;
        long j2 = Long.MAX_VALUE;
        for (File file2 : listListFilesRecursively) {
            long jLastModified = file2.lastModified();
            if (jLastModified < j2) {
                file = file2;
                j2 = jLastModified;
            }
        }
        return file != null && file.exists() && file.delete();
    }

    private void doSendLog2Net(SendAction sendAction) {
        this.logger.debug(TAG, "Logan send start");
        if (TextUtils.isEmpty(this.mPath) || sendAction == null || !sendAction.isValid()) {
            return;
        }
        if (!prepareLogFile(sendAction)) {
            this.logger.debug(TAG, "Logan prepare log file failed, can't find log file");
            return;
        }
        sendAction.sendLogRunnable.setSendAction(sendAction);
        sendAction.sendLogRunnable.setCallBackListener(new SendLogRunnable.OnSendLogCallBackListener() { // from class: com.heytap.log.core.LoganThread.3
            @Override // com.heytap.log.core.SendLogRunnable.OnSendLogCallBackListener
            public void onCallBack(int i) {
                synchronized (LoganThread.this.sendSync) {
                    LoganThread.this.mSendLogStatusCode = i;
                    if (i == 10002) {
                        LoganThread.this.mCacheLogQueue.addAll(LoganThread.this.mCacheSendQueue);
                        LoganThread.this.mCacheSendQueue.clear();
                    }
                }
            }
        });
        this.mSendLogStatusCode = 10001;
        if (this.mSingleThreadExecutor == null) {
            this.mSingleThreadExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.heytap.log.core.LoganThread.4
                @Override // java.util.concurrent.ThreadFactory
                public Thread newThread(Runnable runnable) {
                    Thread thread = new Thread(Thread.currentThread().getThreadGroup(), runnable, "logan-thread-send-log", 0L);
                    if (thread.isDaemon()) {
                        thread.setDaemon(false);
                    }
                    if (thread.getPriority() != 5) {
                        thread.setPriority(5);
                    }
                    return thread;
                }
            });
        }
        this.mSingleThreadExecutor.execute(sendAction.sendLogRunnable);
    }

    private void doWriteLog2File(WriteAction writeAction) {
        if (this.mFileDirectory == null) {
            this.mFileDirectory = new File(this.mPath);
        }
        if (this.mFileStrategy.shouldOpenNewFile()) {
            this.mLoganProtocol.logan_flush();
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j2 = jCurrentTimeMillis - this.mSaveTime;
            deleteExpiredFile(j2);
            deleteExpiredFile(j2, this.mKeyPath);
            this.mLoganProtocol.logan_open(this.mFileStrategy.makeFileName(this.mFileNamePrefix, jCurrentTimeMillis));
            this.mOverflow = false;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        if (jCurrentTimeMillis2 - this.mLastTime > 300000) {
            this.mLastTime = System.currentTimeMillis();
            makeDogsSizeValid();
        }
        if (jCurrentTimeMillis2 - this.mOverFlowLastTime > 60000) {
            this.mOverFlowLastTime = System.currentTimeMillis();
            String strMakeFileName = this.mFileStrategy.makeFileName(this.mFileNamePrefix, jCurrentTimeMillis2);
            if (!TextUtils.isEmpty(this.mPath) && !TextUtils.isEmpty(strMakeFileName)) {
                File file = new File(this.mPath + File.separator + strMakeFileName);
                if (file.isFile() && file.length() > this.mMaxLogFile * 1024 * 1024) {
                    this.mOverflow = true;
                }
            }
        }
        if (this.mOverflow) {
            return;
        }
        String str = this.mFormatter.format(writeAction.tag, writeAction.log, writeAction.level, null);
        LoganProtocol loganProtocol = this.mLoganProtocol;
        if (loganProtocol == null) {
            return;
        }
        loganProtocol.logan_write(writeAction.flag, str, writeAction.localTime, writeAction.threadName, writeAction.threadId);
    }

    private boolean isCanWriteSDCard() {
        try {
            StatFs statFs = new StatFs(this.mPath);
            long availableBlocks = ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
            if (this.logger.isDebug()) {
                this.logger.debug(TAG, "current sdkcard size : " + availableBlocks + " config min size : " + this.mMinSDCard);
            }
            return availableBlocks > this.mMinSDCard;
        } catch (IllegalArgumentException e2) {
            this.logger.e(TAG, "isCanWriteSDCard : " + e2.toString());
            return false;
        }
    }

    private boolean isFile(String str) {
        if (TextUtils.isEmpty(this.mPath)) {
            return false;
        }
        File file = new File(this.mPath + File.separator + str);
        return file.exists() && file.isFile();
    }

    private List<File> listFilesRecursively(File file) {
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isFile()) {
                    arrayList.add(file2);
                } else if (file2.isDirectory()) {
                    arrayList.addAll(listFilesRecursively(file2));
                }
            }
        }
        return arrayList;
    }

    private void makeDogsSizeValid() {
        while (!allDog3sFilsSizeValid(this.mAllLogsFileSize) && deleteOldDog3sFile(this.mPath)) {
        }
        while (!isCanWriteSDCard() && deleteOldDog3sFile(this.mPath)) {
        }
    }

    private boolean prepareLogFile(SendAction sendAction) {
        this.logger.debug(TAG, "prepare log file");
        if (!isFile(sendAction.date)) {
            sendAction.uploadPath = "";
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.mPath);
        String str = File.separator;
        sb.append(str);
        sb.append(sendAction.date);
        String string = sb.toString();
        if (!sendAction.date.equals(String.valueOf(Util.getCurrentTime()))) {
            sendAction.uploadPath = string;
            return true;
        }
        doFlushLog2File();
        String str2 = this.mPath + str + sendAction.date + ".copy";
        if (!copyFile(string, str2)) {
            return false;
        }
        sendAction.uploadPath = str2;
        return true;
    }

    public synchronized void doFlushLog2File() {
        LoganProtocol loganProtocol = this.mLoganProtocol;
        if (loganProtocol != null) {
            loganProtocol.logan_flush();
        }
        LoganProtocol loganProtocol2 = this.mKeyLoganProtocol;
        if (loganProtocol2 != null) {
            loganProtocol2.logan_flush();
        }
    }

    public OnLoganProtocolStatus getsLoganProtocolStatus() {
        return this.sLoganProtocolStatus;
    }

    public void quit() {
        this.mIsRun = false;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        super.run();
        while (this.mIsRun) {
            try {
                LoganModel loganModelTake = this.mCacheLogQueue.take();
                this.logger.disSecQueueSize();
                if (loganModelTake != null) {
                    action(loganModelTake);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        cleanup();
        Log.e(TAG, "***********************************************");
        Log.e(TAG, "*******************LoganThread线程退出*****************");
        Log.e(TAG, "***********************************************");
    }

    public void setJustDeletedLogFile(boolean z) {
        FileStrategy fileStrategy = this.mFileStrategy;
        if (fileStrategy != null) {
            fileStrategy.setJustDeletedLogFile(z);
        }
        FileStrategy fileStrategy2 = this.mKeyFileStrategy;
        if (fileStrategy2 != null) {
            fileStrategy2.setJustDeletedLogFile(z);
        }
    }

    public void setsLoganProtocolStatus(OnLoganProtocolStatus onLoganProtocolStatus) {
        this.sLoganProtocolStatus = onLoganProtocolStatus;
    }

    private void doFlushLog2File(LoganProtocol loganProtocol) {
        if (loganProtocol != null) {
            loganProtocol.logan_flush();
        }
    }

    private void deleteExpiredFile(long j2, String str) {
        File[] fileArrListFiles;
        File file = new File(str);
        if (file.isDirectory()) {
            try {
                fileArrListFiles = file.listFiles();
            } catch (Exception unused) {
                this.logger.e("HLog", "delete Expired File failure !");
                fileArrListFiles = null;
            }
            File[] fileArr = fileArrListFiles;
            if (fileArr != null) {
                for (File file2 : fileArr) {
                    if (file2 != null) {
                        try {
                            String[] strArrSplit = file2.getName().split("\\.")[0].split("_");
                            if (strArrSplit.length >= 5) {
                                long time = new SimpleDateFormat("yyyy-MM-dd-HH").parse(strArrSplit[strArrSplit.length - 4] + "-" + strArrSplit[strArrSplit.length - 3] + "-" + strArrSplit[strArrSplit.length - 2] + "-" + strArrSplit[strArrSplit.length - 1]).getTime();
                                if (time <= j2) {
                                    this.logger.debug(TAG, file2.getName() + "被删除");
                                    file2.delete();
                                } else if (time <= System.currentTimeMillis() - 3600000) {
                                    double length = (file2.length() / 1024) / 1024;
                                    long j3 = this.mMaxLogFile;
                                    if (length > j3 + (j3 * 0.5d)) {
                                        this.logger.debug(TAG, file2.getName() + "被删除");
                                        file2.delete();
                                    }
                                }
                            }
                        } catch (Exception e2) {
                            this.logger.e(TAG, "deleteExpiredFile : " + e2.toString());
                        }
                    }
                }
            }
        }
    }

    private void doWriteLog2File(WriteAction writeAction, LoganProtocol loganProtocol) {
        if (this.mKeyFileDirectory == null) {
            this.mKeyFileDirectory = new File(this.mKeyPath);
        }
        if (this.mKeyFileStrategy.shouldOpenNewFile()) {
            loganProtocol.logan_flush();
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j2 = jCurrentTimeMillis - this.mSaveTime;
            deleteExpiredFile(j2);
            deleteExpiredFile(j2, this.mKeyPath);
            loganProtocol.logan_open(this.mKeyFileStrategy.makeFileName(this.mFileNamePrefix, jCurrentTimeMillis));
            this.mOverflow = false;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        if (jCurrentTimeMillis2 - this.mLastTime > 300000) {
            this.mLastTime = System.currentTimeMillis();
            makeDogsSizeValid();
        }
        if (jCurrentTimeMillis2 - this.mOverFlowLastTime > 60000) {
            this.mOverFlowLastTime = System.currentTimeMillis();
            String strMakeFileName = this.mFileStrategy.makeFileName(this.mFileNamePrefix, jCurrentTimeMillis2);
            if (!TextUtils.isEmpty(this.mPath) && !TextUtils.isEmpty(strMakeFileName)) {
                File file = new File(this.mPath + File.separator + strMakeFileName);
                if (file.isFile() && file.length() > this.mMaxLogFile * 1024 * 1024) {
                    this.mOverflow = true;
                }
            }
        }
        if (this.mOverflow) {
            return;
        }
        String str = writeAction.log;
        SimpleLogFormatter simpleLogFormatter = this.mFormatter;
        if (simpleLogFormatter != null) {
            str = simpleLogFormatter.format(writeAction.tag, str, writeAction.level, null);
        }
        loganProtocol.logan_write(writeAction.flag, str, writeAction.localTime, writeAction.threadName, writeAction.threadId);
    }
}
