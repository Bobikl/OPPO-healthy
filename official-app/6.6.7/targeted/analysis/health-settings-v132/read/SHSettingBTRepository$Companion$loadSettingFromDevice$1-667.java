package com.heytap.health.settings.watch.sporthealthsettings2;

import com.google.gson.Gson;
import com.google.protobuf.InvalidProtocolBufferException;
import com.heytap.health.protocol.fitness.FitnessProto;
import com.heytap.health.protocol.fitness.FitnessProtoV2;
import com.heytap.health.settings.watch.sporthealthsettings.bean.m;
import com.oplus.aiunit.model.byk;
import com.oplus.aiunit.model.kr8;
import com.oplus.aiunit.vision.c8c;
import com.oplus.aiunit.vision.cp5;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.qr0;
import com.oplus.aiunit.vision.v2e;
import com.oplus.aiunit.vision.wl4;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes18.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u00032\u001a\u0010\u0004\u001a\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Function1;", "Lkotlin/Result;", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/m;", "", "block", "invoke", "(Lkotlin/jvm/functions/Function1;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class SHSettingBTRepository$Companion$loadSettingFromDevice$1 extends Lambda implements Function1<Function1<? super Result<? extends m>, ? extends Unit>, Unit> {
    final /* synthetic */ String $deviceMac;
    final /* synthetic */ String $deviceModel;
    final /* synthetic */ String $switchType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SHSettingBTRepository$Companion$loadSettingFromDevice$1(String str, String str2, String str3) {
        super(1);
        this.$deviceMac = str;
        this.$switchType = str2;
        this.$deviceModel = str3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(boolean z, Function1 function1, c8c.a aVar) {
        String data;
        Intrinsics.checkNotNullParameter(function1, "$block");
        Intrinsics.checkNotNullParameter(aVar, "result");
        if (!aVar.f()) {
            m8b.f("SHS-SettingBTRepository", "Load setting from device fail=" + aVar.b());
            function1.invoke(Result.box-impl(Result.constructor-impl((Object) null)));
            return;
        }
        try {
            if (z) {
                String strB = v2e.b(FitnessProtoV2.SHSettingsData.parseFrom(aVar.e().getData()));
                Intrinsics.checkNotNullExpressionValue(strB, "toJson(shsData)");
                data = StringsKt.replace$default(new Regex("_\":").replace(strB, "\":"), "aFib", "AFib", false, 4, (Object) null);
                m8b.f("SHS-SettingBTRepository", "Device sport health setting data=" + v2e.b(data));
            } else {
                FitnessProto.SHSData from = FitnessProto.SHSData.parseFrom(aVar.e().getData());
                m8b.f("SHS-SettingBTRepository", "Device sport health setting data=" + v2e.b(from));
                data = from.getData();
                Intrinsics.checkNotNullExpressionValue(data, "data.data");
            }
            if (data.length() == 0) {
                m8b.f("SHS-SettingBTRepository", "Parse device setting fail jsonData isEmpty");
                function1.invoke(Result.box-impl(Result.constructor-impl((Object) null)));
                return;
            }
            try {
                function1.invoke(Result.box-impl(Result.constructor-impl((m) new Gson().fromJson(data, m.class))));
            } catch (Exception e) {
                m8b.b("SHS-SettingBTRepository", "Parse device setting fail=" + e);
                function1.invoke(Result.box-impl(Result.constructor-impl((Object) null)));
            }
        } catch (InvalidProtocolBufferException e2) {
            m8b.f("SHS-SettingBTRepository", "Parse device shs msg msg fail=" + e2);
            function1.invoke(Result.box-impl(Result.constructor-impl((Object) null)));
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Function1<? super Result<? extends m>, Unit>) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull final Function1<? super Result<? extends m>, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "block");
        if (!Intrinsics.areEqual(this.$deviceMac, wl4.managerApi.getCurrentConnectId())) {
            function1.invoke(Result.box-impl(Result.constructor-impl((Object) null)));
            return;
        }
        FitnessProto.IntRequest intRequestBuild = FitnessProto.IntRequest.newBuilder().setValue(byk.u(this.$switchType)).build();
        final boolean zF3 = cp5.b(this.$deviceModel).F3();
        qr0.w().S(new MessageEvent(5, zF3 ? 197 : 71, intRequestBuild.toByteArray()), kr8.STEP_GOAL_MAX, new c8c() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.a
            public final void f(c8c.a aVar) {
                SHSettingBTRepository$Companion$loadSettingFromDevice$1.invoke$lambda$0(zF3, function1, aVar);
            }
        });
    }
}