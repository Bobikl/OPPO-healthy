package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes15.dex */
public class rdf {

    @TargetApi(33)
    public static final int RECEIVER_EXPORTED = 2;

    @TargetApi(33)
    public static final int RECEIVER_NOT_EXPORTED = 4;
    public static final int RECEIVER_VISIBLE_TO_INSTANT_APPS = 1;

    @Nullable
    @SuppressLint({"HealthLint_AndroidReceiverDetector", "UnspecifiedRegisterReceiverFlag"})
    public static Intent a(@NonNull Context context, @Nullable BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        return (Build.VERSION.SDK_INT >= 33 || i == 1) ? context.registerReceiver(broadcastReceiver, intentFilter, i) : context.registerReceiver(broadcastReceiver, intentFilter);
    }

    @Nullable
    @SuppressLint({"HealthLint_AndroidReceiverDetector", "UnspecifiedRegisterReceiverFlag"})
    public static Intent b(@NonNull Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, @Nullable String str, @Nullable Handler handler, int i) {
        return (Build.VERSION.SDK_INT >= 33 || i == 1) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i) : context.registerReceiver(broadcastReceiver, intentFilter, str, handler);
    }

    public static void c(Context context, BroadcastReceiver broadcastReceiver) {
        context.unregisterReceiver(broadcastReceiver);
    }
}
