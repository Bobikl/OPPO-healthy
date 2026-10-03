package com.heytap.httpdns.command;

import com.oplus.aiunit.vision.CommandInfo;
import com.oplus.aiunit.vision.m78;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__MutableCollectionsKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u001b\u001a\u00020\u0014\u0012\u0006\u0010\u001f\u001a\u00020\u0014\u0012\u0006\u0010%\u001a\u00020 \u0012\b\b\u0002\u0010&\u001a\u00020\t¢\u0006\u0004\b'\u0010(J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006R\"\u0010\u000f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001f\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR\u0017\u0010%\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006)"}, d2 = {"Lcom/heytap/httpdns/command/GslbMachine;", "", "Lcom/oplus/aiunit/vision/dm3;", "commandInfo", "", "a", "", "b", "c", "", "Z", "getOpenHttpDnsStatus", "()Z", "setOpenHttpDnsStatus", "(Z)V", "openHttpDnsStatus", "", "Ljava/util/List;", "commandsForExec", "commandsForGlobal", "", "d", "J", "getHostVersion", "()J", "setHostVersion", "(J)V", "hostVersion", MapSchema.FIELD_NAME_ENTRY, "getGlobalVersion", "setGlobalVersion", "globalVersion", "", "f", "Ljava/lang/String;", "getHost", "()Ljava/lang/String;", "host", "lastOpenHttpDns", "<init>", "(JJLjava/lang/String;Z)V", "com.heytap.nearx.httpdns"}, k = 1, mv = {1, 4, 0})
public final class GslbMachine {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public boolean openHttpDnsStatus;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final List<CommandInfo> commandsForExec;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final List<CommandInfo> commandsForGlobal;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public long hostVersion;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public long globalVersion;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final String host;

    public GslbMachine(long j2, long j3, @NotNull String host, boolean z) {
        Intrinsics.checkNotNullParameter(host, "host");
        this.hostVersion = j2;
        this.globalVersion = j3;
        this.host = host;
        this.openHttpDnsStatus = z;
        this.commandsForExec = new ArrayList();
        this.commandsForGlobal = new ArrayList();
    }

    public final void a(@NotNull CommandInfo commandInfo) {
        Intrinsics.checkNotNullParameter(commandInfo, "commandInfo");
        final int cmd = commandInfo.getCmd();
        final long version = commandInfo.getVersion();
        List<String> listA = commandInfo.a();
        if (m78.INSTANCE.a(cmd)) {
            if (version > this.globalVersion) {
                this.globalVersion = version;
            }
        } else if (version <= this.hostVersion) {
            return;
        } else {
            this.hostVersion = version;
        }
        switch (cmd) {
            case 1:
                if (this.openHttpDnsStatus) {
                    this.commandsForExec.add(new CommandInfo(cmd, version, listA));
                }
                break;
            case 2:
                this.openHttpDnsStatus = false;
                this.commandsForExec.clear();
                this.commandsForExec.add(new CommandInfo(cmd, version, listA));
                break;
            case 3:
                if (this.openHttpDnsStatus) {
                    CollectionsKt__MutableCollectionsKt.removeAll((List) this.commandsForExec, (Function1) new Function1<CommandInfo, Boolean>() { // from class: com.heytap.httpdns.command.GslbMachine$addCmdByUniq$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // p010kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(CommandInfo commandInfo2) {
                            return Boolean.valueOf(invoke2(commandInfo2));
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final boolean invoke2(@NotNull CommandInfo it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return it.getCmd() == cmd && it.getVersion() <= version;
                        }
                    });
                    this.commandsForExec.add(new CommandInfo(cmd, version, listA));
                }
                break;
            case 4:
                if (this.openHttpDnsStatus) {
                    CollectionsKt__MutableCollectionsKt.removeAll((List) this.commandsForExec, (Function1) new Function1<CommandInfo, Boolean>() { // from class: com.heytap.httpdns.command.GslbMachine$addCmdByUniq$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // p010kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(CommandInfo commandInfo2) {
                            return Boolean.valueOf(invoke2(commandInfo2));
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final boolean invoke2(@NotNull CommandInfo it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return it.getCmd() == cmd && it.getVersion() <= version;
                        }
                    });
                    this.commandsForExec.add(new CommandInfo(cmd, version, listA));
                }
                break;
            case 5:
                CollectionsKt__MutableCollectionsKt.removeAll((List) this.commandsForGlobal, (Function1) new Function1<CommandInfo, Boolean>() { // from class: com.heytap.httpdns.command.GslbMachine$addCmdByUniq$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p010kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(CommandInfo commandInfo2) {
                        return Boolean.valueOf(invoke2(commandInfo2));
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final boolean invoke2(@NotNull CommandInfo it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return it.getCmd() == cmd && it.getVersion() <= version;
                    }
                });
                this.commandsForGlobal.add(new CommandInfo(cmd, version, listA));
                break;
            case 6:
                this.openHttpDnsStatus = true;
                this.commandsForExec.add(new CommandInfo(cmd, version, listA));
                break;
        }
    }

    @NotNull
    public final List<CommandInfo> b() {
        return CollectionsKt___CollectionsKt.toList(this.commandsForExec);
    }

    @NotNull
    public final List<CommandInfo> c() {
        return CollectionsKt___CollectionsKt.toList(this.commandsForGlobal);
    }
}
