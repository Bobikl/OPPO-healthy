package com.oplus.aiunit.vision;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJN\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0007JD\u0010\f\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0007JN\u0010\r\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0007JN\u0010\u000f\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0007JX\u0010\u0011\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0007JD\u0010\u0012\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0007JD\u0010\u0013\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0007JD\u0010\u0014\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0007JD\u0010\u0015\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0007JN\u0010\u0019\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0007¨\u0006\u001c"}, d2 = {"Lcom/oplus/aiunit/vision/mde;", "", "", "failReason", "btnId", "bizNode", "bizCode", "bizResult", "bizErrorMsg", "statusId", "", "c", "e", "d", "dialogId", "f", "downloadChannel", "g", "a", "b", "h", "i", "code", rde.PAY_SDK_PREPAYTOKEN, rde.PAY_SDK_ORDER, "j", "<init>", "()V", "paysdk_download_release"}, k = 1, mv = {1, 8, 0})
public final class mde {

    @NotNull
    public static final mde INSTANCE = new mde();

    @JvmStatic
    public static final void a(@Nullable String failReason, @Nullable String dialogId, @Nullable String bizNode, @Nullable String bizCode, @Nullable String bizResult, @Nullable String bizErrorMsg) {
        ip0.INSTANCE.b(lde.a(failReason == null ? "" : failReason, dialogId == null ? "" : dialogId, bizNode == null ? "" : bizNode, bizCode == null ? "" : bizCode, bizResult == null ? "" : bizResult, bizErrorMsg == null ? "" : bizErrorMsg, ""));
    }

    @JvmStatic
    public static final void b(@Nullable String failReason, @Nullable String dialogId, @Nullable String bizNode, @Nullable String bizCode, @Nullable String bizResult, @Nullable String bizErrorMsg) {
        ip0.INSTANCE.b(lde.b(failReason == null ? "" : failReason, dialogId == null ? "" : dialogId, bizNode == null ? "" : bizNode, bizCode == null ? "" : bizCode, bizResult == null ? "" : bizResult, bizErrorMsg == null ? "" : bizErrorMsg, ""));
    }

    @JvmStatic
    public static final void c(@Nullable String failReason, @Nullable String btnId, @Nullable String bizNode, @Nullable String bizCode, @Nullable String bizResult, @Nullable String bizErrorMsg, @Nullable String statusId) {
        ip0 ip0Var = ip0.INSTANCE;
        if (failReason == null) {
            failReason = "";
        }
        if (btnId == null) {
            btnId = "";
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
        if (statusId == null) {
            statusId = "";
        }
        ip0Var.b(lde.c(failReason, btnId, bizNode, bizCode, bizResult, bizErrorMsg, statusId));
    }

    @JvmStatic
    public static final void d(@Nullable String failReason, @Nullable String btnId, @Nullable String bizNode, @Nullable String bizCode, @Nullable String bizResult, @Nullable String bizErrorMsg, @Nullable String statusId) {
        ip0 ip0Var = ip0.INSTANCE;
        if (failReason == null) {
            failReason = "";
        }
        if (btnId == null) {
            btnId = "";
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
        if (statusId == null) {
            statusId = "";
        }
        ip0Var.b(lde.d(failReason, btnId, bizNode, bizCode, bizResult, bizErrorMsg, statusId));
    }

    @JvmStatic
    public static final void e(@Nullable String failReason, @Nullable String btnId, @Nullable String bizNode, @Nullable String bizCode, @Nullable String bizResult, @Nullable String bizErrorMsg) {
        ip0 ip0Var = ip0.INSTANCE;
        if (failReason == null) {
            failReason = "";
        }
        if (btnId == null) {
            btnId = "";
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
        ip0Var.b(lde.e(failReason, btnId, bizNode, bizCode, bizResult, bizErrorMsg));
    }

    @JvmStatic
    public static final void f(@Nullable String failReason, @Nullable String bizNode, @Nullable String bizCode, @Nullable String bizResult, @Nullable String bizErrorMsg, @Nullable String statusId, @Nullable String dialogId) {
        ip0 ip0Var = ip0.INSTANCE;
        if (failReason == null) {
            failReason = "";
        }
        if (dialogId == null) {
            dialogId = "";
        }
        ip0Var.b(lde.f(failReason, dialogId, bizNode == null ? "" : bizNode, bizCode == null ? "" : bizCode, bizResult == null ? "" : bizResult, bizErrorMsg == null ? "" : bizErrorMsg, statusId != null ? statusId : ""));
    }

    @JvmStatic
    public static final void g(@Nullable String failReason, @Nullable String bizNode, @Nullable String bizCode, @Nullable String bizResult, @Nullable String bizErrorMsg, @Nullable String statusId, @Nullable String dialogId, @Nullable String downloadChannel) {
        ip0 ip0Var = ip0.INSTANCE;
        if (failReason == null) {
            failReason = "";
        }
        if (dialogId == null) {
            dialogId = "";
        }
        String str = bizNode == null ? "" : bizNode;
        String str2 = bizCode == null ? "" : bizCode;
        String str3 = bizResult == null ? "" : bizResult;
        String str4 = bizErrorMsg == null ? "" : bizErrorMsg;
        String str5 = statusId == null ? "" : statusId;
        if (downloadChannel == null) {
            downloadChannel = "";
        }
        ip0Var.b(lde.g(failReason, dialogId, str, str2, str3, str4, str5, downloadChannel));
    }

    @JvmStatic
    public static final void h(@Nullable String failReason, @Nullable String dialogId, @Nullable String bizNode, @Nullable String bizCode, @Nullable String bizResult, @Nullable String bizErrorMsg) {
        ip0.INSTANCE.b(lde.h(failReason == null ? "" : failReason, dialogId == null ? "" : dialogId, bizNode == null ? "" : bizNode, bizCode == null ? "" : bizCode, bizResult == null ? "" : bizResult, bizErrorMsg == null ? "" : bizErrorMsg, ""));
    }

    @JvmStatic
    public static final void i(@Nullable String failReason, @Nullable String dialogId, @Nullable String bizNode, @Nullable String bizCode, @Nullable String bizResult, @Nullable String bizErrorMsg) {
        ip0.INSTANCE.b(lde.i(failReason == null ? "" : failReason, dialogId == null ? "" : dialogId, bizNode == null ? "" : bizNode, bizCode == null ? "" : bizCode, bizResult == null ? "" : bizResult, bizErrorMsg == null ? "" : bizErrorMsg, ""));
    }

    @JvmStatic
    public static final void j(@Nullable String code, @Nullable String prePayToken, @Nullable String order, @Nullable String bizNode, @Nullable String bizCode, @Nullable String bizResult, @Nullable String bizErrorMsg) {
        ip0 ip0Var = ip0.INSTANCE;
        if (code == null) {
            code = "";
        }
        if (prePayToken == null) {
            prePayToken = "";
        }
        if (order == null) {
            order = "";
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
        ip0Var.b(lde.j(code, prePayToken, order, bizNode, bizCode, bizResult, bizErrorMsg));
    }
}
