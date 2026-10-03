package com.oplus.aiunit.vision;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import com.oplus.oms.split.full.common.SplitInfoData;
import com.oplus.oms.split.full.common.SplitProcessUtils;
import com.oplus.oms.split.full.core.SplitConfiguration;
import com.oplus.oms.split.full.core.splitcompat.OplusSplitCompat;
import com.oplus.oms.split.full.splitdownload.Downloader;
import com.oplus.oms.split.full.splitdownload.ISplitUpdateManager;
import com.oplus.oms.split.full.splitrequest.SplitOmsJsonLoadStrategy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public class vbm implements vhm {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f17799j = "OMSInitializer";
    public Downloader b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ISplitUpdateManager f17800c;
    public boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Class<? extends Activity> f17801e;
    public List<String> f;
    public SplitConfiguration i;
    public Set<SplitInfoData> a = new HashSet();
    public boolean g = false;
    public boolean h = false;

    public static class a {
        public static final vbm a = new vbm();
    }

    @Override // com.oplus.aiunit.vision.vhm
    public void a(Context context, SplitConfiguration splitConfiguration) {
        if (this.g) {
            return;
        }
        this.g = true;
        this.i = splitConfiguration;
        mkf.c(context.getClassLoader());
        if (splitConfiguration == null) {
            splitConfiguration = SplitConfiguration.newBuilder().build();
        }
        w7i.g(new ipm(true));
        g8i.c(new tgd(context));
        String strA = exe.a(context);
        String packageName = context.getPackageName();
        List<String> workProcesses = splitConfiguration.getWorkProcesses();
        this.f = workProcesses;
        if (workProcesses == null) {
            this.f = new ArrayList();
        }
        this.f.add(packageName);
        w7i.a(f17799j, "onAttachBaseContext - currentProcess = " + strA + " , workProcessList = " + this.f.toString(), new Object[0]);
        if (!this.f.contains(strA)) {
            Set<SplitInfoData> splitInfoDataFromProcess = SplitProcessUtils.getSplitInfoDataFromProcess(strA);
            if (splitInfoDataFromProcess != null && !splitInfoDataFromProcess.isEmpty()) {
                d(context, splitConfiguration, strA, this.f);
                this.a = splitInfoDataFromProcess;
                return;
            } else {
                w7i.i(f17799j, "the current process: + " + strA + " get the splitInfoData is empty", new Object[0]);
                return;
            }
        }
        this.b = splitConfiguration.getDownloader();
        this.f17800c = splitConfiguration.getUpdateManager();
        this.d = splitConfiguration.getQueryStartUp();
        this.f17801e = splitConfiguration.getConfirmActivityName();
        v7i.a(splitConfiguration.getSplitLoadMode());
        qpc.g(splitConfiguration.getNetWorkingType());
        qpc.h(splitConfiguration.getUpdateTimeByHours());
        z6i.b().e(splitConfiguration.getLocalFirst());
        z6i.b().d(splitConfiguration.getCustomProvider());
        SplitOmsJsonLoadStrategy splitOmsJsonLoadStrategy = SplitOmsJsonLoadStrategy.getInstance();
        splitConfiguration.getOmsJsonCustomProvider();
        splitOmsJsonLoadStrategy.setOmsJsonCustomProvider(null);
        SplitOmsJsonLoadStrategy.getInstance().setIsCustomizeOmsJsonStatus(splitConfiguration.getCustomizeOmsJsonStatus(), context);
        d(context, splitConfiguration, strA, this.f);
    }

    @Override // com.oplus.aiunit.vision.vhm
    public void b(Resources resources) {
        if (!t7i.F() || resources == null) {
            return;
        }
        t7i.E().j(resources);
    }

    @Override // com.oplus.aiunit.vision.vhm
    public void c(Application application) {
        if (this.h) {
            w7i.i(f17799j, "onApplicationCreate already called, ignore", new Object[0]);
            return;
        }
        this.h = true;
        String strA = exe.a(application);
        if (this.f == null) {
            this.f = new ArrayList();
        }
        if (this.f.contains(strA)) {
            com.oplus.oms.split.full.splitinstall.b.F(application, this.b, this.f17800c, this.f17801e, true);
            if (this.d) {
                dvk.a().b(application, this.f17800c, null);
            }
        }
    }

    public final void d(Context context, SplitConfiguration splitConfiguration, String str, List<String> list) {
        t7i.G(context, splitConfiguration.getSplitLoadMode(), str, list);
        t7i.E().e();
        t7i.E().k();
        a8i.n(context);
        OplusSplitCompat.install(context);
        ct2.b().c(splitConfiguration.getCallbackOnMainThread());
    }

    @Override // com.oplus.aiunit.vision.vhm
    public SplitConfiguration a() {
        return this.i;
    }
}
