package com.heytap.store.pay;

import android.app.Activity;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.heytap.store.platform.htrouter.facade.template.IProvider;
import com.heytap.webview.extension.protocol.Const;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J \u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH&J(\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H&J(\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u001bH&J0\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u001bH&JV\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\u0006\u0010\t\u001a\u00020\u001bH&¨\u0006!"}, d2 = {"Lcom/heytap/store/pay/IStorePayService;", "Lcom/heytap/store/platform/htrouter/facade/template/IProvider;", "checkPayMethodIsSupport", "", "activity", "Landroid/app/Activity;", "checkList", "", "Lcom/heytap/store/pay/PayCheckDataBean;", "callBack", "Lcom/heytap/store/pay/PayCheckCallBack;", "isPaying", "", "setToken", "token", "", "startHeytapPayWeb", "url", "json", "startPayMainPage", "serial", "channel", Const.Batch.ARGUMENTS, "Landroid/os/Bundle;", "toPay", "paymentCode", "payMsg", "Lcom/heytap/store/pay/PayCallBack;", "qishu", "fqType", "", "isFree", NotificationCompat.CATEGORY_RECOMMENDATION, "pay-service_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface IStorePayService extends IProvider {
    void checkPayMethodIsSupport(@NotNull Activity activity, @Nullable List<PayCheckDataBean> checkList, @NotNull PayCheckCallBack callBack);

    boolean isPaying();

    void setToken(@NotNull String token);

    void startHeytapPayWeb(@NotNull Activity activity, @NotNull String url, @NotNull String json);

    void startPayMainPage(@NotNull Activity activity, @NotNull String serial, @NotNull String channel, @NotNull Bundle arguments);

    void toPay(@NotNull Activity activity, @NotNull String paymentCode, @NotNull String payMsg, @NotNull PayCallBack callBack);

    void toPay(@NotNull Activity activity, @NotNull String serial, @NotNull String paymentCode, @NotNull String payMsg, @NotNull PayCallBack callBack);

    void toPay(@NotNull Activity activity, @NotNull String serial, @NotNull String paymentCode, @NotNull String payMsg, @NotNull String qishu, int fqType, int isFree, @NotNull List<String> recommendation, @NotNull PayCallBack callBack);
}
