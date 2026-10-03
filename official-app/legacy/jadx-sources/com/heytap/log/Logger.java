package com.heytap.log;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.heytap.log.appender.LogAppender;
import com.heytap.log.collect.ActivityLifeMonitor;
import com.heytap.log.collect.auto.ActionCollect;
import com.heytap.log.collect.auto.CrashCollect;
import com.heytap.log.collect.auto.NetworkChangeCollect;
import com.heytap.log.collect.auto.SystemInfoCollect;
import com.heytap.log.config.DynConfigManager;
import com.heytap.log.config.MultiConfigManager;
import com.heytap.log.consts.LogConstants;
import com.heytap.log.core.FileStrategy;
import com.heytap.log.core.LoganConfig;
import com.heytap.log.core.bean.TimerCheckParam;
import com.heytap.log.dto.TraceConfigDto;
import com.heytap.log.log.CollectLog;
import com.heytap.log.log.ICollectLog;
import com.heytap.log.log.LogProcessor;
import com.heytap.log.log.SimpleLog;
import com.heytap.log.nx.http.INxHttpClient;
import com.heytap.log.nx.obus.StatConfigInfo;
import com.heytap.log.nx.obus.StatisticsManager;
import com.heytap.log.nx.obus.TaskStatisicsBean;
import com.heytap.log.strategy.KitConfigHelper;
import com.heytap.log.uploader.UploadManager;
import com.heytap.log.util.AppUtil;
import com.heytap.log.util.LogUtils;
import com.heytap.log.util.ProcessUtil;
import com.heytap.log.util.SPUtil;
import com.heytap.log.util.String2IntUtil;
import com.heytap.log.util.ThreadUtil;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes19.dex */
public class Logger {
    private static final String SUFFIX_PN = ":hlog";
    private static final String TAG = "Logger";
    private static ActionCollect actionCollect = null;
    public static final int[] encryptIV = {33, 32, 35, 34, 37, 36, 39, 38, 41, 40, 33, 32, 35, 34, 37, 36};
    private static boolean mLogPrint = false;
    private Settings.IFlushCallback flushCallback;
    private LogUtils logUtils;
    private ActivityLifeMonitor mActivityMonitor;
    private String mBaseInfo;
    private ICollectLog mCollectLog;
    private LoganConfig mConfig;
    private Context mContext;
    private CrashCollect mCrashHandler;
    private DynConfigManager mDynConfigManager;
    private LogAppender mLogAppender;
    private LogProcessor mLogProcessor;
    private MultiConfigManager mMultiConfigManager;
    private NetworkChangeCollect mNetworkChangeMonitor;
    private Settings mSettings;
    private StatisticsManager mStatisticsManager;
    private UploadManager mUploadManager;
    private SimpleLog mSimpleLog = new SimpleLog(null);
    public boolean sIsDebug = false;
    private boolean discreteEnable = false;
    private AtomicInteger secQueueSize = new AtomicInteger(0);

    public static class Builder {
        private final Settings mSettings = new Settings();

        private String createPathWithProcessName(Context context, String str) {
            String processName = TextUtils.isEmpty(AppUtil.sProcessName) ? ProcessUtil.getProcessName(context) : AppUtil.sProcessName;
            if (TextUtils.isEmpty(processName)) {
                return str;
            }
            return str + "/" + processName + "/";
        }

        public Builder consoleLogLevel(int i) {
            this.mSettings.setConsoleLogLevel(i);
            return this;
        }

        public Logger create(Context context) {
            if (TextUtils.isEmpty(this.mSettings.getPath()) || context == null || context.getFilesDir() == null) {
                return null;
            }
            String cacheDir = this.mSettings.getCacheDir();
            if (cacheDir == null || cacheDir.isEmpty()) {
                this.mSettings.setCacheDir(createPathWithProcessName(context, context.getFilesDir().getAbsolutePath()));
            } else {
                this.mSettings.setCacheDir(createPathWithProcessName(context, cacheDir));
            }
            Logger logger = new Logger();
            logger.init(this.mSettings);
            return logger;
        }

        public Builder fileExpireDays(int i) {
            this.mSettings.setFileExpireDays(i);
            return this;
        }

        public Builder fileLogLevel(int i) {
            this.mSettings.setFileLogLevel(i);
            return this;
        }

        public Builder logFilePath(String str) {
            this.mSettings.setPath(str);
            this.mSettings.setUploadPath(str);
            return this;
        }

        public Builder logNamePrefix(String str) {
            this.mSettings.setNamePrefix(str);
            return this;
        }

        public Builder mmapCacheDir(String str) {
            this.mSettings.setCacheDir(str);
            return this;
        }

        public Builder setFirstCacheSize(int i) {
            return this;
        }

        public Builder setIFlushCallback(Settings.IFlushCallback iFlushCallback) {
            this.mSettings.setFlushCallback(iFlushCallback);
            return this;
        }

        public Builder setImeiProvider(Settings.IImeiProvider iImeiProvider) {
            this.mSettings.setImeiProvider(iImeiProvider);
            return this;
        }

        public Builder setNxClient(INxHttpClient iNxHttpClient) {
            this.mSettings.setNxHttpClient(iNxHttpClient);
            return this;
        }

        public Builder setOpenIdProvider(Settings.IOpenIdProvider iOpenIdProvider) {
            this.mSettings.setOpenIdProvider(iOpenIdProvider);
            return this;
        }

        public Builder setProcessName(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            if (str.contains(":")) {
                str = str.replace(":", ".");
            }
            AppUtil.sProcessName = str;
            return this;
        }

        public Builder setRegion(String str) {
            if (TextUtils.isEmpty(str)) {
                AppUtil.setRegion(str);
            }
            return this;
        }

        public Builder setTimerCheckParam(TimerCheckParam timerCheckParam) {
            this.mSettings.setTimerCheckParam(timerCheckParam);
            return this;
        }

        public Builder setTracePkg(String str) {
            this.mSettings.setTracePkg(str);
            return this;
        }
    }

    private void closeCollects() {
        NetworkChangeCollect networkChangeCollect = this.mNetworkChangeMonitor;
        if (networkChangeCollect != null) {
            networkChangeCollect.destroy(this.mContext);
            this.mNetworkChangeMonitor = null;
        }
        ActivityLifeMonitor activityLifeMonitor = this.mActivityMonitor;
        if (activityLifeMonitor != null) {
            activityLifeMonitor.destroy(this.mContext);
            this.mActivityMonitor = null;
        }
        this.mContext = null;
    }

    private void initCollects() {
        if (this.mCrashHandler == null) {
            CrashCollect crashCollect = new CrashCollect(this.mCollectLog, this);
            this.mCrashHandler = crashCollect;
            crashCollect.init(this.mContext);
        }
        new SystemInfoCollect(this.mCollectLog, this.mSimpleLog).init(this.mContext);
        actionCollect = new ActionCollect(this.mCollectLog, this.mSimpleLog);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public void a(String str) {
        ActionCollect actionCollect2 = actionCollect;
        if (actionCollect2 != null) {
            actionCollect2.appendActionInfo(TAG, str);
            return;
        }
        Log.e(TAG, "HLog未初始化-->" + str);
    }

    public void checkMultiUploadForCdnSilent(String str, UploadManager.UploadCheckerForCdnListener uploadCheckerForCdnListener) {
        UploadManager uploadManager = this.mUploadManager;
        if (uploadManager != null) {
            uploadManager.sendMessageForMultiUploadCheckerForCdn(str, uploadCheckerForCdnListener);
        }
    }

    public void checkOPushDataContent(String str) {
        MultiConfigManager multiConfigManager;
        if (TextUtils.isEmpty(str) || (multiConfigManager = this.mMultiConfigManager) == null) {
            return;
        }
        multiConfigManager.checkOPushPushTask(str);
    }

    public void d(String str, String str2) {
        LogUtils logUtils = this.logUtils;
        if (logUtils != null) {
            logUtils.d(2, str, str2);
        }
    }

    public void debug(String str, String str2) {
        LogUtils logUtils = this.logUtils;
        if (logUtils != null) {
            logUtils.debug(2, str, str2);
        }
    }

    public void deleteLogFile() {
        Settings settings;
        File[] allFiles = getAllFiles();
        if (allFiles == null || (settings = this.mSettings) == null || this.mContext == null) {
            return;
        }
        String strBuildFileNamePrefix = FileStrategy.buildFileNamePrefix(settings.getNamePrefix(), AppUtil.myProcessName(AppUtil.getAppContext()), AppUtil.getOptimizedProcessName(this.mContext));
        for (File file : allFiles) {
            if (file != null && file.isFile()) {
                String name = file.getName();
                if (!TextUtils.isEmpty(strBuildFileNamePrefix) && name.startsWith(strBuildFileNamePrefix)) {
                    file.delete();
                }
            }
        }
        LogAppender logAppender = this.mLogAppender;
        if (logAppender != null) {
            logAppender.setJustDeletedLogFile(true);
        }
    }

    public void disSecQueueSize() {
        this.secQueueSize.getAndDecrement();
    }

    public void e(String str, String str2) {
        this.logUtils.d(5, str, str2);
    }

    public void exit() {
        this.mUploadManager = null;
        this.mSimpleLog = null;
        this.mCollectLog = null;
        closeCollects();
        LogAppender logAppender = this.mLogAppender;
        if (logAppender != null) {
            logAppender.close();
        }
        this.mLogAppender = null;
        if (getKitStrategyHelper() == null || !getKitStrategyHelper().isCanUseKitMode()) {
            return;
        }
        getKitStrategyHelper().unRegisterBroadcast(this.mContext);
    }

    public void flush(boolean z) {
        LogAppender logAppender = this.mLogAppender;
        if (logAppender != null) {
            d(TAG, "flush : " + z);
            if (z) {
                logAppender.flushSync();
            } else {
                logAppender.flush();
            }
        }
    }

    public File[] getAllFiles() {
        File file = new File(this.mConfig.mPathPath);
        if (!file.exists() || file.isFile()) {
            return null;
        }
        return file.listFiles();
    }

    public String getBaseInfo() {
        if (TextUtils.isEmpty(this.mBaseInfo) && this.mSettings != null) {
            this.mBaseInfo = this.mSettings.getBusiness() + "_" + this.mSettings.getMdpName() + "_" + AppUtil.getOptimizedProcessName(this.mSettings.getContext());
        }
        String str = this.mBaseInfo;
        return str == null ? "" : str;
    }

    public LoganConfig getConfig() {
        return this.mConfig;
    }

    public Context getContext() {
        return this.mContext;
    }

    public DynConfigManager getDynConfigManager() {
        return this.mDynConfigManager;
    }

    @Deprecated
    public Settings.IFlushCallback getFlushCallback() {
        return this.flushCallback;
    }

    public KitConfigHelper getKitStrategyHelper() {
        return KitConfigHelper.getInstance();
    }

    public Settings getLogConfig() {
        return this.mSettings;
    }

    public MultiConfigManager getMultiConfMgr() {
        return this.mMultiConfigManager;
    }

    public int getSecQueueSize() {
        return this.secQueueSize.get();
    }

    public ISimpleLog getSimpleLog() {
        SimpleLog simpleLog = this.mSimpleLog;
        return simpleLog != null ? simpleLog : new SimpleLog(null);
    }

    public StatisticsManager getStatisticsManager() {
        return this.mStatisticsManager;
    }

    public UploadManager getUploadManager() {
        return this.mUploadManager;
    }

    public void i(String str, String str2) {
        this.logUtils.d(3, str, str2);
    }

    public void inSecQueueSize() {
        this.secQueueSize.getAndIncrement();
    }

    public void init(final Settings settings) {
        Log.i(TAG, "hlog sdk version : 1.1.4.0");
        if (settings == null) {
            Log.e(TAG, "init fail,LogConfig is null");
            return;
        }
        if (settings.getContext() == null) {
            Log.e(TAG, "init fail,context is null");
            return;
        }
        int consoleLogLevel = settings.getConsoleLogLevel();
        int fileLogLevel = settings.getFileLogLevel();
        String strObtainProcessName = AppUtil.obtainProcessName(settings.getContext());
        if (!TextUtils.isEmpty(strObtainProcessName) && strObtainProcessName.contains(SUFFIX_PN)) {
            if (settings.isDebug()) {
                Log.e(TAG, "当前进程名 : " + strObtainProcessName + " 该进程是:hlog 子进程,hlog sdk不进行初始化");
                return;
            }
            return;
        }
        setDebug(settings.isDebug());
        Context context = settings.getContext();
        this.mContext = context;
        AppUtil.setAppContext(context);
        AppUtil.setAppSpContext(this.mContext);
        AppUtil.setSDKVersionCode(BuildConfig.CC_VERSION);
        this.mSettings = settings;
        LoganConfig.Builder fileNamePrefix = new LoganConfig.Builder().setCachePath(settings.getCacheDir()).setPath(settings.getPath()).setDay(settings.getFileExpireDays()).setFileNamePrefix(settings.getNamePrefix());
        int[] iArr = encryptIV;
        this.mConfig = fileNamePrefix.setEncryptKey16(String2IntUtil.tostring(iArr).getBytes()).setEncryptIV16(String2IntUtil.tostring(iArr).getBytes()).setMaxFile(settings.getMaxFile()).setMaxQueue(settings.getMaxQueue()).setAllLogSize(settings.getAllLogsFileSize()).setMinSDCard(settings.getMinSDCard()).setFisrtCacheSize(settings.getFisrtCacheSize()).build();
        this.logUtils = new LogUtils(this);
        this.mLogAppender = new LogAppender(this);
        DynConfigManager dynConfigManager = new DynConfigManager(this);
        this.mDynConfigManager = dynConfigManager;
        dynConfigManager.init(consoleLogLevel, fileLogLevel, settings.getTimerCheckParam());
        this.mCollectLog = new CollectLog(this.mLogAppender);
        ActivityLifeMonitor activityLifeMonitor = new ActivityLifeMonitor();
        this.mActivityMonitor = activityLifeMonitor;
        SimpleLog simpleLog = new SimpleLog(this.mLogAppender, this.mDynConfigManager, activityLifeMonitor, this.mLogProcessor, (CollectLog) this.mCollectLog, this);
        this.mSimpleLog = simpleLog;
        this.mActivityMonitor.init(this.mContext, this.mCollectLog, simpleLog, this);
        this.mSimpleLog.setConsoleLogLevel(consoleLogLevel);
        this.mSimpleLog.setFileLogLevel(fileLogLevel);
        final String strReplace = this.mContext.getPackageName().replace(".", "");
        this.mMultiConfigManager = new MultiConfigManager(this, strReplace);
        UploadManager uploadManager = new UploadManager(settings, this.mDynConfigManager, this.mSimpleLog, this);
        this.mUploadManager = uploadManager;
        uploadManager.setIAppender(this.mLogAppender);
        initCollects();
        ThreadUtil.runInThreadPool(new Runnable() { // from class: com.heytap.log.Logger.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Thread.sleep(500L);
                    Logger.this.getDynConfigManager().clearKitHistoryZipFiles();
                } catch (Exception e2) {
                    Logger.this.d(Logger.TAG, "clearKitHistoryZipFiles error: " + e2.getMessage());
                }
            }
        });
        if (settings.isEnableOBus()) {
            initObus(this.mContext);
        }
        d(TAG, "sdk version : 1.1.4.0");
        d(TAG, "sdk business : " + String2IntUtil.toEncrypted(this.mSettings.getBusiness()));
        ThreadUtil.runInThreadPool(new Runnable() { // from class: com.heytap.log.Logger.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (Logger.this.mContext != null && Logger.this.mSettings != null) {
                        String string = SPUtil.getInstance().getString(LogConstants.OPUSH_NX_DTO_KEY);
                        if (TextUtils.isEmpty(string) || !string.equalsIgnoreCase(strReplace)) {
                            SPUtil.getInstance().put(LogConstants.OPUSH_NX_DTO_KEY, strReplace);
                        }
                        KitConfigHelper.getInstance().init(Logger.this.mContext);
                        if (KitConfigHelper.getInstance().isCanAccessKit()) {
                            Logger.this.d(Logger.TAG, "init start using reQueryKitConfig ...");
                            KitConfigHelper.getInstance().add(Logger.this.mSettings.getBusiness(), this);
                            KitConfigHelper.getInstance().reQueryKitConfig(Logger.this.mContext, Logger.this.mSettings.getBusiness());
                            if (Logger.this.mUploadManager != null) {
                                Logger.this.mUploadManager.sendSyncKitChangeMessage(60000L);
                            }
                        }
                        Settings settings2 = settings;
                        if (settings2 != null && settings2.getiNetAvailable() != null && settings.getiNetAvailable().isNetworkAvailable()) {
                            Logger logger = Logger.this;
                            logger.innerCheckMultiUploadForCdn(logger.mSettings.getBusiness());
                        }
                        if (Logger.this.mLogAppender != null) {
                            Logger.this.mLogAppender.ensureInit();
                            return;
                        }
                        return;
                    }
                    Logger.this.d(Logger.TAG, "Logger async init skipped: dependencies not ready");
                } catch (Exception e2) {
                    Logger.this.d(Logger.TAG, "Logger async init error: " + e2.getMessage());
                }
            }
        });
    }

    public void initObus(Context context) {
        this.mStatisticsManager = new StatisticsManager(this, new StatConfigInfo.Builder().ApplicationContext(context).packName(this.mSettings.getTracePkg()).region(this.mSettings.getRegion()).build());
    }

    public void innerCheckMultiUploadForCdn(String str) {
        UploadManager uploadManager = this.mUploadManager;
        if (uploadManager != null) {
            uploadManager.sendMessageForMultiUploadCheckerForCdn(str, new UploadManager.UploadCheckerForCdnListener() { // from class: com.heytap.log.Logger.3
                @Override // com.heytap.log.uploader.UploadManager.UploadCheckerForCdnListener
                public void onDontNeedUpload(String str2) {
                    if (Logger.this.mMultiConfigManager != null) {
                        Logger.this.mMultiConfigManager.checkAllPushTask();
                    }
                }

                @Override // com.heytap.log.uploader.UploadManager.UploadCheckerForCdnListener
                public void onNeedUpload(TraceConfigDto traceConfigDto) {
                    if (Logger.this.mMultiConfigManager != null) {
                        Logger.this.mMultiConfigManager.checkAllPushTask();
                    }
                }
            });
        }
    }

    public void innerMultiUpload(TraceConfigDto traceConfigDto, boolean z) {
        i(TAG, "innerMultiUpload userTraceConfigDto : " + traceConfigDto);
        if (traceConfigDto == null) {
            if (z) {
                i(TAG, "Don't need to upload log,no available userTraceConfigDto");
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(this.mSettings.getBusiness()) || !this.mSettings.getBusiness().equalsIgnoreCase(traceConfigDto.getBusiness())) {
            if (z) {
                i(TAG, "Don't match business");
                return;
            }
            return;
        }
        if (System.currentTimeMillis() < traceConfigDto.getEndTime() - 15000) {
            if (z) {
                i(TAG, "Don't need to upload log,not yet to upload");
                return;
            }
            return;
        }
        i(TAG, "start to upload log," + traceConfigDto.getTraceId());
        d(TAG, "uploading , configDto:" + traceConfigDto);
        uploadMulti(this.mSettings.getBusiness(), traceConfigDto.getTraceId() + "", traceConfigDto.getBeginTime(), traceConfigDto.getEndTime(), traceConfigDto.getForce() == 0, this.mSettings.getSubType(), null);
    }

    public boolean isDebug() {
        return this.sIsDebug || this.logUtils.isLog();
    }

    @Deprecated
    public boolean isPrint() {
        return mLogPrint;
    }

    public void quit() {
        if (this.mSimpleLog != null) {
            Log.e("HLog", "HLog quit..................");
            this.mSimpleLog.quitThread();
            this.mUploadManager.quitThread();
            this.mCrashHandler.destroy(this.mContext);
            if (getKitStrategyHelper() != null) {
                getKitStrategyHelper().unRegisterBroadcast(this.mContext);
            }
        }
    }

    public void reportStatistic(Context context, String str, TaskStatisicsBean taskStatisicsBean) {
        if (getStatisticsManager() != null) {
            getStatisticsManager().reportStatistic(context, str, taskStatisicsBean);
        }
    }

    public void reportUpload(int i, String str, UploadManager.ReportUploaderListener reportUploaderListener) {
        if (reportUploaderListener == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (i <= 0) {
            i = 1;
        }
        long j2 = i * 3600000;
        setReporterListener(reportUploaderListener);
        reportUpload(this.mSettings.getBusiness(), "" + jCurrentTimeMillis, jCurrentTimeMillis - j2, jCurrentTimeMillis, true, "", this.mSettings.getMdpName(), str, this.mSettings.getMdpSecret());
    }

    public void setDebug(boolean z) {
        this.sIsDebug = z;
    }

    @Deprecated
    public void setFlushCallback(Settings.IFlushCallback iFlushCallback) {
        this.flushCallback = iFlushCallback;
    }

    @Deprecated
    public void setLogPrint(boolean z) {
        mLogPrint = z;
    }

    public void setProcessName(String str) {
        AppUtil.sProcessName = str;
    }

    public void setReporterListener(UploadManager.ReportUploaderListener reportUploaderListener) {
        UploadManager uploadManager = this.mUploadManager;
        if (uploadManager != null) {
            uploadManager.setReporterListener(reportUploaderListener);
        }
    }

    public void setSecQueueSize(int i) {
        this.secQueueSize.set(i);
    }

    public void setUploaderListener(UploadManager.UploaderListener uploaderListener) {
        UploadManager uploadManager = this.mUploadManager;
        if (uploadManager != null) {
            uploadManager.setUploaderListener(uploaderListener);
        }
    }

    @Deprecated
    public void updateLogConfig(String str) {
        if (this.mUploadManager == null || TextUtils.isEmpty(str) || this.mContext == null) {
            return;
        }
        this.mUploadManager.effortConfig(str);
    }

    public void uploadMulti(String str, String str2, long j2, long j3, boolean z, String str3, UploadManager.UploaderListener uploaderListener) {
        d(TAG, "uploadMulti:" + this.mUploadManager);
        UploadManager uploadManager = this.mUploadManager;
        if (uploadManager != null) {
            if (uploaderListener != null) {
                uploadManager.setUploaderListener(uploaderListener);
            }
            d(TAG, "uploadMulti , traceId:" + str2);
            this.mUploadManager.sendMessageForMultiUpload(new UploadManager.UploadMultiBody(str, j2, j3, z, str2, str3), 0L);
        }
    }

    public void v(String str, String str2) {
        this.logUtils.d(1, str, str2);
    }

    public void w(String str, String str2) {
        this.logUtils.d(4, str, str2);
    }

    public void a(String str, String str2) {
        ActionCollect actionCollect2 = actionCollect;
        if (actionCollect2 == null) {
            Log.e(TAG, "HLog未初始化-->" + str2);
            return;
        }
        actionCollect2.appendActionInfo(str, str2);
    }

    public void a(String str, String str2, HashMap<String, String> map) {
        ActionCollect actionCollect2 = actionCollect;
        if (actionCollect2 == null) {
            Log.e(TAG, "HLog未初始化-->" + str2);
            return;
        }
        actionCollect2.appendActionInfo(str, str2, map);
    }

    public void reportUpload(String str, String str2, long j2, long j3, boolean z, String str3, String str4, String str5, String str6) {
        String str7;
        if (this.mUploadManager != null) {
            if (TextUtils.isEmpty(str2)) {
                str7 = "" + j3;
            } else {
                str7 = str2;
            }
            this.mUploadManager.sendMessageForReport(new UploadManager.ReportBody(str, j2, j3, z, str7, str3, str4, str5, str6), 0);
        }
    }
}
