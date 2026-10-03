package com.heytap.store.message.service;

import android.content.Context;
import com.heytap.store.message.service.data.entity.OnLineServiceBean;
import com.heytap.store.platform.htrouter.facade.template.IProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J+\u0010\u0004\u001a\u00020\u00032!\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00030\u0006H&J\b\u0010\u000b\u001a\u00020\fH&J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J\u001a\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000f\u001a\u00020\u0010H&J.\u0010\u0014\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0006H&J\u001a\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u0010H&J.\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0006H&J\u001a\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u0018\u001a\u00020\u0010H&J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0010H&J.\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00102\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\"H&¨\u0006#"}, d2 = {"Lcom/heytap/store/message/service/IMessageService;", "Lcom/heytap/store/platform/htrouter/facade/template/IProvider;", "clearZCUnReadNumber", "", "getUnreadMessageTotal", "callback", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "count", "getZCUnReadNumber", "", "onlineCustomerInterceptor", "", "url", "", "openCCPChat", "context", "Landroid/content/Context;", "openCCPChatWithListener", "onOpenResult", "openZCChat", "beanData", "curToken", "openZCChatWithListener", "openZCChats", "bean", "Lcom/heytap/store/message/service/data/entity/OnLineServiceBean;", "sendOrderCard", "showNotifyDialog", "pageTitle", "dialogKey", "completeListener", "Lkotlin/Function0;", "message-service_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface IMessageService extends IProvider {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void openZCChat$default(IMessageService iMessageService, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openZCChat");
            }
            if ((i & 2) != 0) {
                str2 = "";
            }
            iMessageService.openZCChat(str, str2);
        }

        public static /* synthetic */ void openZCChatWithListener$default(IMessageService iMessageService, String str, String str2, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openZCChatWithListener");
            }
            if ((i & 2) != 0) {
                str2 = "";
            }
            iMessageService.openZCChatWithListener(str, str2, function1);
        }

        public static /* synthetic */ void openZCChats$default(IMessageService iMessageService, OnLineServiceBean onLineServiceBean, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openZCChats");
            }
            if ((i & 2) != 0) {
                str = "";
            }
            iMessageService.openZCChats(onLineServiceBean, str);
        }
    }

    void clearZCUnReadNumber();

    void getUnreadMessageTotal(@NotNull Function1<? super Long, Unit> callback);

    int getZCUnReadNumber();

    boolean onlineCustomerInterceptor(@Nullable String url);

    void openCCPChat(@Nullable Context context, @NotNull String url);

    void openCCPChatWithListener(@Nullable Context context, @NotNull String url, @NotNull Function1<? super Boolean, Unit> onOpenResult);

    void openZCChat(@NotNull String beanData, @NotNull String curToken);

    void openZCChatWithListener(@NotNull String beanData, @NotNull String curToken, @NotNull Function1<? super Boolean, Unit> onOpenResult);

    void openZCChats(@NotNull OnLineServiceBean bean, @NotNull String curToken);

    void sendOrderCard(@NotNull String beanData);

    void showNotifyDialog(@NotNull Context context, @NotNull String pageTitle, @NotNull String dialogKey, @NotNull Function0<Unit> completeListener);
}
