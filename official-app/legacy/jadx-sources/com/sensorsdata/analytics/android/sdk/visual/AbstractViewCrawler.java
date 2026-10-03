package com.sensorsdata.analytics.android.sdk.visual;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.oplus.aiunit.vision.n04;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.SAConfigOptions;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.util.AppInfoUtils;
import com.sensorsdata.analytics.android.sdk.util.AppStateTools;
import com.sensorsdata.analytics.android.sdk.util.Base64Coder;
import com.sensorsdata.analytics.android.sdk.visual.model.SnapInfo;
import com.sensorsdata.analytics.android.sdk.visual.property.VisualPropertiesManager;
import com.sensorsdata.analytics.android.sdk.visual.snap.EditProtocol;
import com.sensorsdata.analytics.android.sdk.visual.snap.EditState;
import com.sensorsdata.analytics.android.sdk.visual.snap.ResourceReader;
import com.sensorsdata.analytics.android.sdk.visual.utils.AlertMessageUtils;
import com.sensorsdata.analytics.android.sdk.visual.utils.FlutterUtils;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLDecoder;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractViewCrawler implements VTrack {
    private static final int MESSAGE_SEND_STATE_FOR_EDITING = 1;
    private static final String TAG = "SA.AbstractViewCrawler";
    public static final String TYPE_HEAT_MAP = "heat_map";
    public static final String TYPE_VISUAL = "visual";
    private String mAppVersion;
    private final Context mContext;
    private final EditState mEditState;
    private String mFeatureCode;
    private final LifecycleCallbacks mLifecycleCallbacks;
    private final Handler mMainThreadHandler;
    private final ViewCrawlerHandler mMessageThreadHandler;
    private String mPostUrl;
    private boolean mServiceRunning = false;
    private String mType;

    public class LifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            AbstractViewCrawler.this.mEditState.remove(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            AbstractViewCrawler.this.mEditState.add(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        private LifecycleCallbacks() {
        }
    }

    public class ViewCrawlerHandler extends Handler {
        private String mAppId;
        private StringBuilder mLastImageHash;
        private final EditProtocol mProtocol;
        private final String mSDKVersion;
        private ViewSnapshot mSnapshot;
        private boolean mUseGzip;

        private void onSnapFinished(SnapInfo snapInfo) {
            if (snapInfo != null && !NodesProcess.getInstance().getWebNodesManager().hasThirdView()) {
                NodesProcess.getInstance().getWebNodesManager().clear();
            }
            if (snapInfo == null || NodesProcess.getInstance().getFlutterNodesManager().hasThirdView()) {
                return;
            }
            NodesProcess.getInstance().getFlutterNodesManager().clear();
        }

        /* JADX WARN: Code duplicated, block: B:126:0x01c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:128:0x0186 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:134:0x01d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:136:0x0190 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:140:0x01bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:142:0x017c A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:144:0x01da A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:162:? A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:96:0x019a A[Catch: Exception -> 0x015a, TRY_ENTER, TRY_LEAVE, TryCatch #16 {Exception -> 0x015a, blocks: (B:61:0x0156, B:96:0x019a), top: B:149:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:98:0x019f  */
        /* JADX WARN: Code duplicated, block: B:99:0x01b3  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v20 */
        /* JADX WARN: Type inference failed for: r1v21 */
        /* JADX WARN: Type inference failed for: r1v23 */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v5 */
        private void postSnapshot(ByteArrayOutputStream byteArrayOutputStream) throws Throwable {
            InputStream inputStream;
            OutputStream outputStream;
            boolean z;
            boolean z2;
            ?? r1 = AbstractViewCrawler.TAG;
            if (TextUtils.isEmpty(AbstractViewCrawler.this.mFeatureCode) || TextUtils.isEmpty(AbstractViewCrawler.this.mPostUrl)) {
                return;
            }
            BufferedOutputStream bufferedOutputStream = null;
            errorStream = null;
            InputStream errorStream = null;
            bufferedOutputStream = null;
            bufferedOutputStream = null;
            try {
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(AbstractViewCrawler.this.mPostUrl).openConnection();
                    SAConfigOptions configOptions = AbstractSensorsDataAPI.getConfigOptions();
                    if (configOptions != null) {
                        if (configOptions.isDisableSDK()) {
                            AbstractViewCrawler.this.mMessageThreadHandler.sendMessageDelayed(AbstractViewCrawler.this.mMessageThreadHandler.obtainMessage(1), 1000L);
                            if (byteArrayOutputStream != null) {
                                try {
                                    byteArrayOutputStream.close();
                                    return;
                                } catch (Exception e2) {
                                    SALog.printStackTrace(e2);
                                    return;
                                }
                            }
                            return;
                        }
                        if (configOptions.getSSLSocketFactory() != null && (httpURLConnection instanceof HttpsURLConnection)) {
                            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(configOptions.getSSLSocketFactory());
                        }
                    }
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setRequestProperty("Content-type", "text/plain");
                    outputStream = httpURLConnection.getOutputStream();
                    try {
                        BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(outputStream);
                        try {
                            try {
                                bufferedOutputStream2.write(byteArrayOutputStream.toString().getBytes("UTF-8"));
                                bufferedOutputStream2.flush();
                                int responseCode = httpURLConnection.getResponseCode();
                                try {
                                    errorStream = httpURLConnection.getInputStream();
                                } catch (FileNotFoundException unused) {
                                    errorStream = httpURLConnection.getErrorStream();
                                }
                                String str = new String(slurp(errorStream), "UTF-8");
                                SALog.i(AbstractViewCrawler.TAG, "request url =" + AbstractViewCrawler.this.mPostUrl);
                                SALog.i(AbstractViewCrawler.TAG, "responseCode=" + responseCode);
                                SALog.i(AbstractViewCrawler.TAG, "response=" + str);
                                JSONObject jSONObject = new JSONObject(str);
                                if (responseCode == 200) {
                                    boolean z3 = jSONObject.getInt(ClickApiEntity.DELAY) >= 0;
                                    try {
                                        String strOptString = jSONObject.optString("visualized_sdk_config");
                                        boolean zOptBoolean = jSONObject.optBoolean("visualized_config_disabled");
                                        if ((!TextUtils.isEmpty(strOptString) || zOptBoolean) && AbstractSensorsDataAPI.getConfigOptions().isVisualizedPropertiesEnabled()) {
                                            VisualPropertiesManager.getInstance().save2Cache(strOptString);
                                        }
                                        VisualizedAutoTrackService.getInstance().setDebugModeEnabled(jSONObject.optBoolean("visualized_debug_mode_enabled"));
                                        z2 = z3;
                                    } catch (Exception e3) {
                                        e = e3;
                                        inputStream = errorStream;
                                        z = z3;
                                        bufferedOutputStream = bufferedOutputStream2;
                                        r1 = z;
                                        try {
                                            SALog.printStackTrace(e);
                                            if (bufferedOutputStream != null) {
                                                try {
                                                    bufferedOutputStream.close();
                                                } catch (Exception e4) {
                                                    SALog.printStackTrace(e4);
                                                }
                                            }
                                            if (inputStream != null) {
                                                try {
                                                    inputStream.close();
                                                } catch (Exception e5) {
                                                    SALog.printStackTrace(e5);
                                                }
                                            }
                                            if (outputStream != null) {
                                                try {
                                                    outputStream.close();
                                                } catch (Exception e6) {
                                                    SALog.printStackTrace(e6);
                                                }
                                            }
                                            if (byteArrayOutputStream != null) {
                                                byteArrayOutputStream.close();
                                                r1 = r1;
                                            }
                                            if (r1 != 0) {
                                                AbstractViewCrawler.this.mMessageThreadHandler.sendMessageDelayed(AbstractViewCrawler.this.mMessageThreadHandler.obtainMessage(1), 1000L);
                                            } else {
                                                AbstractViewCrawler.this.stopUpdates(true);
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            if (bufferedOutputStream != null) {
                                                try {
                                                    bufferedOutputStream.close();
                                                } catch (Exception e7) {
                                                    SALog.printStackTrace(e7);
                                                }
                                            }
                                            if (inputStream != null) {
                                                try {
                                                    inputStream.close();
                                                } catch (Exception e8) {
                                                    SALog.printStackTrace(e8);
                                                }
                                            }
                                            if (outputStream != null) {
                                                try {
                                                    outputStream.close();
                                                } catch (Exception e9) {
                                                    SALog.printStackTrace(e9);
                                                }
                                            }
                                            if (byteArrayOutputStream != null) {
                                                throw th;
                                            }
                                            try {
                                                byteArrayOutputStream.close();
                                                throw th;
                                            } catch (Exception e10) {
                                                SALog.printStackTrace(e10);
                                                throw th;
                                            }
                                        }
                                    }
                                } else {
                                    z2 = true;
                                }
                                try {
                                    bufferedOutputStream2.close();
                                } catch (Exception e11) {
                                    SALog.printStackTrace(e11);
                                }
                                if (errorStream != null) {
                                    try {
                                        errorStream.close();
                                    } catch (Exception e12) {
                                        SALog.printStackTrace(e12);
                                    }
                                }
                                if (outputStream != null) {
                                    try {
                                        outputStream.close();
                                    } catch (Exception e13) {
                                        SALog.printStackTrace(e13);
                                    }
                                }
                                byteArrayOutputStream.close();
                                r1 = z2;
                            } catch (Exception e14) {
                                e = e14;
                                inputStream = errorStream;
                                z = true;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            inputStream = errorStream;
                            bufferedOutputStream = bufferedOutputStream2;
                            if (bufferedOutputStream != null) {
                                bufferedOutputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            if (byteArrayOutputStream != null) {
                                throw th;
                            }
                            byteArrayOutputStream.close();
                            throw th;
                        }
                    } catch (Exception e15) {
                        e = e15;
                        inputStream = null;
                        r1 = 1;
                        SALog.printStackTrace(e);
                        if (bufferedOutputStream != null) {
                            bufferedOutputStream.close();
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                            r1 = r1;
                        }
                        if (r1 != 0) {
                            AbstractViewCrawler.this.mMessageThreadHandler.sendMessageDelayed(AbstractViewCrawler.this.mMessageThreadHandler.obtainMessage(1), 1000L);
                        } else {
                            AbstractViewCrawler.this.stopUpdates(true);
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        inputStream = null;
                    }
                } catch (Exception e16) {
                    SALog.printStackTrace(e16);
                }
            } catch (Exception e17) {
                e = e17;
                inputStream = null;
                outputStream = null;
            } catch (Throwable th4) {
                th = th4;
                inputStream = null;
                outputStream = null;
            }
            if (r1 != 0) {
                AbstractViewCrawler.this.mMessageThreadHandler.sendMessageDelayed(AbstractViewCrawler.this.mMessageThreadHandler.obtainMessage(1), 1000L);
            } else {
                AbstractViewCrawler.this.stopUpdates(true);
            }
        }

        /* JADX WARN: Code duplicated, block: B:101:0x03e1 A[Catch: all -> 0x0339, IOException -> 0x0345, TRY_ENTER, TRY_LEAVE, TryCatch #35 {IOException -> 0x0345, all -> 0x0339, blocks: (B:46:0x0230, B:81:0x0319, B:90:0x0356, B:95:0x037f, B:98:0x03a2, B:101:0x03e1, B:104:0x0402, B:106:0x040a, B:109:0x0421, B:112:0x0442, B:114:0x044a), top: B:248:0x0230 }] */
        /* JADX WARN: Code duplicated, block: B:109:0x0421 A[Catch: all -> 0x0339, IOException -> 0x0345, TRY_ENTER, TRY_LEAVE, TryCatch #35 {IOException -> 0x0345, all -> 0x0339, blocks: (B:46:0x0230, B:81:0x0319, B:90:0x0356, B:95:0x037f, B:98:0x03a2, B:101:0x03e1, B:104:0x0402, B:106:0x040a, B:109:0x0421, B:112:0x0442, B:114:0x044a), top: B:248:0x0230 }] */
        /* JADX WARN: Code duplicated, block: B:204:0x04ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:208:0x0526 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:210:0x0465 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:214:0x0531 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:218:0x0470 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:227:0x04e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:237:0x053c A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:239:0x04f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:242:0x047d A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:246:0x018a A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:40:0x01d4 A[Catch: IOException -> 0x027d, all -> 0x0286, TryCatch #18 {IOException -> 0x027d, blocks: (B:38:0x01ae, B:40:0x01d4, B:41:0x01eb, B:43:0x01f9, B:44:0x0210), top: B:229:0x01ae }] */
        /* JADX WARN: Code duplicated, block: B:43:0x01f9 A[Catch: IOException -> 0x027d, all -> 0x0286, TryCatch #18 {IOException -> 0x027d, blocks: (B:38:0x01ae, B:40:0x01d4, B:41:0x01eb, B:43:0x01f9, B:44:0x0210), top: B:229:0x01ae }] */
        /* JADX WARN: Code duplicated, block: B:75:0x02cd  */
        /* JADX WARN: Code duplicated, block: B:81:0x0319 A[Catch: all -> 0x0339, IOException -> 0x0345, TRY_ENTER, TRY_LEAVE, TryCatch #35 {IOException -> 0x0345, all -> 0x0339, blocks: (B:46:0x0230, B:81:0x0319, B:90:0x0356, B:95:0x037f, B:98:0x03a2, B:101:0x03e1, B:104:0x0402, B:106:0x040a, B:109:0x0421, B:112:0x0442, B:114:0x044a), top: B:248:0x0230 }] */
        /* JADX WARN: Code duplicated, block: B:87:0x0351  */
        /* JADX WARN: Code duplicated, block: B:90:0x0356 A[Catch: all -> 0x0339, IOException -> 0x0345, TRY_ENTER, TRY_LEAVE, TryCatch #35 {IOException -> 0x0345, all -> 0x0339, blocks: (B:46:0x0230, B:81:0x0319, B:90:0x0356, B:95:0x037f, B:98:0x03a2, B:101:0x03e1, B:104:0x0402, B:106:0x040a, B:109:0x0421, B:112:0x0442, B:114:0x044a), top: B:248:0x0230 }] */
        /* JADX WARN: Code duplicated, block: B:92:0x0364  */
        /* JADX WARN: Code duplicated, block: B:95:0x037f A[Catch: all -> 0x0339, IOException -> 0x0345, TRY_ENTER, TRY_LEAVE, TryCatch #35 {IOException -> 0x0345, all -> 0x0339, blocks: (B:46:0x0230, B:81:0x0319, B:90:0x0356, B:95:0x037f, B:98:0x03a2, B:101:0x03e1, B:104:0x0402, B:106:0x040a, B:109:0x0421, B:112:0x0442, B:114:0x044a), top: B:248:0x0230 }] */
        /* JADX WARN: Code duplicated, block: B:98:0x03a2 A[Catch: all -> 0x0339, IOException -> 0x0345, TRY_ENTER, TRY_LEAVE, TryCatch #35 {IOException -> 0x0345, all -> 0x0339, blocks: (B:46:0x0230, B:81:0x0319, B:90:0x0356, B:95:0x037f, B:98:0x03a2, B:101:0x03e1, B:104:0x0402, B:106:0x040a, B:109:0x0421, B:112:0x0442, B:114:0x044a), top: B:248:0x0230 }] */
        /* JADX WARN: Instruction removed from duplicated block: B:101:0x03e1, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:109:0x0421, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:81:0x0319, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:95:0x037f, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:98:0x03a2, please report this as an issue */
        private void sendSnapshot() throws Throwable {
            String str;
            String str2;
            String str3;
            IOException iOException;
            SnapInfo snapInfoSnapshots;
            ByteArrayOutputStream byteArrayOutputStream;
            GZIPOutputStream gZIPOutputStream;
            Throwable th;
            ByteArrayOutputStream byteArrayOutputStream2;
            IOException iOException2;
            String str4;
            String str5;
            BufferedOutputStream bufferedOutputStream;
            String debugInfo;
            String visualLogInfo;
            ByteArrayOutputStream byteArrayOutputStream3;
            String str6;
            String fragmentScreenName;
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                ViewSnapshot snapshotConfig = this.mProtocol.readSnapshotConfig(AbstractViewCrawler.this.mMainThreadHandler);
                this.mSnapshot = snapshotConfig;
                if (snapshotConfig == null) {
                    SALog.i(AbstractViewCrawler.TAG, "Snapshot should be initialize at first calling.");
                    return;
                }
                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(byteArrayOutputStream4);
                try {
                    bufferedOutputStream2.write(n04.OPEN_BRACE_REGEX.getBytes());
                    bufferedOutputStream2.write("\"type\": \"snapshot_response\",".getBytes());
                    bufferedOutputStream2.write(("\"feature_code\": \"" + AbstractViewCrawler.this.mFeatureCode + "\",").getBytes());
                    bufferedOutputStream2.write(("\"app_version\": \"" + AbstractViewCrawler.this.mAppVersion + "\",").getBytes());
                    bufferedOutputStream2.write(("\"lib_version\": \"" + this.mSDKVersion + "\",").getBytes());
                    bufferedOutputStream2.write("\"os\": \"Android\",".getBytes());
                    bufferedOutputStream2.write("\"lib\": \"Android\",".getBytes());
                    bufferedOutputStream2.write(("\"app_id\": \"" + this.mAppId + "\",").getBytes());
                    bufferedOutputStream2.write(("\"app_enablevisualizedproperties\": " + AbstractSensorsDataAPI.getConfigOptions().isVisualizedPropertiesEnabled() + ",").getBytes());
                    try {
                        try {
                            JSONArray jSONArray = new JSONArray();
                            if (!SensorsDataAPI.sharedInstance().isAutoTrackEventTypeIgnored(SensorsDataAPI.AutoTrackEventType.APP_CLICK)) {
                                jSONArray.put("$AppClick");
                            }
                            if (!SensorsDataAPI.sharedInstance().isAutoTrackEventTypeIgnored(SensorsDataAPI.AutoTrackEventType.APP_VIEW_SCREEN)) {
                                jSONArray.put("$AppViewScreen");
                            }
                            bufferedOutputStream2.write(("\"app_autotrack\": " + jSONArray.toString() + ",").getBytes());
                        } catch (Throwable th2) {
                            th = th2;
                            str = "Can't close writer.";
                            str2 = "Can't close payload_out.";
                            str3 = "Can't close gos.";
                            gZIPOutputStream = null;
                            byteArrayOutputStream = null;
                            byteArrayOutputStream2 = null;
                            if (byteArrayOutputStream2 != null) {
                                try {
                                    byteArrayOutputStream2.close();
                                } catch (Exception e2) {
                                    SALog.i(AbstractViewCrawler.TAG, "Can't close os.", e2);
                                }
                            }
                            if (gZIPOutputStream != null) {
                                try {
                                    gZIPOutputStream.close();
                                } catch (Exception e3) {
                                    SALog.i(AbstractViewCrawler.TAG, str3, e3);
                                }
                            }
                            if (byteArrayOutputStream != null) {
                                try {
                                    byteArrayOutputStream.close();
                                } catch (Exception e4) {
                                    SALog.i(AbstractViewCrawler.TAG, str2, e4);
                                }
                            }
                            try {
                                bufferedOutputStream2.close();
                                throw th;
                            } catch (IOException e5) {
                                SALog.i(AbstractViewCrawler.TAG, str, e5);
                                throw th;
                            }
                        }
                    } catch (Exception e6) {
                        SALog.printStackTrace(e6);
                    }
                    String visualConfigVersion = VisualPropertiesManager.getInstance().getVisualConfigVersion();
                    if (TextUtils.isEmpty(visualConfigVersion)) {
                        if (this.mUseGzip) {
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            str = "Can't close writer.";
                            bufferedOutputStream = new BufferedOutputStream(byteArrayOutputStream);
                            str4 = "Can't close payload_out.";
                            bufferedOutputStream.write("{\"activities\":".getBytes());
                            bufferedOutputStream.flush();
                            str5 = "Can't close gos.";
                            snapInfoSnapshots = this.mSnapshot.snapshots(byteArrayOutputStream, this.mLastImageHash);
                            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                            bufferedOutputStream.write(",\"snapshot_time_millis\": ".getBytes());
                            bufferedOutputStream.write(Long.toString(jCurrentTimeMillis2).getBytes());
                            debugInfo = VisualizedAutoTrackService.getInstance().getDebugInfo();
                            if (!TextUtils.isEmpty(debugInfo)) {
                                bufferedOutputStream.write(",".getBytes());
                                bufferedOutputStream.write("\"event_debug\": ".getBytes());
                                bufferedOutputStream.write(debugInfo.getBytes());
                            }
                            visualLogInfo = VisualizedAutoTrackService.getInstance().getVisualLogInfo();
                            if (!TextUtils.isEmpty(visualLogInfo)) {
                                bufferedOutputStream.write(",".getBytes());
                                bufferedOutputStream.write("\"log_info\":".getBytes());
                                bufferedOutputStream.write(visualLogInfo.getBytes());
                            }
                            bufferedOutputStream.write("}".getBytes());
                            bufferedOutputStream.flush();
                            byteArrayOutputStream.close();
                            byte[] bytes = byteArrayOutputStream.toString().getBytes();
                            byteArrayOutputStream3 = new ByteArrayOutputStream(bytes.length);
                            gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream3);
                            gZIPOutputStream.write(bytes);
                            gZIPOutputStream.close();
                            byte[] byteArray = byteArrayOutputStream3.toByteArray();
                            byteArrayOutputStream3.close();
                            bufferedOutputStream2.write(("\"gzip_payload\": \"" + new String(Base64Coder.encode(byteArray)) + "\"").getBytes());
                        } else {
                            str = "Can't close writer.";
                            str4 = "Can't close payload_out.";
                            str5 = "Can't close gos.";
                            bufferedOutputStream2.write("\"payload\": {".getBytes());
                            bufferedOutputStream2.write("\"activities\":".getBytes());
                            bufferedOutputStream2.flush();
                            snapInfoSnapshots = this.mSnapshot.snapshots(byteArrayOutputStream4, this.mLastImageHash);
                            long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis;
                            bufferedOutputStream2.write(",\"snapshot_time_millis\": ".getBytes());
                            bufferedOutputStream2.write(Long.toString(jCurrentTimeMillis3).getBytes());
                            bufferedOutputStream2.write("}".getBytes());
                            byteArrayOutputStream3 = null;
                            gZIPOutputStream = null;
                            byteArrayOutputStream = null;
                        }
                        if (TextUtils.isEmpty(snapInfoSnapshots.screenName)) {
                            str6 = null;
                        } else {
                            bufferedOutputStream2.write((",\"screen_name\": \"" + snapInfoSnapshots.screenName + "\"").getBytes());
                            str6 = snapInfoSnapshots.screenName;
                        }
                        if (snapInfoSnapshots.hasFragment) {
                            fragmentScreenName = AppStateTools.getInstance().getFragmentScreenName();
                            if (!TextUtils.isEmpty(fragmentScreenName)) {
                                str6 = fragmentScreenName;
                            }
                        }
                        SALog.i(AbstractViewCrawler.TAG, "page_name： " + str6);
                        if (!TextUtils.isEmpty(str6)) {
                            bufferedOutputStream2.write((",\"page_name\": \"" + str6 + "\"").getBytes());
                        }
                        if (!TextUtils.isEmpty(snapInfoSnapshots.activityTitle)) {
                            bufferedOutputStream2.write((",\"title\": \"" + snapInfoSnapshots.activityTitle + "\"").getBytes());
                        }
                        bufferedOutputStream2.write((",\"is_webview\": " + snapInfoSnapshots.isWebView).getBytes());
                        if (!TextUtils.isEmpty(snapInfoSnapshots.webLibVersion)) {
                            bufferedOutputStream2.write((",\"web_lib_version\": \"" + snapInfoSnapshots.webLibVersion + "\"").getBytes());
                        }
                        if (snapInfoSnapshots.isWebView) {
                            AlertMessageUtils.buildH5AlertInfo(bufferedOutputStream2, AbstractViewCrawler.this.mType, snapInfoSnapshots, AbstractViewCrawler.this.mContext);
                        }
                        if (!TextUtils.isEmpty(snapInfoSnapshots.flutterLibVersion)) {
                            bufferedOutputStream2.write((",\"flutter_lib_version\": \"" + snapInfoSnapshots.flutterLibVersion + "\"").getBytes());
                        }
                        if (snapInfoSnapshots.isFlutter) {
                            AlertMessageUtils.buildFlutterAlertInfo(bufferedOutputStream2, AbstractViewCrawler.this.mType, snapInfoSnapshots, AbstractViewCrawler.this.mContext);
                        }
                        bufferedOutputStream2.write("}".getBytes());
                        bufferedOutputStream2.flush();
                        if (byteArrayOutputStream3 != null) {
                            byteArrayOutputStream3.close();
                        }
                        if (gZIPOutputStream != null) {
                            gZIPOutputStream.close();
                        }
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                        bufferedOutputStream2.close();
                    } else {
                        try {
                            bufferedOutputStream2.write(("\"config_version\": \"" + visualConfigVersion + "\",").getBytes());
                            if (this.mUseGzip) {
                                try {
                                    byteArrayOutputStream = new ByteArrayOutputStream();
                                    str = "Can't close writer.";
                                    try {
                                        bufferedOutputStream = new BufferedOutputStream(byteArrayOutputStream);
                                        str4 = "Can't close payload_out.";
                                        try {
                                            bufferedOutputStream.write("{\"activities\":".getBytes());
                                            bufferedOutputStream.flush();
                                            str5 = "Can't close gos.";
                                            try {
                                                try {
                                                    snapInfoSnapshots = this.mSnapshot.snapshots(byteArrayOutputStream, this.mLastImageHash);
                                                    try {
                                                        long jCurrentTimeMillis4 = System.currentTimeMillis() - jCurrentTimeMillis;
                                                        bufferedOutputStream.write(",\"snapshot_time_millis\": ".getBytes());
                                                        bufferedOutputStream.write(Long.toString(jCurrentTimeMillis4).getBytes());
                                                        debugInfo = VisualizedAutoTrackService.getInstance().getDebugInfo();
                                                        if (!TextUtils.isEmpty(debugInfo)) {
                                                            bufferedOutputStream.write(",".getBytes());
                                                            bufferedOutputStream.write("\"event_debug\": ".getBytes());
                                                            bufferedOutputStream.write(debugInfo.getBytes());
                                                        }
                                                        visualLogInfo = VisualizedAutoTrackService.getInstance().getVisualLogInfo();
                                                        if (!TextUtils.isEmpty(visualLogInfo)) {
                                                            bufferedOutputStream.write(",".getBytes());
                                                            bufferedOutputStream.write("\"log_info\":".getBytes());
                                                            bufferedOutputStream.write(visualLogInfo.getBytes());
                                                        }
                                                        bufferedOutputStream.write("}".getBytes());
                                                        bufferedOutputStream.flush();
                                                        byteArrayOutputStream.close();
                                                        byte[] bytes2 = byteArrayOutputStream.toString().getBytes();
                                                        byteArrayOutputStream3 = new ByteArrayOutputStream(bytes2.length);
                                                        try {
                                                            gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream3);
                                                            try {
                                                                gZIPOutputStream.write(bytes2);
                                                                gZIPOutputStream.close();
                                                                byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                                                                byteArrayOutputStream3.close();
                                                                bufferedOutputStream2.write(("\"gzip_payload\": \"" + new String(Base64Coder.encode(byteArray2)) + "\"").getBytes());
                                                            } catch (IOException e7) {
                                                                iOException = e7;
                                                                byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                str = str;
                                                                str3 = str5;
                                                                str2 = str4;
                                                                try {
                                                                    SALog.i(AbstractViewCrawler.TAG, "Can't write snapshot request to server", iOException);
                                                                    if (byteArrayOutputStream2 != null) {
                                                                        try {
                                                                            byteArrayOutputStream2.close();
                                                                        } catch (Exception e8) {
                                                                            SALog.i(AbstractViewCrawler.TAG, "Can't close os.", e8);
                                                                        }
                                                                    }
                                                                    if (gZIPOutputStream != null) {
                                                                        try {
                                                                            gZIPOutputStream.close();
                                                                        } catch (Exception e9) {
                                                                            SALog.i(AbstractViewCrawler.TAG, str3, e9);
                                                                        }
                                                                    }
                                                                    if (byteArrayOutputStream != null) {
                                                                        try {
                                                                            byteArrayOutputStream.close();
                                                                        } catch (Exception e10) {
                                                                            SALog.i(AbstractViewCrawler.TAG, str2, e10);
                                                                        }
                                                                    }
                                                                    try {
                                                                        bufferedOutputStream2.close();
                                                                    } catch (IOException e11) {
                                                                        iOException2 = e11;
                                                                        SALog.i(AbstractViewCrawler.TAG, str, iOException2);
                                                                    }
                                                                    SALog.i(AbstractViewCrawler.TAG, "sendSnapshot = " + byteArrayOutputStream4);
                                                                    onSnapFinished(snapInfoSnapshots);
                                                                    postSnapshot(byteArrayOutputStream4);
                                                                } catch (Throwable th3) {
                                                                    th = th3;
                                                                    if (byteArrayOutputStream2 != null) {
                                                                        byteArrayOutputStream2.close();
                                                                    }
                                                                    if (gZIPOutputStream != null) {
                                                                        gZIPOutputStream.close();
                                                                    }
                                                                    if (byteArrayOutputStream != null) {
                                                                        byteArrayOutputStream.close();
                                                                    }
                                                                    bufferedOutputStream2.close();
                                                                    throw th;
                                                                }
                                                            } catch (Throwable th4) {
                                                                th = th4;
                                                                byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                str = str;
                                                                str3 = str5;
                                                                str2 = str4;
                                                                if (byteArrayOutputStream2 != null) {
                                                                    byteArrayOutputStream2.close();
                                                                }
                                                                if (gZIPOutputStream != null) {
                                                                    gZIPOutputStream.close();
                                                                }
                                                                if (byteArrayOutputStream != null) {
                                                                    byteArrayOutputStream.close();
                                                                }
                                                                bufferedOutputStream2.close();
                                                                throw th;
                                                            }
                                                        } catch (IOException e12) {
                                                            iOException = e12;
                                                            byteArrayOutputStream2 = byteArrayOutputStream3;
                                                            str = str;
                                                            str3 = str5;
                                                            str2 = str4;
                                                            gZIPOutputStream = null;
                                                            SALog.i(AbstractViewCrawler.TAG, "Can't write snapshot request to server", iOException);
                                                            if (byteArrayOutputStream2 != null) {
                                                                byteArrayOutputStream2.close();
                                                            }
                                                            if (gZIPOutputStream != null) {
                                                                gZIPOutputStream.close();
                                                            }
                                                            if (byteArrayOutputStream != null) {
                                                                byteArrayOutputStream.close();
                                                            }
                                                            bufferedOutputStream2.close();
                                                            SALog.i(AbstractViewCrawler.TAG, "sendSnapshot = " + byteArrayOutputStream4);
                                                            onSnapFinished(snapInfoSnapshots);
                                                            postSnapshot(byteArrayOutputStream4);
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                            byteArrayOutputStream2 = byteArrayOutputStream3;
                                                            str = str;
                                                            str3 = str5;
                                                            str2 = str4;
                                                            gZIPOutputStream = null;
                                                            if (byteArrayOutputStream2 != null) {
                                                                byteArrayOutputStream2.close();
                                                            }
                                                            if (gZIPOutputStream != null) {
                                                                gZIPOutputStream.close();
                                                            }
                                                            if (byteArrayOutputStream != null) {
                                                                byteArrayOutputStream.close();
                                                            }
                                                            bufferedOutputStream2.close();
                                                            throw th;
                                                        }
                                                    } catch (IOException e13) {
                                                        iOException = e13;
                                                        str3 = str5;
                                                        str2 = str4;
                                                        gZIPOutputStream = null;
                                                        byteArrayOutputStream2 = null;
                                                        SALog.i(AbstractViewCrawler.TAG, "Can't write snapshot request to server", iOException);
                                                        if (byteArrayOutputStream2 != null) {
                                                            byteArrayOutputStream2.close();
                                                        }
                                                        if (gZIPOutputStream != null) {
                                                            gZIPOutputStream.close();
                                                        }
                                                        if (byteArrayOutputStream != null) {
                                                            byteArrayOutputStream.close();
                                                        }
                                                        bufferedOutputStream2.close();
                                                        SALog.i(AbstractViewCrawler.TAG, "sendSnapshot = " + byteArrayOutputStream4);
                                                        onSnapFinished(snapInfoSnapshots);
                                                        postSnapshot(byteArrayOutputStream4);
                                                    }
                                                } catch (IOException e14) {
                                                    e = e14;
                                                    iOException = e;
                                                    str3 = str5;
                                                    str2 = str4;
                                                    snapInfoSnapshots = null;
                                                    gZIPOutputStream = null;
                                                    byteArrayOutputStream2 = null;
                                                    SALog.i(AbstractViewCrawler.TAG, "Can't write snapshot request to server", iOException);
                                                    if (byteArrayOutputStream2 != null) {
                                                        byteArrayOutputStream2.close();
                                                    }
                                                    if (gZIPOutputStream != null) {
                                                        gZIPOutputStream.close();
                                                    }
                                                    if (byteArrayOutputStream != null) {
                                                        byteArrayOutputStream.close();
                                                    }
                                                    bufferedOutputStream2.close();
                                                    SALog.i(AbstractViewCrawler.TAG, "sendSnapshot = " + byteArrayOutputStream4);
                                                    onSnapFinished(snapInfoSnapshots);
                                                    postSnapshot(byteArrayOutputStream4);
                                                }
                                            } catch (Throwable th6) {
                                                th = th6;
                                                th = th;
                                                str = str;
                                                str3 = str5;
                                                str2 = str4;
                                                gZIPOutputStream = null;
                                                byteArrayOutputStream2 = null;
                                                if (byteArrayOutputStream2 != null) {
                                                    byteArrayOutputStream2.close();
                                                }
                                                if (gZIPOutputStream != null) {
                                                    gZIPOutputStream.close();
                                                }
                                                if (byteArrayOutputStream != null) {
                                                    byteArrayOutputStream.close();
                                                }
                                                bufferedOutputStream2.close();
                                                throw th;
                                            }
                                        } catch (IOException e15) {
                                            e = e15;
                                            str5 = "Can't close gos.";
                                            iOException = e;
                                            str3 = str5;
                                            str2 = str4;
                                            snapInfoSnapshots = null;
                                            gZIPOutputStream = null;
                                            byteArrayOutputStream2 = null;
                                            SALog.i(AbstractViewCrawler.TAG, "Can't write snapshot request to server", iOException);
                                            if (byteArrayOutputStream2 != null) {
                                                byteArrayOutputStream2.close();
                                            }
                                            if (gZIPOutputStream != null) {
                                                gZIPOutputStream.close();
                                            }
                                            if (byteArrayOutputStream != null) {
                                                byteArrayOutputStream.close();
                                            }
                                            bufferedOutputStream2.close();
                                            SALog.i(AbstractViewCrawler.TAG, "sendSnapshot = " + byteArrayOutputStream4);
                                            onSnapFinished(snapInfoSnapshots);
                                            postSnapshot(byteArrayOutputStream4);
                                        } catch (Throwable th7) {
                                            th = th7;
                                            str5 = "Can't close gos.";
                                            th = th;
                                            str = str;
                                            str3 = str5;
                                            str2 = str4;
                                            gZIPOutputStream = null;
                                            byteArrayOutputStream2 = null;
                                            if (byteArrayOutputStream2 != null) {
                                                byteArrayOutputStream2.close();
                                            }
                                            if (gZIPOutputStream != null) {
                                                gZIPOutputStream.close();
                                            }
                                            if (byteArrayOutputStream != null) {
                                                byteArrayOutputStream.close();
                                            }
                                            bufferedOutputStream2.close();
                                            throw th;
                                        }
                                    } catch (IOException e16) {
                                        e = e16;
                                        str4 = "Can't close payload_out.";
                                    } catch (Throwable th8) {
                                        th = th8;
                                        str4 = "Can't close payload_out.";
                                    }
                                } catch (IOException e17) {
                                    iOException = e17;
                                    str = "Can't close writer.";
                                    str3 = "Can't close gos.";
                                    str2 = "Can't close payload_out.";
                                    snapInfoSnapshots = null;
                                    gZIPOutputStream = null;
                                    byteArrayOutputStream = null;
                                    byteArrayOutputStream2 = null;
                                    SALog.i(AbstractViewCrawler.TAG, "Can't write snapshot request to server", iOException);
                                    if (byteArrayOutputStream2 != null) {
                                        byteArrayOutputStream2.close();
                                    }
                                    if (gZIPOutputStream != null) {
                                        gZIPOutputStream.close();
                                    }
                                    if (byteArrayOutputStream != null) {
                                        byteArrayOutputStream.close();
                                    }
                                    bufferedOutputStream2.close();
                                    SALog.i(AbstractViewCrawler.TAG, "sendSnapshot = " + byteArrayOutputStream4);
                                    onSnapFinished(snapInfoSnapshots);
                                    postSnapshot(byteArrayOutputStream4);
                                } catch (Throwable th9) {
                                    th = th9;
                                    str = "Can't close writer.";
                                    str3 = "Can't close gos.";
                                    str2 = "Can't close payload_out.";
                                    gZIPOutputStream = null;
                                    byteArrayOutputStream = null;
                                    byteArrayOutputStream2 = null;
                                    if (byteArrayOutputStream2 != null) {
                                        byteArrayOutputStream2.close();
                                    }
                                    if (gZIPOutputStream != null) {
                                        gZIPOutputStream.close();
                                    }
                                    if (byteArrayOutputStream != null) {
                                        byteArrayOutputStream.close();
                                    }
                                    bufferedOutputStream2.close();
                                    throw th;
                                }
                            } else {
                                str = "Can't close writer.";
                                str4 = "Can't close payload_out.";
                                str5 = "Can't close gos.";
                                try {
                                    try {
                                        bufferedOutputStream2.write("\"payload\": {".getBytes());
                                        bufferedOutputStream2.write("\"activities\":".getBytes());
                                        bufferedOutputStream2.flush();
                                        snapInfoSnapshots = this.mSnapshot.snapshots(byteArrayOutputStream4, this.mLastImageHash);
                                        try {
                                            long jCurrentTimeMillis5 = System.currentTimeMillis() - jCurrentTimeMillis;
                                            bufferedOutputStream2.write(",\"snapshot_time_millis\": ".getBytes());
                                            bufferedOutputStream2.write(Long.toString(jCurrentTimeMillis5).getBytes());
                                            bufferedOutputStream2.write("}".getBytes());
                                            byteArrayOutputStream3 = null;
                                            gZIPOutputStream = null;
                                            byteArrayOutputStream = null;
                                        } catch (IOException e18) {
                                            str = str;
                                            str3 = str5;
                                            str2 = str4;
                                            iOException = e18;
                                            gZIPOutputStream = null;
                                            byteArrayOutputStream = null;
                                            byteArrayOutputStream2 = null;
                                            SALog.i(AbstractViewCrawler.TAG, "Can't write snapshot request to server", iOException);
                                            if (byteArrayOutputStream2 != null) {
                                                byteArrayOutputStream2.close();
                                            }
                                            if (gZIPOutputStream != null) {
                                                gZIPOutputStream.close();
                                            }
                                            if (byteArrayOutputStream != null) {
                                                byteArrayOutputStream.close();
                                            }
                                            bufferedOutputStream2.close();
                                            SALog.i(AbstractViewCrawler.TAG, "sendSnapshot = " + byteArrayOutputStream4);
                                            onSnapFinished(snapInfoSnapshots);
                                            postSnapshot(byteArrayOutputStream4);
                                        }
                                    } catch (Throwable th10) {
                                        th = th10;
                                        str = str;
                                        str3 = str5;
                                        str2 = str4;
                                        th = th;
                                        gZIPOutputStream = null;
                                        byteArrayOutputStream = null;
                                        byteArrayOutputStream2 = null;
                                        if (byteArrayOutputStream2 != null) {
                                            byteArrayOutputStream2.close();
                                        }
                                        if (gZIPOutputStream != null) {
                                            gZIPOutputStream.close();
                                        }
                                        if (byteArrayOutputStream != null) {
                                            byteArrayOutputStream.close();
                                        }
                                        bufferedOutputStream2.close();
                                        throw th;
                                    }
                                } catch (IOException e19) {
                                    e = e19;
                                    str = str;
                                    str3 = str5;
                                    str2 = str4;
                                    iOException = e;
                                    snapInfoSnapshots = null;
                                    gZIPOutputStream = null;
                                    byteArrayOutputStream = null;
                                    byteArrayOutputStream2 = null;
                                    SALog.i(AbstractViewCrawler.TAG, "Can't write snapshot request to server", iOException);
                                    if (byteArrayOutputStream2 != null) {
                                        byteArrayOutputStream2.close();
                                    }
                                    if (gZIPOutputStream != null) {
                                        gZIPOutputStream.close();
                                    }
                                    if (byteArrayOutputStream != null) {
                                        byteArrayOutputStream.close();
                                    }
                                    bufferedOutputStream2.close();
                                    SALog.i(AbstractViewCrawler.TAG, "sendSnapshot = " + byteArrayOutputStream4);
                                    onSnapFinished(snapInfoSnapshots);
                                    postSnapshot(byteArrayOutputStream4);
                                }
                            }
                            try {
                                if (TextUtils.isEmpty(snapInfoSnapshots.screenName)) {
                                    bufferedOutputStream2.write((",\"screen_name\": \"" + snapInfoSnapshots.screenName + "\"").getBytes());
                                    str6 = snapInfoSnapshots.screenName;
                                } else {
                                    str6 = null;
                                }
                                if (snapInfoSnapshots.hasFragment) {
                                    fragmentScreenName = AppStateTools.getInstance().getFragmentScreenName();
                                    if (!TextUtils.isEmpty(fragmentScreenName)) {
                                        str6 = fragmentScreenName;
                                    }
                                }
                                SALog.i(AbstractViewCrawler.TAG, "page_name： " + str6);
                                if (!TextUtils.isEmpty(str6)) {
                                    bufferedOutputStream2.write((",\"page_name\": \"" + str6 + "\"").getBytes());
                                }
                                if (!TextUtils.isEmpty(snapInfoSnapshots.activityTitle)) {
                                    bufferedOutputStream2.write((",\"title\": \"" + snapInfoSnapshots.activityTitle + "\"").getBytes());
                                }
                                bufferedOutputStream2.write((",\"is_webview\": " + snapInfoSnapshots.isWebView).getBytes());
                                if (!TextUtils.isEmpty(snapInfoSnapshots.webLibVersion)) {
                                    bufferedOutputStream2.write((",\"web_lib_version\": \"" + snapInfoSnapshots.webLibVersion + "\"").getBytes());
                                }
                                if (snapInfoSnapshots.isWebView && !TextUtils.isEmpty(snapInfoSnapshots.webViewUrl)) {
                                    AlertMessageUtils.buildH5AlertInfo(bufferedOutputStream2, AbstractViewCrawler.this.mType, snapInfoSnapshots, AbstractViewCrawler.this.mContext);
                                }
                                if (!TextUtils.isEmpty(snapInfoSnapshots.flutterLibVersion)) {
                                    bufferedOutputStream2.write((",\"flutter_lib_version\": \"" + snapInfoSnapshots.flutterLibVersion + "\"").getBytes());
                                }
                                if (snapInfoSnapshots.isFlutter && !TextUtils.isEmpty(snapInfoSnapshots.activityName)) {
                                    AlertMessageUtils.buildFlutterAlertInfo(bufferedOutputStream2, AbstractViewCrawler.this.mType, snapInfoSnapshots, AbstractViewCrawler.this.mContext);
                                }
                                bufferedOutputStream2.write("}".getBytes());
                                bufferedOutputStream2.flush();
                                if (byteArrayOutputStream3 != null) {
                                    try {
                                        byteArrayOutputStream3.close();
                                    } catch (Exception e20) {
                                        SALog.i(AbstractViewCrawler.TAG, "Can't close os.", e20);
                                    }
                                }
                                if (gZIPOutputStream != null) {
                                    try {
                                        gZIPOutputStream.close();
                                    } catch (Exception e21) {
                                        SALog.i(AbstractViewCrawler.TAG, str5, e21);
                                    }
                                }
                                if (byteArrayOutputStream != null) {
                                    try {
                                        byteArrayOutputStream.close();
                                    } catch (Exception e22) {
                                        SALog.i(AbstractViewCrawler.TAG, str4, e22);
                                    }
                                }
                                try {
                                    bufferedOutputStream2.close();
                                } catch (IOException e23) {
                                    iOException2 = e23;
                                    str = str;
                                    SALog.i(AbstractViewCrawler.TAG, str, iOException2);
                                }
                            } catch (IOException e24) {
                                str = str;
                                str3 = str5;
                                str2 = str4;
                                iOException = e24;
                                byteArrayOutputStream2 = byteArrayOutputStream3;
                                SALog.i(AbstractViewCrawler.TAG, "Can't write snapshot request to server", iOException);
                                if (byteArrayOutputStream2 != null) {
                                    byteArrayOutputStream2.close();
                                }
                                if (gZIPOutputStream != null) {
                                    gZIPOutputStream.close();
                                }
                                if (byteArrayOutputStream != null) {
                                    byteArrayOutputStream.close();
                                }
                                bufferedOutputStream2.close();
                            } catch (Throwable th11) {
                                str = str;
                                str3 = str5;
                                str2 = str4;
                                th = th11;
                                byteArrayOutputStream2 = byteArrayOutputStream3;
                                if (byteArrayOutputStream2 != null) {
                                    byteArrayOutputStream2.close();
                                }
                                if (gZIPOutputStream != null) {
                                    gZIPOutputStream.close();
                                }
                                if (byteArrayOutputStream != null) {
                                    byteArrayOutputStream.close();
                                }
                                bufferedOutputStream2.close();
                                throw th;
                            }
                        } catch (IOException e25) {
                            str = "Can't close writer.";
                            str2 = "Can't close payload_out.";
                            str3 = "Can't close gos.";
                            snapInfoSnapshots = null;
                            gZIPOutputStream = null;
                            byteArrayOutputStream = null;
                            byteArrayOutputStream2 = null;
                            iOException = e25;
                            SALog.i(AbstractViewCrawler.TAG, "Can't write snapshot request to server", iOException);
                            if (byteArrayOutputStream2 != null) {
                                byteArrayOutputStream2.close();
                            }
                            if (gZIPOutputStream != null) {
                                gZIPOutputStream.close();
                            }
                            if (byteArrayOutputStream != null) {
                                byteArrayOutputStream.close();
                            }
                            bufferedOutputStream2.close();
                            SALog.i(AbstractViewCrawler.TAG, "sendSnapshot = " + byteArrayOutputStream4);
                            onSnapFinished(snapInfoSnapshots);
                            postSnapshot(byteArrayOutputStream4);
                        }
                    }
                } catch (IOException e26) {
                    e = e26;
                    str = "Can't close writer.";
                    str2 = "Can't close payload_out.";
                    str3 = "Can't close gos.";
                    iOException = e;
                    snapInfoSnapshots = null;
                    gZIPOutputStream = null;
                    byteArrayOutputStream = null;
                    byteArrayOutputStream2 = null;
                    SALog.i(AbstractViewCrawler.TAG, "Can't write snapshot request to server", iOException);
                    if (byteArrayOutputStream2 != null) {
                        byteArrayOutputStream2.close();
                    }
                    if (gZIPOutputStream != null) {
                        gZIPOutputStream.close();
                    }
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                    }
                    bufferedOutputStream2.close();
                    SALog.i(AbstractViewCrawler.TAG, "sendSnapshot = " + byteArrayOutputStream4);
                    onSnapFinished(snapInfoSnapshots);
                    postSnapshot(byteArrayOutputStream4);
                } catch (Throwable th12) {
                    th = th12;
                    str = "Can't close writer.";
                    str2 = "Can't close payload_out.";
                    str3 = "Can't close gos.";
                    th = th;
                    gZIPOutputStream = null;
                    byteArrayOutputStream = null;
                    byteArrayOutputStream2 = null;
                    if (byteArrayOutputStream2 != null) {
                        byteArrayOutputStream2.close();
                    }
                    if (gZIPOutputStream != null) {
                        gZIPOutputStream.close();
                    }
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                    }
                    bufferedOutputStream2.close();
                    throw th;
                }
                SALog.i(AbstractViewCrawler.TAG, "sendSnapshot = " + byteArrayOutputStream4);
                onSnapFinished(snapInfoSnapshots);
                postSnapshot(byteArrayOutputStream4);
            } catch (EditProtocol.BadInstructionsException e27) {
                SALog.i(AbstractViewCrawler.TAG, "VisualizedAutoTrack server sent malformed message with snapshot request", e27);
            }
        }

        private byte[] slurp(InputStream inputStream) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[8192];
            while (true) {
                int i = inputStream.read(bArr, 0, 8192);
                if (i == -1) {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) throws Throwable {
            if (message.what != 1) {
                return;
            }
            sendSnapshot();
        }

        public void start() {
        }

        private ViewCrawlerHandler(Context context, Looper looper, String str) {
            super(looper);
            this.mSnapshot = null;
            this.mProtocol = new EditProtocol(new ResourceReader.Ids(str, context));
            this.mLastImageHash = new StringBuilder();
            this.mUseGzip = true;
            this.mAppId = AppInfoUtils.getProcessName(context);
            this.mSDKVersion = SensorsDataAPI.sharedInstance().getSDKVersion();
        }
    }

    public AbstractViewCrawler(Activity activity, String str, String str2, String str3, String str4) {
        this.mContext = activity.getApplicationContext();
        this.mFeatureCode = str2;
        EditState editState = new EditState();
        this.mEditState = editState;
        this.mType = str4;
        editState.add(activity);
        this.mLifecycleCallbacks = new LifecycleCallbacks();
        try {
            this.mPostUrl = URLDecoder.decode(str3, "UTF-8");
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
        ((Application) this.mContext.getApplicationContext()).registerActivityLifecycleCallbacks(this.mLifecycleCallbacks);
        try {
            this.mAppVersion = activity.getPackageManager().getPackageInfo(activity.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            this.mAppVersion = "";
        }
        HandlerThread handlerThread = new HandlerThread(VisualizedAutoTrackViewCrawler.class.getCanonicalName(), 10);
        handlerThread.start();
        this.mMessageThreadHandler = new ViewCrawlerHandler(this.mContext, handlerThread.getLooper(), str);
        this.mMainThreadHandler = new Handler(Looper.getMainLooper());
    }

    @Override // com.sensorsdata.analytics.android.sdk.visual.VTrack
    public boolean isServiceRunning() {
        return this.mServiceRunning;
    }

    @Override // com.sensorsdata.analytics.android.sdk.visual.VTrack
    public void startUpdates() {
        try {
            if (TextUtils.isEmpty(this.mFeatureCode) || TextUtils.isEmpty(this.mPostUrl)) {
                return;
            }
            ((Application) this.mContext.getApplicationContext()).registerActivityLifecycleCallbacks(this.mLifecycleCallbacks);
            this.mMessageThreadHandler.start();
            ViewCrawlerHandler viewCrawlerHandler = this.mMessageThreadHandler;
            viewCrawlerHandler.sendMessage(viewCrawlerHandler.obtainMessage(1));
            if (!this.mServiceRunning) {
                FlutterUtils.visualizedConnectionStatusChanged();
            }
            this.mServiceRunning = true;
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.visual.VTrack
    public void stopUpdates(boolean z) {
        if (z) {
            try {
                this.mFeatureCode = null;
                this.mPostUrl = null;
            } catch (Exception e2) {
                SALog.printStackTrace(e2);
                return;
            }
        }
        this.mMessageThreadHandler.removeMessages(1);
        ((Application) this.mContext.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.mLifecycleCallbacks);
        if (this.mServiceRunning) {
            FlutterUtils.visualizedConnectionStatusChanged();
            this.mServiceRunning = false;
        }
    }
}
