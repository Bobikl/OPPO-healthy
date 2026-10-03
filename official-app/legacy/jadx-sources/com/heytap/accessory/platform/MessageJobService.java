package com.heytap.accessory.platform;

import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.heytap.accessory.base.AccessoryManager;
import com.heytap.accessory.base.logging.a;
import com.heytap.accessory.misc.constants.FrameworkServiceConstants;
import com.heytap.accessory.sdk.b;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public class MessageJobService extends JobService {
    private static final long JOB_MINIMUM_LATENCY_TIME = 10000;
    private static final int MAX_MESSAGE_SENT_QUEUE_SIZE = 10;
    private static final String TAG = "MessageJobService";
    private static int count = 0;
    private static boolean isInited = false;
    private static long jobAfter = 0;
    private static long jobBegin = 0;
    private static JobInfo jobInfo = null;
    private static JobScheduler jobScheduler = null;
    private static volatile int sCurrentJobId = 1111;
    private static Map<Long, b> serviceConnectionMap;
    private static List<JobWorkItem> workItems = new ArrayList();
    private static List<CustomizeWork> customizeWorks = new ArrayList();

    public static class CustomizeWork {
        public JobWorkItem jobWorkItem;
        public long remainTime;

        @RequiresApi(api = 26)
        public CustomizeWork(JobWorkItem jobWorkItem) {
            this.jobWorkItem = jobWorkItem;
            this.remainTime = jobWorkItem.getIntent().getLongExtra("customizedTime", 0L);
        }

        public boolean ifCanStartJob() {
            long j2 = this.remainTime - 10000;
            this.remainTime = j2;
            return j2 <= 10000;
        }
    }

    public static void cancelJob(long j2) {
        a.a(TAG, "cancel connId is : " + j2);
    }

    private static int checkMessage(String str, long j2, byte[] bArr, int i) {
        b bVar = serviceConnectionMap.get(Long.valueOf(Long.parseLong(str)));
        if (bVar == null) {
            a.e(TAG, "Service connection not found for connection id : " + str);
            return 20005;
        }
        if (bVar.a(j2) == null) {
            a.e(TAG, "Channel not found for connection id : " + str + " channel : " + j2);
            return 20006;
        }
        if (bArr == null || bArr.length <= 1) {
            a.b(TAG, "Invalid data received! returning ...");
            return 2817;
        }
        if (i >= 1 && i < bArr.length) {
            return 0;
        }
        a.b(TAG, "Invalid offset received! Offset: " + i);
        return 2817;
    }

    private static boolean checkPushMessageTaskValid(Intent intent) {
        long longExtra = intent.getLongExtra(FrameworkServiceConstants.EXTRA_ACCESSORY_ID, -1L);
        return (longExtra == -1 || AccessoryManager.h().a(longExtra) == null) ? false : true;
    }

    @RequiresApi(api = 26)
    private void createNewJob() {
        if (customizeWorks.isEmpty()) {
            return;
        }
        Iterator<CustomizeWork> it = customizeWorks.iterator();
        boolean z = false;
        while (it.hasNext()) {
            CustomizeWork next = it.next();
            if (next.ifCanStartJob()) {
                jobBegin = System.currentTimeMillis();
                jobScheduler.enqueue(jobInfo, next.jobWorkItem);
                it.remove();
                z = true;
            }
        }
        if (z) {
            return;
        }
        jobBegin = System.currentTimeMillis();
        jobScheduler.enqueue(jobInfo, null);
    }

    @RequiresApi(api = 26)
    private static void handMessageByWorkInternal(JobWorkItem jobWorkItem) {
        Intent intent = jobWorkItem.getIntent();
        String stringExtra = intent.getStringExtra("connectionId");
        long longExtra = intent.getLongExtra("channelId", 0L);
        String stringExtra2 = intent.getStringExtra("data");
        byte[] bytes = stringExtra2 != null ? stringExtra2.getBytes(StandardCharsets.UTF_8) : null;
        boolean booleanExtra = intent.getBooleanExtra("isSecure", false);
        int intExtra = intent.getIntExtra("length", 0);
        int intExtra2 = intent.getIntExtra(TypedValues.CycleType.S_WAVE_OFFSET, 0);
        int intExtra3 = intent.getIntExtra("compressMode", 0);
        b bVar = stringExtra != null ? serviceConnectionMap.get(Long.valueOf(Long.parseLong(stringExtra))) : null;
        if (bVar == null) {
            if (checkPushMessageTaskValid(intent)) {
                return;
            }
            a.e(TAG, "Service connection not found for connection id : " + stringExtra + ", maybe connection has been broken");
            return;
        }
        b.d dVarA = bVar.a(longExtra);
        if (dVarA != null) {
            dVarA.a(bytes, booleanExtra, intExtra, intExtra2, intExtra3);
            return;
        }
        a.e(TAG, "Channel not found for connection id : " + stringExtra + " channel : " + longExtra);
    }

    @RequiresApi(api = 26)
    private static void handleMessageByWork(JobParameters jobParameters, List<JobWorkItem> list) {
        a.a(TAG, "handleMessageByWork");
        if (list != null) {
            Iterator<JobWorkItem> it = list.iterator();
            while (it.hasNext()) {
                handMessageByWorkInternal(it.next());
            }
        } else {
            while (true) {
                JobWorkItem jobWorkItemDequeueWork = jobParameters.dequeueWork();
                if (jobWorkItemDequeueWork == null) {
                    return;
                }
                handMessageByWorkInternal(jobWorkItemDequeueWork);
                jobParameters.completeWork(jobWorkItemDequeueWork);
            }
        }
    }

    @RequiresApi(api = 26)
    public static int scheduleJob(Context context, Map<Long, b> map, String str, long j2, byte[] bArr, boolean z, int i, int i2, int i3) {
        a.a(TAG, "scheduleJob in");
        serviceConnectionMap = map;
        int iCheckMessage = checkMessage(str, j2, bArr, i2);
        if (iCheckMessage == 0) {
            count++;
            Intent intent = new Intent();
            intent.putExtra("connectionId", str);
            intent.putExtra("channelId", j2);
            intent.putExtra("data", new String(bArr, StandardCharsets.UTF_8));
            intent.putExtra("isSecure", z);
            intent.putExtra("length", i);
            intent.putExtra(TypedValues.CycleType.S_WAVE_OFFSET, i2);
            intent.putExtra("compressMode", i3);
            JobWorkItem jobWorkItem = new JobWorkItem(intent);
            workItems.add(jobWorkItem);
            if (!isInited) {
                JobInfo.Builder builder = new JobInfo.Builder(sCurrentJobId, new ComponentName(context, (Class<?>) MessageJobService.class));
                builder.setMinimumLatency(10000L);
                builder.setOverrideDeadline(20000L);
                jobInfo = builder.build();
                jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                isInited = true;
            }
            if (count >= 10) {
                handleMessageByWork(null, workItems);
                jobScheduler.cancel(jobInfo.getId());
                count = 0;
                workItems.clear();
            } else {
                jobScheduler.enqueue(jobInfo, jobWorkItem);
            }
        }
        return iCheckMessage;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x00c8  */
    @RequiresApi(api = 26)
    public static int scheduleJobCustomize(Context context, Map<Long, b> map, String str, long j2, byte[] bArr, boolean z, int i, int i2, int i3, long j3) {
        boolean z2;
        a.a(TAG, "scheduleJob in");
        serviceConnectionMap = map;
        int iCheckMessage = checkMessage(str, j2, bArr, i2);
        if (iCheckMessage == 0) {
            Intent intent = new Intent();
            intent.putExtra("customizedTime", j3);
            intent.putExtra("connectionId", str);
            intent.putExtra("channelId", j2);
            intent.putExtra("data", new String(bArr, StandardCharsets.UTF_8));
            intent.putExtra("isSecure", z);
            intent.putExtra("length", i);
            intent.putExtra(TypedValues.CycleType.S_WAVE_OFFSET, i2);
            intent.putExtra("compressMode", i3);
            JobWorkItem jobWorkItem = new JobWorkItem(intent);
            if (j3 > 10000) {
                customizeWorks.add(new CustomizeWork(jobWorkItem));
            } else {
                if (isInited) {
                    jobAfter = System.currentTimeMillis();
                } else {
                    JobInfo.Builder builder = new JobInfo.Builder(sCurrentJobId, new ComponentName(context, (Class<?>) MessageJobService.class));
                    builder.setMinimumLatency(10000L);
                    builder.setOverrideDeadline(20000L);
                    jobInfo = builder.build();
                    jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                    isInited = true;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    jobBegin = jCurrentTimeMillis;
                    jobAfter = jCurrentTimeMillis;
                }
                if (10000 - (jobAfter - jobBegin) >= j3) {
                    jobScheduler.enqueue(jobInfo, jobWorkItem);
                    z2 = true;
                } else {
                    customizeWorks.add(new CustomizeWork(jobWorkItem));
                }
                if (!z2) {
                    JobInfo.Builder builder2 = new JobInfo.Builder(sCurrentJobId, new ComponentName(context, (Class<?>) MessageJobService.class));
                    builder2.setMinimumLatency(10000L);
                    builder2.setOverrideDeadline(20000L);
                    jobInfo = builder2.build();
                    jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                    isInited = true;
                    jobBegin = System.currentTimeMillis();
                    jobScheduler.enqueue(jobInfo, null);
                }
            }
            z2 = false;
            if (!z2) {
                JobInfo.Builder builder3 = new JobInfo.Builder(sCurrentJobId, new ComponentName(context, (Class<?>) MessageJobService.class));
                builder3.setMinimumLatency(10000L);
                builder3.setOverrideDeadline(20000L);
                jobInfo = builder3.build();
                jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                isInited = true;
                jobBegin = System.currentTimeMillis();
                jobScheduler.enqueue(jobInfo, null);
            }
        }
        return iCheckMessage;
    }

    @Override // android.app.job.JobService
    @RequiresApi(api = 26)
    public boolean onStartJob(JobParameters jobParameters) {
        a.a(TAG, "onStartJob");
        handleMessageByWork(jobParameters, null);
        createNewJob();
        return false;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        a.a(TAG, "onStopJob");
        return false;
    }
}
