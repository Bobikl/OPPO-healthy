package com.oplus.aiunit.vision;

import com.heytap.health.watch.netnumber.callinterception.AbsCallInterceptionHandlerKt;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b \bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b%\u0010&J*\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0007JV\u0010\u0011\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0007J`\u0010\u0013\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0007JZ\u0010\u0018\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0007JD\u0010\u0019\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0007JZ\u0010\u001a\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0007Jb\u0010\u001e\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u0007JN\u0010 \u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u0007J0\u0010!\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0007J\u001c\u0010\"\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0007J\u001c\u0010#\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0007J\u001c\u0010$\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0007¨\u0006'"}, d2 = {"Lcom/oplus/aiunit/vision/tbe;", "", "", ebe.INPUT_PARAMETERS, "bizNode", "bizCode", "bizResult", "", "f", "errCode", "message", "partnerOrder", "payOrder", "channelId", sbe.PAY_SDK_PREPAYTOKEN, "timestamp", "canHandle", b2n.g, "expMsg", "i", "bizErrorMsg", "resultId", "failPackage", "launchModel", "d", "b", "c", "typeId", "order", AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE, b2n.f, "keyboard", "a", LogFieldKey.MESSAGE_KEY, MapSchema.FIELD_NAME_KEY, "j", LogFieldKey.LEVEL_KEY, "<init>", "()V", "paysdk_release"}, k = 1, mv = {1, 8, 0})
public final class tbe {

    @NotNull
    public static final tbe INSTANCE = new tbe();

    @JvmStatic
    public static final void a(@Nullable String bizNode, @Nullable String bizCode, @Nullable String bizResult, @Nullable String bizErrorMsg, @Nullable String order, @Nullable String prePayToken, @Nullable String keyboard) {
        ro0 ro0Var = ro0.INSTANCE;
        if (bizNode == null) {
            bizNode = "";
        }
        if (bizCode == null) {
            bizCode = "";
        }
        if (bizResult == null) {
            bizResult = "";
        }
        if (bizErrorMsg == null) {
            bizErrorMsg = "";
        }
        if (order == null) {
            order = "";
        }
        if (prePayToken == null) {
            prePayToken = "";
        }
        if (keyboard == null) {
            keyboard = "";
        }
        ro0Var.b(rbe.a(bizNode, bizCode, bizResult, bizErrorMsg, order, prePayToken, keyboard));
    }

    @JvmStatic
    public static final void b(@Nullable String inputParameters, @Nullable String bizNode, @Nullable String bizCode, @Nullable String bizResult, @Nullable String bizErrorMsg, @Nullable String launchModel) {
        ro0 ro0Var = ro0.INSTANCE;
        if (inputParameters == null) {
            inputParameters = "";
        }
        if (bizNode == null) {
            bizNode = "";
        }
        if (bizCode == null) {
            bizCode = "";
        }
        if (bizResult == null) {
            bizResult = "";
        }
        if (bizErrorMsg == null) {
            bizErrorMsg = "";
        }
        if (launchModel == null) {
            launchModel = "";
        }
        ro0Var.b(rbe.b(inputParameters, bizNode, bizCode, bizResult, bizErrorMsg, launchModel));
    }

    @JvmStatic
    public static final void c(@Nullable String inputParameters, @Nullable String bizNode, @Nullable String bizCode, @Nullable String bizResult, @Nullable String bizErrorMsg, @Nullable String resultId, @Nullable String failPackage, @Nullable String launchModel) {
        ro0 ro0Var = ro0.INSTANCE;
        if (inputParameters == null) {
            inputParameters = "";
        }
        if (bizNode == null) {
            bizNode = "";
        }
        if (bizCode == null) {
            bizCode = "";
        }
        if (bizResult == null) {
            bizResult = "";
        }
        if (bizErrorMsg == null) {
            bizErrorMsg = "";
        }
        if (resultId == null) {
            resultId = "";
        }
        if (failPackage == null) {
            failPackage = "";
        }
        if (launchModel == null) {
            launchModel = "";
        }
        ro0Var.b(rbe.c(inputParameters, bizNode, bizCode, bizResult, bizErrorMsg, resultId, failPackage, launchModel));
    }

    @JvmStatic
    public static final void d(@Nullable String inputParameters, @Nullable String bizNode, @Nullable String bizCode, @Nullable String bizResult, @Nullable String bizErrorMsg, @Nullable String resultId, @Nullable String failPackage, @Nullable String launchModel) {
        ro0 ro0Var = ro0.INSTANCE;
        if (inputParameters == null) {
            inputParameters = "";
        }
        if (bizNode == null) {
            bizNode = "";
        }
        if (bizCode == null) {
            bizCode = "";
        }
        if (bizResult == null) {
            bizResult = "";
        }
        if (bizErrorMsg == null) {
            bizErrorMsg = "";
        }
        if (resultId == null) {
            resultId = "";
        }
        if (failPackage == null) {
            failPackage = "";
        }
        if (launchModel == null) {
            launchModel = "";
        }
        ro0Var.b(rbe.d(inputParameters, bizNode, bizCode, bizResult, bizErrorMsg, resultId, failPackage, launchModel));
    }

    @JvmStatic
    public static final void f(@Nullable String inputParameters, @NotNull String bizNode, @NotNull String bizCode, @NotNull String bizResult) {
        Intrinsics.checkNotNullParameter(bizNode, "bizNode");
        Intrinsics.checkNotNullParameter(bizCode, "bizCode");
        Intrinsics.checkNotNullParameter(bizResult, "bizResult");
        ro0 ro0Var = ro0.INSTANCE;
        if (inputParameters == null) {
            inputParameters = "";
        }
        ro0Var.b(rbe.e(inputParameters, bizNode, bizCode, bizResult));
    }

    @JvmStatic
    public static final void g(@Nullable String typeId, @Nullable String bizNode, @Nullable String bizCode, @Nullable String bizResult, @Nullable String bizErrorMsg, @Nullable String order, @Nullable String prePayToken, @Nullable String errCode, @Nullable String response) {
        ro0 ro0Var = ro0.INSTANCE;
        rbe rbeVar = rbe.INSTANCE;
        String str = order == null ? "" : order;
        String str2 = prePayToken == null ? "" : prePayToken;
        if (typeId == null) {
            typeId = "";
        }
        if (bizNode == null) {
            bizNode = "";
        }
        if (bizCode == null) {
            bizCode = "";
        }
        if (bizResult == null) {
            bizResult = "";
        }
        if (bizErrorMsg == null) {
            bizErrorMsg = "";
        }
        String str3 = errCode == null ? "" : errCode;
        if (response == null) {
            response = "";
        }
        ro0Var.b(rbe.f(typeId, bizNode, bizCode, bizResult, bizErrorMsg, str3, str, str2, response));
    }

    @JvmStatic
    public static final void h(@Nullable String errCode, @Nullable String message, @Nullable String partnerOrder, @Nullable String payOrder, @Nullable String channelId, @Nullable String prePayToken, @Nullable String timestamp, @NotNull String canHandle) {
        Intrinsics.checkNotNullParameter(canHandle, "canHandle");
        ro0.INSTANCE.b(rbe.g(errCode == null ? "" : errCode, message == null ? "" : message, partnerOrder == null ? "" : partnerOrder, payOrder == null ? "" : payOrder, channelId == null ? "" : channelId, prePayToken == null ? "" : prePayToken, timestamp == null ? "" : timestamp, canHandle));
    }

    @JvmStatic
    public static final void i(@Nullable String errCode, @Nullable String message, @Nullable String partnerOrder, @Nullable String payOrder, @Nullable String channelId, @Nullable String prePayToken, @Nullable String timestamp, @NotNull String canHandle, @Nullable String expMsg) {
        Intrinsics.checkNotNullParameter(canHandle, "canHandle");
        ro0.INSTANCE.b(rbe.h(errCode == null ? "" : errCode, message == null ? "" : message, partnerOrder == null ? "" : partnerOrder, payOrder == null ? "" : payOrder, channelId == null ? "" : channelId, prePayToken == null ? "" : prePayToken, timestamp == null ? "" : timestamp, canHandle, expMsg == null ? "" : expMsg));
    }

    @JvmStatic
    public static final void j(@Nullable String bizResult, @Nullable String bizErrorMsg) {
        ro0 ro0Var = ro0.INSTANCE;
        if (bizResult == null) {
            bizResult = "";
        }
        if (bizErrorMsg == null) {
            bizErrorMsg = "";
        }
        ro0Var.b(rbe.i(bizResult, bizErrorMsg));
    }

    @JvmStatic
    public static final void k(@Nullable String bizResult, @Nullable String bizErrorMsg) {
        ro0 ro0Var = ro0.INSTANCE;
        if (bizResult == null) {
            bizResult = "";
        }
        if (bizErrorMsg == null) {
            bizErrorMsg = "";
        }
        ro0Var.b(rbe.j(bizResult, bizErrorMsg));
    }

    @JvmStatic
    public static final void l(@Nullable String bizResult, @Nullable String bizErrorMsg) {
        ro0 ro0Var = ro0.INSTANCE;
        if (bizResult == null) {
            bizResult = "";
        }
        if (bizErrorMsg == null) {
            bizErrorMsg = "";
        }
        ro0Var.b(rbe.k(bizResult, bizErrorMsg));
    }

    @JvmStatic
    public static final void m(@Nullable String bizNode, @Nullable String bizCode, @Nullable String bizResult, @Nullable String bizErrorMsg) {
        ro0 ro0Var = ro0.INSTANCE;
        if (bizNode == null) {
            bizNode = "";
        }
        if (bizCode == null) {
            bizCode = "";
        }
        if (bizResult == null) {
            bizResult = "";
        }
        if (bizErrorMsg == null) {
            bizErrorMsg = "";
        }
        ro0Var.b(rbe.l(bizNode, bizCode, bizResult, bizErrorMsg));
    }
}
