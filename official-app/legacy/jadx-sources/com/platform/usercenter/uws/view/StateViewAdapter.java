package com.platform.usercenter.uws.view;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.heytap.speech.engine.constant.EngineConstant;
import com.oplus.aiunit.vision.of5;
import com.oplus.aiunit.vision.qy9;
import com.platform.usercenter.tools.log.UCLogUtil;
import com.platform.usercenter.trace.rumtime.AutoTrace;
import java.util.HashMap;

/* JADX INFO: loaded from: classes9.dex */
public class StateViewAdapter implements qy9 {
    private static final String TAG = "StateViewAdapter";

    @Override // com.oplus.aiunit.vision.qy9
    public void onCreate(@NonNull ViewGroup viewGroup, @Nullable Bundle bundle) {
    }

    @Override // com.oplus.aiunit.vision.qy9
    public void onDestroy() {
    }

    @Override // com.oplus.aiunit.vision.qy9
    public void onFindCrossDomainIssue(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4) {
        UCLogUtil.w(TAG, "originUrl:  " + str + "\n actualUrl:  " + str2 + "\n reason:  " + str3 + "\n msg:  " + str4);
        HashMap map = new HashMap();
        map.put("log_tag", "tech");
        map.put(of5.ARG_EVENT_ID, "monitor");
        map.put("type", "crossDomain");
        map.put("originUrl", str);
        map.put("actualUrl", str2);
        map.put(EngineConstant.REASON, str3);
        map.put("obus_id", "127900");
        try {
            AutoTrace.INSTANCE.get().upload(map);
        } catch (Throwable th) {
            UCLogUtil.e(TAG, th.getMessage());
        }
    }

    @Override // com.oplus.aiunit.vision.qy9
    public void onPageFinished() {
    }

    @Override // com.oplus.aiunit.vision.qy9
    public void onPageStarted() {
    }

    @Override // com.oplus.aiunit.vision.qy9
    public void onPause() {
    }

    @Override // com.oplus.aiunit.vision.qy9
    public void onProgressChanged(int i) {
    }

    @Override // com.oplus.aiunit.vision.qy9
    public void onReceivedError(int i, @NonNull CharSequence charSequence) {
    }

    @Override // com.oplus.aiunit.vision.qy9
    public void onResume() {
    }

    @Override // com.oplus.aiunit.vision.qy9
    public void onSaveInstanceState(@NonNull Bundle bundle) {
    }
}
