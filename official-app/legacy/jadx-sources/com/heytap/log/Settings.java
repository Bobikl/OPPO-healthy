package com.heytap.log;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.heytap.log.config.DynConfigManager;
import com.heytap.log.consts.LogConstants;
import com.heytap.log.core.LoganConfig;
import com.heytap.log.core.bean.TimerCheckParam;
import com.heytap.log.nx.http.HttpsClient;
import com.heytap.log.nx.http.INxHttpClient;
import com.heytap.log.nx.net.DefaultNxNetCallBack;
import com.heytap.log.util.AppUtil;
import com.heytap.log.util.SPUtil;
import java.io.File;

/* JADX INFO: loaded from: classes19.dex */
public class Settings {
    private static final String TAG = "HLog_Settings";
    private Context context;
    private ICustomIDProvider iCustomIDProvider;
    private IImeiProvider iImeiProvider;
    private INetAvailable iNetAvailable;
    private INxHttpClient iNxHttpClient;
    private boolean isDebug;
    private String nxLogKey;
    private IOpenIdProvider openIdProvider;
    private TimerCheckParam timerCheckParam;
    private String path = "";
    private String cacheDir = "";
    private String uploadPath = "";
    private String namePrefix = "HLog_File_";
    private String tracePkg = "";
    private int fileLogLevel = 3;
    private int consoleLogLevel = 3;
    private int fileExpireDays = 7;
    private String business = "";
    private String mdpName = "";
    private String mdpSecret = "";
    private String subType = "";
    private String mProcessName = "";
    private long maxQueue = 500;
    private int env = 0;
    private IFlushCallback flushCallback = null;
    private boolean enableOBus = true;
    private String region = null;
    private boolean enableNet = true;
    private boolean enableRegNet = false;
    private long mMaxFile = 8;
    private long allLogsFileSize = LoganConfig.DEFAULT_LOGS_MAX_SIZE;
    long mMinSDCard = LoganConfig.DEFAULT_MIN_SDCARD_SIZE;
    private int fisrtCacheSize = 50000;
    private int mLoganMMapLength = LoganConfig.MAX_LOGAN_MMAP_LENGTH;

    public static class Builder {
        private Settings mSettings = new Settings();

        public Builder(Context context, String str, String str2, String str3, ICustomIDProvider iCustomIDProvider, IOpenIdProvider iOpenIdProvider) {
            AppUtil.setAppContext(context);
            AppUtil.setAppSpContext(context);
            this.mSettings.setContext(context);
            this.mSettings.setBusiness(str);
            this.mSettings.setMdpName(str2);
            this.mSettings.setMdpSecret(str3);
            this.mSettings.setCustomIdProvider(iCustomIDProvider);
            this.mSettings.setOpenIdProvider(iOpenIdProvider);
        }

        private Settings checkParam(Settings settings, Context context) {
            if (TextUtils.isEmpty(settings.getTracePkg())) {
                settings.setTracePkg(context.getPackageName());
            }
            if (TextUtils.isEmpty(settings.getCacheDir())) {
                String sdcardDirection = Settings.getSdcardDirection(context);
                StringBuilder sb = new StringBuilder();
                sb.append(sdcardDirection);
                String str = File.separator;
                sb.append(str);
                sb.append("HeyTap");
                sb.append(str);
                sb.append("HLog_cache");
                settings.setCacheDir(sb.toString());
            }
            settings.setCacheDir(generateIsolatedPaths(settings));
            File file = new File(settings.getCacheDir());
            if (!file.exists()) {
                file.mkdirs();
            }
            if (settings.getNxHttpClient() == null) {
                settings.setNxHttpClient(new HttpsClient());
            }
            if (TextUtils.isEmpty(settings.getPath())) {
                String sdcardDirection2 = Settings.getSdcardDirection(context);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(sdcardDirection2);
                String str2 = File.separator;
                sb2.append(str2);
                sb2.append("HeyTap");
                sb2.append(str2);
                sb2.append("HLog_file");
                String string = sb2.toString();
                settings.setPath(string);
                settings.setUploadPath(string);
                SPUtil.getInstance().put(LogConstants.OPUSH_NX_DIR_KEY, string);
            }
            File file2 = new File(settings.getPath());
            if (!file2.exists()) {
                file2.mkdirs();
            }
            File file3 = new File(settings.getUploadPath());
            if (!file3.exists()) {
                file3.mkdirs();
            }
            if (settings.getTimerCheckParam() == null) {
                settings.setTimerCheckParam(new TimerCheckParam());
            }
            if (settings.getMaxQueue() < 0) {
                settings.setMaxQueue(500L);
            }
            return settings;
        }

        private String generateIsolatedPaths(Settings settings) {
            String business = settings.getBusiness();
            String mdpName = settings.getMdpName();
            String optimizedProcessName = AppUtil.getOptimizedProcessName(settings.getContext());
            StringBuilder sb = new StringBuilder();
            String cacheDir = settings.getCacheDir();
            sb.append(cacheDir);
            String str = File.separator;
            if (!cacheDir.endsWith(str)) {
                sb.append(str);
            }
            settings.getPath().endsWith(str);
            if (!TextUtils.isEmpty(business) && !TextUtils.isEmpty(mdpName)) {
                sb.append(business + "_" + mdpName);
                sb.append(str);
            } else if (!TextUtils.isEmpty(business)) {
                sb.append(business);
                sb.append(str);
            } else if (!TextUtils.isEmpty(mdpName)) {
                sb.append(mdpName);
                sb.append(str);
            }
            if (!TextUtils.isEmpty(optimizedProcessName)) {
                sb.append(optimizedProcessName);
                sb.append(str);
            }
            Log.d(Settings.TAG, "Isolated Cache paths generated: " + ((Object) sb));
            return sb.toString();
        }

        public Settings build() {
            Settings settings = this.mSettings;
            Settings settingsCheckParam = checkParam(settings, settings.getContext());
            this.mSettings = settingsCheckParam;
            return settingsCheckParam;
        }

        public Builder consoleLogLevel(int i) {
            this.mSettings.setConsoleLogLevel(i);
            return this;
        }

        @Deprecated
        public Builder enableNet(boolean z) {
            this.mSettings.setEnableNet(z);
            return this;
        }

        @Deprecated
        public Builder enableRegNet(boolean z) {
            this.mSettings.setEnableRegNet(z);
            return this;
        }

        public Builder fileExpireDays(int i) {
            this.mSettings.setFileExpireDays(i);
            return this;
        }

        public Builder fileLogLevel(int i) {
            this.mSettings.setFileLogLevel(i);
            return this;
        }

        public Builder logNamePrefix(String str) {
            this.mSettings.setNamePrefix(str);
            return this;
        }

        @Deprecated
        public Builder setAllLogsFileSize(long j2) {
            this.mSettings.setAllLogsFileSize(j2);
            return this;
        }

        public Builder setDebug(boolean z) {
            this.mSettings.setDebug(z);
            return this;
        }

        public Builder setEnv(int i) {
            this.mSettings.setEnv(i);
            return this;
        }

        @Deprecated
        public Builder setFisrtCacheSize(int i) {
            this.mSettings.setFisrtCacheSize(i);
            return this;
        }

        @Deprecated
        public Builder setFlushCallback(IFlushCallback iFlushCallback) {
            this.mSettings.setFlushCallback(iFlushCallback);
            return this;
        }

        public Builder setLoganMMapLength(int i) {
            this.mSettings.setLoganMMapLength(i);
            return this;
        }

        @Deprecated
        public Builder setMaxFile(long j2) {
            this.mSettings.setMaxFile(j2);
            return this;
        }

        @Deprecated
        public Builder setMaxQueue(long j2) {
            this.mSettings.setMaxQueue(j2);
            return this;
        }

        @Deprecated
        public Builder setMinSDCard(long j2) {
            this.mSettings.setMinSDCard(j2);
            return this;
        }

        public Builder setNetAvailable(INetAvailable iNetAvailable) {
            this.mSettings.setiNetAvailable(iNetAvailable);
            return this;
        }

        @Deprecated
        public Builder setNxClient(INxHttpClient iNxHttpClient) {
            this.mSettings.setNxHttpClient(iNxHttpClient);
            return this;
        }

        @Deprecated
        public Builder setProcessName(String str) {
            AppUtil.sProcessName = str;
            return this;
        }

        public Builder setRegion(String str) {
            this.mSettings.setRegion(str);
            return this;
        }

        @Deprecated
        public Builder setTimerCheckParam(TimerCheckParam timerCheckParam) {
            this.mSettings.setTimerCheckParam(timerCheckParam);
            return this;
        }

        @Deprecated
        public Builder setTracePkg(String str) {
            this.mSettings.setTracePkg(str);
            return this;
        }

        @Deprecated
        public Settings build(Context context) {
            return build();
        }

        @Deprecated
        public Builder(Context context, String str, String str2, String str3, IImeiProvider iImeiProvider, IOpenIdProvider iOpenIdProvider) {
            AppUtil.setAppContext(context);
            AppUtil.setAppSpContext(context);
            this.mSettings.setContext(context);
            this.mSettings.setBusiness(str);
            this.mSettings.setMdpName(str2);
            this.mSettings.setMdpSecret(str3);
            this.mSettings.setImeiProvider(iImeiProvider);
            this.mSettings.setOpenIdProvider(iOpenIdProvider);
        }
    }

    public interface ICustomIDProvider {
        String getCustomID();
    }

    public interface IFlushCallback {
        void flushAllProcess();
    }

    @Deprecated
    public interface IImeiProvider {
        String getImei();
    }

    public interface IOpenIdProvider {
        String getDuid();

        String getGuid();

        String getOuid();
    }

    private static String getCopyDirection(Context context) {
        return context.getCacheDir().getAbsolutePath();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getSdcardDirection(Context context) {
        if (context == null) {
            Log.e("Error", "context is null, hlog init failure ...");
            return "";
        }
        context.getCacheDir().getAbsolutePath();
        try {
            String absolutePath = context.getExternalCacheDir().getAbsolutePath();
            return TextUtils.isEmpty(absolutePath) ? context.getCacheDir().getAbsolutePath() : absolutePath;
        } catch (Exception e2) {
            Log.e("HLog", "hlog direction error : " + e2.toString());
            return (context.getApplicationContext() == null || context.getApplicationContext().getExternalFilesDir(null) == null) ? context.getCacheDir().getAbsolutePath() : context.getApplicationContext().getExternalFilesDir(null).getAbsolutePath();
        }
    }

    public long getAllLogsFileSize() {
        return this.allLogsFileSize;
    }

    public String getBusiness() {
        return this.business;
    }

    public String getCacheDir() {
        return this.cacheDir;
    }

    public int getConsoleLogLevel() {
        return this.consoleLogLevel;
    }

    public Context getContext() {
        return this.context;
    }

    public ICustomIDProvider getCustomIdProvider() {
        return this.iCustomIDProvider;
    }

    public int getEnv() {
        return this.env;
    }

    public int getFileExpireDays() {
        return this.fileExpireDays;
    }

    public int getFileLogLevel() {
        return this.fileLogLevel;
    }

    public int getFisrtCacheSize() {
        return this.fisrtCacheSize;
    }

    public IFlushCallback getFlushCallback() {
        return this.flushCallback;
    }

    @Deprecated
    public IImeiProvider getImeiProvider() {
        return this.iImeiProvider;
    }

    public int getLoganMMapLength() {
        return this.mLoganMMapLength;
    }

    public long getMaxFile() {
        return this.mMaxFile;
    }

    public long getMaxQueue() {
        if (this.maxQueue < 500) {
            this.maxQueue = 500L;
        }
        return this.maxQueue;
    }

    public String getMdpName() {
        return this.mdpName;
    }

    public String getMdpSecret() {
        return this.mdpSecret;
    }

    public long getMinSDCard() {
        return this.mMinSDCard;
    }

    public String getNamePrefix() {
        return this.namePrefix + this.business + "_";
    }

    public INxHttpClient getNxHttpClient() {
        return this.iNxHttpClient;
    }

    public String getNxLogKey() {
        return this.nxLogKey;
    }

    public IOpenIdProvider getOpenIdProvider() {
        return this.openIdProvider;
    }

    public String getPath() {
        return this.path;
    }

    public String getRegion() {
        return this.region;
    }

    public String getSubType() {
        return this.subType;
    }

    public TimerCheckParam getTimerCheckParam() {
        return this.timerCheckParam;
    }

    public String getTracePkg() {
        return this.tracePkg;
    }

    public String getUploadPath() {
        return this.uploadPath;
    }

    public INetAvailable getiNetAvailable() {
        if (this.iNetAvailable == null) {
            this.iNetAvailable = new DefaultNxNetCallBack();
        }
        return this.iNetAvailable;
    }

    @Deprecated
    public INxHttpClient getiNxHttpClient() {
        if (this.iNxHttpClient == null) {
            this.iNxHttpClient = new HttpsClient();
        }
        return this.iNxHttpClient;
    }

    public boolean isDebug() {
        return this.isDebug;
    }

    public boolean isEnableNet() {
        return this.enableNet;
    }

    public boolean isEnableOBus() {
        return this.enableOBus;
    }

    @Deprecated
    public boolean isEnableRegNet() {
        return this.enableRegNet;
    }

    @Deprecated
    public void setAllLogsFileSize(long j2) {
        this.allLogsFileSize = j2 * 1048576;
    }

    @Deprecated
    public void setBusiness(String str) {
        this.business = str;
    }

    @Deprecated
    public void setCacheDir(String str) {
        this.cacheDir = str;
        SPUtil.getInstance().put(DynConfigManager.CACHE_NX_DIR_KEY, str);
    }

    public void setConsoleLogLevel(int i) {
        this.consoleLogLevel = i;
    }

    public void setContext(Context context) {
        this.context = context;
        if (context != null) {
            AppUtil.setAppContext(context);
        }
    }

    public void setCustomIdProvider(ICustomIDProvider iCustomIDProvider) {
        this.iCustomIDProvider = iCustomIDProvider;
    }

    public void setDebug(boolean z) {
        this.isDebug = z;
    }

    @Deprecated
    public void setEnableNet(boolean z) {
        this.enableNet = z;
    }

    @Deprecated
    public void setEnableOBus(boolean z) {
        this.enableOBus = z;
    }

    @Deprecated
    public void setEnableRegNet(boolean z) {
        this.enableRegNet = z;
    }

    public void setEnv(int i) {
        this.env = i;
    }

    public void setFileExpireDays(int i) {
        if (i >= 3 && i <= 30) {
            this.fileExpireDays = i;
            return;
        }
        Log.e(TAG, "日志缓存时间至少3天,最长30天," + i + "天不合法");
    }

    public void setFileLogLevel(int i) {
        this.fileLogLevel = i;
    }

    public void setFisrtCacheSize(int i) {
        if (i > 10000) {
            this.fisrtCacheSize = i;
        }
    }

    @Deprecated
    public void setFlushCallback(IFlushCallback iFlushCallback) {
        this.flushCallback = iFlushCallback;
    }

    @Deprecated
    public void setImeiProvider(IImeiProvider iImeiProvider) {
        this.iImeiProvider = iImeiProvider;
    }

    public void setLoganMMapLength(int i) {
        if (i > 768000) {
            this.mLoganMMapLength = LoganConfig.MAX_LOGAN_MMAP_LENGTH;
        } else if (i < 102400) {
            this.mLoganMMapLength = 102400;
        } else {
            this.mLoganMMapLength = i;
        }
    }

    @Deprecated
    public void setMaxFile(long j2) {
        if (j2 > 8 || j2 < 1) {
            return;
        }
        this.mMaxFile = j2;
    }

    @Deprecated
    public void setMaxQueue(long j2) {
        if (j2 < 500) {
            return;
        }
        this.maxQueue = j2;
    }

    @Deprecated
    public void setMdpName(String str) {
        this.mdpName = str;
    }

    @Deprecated
    public void setMdpSecret(String str) {
        this.mdpSecret = str;
    }

    @Deprecated
    public void setMinSDCard(long j2) {
        this.mMinSDCard = j2 * 1048576;
    }

    public void setNamePrefix(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!str.matches("[a-zA-Z0-9_]+")) {
            Log.e(TAG, "日志文件前缀设置不合法,设置无效");
            return;
        }
        try {
            if (str.charAt(str.length() - 1) != '_') {
                str = str + "_";
                Log.d(TAG, "业务" + this.business + " 日志前缀设置生效 : " + str);
            }
        } catch (Throwable unused) {
        }
        this.namePrefix = str;
    }

    @Deprecated
    public void setNxHttpClient(INxHttpClient iNxHttpClient) {
        this.iNxHttpClient = iNxHttpClient;
    }

    @Deprecated
    public void setNxLogKey(String str) {
        this.nxLogKey = str;
    }

    public void setOpenIdProvider(IOpenIdProvider iOpenIdProvider) {
        this.openIdProvider = iOpenIdProvider;
    }

    @Deprecated
    public void setPath(String str) {
        this.path = str;
        SPUtil.getInstance().put(DynConfigManager.LOG_NX_DIR_KEY, str);
    }

    public void setRegion(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        AppUtil.setRegion(str);
        this.region = str;
    }

    @Deprecated
    public void setSubType(String str) {
        this.subType = str;
    }

    @Deprecated
    public void setTimerCheckParam(TimerCheckParam timerCheckParam) {
        this.timerCheckParam = timerCheckParam;
    }

    public void setTracePkg(String str) {
        this.tracePkg = str;
    }

    @Deprecated
    public void setUploadPath(String str) {
        this.uploadPath = str;
        TextUtils.isEmpty(str);
    }

    @Deprecated
    public void setiNetAvailable(INetAvailable iNetAvailable) {
        this.iNetAvailable = iNetAvailable;
    }

    @Deprecated
    public void setiNxHttpClient(INxHttpClient iNxHttpClient) {
        this.iNxHttpClient = iNxHttpClient;
    }
}
