package com.oplus.pantaconnect.sdk.discovery.fusion;

import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.pantaconnect.agents.StrategyType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003J;\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\b\u0010\"\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lcom/oplus/pantaconnect/sdk/discovery/fusion/ServiceNode;", "", "serviceId", "", "serviceInfo", "Lcom/oplus/pantaconnect/sdk/discovery/fusion/ServiceInfo;", ServiceNodeBundleKeys.TERMINAL_INFO, "Lcom/oplus/pantaconnect/sdk/discovery/fusion/TerminalInfo;", ServiceNodeBundleKeys.STRATEGY_TYPE, "Lcom/oplus/pantaconnect/agents/StrategyType;", SpeechConstant.KEY_TTS_TIMESTAMP, "", "(Ljava/lang/String;Lcom/oplus/pantaconnect/sdk/discovery/fusion/ServiceInfo;Lcom/oplus/pantaconnect/sdk/discovery/fusion/TerminalInfo;Lcom/oplus/pantaconnect/agents/StrategyType;J)V", "getServiceId", "()Ljava/lang/String;", "getServiceInfo", "()Lcom/oplus/pantaconnect/sdk/discovery/fusion/ServiceInfo;", "getStrategyType", "()Lcom/oplus/pantaconnect/agents/StrategyType;", "getTerminalInfo", "()Lcom/oplus/pantaconnect/sdk/discovery/fusion/TerminalInfo;", "getTimeStamp", "()J", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ServiceNode {

    @NotNull
    private final String serviceId;

    @NotNull
    private final ServiceInfo serviceInfo;

    @NotNull
    private final StrategyType strategyType;

    @NotNull
    private final TerminalInfo terminalInfo;
    private final long timeStamp;

    public ServiceNode(@NotNull String str, @NotNull ServiceInfo serviceInfo, @NotNull TerminalInfo terminalInfo, @NotNull StrategyType strategyType, long j2) {
        this.serviceId = str;
        this.serviceInfo = serviceInfo;
        this.terminalInfo = terminalInfo;
        this.strategyType = strategyType;
        this.timeStamp = j2;
    }

    public static /* synthetic */ ServiceNode copy$default(ServiceNode serviceNode, String str, ServiceInfo serviceInfo, TerminalInfo terminalInfo, StrategyType strategyType, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = serviceNode.serviceId;
        }
        if ((i & 2) != 0) {
            serviceInfo = serviceNode.serviceInfo;
        }
        ServiceInfo serviceInfo2 = serviceInfo;
        if ((i & 4) != 0) {
            terminalInfo = serviceNode.terminalInfo;
        }
        TerminalInfo terminalInfo2 = terminalInfo;
        if ((i & 8) != 0) {
            strategyType = serviceNode.strategyType;
        }
        StrategyType strategyType2 = strategyType;
        if ((i & 16) != 0) {
            j2 = serviceNode.timeStamp;
        }
        return serviceNode.copy(str, serviceInfo2, terminalInfo2, strategyType2, j2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getServiceId() {
        return this.serviceId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ServiceInfo getServiceInfo() {
        return this.serviceInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TerminalInfo getTerminalInfo() {
        return this.terminalInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final StrategyType getStrategyType() {
        return this.strategyType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getTimeStamp() {
        return this.timeStamp;
    }

    @NotNull
    public final ServiceNode copy(@NotNull String serviceId, @NotNull ServiceInfo serviceInfo, @NotNull TerminalInfo terminalInfo, @NotNull StrategyType strategyType, long timeStamp) {
        return new ServiceNode(serviceId, serviceInfo, terminalInfo, strategyType, timeStamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServiceNode)) {
            return false;
        }
        ServiceNode serviceNode = (ServiceNode) other;
        return Intrinsics.areEqual(this.serviceId, serviceNode.serviceId) && Intrinsics.areEqual(this.serviceInfo, serviceNode.serviceInfo) && Intrinsics.areEqual(this.terminalInfo, serviceNode.terminalInfo) && this.strategyType == serviceNode.strategyType && this.timeStamp == serviceNode.timeStamp;
    }

    @NotNull
    public final String getServiceId() {
        return this.serviceId;
    }

    @NotNull
    public final ServiceInfo getServiceInfo() {
        return this.serviceInfo;
    }

    @NotNull
    public final StrategyType getStrategyType() {
        return this.strategyType;
    }

    @NotNull
    public final TerminalInfo getTerminalInfo() {
        return this.terminalInfo;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public int hashCode() {
        return Long.hashCode(this.timeStamp) + ((this.strategyType.hashCode() + ((this.terminalInfo.hashCode() + ((this.serviceInfo.hashCode() + (this.serviceId.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "ServiceNode(serviceId='" + this.serviceId + "', terminalInfo=" + this.terminalInfo + ", strategyType=" + this.strategyType + ", timeStamp=" + this.timeStamp + ')';
    }

    public /* synthetic */ ServiceNode(String str, ServiceInfo serviceInfo, TerminalInfo terminalInfo, StrategyType strategyType, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, serviceInfo, terminalInfo, strategyType, (i & 16) != 0 ? System.currentTimeMillis() : j2);
    }
}
