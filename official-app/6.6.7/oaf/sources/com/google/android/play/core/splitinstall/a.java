package com.google.android.play.core.splitinstall;

import android.app.Activity;
import android.content.Context;
import android.content.IntentSender;
import androidx.annotation.NonNull;
import com.google.android.play.core.b.e;
import com.google.android.play.core.tasks.Task;
import com.oplus.oms.split.full.core.splitinstall.OplusSplitInstallManager;
import com.oplus.oms.split.full.core.splitinstall.OplusSplitInstallManagerFactory;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class a implements SplitInstallManager {
    public static WeakReference<OplusSplitInstallManager<SplitInstallSessionState>> b;
    public OplusSplitInstallManager<SplitInstallSessionState> a;

    public a(@NonNull Context context) {
        a(context);
    }

    public final void a(@NonNull Context context) {
        synchronized (a.class) {
            WeakReference<OplusSplitInstallManager<SplitInstallSessionState>> weakReference = b;
            if (weakReference == null || weakReference.get() == null) {
                this.a = OplusSplitInstallManagerFactory.create(context, new SplitInstallSessionStateFactoryImpl());
                b = new WeakReference<>(this.a);
            } else {
                this.a = b.get();
            }
        }
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    @NonNull
    public Task<Void> cancelInstall(int i) {
        return new e(this.a.cancelInstall(i));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    @NonNull
    public Task<Void> deferredInstall(List<String> list) {
        return new e(this.a.deferredInstall(list));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    @NonNull
    public Task<Void> deferredLanguageInstall(List<Locale> list) {
        return new e(this.a.deferredLanguageInstall(list));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    @NonNull
    public Task<Void> deferredLanguageUninstall(List<Locale> list) {
        return new e(this.a.deferredLanguageUninstall(list));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    @NonNull
    public Task<Void> deferredUninstall(List<String> list) {
        return new e(this.a.deferredUninstall(list));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    @NonNull
    public Set<String> getInstalledLanguages() {
        return this.a.getInstalledLanguages();
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    @NonNull
    public Set<String> getInstalledModules() {
        return this.a.getInstalledModules();
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    @NonNull
    public Task<SplitInstallSessionState> getSessionState(int i) {
        return new e(this.a.getSessionState(i));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    @NonNull
    public Task<List<SplitInstallSessionState>> getSessionStates() {
        return new e(this.a.getSessionStates());
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public void registerListener(@NonNull SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.a.registerListener(splitInstallStateUpdatedListener);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public boolean startConfirmationDialogForResult(@NonNull SplitInstallSessionState splitInstallSessionState, @NonNull Activity activity, int i) throws IntentSender.SendIntentException {
        return this.a.startConfirmationDialogForResult(splitInstallSessionState, activity, i);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    @NonNull
    public Task<Integer> startInstall(@NonNull SplitInstallRequest splitInstallRequest) {
        return new e(this.a.startInstall(splitInstallRequest));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public void unregisterListener(@NonNull SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.a.unregisterListener(splitInstallStateUpdatedListener);
    }
}
