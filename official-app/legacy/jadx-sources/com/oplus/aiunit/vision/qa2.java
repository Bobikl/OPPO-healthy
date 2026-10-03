package com.oplus.aiunit.vision;

import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bV\u0010WR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010&\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010-\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00104\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010;\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010B\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010I\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010P\u001a\u00020O8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010U¨\u0006X"}, d2 = {"Lcom/oplus/aiunit/vision/qa2;", "", "Lcom/oplus/aiunit/vision/yt9;", "operationAuth", "Lcom/oplus/aiunit/vision/yt9;", b2n.g, "()Lcom/oplus/aiunit/vision/yt9;", "t", "(Lcom/oplus/aiunit/vision/yt9;)V", "Lcom/oplus/aiunit/vision/zt9;", "operationSport", "Lcom/oplus/aiunit/vision/zt9;", "i", "()Lcom/oplus/aiunit/vision/zt9;", "u", "(Lcom/oplus/aiunit/vision/zt9;)V", "Lcom/oplus/aiunit/vision/vl9;", "account", "Lcom/oplus/aiunit/vision/vl9;", "a", "()Lcom/oplus/aiunit/vision/vl9;", LogFieldKey.MESSAGE_KEY, "(Lcom/oplus/aiunit/vision/vl9;)V", "Lcom/oplus/aiunit/vision/fp9;", "deviceSetting", "Lcom/oplus/aiunit/vision/fp9;", b2n.f, "()Lcom/oplus/aiunit/vision/fp9;", "s", "(Lcom/oplus/aiunit/vision/fp9;)V", "Lcom/oplus/aiunit/vision/ep9;", "deviceDataSync", "Lcom/oplus/aiunit/vision/ep9;", "f", "()Lcom/oplus/aiunit/vision/ep9;", "r", "(Lcom/oplus/aiunit/vision/ep9;)V", "Lcom/oplus/aiunit/vision/so9;", "dataProcess", "Lcom/oplus/aiunit/vision/so9;", "c", "()Lcom/oplus/aiunit/vision/so9;", "o", "(Lcom/oplus/aiunit/vision/so9;)V", "Lcom/oplus/aiunit/vision/so9$c;", "spData", "Lcom/oplus/aiunit/vision/so9$c;", "j", "()Lcom/oplus/aiunit/vision/so9$c;", "v", "(Lcom/oplus/aiunit/vision/so9$c;)V", "Lcom/oplus/aiunit/vision/so9$b;", "dataStore", "Lcom/oplus/aiunit/vision/so9$b;", "d", "()Lcom/oplus/aiunit/vision/so9$b;", LogFieldKey.PROCESS_NAME_KEY, "(Lcom/oplus/aiunit/vision/so9$b;)V", "Lcom/oplus/aiunit/vision/so9$d;", "syncCloudEncrypt", "Lcom/oplus/aiunit/vision/so9$d;", MapSchema.FIELD_NAME_KEY, "()Lcom/oplus/aiunit/vision/so9$d;", "w", "(Lcom/oplus/aiunit/vision/so9$d;)V", "Lcom/oplus/aiunit/vision/so9$a;", "dbDataEncrypt", "Lcom/oplus/aiunit/vision/so9$a;", MapSchema.FIELD_NAME_ENTRY, "()Lcom/oplus/aiunit/vision/so9$a;", "q", "(Lcom/oplus/aiunit/vision/so9$a;)V", "Lcom/oplus/aiunit/vision/yn9;", "common", "Lcom/oplus/aiunit/vision/yn9;", "b", "()Lcom/oplus/aiunit/vision/yn9;", "n", "(Lcom/oplus/aiunit/vision/yn9;)V", "Lcom/oplus/aiunit/vision/yn9$a;", "trackReport", "Lcom/oplus/aiunit/vision/yn9$a;", LogFieldKey.LEVEL_KEY, "()Lcom/oplus/aiunit/vision/yn9$a;", "x", "(Lcom/oplus/aiunit/vision/yn9$a;)V", "<init>", "()V", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
public final class qa2 {

    @NotNull
    public static final qa2 INSTANCE = new qa2();
    public static vl9 account;
    public static yn9 common;
    public static so9 dataProcess;
    public static so9.b dataStore;
    public static so9.a dbDataEncrypt;
    public static ep9 deviceDataSync;
    public static fp9 deviceSetting;
    public static yt9 operationAuth;
    public static zt9 operationSport;
    public static so9.c spData;
    public static so9.d syncCloudEncrypt;
    public static yn9.a trackReport;

    @NotNull
    public final vl9 a() {
        vl9 vl9Var = account;
        if (vl9Var != null) {
            return vl9Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("account");
        return null;
    }

    @NotNull
    public final yn9 b() {
        yn9 yn9Var = common;
        if (yn9Var != null) {
            return yn9Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("common");
        return null;
    }

    @NotNull
    public final so9 c() {
        so9 so9Var = dataProcess;
        if (so9Var != null) {
            return so9Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dataProcess");
        return null;
    }

    @NotNull
    public final so9.b d() {
        so9.b bVar = dataStore;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dataStore");
        return null;
    }

    @NotNull
    public final so9.a e() {
        so9.a aVar = dbDataEncrypt;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dbDataEncrypt");
        return null;
    }

    @NotNull
    public final ep9 f() {
        ep9 ep9Var = deviceDataSync;
        if (ep9Var != null) {
            return ep9Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("deviceDataSync");
        return null;
    }

    @NotNull
    public final fp9 g() {
        fp9 fp9Var = deviceSetting;
        if (fp9Var != null) {
            return fp9Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
        return null;
    }

    @NotNull
    public final yt9 h() {
        yt9 yt9Var = operationAuth;
        if (yt9Var != null) {
            return yt9Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("operationAuth");
        return null;
    }

    @NotNull
    public final zt9 i() {
        zt9 zt9Var = operationSport;
        if (zt9Var != null) {
            return zt9Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("operationSport");
        return null;
    }

    @NotNull
    public final so9.c j() {
        so9.c cVar = spData;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("spData");
        return null;
    }

    @NotNull
    public final so9.d k() {
        so9.d dVar = syncCloudEncrypt;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("syncCloudEncrypt");
        return null;
    }

    @NotNull
    public final yn9.a l() {
        yn9.a aVar = trackReport;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("trackReport");
        return null;
    }

    public final void m(@NotNull vl9 vl9Var) {
        Intrinsics.checkNotNullParameter(vl9Var, "<set-?>");
        account = vl9Var;
    }

    public final void n(@NotNull yn9 yn9Var) {
        Intrinsics.checkNotNullParameter(yn9Var, "<set-?>");
        common = yn9Var;
    }

    public final void o(@NotNull so9 so9Var) {
        Intrinsics.checkNotNullParameter(so9Var, "<set-?>");
        dataProcess = so9Var;
    }

    public final void p(@NotNull so9.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        dataStore = bVar;
    }

    public final void q(@NotNull so9.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        dbDataEncrypt = aVar;
    }

    public final void r(@NotNull ep9 ep9Var) {
        Intrinsics.checkNotNullParameter(ep9Var, "<set-?>");
        deviceDataSync = ep9Var;
    }

    public final void s(@NotNull fp9 fp9Var) {
        Intrinsics.checkNotNullParameter(fp9Var, "<set-?>");
        deviceSetting = fp9Var;
    }

    public final void t(@NotNull yt9 yt9Var) {
        Intrinsics.checkNotNullParameter(yt9Var, "<set-?>");
        operationAuth = yt9Var;
    }

    public final void u(@NotNull zt9 zt9Var) {
        Intrinsics.checkNotNullParameter(zt9Var, "<set-?>");
        operationSport = zt9Var;
    }

    public final void v(@NotNull so9.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        spData = cVar;
    }

    public final void w(@NotNull so9.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        syncCloudEncrypt = dVar;
    }

    public final void x(@NotNull yn9.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        trackReport = aVar;
    }
}
