package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.heytap.health.watch.notification.impl.pull.NotificationApiService;
import com.heytap.msp.okipc.IPCMethod;
import com.heytap.msp.okipc.IPCRawCall;
import com.heytap.msp.okipc.client.Callback;
import com.heytap.msp.okipc.client.Converter;
import com.heytap.msp.okipc.client.EventListener;
import com.heytap.msp.okipc.client.ICall;
import com.heytap.msp.okipc.client.IPCClientInterceptor;
import com.heytap.msp.okipc.interceptor.Chain;
import com.oplus.drs.core.model.TrackType;
import com.oplus.drs.rom.sdk.comm.log.TrackLogger;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class ku9 {
    public static final ScheduledExecutorService h = Executors.newSingleThreadScheduledExecutor(new h());
    public com.heytap.msp.okipc.client.c b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile String f13416c;
    public volatile ScheduledFuture<?> g;
    public volatile boolean a = false;
    public volatile int d = 10;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile long f13417e = 0;
    public final Object f = new Object();

    public class a implements Callback<Integer> {
        public final /* synthetic */ ju9 a;

        public a(ju9 ju9Var) {
            this.a = ju9Var;
        }

        @Override // com.heytap.msp.okipc.client.Callback
        public void onFailure(@NonNull ICall<Integer> iCall, @NonNull Throwable th) {
            this.a.a(0, "", th);
        }

        @Override // com.heytap.msp.okipc.client.Callback
        public void onResponse(@NonNull ICall<Integer> iCall, @Nullable com.heytap.msp.okipc.client.e<Integer> eVar) {
            if (eVar == null) {
                this.a.a(-1, "empty response", null);
            } else {
                this.a.onSuccess(eVar.b);
            }
        }
    }

    public class b implements Converter<byte[], Integer> {
        public b() {
        }

        @Override // com.heytap.msp.okipc.client.Converter
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer convert(byte[] bArr) throws IOException {
            if (bArr == null) {
                return null;
            }
            String strTrim = new String(bArr, StandardCharsets.UTF_8).trim();
            if (strTrim.isEmpty()) {
                return null;
            }
            try {
                return Integer.valueOf(Integer.parseInt(strTrim));
            } catch (NumberFormatException e2) {
                throw new IOException("invalid ipcFreq format: " + strTrim, e2);
            }
        }
    }

    public class c implements Callback<String> {
        public final /* synthetic */ ju9 a;

        public c(ju9 ju9Var) {
            this.a = ju9Var;
        }

        @Override // com.heytap.msp.okipc.client.Callback
        public void onFailure(@NonNull ICall<String> iCall, @NonNull Throwable th) {
            ju9 ju9Var = this.a;
            if (ju9Var != null) {
                ju9Var.a(0, "", th);
            }
        }

        @Override // com.heytap.msp.okipc.client.Callback
        public void onResponse(@NonNull ICall<String> iCall, @Nullable com.heytap.msp.okipc.client.e<String> eVar) {
            ju9 ju9Var = this.a;
            if (ju9Var != null) {
                ju9Var.onSuccess(eVar != null ? eVar.b : null);
            }
        }
    }

    public class d implements Converter<byte[], String> {
        public d() {
        }

        @Override // com.heytap.msp.okipc.client.Converter
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String convert(byte[] bArr) {
            if (bArr == null) {
                return null;
            }
            return new String(bArr, StandardCharsets.UTF_8);
        }
    }

    public class e implements Runnable {
        public final /* synthetic */ long i;

        public e(long j2) {
            this.i = j2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (SystemClock.elapsedRealtime() - ku9.this.f13417e >= this.i) {
                    TrackLogger.h("IPCClientManager", "idle timeout reached (%d min), unbind", Integer.valueOf(ku9.this.d));
                    ku9.this.s();
                }
            } catch (Throwable th) {
                TrackLogger.d("IPCClientManager", "idle unbind task exception", th, new Object[0]);
            }
        }
    }

    public class f implements Callback<Void> {
        public f() {
        }

        @Override // com.heytap.msp.okipc.client.Callback
        public void onFailure(@NonNull ICall<Void> iCall, @NonNull Throwable th) {
            TrackLogger.d("IPCClientManager", "reportException: IPC call failed", th, new Object[0]);
        }

        @Override // com.heytap.msp.okipc.client.Callback
        public void onResponse(@NonNull ICall<Void> iCall, @Nullable com.heytap.msp.okipc.client.e<Void> eVar) {
            TrackLogger.h("IPCClientManager", "reportException: IPC call success", new Object[0]);
        }
    }

    public class g implements Converter<byte[], Void> {
        public g() {
        }

        @Override // com.heytap.msp.okipc.client.Converter
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void convert(byte[] bArr) {
            return null;
        }
    }

    public class h implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            Thread thread = new Thread(runnable, "drs-ipc-idle-unbind");
            thread.setDaemon(true);
            return thread;
        }
    }

    public class i implements IPCClientInterceptor {
        public i() {
        }

        @Override // com.heytap.msp.okipc.client.IPCClientInterceptor, com.heytap.msp.okipc.interceptor.Interceptor
        public Void intercept(Chain<com.heytap.msp.okipc.d, Void, com.heytap.msp.okipc.c> chain) {
            com.heytap.msp.okipc.d dVarRequest = chain.request();
            dVarRequest.b.a("X-Request-Id", UUID.randomUUID().toString());
            return chain.proceed(dVarRequest);
        }
    }

    public class j implements EventListener.Factory {
        public j() {
        }

        @Override // com.heytap.msp.okipc.client.EventListener.Factory
        public EventListener create(IPCRawCall iPCRawCall) {
            return new c8b();
        }
    }

    public class k implements Callback<String> {
        public final /* synthetic */ ju9 a;

        public k(ju9 ju9Var) {
            this.a = ju9Var;
        }

        @Override // com.heytap.msp.okipc.client.Callback
        public void onFailure(@NonNull ICall<String> iCall, @NonNull Throwable th) {
            ju9 ju9Var = this.a;
            if (ju9Var != null) {
                ju9Var.a(0, "RT IPC failed", th);
            }
        }

        @Override // com.heytap.msp.okipc.client.Callback
        public void onResponse(@NonNull ICall<String> iCall, @Nullable com.heytap.msp.okipc.client.e<String> eVar) {
            ju9 ju9Var = this.a;
            if (ju9Var != null) {
                ju9Var.onSuccess(eVar != null ? eVar.b : null);
            }
        }
    }

    public class l implements Converter<byte[], String> {
        public l() {
        }

        @Override // com.heytap.msp.okipc.client.Converter
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String convert(byte[] bArr) throws IOException {
            if (bArr == null) {
                return null;
            }
            return new String(bArr, StandardCharsets.UTF_8);
        }
    }

    public class m implements Callback<String> {
        public final /* synthetic */ ju9 a;

        public m(ju9 ju9Var) {
            this.a = ju9Var;
        }

        @Override // com.heytap.msp.okipc.client.Callback
        public void onFailure(@NonNull ICall<String> iCall, @NonNull Throwable th) {
            ju9 ju9Var = this.a;
            if (ju9Var != null) {
                ju9Var.a(0, "", th);
            }
        }

        @Override // com.heytap.msp.okipc.client.Callback
        public void onResponse(@NonNull ICall<String> iCall, @Nullable com.heytap.msp.okipc.client.e<String> eVar) {
            ju9 ju9Var = this.a;
            if (ju9Var != null) {
                ju9Var.onSuccess(eVar != null ? eVar.b : null);
            }
        }
    }

    public class n implements Converter<byte[], String> {
        public n() {
        }

        @Override // com.heytap.msp.okipc.client.Converter
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String convert(byte[] bArr) throws IOException {
            if (bArr == null) {
                return null;
            }
            return new String(bArr, StandardCharsets.UTF_8);
        }
    }

    public class o implements Callback<Boolean> {
        public final /* synthetic */ ju9 a;

        public o(ju9 ju9Var) {
            this.a = ju9Var;
        }

        @Override // com.heytap.msp.okipc.client.Callback
        public void onFailure(@NonNull ICall<Boolean> iCall, @NonNull Throwable th) {
            this.a.a(0, "", th);
        }

        @Override // com.heytap.msp.okipc.client.Callback
        public void onResponse(@NonNull ICall<Boolean> iCall, @Nullable com.heytap.msp.okipc.client.e<Boolean> eVar) {
            if (eVar == null) {
                this.a.a(-1, "empty response", null);
            } else {
                this.a.onSuccess(eVar.b);
            }
        }
    }

    public class p implements Converter<byte[], Boolean> {
        public p() {
        }

        @Override // com.heytap.msp.okipc.client.Converter
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean convert(byte[] bArr) throws IOException {
            if (bArr == null) {
                return null;
            }
            String strTrim = new String(bArr, StandardCharsets.UTF_8).trim();
            if (strTrim.isEmpty()) {
                return null;
            }
            return Boolean.valueOf(Boolean.parseBoolean(strTrim));
        }
    }

    public static class q {
        public static final ku9 a = new ku9();
    }

    public static ku9 f() {
        return q.a;
    }

    public final void c(Context context, TrackType trackType, String str) {
        TrackLogger.h("IPCClientManager", "target IPC pkg: %s", str);
        i iVar = new i();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(iVar);
        com.heytap.msp.okipc.client.c cVar = new com.heytap.msp.okipc.client.c(context, str, "com.oplus.framework.network.drs.action.DRS_CHANNEL", i(str), 1, com.heytap.msp.okipc.client.d.b(), com.heytap.msp.okipc.client.d.a(), arrayList);
        this.b = cVar;
        cVar.n(new j());
        this.f13416c = str;
    }

    public final void d(byte[] bArr, ju9<String> ju9Var) {
        l("/track", bArr, new n()).enqueue(new m(ju9Var));
    }

    public void e(String str, int i2, int i3, @Nullable String str2, boolean z, ju9<String> ju9Var) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appId", str);
            jSONObject.put("eventVersion", i2);
            jSONObject.put("sampleVersion", i3);
            jSONObject.put("duid", str2);
            jSONObject.put("forceFull", z);
            l("/getEventRules", jSONObject.toString().getBytes(StandardCharsets.UTF_8), new d()).enqueue(new c(ju9Var));
        } catch (JSONException e2) {
            if (ju9Var != null) {
                ju9Var.a(-1, "build request body failed", e2);
            }
        }
    }

    public void g(ju9<Integer> ju9Var) {
        l("/getIpcFreq", new byte[0], new b()).enqueue(new a(ju9Var));
    }

    public void h(String str, ju9<Boolean> ju9Var) {
        l("/getSwitchConfig", str == null ? new byte[0] : str.getBytes(StandardCharsets.UTF_8), new p()).enqueue(new o(ju9Var));
    }

    public String i(String str) {
        return NotificationApiService.CONTENT + str + ".auth.drs.channel.Provider";
    }

    public String j(Context context, TrackType trackType) {
        return (s56.g() || TrackType.DCS == trackType) ? te0.DRS_PACKAGE_NAME : context.getPackageName();
    }

    public synchronized void k(Context context, TrackType trackType) {
        if (!this.a) {
            c(context, trackType, j(context, trackType));
            this.a = true;
            return;
        }
        try {
            String strJ = j(context, trackType);
            com.heytap.msp.okipc.client.c cVar = this.b;
            if (cVar != null && strJ != null && !strJ.equals(cVar.o())) {
                TrackLogger.o("IPCClientManager", "ipc client retarget: %s -> %s", this.b.o(), strJ);
                try {
                    this.b.p();
                } catch (Throwable unused) {
                }
                c(context, trackType, strJ);
            }
        } catch (Throwable th) {
            TrackLogger.d("IPCClientManager", "initOrReinit: retarget check failed", th, new Object[0]);
        }
    }

    public final <T> ICall<T> l(String str, byte[] bArr, Converter<byte[], T> converter) {
        p();
        return new com.heytap.msp.okipc.client.b(com.heytap.msp.okipc.d.b(this.b.o(), str, IPCMethod.Service, "com.oplus.framework.network.drs.action.DRS_CHANNEL", null, bArr), this.b, converter);
    }

    public void m(@NonNull au6 au6Var) {
        if (this.b == null) {
            TrackLogger.o("IPCClientManager", "reportException: ipcClient is null, did you call init()?", new Object[0]);
        } else if (au6Var == null) {
            TrackLogger.o("IPCClientManager", "reportException: info is null", new Object[0]);
        } else {
            l("/reportException", au6Var.g().getBytes(StandardCharsets.UTF_8), new g()).enqueue(new f());
        }
    }

    public void n() {
        p();
    }

    public void o(int i2) {
        if (i2 < 1) {
            i2 = 10;
        }
        this.d = i2;
        TrackLogger.h("IPCClientManager", "setIpcIdleUnbindMinutes=%d", Integer.valueOf(i2));
    }

    public final void p() {
        this.f13417e = SystemClock.elapsedRealtime();
        long millis = TimeUnit.MINUTES.toMillis(this.d);
        if (millis <= 0) {
            return;
        }
        synchronized (this.f) {
            if (this.g != null) {
                this.g.cancel(false);
                this.g = null;
            }
            this.g = h.schedule(new e(millis), millis, TimeUnit.MILLISECONDS);
        }
    }

    public void q(byte[] bArr, ju9<String> ju9Var) {
        if (bArr != null && bArr.length != 0) {
            d(bArr, ju9Var);
        } else if (ju9Var != null) {
            ju9Var.onSuccess(null);
        }
    }

    public void r(byte[] bArr, ju9<String> ju9Var) {
        if (bArr != null && bArr.length != 0) {
            l("/trackRt", bArr, new l()).enqueue(new k(ju9Var));
        } else if (ju9Var != null) {
            ju9Var.onSuccess(null);
        }
    }

    public void s() {
        com.heytap.msp.okipc.client.c cVar = this.b;
        if (cVar != null) {
            TrackLogger.h("IPCClientManager", "unbind, result = " + cVar.p(), new Object[0]);
        }
    }
}
