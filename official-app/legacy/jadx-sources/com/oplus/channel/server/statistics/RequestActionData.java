package com.oplus.channel.server.statistics;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003JG\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0007HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\r\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\r¨\u0006'"}, d2 = {"Lcom/oplus/channel/server/statistics/RequestActionData;", "", "widgetCode", "", "action", "requestData", "requestState", "", "clientPuller", "runnable", "Ljava/lang/Runnable;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Runnable;)V", "getAction", "()Ljava/lang/String;", "getClientPuller", "setClientPuller", "(Ljava/lang/String;)V", "getRequestData", "getRequestState", "()I", "setRequestState", "(I)V", "getRunnable", "()Ljava/lang/Runnable;", "setRunnable", "(Ljava/lang/Runnable;)V", "getWidgetCode", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "server_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class RequestActionData {

    @NotNull
    private final String action;

    @NotNull
    private String clientPuller;

    @NotNull
    private final String requestData;
    private int requestState;

    @Nullable
    private Runnable runnable;

    @NotNull
    private final String widgetCode;

    public RequestActionData(@NotNull String widgetCode, @NotNull String action, @NotNull String requestData, int i, @NotNull String clientPuller, @Nullable Runnable runnable) {
        Intrinsics.checkNotNullParameter(widgetCode, "widgetCode");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        Intrinsics.checkNotNullParameter(clientPuller, "clientPuller");
        this.widgetCode = widgetCode;
        this.action = action;
        this.requestData = requestData;
        this.requestState = i;
        this.clientPuller = clientPuller;
        this.runnable = runnable;
    }

    public static /* synthetic */ RequestActionData copy$default(RequestActionData requestActionData, String str, String str2, String str3, int i, String str4, Runnable runnable, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = requestActionData.widgetCode;
        }
        if ((i2 & 2) != 0) {
            str2 = requestActionData.action;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            str3 = requestActionData.requestData;
        }
        String str6 = str3;
        if ((i2 & 8) != 0) {
            i = requestActionData.requestState;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str4 = requestActionData.clientPuller;
        }
        String str7 = str4;
        if ((i2 & 32) != 0) {
            runnable = requestActionData.runnable;
        }
        return requestActionData.copy(str, str5, str6, i3, str7, runnable);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getWidgetCode() {
        return this.widgetCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRequestData() {
        return this.requestData;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getRequestState() {
        return this.requestState;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getClientPuller() {
        return this.clientPuller;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Runnable getRunnable() {
        return this.runnable;
    }

    @NotNull
    public final RequestActionData copy(@NotNull String widgetCode, @NotNull String action, @NotNull String requestData, int requestState, @NotNull String clientPuller, @Nullable Runnable runnable) {
        Intrinsics.checkNotNullParameter(widgetCode, "widgetCode");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        Intrinsics.checkNotNullParameter(clientPuller, "clientPuller");
        return new RequestActionData(widgetCode, action, requestData, requestState, clientPuller, runnable);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequestActionData)) {
            return false;
        }
        RequestActionData requestActionData = (RequestActionData) other;
        return Intrinsics.areEqual(this.widgetCode, requestActionData.widgetCode) && Intrinsics.areEqual(this.action, requestActionData.action) && Intrinsics.areEqual(this.requestData, requestActionData.requestData) && this.requestState == requestActionData.requestState && Intrinsics.areEqual(this.clientPuller, requestActionData.clientPuller) && Intrinsics.areEqual(this.runnable, requestActionData.runnable);
    }

    @NotNull
    public final String getAction() {
        return this.action;
    }

    @NotNull
    public final String getClientPuller() {
        return this.clientPuller;
    }

    @NotNull
    public final String getRequestData() {
        return this.requestData;
    }

    public final int getRequestState() {
        return this.requestState;
    }

    @Nullable
    public final Runnable getRunnable() {
        return this.runnable;
    }

    @NotNull
    public final String getWidgetCode() {
        return this.widgetCode;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.widgetCode.hashCode() * 31) + this.action.hashCode()) * 31) + this.requestData.hashCode()) * 31) + Integer.hashCode(this.requestState)) * 31) + this.clientPuller.hashCode()) * 31;
        Runnable runnable = this.runnable;
        return iHashCode + (runnable == null ? 0 : runnable.hashCode());
    }

    public final void setClientPuller(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clientPuller = str;
    }

    public final void setRequestState(int i) {
        this.requestState = i;
    }

    public final void setRunnable(@Nullable Runnable runnable) {
        this.runnable = runnable;
    }

    @NotNull
    public String toString() {
        return "RequestActionData(widgetCode=" + this.widgetCode + ", action=" + this.action + ", requestData=" + this.requestData + ", requestState=" + this.requestState + ", clientPuller=" + this.clientPuller + ", runnable=" + this.runnable + ')';
    }

    public /* synthetic */ RequestActionData(String str, String str2, String str3, int i, String str4, Runnable runnable, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, str3, (i2 & 8) != 0 ? -1 : i, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? null : runnable);
    }
}
