package com.heytap.health.wallet.network.script.rsp;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J?\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\r\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/heytap/health/wallet/network/script/rsp/ScriptVo;", "", "session", "", "nextStep", "commands", "", "Lcom/heytap/health/wallet/network/script/rsp/CommandObject;", "orderId", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getCommands", "()Ljava/util/List;", "getNextStep", "()Ljava/lang/String;", "getOrderId", "setOrderId", "(Ljava/lang/String;)V", "getSession", "setSession", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ScriptVo {

    @Nullable
    private final List<CommandObject> commands;

    @Nullable
    private final String nextStep;

    @Nullable
    private String orderId;

    @Nullable
    private String session;

    public ScriptVo(@Nullable String str, @Nullable String str2, @Nullable List<CommandObject> list, @Nullable String str3) {
        this.session = str;
        this.nextStep = str2;
        this.commands = list;
        this.orderId = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ScriptVo copy$default(ScriptVo scriptVo, String str, String str2, List list, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = scriptVo.session;
        }
        if ((i & 2) != 0) {
            str2 = scriptVo.nextStep;
        }
        if ((i & 4) != 0) {
            list = scriptVo.commands;
        }
        if ((i & 8) != 0) {
            str3 = scriptVo.orderId;
        }
        return scriptVo.copy(str, str2, list, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSession() {
        return this.session;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNextStep() {
        return this.nextStep;
    }

    @Nullable
    public final List<CommandObject> component3() {
        return this.commands;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    public final ScriptVo copy(@Nullable String session, @Nullable String nextStep, @Nullable List<CommandObject> commands, @Nullable String orderId) {
        return new ScriptVo(session, nextStep, commands, orderId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScriptVo)) {
            return false;
        }
        ScriptVo scriptVo = (ScriptVo) other;
        return Intrinsics.areEqual(this.session, scriptVo.session) && Intrinsics.areEqual(this.nextStep, scriptVo.nextStep) && Intrinsics.areEqual(this.commands, scriptVo.commands) && Intrinsics.areEqual(this.orderId, scriptVo.orderId);
    }

    @Nullable
    public final List<CommandObject> getCommands() {
        return this.commands;
    }

    @Nullable
    public final String getNextStep() {
        return this.nextStep;
    }

    @Nullable
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    public final String getSession() {
        return this.session;
    }

    public int hashCode() {
        String str = this.session;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.nextStep;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<CommandObject> list = this.commands;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.orderId;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setOrderId(@Nullable String str) {
        this.orderId = str;
    }

    public final void setSession(@Nullable String str) {
        this.session = str;
    }

    @NotNull
    public String toString() {
        return "ScriptVo(session=" + this.session + ", nextStep=" + this.nextStep + ", commands=" + this.commands + ", orderId=" + this.orderId + ")";
    }
}
