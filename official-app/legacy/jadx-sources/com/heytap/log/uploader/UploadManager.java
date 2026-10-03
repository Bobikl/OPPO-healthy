package com.heytap.log.uploader;

import android.content.Context;
import android.database.Cursor;
import android.os.Environment;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.google.gson.Gson;
import com.heytap.log.ISimpleLog;
import com.heytap.log.Logger;
import com.heytap.log.Settings;
import com.heytap.log.UrlProvider;
import com.heytap.log.appender.ILogAppender;
import com.heytap.log.config.DynConfigManager;
import com.heytap.log.config.MultiConfigManager;
import com.heytap.log.consts.UploadCode;
import com.heytap.log.core.LoganModel;
import com.heytap.log.core.bean.NxResponseBean;
import com.heytap.log.core.bean.TimerCheckParam;
import com.heytap.log.discrete.Discrete;
import com.heytap.log.dto.TraceConfigDto;
import com.heytap.log.log.SimpleLog;
import com.heytap.log.nx.http.HttpsUtils;
import com.heytap.log.nx.http.INxHttpClient;
import com.heytap.log.nx.http.NxFile;
import com.heytap.log.nx.http.NxRequest;
import com.heytap.log.nx.http.NxResponse;
import com.heytap.log.nx.obus.Constants;
import com.heytap.log.nx.obus.TaskStatisicsBean;
import com.heytap.log.util.AESUtils;
import com.heytap.log.util.AppUtil;
import com.heytap.log.util.BaseInfoUtil;
import com.heytap.log.util.DBUtil;
import com.heytap.log.util.GzipUtils;
import com.heytap.log.util.SPUtil;
import com.heytap.log.util.String2IntUtil;
import com.heytap.nearx.tangramconfig.bean.CoreEntity;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class UploadManager {
    private static final String CDN_CHECK_CONFIG = "/usertrace/log/cdn/config/";
    private static final long FRESH_ZIP_TIME = 500;
    private static final String REPORT_TAG = "report_log_info";
    private static final String UPLOAD_TAG = "upload_log_info";
    private boolean isUploadThreadLive;
    private ILogAppender mAppender;
    private Discrete mDiscrete;
    private DynConfigManager mDynConfigManager;
    private String mGzPath;
    private UploadHandler mHandler;
    private ISimpleLog mLog;
    private Logger mLogger;
    private INxHttpClient mNxHttpClient;
    private ReportUploaderListener mReportUploaderListener;
    private Settings mSettings;
    private SimpleLog mSimpleLog;
    HandlerThread mUploadThread;
    private UploaderListener mUploaderListener;
    private String zipLogPath;
    private final String TAG = "UpMgr";
    private long prevCheckUploadTime = 0;
    private int mCount = 0;
    private Gson gson = new Gson();
    private String mPrevImei = "";
    private String mPrevOpenId = "";
    private String mEncryptedImei = "";
    private String mEncryptedOpenId = "";
    private int mCheckUploadTime = 0;

    public static class CheckWhetherUploadBody {
    }

    public static class CleanHistoryZipBody {
    }

    public static class ReportBody {
        public String MDPName;
        public String MDPValue;
        public String business;
        public long endTime;
        public String reportReason;
        public String specificId;
        public long startTime;
        public String subType;
        public boolean useWifi;

        public ReportBody() {
        }

        public ReportBody(String str, long j2, long j3, boolean z, String str2, String str3, String str4, String str5, String str6) {
            this.business = str;
            this.startTime = j2;
            this.endTime = j3;
            this.useWifi = z;
            this.specificId = str2;
            this.subType = str3;
            this.MDPName = str4;
            this.reportReason = str5;
            this.MDPValue = str6;
        }
    }

    public interface ReportUploaderListener {
        void onReporterFailed(String str, ReportBody reportBody);

        void onReporterSuccess(ResponseWrapper responseWrapper);
    }

    public static class StatusReportBody {
        String imei;
        int levelStatusCode;
        String levelStatusMsg;
        String openId;
        String subBusiness;
        String traceId;

        public StatusReportBody(String str, int i, String str2, String str3) {
            this.traceId = str;
            this.levelStatusCode = i;
            this.levelStatusMsg = str2;
            this.subBusiness = str3;
        }
    }

    public static class SyncKitBody {
    }

    public static class SyncKitChangeBody {
    }

    public class UploadCheckBody {
        String business;
        String subType;
        UploadCheckerListener uploadCheckerListener;

        public UploadCheckBody(String str, String str2) {
            this.business = str;
            this.subType = str2;
        }

        public void setUploadCheckerListener(UploadCheckerListener uploadCheckerListener) {
            this.uploadCheckerListener = uploadCheckerListener;
        }
    }

    public class UploadCheckForCdnBody {
        String business;
        UploadCheckerForCdnListener uploadCheckerForCdnListener;

        public UploadCheckForCdnBody(String str) {
            this.business = str;
        }

        public void setUploadCheckerForCdnListener(UploadCheckerForCdnListener uploadCheckerForCdnListener) {
            this.uploadCheckerForCdnListener = uploadCheckerForCdnListener;
        }
    }

    public interface UploadCheckerForCdnListener {
        void onDontNeedUpload(String str);

        void onNeedUpload(TraceConfigDto traceConfigDto);
    }

    public interface UploadCheckerListener {
        void onDontNeedUpload(String str);

        void onNeedUpload(TraceConfigDto traceConfigDto);
    }

    public static class UploadMultiBody extends UploadBody {
        public UploadMultiBody(String str, long j2, long j3, boolean z, String str2, String str3) {
            super(str, j2, j3, z, str2, str3);
        }

        public String toString() {
            return "UploadMultiBody{business='" + this.business + "', subType='" + this.subType + "', startTime=" + this.startTime + ", endTime=" + this.endTime + ", useWifi=" + this.useWifi + ", traceId='" + this.traceId + "', tracePkg='" + this.tracePkg + "', uploadCheckerListener=" + this.uploadCheckerListener + '}';
        }

        public UploadMultiBody(String str, long j2, long j3, boolean z, String str2, String str3, UploadCheckerListener uploadCheckerListener) {
            super(str, j2, j3, z, str2, str3, uploadCheckerListener);
        }
    }

    public class UploadMultiCheckForCdnBody {
        String business;
        UploadCheckerForCdnListener uploadCheckerForCdnListener;

        public UploadMultiCheckForCdnBody(String str) {
            this.business = str;
        }

        public void setUploadCheckerForCdnListener(UploadCheckerForCdnListener uploadCheckerForCdnListener) {
            this.uploadCheckerForCdnListener = uploadCheckerForCdnListener;
        }
    }

    public interface UploaderListener {
        void onUploaderFailed(String str);

        void onUploaderSuccess();
    }

    public UploadManager(Settings settings, DynConfigManager dynConfigManager, SimpleLog simpleLog, Logger logger) {
        this.zipLogPath = null;
        this.mDynConfigManager = new DynConfigManager();
        if (settings == null) {
            logger.e("UpMgr", "init UploadManager fail, logConfig is null");
            return;
        }
        this.mSettings = settings;
        this.mLogger = logger;
        this.zipLogPath = this.mSettings.getUploadPath() + File.separator + ".zip";
        this.mNxHttpClient = settings.getNxHttpClient();
        this.mDynConfigManager = dynConfigManager;
        this.mSimpleLog = simpleLog;
        if (simpleLog == null) {
            this.mSimpleLog = new SimpleLog(null);
        }
        this.mLog = this.mSimpleLog;
        this.mDiscrete = new Discrete(logger);
        initThread(settings);
        this.mGzPath = "/data" + Environment.getDataDirectory().getAbsolutePath() + "/" + this.mSettings.getContext().getPackageName() + "/databases";
    }

    public static /* synthetic */ int access$1308(UploadManager uploadManager) {
        int i = uploadManager.mCheckUploadTime;
        uploadManager.mCheckUploadTime = i + 1;
        return i;
    }

    private boolean checkHistoryTraceId(long j2) {
        String string = SPUtil.getInstance().getString(SPUtil.TRACE_ID, "");
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        if (this.mLogger.isDebug()) {
            this.mLogger.d("UpMgr", "The uploaded traceIds : " + string);
        }
        String[] strArrSplit = string.split(",");
        if (strArrSplit != null && strArrSplit.length != 0) {
            for (String str : strArrSplit) {
                if (TextUtils.equals(str, String.valueOf(j2))) {
                    return true;
                }
            }
        }
        return false;
    }

    private List<TraceConfigDto> checkMultiCdnConfigDto(List<TraceConfigDto> list) {
        String strEncryptByKey;
        if (list == null || list.size() == 0) {
            if (this.mLogger.getMultiConfMgr() != null) {
                this.mLogger.getMultiConfMgr().deleteAllPushTaskInfo();
            }
            return null;
        }
        String packageName = TextUtils.isEmpty(this.mSettings.getTracePkg()) ? AppUtil.getPackageName(AppUtil.getAppContext()) : this.mSettings.getTracePkg();
        ArrayList arrayList = new ArrayList();
        try {
            String ouid = "";
            if (this.mSettings.getCustomIdProvider() != null) {
                strEncryptByKey = AESUtils.encryptByKey(UrlProvider.AES_KEY_ARRAYS, this.mSettings.getCustomIdProvider().getCustomID() == null ? "" : this.mSettings.getCustomIdProvider().getCustomID());
            } else if (this.mSettings.getImeiProvider() != null) {
                strEncryptByKey = AESUtils.encryptByKey(UrlProvider.AES_KEY_ARRAYS, this.mSettings.getImeiProvider().getImei() == null ? "" : this.mSettings.getImeiProvider().getImei());
            } else {
                this.mLogger.w("UpMgr", "ImeiProvider is null");
                strEncryptByKey = AESUtils.encryptByKey(UrlProvider.AES_KEY_ARRAYS, "");
            }
            if (this.mSettings.getOpenIdProvider() == null) {
                this.mLogger.w("UpMgr", "OpenIdProvider is null, can not match task");
                return null;
            }
            String strEncryptByKey2 = AESUtils.encryptByKey(UrlProvider.AES_KEY_ARRAYS, this.mSettings.getOpenIdProvider().getDuid() == null ? "" : this.mSettings.getOpenIdProvider().getDuid());
            String strEncryptByKey3 = AESUtils.encryptByKey(UrlProvider.AES_KEY_ARRAYS, this.mSettings.getOpenIdProvider().getGuid() == null ? "" : this.mSettings.getOpenIdProvider().getGuid());
            int[] iArr = UrlProvider.AES_KEY_ARRAYS;
            if (this.mSettings.getOpenIdProvider().getOuid() != null) {
                ouid = this.mSettings.getOpenIdProvider().getOuid();
            }
            String strEncryptByKey4 = AESUtils.encryptByKey(iArr, ouid);
            if (TextUtils.isEmpty(strEncryptByKey) && TextUtils.isEmpty(strEncryptByKey2) && TextUtils.isEmpty(strEncryptByKey3) && TextUtils.isEmpty(strEncryptByKey4)) {
                if (this.mLogger.isDebug()) {
                    this.mLogger.e("UpMgr", "duid guid ouid can not empty");
                }
                return null;
            }
            for (TraceConfigDto traceConfigDto : list) {
                if (!traceConfigDto.getEncryClientId().contains(strEncryptByKey) && !traceConfigDto.getEncryClientId().contains(strEncryptByKey2) && !traceConfigDto.getEncryClientId().contains(strEncryptByKey3) && !traceConfigDto.getEncryClientId().contains(strEncryptByKey4)) {
                    this.mLogger.w("UpMgr", "打捞任务ID: " + traceConfigDto.getTraceId() + " 设备ID不匹配");
                } else if (traceConfigDto.getExactMatchTracePkg() == 1 && !TextUtils.isEmpty(traceConfigDto.getTracePkg()) && !TextUtils.equals(traceConfigDto.getTracePkg(), packageName)) {
                    this.mLogger.w("UpMgr", "打捞任务ID: " + traceConfigDto.getTraceId() + traceConfigDto.getTracePkg() + " 包名不匹配");
                } else if (traceConfigDto.getExactMatchTracePkg() == 1 || TextUtils.isEmpty(traceConfigDto.getTracePkg()) || packageName.contains(traceConfigDto.getTracePkg())) {
                    if (traceConfigDto.getTraceId() > -1) {
                        arrayList.add(traceConfigDto);
                    }
                }
            }
            if (arrayList.size() > 0) {
                TraceConfigDto traceConfigDto2 = (TraceConfigDto) arrayList.get(0);
                TaskStatisicsBean taskStatisicsBean = new TaskStatisicsBean(traceConfigDto2.getTraceId(), this.mLogger.getLogConfig().getBusiness(), traceConfigDto2.getTracePkg(), 200, "", 0L);
                Logger logger = this.mLogger;
                logger.reportStatistic(logger.getContext(), Constants.REV_TASK, taskStatisicsBean);
            } else {
                this.mLogger.w("UpMgr", "没有符合匹配的打捞任务!");
            }
            this.mLogger.getMultiConfMgr().noFindAndDeleteLocalTaskInfo(arrayList);
            if (this.mLogger.isDebug()) {
                this.mLogger.d("UpMgr", "valid lastedConfigList info : " + arrayList.toString());
            }
            if (arrayList.size() == 0) {
                this.mLogger.getMultiConfMgr().deleteAllPushTaskInfo();
            }
            return arrayList;
        } catch (Exception e2) {
            this.mLogger.w("UpMgr", "getLastestConfig error:" + e2.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void doMultiUpload(UploadMultiBody uploadMultiBody, int i, File file) {
        this.mLogger.e("UpMgr", "doMultiUpload body:" + uploadMultiBody);
        this.mLogger.e("UpMgr", "doMultiUpload file:" + file);
        if (this.mNxHttpClient == null || uploadMultiBody == null || file == null) {
            this.mLogger.e(UPLOAD_TAG, "upload fail : HttpDelegate is null");
            UploaderListener uploaderListener = this.mUploaderListener;
            if (uploaderListener != null) {
                uploaderListener.onUploaderFailed("upload fail : HttpDelegate is null");
            }
            return;
        }
        try {
            String packageName = TextUtils.isEmpty(this.mSettings.getTracePkg()) ? AppUtil.getPackageName(AppUtil.getAppContext()) : this.mSettings.getTracePkg();
            this.mLogger.e("UpMgr", "verifyId:" + verifyId(this.mSettings));
            if (!verifyId(this.mSettings)) {
                UploaderListener uploaderListener2 = this.mUploaderListener;
                if (uploaderListener2 != null) {
                    uploaderListener2.onUploaderFailed("校验业务提供非法ID信息，无法发起上传日志");
                }
                return;
            }
            this.mPrevImei = getEncryptedImei(makeImeiFromSettings(this.mSettings));
            String encryptedOpenId = getEncryptedOpenId(makeOpenId(this.mSettings.getOpenIdProvider()));
            this.mPrevOpenId = encryptedOpenId;
            if (TextUtils.isEmpty(encryptedOpenId) && TextUtils.isEmpty(this.mPrevImei)) {
                this.mLogger.e("UpMgr", "业务提供非法ID信息，无法发起上传日志");
                UploaderListener uploaderListener3 = this.mUploaderListener;
                if (uploaderListener3 != null) {
                    uploaderListener3.onUploaderFailed("业务提供非法ID信息，无法发起上传日志");
                }
                return;
            }
            String strMakeUploadUrl = UrlProvider.makeUploadUrl(uploadMultiBody.business, uploadMultiBody.traceId, file.getName(), i, "", uploadMultiBody.subType, packageName, this.mSettings, this.mPrevImei, this.mPrevOpenId);
            if (this.mLogger.isDebug()) {
                this.mLogger.d("UpMgr", "+doUpload Code: " + strMakeUploadUrl);
            }
            NxRequest nxRequest = new NxRequest();
            nxRequest.setUrl(strMakeUploadUrl);
            nxRequest.setFile(file);
            NxResponse nxResponseSendRequest = this.mNxHttpClient.sendRequest(nxRequest);
            Log.d("UpMgr", "nxResponse.getCode() = " + nxResponseSendRequest.getCode() + "\n nxResponse.getMessage() = " + nxResponseSendRequest.getMessage() + "\n nxResponse.getFile() = " + nxResponseSendRequest.getFile() + "\n nxResponse.getHeader() = " + nxResponseSendRequest.getHeader());
            if (AppUtil.getLogEnable()) {
                StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(String2IntUtil.toEncrypted("uhttp:" + uploadMultiBody.business + "-" + uploadMultiBody.traceId));
                Log.i("UpMgr", sb.toString());
            }
            if (this.mLogger.isDebug()) {
                this.mLogger.d("UpMgr", "+nxResponse Code: " + nxResponseSendRequest.getCode());
            }
            if (nxResponseSendRequest.getCode() == 200) {
                NxResponseBean nxResponseBean = (NxResponseBean) this.gson.fromJson(nxResponseSendRequest.getMessage(), NxResponseBean.class);
                this.mLogger.d("UpMgr", "+nxResponse Status: " + nxResponseBean.getStatus());
                TaskStatisicsBean taskStatisicsBean = new TaskStatisicsBean(Long.parseLong(uploadMultiBody.traceId), uploadMultiBody.business, uploadMultiBody.tracePkg, nxResponseBean.getStatus(), nxResponseBean.getMsg(), file.length(), i);
                Logger logger = this.mLogger;
                logger.reportStatistic(logger.getContext(), Constants.REPORT_TASK, taskStatisicsBean);
                switch (nxResponseBean.getStatus()) {
                    case 2000:
                        this.mLogger.getMultiConfMgr().markPushTaskFinish(Long.parseLong(uploadMultiBody.traceId));
                        uploadSuccess();
                        if (this.mLogger.isDebug()) {
                            this.mLogger.d(UPLOAD_TAG, "日志上传成功,具体信息 : " + nxResponseBean.getMsg());
                        }
                        break;
                    case 2001:
                    case 2002:
                    case 2003:
                        if (this.mLogger.isDebug()) {
                            this.mLogger.e(UPLOAD_TAG, "traceId : " + uploadMultiBody.traceId + " Upload failed : " + nxResponseBean.getMsg());
                        }
                        this.mLogger.getMultiConfMgr().markPushTaskFinish(Long.parseLong(uploadMultiBody.traceId));
                        break;
                    case 2004:
                        this.mLogger.getMultiConfMgr().markPushTaskFinish(Long.parseLong(uploadMultiBody.traceId));
                        break;
                    case 2005:
                        uploadMultiFailed(uploadMultiBody, nxResponseBean.getStatus(), nxResponseBean.getMsg());
                        if (this.mLogger.isDebug()) {
                            this.mLogger.e(UPLOAD_TAG, "traceId : " + uploadMultiBody.traceId + " Upload failed : " + nxResponseBean.getMsg());
                        }
                        break;
                    default:
                        this.mLogger.getMultiConfMgr().markPushTaskFinish(Long.parseLong(uploadMultiBody.traceId));
                        break;
                }
            } else {
                String str = "upload error:response code is " + nxResponseSendRequest.getCode() + ", msg is " + nxResponseSendRequest.getMessage();
                uploadMultiFailed(uploadMultiBody, -110, str);
                this.mLogger.e(UPLOAD_TAG, "traceId : " + uploadMultiBody.traceId + " Upload failed:" + str);
                if (nxResponseSendRequest.getCode() == -1) {
                    this.mLogger.getMultiConfMgr().markPushTaskFinish(Long.parseLong(uploadMultiBody.traceId));
                }
            }
            uploadEnd();
        } catch (Exception e2) {
            uploadMultiFailed(uploadMultiBody, -111, e2.toString());
            this.mLogger.e(UPLOAD_TAG, "upload network exception:" + e2.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doMultiUploadCheckerForCdn(String str, UploadCheckerForCdnListener uploadCheckerForCdnListener, Context context) {
        if (this.mNxHttpClient == null) {
            this.mLogger.e(UPLOAD_TAG, "check upload failed : HttpDelegate is null");
            return;
        }
        try {
            this.mLogger.getMultiConfMgr().clearOldTraceIds();
            NxRequest nxRequest = new NxRequest();
            String str2 = UrlProvider.getHost(this.mSettings.getEnv(), this.mSettings.getRegion()) + CDN_CHECK_CONFIG + str;
            nxRequest.setUrl(str2);
            nxRequest.setNxFile(new NxFile().setPath(this.mGzPath).setFileName("cdn.gz"));
            NxResponse nxResponseDownloadRequest = this.mNxHttpClient.downloadRequest(nxRequest);
            if (nxResponseDownloadRequest.getHeader() == null || !nxResponseDownloadRequest.getHeader().containsKey(HttpsUtils.DISCRETE_HEADER_KEY)) {
                Discrete discrete = this.mDiscrete;
                if (discrete != null) {
                    discrete.setDiscreteEnable(this.mLogger, "");
                }
            } else {
                String str3 = (String) nxResponseDownloadRequest.getHeader().get(HttpsUtils.DISCRETE_HEADER_KEY);
                if (this.mLogger.isDebug()) {
                    this.mLogger.d("UpMgr", "doMultiUploadCheckerForCdn discreate : " + str3);
                }
                Discrete discrete2 = this.mDiscrete;
                if (discrete2 != null) {
                    discrete2.setDiscreteEnable(this.mLogger, str3);
                }
            }
            if (AppUtil.getLogEnable()) {
                StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(String2IntUtil.toEncrypted("chttp:" + this.mSettings.getBusiness()));
                Log.i("UpMgr", sb.toString());
            }
            List<TraceConfigDto> list = parserCDNConfig(context, nxResponseDownloadRequest);
            if (this.mLogger.isDebug()) {
                this.mLogger.d("UpMgr", "doMultiUploadCheckerForCdn: " + str2 + " code : " + nxResponseDownloadRequest.getCode());
                Logger logger = this.mLogger;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("doMultiUploadCheckerForCdn cdnConfigDtos : ");
                sb2.append(list);
                logger.d("UpMgr", sb2.toString());
            }
            List<TraceConfigDto> listCheckMultiCdnConfigDto = checkMultiCdnConfigDto(list);
            if (this.mDynConfigManager != null && nxResponseDownloadRequest.getCode() == 200) {
                this.mDynConfigManager.setCheckConfig(true);
            }
            if (listCheckMultiCdnConfigDto == null || listCheckMultiCdnConfigDto.size() <= 0) {
                if (uploadCheckerForCdnListener != null) {
                    uploadCheckerForCdnListener.onDontNeedUpload("userTraceConfigDto or device id is empty");
                    return;
                }
                return;
            }
            TraceConfigDto traceConfigDto = listCheckMultiCdnConfigDto.get(0);
            if (this.mLogger.isDebug()) {
                this.mLogger.d("UpMgr", "doMultiUploadCheckerForCdn configDto : " + traceConfigDto);
            }
            DynConfigManager dynConfigManager = this.mDynConfigManager;
            if (dynConfigManager != null) {
                dynConfigManager.setConfigDto(traceConfigDto);
                if (this.mLogger.isDebug()) {
                    this.mLogger.d("UpMgr", "doMultiUploadCheckerForCdn effort configDto : " + traceConfigDto);
                }
            }
            if (uploadCheckerForCdnListener != null && traceConfigDto.getBeginTime() != 1000) {
                if (this.mLogger.isDebug()) {
                    this.mLogger.i(UPLOAD_TAG, "+need upload log");
                }
                this.mLogger.getMultiConfMgr().updatePushTaskInfo(listCheckMultiCdnConfigDto);
                uploadCheckerForCdnListener.onNeedUpload(traceConfigDto);
                return;
            }
            sendStatusReportMessage(traceConfigDto.getTraceId() + "");
            if (uploadCheckerForCdnListener != null) {
                uploadCheckerForCdnListener.onDontNeedUpload("userTraceConfigDto is not upload log config");
            }
        } catch (Exception e2) {
            if (uploadCheckerForCdnListener != null) {
                uploadCheckerForCdnListener.onDontNeedUpload(e2.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r28v0, types: [com.heytap.log.uploader.UploadManager] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.heytap.log.uploader.UploadManager$ReportBody] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.String] */
    public void doReportUpload(ReportBody reportBody, int i, File file) {
        String str;
        ?? r3;
        int code;
        String str2;
        String str3 = this.mNxHttpClient == null ? "report upload fail : HttpDelegate is null" : "";
        if (reportBody == null) {
            str3 = "report upload fail : reportBody is null";
        }
        if (file == null) {
            str3 = "report upload fail : file is null";
        }
        boolean zIsEmpty = TextUtils.isEmpty(str3);
        String str4 = REPORT_TAG;
        if (!zIsEmpty) {
            if (this.mReportUploaderListener != null) {
                this.mLogger.e(REPORT_TAG, str3);
                this.mReportUploaderListener.onReporterFailed(str3, reportBody);
                return;
            }
            return;
        }
        try {
            String packageName = TextUtils.isEmpty(this.mSettings.getTracePkg()) ? AppUtil.getPackageName(AppUtil.getAppContext()) : this.mSettings.getTracePkg();
            if (TextUtils.isEmpty(reportBody.specificId)) {
                reportBody.specificId = "0";
            }
            if (verifyId(this.mSettings)) {
                this.mPrevImei = getEncryptedImei(makeImeiFromSettings(this.mSettings));
                this.mPrevOpenId = getEncryptedOpenId(makeOpenId(this.mSettings.getOpenIdProvider()));
                String str5 = reportBody.business;
                String str6 = reportBody.specificId;
                String name = file.getName();
                String str7 = reportBody.subType;
                String str8 = reportBody.MDPName;
                String str9 = reportBody.reportReason;
                str = REPORT_TAG;
                try {
                    try {
                        try {
                            try {
                                String strMakeReportUrl = UrlProvider.makeReportUrl(str5, str6, name, i, "", str7, packageName, str8, str9, reportBody.endTime, this.zipLogPath, reportBody.MDPValue, this.mLog, this.mSettings, this.mPrevImei, this.mPrevOpenId);
                                r3 = "UpMgr";
                                if (this.mLogger.isDebug()) {
                                    this.mLogger.d("UpMgr", "doReportUpload Code: " + strMakeReportUrl);
                                }
                                NxRequest nxRequest = new NxRequest();
                                nxRequest.setUrl(strMakeReportUrl);
                                try {
                                    nxRequest.setFile(file);
                                    NxResponse nxResponseSendRequest = this.mNxHttpClient.sendRequest(nxRequest);
                                    if (AppUtil.getLogEnable()) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("");
                                        sb.append(String2IntUtil.toEncrypted("rhttp:" + this.mSettings.getBusiness()));
                                        Log.i("UpMgr", sb.toString());
                                    }
                                    try {
                                        if (nxResponseSendRequest == null || nxResponseSendRequest.getCode() != 200) {
                                            if (nxResponseSendRequest == null) {
                                                str2 = "report upload error:response is null";
                                                code = 0;
                                            } else {
                                                String str10 = "report upload error:response code is " + nxResponseSendRequest.getCode() + ", msg is " + nxResponseSendRequest.getMessage();
                                                code = nxResponseSendRequest.getCode();
                                                str2 = str10;
                                            }
                                            TaskStatisicsBean taskStatisicsBean = new TaskStatisicsBean(1, Long.parseLong(reportBody.specificId), reportBody.business, this.mLogger.getLogConfig().getTracePkg(), code, str2, file.length());
                                            Logger logger = this.mLogger;
                                            logger.reportStatistic(logger.getContext(), Constants.REPORT_TASK, taskStatisicsBean);
                                            reportUploadFailed(reportBody, -110, str2);
                                            return;
                                        }
                                        ReportBody reportBody2 = reportBody;
                                        try {
                                            TaskStatisicsBean taskStatisicsBean2 = new TaskStatisicsBean(1, Long.parseLong(reportBody2.specificId), reportBody2.business, this.mLogger.getLogConfig().getTracePkg(), nxResponseSendRequest.getCode(), nxResponseSendRequest.getMessage(), file.length());
                                            Logger logger2 = this.mLogger;
                                            logger2.reportStatistic(logger2.getContext(), Constants.REPORT_TASK, taskStatisicsBean2);
                                            reportUploadSuccess(new ResponseWrapper(nxResponseSendRequest.getCode(), nxResponseSendRequest.getMessage()));
                                            return;
                                        } catch (Exception e2) {
                                            e = e2;
                                            r3 = reportBody2;
                                        }
                                    } catch (Exception e3) {
                                        e = e3;
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                    r3 = reportBody;
                                }
                            } catch (Exception e5) {
                                e = e5;
                                r3 = reportBody;
                            }
                            str4 = Constants.REPORT_TASK;
                        } catch (Exception e6) {
                            e = e6;
                            str4 = Constants.REPORT_TASK;
                            r3 = reportBody;
                        }
                    } catch (Exception e7) {
                        e = e7;
                        str4 = Constants.REPORT_TASK;
                        r3 = reportBody;
                    }
                } catch (Exception e8) {
                    e = e8;
                    str4 = Constants.REPORT_TASK;
                }
                TaskStatisicsBean taskStatisicsBean3 = new TaskStatisicsBean(1, Long.parseLong(r3.specificId), r3.business, this.mLogger.getLogConfig().getTracePkg(), -111, e.toString(), file.length());
                Logger logger3 = this.mLogger;
                logger3.reportStatistic(logger3.getContext(), str4, taskStatisicsBean3);
                reportUploadFailed(r3, -111, e.toString());
                this.mLogger.e(str, "report upload network exception:" + e.toString());
            }
            return;
        } catch (Exception e9) {
            e = e9;
            str = REPORT_TAG;
        }
        str4 = Constants.REPORT_TASK;
        r3 = reportBody;
        TaskStatisicsBean taskStatisicsBean4 = new TaskStatisicsBean(1, Long.parseLong(r3.specificId), r3.business, this.mLogger.getLogConfig().getTracePkg(), -111, e.toString(), file.length());
        Logger logger4 = this.mLogger;
        logger4.reportStatistic(logger4.getContext(), str4, taskStatisicsBean4);
        reportUploadFailed(r3, -111, e.toString());
        this.mLogger.e(str, "report upload network exception:" + e.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doStatusReportForCdn(StatusReportBody statusReportBody) {
        if (this.mNxHttpClient == null) {
            this.mLogger.e(REPORT_TAG, "upload code error : HttpDelegate is null");
            return;
        }
        if (statusReportBody == null) {
            this.mLogger.e(REPORT_TAG, "upload code error : UploadBody is null");
            return;
        }
        try {
            String strMakeStatusReportUrl = UrlProvider.makeStatusReportUrl(statusReportBody.traceId, statusReportBody.levelStatusCode, statusReportBody.levelStatusMsg, this.mSettings);
            if (this.mLogger.isDebug()) {
                this.mLogger.d(REPORT_TAG, "doStatusReportForCdn finalUrl : " + strMakeStatusReportUrl);
            }
            if (AppUtil.getLogEnable()) {
                StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(String2IntUtil.toEncrypted("shttp:" + this.mSettings.getBusiness()));
                Log.i("UpMgr", sb.toString());
            }
            NxRequest nxRequest = new NxRequest();
            nxRequest.setUrl(strMakeStatusReportUrl);
            nxRequest.setMethod("GET");
            NxResponse nxResponseSendRequest = this.mNxHttpClient.sendRequest(nxRequest);
            if (AppUtil.getLogEnable()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("");
                sb2.append(String2IntUtil.toEncrypted("shttp:" + this.mSettings.getBusiness()));
                Log.i("UpMgr", sb2.toString());
            }
            if (nxResponseSendRequest == null || nxResponseSendRequest.getCode() != 200) {
                this.mLogger.e(REPORT_TAG, "report config status failure .");
            } else {
                this.mLogger.d(REPORT_TAG, "report config status successfully .");
            }
        } catch (Exception e2) {
            this.mLogger.e(REPORT_TAG, "report upload network exception:" + e2.toString());
        }
    }

    private String getEncryptedImei(String str) {
        try {
            if (TextUtils.isEmpty(this.mEncryptedImei) || !this.mPrevImei.equalsIgnoreCase(str)) {
                this.mEncryptedImei = UrlProvider.ID_PREFIX + AESUtils.encryptByKey(UrlProvider.AES_KEY_ARRAYS, str);
                this.mPrevImei = str;
            }
            return (TextUtils.isEmpty(this.mEncryptedImei) || UrlProvider.ID_PREFIX.equals(this.mEncryptedImei)) ? str : this.mEncryptedImei;
        } catch (Exception e2) {
            this.mLogger.e("UpMgr", "getEncryptedImei : " + e2.toString());
            return str;
        }
    }

    private String getEncryptedOpenId(String str) {
        try {
            if (TextUtils.isEmpty(this.mEncryptedOpenId) || !str.equalsIgnoreCase(this.mPrevOpenId)) {
                this.mEncryptedOpenId = UrlProvider.ID_PREFIX + AESUtils.encryptByKey(UrlProvider.AES_KEY_ARRAYS, str);
                this.mPrevOpenId = str;
            }
            return (TextUtils.isEmpty(this.mEncryptedOpenId) || UrlProvider.ID_PREFIX.equals(this.mEncryptedOpenId)) ? str : this.mEncryptedOpenId;
        } catch (Exception e2) {
            this.mLogger.e("UpMgr", "getEncryptedOpenId : " + e2.toString());
            return str;
        }
    }

    private void initThread(Settings settings) {
        if (this.mUploadThread == null) {
            HandlerThread handlerThread = new HandlerThread("hlog_uploadthread");
            this.mUploadThread = handlerThread;
            handlerThread.start();
        }
        this.mHandler = new UploadHandler(this.mUploadThread.getLooper(), settings);
        this.isUploadThreadLive = true;
    }

    private String makeImei(Settings.ICustomIDProvider iCustomIDProvider) {
        return iCustomIDProvider == null ? "" : iCustomIDProvider.getCustomID();
    }

    private String makeImeiFromSettings(Settings settings) {
        if (settings == null) {
            return "";
        }
        if (settings.getCustomIdProvider() != null) {
            String customID = settings.getCustomIdProvider().getCustomID();
            if (!TextUtils.isEmpty(customID)) {
                return customID;
            }
        }
        if (settings.getImeiProvider() != null) {
            String imei = settings.getImeiProvider().getImei();
            if (!TextUtils.isEmpty(imei)) {
                return imei;
            }
        }
        return "";
    }

    private String makeOpenId(Settings.IOpenIdProvider iOpenIdProvider) {
        if (iOpenIdProvider == null) {
            return "";
        }
        String guid = iOpenIdProvider.getGuid() == null ? "" : iOpenIdProvider.getGuid();
        String ouid = iOpenIdProvider.getOuid() == null ? "" : iOpenIdProvider.getOuid();
        String duid = iOpenIdProvider.getDuid() != null ? iOpenIdProvider.getDuid() : "";
        this.mLogger.d("UpMgr", guid + "/" + ouid + "/" + duid);
        return guid + "/" + ouid + "/" + duid;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0082 A[Catch: all -> 0x0156, Exception -> 0x0158, TryCatch #1 {Exception -> 0x0158, blocks: (B:8:0x0019, B:10:0x0037, B:12:0x0052, B:13:0x0059, B:15:0x0061, B:17:0x006b, B:59:0x0140, B:61:0x0146, B:18:0x0077, B:19:0x007a, B:21:0x0082, B:22:0x0089, B:24:0x0091, B:25:0x0098, B:27:0x00a0, B:28:0x00a7, B:30:0x00af, B:31:0x00b6, B:33:0x00be, B:34:0x00c5, B:36:0x00cd, B:37:0x00d4, B:39:0x00dc, B:40:0x00e3, B:42:0x00eb, B:43:0x00f2, B:45:0x00fa, B:46:0x0101, B:48:0x0109, B:49:0x0110, B:51:0x0118, B:52:0x011f, B:54:0x0127, B:55:0x012e, B:57:0x0136, B:58:0x013d), top: B:78:0x0019, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0091 A[Catch: all -> 0x0156, Exception -> 0x0158, TryCatch #1 {Exception -> 0x0158, blocks: (B:8:0x0019, B:10:0x0037, B:12:0x0052, B:13:0x0059, B:15:0x0061, B:17:0x006b, B:59:0x0140, B:61:0x0146, B:18:0x0077, B:19:0x007a, B:21:0x0082, B:22:0x0089, B:24:0x0091, B:25:0x0098, B:27:0x00a0, B:28:0x00a7, B:30:0x00af, B:31:0x00b6, B:33:0x00be, B:34:0x00c5, B:36:0x00cd, B:37:0x00d4, B:39:0x00dc, B:40:0x00e3, B:42:0x00eb, B:43:0x00f2, B:45:0x00fa, B:46:0x0101, B:48:0x0109, B:49:0x0110, B:51:0x0118, B:52:0x011f, B:54:0x0127, B:55:0x012e, B:57:0x0136, B:58:0x013d), top: B:78:0x0019, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x00a0 A[Catch: all -> 0x0156, Exception -> 0x0158, TryCatch #1 {Exception -> 0x0158, blocks: (B:8:0x0019, B:10:0x0037, B:12:0x0052, B:13:0x0059, B:15:0x0061, B:17:0x006b, B:59:0x0140, B:61:0x0146, B:18:0x0077, B:19:0x007a, B:21:0x0082, B:22:0x0089, B:24:0x0091, B:25:0x0098, B:27:0x00a0, B:28:0x00a7, B:30:0x00af, B:31:0x00b6, B:33:0x00be, B:34:0x00c5, B:36:0x00cd, B:37:0x00d4, B:39:0x00dc, B:40:0x00e3, B:42:0x00eb, B:43:0x00f2, B:45:0x00fa, B:46:0x0101, B:48:0x0109, B:49:0x0110, B:51:0x0118, B:52:0x011f, B:54:0x0127, B:55:0x012e, B:57:0x0136, B:58:0x013d), top: B:78:0x0019, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00af A[Catch: all -> 0x0156, Exception -> 0x0158, TryCatch #1 {Exception -> 0x0158, blocks: (B:8:0x0019, B:10:0x0037, B:12:0x0052, B:13:0x0059, B:15:0x0061, B:17:0x006b, B:59:0x0140, B:61:0x0146, B:18:0x0077, B:19:0x007a, B:21:0x0082, B:22:0x0089, B:24:0x0091, B:25:0x0098, B:27:0x00a0, B:28:0x00a7, B:30:0x00af, B:31:0x00b6, B:33:0x00be, B:34:0x00c5, B:36:0x00cd, B:37:0x00d4, B:39:0x00dc, B:40:0x00e3, B:42:0x00eb, B:43:0x00f2, B:45:0x00fa, B:46:0x0101, B:48:0x0109, B:49:0x0110, B:51:0x0118, B:52:0x011f, B:54:0x0127, B:55:0x012e, B:57:0x0136, B:58:0x013d), top: B:78:0x0019, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00be A[Catch: all -> 0x0156, Exception -> 0x0158, TryCatch #1 {Exception -> 0x0158, blocks: (B:8:0x0019, B:10:0x0037, B:12:0x0052, B:13:0x0059, B:15:0x0061, B:17:0x006b, B:59:0x0140, B:61:0x0146, B:18:0x0077, B:19:0x007a, B:21:0x0082, B:22:0x0089, B:24:0x0091, B:25:0x0098, B:27:0x00a0, B:28:0x00a7, B:30:0x00af, B:31:0x00b6, B:33:0x00be, B:34:0x00c5, B:36:0x00cd, B:37:0x00d4, B:39:0x00dc, B:40:0x00e3, B:42:0x00eb, B:43:0x00f2, B:45:0x00fa, B:46:0x0101, B:48:0x0109, B:49:0x0110, B:51:0x0118, B:52:0x011f, B:54:0x0127, B:55:0x012e, B:57:0x0136, B:58:0x013d), top: B:78:0x0019, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00cd A[Catch: all -> 0x0156, Exception -> 0x0158, TryCatch #1 {Exception -> 0x0158, blocks: (B:8:0x0019, B:10:0x0037, B:12:0x0052, B:13:0x0059, B:15:0x0061, B:17:0x006b, B:59:0x0140, B:61:0x0146, B:18:0x0077, B:19:0x007a, B:21:0x0082, B:22:0x0089, B:24:0x0091, B:25:0x0098, B:27:0x00a0, B:28:0x00a7, B:30:0x00af, B:31:0x00b6, B:33:0x00be, B:34:0x00c5, B:36:0x00cd, B:37:0x00d4, B:39:0x00dc, B:40:0x00e3, B:42:0x00eb, B:43:0x00f2, B:45:0x00fa, B:46:0x0101, B:48:0x0109, B:49:0x0110, B:51:0x0118, B:52:0x011f, B:54:0x0127, B:55:0x012e, B:57:0x0136, B:58:0x013d), top: B:78:0x0019, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00dc A[Catch: all -> 0x0156, Exception -> 0x0158, TryCatch #1 {Exception -> 0x0158, blocks: (B:8:0x0019, B:10:0x0037, B:12:0x0052, B:13:0x0059, B:15:0x0061, B:17:0x006b, B:59:0x0140, B:61:0x0146, B:18:0x0077, B:19:0x007a, B:21:0x0082, B:22:0x0089, B:24:0x0091, B:25:0x0098, B:27:0x00a0, B:28:0x00a7, B:30:0x00af, B:31:0x00b6, B:33:0x00be, B:34:0x00c5, B:36:0x00cd, B:37:0x00d4, B:39:0x00dc, B:40:0x00e3, B:42:0x00eb, B:43:0x00f2, B:45:0x00fa, B:46:0x0101, B:48:0x0109, B:49:0x0110, B:51:0x0118, B:52:0x011f, B:54:0x0127, B:55:0x012e, B:57:0x0136, B:58:0x013d), top: B:78:0x0019, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00eb A[Catch: all -> 0x0156, Exception -> 0x0158, TryCatch #1 {Exception -> 0x0158, blocks: (B:8:0x0019, B:10:0x0037, B:12:0x0052, B:13:0x0059, B:15:0x0061, B:17:0x006b, B:59:0x0140, B:61:0x0146, B:18:0x0077, B:19:0x007a, B:21:0x0082, B:22:0x0089, B:24:0x0091, B:25:0x0098, B:27:0x00a0, B:28:0x00a7, B:30:0x00af, B:31:0x00b6, B:33:0x00be, B:34:0x00c5, B:36:0x00cd, B:37:0x00d4, B:39:0x00dc, B:40:0x00e3, B:42:0x00eb, B:43:0x00f2, B:45:0x00fa, B:46:0x0101, B:48:0x0109, B:49:0x0110, B:51:0x0118, B:52:0x011f, B:54:0x0127, B:55:0x012e, B:57:0x0136, B:58:0x013d), top: B:78:0x0019, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00fa A[Catch: all -> 0x0156, Exception -> 0x0158, TryCatch #1 {Exception -> 0x0158, blocks: (B:8:0x0019, B:10:0x0037, B:12:0x0052, B:13:0x0059, B:15:0x0061, B:17:0x006b, B:59:0x0140, B:61:0x0146, B:18:0x0077, B:19:0x007a, B:21:0x0082, B:22:0x0089, B:24:0x0091, B:25:0x0098, B:27:0x00a0, B:28:0x00a7, B:30:0x00af, B:31:0x00b6, B:33:0x00be, B:34:0x00c5, B:36:0x00cd, B:37:0x00d4, B:39:0x00dc, B:40:0x00e3, B:42:0x00eb, B:43:0x00f2, B:45:0x00fa, B:46:0x0101, B:48:0x0109, B:49:0x0110, B:51:0x0118, B:52:0x011f, B:54:0x0127, B:55:0x012e, B:57:0x0136, B:58:0x013d), top: B:78:0x0019, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0109 A[Catch: all -> 0x0156, Exception -> 0x0158, TryCatch #1 {Exception -> 0x0158, blocks: (B:8:0x0019, B:10:0x0037, B:12:0x0052, B:13:0x0059, B:15:0x0061, B:17:0x006b, B:59:0x0140, B:61:0x0146, B:18:0x0077, B:19:0x007a, B:21:0x0082, B:22:0x0089, B:24:0x0091, B:25:0x0098, B:27:0x00a0, B:28:0x00a7, B:30:0x00af, B:31:0x00b6, B:33:0x00be, B:34:0x00c5, B:36:0x00cd, B:37:0x00d4, B:39:0x00dc, B:40:0x00e3, B:42:0x00eb, B:43:0x00f2, B:45:0x00fa, B:46:0x0101, B:48:0x0109, B:49:0x0110, B:51:0x0118, B:52:0x011f, B:54:0x0127, B:55:0x012e, B:57:0x0136, B:58:0x013d), top: B:78:0x0019, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0118 A[Catch: all -> 0x0156, Exception -> 0x0158, TryCatch #1 {Exception -> 0x0158, blocks: (B:8:0x0019, B:10:0x0037, B:12:0x0052, B:13:0x0059, B:15:0x0061, B:17:0x006b, B:59:0x0140, B:61:0x0146, B:18:0x0077, B:19:0x007a, B:21:0x0082, B:22:0x0089, B:24:0x0091, B:25:0x0098, B:27:0x00a0, B:28:0x00a7, B:30:0x00af, B:31:0x00b6, B:33:0x00be, B:34:0x00c5, B:36:0x00cd, B:37:0x00d4, B:39:0x00dc, B:40:0x00e3, B:42:0x00eb, B:43:0x00f2, B:45:0x00fa, B:46:0x0101, B:48:0x0109, B:49:0x0110, B:51:0x0118, B:52:0x011f, B:54:0x0127, B:55:0x012e, B:57:0x0136, B:58:0x013d), top: B:78:0x0019, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0127 A[Catch: all -> 0x0156, Exception -> 0x0158, TryCatch #1 {Exception -> 0x0158, blocks: (B:8:0x0019, B:10:0x0037, B:12:0x0052, B:13:0x0059, B:15:0x0061, B:17:0x006b, B:59:0x0140, B:61:0x0146, B:18:0x0077, B:19:0x007a, B:21:0x0082, B:22:0x0089, B:24:0x0091, B:25:0x0098, B:27:0x00a0, B:28:0x00a7, B:30:0x00af, B:31:0x00b6, B:33:0x00be, B:34:0x00c5, B:36:0x00cd, B:37:0x00d4, B:39:0x00dc, B:40:0x00e3, B:42:0x00eb, B:43:0x00f2, B:45:0x00fa, B:46:0x0101, B:48:0x0109, B:49:0x0110, B:51:0x0118, B:52:0x011f, B:54:0x0127, B:55:0x012e, B:57:0x0136, B:58:0x013d), top: B:78:0x0019, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0136 A[Catch: all -> 0x0156, Exception -> 0x0158, TryCatch #1 {Exception -> 0x0158, blocks: (B:8:0x0019, B:10:0x0037, B:12:0x0052, B:13:0x0059, B:15:0x0061, B:17:0x006b, B:59:0x0140, B:61:0x0146, B:18:0x0077, B:19:0x007a, B:21:0x0082, B:22:0x0089, B:24:0x0091, B:25:0x0098, B:27:0x00a0, B:28:0x00a7, B:30:0x00af, B:31:0x00b6, B:33:0x00be, B:34:0x00c5, B:36:0x00cd, B:37:0x00d4, B:39:0x00dc, B:40:0x00e3, B:42:0x00eb, B:43:0x00f2, B:45:0x00fa, B:46:0x0101, B:48:0x0109, B:49:0x0110, B:51:0x0118, B:52:0x011f, B:54:0x0127, B:55:0x012e, B:57:0x0136, B:58:0x013d), top: B:78:0x0019, outer: #0 }] */
    private List<TraceConfigDto> parserCDNConfig(Context context, NxResponse nxResponse) {
        int columnIndex;
        int columnIndex2;
        int columnIndex3;
        int columnIndex4;
        int columnIndex5;
        int columnIndex6;
        int columnIndex7;
        int columnIndex8;
        int columnIndex9;
        int columnIndex10;
        int columnIndex11;
        int columnIndex12;
        int columnIndex13;
        Cursor cursorRawQuery = null;
        if (nxResponse.getCode() != 200) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        File file = nxResponse.getFile();
        if (file != null) {
            try {
                try {
                    GzipUtils.getFileByBytes(GzipUtils.ungzip(GzipUtils.File2byte(file)), this.mGzPath, "usetrace.db");
                    cursorRawQuery = DBUtil.getInstance(this.mGzPath).rawQuery("select * from usertrace_config", null);
                    if (cursorRawQuery.moveToFirst()) {
                        do {
                            TraceConfigDto traceConfigDto = new TraceConfigDto();
                            traceConfigDto.setBusiness(this.mLogger.getLogConfig().getBusiness());
                            int columnIndex14 = cursorRawQuery.getColumnIndex("data1");
                            if (columnIndex14 != -1) {
                                traceConfigDto.setTraceId(cursorRawQuery.getLong(columnIndex14));
                            }
                            int columnIndex15 = cursorRawQuery.getColumnIndex("data2");
                            if (columnIndex15 != -1) {
                                String string = cursorRawQuery.getString(columnIndex15);
                                if (TextUtils.isEmpty(string)) {
                                    this.mLogger.e("UpMgr", "warning , platform download empty id");
                                } else {
                                    traceConfigDto.setEncryClientId(string);
                                    columnIndex = cursorRawQuery.getColumnIndex("data3");
                                    if (columnIndex != -1) {
                                        traceConfigDto.setForce(cursorRawQuery.getInt(columnIndex));
                                    }
                                    columnIndex2 = cursorRawQuery.getColumnIndex(CoreEntity.DATA4);
                                    if (columnIndex2 != -1) {
                                        traceConfigDto.setTracePkg(cursorRawQuery.getString(columnIndex2));
                                    }
                                    columnIndex3 = cursorRawQuery.getColumnIndex(CoreEntity.DATA5);
                                    if (columnIndex3 != -1) {
                                        traceConfigDto.setBeginTime(cursorRawQuery.getLong(columnIndex3));
                                    }
                                    columnIndex4 = cursorRawQuery.getColumnIndex(CoreEntity.DATA6);
                                    if (columnIndex4 != -1) {
                                        traceConfigDto.setEndTime(cursorRawQuery.getLong(columnIndex4));
                                    }
                                    columnIndex5 = cursorRawQuery.getColumnIndex(CoreEntity.DATA7);
                                    if (columnIndex5 != -1) {
                                        traceConfigDto.setExactMatchTracePkg(cursorRawQuery.getInt(columnIndex5));
                                    }
                                    columnIndex6 = cursorRawQuery.getColumnIndex(CoreEntity.DATA8);
                                    if (columnIndex6 != -1) {
                                        traceConfigDto.setLevel(cursorRawQuery.getInt(columnIndex6));
                                    }
                                    columnIndex7 = cursorRawQuery.getColumnIndex(CoreEntity.DATA9);
                                    if (columnIndex7 != -1) {
                                        traceConfigDto.setConsole(cursorRawQuery.getInt(columnIndex7));
                                    }
                                    columnIndex8 = cursorRawQuery.getColumnIndex(CoreEntity.DATA10);
                                    if (columnIndex8 != -1) {
                                        traceConfigDto.setMaxLogSize(cursorRawQuery.getInt(columnIndex8));
                                    }
                                    columnIndex9 = cursorRawQuery.getColumnIndex(CoreEntity.DATA11);
                                    if (columnIndex9 != -1) {
                                        traceConfigDto.setTimesPerDay(cursorRawQuery.getInt(columnIndex9));
                                    }
                                    columnIndex10 = cursorRawQuery.getColumnIndex(CoreEntity.DATA12);
                                    if (columnIndex10 != -1) {
                                        traceConfigDto.setQueueSize(cursorRawQuery.getInt(columnIndex10));
                                    }
                                    columnIndex11 = cursorRawQuery.getColumnIndex(CoreEntity.DATA13);
                                    if (columnIndex11 != -1) {
                                        traceConfigDto.setSample(cursorRawQuery.getInt(columnIndex11));
                                    }
                                    columnIndex12 = cursorRawQuery.getColumnIndex(CoreEntity.DATA14);
                                    if (columnIndex12 != -1) {
                                        traceConfigDto.setKeyWords(cursorRawQuery.getString(columnIndex12));
                                    }
                                    columnIndex13 = cursorRawQuery.getColumnIndex(CoreEntity.DATA15);
                                    if (columnIndex13 != -1) {
                                        traceConfigDto.setCommons(cursorRawQuery.getString(columnIndex13));
                                    }
                                    arrayList.add(traceConfigDto);
                                }
                            } else {
                                columnIndex = cursorRawQuery.getColumnIndex("data3");
                                if (columnIndex != -1) {
                                    traceConfigDto.setForce(cursorRawQuery.getInt(columnIndex));
                                }
                                columnIndex2 = cursorRawQuery.getColumnIndex(CoreEntity.DATA4);
                                if (columnIndex2 != -1) {
                                    traceConfigDto.setTracePkg(cursorRawQuery.getString(columnIndex2));
                                }
                                columnIndex3 = cursorRawQuery.getColumnIndex(CoreEntity.DATA5);
                                if (columnIndex3 != -1) {
                                    traceConfigDto.setBeginTime(cursorRawQuery.getLong(columnIndex3));
                                }
                                columnIndex4 = cursorRawQuery.getColumnIndex(CoreEntity.DATA6);
                                if (columnIndex4 != -1) {
                                    traceConfigDto.setEndTime(cursorRawQuery.getLong(columnIndex4));
                                }
                                columnIndex5 = cursorRawQuery.getColumnIndex(CoreEntity.DATA7);
                                if (columnIndex5 != -1) {
                                    traceConfigDto.setExactMatchTracePkg(cursorRawQuery.getInt(columnIndex5));
                                }
                                columnIndex6 = cursorRawQuery.getColumnIndex(CoreEntity.DATA8);
                                if (columnIndex6 != -1) {
                                    traceConfigDto.setLevel(cursorRawQuery.getInt(columnIndex6));
                                }
                                columnIndex7 = cursorRawQuery.getColumnIndex(CoreEntity.DATA9);
                                if (columnIndex7 != -1) {
                                    traceConfigDto.setConsole(cursorRawQuery.getInt(columnIndex7));
                                }
                                columnIndex8 = cursorRawQuery.getColumnIndex(CoreEntity.DATA10);
                                if (columnIndex8 != -1) {
                                    traceConfigDto.setMaxLogSize(cursorRawQuery.getInt(columnIndex8));
                                }
                                columnIndex9 = cursorRawQuery.getColumnIndex(CoreEntity.DATA11);
                                if (columnIndex9 != -1) {
                                    traceConfigDto.setTimesPerDay(cursorRawQuery.getInt(columnIndex9));
                                }
                                columnIndex10 = cursorRawQuery.getColumnIndex(CoreEntity.DATA12);
                                if (columnIndex10 != -1) {
                                    traceConfigDto.setQueueSize(cursorRawQuery.getInt(columnIndex10));
                                }
                                columnIndex11 = cursorRawQuery.getColumnIndex(CoreEntity.DATA13);
                                if (columnIndex11 != -1) {
                                    traceConfigDto.setSample(cursorRawQuery.getInt(columnIndex11));
                                }
                                columnIndex12 = cursorRawQuery.getColumnIndex(CoreEntity.DATA14);
                                if (columnIndex12 != -1) {
                                    traceConfigDto.setKeyWords(cursorRawQuery.getString(columnIndex12));
                                }
                                columnIndex13 = cursorRawQuery.getColumnIndex(CoreEntity.DATA15);
                                if (columnIndex13 != -1) {
                                    traceConfigDto.setCommons(cursorRawQuery.getString(columnIndex13));
                                }
                                arrayList.add(traceConfigDto);
                            }
                        } while (cursorRawQuery.moveToNext());
                        cursorRawQuery.close();
                    }
                    if (!cursorRawQuery.isClosed()) {
                        cursorRawQuery.close();
                    }
                    DBUtil.closeDatabase();
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            } catch (Throwable th) {
                if (cursorRawQuery != null && !cursorRawQuery.isClosed()) {
                    cursorRawQuery.close();
                }
                DBUtil.closeDatabase();
                throw th;
            }
        }
        return arrayList;
    }

    private void reportErrorCode(ReportBody reportBody, int i, String str) {
        if (this.mNxHttpClient == null) {
            this.mLogger.e(REPORT_TAG, "upload code error : HttpDelegate is null");
            return;
        }
        if (reportBody == null) {
            this.mLogger.e(REPORT_TAG, "upload code error : UploadBody is null");
            return;
        }
        try {
            String packageName = TextUtils.isEmpty(this.mSettings.getTracePkg()) ? AppUtil.getPackageName(AppUtil.getAppContext()) : this.mSettings.getTracePkg();
            if (!verifyId(this.mSettings)) {
                return;
            }
            this.mPrevImei = getEncryptedImei(makeImeiFromSettings(this.mSettings));
            String encryptedOpenId = getEncryptedOpenId(makeOpenId(this.mSettings.getOpenIdProvider()));
            this.mPrevOpenId = encryptedOpenId;
            try {
                String strMakeReportUrl = UrlProvider.makeReportUrl(reportBody.business, reportBody.specificId, "", i, str, reportBody.subType, packageName, reportBody.MDPName, reportBody.reportReason, reportBody.endTime, this.zipLogPath, reportBody.MDPValue, this.mSimpleLog, this.mSettings, this.mPrevImei, encryptedOpenId);
                if (this.mLogger.isDebug()) {
                    this.mLogger.d("UpMgr", "reportUpload Error Code: " + strMakeReportUrl);
                }
                NxRequest nxRequest = new NxRequest();
                nxRequest.setUrl(strMakeReportUrl);
                this.mNxHttpClient.sendRequest(nxRequest);
                return;
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
        }
        this.mLogger.e(REPORT_TAG, "upload code error:" + e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportUploadFailed(ReportBody reportBody, int i, String str) {
        FileZipper.deleteZipFile(this.zipLogPath);
        if (this.mCount >= 3) {
            this.mSimpleLog.w(REPORT_TAG, "report upload failed");
            this.mCount = 0;
            ReportUploaderListener reportUploaderListener = this.mReportUploaderListener;
            if (reportUploaderListener != null) {
                reportUploaderListener.onReporterFailed("run out of retry:" + str, reportBody);
            }
            reportErrorCode(reportBody, i, str);
            return;
        }
        TimerCheckParam timerCheckParam = this.mSettings.getTimerCheckParam();
        if (timerCheckParam == null || !timerCheckParam.isEnableDelayRetry()) {
            int i2 = this.mCount + 1;
            this.mCount = i2;
            sendMessageForReport(reportBody, i2 * 2000);
        } else {
            long delayRetrySecond = timerCheckParam.getDelayRetrySecond() * 1000;
            int i3 = this.mCount + 1;
            this.mCount = i3;
            sendMessageForReport(reportBody, ((int) delayRetrySecond) * i3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportUploadFile(final ReportBody reportBody) {
        if (reportBody.useWifi && !BaseInfoUtil.isWifiStatusConnect()) {
            this.mSimpleLog.w(REPORT_TAG, "upload task need wifi connect");
            reportUploadFailed(reportBody, UploadCode.NEED_WIFI, "upload task need wifi connect");
            return;
        }
        try {
            ILogAppender iLogAppender = this.mAppender;
            if (iLogAppender != null) {
                iLogAppender.flush(new LoganModel.OnActionCompleteListener() { // from class: com.heytap.log.uploader.UploadManager.2
                    @Override // com.heytap.log.core.LoganModel.OnActionCompleteListener
                    public void onComplete() {
                        try {
                            Thread.sleep(500L);
                            ReportBody reportBody2 = reportBody;
                            FileZipper.makeUploadFiles(reportBody2.startTime, reportBody2.endTime, UploadManager.this.mSettings.getPath(), UploadManager.this.mSettings.getBusiness(), UploadManager.this.zipLogPath, reportBody.specificId, UploadManager.this.mDynConfigManager.getZipMaxFile(), new FileZipper.OnZipFileListener() { // from class: com.heytap.log.uploader.UploadManager.2.1
                                @Override // com.heytap.log.uploader.FileZipper.OnZipFileListener
                                public void onZipError(int i, String str) {
                                    long j2 = Long.parseLong(reportBody.specificId);
                                    AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                    UploadManager.this.mLogger.reportStatistic(UploadManager.this.mLogger.getContext(), Constants.REPORT_TASK, new TaskStatisicsBean(1, j2, reportBody.business, UploadManager.this.mLogger.getLogConfig().getTracePkg(), i, str, 0L));
                                    AnonymousClass2 anonymousClass3 = AnonymousClass2.this;
                                    UploadManager.this.reportUploadFailed(reportBody, i, str);
                                }

                                @Override // com.heytap.log.uploader.FileZipper.OnZipFileListener
                                public void onZipOk(int i, File file) {
                                    AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                    UploadManager.this.doReportUpload(reportBody, i, file);
                                }
                            });
                        } catch (InterruptedException e2) {
                            Thread.currentThread().interrupt();
                            throw new RuntimeException(e2);
                        }
                    }
                });
            }
        } catch (Exception e2) {
            reportUploadFailed(reportBody, -1, e2.toString());
        }
    }

    private void reportUploadSuccess(ResponseWrapper responseWrapper) {
        this.mCount = 0;
        FileZipper.deleteZipFile(this.zipLogPath);
        ReportUploaderListener reportUploaderListener = this.mReportUploaderListener;
        if (reportUploaderListener != null) {
            reportUploaderListener.onReporterSuccess(responseWrapper);
        }
    }

    private void sendStatusReportMessage(String str) {
        if (this.isUploadThreadLive) {
            StatusReportBody statusReportBody = new StatusReportBody(str, 1, "new config save to database", "");
            Message messageObtain = Message.obtain();
            messageObtain.obj = statusReportBody;
            this.mHandler.sendMessage(messageObtain);
        }
    }

    private void uploadEnd() {
        FileZipper.deleteZipFile(this.zipLogPath);
        String logPathToZip = this.mDynConfigManager.getLogPathToZip(this.mSettings);
        if (TextUtils.isEmpty(logPathToZip) || !logPathToZip.contains("kws")) {
            return;
        }
        FileZipper.deleteZipFile(logPathToZip);
    }

    private void uploadErrorCode(UploadBody uploadBody, int i, String str) {
        if (this.mNxHttpClient == null) {
            this.mLogger.e(UPLOAD_TAG, "upload code error : HttpDelegate is null");
            return;
        }
        if (uploadBody == null) {
            this.mLogger.e(UPLOAD_TAG, "upload code error : UploadBody is null");
            return;
        }
        try {
            String packageName = TextUtils.isEmpty(this.mSettings.getTracePkg()) ? AppUtil.getPackageName(AppUtil.getAppContext()) : this.mSettings.getTracePkg();
            if (verifyId(this.mSettings)) {
                this.mPrevImei = getEncryptedImei(makeImeiFromSettings(this.mSettings));
                String encryptedOpenId = getEncryptedOpenId(makeOpenId(this.mSettings.getOpenIdProvider()));
                this.mPrevOpenId = encryptedOpenId;
                String strMakeUploadUrl = UrlProvider.makeUploadUrl(uploadBody.business, uploadBody.traceId, "", i, str, uploadBody.subType, packageName, this.mSettings, this.mPrevImei, encryptedOpenId);
                if (this.mLogger.isDebug()) {
                    this.mLogger.d("NearX-Log", "upload Error Code: " + strMakeUploadUrl);
                }
                NxRequest nxRequest = new NxRequest();
                nxRequest.setUrl(strMakeUploadUrl);
                NxResponse nxResponseSendRequest = this.mNxHttpClient.sendRequest(nxRequest);
                if (!this.mLogger.isDebug() || nxResponseSendRequest == null) {
                    return;
                }
                this.mLogger.d("NearX-Log", "upload Error resp Code: " + nxResponseSendRequest.getCode());
            }
        } catch (Exception e2) {
            this.mLogger.e(UPLOAD_TAG, "upload code error:" + e2.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uploadMultiFailed(UploadMultiBody uploadMultiBody, int i, String str) {
        FileZipper.deleteZipFile(this.zipLogPath);
        if (i == -101) {
            this.mLogger.getMultiConfMgr().markPushTaskFinish(Long.parseLong(uploadMultiBody.traceId));
        }
        if (this.mCount < 3 && i != -101) {
            TimerCheckParam timerCheckParam = this.mSettings.getTimerCheckParam();
            if (timerCheckParam == null || !timerCheckParam.isEnableDelayRetry()) {
                int i2 = this.mCount + 1;
                this.mCount = i2;
                sendMessageForMultiUpload(uploadMultiBody, ((long) i2) * 2000);
                return;
            } else {
                long delayRetrySecond = timerCheckParam.getDelayRetrySecond() * 1000;
                int i3 = this.mCount + 1;
                this.mCount = i3;
                if (-110 == i) {
                    delayRetrySecond *= 5;
                }
                sendMessageForMultiUpload(uploadMultiBody, delayRetrySecond * ((long) i3));
                return;
            }
        }
        this.mLogger.w(UPLOAD_TAG, "upload failed");
        this.mCount = 0;
        UploaderListener uploaderListener = this.mUploaderListener;
        if (uploaderListener != null) {
            uploaderListener.onUploaderFailed("run out of retry:" + str);
        }
        uploadErrorCode(uploadMultiBody, i, str);
        TaskStatisicsBean taskStatisicsBean = new TaskStatisicsBean(Long.parseLong(uploadMultiBody.traceId), uploadMultiBody.business, uploadMultiBody.tracePkg, i, str, 0L, i);
        Logger logger = this.mLogger;
        logger.reportStatistic(logger.getContext(), Constants.REPORT_TASK, taskStatisicsBean);
        if (-110 == i) {
            this.mLogger.getMultiConfMgr().markPushTaskFinish(Long.parseLong(uploadMultiBody.traceId));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uploadMultiFile(final UploadMultiBody uploadMultiBody) {
        this.mLogger.debug("UpMgr", "uploadMultiFile body:" + uploadMultiBody);
        this.mLogger.debug("UpMgr", "isWifiStatusConnect:" + BaseInfoUtil.isWifiStatusConnect());
        if (uploadMultiBody.useWifi && !BaseInfoUtil.isWifiStatusConnect()) {
            this.mLogger.w(UPLOAD_TAG, "upload task need wifi connect");
            uploadMultiFailed(uploadMultiBody, UploadCode.NEED_WIFI, "upload task need wifi connect");
            return;
        }
        try {
            ILogAppender iLogAppender = this.mAppender;
            if (iLogAppender != null) {
                iLogAppender.flushSync();
            }
            Settings.IFlushCallback flushCallback = this.mSettings.getFlushCallback();
            if (flushCallback != null) {
                flushCallback.flushAllProcess();
            }
            Thread.sleep(500L);
            boolean zIsValidPushTaskTraceId = this.mLogger.getMultiConfMgr().isValidPushTaskTraceId(Long.parseLong(uploadMultiBody.traceId));
            this.mLogger.debug("UpMgr", "isValid:" + zIsValidPushTaskTraceId);
            if (!zIsValidPushTaskTraceId) {
                UploaderListener uploaderListener = this.mUploaderListener;
                if (uploaderListener != null) {
                    uploaderListener.onUploaderFailed("traceId " + uploadMultiBody.traceId + " have not found !");
                    return;
                }
                return;
            }
            if (this.mLogger.isDebug()) {
                this.mLogger.d("UpMgr", "makeUploadFiles body.startTime : " + uploadMultiBody.startTime);
                this.mLogger.d("UpMgr", "makeUploadFiles body.endTime : " + uploadMultiBody.endTime);
            }
            TraceConfigDto traceConfigDtoFindDtoByTraceId = this.mLogger.getMultiConfMgr().findDtoByTraceId(Long.parseLong(uploadMultiBody.traceId));
            if (traceConfigDtoFindDtoByTraceId == null) {
                this.mLogger.d("UpMgr", "makeUploadFiles bodyDto is null ");
                UploaderListener uploaderListener2 = this.mUploaderListener;
                if (uploaderListener2 != null) {
                    uploaderListener2.onUploaderFailed("traceId " + uploadMultiBody.traceId + " have not found !");
                    return;
                }
                return;
            }
            uploadMultiBody.tracePkg = uploadMultiBody.tracePkg;
            long maxLogSize = ((long) traceConfigDtoFindDtoByTraceId.getMaxLogSize()) * 1048576;
            if (maxLogSize < 1048576) {
                maxLogSize = 10485760;
            }
            if (this.mLogger.isDebug()) {
                this.mLogger.d("UpMgr", "makeUploadFiles zipMax : " + maxLogSize);
                this.mLogger.d("UpMgr", "makeUploadFiles log file direction : " + this.mDynConfigManager.getLogPathToZip(this.mSettings, traceConfigDtoFindDtoByTraceId));
                this.mLogger.d("UpMgr", "makeUploadFiles zipLogPath file direction : " + this.zipLogPath);
            }
            FileZipper.makeUploadFiles(this.mSettings.getBusiness(), uploadMultiBody.startTime, uploadMultiBody.endTime, this.mDynConfigManager.getLogPathToZip(this.mSettings, traceConfigDtoFindDtoByTraceId), this.zipLogPath, uploadMultiBody.traceId, maxLogSize, new FileZipper.OnZipFileListener() { // from class: com.heytap.log.uploader.UploadManager.1
                @Override // com.heytap.log.uploader.FileZipper.OnZipFileListener
                public void onZipError(int i, String str) {
                    UploadManager.this.uploadMultiFailed(uploadMultiBody, i, str);
                }

                @Override // com.heytap.log.uploader.FileZipper.OnZipFileListener
                public void onZipOk(int i, File file) {
                    if (UploadManager.this.mLogger.isDebug()) {
                        UploadManager.this.mLogger.d("UpMgr", "FileZipper file length : " + file.length());
                    }
                    UploadManager.this.doMultiUpload(uploadMultiBody, i, file);
                }
            });
        } catch (Exception e2) {
            this.mLogger.e("UpMgr", e2.toString());
            uploadMultiFailed(uploadMultiBody, -1, e2.toString());
        }
    }

    private void uploadSuccess() {
        this.mCount = 0;
        FileZipper.deleteZipFile(this.zipLogPath);
        String logPathToZip = this.mDynConfigManager.getLogPathToZip(this.mSettings);
        if (!TextUtils.isEmpty(logPathToZip) && logPathToZip.contains("kws")) {
            FileZipper.deleteZipFile(logPathToZip);
        }
        UploaderListener uploaderListener = this.mUploaderListener;
        if (uploaderListener != null) {
            uploaderListener.onUploaderSuccess();
        }
    }

    private boolean verifyId(Settings settings) {
        if (settings.getCustomIdProvider() != null && !TextUtils.isEmpty(settings.getCustomIdProvider().getCustomID())) {
            return true;
        }
        if (settings.getImeiProvider() != null && !TextUtils.isEmpty(settings.getImeiProvider().getImei())) {
            return true;
        }
        if (settings.getOpenIdProvider() == null) {
            return false;
        }
        Settings.IOpenIdProvider openIdProvider = settings.getOpenIdProvider();
        return (TextUtils.isEmpty(openIdProvider.getDuid()) && TextUtils.isEmpty(openIdProvider.getGuid()) && TextUtils.isEmpty(openIdProvider.getOuid())) ? false : true;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x016a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void effortConfig(String str) {
        if (TextUtils.isEmpty(str) || !str.contains(".gz")) {
            return;
        }
        File file = new File(str);
        if (file.exists()) {
            try {
                GzipUtils.getFileByBytes(GzipUtils.ungzip(GzipUtils.File2byte(file)), this.mGzPath, "ccusetrace.db");
                Cursor cursorRawQuery = DBUtil.getInstance(this.mGzPath).rawQuery("select * from usertrace_config", null);
                TraceConfigDto traceConfigDto = new TraceConfigDto();
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        traceConfigDto.setBusiness(this.mLogger.getLogConfig().getBusiness());
                        int columnIndex = cursorRawQuery.getColumnIndex("data1");
                        if (columnIndex != -1) {
                            traceConfigDto.setTraceId(cursorRawQuery.getLong(columnIndex));
                        }
                        int columnIndex2 = cursorRawQuery.getColumnIndex("data2");
                        if (columnIndex2 != -1) {
                            traceConfigDto.setEncryClientId(cursorRawQuery.getString(columnIndex2));
                        }
                        int columnIndex3 = cursorRawQuery.getColumnIndex("data3");
                        if (columnIndex3 != -1) {
                            traceConfigDto.setForce(cursorRawQuery.getInt(columnIndex3));
                        }
                        int columnIndex4 = cursorRawQuery.getColumnIndex(CoreEntity.DATA4);
                        if (columnIndex4 != -1) {
                            traceConfigDto.setTracePkg(cursorRawQuery.getString(columnIndex4));
                        }
                        int columnIndex5 = cursorRawQuery.getColumnIndex(CoreEntity.DATA5);
                        if (columnIndex5 != -1) {
                            traceConfigDto.setBeginTime(cursorRawQuery.getLong(columnIndex5));
                        }
                        int columnIndex6 = cursorRawQuery.getColumnIndex(CoreEntity.DATA6);
                        if (columnIndex6 != -1) {
                            traceConfigDto.setEndTime(cursorRawQuery.getLong(columnIndex6));
                        }
                        int columnIndex7 = cursorRawQuery.getColumnIndex(CoreEntity.DATA7);
                        if (columnIndex7 != -1) {
                            traceConfigDto.setExactMatchTracePkg(cursorRawQuery.getInt(columnIndex7));
                        }
                        int columnIndex8 = cursorRawQuery.getColumnIndex(CoreEntity.DATA8);
                        if (columnIndex8 != -1) {
                            traceConfigDto.setLevel(cursorRawQuery.getInt(columnIndex8));
                        }
                        int columnIndex9 = cursorRawQuery.getColumnIndex(CoreEntity.DATA9);
                        if (columnIndex9 != -1) {
                            traceConfigDto.setConsole(cursorRawQuery.getInt(columnIndex9));
                        }
                        int columnIndex10 = cursorRawQuery.getColumnIndex(CoreEntity.DATA10);
                        if (columnIndex10 != -1) {
                            traceConfigDto.setMaxLogSize(cursorRawQuery.getInt(columnIndex10));
                        }
                        int columnIndex11 = cursorRawQuery.getColumnIndex(CoreEntity.DATA11);
                        if (columnIndex11 != -1) {
                            traceConfigDto.setTimesPerDay(cursorRawQuery.getInt(columnIndex11));
                        }
                        int columnIndex12 = cursorRawQuery.getColumnIndex(CoreEntity.DATA12);
                        if (columnIndex12 != -1) {
                            traceConfigDto.setQueueSize(cursorRawQuery.getInt(columnIndex12));
                        }
                        int columnIndex13 = cursorRawQuery.getColumnIndex(CoreEntity.DATA13);
                        if (columnIndex13 != -1) {
                            traceConfigDto.setSample(cursorRawQuery.getInt(columnIndex13));
                        }
                        int columnIndex14 = cursorRawQuery.getColumnIndex(CoreEntity.DATA14);
                        if (columnIndex14 != -1) {
                            traceConfigDto.setKeyWords(cursorRawQuery.getString(columnIndex14));
                        }
                        int columnIndex15 = cursorRawQuery.getColumnIndex(CoreEntity.DATA15);
                        if (columnIndex15 != -1) {
                            traceConfigDto.setCommons(cursorRawQuery.getString(columnIndex15));
                        }
                    } while (cursorRawQuery.moveToNext());
                    cursorRawQuery.close();
                }
                if (this.mLogger.isDebug()) {
                    this.mLogger.d("UpMgr", "config from cloud config configDto info : " + traceConfigDto.toString());
                }
                DynConfigManager dynConfigManager = this.mDynConfigManager;
                if (dynConfigManager != null) {
                    dynConfigManager.setConfigDto(traceConfigDto);
                }
                DBUtil.closeDatabase();
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public ReportUploaderListener getReporterListener() {
        return this.mReportUploaderListener;
    }

    public UploaderListener getUploaderListener() {
        return this.mUploaderListener;
    }

    public void quitThread() {
        HandlerThread handlerThread = this.mUploadThread;
        if (handlerThread != null) {
            this.isUploadThreadLive = !handlerThread.quitSafely();
        }
    }

    public void sendMessageForMultiUpload(UploadMultiBody uploadMultiBody, long j2) {
        this.mLogger.d("UpMgr", "sendMessageForMultiUpload:" + this.isUploadThreadLive);
        if (this.isUploadThreadLive) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = uploadMultiBody;
            this.mHandler.sendMessageDelayed(messageObtain, j2);
        }
    }

    public void sendMessageForMultiUploadCheckerForCdn(String str, UploadCheckerForCdnListener uploadCheckerForCdnListener) {
        if (this.isUploadThreadLive) {
            if (this.mLogger.getKitStrategyHelper() != null && this.mLogger.getKitStrategyHelper().isCanUseKitMode()) {
                this.mLogger.d("UpMgr", "kit 模式不发起cdn请求");
                return;
            }
            Message messageObtain = Message.obtain();
            UploadMultiCheckForCdnBody uploadMultiCheckForCdnBody = new UploadMultiCheckForCdnBody(str);
            uploadMultiCheckForCdnBody.setUploadCheckerForCdnListener(uploadCheckerForCdnListener);
            messageObtain.obj = uploadMultiCheckForCdnBody;
            Discrete discrete = this.mDiscrete;
            if (discrete == null || !discrete.needDiscrete(this.mHandler, messageObtain)) {
                this.mLogger.d("UpMgr", "不需要离散，走原有默认逻辑");
                if (TextUtils.isEmpty(this.mPrevImei) && TextUtils.isEmpty(this.mPrevOpenId)) {
                    this.mHandler.sendMessageDelayed(messageObtain, 2000L);
                } else {
                    this.mHandler.sendMessage(messageObtain);
                }
            }
        }
    }

    public void sendMessageForReport(ReportBody reportBody, int i) {
        if (this.isUploadThreadLive) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = reportBody;
            this.mHandler.sendMessageDelayed(messageObtain, i);
        }
    }

    public void sendMessageWhetherForUpload() {
        if (this.isUploadThreadLive) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis > this.prevCheckUploadTime + 15000) {
                this.prevCheckUploadTime = jCurrentTimeMillis;
                Message messageObtain = Message.obtain();
                messageObtain.obj = new CheckWhetherUploadBody();
                this.mHandler.sendMessageDelayed(messageObtain, 0L);
            }
        }
    }

    public void sendSyncKitChangeMessage(long j2) {
        if (this.isUploadThreadLive) {
            SyncKitChangeBody syncKitChangeBody = new SyncKitChangeBody();
            Message messageObtain = Message.obtain();
            messageObtain.obj = syncKitChangeBody;
            this.mHandler.sendMessageDelayed(messageObtain, j2);
        }
    }

    public void setIAppender(ILogAppender iLogAppender) {
        if (iLogAppender != null) {
            this.mAppender = iLogAppender;
        }
    }

    public void setReporterListener(ReportUploaderListener reportUploaderListener) {
        this.mReportUploaderListener = reportUploaderListener;
    }

    public void setUploaderListener(UploaderListener uploaderListener) {
        this.mUploaderListener = uploaderListener;
    }

    public class UploadHandler extends Handler {
        Settings settings;

        public UploadHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.obj == null || UploadManager.this.mLogger == null) {
                return;
            }
            Settings settings = this.settings;
            if (settings == null || settings.getiNetAvailable() == null || this.settings.getiNetAvailable().isNetworkAvailable()) {
                Object obj = message.obj;
                if (obj instanceof ReportBody) {
                    UploadManager.this.reportUploadFile((ReportBody) obj);
                    return;
                }
                if (obj instanceof UploadMultiBody) {
                    UploadManager.this.mLogger.debug("UpMgr", "本地的打捞任务和opush任务");
                    UploadMultiBody uploadMultiBody = (UploadMultiBody) message.obj;
                    UploadManager.this.mLogger.debug("UpMgr", "UploadMultiBody:" + uploadMultiBody + " MultiConfMgr:" + UploadManager.this.mLogger.getMultiConfMgr());
                    if (uploadMultiBody != null && !TextUtils.isEmpty(uploadMultiBody.traceId) && UploadManager.this.mLogger.getMultiConfMgr() != null) {
                        long j2 = Long.parseLong(uploadMultiBody.traceId);
                        MultiConfigManager multiConfMgr = UploadManager.this.mLogger.getMultiConfMgr();
                        if (multiConfMgr != null) {
                            UploadManager.this.mLogger.debug("UpMgr", "isLocalTaskTraceId:" + multiConfMgr.isLocalTaskTraceId(j2));
                            if (multiConfMgr.isLocalTaskTraceId(j2)) {
                                UploadManager.this.uploadMultiFile(uploadMultiBody);
                                return;
                            }
                        }
                    }
                } else if (obj instanceof CheckWhetherUploadBody) {
                    UploadManager.this.mLogger.d("UpMgr", "CheckWhetherUploadBody Mgr:" + UploadManager.this.mLogger.getMultiConfMgr());
                    if (UploadManager.this.mLogger.getMultiConfMgr() != null) {
                        UploadManager.this.mLogger.getMultiConfMgr().checkAllPushTask();
                    }
                }
                if (UploadManager.this.mLogger.getKitStrategyHelper() != null && UploadManager.this.mLogger.getKitStrategyHelper().isCanUseKitMode()) {
                    Object obj2 = message.obj;
                    if (obj2 instanceof SyncKitBody) {
                        UploadManager.this.mLogger.getKitStrategyHelper().syncKitConfigs(UploadManager.this.mLogger.getContext());
                        return;
                    }
                    if (obj2 instanceof SyncKitChangeBody) {
                        if (UploadManager.this.mLogger.getMultiConfMgr() != null && UploadManager.this.mLogger.getDynConfigManager() != null) {
                            boolean zUpdateMemoryCache = UploadManager.this.mLogger.getMultiConfMgr().updateMemoryCache();
                            UploadManager.this.mLogger.debug("UpMgr", "配置是否有变更 : " + zUpdateMemoryCache);
                            UploadManager.this.mLogger.getMultiConfMgr().findCurrentTraceDto(0L);
                        }
                        UploadManager.this.mLogger.debug("UpMgr", "检查配置是否有更新 !");
                        UploadManager.this.sendSyncKitChangeMessage(60000L);
                        return;
                    }
                    return;
                }
                Object obj3 = message.obj;
                if (obj3 instanceof UploadMultiBody) {
                    UploadManager.this.uploadMultiFile((UploadMultiBody) obj3);
                    return;
                }
                if (obj3 instanceof UploadMultiCheckForCdnBody) {
                    if (UploadManager.this.mDiscrete != null) {
                        UploadManager.this.mDiscrete.finishDiscrete();
                    }
                    if (UploadManager.this.mLogger.getDynConfigManager() != null && UploadManager.this.mLogger.getDynConfigManager().checkCheckTimes()) {
                        UploadMultiCheckForCdnBody uploadMultiCheckForCdnBody = (UploadMultiCheckForCdnBody) message.obj;
                        UploadManager.this.doMultiUploadCheckerForCdn(uploadMultiCheckForCdnBody.business, uploadMultiCheckForCdnBody.uploadCheckerForCdnListener, AppUtil.getAppContext());
                        return;
                    }
                    UploadManager.this.mLogger.d("UpMgr", "check times have already used , no time left !");
                    UploadManager.this.mLogger.d("UpMgr", "start check all tasks directly !");
                    if (UploadManager.this.mLogger.getMultiConfMgr() != null) {
                        UploadManager.this.mLogger.getMultiConfMgr().checkAllPushTask();
                        return;
                    }
                    return;
                }
                if (obj3 instanceof StatusReportBody) {
                    UploadManager.this.doStatusReportForCdn((StatusReportBody) obj3);
                    return;
                }
                if (obj3 instanceof CheckWhetherUploadBody) {
                    UploadManager.this.mLogger.d("UpMgr", "CheckWhetherUploadBody mCheckUploadTime：" + UploadManager.this.mCheckUploadTime + " Mgr:" + UploadManager.this.mLogger.getMultiConfMgr());
                    if (UploadManager.this.mLogger.getMultiConfMgr() == null || UploadManager.access$1308(UploadManager.this) <= 3) {
                        return;
                    }
                    UploadManager.this.mCheckUploadTime = 0;
                    UploadManager.this.mLogger.getMultiConfMgr().updateMemoryCache();
                    UploadManager.this.mLogger.getMultiConfMgr().findCurrentTraceDto(0L);
                }
            }
        }

        public UploadHandler(Looper looper, Settings settings) {
            super(looper);
            this.settings = settings;
        }
    }

    public static class UploadBody {
        String business;
        long endTime;
        long startTime;
        String subType;
        String traceId;
        public String tracePkg;
        UploadCheckerListener uploadCheckerListener;
        boolean useWifi;

        public UploadBody(String str, long j2, long j3, boolean z, String str2, String str3) {
            this.business = str;
            this.startTime = j2;
            this.endTime = j3;
            this.useWifi = z;
            this.traceId = str2;
            this.subType = str3;
        }

        public UploadBody(String str, long j2, long j3, boolean z, String str2, String str3, UploadCheckerListener uploadCheckerListener) {
            this.business = str;
            this.startTime = j2;
            this.endTime = j3;
            this.useWifi = z;
            this.traceId = str2;
            this.subType = str3;
            this.uploadCheckerListener = uploadCheckerListener;
        }
    }
}
