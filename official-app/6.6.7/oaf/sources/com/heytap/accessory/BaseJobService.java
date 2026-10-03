package com.heytap.accessory;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import com.heytap.accessory.bean.PeerAgent;
import com.heytap.accessory.constant.Constants;
import com.heytap.accessory.logging.SdkLog;
import java.util.List;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@TargetApi(21)
public class BaseJobService extends JobService implements IJobListener {
    private static final int MAXIMUM_JOB_DELAY = 3000;
    private static final int REQUEST_TYPE_CONNECTION = 1;
    private static final int REQUEST_TYPE_MESSAGE = 2;
    private static final String TAG = "[SDK.BaseJobService]";
    private static volatile int sCurrentJobId;

    public static class AgentCallbackImpl implements BaseJobAgent.RequestAgentCallback {
        private JobParameters mParams;
        private int mRequestType;
        private BaseJobService mService;

        public AgentCallbackImpl(int i, JobParameters jobParameters, BaseJobService baseJobService) {
            this.mRequestType = i;
            this.mParams = jobParameters;
            this.mService = baseJobService;
        }

        @Override // com.heytap.accessory.BaseJobAgent.RequestAgentCallback
        public void onAgentAvailable(BaseJobAgent baseJobAgent) {
            SdkLog.d(BaseJobService.TAG, "onAgentAvailable");
            this.mService.onAgentCreated(this.mRequestType, baseJobAgent, this.mParams);
        }

        @Override // com.heytap.accessory.BaseJobAgent.RequestAgentCallback
        public void onError(int i, String str) {
            SdkLog.e(BaseJobService.TAG, "Request failed. Type = " + this.mRequestType + ". ErrorCode : " + i + ". ErrorMsg: " + str);
        }
    }

    private void handleConnectionRequest(JobParameters jobParameters) {
        SdkLog.d(TAG, "handleConnectionRequest ");
        requestAgent(jobParameters.getExtras().getString("agentImplclass"), new AgentCallbackImpl(1, jobParameters, this));
    }

    private void handleMessageReceived(JobParameters jobParameters) {
        SdkLog.d(TAG, "handleMessageReceived ");
        requestAgent(jobParameters.getExtras().getString("agentImplclass"), new AgentCallbackImpl(2, jobParameters, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAgentCreated(int i, BaseJobAgent baseJobAgent, JobParameters jobParameters) {
        if (i == 1) {
            baseJobAgent.handleConnectionRequest(jobParameters, this);
        }
    }

    private void requestAgent(String str, AgentCallbackImpl agentCallbackImpl) {
        BaseJobAgent.requestAgent(getApplicationContext(), str, agentCallbackImpl);
    }

    private static void scheduleJob(Context context, String str, String str2, long j, String str3, PeerAgent peerAgent) {
        SdkLog.d(TAG, "scheduleJob for class: " + str2);
        ComponentName componentName = new ComponentName(context, (Class<?>) BaseJobService.class);
        int i = sCurrentJobId;
        sCurrentJobId = i + 1;
        JobInfo.Builder builder = new JobInfo.Builder(i, componentName);
        builder.setOverrideDeadline(3000L);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString(Constants.EXTRA_INTENT_ACTION, str);
        persistableBundle.putString("agentImplclass", str2);
        persistableBundle.putLong("transactionId", j);
        persistableBundle.putString("agentId", str3);
        if (peerAgent == null) {
            persistableBundle.putStringArray("peerAgent", null);
        } else {
            List<String> content = peerAgent.getContent();
            persistableBundle.putStringArray("peerAgent", (String[]) content.toArray(new String[content.size()]));
        }
        builder.setExtras(persistableBundle);
        ((JobScheduler) context.getSystemService("jobscheduler")).schedule(builder.build());
        SdkLog.d(TAG, "Schedule a job has been executed");
    }

    public static void scheduleMessageJob(Context context, String str, long j, String str2, PeerAgent peerAgent) {
        SdkLog.d(TAG, "Schedule Message indication Job for class: " + str);
        scheduleJob(context, BaseMessage.ACTION_ACCESSORY_MESSAGE_RECEIVED, str, j, str2, peerAgent);
    }

    public static void scheduleSCJob(Context context, String str, long j, String str2, PeerAgent peerAgent) {
        SdkLog.d(TAG, "Schedule SC indication Job for class: " + str);
        scheduleJob(context, "com.heytap.accessory.action.SERVICE_CONNECTION_REQUESTED", str, j, str2, peerAgent);
    }

    @Override // android.app.Service
    public void onCreate() {
        SdkLog.d(TAG, "onCreate ");
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        SdkLog.d(TAG, "onDestroy ");
        super.onDestroy();
    }

    @Override // com.heytap.accessory.IJobListener
    public void onJobFinished(JobParameters jobParameters) {
        SdkLog.d(TAG, "onJobFinished ");
        jobFinished(jobParameters, false);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString(Constants.EXTRA_INTENT_ACTION);
        SdkLog.d(TAG, "onStartJob, action = " + string);
        if (string == null) {
            return true;
        }
        if ("com.heytap.accessory.action.SERVICE_CONNECTION_REQUESTED".equalsIgnoreCase(string)) {
            SdkLog.d(TAG, "Received incoming connection indication");
            handleConnectionRequest(jobParameters);
            return true;
        }
        if (!BaseMessage.ACTION_ACCESSORY_MESSAGE_RECEIVED.equalsIgnoreCase(string)) {
            return true;
        }
        SdkLog.d(TAG, "Received message received indication");
        handleMessageReceived(jobParameters);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        SdkLog.d(TAG, "onStopJob ");
        return true;
    }
}
