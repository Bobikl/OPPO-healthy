package com.platform.sdk.center.utils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.platform.usercenter.BaseApp;
import com.platform.usercenter.tools.log.UCLogUtil;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class AcKeyguardUtils {

    public interface KeyguardDismissCallback {
        void onDismissFailed();

        void onDismissSucceeded();
    }

    public class a extends BroadcastReceiver {
        public final /* synthetic */ KeyguardDismissCallback a;

        public a(KeyguardDismissCallback keyguardDismissCallback) {
            this.a = keyguardDismissCallback;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
            UCLogUtil.d("KeyguardUtil", "onReceive = " + intent.getAction());
            if (!"android.intent.action.USER_PRESENT".equals(intent.getAction()) || AcKeyguardUtils.a(context)) {
                return;
            }
            KeyguardDismissCallback keyguardDismissCallback = this.a;
            if (keyguardDismissCallback != null) {
                keyguardDismissCallback.onDismissSucceeded();
            }
            context.unregisterReceiver(this);
        }
    }

    public static boolean a(Context context) {
        return ((KeyguardManager) context.getSystemService("keyguard")).isKeyguardLocked();
    }

    @SuppressLint({"NewApi"})
    public static void a(Context context, final KeyguardDismissCallback keyguardDismissCallback) {
        if (context == null) {
            UCLogUtil.d("KeyguardUtil", "context == null");
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setAction("com.heytap.pictorial.UnlockActivity");
            intent.setComponent(null);
            intent.setSelector(null);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
        } catch (Exception e2) {
            UCLogUtil.e("KeyguardUtil", e2);
        }
        if (context instanceof AppCompatActivity) {
            UCLogUtil.d("KeyguardUtil", "context instanceof AppCompatActivity");
            ((AppCompatActivity) context).getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.platform.sdk.center.utils.AcKeyguardUtils.1
                public final AtomicBoolean a = new AtomicBoolean(true);

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public final void onDestroy(@NonNull LifecycleOwner lifecycleOwner) {
                    UCLogUtil.d("KeyguardUtil", "onDestroy");
                    lifecycleOwner.getLifecycle().removeObserver(this);
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public final void onResume(@NonNull @NotNull LifecycleOwner lifecycleOwner) {
                    UCLogUtil.d("KeyguardUtil", "onResume");
                    if (this.a.compareAndSet(true, false)) {
                        UCLogUtil.d("KeyguardUtil", "first");
                        return;
                    }
                    if (AcKeyguardUtils.a(BaseApp.mContext)) {
                        UCLogUtil.d("KeyguardUtil", "isKeyguardLocked");
                        KeyguardDismissCallback keyguardDismissCallback2 = keyguardDismissCallback;
                        if (keyguardDismissCallback2 != null) {
                            keyguardDismissCallback2.onDismissFailed();
                        }
                    } else {
                        KeyguardDismissCallback keyguardDismissCallback3 = keyguardDismissCallback;
                        if (keyguardDismissCallback3 != null) {
                            keyguardDismissCallback3.onDismissSucceeded();
                        }
                    }
                    lifecycleOwner.getLifecycle().removeObserver(this);
                }
            });
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        a aVar = new a(keyguardDismissCallback);
        if (Build.VERSION.SDK_INT < 33) {
            context.registerReceiver(aVar, intentFilter);
        } else {
            context.registerReceiver(aVar, intentFilter, 2);
        }
    }
}
