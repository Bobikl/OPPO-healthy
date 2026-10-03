package com.oplus.omes.srp.sysintegrity.cmm;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import androidx.annotation.Keep;
import com.oplus.aiunit.vision.hnm;
import com.oplus.aiunit.vision.lnm;
import com.oplus.omes.srp.sysintegrity.Probe;
import com.oplus.omes.srp.sysintegrity.SrpConstant;
import com.oplus.omes.srp.sysintegrity.cmm.ClientInfoV1;
import com.oplus.omes.srp.sysintegrity.util.LogUtil;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public class ClientInfoV1 {
    private static final long SAFE_STATE_INTERVAL = 300;
    private static final long UNSAFE_STATE_INTERVAL = 30;
    private static final int VERSION_V1 = 1;
    private static boolean sGathering = false;
    private static long sLastScanTime = 0;
    private static boolean sState = true;
    private String content;
    private int version = 1;

    public ClientInfoV1() {
    }

    public static ClientInfoV1 gather(final Context context) {
        hnm.a(context).b.execute(new Runnable() { // from class: com.oplus.aiunit.vision.rf3
            @Override // java.lang.Runnable
            public final void run() {
                ClientInfoV1.gatherFromLib(context);
            }
        });
        String string = context.getSharedPreferences("srpcfg", 0).getString("cliInfo", null);
        if (string != null) {
            string = new String(Base64.decode(string, 2));
        }
        return string != null ? new ClientInfoV1(string) : new ClientInfoV1("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void gatherFromLib(Context context) {
        long j2 = sState ? 300L : 30L;
        long jCurrentTimeMillis = (System.currentTimeMillis() - sLastScanTime) / 1000;
        LogUtil.d("state:" + sState + " interval:" + j2 + " delta:" + jCurrentTimeMillis);
        if (jCurrentTimeMillis >= j2 && !sGathering) {
            sGathering = true;
            sLastScanTime = System.currentTimeMillis();
            String strGather = Probe.gather(context);
            setsState(Probe.getState());
            SharedPreferences.Editor editorEdit = context.getSharedPreferences("srpcfg", 0).edit();
            editorEdit.putString("cliInfo", strGather != null ? Base64.encodeToString(strGather.getBytes(), 2) : null);
            editorEdit.apply();
            LogUtil.d(SrpConstant.DEBUG_CLIENT_INFO, strGather);
            sGathering = false;
        }
    }

    public static void setsState(boolean z) {
        sState = sState && z;
    }

    public String getContent() {
        return this.content;
    }

    public int getVersion() {
        return this.version;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setVersion(int i) {
        this.version = i;
    }

    public String toJson() {
        return lnm.c_a.toJson(this);
    }

    private ClientInfoV1(String str) {
        this.content = str;
    }
}
