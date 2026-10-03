package com.heytap.log.config;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.heytap.log.ISimpleLog;
import com.heytap.log.Logger;
import com.heytap.log.Settings;
import com.heytap.log.core.bean.TimerCheckParam;
import com.heytap.log.dto.TraceConfigDto;
import com.heytap.log.log.SimpleLog;
import com.heytap.log.util.SPUtil;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class DynConfigManager {
    public static final String CACHE_NX_DIR_KEY = "cache-nx-dir";
    private static final String DYN_CONFIG_KEY = "dyn-config";
    private static final String DYN_KEYWORD_CONFIG_KEY = "nx-keyword-config";
    private static final String DYN_PERSIS_CONFIG_KEY = "nx-persis-config";
    public static final String EFFORT = "effort";
    public static final int HLOG_VAL = 2;
    public static final String LOG_NX_DIR_KEY = "log-nx-dir";
    private static final String TAG = "DynMgr";
    private int DEFAULT_PER_DAY;
    private String DYN_NX_CONFIG_KEY;
    public String MAX_TIME_PER_DAY;
    private String commons;
    private final Gson gson;
    private IDynConfig iDynConfig;
    private boolean isAutoUpload;
    private boolean isCheckConfig;
    private boolean isImplementOtel;
    private Logger logger;
    private TraceConfigDto mConfigDto;
    private TraceConfigDto mDefaultConfigDto;
    private int priority;
    private ISimpleLog simpleLog;

    public DynConfigManager() {
        this.DYN_NX_CONFIG_KEY = "nx-dyn-config_";
        this.MAX_TIME_PER_DAY = SPUtil.MAX_TIME_PER_DAY;
        this.mDefaultConfigDto = null;
        this.DEFAULT_PER_DAY = 10;
        this.isAutoUpload = false;
        this.isCheckConfig = false;
        this.isImplementOtel = false;
        this.simpleLog = new SimpleLog(null);
        this.gson = new Gson();
        this.priority = getPriority();
    }

    private void deleteDirZips(String str, long j2) {
        File[] fileArrListFiles;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        File file = new File(str);
        if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (File file2 : fileArrListFiles) {
                try {
                    if (file2.exists() && file2.isFile() && file2.getName().toLowerCase().endsWith(".zip")) {
                        long jLastModified = file2.lastModified();
                        long j3 = jCurrentTimeMillis - jLastModified;
                        if (j3 < j2) {
                            this.logger.debug(TAG, "deleteDirZips skip recent file: " + file2.getName() + ", lastModified: " + jLastModified + ", timeSinceModified: " + j3 + "ms");
                        } else if (!file2.delete()) {
                            this.logger.debug(TAG, "deleteDirZips delete failed: " + file2.getName());
                        }
                    }
                } catch (Exception e2) {
                    this.logger.debug(TAG, "deleteDirZips error: " + e2.getMessage());
                }
            }
        }
    }

    private static boolean isThisDay(long j2) {
        Date date = new Date(j2);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return simpleDateFormat.format(date).equals(simpleDateFormat.format(new Date()));
    }

    public boolean checkCheckTimes() {
        long j2 = SPUtil.getInstance().getInt(this.MAX_TIME_PER_DAY, this.DEFAULT_PER_DAY);
        long j3 = 1;
        if (isThisDay(SPUtil.getInstance().getLong(SPUtil.LAST_CHECK_TIME))) {
            long j4 = SPUtil.getInstance().getLong(SPUtil.HAS_CHECK_TIMES);
            SPUtil.getInstance().put(SPUtil.HAS_CHECK_TIMES, 1 + j4);
            j3 = j4;
        } else {
            SPUtil.getInstance().put(SPUtil.HAS_CHECK_TIMES, 1L);
        }
        SPUtil.getInstance().put(SPUtil.LAST_CHECK_TIME, System.currentTimeMillis());
        return j2 - j3 > 0;
    }

    public void clearKitHistoryZipFiles() {
        long j2;
        File[] fileArr;
        String str;
        try {
            Settings logConfig = this.logger.getLogConfig();
            if (logConfig == null) {
                return;
            }
            String path = logConfig.getPath();
            if (TextUtils.isEmpty(path)) {
                return;
            }
            File file = new File(path);
            if (file.exists() && file.isDirectory()) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                File[] fileArrListFiles = file.listFiles();
                String str2 = ".zip";
                long j3 = 300000;
                if (fileArrListFiles != null) {
                    int length = fileArrListFiles.length;
                    int i = 0;
                    while (i < length) {
                        File file2 = fileArrListFiles[i];
                        try {
                            if (file2.exists() && !file2.isDirectory() && file2.getName().contains(str2)) {
                                long jLastModified = file2.lastModified();
                                fileArr = fileArrListFiles;
                                str = str2;
                                long j4 = jCurrentTimeMillis - jLastModified;
                                if (j4 < j3) {
                                    try {
                                        Logger logger = this.logger;
                                        StringBuilder sb = new StringBuilder();
                                        j2 = jCurrentTimeMillis;
                                        try {
                                            sb.append("clearKitHistoryZipFiles skip recent file: ");
                                            sb.append(file2.getName());
                                            sb.append(", lastModified: ");
                                            sb.append(jLastModified);
                                            sb.append(", timeSinceModified: ");
                                            sb.append(j4);
                                            sb.append("ms");
                                            logger.debug(TAG, sb.toString());
                                        } catch (Exception e2) {
                                            e = e2;
                                            this.logger.debug(TAG, "clearKitHistoryZipFiles error: " + e.getMessage());
                                        }
                                    } catch (Exception e3) {
                                        e = e3;
                                        j2 = jCurrentTimeMillis;
                                    }
                                } else {
                                    j2 = jCurrentTimeMillis;
                                    this.logger.debug(TAG, "clearKitHistoryZipFiles com : " + file2.getName());
                                    this.logger.debug(TAG, "clearKitHistoryZipFiles com : " + file2.getPath());
                                    if (!file2.delete()) {
                                        this.logger.debug(TAG, "clearKitHistoryZipFiles delete failed: " + file2.getName());
                                    }
                                }
                            } else {
                                j2 = jCurrentTimeMillis;
                                fileArr = fileArrListFiles;
                                str = str2;
                            }
                        } catch (Exception e4) {
                            e = e4;
                            j2 = jCurrentTimeMillis;
                            fileArr = fileArrListFiles;
                            str = str2;
                        }
                        i++;
                        fileArrListFiles = fileArr;
                        str2 = str;
                        jCurrentTimeMillis = j2;
                        j3 = 300000;
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(path);
                String str3 = File.separator;
                sb2.append(str3);
                sb2.append("kws");
                deleteDirZips(sb2.toString(), 300000L);
                deleteDirZips(path + str3 + str2, 300000L);
            }
        } catch (Exception e5) {
            this.logger.debug(TAG, "clearKitHistoryZipFiles exception: " + e5.getMessage());
        }
    }

    public void createDefaultConfig(int i, int i2) {
        this.mDefaultConfigDto = new TraceConfigBuilder().setConsole(i).setLevel(i2).setMaxLogSize(3).build();
        getConfigDto();
    }

    public String getBaggageInfos() {
        return getBaggageInfos(this.commons);
    }

    public TraceConfigDto getConfigDto() {
        if (this.logger.getMultiConfMgr() != null) {
            if (this.mConfigDto != null) {
                this.logger.getMultiConfMgr().findCurrentTraceDto(this.mConfigDto.getTraceId());
            } else {
                TraceConfigDto traceConfigDto = new TraceConfigDto();
                traceConfigDto.setTraceId(-1L);
                this.logger.getMultiConfMgr().findCurrentTraceDto(traceConfigDto.getTraceId());
            }
        }
        if (this.mConfigDto == null) {
            this.mConfigDto = this.mDefaultConfigDto;
        }
        return this.mConfigDto;
    }

    public TraceConfigDto getDefaultConfigDto() {
        if (this.mDefaultConfigDto == null) {
            if (this.logger.getLogConfig() != null) {
                createDefaultConfig(this.logger.getLogConfig().getConsoleLogLevel(), this.logger.getLogConfig().getFileLogLevel());
            } else {
                createDefaultConfig(3, 3);
            }
        }
        return this.mDefaultConfigDto;
    }

    public String getLogPathToZip(Settings settings, TraceConfigDto traceConfigDto) {
        if (traceConfigDto == null || TextUtils.isEmpty(traceConfigDto.getKeyWords())) {
            return settings.getPath();
        }
        return settings.getPath() + File.separator + "kws";
    }

    public String getNxLogConfig() {
        TraceConfigDto traceConfigDto = this.mConfigDto;
        if (traceConfigDto == null || !traceConfigDto.isEffort() || this.mConfigDto.getBeginTime() <= 1000) {
            return null;
        }
        return this.gson.toJson(this.mConfigDto);
    }

    public int getPriority() {
        int i = SPUtil.getInstance().getInt(EFFORT);
        this.priority = i;
        return i;
    }

    public String getSpanContext() {
        IDynConfig iDynConfig = this.iDynConfig;
        return iDynConfig != null ? iDynConfig.getTraceContext() : "";
    }

    public long getZipMaxFile() {
        return 10485760L;
    }

    public IDynConfig getiDynConfig() {
        return this.iDynConfig;
    }

    public synchronized boolean identityKeyWords(String str, String str2) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            TraceConfigDto traceConfigDto = this.mConfigDto;
            if (traceConfigDto != null && traceConfigDto.isEffort()) {
                String keyWords = this.mConfigDto.getKeyWords();
                if (!TextUtils.isEmpty(keyWords)) {
                    if (!keyWords.contains(",")) {
                        return str2.contains(keyWords) || str.contains(keyWords);
                    }
                    for (CharSequence charSequence : keyWords.split(",")) {
                        if (str2.contains(charSequence) || str.contains(charSequence)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    public void init(int i, int i2, TimerCheckParam timerCheckParam) {
        if (timerCheckParam != null) {
            this.DEFAULT_PER_DAY = timerCheckParam.getTimesPerDay();
        }
        TraceConfigDto traceConfigDtoBuild = new TraceConfigBuilder().setConsole(i).setLevel(i2).setMaxLogSize(3).build();
        this.mDefaultConfigDto = traceConfigDtoBuild;
        traceConfigDtoBuild.setConsole(i);
        this.mDefaultConfigDto.setLevel(i2);
        this.mConfigDto = this.mDefaultConfigDto;
    }

    public void isCheckConfig() {
        long jRemainCheckTimes = remainCheckTimes();
        this.logger.debug(TAG, "isCheckConfig remainTimes : " + jRemainCheckTimes + " isCheckConfig : " + this.isCheckConfig);
        if (jRemainCheckTimes > 0 && !this.isCheckConfig) {
            this.isCheckConfig = true;
            this.logger.debug(TAG, "isCheckConfig start to request config .");
            Logger logger = this.logger;
            logger.checkMultiUploadForCdnSilent(logger.getLogConfig().getBusiness(), null);
        }
    }

    public boolean isPrint(int i) {
        TraceConfigDto traceConfigDto = this.mConfigDto;
        if (traceConfigDto == null || !traceConfigDto.isEffort()) {
            return i >= getDefaultConfigDto().getLevel() && i < 6;
        }
        return i >= this.mConfigDto.getLevel() && i < 6;
    }

    public boolean isShow(int i) {
        TraceConfigDto traceConfigDto = this.mConfigDto;
        if (traceConfigDto == null || !traceConfigDto.isEffort()) {
            return i >= getDefaultConfigDto().getConsole() && i < 6;
        }
        return i >= this.mConfigDto.getConsole() && i < 6;
    }

    public long remainCheckTimes() {
        long j2;
        long j3 = SPUtil.getInstance().getInt(this.MAX_TIME_PER_DAY, this.DEFAULT_PER_DAY);
        if (isThisDay(SPUtil.getInstance().getLong(SPUtil.LAST_CHECK_TIME))) {
            j2 = SPUtil.getInstance().getLong(SPUtil.HAS_CHECK_TIMES);
        } else {
            SPUtil.getInstance().put(SPUtil.HAS_CHECK_TIMES, 0L);
            j2 = 0;
        }
        return j3 - j2;
    }

    public void setCheckConfig(boolean z) {
        this.isCheckConfig = z;
    }

    public void setConfigDto(TraceConfigDto traceConfigDto) {
        if (traceConfigDto == null || !traceConfigDto.isEffort()) {
            this.mConfigDto = this.mDefaultConfigDto;
            return;
        }
        Logger logger = this.logger;
        if (logger == null || logger.getLogConfig().getBusiness().equalsIgnoreCase(traceConfigDto.getBusiness())) {
            TraceConfigDto traceConfigDto2 = this.mConfigDto;
            if (traceConfigDto2 == null) {
                this.mConfigDto = traceConfigDto;
                SPUtil.getInstance().put(this.MAX_TIME_PER_DAY, this.mConfigDto.getTimesPerDay());
            } else {
                if (traceConfigDto2.getTraceId() == traceConfigDto.getTraceId()) {
                    return;
                }
                this.mConfigDto = traceConfigDto;
                SPUtil.getInstance().put(this.MAX_TIME_PER_DAY, this.mConfigDto.getTimesPerDay());
                this.logger.debug(TAG, "setConfigDto 新的 mConfigDto 开始生效 traceId : " + this.mConfigDto.getTraceId());
            }
        }
    }

    public void setiDynConfig(IDynConfig iDynConfig) {
        this.iDynConfig = iDynConfig;
        if (iDynConfig != null) {
            iDynConfig.setNxLogConfig(getNxLogConfig());
        }
    }

    public String getBaggageInfos(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new JSONObject(str).optString("ums_log_severity");
        } catch (JSONException unused) {
            return null;
        }
    }

    public String getLogPathToZip(Settings settings) {
        TraceConfigDto traceConfigDto = this.mConfigDto;
        if (traceConfigDto != null && !TextUtils.isEmpty(traceConfigDto.getKeyWords())) {
            return settings.getPath() + File.separator + "kws";
        }
        return settings.getPath();
    }

    public DynConfigManager(Logger logger) {
        this.DYN_NX_CONFIG_KEY = "nx-dyn-config_";
        this.MAX_TIME_PER_DAY = SPUtil.MAX_TIME_PER_DAY;
        this.mDefaultConfigDto = null;
        this.DEFAULT_PER_DAY = 10;
        this.isAutoUpload = false;
        this.isCheckConfig = false;
        this.isImplementOtel = false;
        this.simpleLog = new SimpleLog(null);
        this.gson = new Gson();
        this.priority = getPriority();
        this.simpleLog = logger.getSimpleLog();
        this.logger = logger;
        this.DYN_NX_CONFIG_KEY += logger.getLogConfig().getBusiness();
        this.MAX_TIME_PER_DAY += logger.getLogConfig().getBusiness();
    }
}
