package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Handler;
import android.os.Looper;
import androidx.core.content.ContextCompat;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 ?2\u00020\u0001:\u0002\u0015\rB\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u0014¢\u0006\u0004\b>\u0010\u001aJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0013\u001a\u00020\u0002H\u0002R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010!\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010%\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R\"\u0010+\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010,R\u0016\u00100\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010/R\"\u00104\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010\u001c\u001a\u0004\b2\u0010\u001e\"\u0004\b3\u0010 R$\u0010:\u001a\u0004\u0018\u0001058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u00106\u001a\u0004\b7\u00108\"\u0004\b1\u00109R\u0018\u0010=\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010<¨\u0006@"}, d2 = {"Lcom/oplus/aiunit/vision/e99;", "Lcom/oplus/aiunit/vision/f4;", "", "j", LogFieldKey.LEVEL_KEY, "Landroid/location/Location;", "location", "onLocationChanged", "", "useProvider", MapSchema.FIELD_NAME_KEY, "", "timeout", "b", "Landroid/location/LocationManager;", "d", "", "errorCode", MapSchema.FIELD_NAME_ENTRY, "f", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "context", "J", "getGpsTimeout", "()J", "setGpsTimeout", "(J)V", "gpsTimeout", "c", "getNetworkTimeout", b2n.g, "networkTimeout", "I", "getProvider", "()I", "i", "(I)V", "provider", "Ljava/lang/String;", "currentUseProvider", "", "Z", "isLocationStarted", b2n.f, "getIntervalTimeMs", "setIntervalTimeMs", "intervalTimeMs", "Lcom/oplus/aiunit/vision/e99$b;", "Lcom/oplus/aiunit/vision/e99$b;", "getLocationCallback", "()Lcom/oplus/aiunit/vision/e99$b;", "(Lcom/oplus/aiunit/vision/e99$b;)V", "locationCallback", "Landroid/os/Handler;", "Landroid/os/Handler;", "mHandler", "<init>", "Companion", "lib_base_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"MissingPermission"})
public final class e99 implements f4 {
    public static final int ERROR_DISABLE = 2;
    public static final int ERROR_PERMISSION = 1;
    public static final int ERROR_TIMEOUT = 3;
    public static final int PROVIDER_GPS = 1;
    public static final int PROVIDER_GPS_AND_NETWORK = 3;
    public static final int PROVIDER_NETWORK = 2;

    @NotNull
    public static final String TAG = "HeytapLocationClient";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public long gpsTimeout;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public long networkTimeout;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int provider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String currentUseProvider;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean isLocationStarted;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public long intervalTimeMs;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public b locationCallback;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public Handler mHandler;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/vision/e99$b;", "", "Landroid/location/Location;", "location", "", "a", "", "errorCode", "onFail", "lib_base_release"}, k = 1, mv = {1, 8, 0})
    public interface b {
        void a(@NotNull Location location);

        void onFail(int errorCode);
    }

    public e99(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.gpsTimeout = 20000L;
        this.networkTimeout = 10000L;
        this.provider = 1;
        this.currentUseProvider = f58.GPS;
        this.intervalTimeMs = 1000L;
    }

    public static final void c(long j2, e99 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        a7b.f(TAG, "On timeout， time=" + j2);
        this$0.f();
    }

    public final void b(final long timeout) {
        if (this.mHandler == null) {
            this.mHandler = new Handler(Looper.getMainLooper());
        }
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        a7b.f(TAG, "Add timeoutCheck， timeout=" + timeout);
        Handler handler2 = this.mHandler;
        if (handler2 != null) {
            handler2.postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.d99
                @Override // java.lang.Runnable
                public final void run() {
                    e99.c(timeout, this);
                }
            }, timeout);
        }
    }

    public final LocationManager d() {
        Object systemService = this.context.getSystemService("location");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        return (LocationManager) systemService;
    }

    public final void e(int errorCode) {
        l();
        b bVar = this.locationCallback;
        if (bVar != null) {
            bVar.onFail(errorCode);
        }
    }

    public final void f() {
        Location lastKnownLocation;
        if (this.provider == 3 && Intrinsics.areEqual(this.currentUseProvider, f58.GPS)) {
            this.currentUseProvider = "network";
            k("network");
            return;
        }
        if (!Intrinsics.areEqual(this.currentUseProvider, "network") || (lastKnownLocation = d().getLastKnownLocation(this.currentUseProvider)) == null || System.currentTimeMillis() - lastKnownLocation.getTime() >= 120000) {
            e(3);
            return;
        }
        a7b.f(TAG, "Use last known location, time=" + lastKnownLocation.getTime());
        onLocationChanged(lastKnownLocation);
    }

    public final void g(@Nullable b bVar) {
        this.locationCallback = bVar;
    }

    public final void h(long j2) {
        this.networkTimeout = j2;
    }

    public final void i(int i) {
        this.provider = i;
    }

    public final void j() {
        if (this.isLocationStarted) {
            return;
        }
        int i = this.provider;
        String str = f58.GPS;
        if (i != 1 && i == 2) {
            str = "network";
        }
        this.currentUseProvider = str;
        k(str);
    }

    public final void k(String useProvider) {
        if (ContextCompat.checkSelfPermission(this.context, "android.permission.ACCESS_FINE_LOCATION") != 0) {
            e(1);
            return;
        }
        if (!d().isProviderEnabled(useProvider)) {
            if (this.provider != 3 || !Intrinsics.areEqual(this.currentUseProvider, f58.GPS)) {
                e(2);
                return;
            } else {
                this.currentUseProvider = "network";
                k("network");
                return;
            }
        }
        l();
        this.isLocationStarted = true;
        d().requestLocationUpdates(useProvider, this.intervalTimeMs, 0.0f, this);
        a7b.f(TAG, "Start location currentUseProvider=" + this.currentUseProvider + " interval=" + this.intervalTimeMs + " provider=" + this.provider);
        if (Intrinsics.areEqual(useProvider, f58.GPS)) {
            b(this.gpsTimeout);
        } else if (Intrinsics.areEqual(useProvider, "network")) {
            b(this.networkTimeout);
        } else {
            a7b.b(TAG, "Unknown location provider");
        }
    }

    public final void l() {
        if (this.isLocationStarted) {
            d().removeUpdates(this);
            this.isLocationStarted = false;
        }
    }

    @Override // com.oplus.aiunit.vision.f4, android.location.LocationListener
    public void onLocationChanged(@NotNull Location location) {
        Intrinsics.checkNotNullParameter(location, "location");
        a7b.f(TAG, "removeCallbacksAndMessages");
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        b bVar = this.locationCallback;
        if (bVar != null) {
            bVar.a(location);
        }
    }
}
