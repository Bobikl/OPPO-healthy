package com.oplus.aiunit.vision;

import android.app.Activity;
import com.oplus.pay.opensdk.msp.pay.PayConstant;
import com.oplus.pay.opensdk.taskwall.util.ShortcutHelper;
import com.oplus.web.container.comunication.jsapi.BaseJsApiExecutor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@mka(method = "addDesk", product = PayConstant.MethodName.PAY)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/wbe;", "Lcom/oplus/web/container/comunication/jsapi/BaseJsApiExecutor;", "Lcom/oplus/aiunit/vision/us9;", "fragment", "Lcom/oplus/aiunit/vision/ska;", "apiArguments", "Lcom/oplus/aiunit/vision/rs9;", "callback", "", "handleJsApi", "", "a", "Ljava/lang/String;", "TAG", "<init>", "()V", "paysdk_taskwall_release"}, k = 1, mv = {1, 8, 0})
public final class wbe extends BaseJsApiExecutor {

    @NotNull
    public final String a = "PayAddToDeskExecute";

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"com/oplus/aiunit/vision/wbe$a", "Lcom/oplus/pay/opensdk/taskwall/util/ShortcutHelper$a;", "", "shortcutId", "", "onSuccess", "error", "onFailure", "paysdk_taskwall_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements ShortcutHelper.a {
        public final /* synthetic */ rs9 b;

        public a(rs9 rs9Var) {
            this.b = rs9Var;
        }

        @Override // com.oplus.pay.opensdk.taskwall.util.ShortcutHelper.a
        public void onFailure(@NotNull String error) {
            Intrinsics.checkNotNullParameter(error, "error");
            pce.c(wbe.this.a + " Shortcut create error: " + error);
            rs9 rs9Var = this.b;
            if (rs9Var != null) {
                rs9Var.fail(-1, "addDesk fail: " + error);
            }
        }

        @Override // com.oplus.pay.opensdk.taskwall.util.ShortcutHelper.a
        public void onSuccess(@NotNull String shortcutId) throws JSONException {
            Intrinsics.checkNotNullParameter(shortcutId, "shortcutId");
            pce.b(wbe.this.a + " Shortcut create success: " + shortcutId);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("shortcutId", shortcutId);
            rs9 rs9Var = this.b;
            if (rs9Var != null) {
                rs9Var.success(jSONObject);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0072 A[Catch: Exception -> 0x0070, TryCatch #0 {Exception -> 0x0070, blocks: (B:21:0x0054, B:23:0x005a, B:27:0x0067, B:30:0x0072, B:32:0x008a), top: B:39:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x008a A[Catch: Exception -> 0x0070, TRY_LEAVE, TryCatch #0 {Exception -> 0x0070, blocks: (B:21:0x0054, B:23:0x005a, B:27:0x0067, B:30:0x0072, B:32:0x008a), top: B:39:0x0054 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x0072, please report this as an issue */
    @Override // com.oplus.web.container.comunication.jsapi.BaseJsApiExecutor
    public void handleJsApi(@Nullable us9 fragment, @Nullable ska apiArguments, @Nullable rs9 callback) {
        pce.b(this.a + " handleJsApi called");
        String strC = apiArguments != null ? apiArguments.c("iconUrl") : null;
        String strC2 = apiArguments != null ? apiArguments.c("packageName") : null;
        String strC3 = apiArguments != null ? apiArguments.c("shortLabel") : null;
        if (strC2 == null) {
            if (callback != null) {
                callback.fail(-1, "packageName is null");
                return;
            }
            return;
        }
        if (strC == null) {
            if (callback != null) {
                callback.fail(-1, "iconUrl is null");
                return;
            }
            return;
        }
        if (fragment != null) {
            try {
                Activity activity = fragment.getActivity();
                if (activity != null) {
                    ShortcutHelper shortcutHelper = ShortcutHelper.INSTANCE;
                    shortcutHelper.c(activity, strC, strC2, shortcutHelper.i(strC2), strC3 == null ? "快捷方式" : strC3, new a(callback));
                } else {
                    pce.c(this.a + " addDesk fail: Activity is null");
                    if (callback != null) {
                        callback.fail(-1, "addDesk fail: Activity is null");
                    }
                }
            } catch (Exception e) {
                pce.c(this.a + " handleJsApi exception: " + e.getMessage());
                if (callback != null) {
                    callback.fail(-1, "addDesk fail: " + e.getMessage());
                }
            }
        } else {
            pce.c(this.a + " addDesk fail: Activity is null");
            if (callback != null) {
                callback.fail(-1, "addDesk fail: Activity is null");
            }
        }
    }
}
