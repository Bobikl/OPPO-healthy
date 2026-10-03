package com.heytap.store.base.core.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.databinding.ViewDataBinding;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.store.base.core.state.ConstantsKt;
import com.heytap.store.base.core.util.app.AppConfig;
import com.heytap.store.base.core.util.deeplink.DeeplinkHelper;
import com.heytap.store.platform.mvvm.BaseViewModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u0000 \n*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005:\u0001\nB\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0002¨\u0006\u000b"}, d2 = {"Lcom/heytap/store/base/core/activity/StoreBackInterceptActivity;", "VM", "Lcom/heytap/store/platform/mvvm/BaseViewModel;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/databinding/ViewDataBinding;", "Lcom/heytap/store/base/core/activity/StoreSdkBaseActivity;", "()V", "finish", "", "sdkFinish", "Companion", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class StoreBackInterceptActivity<VM extends BaseViewModel, T extends ViewDataBinding> extends StoreSdkBaseActivity<VM, T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private static Function2<? super Activity, ? super Intent, Boolean> callBackToHomeInterceptor;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002RL\u0010\u0003\u001a4\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/heytap/store/base/core/activity/StoreBackInterceptActivity$Companion;", "", "()V", "callBackToHomeInterceptor", "Lkotlin/Function2;", "Landroid/app/Activity;", "Lkotlin/ParameterName;", "name", "activity", "Landroid/content/Intent;", "intent", "", "getCallBackToHomeInterceptor", "()Lkotlin/jvm/functions/Function2;", "setCallBackToHomeInterceptor", "(Lkotlin/jvm/functions/Function2;)V", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final Function2<Activity, Intent, Boolean> getCallBackToHomeInterceptor() {
            return StoreBackInterceptActivity.callBackToHomeInterceptor;
        }

        public final void setCallBackToHomeInterceptor(@Nullable Function2<? super Activity, ? super Intent, Boolean> function2) {
            StoreBackInterceptActivity.callBackToHomeInterceptor = function2;
        }
    }

    private final void sdkFinish() throws InterruptedException {
        Boolean bool = AppConfig.getInstance().sdkEnv;
        Intrinsics.checkNotNullExpressionValue(bool, "getInstance().sdkEnv");
        if (bool.booleanValue()) {
            Bundle extras = getIntent().getExtras();
            String string = extras != null ? extras.getString(ConstantsKt.BACK_TO_HOME, "") : getIntent().getStringExtra(ConstantsKt.BACK_TO_HOME);
            if (string != null && Intrinsics.areEqual(string, "1")) {
                DeeplinkHelper.INSTANCE.navigation(this, "oppostore://www.opposhop.cn/app/store/home", (252 & 4) != 0 ? null : null, (252 & 8) != 0 ? false : false, (252 & 16) != 0 ? 3 : 0, (252 & 32) != 0 ? null : null, (252 & 64) != 0 ? null : null, (252 & 128) != 0 ? null : null);
            }
        }
        super.finish();
    }

    @Override // com.heytap.store.base.core.activity.StoreBaseActivity, android.app.Activity
    public void finish() throws InterruptedException {
        Function2<? super Activity, ? super Intent, Boolean> function2 = callBackToHomeInterceptor;
        if (function2 == null) {
            sdkFinish();
            return;
        }
        boolean zBooleanValue = true;
        if (function2 != null) {
            Intent intent = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "intent");
            Boolean boolInvoke = function2.invoke(this, intent);
            if (boolInvoke != null) {
                zBooleanValue = boolInvoke.booleanValue();
            }
        }
        if (zBooleanValue) {
            super.finish();
        }
    }
}
