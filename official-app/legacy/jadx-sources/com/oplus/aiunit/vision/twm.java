package com.oplus.aiunit.vision;

import android.os.Bundle;
import android.os.olc.OlcManager;
import com.customer.feedback.sdk.feedbacka;
import com.customer.feedback.sdk.util.LogUtil;
import com.oplus.os.OplusBuild;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class twm {
    @JvmStatic
    public static final boolean a() {
        boolean z;
        Object objM5287constructorimpl;
        boolean z2 = false;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (OplusBuild.VERSION.SDK_VERSION < 33) {
                LogUtil.d("LogKitUtil", "canSendToLogKit: isBelow 14.1");
                return false;
            }
            if (kwm.l()) {
                LogUtil.d("LogKitUtil", "canSendToLogKit: isExpVersion");
                return false;
            }
            boolean z3 = feedbacka.f2200e;
            try {
                objM5287constructorimpl = Result.m5287constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                z = z3;
                th = th;
                Result.Companion companion2 = Result.INSTANCE;
                boolean z4 = z;
                objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
                z3 = z4;
            }
            Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
            if (thM5290exceptionOrNullimpl != null) {
                LogUtil.e("LogKitUtil", "sendEvent error:" + thM5290exceptionOrNullimpl.getMessage());
            } else {
                z2 = z3;
            }
            LogUtil.d("LogKitUtil", "canSendToLogKit: " + z2);
            return z2;
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
    }

    @JvmStatic
    public static final void b(Bundle bundle) {
        Object objM5287constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            LogUtil.d("LogKitUtil", "sendEvent result:" + OlcManager.sendEvent(bundle));
            objM5287constructorimpl = Result.m5287constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            LogUtil.e("LogKitUtil", "sendEvent error:" + thM5290exceptionOrNullimpl.getMessage());
        }
    }

    @JvmStatic
    public static final void c(@Nullable String str) {
        Object objM5287constructorimpl;
        if (!a()) {
            LogUtil.d("LogKitUtil", "Not SupportLogKit");
            return;
        }
        if (str != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle = new Bundle();
                bundle.putString("eventName", "collectLitLog");
                String feedbackId = jSONObject.optString("fid");
                StringBuilder sb = new StringBuilder("feedbackId: ");
                Intrinsics.checkNotNullExpressionValue(feedbackId, "feedbackId");
                boolean z = true;
                sb.append(feedbackId.length() > 0);
                LogUtil.d("LogKitUtil", sb.toString());
                if (feedbackId.length() > 0) {
                    bundle.putString("feedbackId", feedbackId);
                }
                String errorType = jSONObject.optString("errorType");
                StringBuilder sb2 = new StringBuilder("errorType: ");
                Intrinsics.checkNotNullExpressionValue(errorType, "errorType");
                sb2.append(errorType.length() > 0);
                LogUtil.d("LogKitUtil", sb2.toString());
                if (errorType.length() > 0) {
                    bundle.putString("errorTypeStr", errorType);
                }
                String description = jSONObject.optString(iim.a.f);
                StringBuilder sb3 = new StringBuilder("description: ");
                Intrinsics.checkNotNullExpressionValue(description, "description");
                sb3.append(description.length() > 0);
                LogUtil.d("LogKitUtil", sb3.toString());
                if (description.length() > 0) {
                    bundle.putString(iim.a.f, description);
                }
                JSONArray attachmentList = jSONObject.optJSONArray("attachmentList");
                if (attachmentList != null) {
                    Intrinsics.checkNotNullExpressionValue(attachmentList, "attachmentList");
                    ArrayList<String> arrayList = new ArrayList<>();
                    int length = attachmentList.length();
                    for (int i = 0; i < length; i++) {
                        arrayList.add(attachmentList.optString(i));
                    }
                    LogUtil.d("LogKitUtil", "attachments: " + arrayList.size());
                    bundle.putStringArrayList("attachmentList", arrayList);
                }
                String contactInfo = jSONObject.optString("contactInfo");
                StringBuilder sb4 = new StringBuilder();
                sb4.append("contactInfo: ");
                Intrinsics.checkNotNullExpressionValue(contactInfo, "contactInfo");
                sb4.append(contactInfo.length() > 0);
                LogUtil.d("LogKitUtil", sb4.toString());
                if (contactInfo.length() <= 0) {
                    z = false;
                }
                if (z) {
                    bundle.putString("contactInfo", contactInfo);
                }
                b(bundle);
                objM5287constructorimpl = Result.m5287constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
            }
            Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
            if (thM5290exceptionOrNullimpl != null) {
                LogUtil.e("LogKitUtil", "sendLog error:" + thM5290exceptionOrNullimpl.getMessage());
            }
            Result.m5286boximpl(objM5287constructorimpl);
        }
    }
}
