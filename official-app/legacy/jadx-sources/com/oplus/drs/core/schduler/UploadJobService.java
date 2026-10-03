package com.oplus.drs.core.schduler;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Process;
import com.oplus.aiunit.vision.z6b;

/* JADX INFO: loaded from: classes6.dex */
public class UploadJobService extends JobService {
    public static final String EXTRA_TRIGGER = "drs.upload.trigger";

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        StringBuilder sb = new StringBuilder();
        sb.append("onStartJob, jobId=");
        sb.append(jobParameters != null ? jobParameters.getJobId() : -1);
        sb.append(", pid=");
        sb.append(Process.myPid());
        z6b.q("UploadJobService", sb.toString());
        UploadJobScheduler.n(getApplicationContext(), jobParameters != null ? jobParameters.getJobId() : -1);
        return false;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        StringBuilder sb = new StringBuilder();
        sb.append("onStopJob, jobId=");
        sb.append(jobParameters != null ? jobParameters.getJobId() : -1);
        z6b.q("UploadJobService", sb.toString());
        return false;
    }
}
