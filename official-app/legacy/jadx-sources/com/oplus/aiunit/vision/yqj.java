package com.oplus.aiunit.vision;

import android.content.Context;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.text.TextUtils;
import com.heytap.health.base.permission.wxbpermission.PermissionRequestDialog;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0004\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\u0007"}, d2 = {"Lcom/oplus/aiunit/vision/yqj;", "", "", "phoneAccountId", "a", "<init>", "()V", "contactsync_impl_release"}, k = 1, mv = {1, 8, 0})
public final class yqj {

    @NotNull
    public static final yqj INSTANCE = new yqj();

    @NotNull
    public final String a(@Nullable String phoneAccountId) {
        SubscriptionManager subscriptionManager;
        List<SubscriptionInfo> activeSubscriptionInfoList;
        Context contextA = b78.a();
        if (!PermissionRequestDialog.D(9, "android.permission.READ_PHONE_STATE") && (subscriptionManager = (SubscriptionManager) contextA.getSystemService("telephony_subscription_service")) != null && (activeSubscriptionInfoList = subscriptionManager.getActiveSubscriptionInfoList()) != null) {
            for (SubscriptionInfo subscriptionInfo : activeSubscriptionInfoList) {
                if (TextUtils.equals(subscriptionInfo.getIccId(), phoneAccountId)) {
                    u64.d("TelecomUtils", "getSubIdFromPhoneAccountId for phoneAccountId" + phoneAccountId + " " + subscriptionInfo.getSubscriptionId(), new Object[0]);
                    return String.valueOf(subscriptionInfo.getSubscriptionId());
                }
            }
        }
        return "";
    }
}
