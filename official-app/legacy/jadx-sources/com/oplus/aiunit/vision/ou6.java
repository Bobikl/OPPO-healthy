package com.oplus.aiunit.vision;

import android.os.Process;
import android.text.TextUtils;
import com.heytap.health.network.core.BaseResponse;
import com.heytap.health.network.core.exchangekey.bean.AsymmetricEncryptionBean;
import com.heytap.health.watch.netnumber.callinterception.AbsCallInterceptionHandlerKt;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 $2\u00020\u0001:\u0003\u0012\u0017\u001aB\u0011\u0012\b\u0010!\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\"\u0010#J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0019\u001a\n \u0016*\u0004\u0018\u00010\u00150\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006%"}, d2 = {"Lcom/oplus/aiunit/vision/ou6;", "", "", LogFieldKey.LEVEL_KEY, MapSchema.FIELD_NAME_KEY, "j", "", "n", "", "i", b2n.g, "", "o", b2n.f, "Lcom/heytap/health/network/core/exchangekey/bean/ExchangeSymmetricKeyRsp;", "bean", LogFieldKey.MESSAGE_KEY, "Ljava/util/concurrent/locks/ReentrantLock;", "a", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/Condition;", "kotlin.jvm.PlatformType", "b", "Ljava/util/concurrent/locks/Condition;", "condition", "c", "Ljava/lang/String;", "mSymmetricKey", "Lcom/oplus/aiunit/vision/ou6$b;", "d", "Lcom/oplus/aiunit/vision/ou6$b;", "mCallback", "callback", "<init>", "(Lcom/oplus/aiunit/vision/ou6$b;)V", "Companion", "lib_base_release"}, k = 1, mv = {1, 8, 0})
public final class ou6 {

    @NotNull
    public static final String APP_KEY_VERSION = "1732499446015";

    @NotNull
    public static final String APP_KEY_VERSION_TEST = "1732499446015";
    public static final int ENCRYPTION_ALGORITHM = 4;
    public static final long MAX_JITTER_MIN = 120;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ReentrantLock lock;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final Condition condition;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public volatile String mSymmetricKey;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public b mCallback;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final ConcurrentHashMap<String, String> f15060e = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.ou6$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\tR\u0014\u0010\u0012\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/ou6$a;", "", "Ljava/util/concurrent/ConcurrentHashMap;", "", "SymmetricKeyMap", "Ljava/util/concurrent/ConcurrentHashMap;", "a", "()Ljava/util/concurrent/ConcurrentHashMap;", "APP_KEY_VERSION", "Ljava/lang/String;", "APP_KEY_VERSION_TEST", "", "ENCRYPTION_ALGORITHM", "I", "", "MAX_JITTER_MIN", "J", "SYMMETRIC_KEY", "TAG", "<init>", "()V", "lib_base_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ConcurrentHashMap<String, String> a() {
            return ou6.f15060e;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¨\u0006\u0007"}, d2 = {"Lcom/oplus/aiunit/vision/ou6$b;", "", "", "onSuccess", "", "msg", "onFail", "lib_base_release"}, k = 1, mv = {1, 8, 0})
    public interface b {
        void onFail(@Nullable String msg);

        void onSuccess();
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0014\u0010\f\u001a\u00020\u00042\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0016¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/ou6$c;", "Lcom/oplus/aiunit/vision/u61;", "Lcom/heytap/health/network/core/exchangekey/bean/ExchangeSymmetricKeyRsp;", "result", "", MapSchema.FIELD_NAME_ENTRY, "", "", "errMsg", "b", "Lcom/heytap/health/network/core/BaseResponse;", AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE, "a", "<init>", "(Lcom/oplus/aiunit/vision/ou6;)V", "lib_base_release"}, k = 1, mv = {1, 8, 0})
    public final class c extends u61<AsymmetricEncryptionBean> {
        public c() {
        }

        @Override // com.oplus.aiunit.vision.u61
        public void a(@NotNull BaseResponse<?> response) {
            Intrinsics.checkNotNullParameter(response, "response");
            StringBuilder sb = new StringBuilder();
            sb.append("onErrorResponse response=");
            sb.append(response);
            if (response.getErrorCode() == 22702) {
                Object body = response.getBody();
                if (body instanceof AsymmetricEncryptionBean) {
                    ou6.this.m((AsymmetricEncryptionBean) body);
                }
            }
        }

        @Override // com.oplus.aiunit.vision.u61
        public void b(@NotNull Throwable e2, @NotNull String errMsg) {
            Intrinsics.checkNotNullParameter(e2, "e");
            Intrinsics.checkNotNullParameter(errMsg, "errMsg");
            a7b.c("ExchangeSymmetricKeyRequester", e2.getMessage(), e2);
            ou6.this.lock.lock();
            try {
                try {
                    b bVar = ou6.this.mCallback;
                    if (bVar != null) {
                        bVar.onFail("getQueryKey() onError e = " + e2);
                    }
                    ou6.this.condition.signalAll();
                } catch (Exception e3) {
                    a7b.b("ExchangeSymmetricKeyRequester", "exchangeSymmetricKey() onFailure e: " + e3.getMessage());
                }
            } finally {
                ou6.this.lock.unlock();
            }
        }

        @Override // com.oplus.aiunit.vision.u61
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void d(@NotNull AsymmetricEncryptionBean result) {
            Intrinsics.checkNotNullParameter(result, "result");
            StringBuilder sb = new StringBuilder();
            sb.append("onNext result = ");
            sb.append(result);
            a7b.f("ExchangeSymmetricKeyRequester", "exchangeSymmetricKey() success");
            ou6.this.lock.lock();
            try {
                try {
                    ou6.this.mSymmetricKey = result.getSymmetricKey();
                    Companion companion = ou6.INSTANCE;
                    companion.a().clear();
                    companion.a().put("SymmetricKey", result.getSymmetricKey());
                    v9g v9gVarX = v9g.x("EXCHANGE_SYMMETRIC_KEY");
                    v9gVarX.U("symmetric_key", result.getSymmetricKey());
                    v9gVarX.S("change_key_date", v05.i(System.currentTimeMillis()));
                    v9gVarX.T("refresh_jitter_ms", ThreadLocalRandom.current().nextLong(7200000L));
                    b bVar = ou6.this.mCallback;
                    if (bVar != null) {
                        bVar.onSuccess();
                    }
                    ou6.this.condition.signalAll();
                } catch (Exception e2) {
                    a7b.b("ExchangeSymmetricKeyRequester", "exchangeSymmetricKey() success e: " + e2.getMessage());
                }
            } finally {
                ou6.this.lock.unlock();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/heytap/health/network/core/BaseResponse;", "Lcom/heytap/health/network/core/exchangekey/bean/ExchangeSymmetricKeyRsp;", "weightCalResultRspBaseResponse", "", "a", "(Lcom/heytap/health/network/core/BaseResponse;)Z"}, k = 3, mv = {1, 8, 0})
    public static final class d<T> implements mpe {
        public final /* synthetic */ int[] i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ int[] f15062j;

        public d(int[] iArr, int[] iArr2) {
            this.i = iArr;
            this.f15062j = iArr2;
        }

        @Override // com.oplus.aiunit.vision.mpe
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final boolean test(@NotNull BaseResponse<AsymmetricEncryptionBean> weightCalResultRspBaseResponse) {
            Intrinsics.checkNotNullParameter(weightCalResultRspBaseResponse, "weightCalResultRspBaseResponse");
            this.i[0] = weightCalResultRspBaseResponse.getErrorCode();
            int[] iArr = this.f15062j;
            iArr[0] = iArr[0] + 1;
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/oplus/aiunit/vision/lbd;", "", "objectObservable", "Lcom/oplus/aiunit/vision/jdd;", "a", "(Lcom/oplus/aiunit/vision/lbd;)Lcom/oplus/aiunit/vision/jdd;"}, k = 3, mv = {1, 8, 0})
    public static final class e<T, R> implements d08 {
        public final /* synthetic */ int[] i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ int[] f15063j;
        public final /* synthetic */ Map<String, Object> k;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "it", "Lcom/oplus/aiunit/vision/jdd;", "", "a", "(Ljava/lang/Object;)Lcom/oplus/aiunit/vision/jdd;"}, k = 3, mv = {1, 8, 0})
        public static final class a<T, R> implements d08 {
            public final /* synthetic */ int[] i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ int[] f15064j;
            public final /* synthetic */ Map<String, Object> k;

            public a(int[] iArr, int[] iArr2, Map<String, Object> map) {
                this.i = iArr;
                this.f15064j = iArr2;
                this.k = map;
            }

            @Override // com.oplus.aiunit.vision.d08
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final jdd<? extends Long> apply(@NotNull Object it) {
                int i;
                Intrinsics.checkNotNullParameter(it, "it");
                if (this.i[0] == 0 || (i = this.f15064j[0]) > 5) {
                    return lbd.m0();
                }
                Map<String, Object> map = this.k;
                StringBuilder sb = new StringBuilder();
                sb.append("exchangeSymmetricKey para: ");
                sb.append(map);
                sb.append(", repeat time: ");
                sb.append(i);
                return lbd.b1(500L, TimeUnit.MILLISECONDS);
            }
        }

        public e(int[] iArr, int[] iArr2, Map<String, Object> map) {
            this.i = iArr;
            this.f15063j = iArr2;
            this.k = map;
        }

        @Override // com.oplus.aiunit.vision.d08
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final jdd<?> apply(@NotNull lbd<Object> objectObservable) {
            Intrinsics.checkNotNullParameter(objectObservable, "objectObservable");
            return objectObservable.Q(new a(this.i, this.f15063j, this.k));
        }
    }

    public ou6(@Nullable b bVar) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.condition = reentrantLock.newCondition();
        this.mSymmetricKey = "";
        this.mCallback = bVar;
    }

    public final String g() {
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        return StringsKt__StringsJVMKt.replace$default(string, "-", "", false, 4, (Object) null);
    }

    public final String h() {
        ConcurrentHashMap<String, String> concurrentHashMap = f15060e;
        String str = concurrentHashMap.get("SymmetricKey");
        if (!(str == null || str.length() == 0)) {
            return str;
        }
        String strE = v9g.x("EXCHANGE_SYMMETRIC_KEY").E("symmetric_key", "");
        if (strE.length() > 0) {
            concurrentHashMap.put("SymmetricKey", strE);
        }
        return strE;
    }

    public final long i() {
        v9g v9gVarX = v9g.x("EXCHANGE_SYMMETRIC_KEY");
        long jB = v9gVarX.B("refresh_jitter_ms", -1L);
        boolean z = false;
        if (0 <= jB && jB < 7200000) {
            z = true;
        }
        if (z) {
            a7b.f("ExchangeSymmetricKeyRequester", "getOrInitJitterMs = " + jB);
            return jB;
        }
        long jNextLong = ThreadLocalRandom.current().nextLong(7200000L);
        v9gVarX.T("refresh_jitter_ms", jNextLong);
        a7b.f("ExchangeSymmetricKeyRequester", "getOrInitJitterMs = " + jNextLong);
        return jNextLong;
    }

    @NotNull
    public final String j() {
        String publicKey = v9g.x("EXCHANGE_SYMMETRIC_KEY").D("key_public_key");
        if (TextUtils.isEmpty(publicKey)) {
            publicKey = vo6.b(b78.a(), y80.EXCHANGE_KEY_RSA_PUB_KEY);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("getPublicKey | publicKey = ");
        sb.append(publicKey);
        Intrinsics.checkNotNullExpressionValue(publicKey, "publicKey");
        return publicKey;
    }

    @NotNull
    public final String k() {
        String version = v9g.x("EXCHANGE_SYMMETRIC_KEY").D("key_public_key_version");
        qe0.E();
        StringBuilder sb = new StringBuilder();
        sb.append("getPublicKeyVersion | version=");
        sb.append(version);
        sb.append(" Constants.APP_KEY_VERSION=");
        sb.append("1732499446015");
        if (TextUtils.isEmpty(version)) {
            version = "1732499446015";
        }
        Intrinsics.checkNotNullExpressionValue(version, "version");
        return version;
    }

    @NotNull
    public final String l() {
        this.mSymmetricKey = h();
        a7b.f("ExchangeSymmetricKeyRequester", "getSymmetricKeyAwait");
        String str = this.mSymmetricKey;
        StringBuilder sb = new StringBuilder();
        sb.append("getSymmetricKeyAwait mSymmetricKey = ");
        sb.append(str);
        if ((this.mSymmetricKey.length() == 0) || n()) {
            synchronized (ou6.class) {
                a7b.f("ExchangeSymmetricKeyRequester", "getSymmetricKeyAwait LOCK, process = " + gxe.c() + ", thread = " + Thread.currentThread().getName());
                o();
                Unit unit = Unit.INSTANCE;
            }
        }
        return this.mSymmetricKey;
    }

    public final void m(AsymmetricEncryptionBean bean) {
        StringBuilder sb = new StringBuilder();
        sb.append("handlePublicKeyExpired | bean=");
        sb.append(bean);
        v9g.x("EXCHANGE_SYMMETRIC_KEY").U("key_public_key_version", String.valueOf(bean.getPublicKeyVersion()));
        v9g.x("EXCHANGE_SYMMETRIC_KEY").U("key_public_key", bean.getPublicKey());
    }

    public final boolean n() {
        return System.currentTimeMillis() >= (v05.a(v9g.x("EXCHANGE_SYMMETRIC_KEY").y("change_key_date")) + 86400000) + i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.concurrent.locks.ReentrantLock] */
    public final void o() {
        this.lock.lock();
        try {
            try {
                String strG = g();
                a7b.f("ExchangeSymmetricKeyRequester", "requestKeyAwait | symmetricKey=" + strG + " process=" + gxe.c() + " thread=" + Thread.currentThread().getName() + " pid=" + Process.myPid());
                Object objM = com.heytap.health.network.core.a.m(pu6.class);
                Intrinsics.checkNotNullExpressionValue(objM, "getExchangeKeyApi(\n     …:class.java\n            )");
                pu6 pu6Var = (pu6) objM;
                int[] iArr = {0};
                int[] iArr2 = {0};
                HashMap map = new HashMap();
                map.put("encryptionAlgorithm", 4);
                map.put("symmetricKey", strG);
                map.put("firstExchangeKey", 1);
                String strE = ilj.e();
                if (strE == null) {
                    strE = ilj.DEFAULT_ANDROID_ID;
                }
                map.put("mobileUniqueId", strE);
                pu6Var.a(map).P(new d(iArr2, iArr)).y0(new e(iArr2, iArr, map)).L0(hfg.d()).n0(hfg.d()).subscribe(new c());
                this.condition.await(20000L, TimeUnit.MILLISECONDS);
            } catch (Exception e2) {
                a7b.b("ExchangeSymmetricKeyRequester", "request key e: " + e2.getMessage());
            }
        } finally {
            this.lock.unlock();
        }
    }
}
