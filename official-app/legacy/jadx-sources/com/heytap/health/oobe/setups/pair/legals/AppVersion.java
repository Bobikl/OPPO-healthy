package com.heytap.health.oobe.setups.pair.legals;

import android.os.Build;
import com.heytap.health.base.R$string;
import com.heytap.health.oobe.dto.FailOOBEKt;
import com.heytap.health.oobe.dto.OOBEFail;
import com.heytap.health.oobe.fail.OOBEException;
import com.heytap.health.oobe.repo.OOBENetSource;
import com.heytap.sporthealth.blib.data.NetResult;
import com.oplus.aiunit.vision.OldestSupprotVersion;
import com.oplus.aiunit.vision.a61;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.h6e;
import com.oplus.aiunit.vision.qe0;
import com.oplus.aiunit.vision.qtf;
import com.oplus.aiunit.vision.rpc;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.Regex;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lcom/heytap/health/oobe/setups/pair/legals/AppVersion;", "Lcom/oplus/aiunit/vision/a61;", "Lcom/oplus/aiunit/vision/h6e;", "t", "", "f", "(Lcom/oplus/aiunit/vision/h6e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
public final class AppVersion extends a61 {
    /* JADX WARN: Code duplicated, block: B:36:0x00db  */
    /* JADX WARN: Code duplicated, block: B:39:0x0149  */
    /* JADX WARN: Code duplicated, block: B:41:0x0163  */
    /* JADX WARN: Code duplicated, block: B:45:0x016e A[LOOP:0: B:37:0x0143->B:45:0x016e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x017a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0169 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:36:0x00db, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.oplus.aiunit.vision.pva
    @Nullable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Object a(@NotNull h6e h6eVar, @NotNull Continuation<? super Boolean> continuation) {
        AppVersion$trial$1 appVersion$trial$1;
        NetResult netResult;
        List<String> listSplit$default;
        List listSplit$default2;
        int i;
        String str;
        String str2;
        if (continuation instanceof AppVersion$trial$1) {
            appVersion$trial$1 = (AppVersion$trial$1) continuation;
            int i2 = appVersion$trial$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                appVersion$trial$1.label = i2 - Integer.MIN_VALUE;
            } else {
                appVersion$trial$1 = new AppVersion$trial$1(this, continuation);
            }
        } else {
            appVersion$trial$1 = new AppVersion$trial$1(this, continuation);
        }
        Object objK = appVersion$trial$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = appVersion$trial$1.label;
        int i4 = 0;
        if (i3 != 0) {
            if (i3 == 1) {
                h6eVar = (h6e) appVersion$trial$1.L$1;
                this = (AppVersion) appVersion$trial$1.L$0;
                ResultKt.throwOnFailure(objK);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this = (AppVersion) appVersion$trial$1.L$0;
                ResultKt.throwOnFailure(objK);
            }
            netResult = (NetResult) objK;
            this.e("AppVersion app version trial -> " + netResult);
            if (netResult.errorCode != 22202) {
                throw FailOOBEKt.b();
            }
            D d = netResult.body;
            Intrinsics.checkNotNull(d);
            OldestSupprotVersion oldestSupprotVersion = (OldestSupprotVersion) d;
            listSplit$default = StringsKt__StringsKt.split$default((CharSequence) oldestSupprotVersion.getVersion(), new String[]{"\\."}, false, 0, 6, (Object) null);
            String versionName = qe0.f(b78.a().getPackageName());
            Intrinsics.checkNotNullExpressionValue(versionName, "versionName");
            listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) new Regex("_").split(versionName, 2).get(0), new String[]{"\\."}, false, 0, 6, (Object) null);
            this.e("AppVersion app version trial -> oldestSupportedFullVersion :" + oldestSupprotVersion.getVersion() + "  my version " + versionName);
            for (String str3 : listSplit$default) {
                i = i4 + 1;
                str = (String) listSplit$default.get(i4);
                str2 = (String) listSplit$default2.get(i4);
                if (str2.compareTo(str) >= 0) {
                    throw FailOOBEKt.b();
                }
                if (str2.compareTo(str) > 0) {
                    return Boxing.boxBoolean(true);
                }
                i4 = i;
            }
            return Boxing.boxBoolean(true);
        }
        ResultKt.throwOnFailure(objK);
        if (!rpc.c()) {
            throw new OOBEException(new OOBEFail(null, qtf.l(R$string.lib_base_network_error), null, null, 0, null, "have no network", 61, null));
        }
        OOBENetSource oOBENetSource = OOBENetSource.INSTANCE;
        Integer numBoxInt = Boxing.boxInt(0);
        String model = h6eVar.getPairingData().getModel();
        appVersion$trial$1.L$0 = this;
        appVersion$trial$1.L$1 = h6eVar;
        appVersion$trial$1.label = 1;
        objK = oOBENetSource.k(numBoxInt, model, appVersion$trial$1);
        if (objK == coroutine_suspended) {
            return coroutine_suspended;
        }
        OldestSupprotVersion oldestSupprotVersion2 = (OldestSupprotVersion) ((NetResult) objK).body;
        this.c("AppVersion android version trial -> " + oldestSupprotVersion2);
        if (oldestSupprotVersion2 != null && oldestSupprotVersion2.getVersionNumber() <= 1000000 && Build.VERSION.SDK_INT < oldestSupprotVersion2.getVersionNumber()) {
            throw FailOOBEKt.a(oldestSupprotVersion2.getVersion());
        }
        OOBENetSource oOBENetSource2 = OOBENetSource.INSTANCE;
        Integer numBoxInt2 = Boxing.boxInt(1);
        String model2 = h6eVar.getPairingData().getModel();
        appVersion$trial$1.L$0 = this;
        appVersion$trial$1.L$1 = null;
        appVersion$trial$1.label = 2;
        objK = oOBENetSource2.k(numBoxInt2, model2, appVersion$trial$1);
        if (objK == coroutine_suspended) {
            return coroutine_suspended;
        }
        netResult = (NetResult) objK;
        this.e("AppVersion app version trial -> " + netResult);
        if (netResult.errorCode != 22202) {
            throw FailOOBEKt.b();
        }
        D d2 = netResult.body;
        Intrinsics.checkNotNull(d2);
        OldestSupprotVersion oldestSupprotVersion3 = (OldestSupprotVersion) d2;
        listSplit$default = StringsKt__StringsKt.split$default((CharSequence) oldestSupprotVersion3.getVersion(), new String[]{"\\."}, false, 0, 6, (Object) null);
        String versionName2 = qe0.f(b78.a().getPackageName());
        Intrinsics.checkNotNullExpressionValue(versionName2, "versionName");
        listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) new Regex("_").split(versionName2, 2).get(0), new String[]{"\\."}, false, 0, 6, (Object) null);
        this.e("AppVersion app version trial -> oldestSupportedFullVersion :" + oldestSupprotVersion3.getVersion() + "  my version " + versionName2);
        while (r12.hasNext()) {
            i = i4 + 1;
            str = (String) listSplit$default.get(i4);
            str2 = (String) listSplit$default2.get(i4);
            if (str2.compareTo(str) >= 0) {
                throw FailOOBEKt.b();
            }
            if (str2.compareTo(str) > 0) {
                return Boxing.boxBoolean(true);
            }
            i4 = i;
        }
        return Boxing.boxBoolean(true);
    }
}
