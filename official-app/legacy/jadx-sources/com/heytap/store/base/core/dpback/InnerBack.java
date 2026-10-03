package com.heytap.store.base.core.dpback;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.heytap.store.base.core.ativitylifecycle.ActivityCollectionManager;
import com.heytap.store.base.core.ativitylifecycle.IActivitiesLifecycleObserver;
import com.heytap.store.base.core.state.Constants;
import com.heytap.store.base.core.state.ConstantsKt;
import com.heytap.store.base.core.state.UrlConfig;
import com.heytap.store.base.core.util.app.AppConfig;
import com.heytap.store.base.core.util.deeplink.DeepLinkInterpreter;
import com.heytap.store.base.core.util.deeplink.DeeplinkHelper;
import com.heytap.store.base.core.util.deeplink.navigationcallback.NavigationCallback;
import com.heytap.store.base.core.util.statistics.StatisticsUtil;
import com.heytap.store.platform.htrouter.facade.PostCard;
import com.heytap.store.platform.tools.LogUtils;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\u0007H\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u0016J\u001e\u0010\u0011\u001a\u00020\u00072\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0012\u0010\u0019\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0012\u0010\u001a\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0012\u0010\u001b\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u001a\u0010\u001c\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001d\u001a\u00020\u0007H\u0016J\u001a\u0010\u001e\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001f\u001a\u00020\u0007H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/heytap/store/base/core/dpback/InnerBack;", "Lcom/heytap/store/base/core/dpback/IBackAPP;", "Lcom/heytap/store/base/core/ativitylifecycle/IActivitiesLifecycleObserver;", "()V", "backAPP", "Lcom/heytap/store/base/core/dpback/BackAPPInfo;", Constants.IS_BACK_CLOSE, "", "pageFilterList", "", "", "taskDone", "backIntercept", "getBackAPPInfo", "gotoTargetApp", "", "backAPPInfo", "match", "urlParams", "", "onActivityCreated", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivityStarted", "becomeActive", "onActivityStopped", "becomeInactive", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class InnerBack implements IBackAPP, IActivitiesLifecycleObserver {

    @Nullable
    private BackAPPInfo backAPP;
    private boolean isBackClose;

    @NotNull
    private List<String> pageFilterList = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"InitActivity", "NoBgWindowInitActivity", "DeepLinkInterpreterActivity", "ShortcutWrapActivity"});
    private boolean taskDone;

    @Override // com.heytap.store.base.core.dpback.IBackAPP
    public boolean backIntercept() throws InterruptedException {
        LogUtils logUtils = LogUtils.INSTANCE;
        logUtils.d("InnerBack", "backIntercept---");
        BackAPPInfo backAPPInfo = this.backAPP;
        if (TextUtils.isEmpty(backAPPInfo == null ? null : backAPPInfo.getBackUrl()) || this.isBackClose || !StatisticsUtil.hasCtaPermission) {
            return false;
        }
        logUtils.d("InnerBack", "gotoTargetApp---");
        gotoTargetApp(this.backAPP);
        return true;
    }

    @Override // com.heytap.store.base.core.dpback.IBackAPP
    @Nullable
    /* JADX INFO: renamed from: getBackAPPInfo, reason: from getter */
    public BackAPPInfo getBackAPP() {
        return this.backAPP;
    }

    @Override // com.heytap.store.base.core.dpback.IBackAPP
    public void gotoTargetApp(@Nullable BackAPPInfo backAPPInfo) throws InterruptedException {
        ActivityCollectionManager.Companion companion = ActivityCollectionManager.INSTANCE;
        final Activity topActivity = companion.getInstance().getTopActivity();
        if (topActivity != null) {
            DeeplinkHelper.INSTANCE.navigation(topActivity, backAPPInfo == null ? null : backAPPInfo.getBackUrl(), null, false, 3, null, new NavigationCallback() { // from class: com.heytap.store.base.core.dpback.InnerBack$gotoTargetApp$1$1
                @Override // com.heytap.store.base.core.util.deeplink.navigationcallback.NavigationCallback
                public void onArrival(@Nullable DeepLinkInterpreter urlInterpreter) {
                    BackAPPInfo backAPPInfo2 = this.this$0.backAPP;
                    if (backAPPInfo2 != null) {
                        backAPPInfo2.setBackUrl("");
                    }
                    topActivity.finish();
                }

                @Override // com.heytap.store.base.core.util.deeplink.navigationcallback.NavigationCallback
                public void onInterrupt(@Nullable DeepLinkInterpreter urlInterpreter) {
                    BackAPPInfo backAPPInfo2 = this.this$0.backAPP;
                    if (backAPPInfo2 != null) {
                        backAPPInfo2.setBackUrl("");
                    }
                    topActivity.finish();
                }

                @Override // com.heytap.store.base.core.util.deeplink.navigationcallback.NavigationCallback
                public void onUnArrival(@Nullable DeepLinkInterpreter urlInterpreter, @Nullable String msg) {
                    BackAPPInfo backAPPInfo2 = this.this$0.backAPP;
                    if (backAPPInfo2 != null) {
                        backAPPInfo2.setBackUrl("");
                    }
                    topActivity.finish();
                }
            }, new com.heytap.store.platform.htrouter.facade.callback.NavigationCallback() { // from class: com.heytap.store.base.core.dpback.InnerBack$gotoTargetApp$1$2
                @Override // com.heytap.store.platform.htrouter.facade.callback.NavigationCallback
                public void onArrival(@NotNull PostCard postcard) {
                    Intrinsics.checkNotNullParameter(postcard, "postcard");
                    BackAPPInfo backAPPInfo2 = this.this$0.backAPP;
                    if (backAPPInfo2 != null) {
                        backAPPInfo2.setBackUrl("");
                    }
                    topActivity.finish();
                }

                @Override // com.heytap.store.platform.htrouter.facade.callback.NavigationCallback
                public void onFound(@NotNull PostCard postcard) {
                    Intrinsics.checkNotNullParameter(postcard, "postcard");
                }

                @Override // com.heytap.store.platform.htrouter.facade.callback.NavigationCallback
                public void onInterrupt(@NotNull PostCard postcard) {
                    Intrinsics.checkNotNullParameter(postcard, "postcard");
                    BackAPPInfo backAPPInfo2 = this.this$0.backAPP;
                    if (backAPPInfo2 != null) {
                        backAPPInfo2.setBackUrl("");
                    }
                    topActivity.finish();
                }

                @Override // com.heytap.store.platform.htrouter.facade.callback.NavigationCallback
                public void onLost(@NotNull PostCard postcard) {
                    Intrinsics.checkNotNullParameter(postcard, "postcard");
                    BackAPPInfo backAPPInfo2 = this.this$0.backAPP;
                    if (backAPPInfo2 != null) {
                        backAPPInfo2.setBackUrl("");
                    }
                    topActivity.finish();
                }
            });
        }
        companion.getInstance().removeLifecycleObserver(this);
    }

    @Override // com.heytap.store.base.core.dpback.IBackAPP
    public boolean match(@Nullable Map<String, String> urlParams) {
        String str = urlParams == null ? null : urlParams.get("appBackUrl");
        this.isBackClose = Intrinsics.areEqual(urlParams != null ? urlParams.get(Constants.IS_BACK_CLOSE) : null, SpeechConstant.TRUE_STR);
        boolean z = str != null;
        BackAPPInfo backAPPInfo = new BackAPPInfo();
        this.backAPP = backAPPInfo;
        if (!z) {
            str = "";
        }
        backAPPInfo.setBackUrl(str);
        BackAPPInfo backAPPInfo2 = this.backAPP;
        if (backAPPInfo2 != null) {
            backAPPInfo2.setAllowToShow(false);
        }
        ActivityCollectionManager.INSTANCE.getInstance().addLifecycleObserver(this);
        return true;
    }

    @Override // com.heytap.store.base.core.ativitylifecycle.IActivitiesLifecycleObserver
    public void onActivityCreated(@Nullable Activity activity, @Nullable Bundle savedInstanceState) {
    }

    @Override // com.heytap.store.base.core.ativitylifecycle.IActivitiesLifecycleObserver
    public void onActivityDestroyed(@Nullable Activity activity) {
    }

    @Override // com.heytap.store.base.core.ativitylifecycle.IActivitiesLifecycleObserver
    public void onActivityPaused(@Nullable Activity activity) {
        if (this.taskDone) {
            return;
        }
        Boolean bool = AppConfig.getInstance().webBrowseMode;
        Intrinsics.checkNotNullExpressionValue(bool, "getInstance().webBrowseMode");
        if (bool.booleanValue()) {
            return;
        }
        String simpleName = activity == null ? "" : activity.getClass().getSimpleName();
        boolean z = activity != null && activity.isFinishing();
        ActivityCollectionManager.Companion companion = ActivityCollectionManager.INSTANCE;
        boolean z2 = companion.getInstance().getAliveActivitiesNumber() <= 1;
        boolean z3 = companion.getInstance().getActivity("MainActivity") == null && companion.getInstance().getActivity("NoBgWindowMainActivity") == null;
        if (UrlConfig.DEBUG) {
            Log.d("InnerBack", "onActivityPaused:activity " + activity + " size " + companion.getInstance().getAliveActivitiesNumber() + ",onlyOneAlive " + z2 + ",notMainPageAlive " + z3 + ",firstActivity" + ((Object) BackViewHelper.INSTANCE.getFirstActivity()) + ",isFinishing:" + z);
        }
        if (z) {
            BackAPPInfo backAPPInfo = this.backAPP;
            if ((TextUtils.isEmpty(backAPPInfo == null ? null : backAPPInfo.getBackUrl()) || this.isBackClose) && !this.pageFilterList.contains(simpleName) && z2) {
                if (this.isBackClose) {
                    this.taskDone = true;
                    companion.getInstance().removeLifecycleObserver(this);
                    if (activity != null) {
                        activity.moveTaskToBack(true);
                    }
                    this.isBackClose = false;
                    return;
                }
                if (z3) {
                    this.taskDone = true;
                    companion.getInstance().removeLifecycleObserver(this);
                    Intent intent = new Intent();
                    Intrinsics.checkNotNull(activity);
                    Intent className = intent.setClassName(activity, "com.oppo.store.NoBgWindowMainActivity");
                    Intrinsics.checkNotNullExpressionValue(className, "Intent().setClassName(ac….NoBgWindowMainActivity\")");
                    className.putExtra(ConstantsKt.KEY_INTENT_INNER_START, true);
                    activity.startActivity(className);
                }
            }
        }
    }

    @Override // com.heytap.store.base.core.ativitylifecycle.IActivitiesLifecycleObserver
    public void onActivityResumed(@Nullable Activity activity) {
    }

    @Override // com.heytap.store.base.core.ativitylifecycle.IActivitiesLifecycleObserver
    public void onActivityStarted(@Nullable Activity activity, boolean becomeActive) {
    }

    @Override // com.heytap.store.base.core.ativitylifecycle.IActivitiesLifecycleObserver
    public void onActivityStopped(@Nullable Activity activity, boolean becomeInactive) {
    }
}
