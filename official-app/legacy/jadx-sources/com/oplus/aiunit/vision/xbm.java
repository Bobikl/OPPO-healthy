package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.Context;
import android.content.IntentSender;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.ArraySet;
import com.oplus.oms.split.full.core.listener.OplusStateUpdatedListener;
import com.oplus.oms.split.full.core.splitinstall.OplusSplitInstallManager;
import com.oplus.oms.split.full.core.splitinstall.OplusSplitInstallRequest;
import com.oplus.oms.split.full.core.splitinstall.OplusSplitInstallSessionState;
import com.oplus.oms.split.full.core.splitinstall.OplusSplitInstallSessionStateFactory;
import com.oplus.oms.split.full.core.tasks.OplusTask;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public class xbm<S extends OplusSplitInstallSessionState> implements OplusSplitInstallManager<S> {
    public static final String d = "SplitInstallManagerImpl";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f18569e = "shadow.bundletool.com.android.dynamic.apk.fused.modules";
    public final com.oplus.oms.split.full.core.splitinstall.a<S> a;
    public final Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final OplusSplitInstallSessionStateFactory<S> f18570c;

    public xbm(Context context, OplusSplitInstallSessionStateFactory<S> oplusSplitInstallSessionStateFactory) {
        this.b = context;
        this.f18570c = oplusSplitInstallSessionStateFactory;
        com.oplus.oms.split.full.core.splitinstall.a<S> aVar = new com.oplus.oms.split.full.core.splitinstall.a<>(context, oplusSplitInstallSessionStateFactory);
        this.a = aVar;
        l7i l7iVarE = com.oplus.oms.split.full.splitinstall.b.E();
        if (l7iVarE != null) {
            l7iVarE.i(aVar);
        }
    }

    public OplusTask<Integer> a(List<String> list) {
        w7i.e(d, "startInstall " + list, new Object[0]);
        uzm uzmVar = new uzm();
        p7i.a().execute(new lum(uzmVar, list));
        return uzmVar.a;
    }

    public final Set<String> b() {
        HashSet hashSet = new HashSet();
        try {
            Bundle bundle = this.b.getPackageManager().getApplicationInfo(this.b.getPackageName(), 128).metaData;
            if (bundle != null) {
                String string = bundle.getString(f18569e);
                if (string == null || string.isEmpty()) {
                    w7i.a(d, "App has no fused modules.", new Object[0]);
                } else {
                    Collections.addAll(hashSet, string.split(",", -1));
                    hashSet.remove("");
                }
            } else {
                w7i.a(d, "App has no applicationInfo or metaData", new Object[0]);
            }
            return hashSet;
        } catch (PackageManager.NameNotFoundException unused) {
            w7i.i(d, "App is not found in PackageManager", new Object[0]);
            return hashSet;
        }
    }

    public final Set<String> c() {
        Set<String> setB = b();
        String[] strArrE = e();
        if (strArrE == null) {
            w7i.a(d, "No splits are found or app cannot be found in package manager.", new Object[0]);
            return setB;
        }
        String string = Arrays.toString(strArrE);
        w7i.a(d, string.length() != 0 ? "Split names are: ".concat(string) : "Split names are: ", new Object[0]);
        for (String str : strArrE) {
            if (!str.startsWith("config.")) {
                setB.add(str.split("\\.config\\.")[0]);
            }
        }
        return setB;
    }

    @Override // com.oplus.oms.split.full.core.splitinstall.OplusSplitInstallManager
    public OplusTask<Void> cancelInstall(int i) {
        w7i.e(d, "cancelInstall " + i, new Object[0]);
        uzm uzmVar = new uzm();
        p7i.a().execute(new tbm(uzmVar, i));
        return uzmVar.a;
    }

    public com.oplus.oms.split.full.core.splitinstall.a<S> d() {
        return this.a;
    }

    @Override // com.oplus.oms.split.full.core.splitinstall.OplusSplitInstallManager
    public OplusTask<Void> deferredInstall(List<String> list) {
        return new uzm().a;
    }

    @Override // com.oplus.oms.split.full.core.splitinstall.OplusSplitInstallManager
    public OplusTask<Void> deferredLanguageInstall(List<Locale> list) {
        return new uzm().a;
    }

    @Override // com.oplus.oms.split.full.core.splitinstall.OplusSplitInstallManager
    public OplusTask<Void> deferredLanguageUninstall(List<Locale> list) {
        return new uzm().a;
    }

    @Override // com.oplus.oms.split.full.core.splitinstall.OplusSplitInstallManager
    public OplusTask<Void> deferredUninstall(List<String> list) {
        return new uzm().a;
    }

    public final String[] e() {
        try {
            PackageInfo packageInfo = this.b.getPackageManager().getPackageInfo(this.b.getPackageName(), 0);
            if (packageInfo != null) {
                return packageInfo.splitNames;
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            w7i.a(d, "App is not found in PackageManager", new Object[0]);
            return null;
        }
    }

    @Override // com.oplus.oms.split.full.core.splitinstall.OplusSplitInstallManager
    public Set<String> getInstalledLanguages() {
        return Collections.emptySet();
    }

    @Override // com.oplus.oms.split.full.core.splitinstall.OplusSplitInstallManager
    public Set<String> getInstalledModules() {
        ArraySet arraySet = new ArraySet();
        Set<String> setC = c();
        if (setC != null && !setC.isEmpty()) {
            arraySet.addAll(setC);
        }
        arraySet.addAll(xrm.a().a());
        return arraySet;
    }

    @Override // com.oplus.oms.split.full.core.splitinstall.OplusSplitInstallManager
    public OplusTask<S> getSessionState(int i) {
        w7i.e(d, "getSessionState " + i, new Object[0]);
        uzm uzmVar = new uzm();
        p7i.a().execute(new whm(this.f18570c, uzmVar, i));
        return uzmVar.a;
    }

    @Override // com.oplus.oms.split.full.core.splitinstall.OplusSplitInstallManager
    public OplusTask<List<S>> getSessionStates() {
        w7i.e(d, "getSessionState ", new Object[0]);
        uzm uzmVar = new uzm();
        p7i.a().execute(new rlm(this.f18570c, uzmVar));
        return uzmVar.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.oplus.oms.split.full.core.splitinstall.OplusSplitInstallManager
    public void registerListener(OplusStateUpdatedListener<S> oplusStateUpdatedListener) {
        d().d(oplusStateUpdatedListener);
    }

    @Override // com.oplus.oms.split.full.core.splitinstall.OplusSplitInstallManager
    public boolean startConfirmationDialogForResult(S s, Activity activity, int i) throws IntentSender.SendIntentException {
        if (s.status() != 8 || s.resolutionIntent() == null) {
            return false;
        }
        activity.startIntentSenderForResult(s.resolutionIntent().getIntentSender(), i, null, 0, 0, 0);
        return true;
    }

    @Override // com.oplus.oms.split.full.core.splitinstall.OplusSplitInstallManager
    public OplusTask<Integer> startInstall(OplusSplitInstallRequest oplusSplitInstallRequest) {
        return a(oplusSplitInstallRequest.getModuleNames());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.oplus.oms.split.full.core.splitinstall.OplusSplitInstallManager
    public void unregisterListener(OplusStateUpdatedListener<S> oplusStateUpdatedListener) {
        d().e(oplusStateUpdatedListener);
    }
}
