package com.heytap.connect.api.listener;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.heytap.connect.api.logger.Logger;
import com.heytap.connect.util.NetworkUtils;
import com.heytap.connect_dns.ContextHolder;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0002\u0016\u0017B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\r\u0010\fR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/heytap/connect/api/listener/NetworkChangedReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Lcom/heytap/connect/api/listener/NetworkChangedReceiver$NetworkStatusChangedListener;", "listener", "registerListener", "(Lcom/heytap/connect/api/listener/NetworkChangedReceiver$NetworkStatusChangedListener;)V", "unRegisterListener", "", "mNetworkType", "Ljava/lang/String;", "", "mListeners", "Ljava/util/Set;", "<init>", "()V", "Companion", "NetworkStatusChangedListener", "connect_release"}, k = 1, mv = {1, 5, 1})
public final class NetworkChangedReceiver extends BroadcastReceiver {
    public static final int INTERVAL_NET_CHANGE = 500;

    @NotNull
    public static final String TAG = "NetworkChangedReceiver";

    @NotNull
    private final Set<NetworkStatusChangedListener> mListeners = new HashSet();

    @NotNull
    private String mNetworkType = "";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/heytap/connect/api/listener/NetworkChangedReceiver$NetworkStatusChangedListener;", "", "", "onNetWorkDisconnected", "()V", "", "networkType", "onNetWorkConnected", "(Ljava/lang/String;)V", "connect_release"}, k = 1, mv = {1, 5, 1})
    public interface NetworkStatusChangedListener {
        void onNetWorkConnected(@NotNull String networkType);

        void onNetWorkDisconnected();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@Nullable Context context, @Nullable Intent intent) {
        PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
        Logger logger = Logger.INSTANCE;
        Logger.d$default(logger, TAG, Intrinsics.stringPlus("onReceive, ", intent == null ? null : intent.getAction()), null, null, 12, null);
        if (Intrinsics.areEqual("android.net.conn.CONNECTIVITY_CHANGE", intent == null ? null : intent.getAction())) {
            Object systemService = context != null ? context.getSystemService("connectivity") : null;
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
            }
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                Iterator<NetworkStatusChangedListener> it = this.mListeners.iterator();
                while (it.hasNext()) {
                    it.next().onNetWorkDisconnected();
                }
                return;
            }
            String str = this.mNetworkType;
            this.mNetworkType = NetworkUtils.INSTANCE.formatNetworkType(context, activeNetworkInfo.getType());
            Logger.d$default(logger, TAG, "network change from " + str + " to " + this.mNetworkType, null, null, 12, null);
            if (Intrinsics.areEqual(str, this.mNetworkType)) {
                return;
            }
            Iterator<NetworkStatusChangedListener> it2 = this.mListeners.iterator();
            while (it2.hasNext()) {
                it2.next().onNetWorkConnected(this.mNetworkType);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0037 A[Catch: all -> 0x003e, TRY_LEAVE, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x000e, B:6:0x0023, B:9:0x002c, B:10:0x002f, B:12:0x0037), top: B:20:0x0001, inners: #0 }] */
    public final synchronized void registerListener(@NotNull NetworkStatusChangedListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.mListeners.isEmpty()) {
            NetworkUtils networkUtils = NetworkUtils.INSTANCE;
            ContextHolder contextHolder = ContextHolder.INSTANCE;
            this.mNetworkType = networkUtils.getNetType(contextHolder.getContext());
            try {
                contextHolder.getContext().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (!this.mListeners.contains(listener)) {
                this.mListeners.add(listener);
            }
        } else if (!this.mListeners.contains(listener)) {
            this.mListeners.add(listener);
        }
        throw th;
    }

    public final synchronized void unRegisterListener(@NotNull NetworkStatusChangedListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.mListeners.contains(listener)) {
            this.mListeners.remove(listener);
            if (this.mListeners.isEmpty()) {
                try {
                    ContextHolder.INSTANCE.getContext().unregisterReceiver(this);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }
}
