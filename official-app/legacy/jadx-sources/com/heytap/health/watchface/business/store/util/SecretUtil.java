package com.heytap.health.watchface.business.store.util;

import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.qe0;
import com.oplus.aiunit.vision.t0g;
import com.oplus.aiunit.vision.vo6;
import com.oplus.aiunit.vision.y80;
import io.protostuff.MapSchema;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002J\u0006\u0010\n\u001a\u00020\u0002R\u001b\u0010\u000e\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001b\u0010\u0012\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001b\u0010\u0014\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\u0013\u0010\rR\u001b\u0010\u0016\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0015\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/heytap/health/watchface/business/store/util/SecretUtil;", "", "", LogFieldKey.LEVEL_KEY, "b", "f", MapSchema.FIELD_NAME_KEY, "d", "id", "a", "i", "Lkotlin/Lazy;", "c", "()Ljava/lang/String;", "localKey", b2n.g, "publicResKey", b2n.f, "publicRequestKey", "j", "wfPaySecretKey", MapSchema.FIELD_NAME_ENTRY, "localKeyWithRsa", "<init>", "()V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final class SecretUtil {

    @NotNull
    public static final SecretUtil INSTANCE = new SecretUtil();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Lazy localKey = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.heytap.health.watchface.business.store.util.SecretUtil$localKey$2
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return SecretUtil.INSTANCE.i();
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Lazy publicResKey = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.heytap.health.watchface.business.store.util.SecretUtil$publicResKey$2
        @Override // p010kotlin.jvm.functions.Function0
        public final String invoke() {
            return vo6.b(b78.a(), qe0.E() ? y80.WF_RES_KEY_RELEASE : y80.WF_RES_KEY_DEBUG);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy publicRequestKey = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.heytap.health.watchface.business.store.util.SecretUtil$publicRequestKey$2
        @Override // p010kotlin.jvm.functions.Function0
        public final String invoke() {
            return vo6.b(b78.a(), qe0.E() ? y80.WF_REQUEST_KEY_RELEASE : y80.WF_REQUEST_KEY_DEBUG);
        }
    });

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Lazy wfPaySecretKey = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.heytap.health.watchface.business.store.util.SecretUtil$wfPaySecretKey$2
        @Override // p010kotlin.jvm.functions.Function0
        public final String invoke() {
            return vo6.b(b78.a(), qe0.E() ? y80.WF_PAY_KEY_RELEASE : y80.WF_PAY_KEY_DEBUG);
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy localKeyWithRsa = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.heytap.health.watchface.business.store.util.SecretUtil$localKeyWithRsa$2
        @Override // p010kotlin.jvm.functions.Function0
        public final String invoke() {
            SecretUtil secretUtil = SecretUtil.INSTANCE;
            return t0g.c(secretUtil.b(), secretUtil.l());
        }
    });

    @NotNull
    public final String a(@NotNull String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        String strC = t0g.c(id, f());
        Intrinsics.checkNotNullExpressionValue(strC, "encryptByPublicKey(\n    …cPaySecretKey()\n        )");
        return strC;
    }

    @NotNull
    public final String b() {
        return c();
    }

    public final String c() {
        return (String) localKey.getValue();
    }

    @NotNull
    public final String d() {
        return e();
    }

    public final String e() {
        Object value = localKeyWithRsa.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-localKeyWithRsa>(...)");
        return (String) value;
    }

    @NotNull
    public final String f() {
        return j();
    }

    public final String g() {
        Object value = publicRequestKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-publicRequestKey>(...)");
        return (String) value;
    }

    public final String h() {
        Object value = publicResKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-publicResKey>(...)");
        return (String) value;
    }

    @NotNull
    public final String i() {
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        return StringsKt__StringsJVMKt.replace$default(string, "-", "", false, 4, (Object) null);
    }

    public final String j() {
        Object value = wfPaySecretKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-wfPaySecretKey>(...)");
        return (String) value;
    }

    @NotNull
    public final String k() {
        return g();
    }

    @NotNull
    public final String l() {
        return h();
    }
}
