package com.heytap.store.business.component.entity;

import com.client.platform.opensdk.pay.download.resource.LanUtils;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\rR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/heytap/store/business/component/entity/OStoreComponentDialogConfig;", "", "title", "", "msg", "confirmText", "cancelText", "windowGravity", "", "confirmListener", "Lkotlin/Function0;", "", "cancelListener", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getCancelListener", "()Lkotlin/jvm/functions/Function0;", "setCancelListener", "(Lkotlin/jvm/functions/Function0;)V", "getCancelText", "()Ljava/lang/String;", "setCancelText", "(Ljava/lang/String;)V", "getConfirmListener", "setConfirmListener", "getConfirmText", "setConfirmText", "getMsg", "setMsg", "getTitle", "setTitle", "getWindowGravity", "()I", "setWindowGravity", "(I)V", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class OStoreComponentDialogConfig {

    @NotNull
    private Function0<Unit> cancelListener;

    @NotNull
    private String cancelText;

    @NotNull
    private Function0<Unit> confirmListener;

    @NotNull
    private String confirmText;

    @NotNull
    private String msg;

    @NotNull
    private String title;
    private int windowGravity;

    public OStoreComponentDialogConfig() {
        this(null, null, null, null, 0, null, null, 127, null);
    }

    @NotNull
    public final Function0<Unit> getCancelListener() {
        return this.cancelListener;
    }

    @NotNull
    public final String getCancelText() {
        return this.cancelText;
    }

    @NotNull
    public final Function0<Unit> getConfirmListener() {
        return this.confirmListener;
    }

    @NotNull
    public final String getConfirmText() {
        return this.confirmText;
    }

    @NotNull
    public final String getMsg() {
        return this.msg;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final int getWindowGravity() {
        return this.windowGravity;
    }

    public final void setCancelListener(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.cancelListener = function0;
    }

    public final void setCancelText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cancelText = str;
    }

    public final void setConfirmListener(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.confirmListener = function0;
    }

    public final void setConfirmText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.confirmText = str;
    }

    public final void setMsg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.msg = str;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public final void setWindowGravity(int i) {
        this.windowGravity = i;
    }

    public OStoreComponentDialogConfig(@NotNull String title, @NotNull String msg, @NotNull String confirmText, @NotNull String cancelText, int i, @NotNull Function0<Unit> confirmListener, @NotNull Function0<Unit> cancelListener) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(confirmText, "confirmText");
        Intrinsics.checkNotNullParameter(cancelText, "cancelText");
        Intrinsics.checkNotNullParameter(confirmListener, "confirmListener");
        Intrinsics.checkNotNullParameter(cancelListener, "cancelListener");
        this.title = title;
        this.msg = msg;
        this.confirmText = confirmText;
        this.cancelText = cancelText;
        this.windowGravity = i;
        this.confirmListener = confirmListener;
        this.cancelListener = cancelListener;
    }

    public /* synthetic */ OStoreComponentDialogConfig(String str, String str2, String str3, String str4, int i, Function0 function0, Function0 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "温馨提示" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "确定" : str3, (i2 & 8) != 0 ? LanUtils.CN.CANCEL : str4, (i2 & 16) != 0 ? 17 : i, (i2 & 32) != 0 ? new Function0<Unit>() { // from class: com.heytap.store.business.component.entity.OStoreComponentDialogConfig.1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        } : function0, (i2 & 64) != 0 ? new Function0<Unit>() { // from class: com.heytap.store.business.component.entity.OStoreComponentDialogConfig.2
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        } : function1);
    }
}
