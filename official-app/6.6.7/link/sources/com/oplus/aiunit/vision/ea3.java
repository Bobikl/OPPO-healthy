package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.oplus.pay.opensdk.msp.pay.PayConstant;
import com.oplus.pay.opensdk.taskwall.util.ShortcutHelper;
import com.oplus.utrace.lib.NodeIDKt;
import com.oplus.web.container.comunication.jsapi.BaseJsApiExecutor;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@mka(method = "checkShortCut", product = PayConstant.MethodName.PAY)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/ea3;", "Lcom/oplus/web/container/comunication/jsapi/BaseJsApiExecutor;", "Lcom/oplus/aiunit/vision/us9;", "fragment", "Lcom/oplus/aiunit/vision/ska;", "apiArguments", "Lcom/oplus/aiunit/vision/rs9;", "callback", "", "handleJsApi", "", "a", "Ljava/lang/String;", "TAG", "<init>", "()V", "paysdk_taskwall_release"}, k = 1, mv = {1, 8, 0})
public final class ea3 extends BaseJsApiExecutor {

    @NotNull
    public final String a = "checkShortCutExecute";

    @Override // com.oplus.web.container.comunication.jsapi.BaseJsApiExecutor
    public void handleJsApi(@Nullable us9 fragment, @Nullable ska apiArguments, @Nullable rs9 callback) {
        FragmentActivity activity;
        Context activity2;
        Unit unit = null;
        String strC = apiArguments != null ? apiArguments.c("packageName") : null;
        if (strC == null || strC.length() == 0) {
            if (callback != null) {
                callback.fail(NodeIDKt.DEFAULT_SPAN_NAME, "empty param packageName");
                return;
            }
            return;
        }
        if (fragment != null && (activity2 = fragment.getActivity()) != null) {
            boolean zJ = ShortcutHelper.INSTANCE.j(activity2, strC);
            pce.i(this.a + " packageName:" + strC + " iconResult:" + zJ);
            if (zJ) {
                if (callback != null) {
                    callback.fail(NodeIDKt.DEFAULT_SPAN_NAME, strC + " this packageName already hasLauncherIcon");
                    return;
                }
                return;
            }
        }
        ShortcutHelper shortcutHelper = ShortcutHelper.INSTANCE;
        String strI = shortcutHelper.i(strC);
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            if (shortcutHelper.l(activity, strI)) {
                pce.i(this.a + " isShortcutExists:true");
                if (callback != null) {
                    callback.fail(NodeIDKt.DEFAULT_SPAN_NAME, "this shortCutId already exist");
                    unit = Unit.INSTANCE;
                }
            } else {
                pce.f(this.a + " isShortcutExists:false");
                if (callback != null) {
                    callback.success();
                    unit = Unit.INSTANCE;
                }
            }
            if (unit != null) {
                return;
            }
        }
        pce.c(this.a + " check fail: Activity is null");
        if (callback != null) {
            callback.fail(-1, "check fail: Activity is null");
            Unit unit2 = Unit.INSTANCE;
        }
    }
}
