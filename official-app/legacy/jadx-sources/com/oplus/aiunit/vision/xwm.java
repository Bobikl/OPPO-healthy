package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.customer.feedback.sdk.util.LogUtil;
import java.io.File;

/* JADX INFO: loaded from: classes10.dex */
public final class xwm implements Runnable {
    public final /* synthetic */ String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ywm f18784j;

    public xwm(ywm ywmVar, String str) {
        this.f18784j = ywmVar;
        this.i = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strB;
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            vwm vwmVar = vwm.feedbackd;
            vwmVar.getClass();
            synchronized (vwmVar) {
                String str = vwmVar.a;
                strB = str != null ? rwm.b(str, jCurrentTimeMillis) : "";
            }
            if (TextUtils.isEmpty(strB)) {
                LogUtil.d("feedbackc.feedbackh", "file is not exists");
                return;
            }
            File file = new File(strB);
            float length = file.length() / 1024.0f;
            if (file.exists() && length != 0.0f) {
                LogUtil.d("feedbackc.feedbackh", "file upload size is " + length);
                byte[] bArrA = this.f18784j.a(strB, this.i);
                file.delete();
                if (bArrA == null) {
                    LogUtil.d("feedbackc.feedbackh", "buf after return  = null");
                    return;
                } else {
                    LogUtil.d("feedbackc.feedbackh", "upload log return json = ".concat(new String(bArrA, "UTF-8")));
                    return;
                }
            }
            LogUtil.d("feedbackc.feedbackh", "file is not exists or file hasn't content!");
        } catch (Exception unused) {
            LogUtil.e("feedbackc.feedbackh", "startUpload Exception");
        }
    }
}
