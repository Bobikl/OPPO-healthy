package com.oplus.aiunit.vision;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.oplus.deepthinker.platform.server.IDeepThinkerBridge;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ=\u0010\n\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/uld;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function0;", "Lcom/oplus/deepthinker/platform/server/IDeepThinkerBridge;", "getBinderFunc", "", "openId", "Ljava/lang/Class;", "jsonClass", "a", "(Lkotlin/jvm/functions/Function0;ILjava/lang/Class;)Ljava/lang/Object;", "<init>", "()V", "com.oplus.deepthinker.sdk_release"}, k = 1, mv = {1, 6, 0})
public final class uld {

    @NotNull
    public static final uld INSTANCE = new uld();

    @JvmStatic
    @Nullable
    public static final <T> T a(@NotNull Function0<? extends IDeepThinkerBridge> getBinderFunc, int openId, @NotNull Class<T> jsonClass) {
        Intrinsics.checkNotNullParameter(getBinderFunc, "getBinderFunc");
        Intrinsics.checkNotNullParameter(jsonClass, "jsonClass");
        try {
            IDeepThinkerBridge iDeepThinkerBridgeInvoke = getBinderFunc.invoke();
            if (iDeepThinkerBridgeInvoke == null) {
                return null;
            }
            Bundle bundle = new Bundle();
            bundle.putInt(k9g.OPEN_ID, openId);
            Bundle bundleCall = iDeepThinkerBridgeInvoke.call("ability_userprofile", "query_specific_profile", bundle);
            if (bundleCall == null || !bundleCall.containsKey("query_result_user_profile")) {
                return null;
            }
            String string = bundleCall.getString("query_result_user_profile");
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            g5g.e("OpenLabelUtils", "getOpenLabel: success");
            return (T) new Gson().fromJson(string, (Class) jsonClass);
        } catch (RemoteException e2) {
            g5g.c("OpenLabelUtils", Intrinsics.stringPlus("getOpenLabel: RemoteException:", e2));
            return null;
        } catch (JsonSyntaxException e3) {
            g5g.c("OpenLabelUtils", Intrinsics.stringPlus("getOpenLabel: JsonSyntaxException:", e3));
            return null;
        }
    }
}
