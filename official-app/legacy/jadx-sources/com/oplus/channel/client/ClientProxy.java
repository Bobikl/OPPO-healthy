package com.oplus.channel.client;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import androidx.annotation.Keep;
import com.heytap.health.watch.notification.impl.pull.NotificationApiService;
import com.heytap.speech.engine.constant.EngineConstant;
import com.oplus.channel.client.ClientProxy;
import com.oplus.channel.client.data.Command;
import com.oplus.channel.client.utils.ClientDI;
import com.oplus.channel.client.utils.LogUtil;
import com.oplus.channel.client.utils.WorkHandler;
import com.oplus.smartenginehelper.ParserTag;
import io.netty.util.internal.StringUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jdk7.AutoCloseableKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Reflection;
import p010kotlin.text.StringsKt__StringsJVMKt;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000¡\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002*\u0001\u0016\u0018\u0000 N2\u00020\u0001:\u0003MNOB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002J&\u0010\"\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030$2\u0006\u0010%\u001a\u00020&H\u0016JF\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u001a2&\u0010)\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010&0*j\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010&`+2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030-H\u0002J\u0006\u0010.\u001a\u00020/J\u0010\u00100\u001a\u00020\u00032\u0006\u00101\u001a\u00020\u0003H\u0002J\u001c\u00102\u001a\b\u0012\u0004\u0012\u00020!0$2\f\u00103\u001a\b\u0012\u0004\u0012\u00020!0$H\u0002J\n\u00104\u001a\u0004\u0018\u000105H\u0002J\u0010\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109J\u0014\u0010:\u001a\u00020/2\f\u00103\u001a\b\u0012\u0004\u0012\u00020!0$J\u001a\u0010;\u001a\u00020\u001a2\u0006\u0010<\u001a\u00020\u00032\b\u0010=\u001a\u0004\u0018\u00010&H\u0002J\u001a\u0010>\u001a\u00020/2\u0006\u0010<\u001a\u00020\u00032\b\u0010=\u001a\u0004\u0018\u00010&H\u0002J\u0010\u0010?\u001a\u00020/2\u0006\u0010@\u001a\u00020!H\u0002J\u0010\u0010A\u001a\u00020/2\u0006\u0010@\u001a\u00020!H\u0002J\u0010\u0010B\u001a\u00020/2\u0006\u0010C\u001a\u00020\u0003H\u0002J\u0006\u0010D\u001a\u00020/J\b\u0010E\u001a\u000207H\u0002J,\u0010F\u001a\b\u0012\u0004\u0012\u00020/0G2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020/0IH\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bJ\u0010KJ\b\u0010L\u001a\u00020/H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\f\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000bR\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006P²\u0006\f\u0010Q\u001a\u0004\u0018\u00010RX\u008a\u0084\u0002²\u0006\f\u0010Q\u001a\u0004\u0018\u00010RX\u008a\u0084\u0002²\u0006\f\u0010Q\u001a\u0004\u0018\u00010RX\u008a\u0084\u0002²\u0006\f\u0010Q\u001a\u0004\u0018\u00010RX\u008a\u0084\u0002²\u0006\f\u0010Q\u001a\u0004\u0018\u00010RX\u008a\u0084\u0002"}, d2 = {"Lcom/oplus/channel/client/ClientProxy;", "Lcom/oplus/channel/client/IBatchClientProxy;", "serverAuthority", "", "clientName", "iClient", "Lcom/oplus/channel/client/IClient;", "(Ljava/lang/String;Ljava/lang/String;Lcom/oplus/channel/client/IClient;)V", "batchCallBackSupport", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getClientName", "()Ljava/lang/String;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context$delegate", "Lkotlin/Lazy;", "currentObserveRes", "Ljava/util/concurrent/CopyOnWriteArrayList;", "logTag", "observer", "com/oplus/channel/client/ClientProxy$observer$1", "Lcom/oplus/channel/client/ClientProxy$observer$1;", "getServerAuthority", "shouldRetryRegister", "", ParserTag.TAG_URI, "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "actionIdentifySelector", "Lcom/oplus/channel/client/ClientProxy$ActionIdentify;", EngineConstant.WAKEUP_TYPE_COMMAND, "Lcom/oplus/channel/client/data/CommandClient;", "batchCallback", "callbackIds", "", "data", "", "calculateUnObserve", "needNotice", "observeMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "stopObserves", "", "destroy", "", "getLogHeadTag", "target", "getProcessCommands", "commandClients", "getProviderClient", "Landroid/content/ContentProviderClient;", "handlePullCommand", "Lcom/oplus/channel/client/ClientProxy$PullResult;", "result", "Landroid/os/Bundle;", "processCommandList", "processObserve", "resUri", "params", "processReplaceObserve", "processRequest", "cmd", "processRequestOnce", "processUnObserve", "observeRes", "pullAndRunCommand", "pullCommand", "runWithCatch", "Lkotlin/Result;", "call", "Lkotlin/Function0;", "runWithCatch-IoAF18A", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "tryRegisterContentObserver", "ActionIdentify", "Companion", "PullResult", "client_release", "executorService", "Ljava/util/concurrent/ExecutorService;"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ClientProxy implements IBatchClientProxy {

    @NotNull
    public static final String CLIENT_NAME_ASSISTANT = "card_service";

    @NotNull
    public static final String CLIENT_NAME_LAUNCHER = "card_service_launcher";

    @NotNull
    public static final String TAG = "ClientProxy.";

    @NotNull
    private final AtomicBoolean batchCallBackSupport;

    @NotNull
    private final String clientName;

    /* JADX INFO: renamed from: context$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy context;

    @NotNull
    private final CopyOnWriteArrayList<String> currentObserveRes;

    @NotNull
    private final IClient iClient;

    @NotNull
    private final String logTag;

    @NotNull
    private final ClientProxy$observer$1 observer;

    @NotNull
    private final String serverAuthority;
    private boolean shouldRetryRegister;
    private final Uri uri;

    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/oplus/channel/client/ClientProxy$ActionIdentify;", "", "type", "", "cardId", "hostId", "action", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "getCardId", "getHostId", "getType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "client_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final /* data */ class ActionIdentify {

        @NotNull
        private final String action;

        @NotNull
        private final String cardId;

        @NotNull
        private final String hostId;

        @NotNull
        private final String type;

        public ActionIdentify(@NotNull String type, @NotNull String cardId, @NotNull String hostId, @NotNull String action) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            Intrinsics.checkNotNullParameter(hostId, "hostId");
            Intrinsics.checkNotNullParameter(action, "action");
            this.type = type;
            this.cardId = cardId;
            this.hostId = hostId;
            this.action = action;
        }

        public static /* synthetic */ ActionIdentify copy$default(ActionIdentify actionIdentify, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = actionIdentify.type;
            }
            if ((i & 2) != 0) {
                str2 = actionIdentify.cardId;
            }
            if ((i & 4) != 0) {
                str3 = actionIdentify.hostId;
            }
            if ((i & 8) != 0) {
                str4 = actionIdentify.action;
            }
            return actionIdentify.copy(str, str2, str3, str4);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getCardId() {
            return this.cardId;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getHostId() {
            return this.hostId;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getAction() {
            return this.action;
        }

        @NotNull
        public final ActionIdentify copy(@NotNull String type, @NotNull String cardId, @NotNull String hostId, @NotNull String action) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            Intrinsics.checkNotNullParameter(hostId, "hostId");
            Intrinsics.checkNotNullParameter(action, "action");
            return new ActionIdentify(type, cardId, hostId, action);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActionIdentify)) {
                return false;
            }
            ActionIdentify actionIdentify = (ActionIdentify) other;
            return Intrinsics.areEqual(this.type, actionIdentify.type) && Intrinsics.areEqual(this.cardId, actionIdentify.cardId) && Intrinsics.areEqual(this.hostId, actionIdentify.hostId) && Intrinsics.areEqual(this.action, actionIdentify.action);
        }

        @NotNull
        public final String getAction() {
            return this.action;
        }

        @NotNull
        public final String getCardId() {
            return this.cardId;
        }

        @NotNull
        public final String getHostId() {
            return this.hostId;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            return (((((this.type.hashCode() * 31) + this.cardId.hashCode()) * 31) + this.hostId.hashCode()) * 31) + this.action.hashCode();
        }

        @NotNull
        public String toString() {
            return "ActionIdentify(type=" + this.type + ", cardId=" + this.cardId + ", hostId=" + this.hostId + ", action=" + this.action + ')';
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/oplus/channel/client/ClientProxy$PullResult;", "", "commandClients", "", "Lcom/oplus/channel/client/data/CommandClient;", "idleState", "", "(Ljava/util/List;Z)V", "getCommandClients", "()Ljava/util/List;", "getIdleState", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "client_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final /* data */ class PullResult {

        @NotNull
        private final List<Command> commandClients;
        private final boolean idleState;

        public PullResult(@NotNull List<Command> commandClients, boolean z) {
            Intrinsics.checkNotNullParameter(commandClients, "commandClients");
            this.commandClients = commandClients;
            this.idleState = z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PullResult copy$default(PullResult pullResult, List list, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                list = pullResult.commandClients;
            }
            if ((i & 2) != 0) {
                z = pullResult.idleState;
            }
            return pullResult.copy(list, z);
        }

        @NotNull
        public final List<Command> component1() {
            return this.commandClients;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getIdleState() {
            return this.idleState;
        }

        @NotNull
        public final PullResult copy(@NotNull List<Command> commandClients, boolean idleState) {
            Intrinsics.checkNotNullParameter(commandClients, "commandClients");
            return new PullResult(commandClients, idleState);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PullResult)) {
                return false;
            }
            PullResult pullResult = (PullResult) other;
            return Intrinsics.areEqual(this.commandClients, pullResult.commandClients) && this.idleState == pullResult.idleState;
        }

        @NotNull
        public final List<Command> getCommandClients() {
            return this.commandClients;
        }

        public final boolean getIdleState() {
            return this.idleState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v4 */
        public int hashCode() {
            int iHashCode = this.commandClients.hashCode() * 31;
            boolean z = this.idleState;
            ?? r1 = z;
            if (z) {
                r1 = 1;
            }
            return iHashCode + r1;
        }

        @NotNull
        public String toString() {
            return "PullResult(commandClients=" + this.commandClients + ", idleState=" + this.idleState + ')';
        }
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [com.oplus.channel.client.ClientProxy$observer$1] */
    public ClientProxy(@NotNull String serverAuthority, @NotNull String clientName, @NotNull IClient iClient) {
        Lazy<?> lazy;
        Intrinsics.checkNotNullParameter(serverAuthority, "serverAuthority");
        Intrinsics.checkNotNullParameter(clientName, "clientName");
        Intrinsics.checkNotNullParameter(iClient, "iClient");
        this.serverAuthority = serverAuthority;
        this.clientName = clientName;
        this.iClient = iClient;
        ClientDI clientDI = ClientDI.INSTANCE;
        if (clientDI.getSingleInstanceMap().get(Reflection.getOrCreateKotlinClass(Context.class)) == null) {
            clientDI.onError("the class of [" + ((Object) Reflection.getOrCreateKotlinClass(Context.class).getSimpleName()) + "] are not injected");
            lazy = new Lazy<Context>() { // from class: com.oplus.channel.client.ClientProxy$special$$inlined$injectSingle$1
                @Override // p010kotlin.Lazy
                @Nullable
                public Context getValue() {
                    return null;
                }

                @Override // p010kotlin.Lazy
                public boolean isInitialized() {
                    return false;
                }
            };
        } else {
            Lazy<?> lazy2 = clientDI.getSingleInstanceMap().get(Reflection.getOrCreateKotlinClass(Context.class));
            if (lazy2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Lazy<T of com.oplus.channel.client.utils.ClientDI.injectSingle>");
            }
            lazy = lazy2;
        }
        this.context = lazy;
        this.uri = Uri.parse(NotificationApiService.CONTENT + serverAuthority + "/pull/" + clientName);
        this.currentObserveRes = new CopyOnWriteArrayList<>();
        this.shouldRetryRegister = true;
        this.logTag = Intrinsics.stringPlus(TAG, getLogHeadTag(clientName));
        this.batchCallBackSupport = new AtomicBoolean(false);
        final Handler handler = WorkHandler.INSTANCE.getInstance().getHandler();
        this.observer = new ContentObserver(handler) { // from class: com.oplus.channel.client.ClientProxy$observer$1
            @Override // android.database.ContentObserver
            public void onChange(boolean selfChange) {
                LogUtil.d(this.this$0.logTag, "onChange selfChange = [" + selfChange + ']');
                this.this$0.pullAndRunCommand();
            }
        };
        pullAndRunCommand();
    }

    private final ActionIdentify actionIdentifySelector(Command command) {
        String strValueOf;
        String callbackId;
        int methodType = command.getMethodType();
        if (methodType != 0) {
            if (methodType == 2 || methodType == 3) {
                strValueOf = String.valueOf(command.getMethodType());
                callbackId = command.getCallbackId();
            }
            return new ActionIdentify(strValueOf, callbackId, "", "");
        }
        byte[] params = command.getParams();
        if (params != null) {
            return this.iClient.getRequestActionIdentify(params);
        }
        strValueOf = "";
        callbackId = strValueOf;
        return new ActionIdentify(strValueOf, callbackId, "", "");
    }

    private final boolean calculateUnObserve(boolean needNotice, HashMap<String, byte[]> observeMap, List<String> stopObserves) {
        for (String it : this.currentObserveRes) {
            if (!observeMap.containsKey(it) && !stopObserves.contains(it)) {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                processUnObserve(it);
                needNotice = true;
            }
        }
        return needNotice;
    }

    private final Context getContext() {
        return (Context) this.context.getValue();
    }

    private final String getLogHeadTag(String target) {
        try {
            Result.Companion companion = Result.INSTANCE;
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) target, new String[]{"."}, false, 0, 6, (Object) null);
            return (String) listSplit$default.get(listSplit$default.size() - 1);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            if (Result.m5290exceptionOrNullimpl(Result.m5287constructorimpl(ResultKt.createFailure(th))) != null) {
                LogUtil.d(this.logTag, Intrinsics.stringPlus("client name is ", target));
            }
            return target;
        }
    }

    private final List<Command> getProcessCommands(List<Command> commandClients) {
        String str = this.clientName;
        if (Intrinsics.areEqual(str, CLIENT_NAME_ASSISTANT) ? true : Intrinsics.areEqual(str, CLIENT_NAME_LAUNCHER)) {
            LogUtil.d(this.logTag, "getProcessCommands: clientName = " + this.clientName + ", commandClients=" + commandClients);
            return commandClients;
        }
        ArrayList arrayList = new ArrayList();
        List listReversed = CollectionsKt___CollectionsKt.reversed(commandClients);
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listReversed) {
            ActionIdentify actionIdentifyActionIdentifySelector = actionIdentifySelector((Command) obj);
            arrayList.add(actionIdentifyActionIdentifySelector);
            if (hashSet.add(actionIdentifyActionIdentifySelector)) {
                arrayList2.add(obj);
            }
        }
        List<Command> listReversed2 = CollectionsKt___CollectionsKt.reversed(arrayList2);
        LogUtil.d(this.logTag, Intrinsics.stringPlus("getProcessCommands: detail processCommands = ", CollectionsKt___CollectionsKt.reversed(CollectionsKt___CollectionsKt.distinct(arrayList))));
        return listReversed2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ContentProviderClient getProviderClient() {
        ContentResolver contentResolver;
        IClientUserContext userContext$client_release = ClientChannel.INSTANCE.getUserContext$client_release();
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = null;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient2 = userContext$client_release == null ? null : userContext$client_release.acquireUnstableContentProviderClient(this.serverAuthority);
        if (contentProviderClientAcquireUnstableContentProviderClient2 == null) {
            Context context = getContext();
            if (context != null && (contentResolver = context.getContentResolver()) != null) {
                contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(this.serverAuthority);
            }
        } else {
            contentProviderClientAcquireUnstableContentProviderClient = contentProviderClientAcquireUnstableContentProviderClient2;
        }
        LogUtil.d(TAG, "getProviderClient, providerClient=" + contentProviderClientAcquireUnstableContentProviderClient + ", serverAuthority=" + this.serverAuthority + ", context=" + getContext());
        return contentProviderClientAcquireUnstableContentProviderClient;
    }

    private final boolean processObserve(final String resUri, final byte[] params) {
        Lazy<?> lazy;
        if (this.currentObserveRes.contains(resUri)) {
            return false;
        }
        LogUtil.i(TAG, "processObserve resUri=" + resUri + '.');
        ClientDI clientDI = ClientDI.INSTANCE;
        if (clientDI.getSingleInstanceMap().get(Reflection.getOrCreateKotlinClass(ExecutorService.class)) == null) {
            clientDI.onError("the class of [" + ((Object) Reflection.getOrCreateKotlinClass(ExecutorService.class).getSimpleName()) + "] are not injected");
            lazy = new Lazy<ExecutorService>() { // from class: com.oplus.channel.client.ClientProxy$processObserve$$inlined$injectSingle$1
                @Override // p010kotlin.Lazy
                @Nullable
                public ExecutorService getValue() {
                    return null;
                }

                @Override // p010kotlin.Lazy
                public boolean isInitialized() {
                    return false;
                }
            };
        } else {
            Lazy<?> lazy2 = clientDI.getSingleInstanceMap().get(Reflection.getOrCreateKotlinClass(ExecutorService.class));
            if (lazy2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Lazy<T of com.oplus.channel.client.utils.ClientDI.injectSingle>");
            }
            lazy = lazy2;
        }
        ExecutorService executorServiceM5148processObserve$lambda22 = m5148processObserve$lambda22(lazy);
        if (executorServiceM5148processObserve$lambda22 == null) {
            return true;
        }
        executorServiceM5148processObserve$lambda22.submit(new Runnable() { // from class: com.oplus.aiunit.vision.yf3
            @Override // java.lang.Runnable
            public final void run() {
                ClientProxy.m5149processObserve$lambda23(this.i, resUri, params);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: processObserve$lambda-22, reason: not valid java name */
    private static final ExecutorService m5148processObserve$lambda22(Lazy<? extends ExecutorService> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: processObserve$lambda-23, reason: not valid java name */
    public static final void m5149processObserve$lambda23(final ClientProxy this$0, final String resUri, final byte[] bArr) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(resUri, "$resUri");
        this$0.m5159runWithCatchIoAF18A(new Function0<Unit>() { // from class: com.oplus.channel.client.ClientProxy$processObserve$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                IClient iClient = this.this$0.iClient;
                final String str = resUri;
                byte[] bArr2 = bArr;
                final ClientProxy clientProxy = this.this$0;
                iClient.observe(str, bArr2, new Function1<byte[], Unit>() { // from class: com.oplus.channel.client.ClientProxy$processObserve$1$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p010kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr3) throws Exception {
                        invoke2(bArr3);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull byte[] result) throws Exception {
                        Intrinsics.checkNotNullParameter(result, "result");
                        ContentProviderClient providerClient = clientProxy.getProviderClient();
                        if (providerClient == null) {
                            ClientProxy clientProxy2 = clientProxy;
                            String str2 = str;
                            LogUtil.i(clientProxy2.logTag, "processObserve resUri=" + str2 + ", serverAuthority: " + clientProxy2.getServerAuthority() + ", providerClient is null.");
                            return;
                        }
                        ClientProxy clientProxy3 = clientProxy;
                        String str3 = str;
                        try {
                            String clientName = clientProxy3.getClientName();
                            Bundle bundle = new Bundle();
                            LogUtil.i(clientProxy3.logTag, "processObserve resUri=" + str3 + ", size is: " + result.length);
                            bundle.putString("RESULT_CALLBACK_ID", str3);
                            bundle.putByteArray("RESULT_CALLBACK_DATA", result);
                            Unit unit = Unit.INSTANCE;
                            providerClient.call("callback", clientName, bundle);
                            AutoCloseableKt.closeFinally(providerClient, null);
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                AutoCloseableKt.closeFinally(providerClient, th);
                                throw th2;
                            }
                        }
                    }
                });
            }
        });
    }

    private final void processReplaceObserve(final String resUri, final byte[] params) {
        Lazy<?> lazy;
        LogUtil.i(TAG, "processReplaceObserve resUri=" + resUri + '.');
        if (this.currentObserveRes.contains(resUri)) {
            return;
        }
        ClientDI clientDI = ClientDI.INSTANCE;
        if (clientDI.getSingleInstanceMap().get(Reflection.getOrCreateKotlinClass(ExecutorService.class)) == null) {
            clientDI.onError("the class of [" + ((Object) Reflection.getOrCreateKotlinClass(ExecutorService.class).getSimpleName()) + "] are not injected");
            lazy = new Lazy<ExecutorService>() { // from class: com.oplus.channel.client.ClientProxy$processReplaceObserve$$inlined$injectSingle$1
                @Override // p010kotlin.Lazy
                @Nullable
                public ExecutorService getValue() {
                    return null;
                }

                @Override // p010kotlin.Lazy
                public boolean isInitialized() {
                    return false;
                }
            };
        } else {
            Lazy<?> lazy2 = clientDI.getSingleInstanceMap().get(Reflection.getOrCreateKotlinClass(ExecutorService.class));
            if (lazy2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Lazy<T of com.oplus.channel.client.utils.ClientDI.injectSingle>");
            }
            lazy = lazy2;
        }
        ExecutorService executorServiceM5150processReplaceObserve$lambda24 = m5150processReplaceObserve$lambda24(lazy);
        if (executorServiceM5150processReplaceObserve$lambda24 == null) {
            return;
        }
        executorServiceM5150processReplaceObserve$lambda24.submit(new Runnable() { // from class: com.oplus.aiunit.vision.wf3
            @Override // java.lang.Runnable
            public final void run() {
                ClientProxy.m5151processReplaceObserve$lambda25(this.i, resUri, params);
            }
        });
    }

    /* JADX INFO: renamed from: processReplaceObserve$lambda-24, reason: not valid java name */
    private static final ExecutorService m5150processReplaceObserve$lambda24(Lazy<? extends ExecutorService> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: processReplaceObserve$lambda-25, reason: not valid java name */
    public static final void m5151processReplaceObserve$lambda25(final ClientProxy this$0, final String resUri, final byte[] bArr) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(resUri, "$resUri");
        this$0.m5159runWithCatchIoAF18A(new Function0<Unit>() { // from class: com.oplus.channel.client.ClientProxy$processReplaceObserve$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                LogUtil.i(this.this$0.logTag, Intrinsics.stringPlus("processReplaceObserve--resUri: ", resUri));
                IClient iClient = this.this$0.iClient;
                final String str = resUri;
                byte[] bArr2 = bArr;
                final ClientProxy clientProxy = this.this$0;
                iClient.replaceObserve(str, bArr2, new Function1<byte[], Unit>() { // from class: com.oplus.channel.client.ClientProxy$processReplaceObserve$1$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p010kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr3) throws Exception {
                        invoke2(bArr3);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull byte[] result) throws Exception {
                        Intrinsics.checkNotNullParameter(result, "result");
                        ContentProviderClient providerClient = clientProxy.getProviderClient();
                        if (providerClient == null) {
                            return;
                        }
                        ClientProxy clientProxy2 = clientProxy;
                        String str2 = str;
                        try {
                            String clientName = clientProxy2.getClientName();
                            Bundle bundle = new Bundle();
                            bundle.putString("RESULT_CALLBACK_ID", str2);
                            bundle.putByteArray("RESULT_CALLBACK_DATA", result);
                            Unit unit = Unit.INSTANCE;
                            providerClient.call("callback", clientName, bundle);
                            AutoCloseableKt.closeFinally(providerClient, null);
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                AutoCloseableKt.closeFinally(providerClient, th);
                                throw th2;
                            }
                        }
                    }
                });
            }
        });
    }

    private final void processRequest(final Command cmd) {
        Lazy<?> lazy;
        final byte[] params = cmd.getParams();
        if (params == null) {
            LogUtil.w(this.logTag, "processCommandList error " + cmd + StringUtil.SPACE);
            return;
        }
        ClientDI clientDI = ClientDI.INSTANCE;
        if (clientDI.getSingleInstanceMap().get(Reflection.getOrCreateKotlinClass(ExecutorService.class)) == null) {
            clientDI.onError("the class of [" + ((Object) Reflection.getOrCreateKotlinClass(ExecutorService.class).getSimpleName()) + "] are not injected");
            lazy = new Lazy<ExecutorService>() { // from class: com.oplus.channel.client.ClientProxy$processRequest$$inlined$injectSingle$1
                @Override // p010kotlin.Lazy
                @Nullable
                public ExecutorService getValue() {
                    return null;
                }

                @Override // p010kotlin.Lazy
                public boolean isInitialized() {
                    return false;
                }
            };
        } else {
            Lazy<?> lazy2 = clientDI.getSingleInstanceMap().get(Reflection.getOrCreateKotlinClass(ExecutorService.class));
            if (lazy2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Lazy<T of com.oplus.channel.client.utils.ClientDI.injectSingle>");
            }
            lazy = lazy2;
        }
        ExecutorService executorServiceM5152processRequest$lambda28 = m5152processRequest$lambda28(lazy);
        if (executorServiceM5152processRequest$lambda28 == null) {
            return;
        }
        executorServiceM5152processRequest$lambda28.submit(new Runnable() { // from class: com.oplus.aiunit.vision.vf3
            @Override // java.lang.Runnable
            public final void run() {
                ClientProxy.m5153processRequest$lambda29(this.i, cmd, params);
            }
        });
    }

    /* JADX INFO: renamed from: processRequest$lambda-28, reason: not valid java name */
    private static final ExecutorService m5152processRequest$lambda28(Lazy<? extends ExecutorService> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: processRequest$lambda-29, reason: not valid java name */
    public static final void m5153processRequest$lambda29(final ClientProxy this$0, Command cmd, final byte[] bArr) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(cmd, "$cmd");
        LogUtil.d(this$0.logTag, Intrinsics.stringPlus("processRequest: cmd=", cmd));
        this$0.m5159runWithCatchIoAF18A(new Function0<Unit>() { // from class: com.oplus.channel.client.ClientProxy$processRequest$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.iClient.request(bArr);
            }
        });
    }

    private final void processRequestOnce(final Command cmd) {
        Lazy<?> lazy;
        final byte[] params = cmd.getParams();
        if (params == null || StringsKt__StringsJVMKt.isBlank(cmd.getCallbackId())) {
            LogUtil.w(this.logTag, "processCommandList error " + cmd + StringUtil.SPACE);
            return;
        }
        ClientDI clientDI = ClientDI.INSTANCE;
        if (clientDI.getSingleInstanceMap().get(Reflection.getOrCreateKotlinClass(ExecutorService.class)) == null) {
            clientDI.onError("the class of [" + ((Object) Reflection.getOrCreateKotlinClass(ExecutorService.class).getSimpleName()) + "] are not injected");
            lazy = new Lazy<ExecutorService>() { // from class: com.oplus.channel.client.ClientProxy$processRequestOnce$$inlined$injectSingle$1
                @Override // p010kotlin.Lazy
                @Nullable
                public ExecutorService getValue() {
                    return null;
                }

                @Override // p010kotlin.Lazy
                public boolean isInitialized() {
                    return false;
                }
            };
        } else {
            Lazy<?> lazy2 = clientDI.getSingleInstanceMap().get(Reflection.getOrCreateKotlinClass(ExecutorService.class));
            if (lazy2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Lazy<T of com.oplus.channel.client.utils.ClientDI.injectSingle>");
            }
            lazy = lazy2;
        }
        ExecutorService executorServiceM5154processRequestOnce$lambda26 = m5154processRequestOnce$lambda26(lazy);
        if (executorServiceM5154processRequestOnce$lambda26 == null) {
            return;
        }
        executorServiceM5154processRequestOnce$lambda26.submit(new Runnable() { // from class: com.oplus.aiunit.vision.uf3
            @Override // java.lang.Runnable
            public final void run() {
                ClientProxy.m5155processRequestOnce$lambda27(this.i, cmd, params);
            }
        });
    }

    /* JADX INFO: renamed from: processRequestOnce$lambda-26, reason: not valid java name */
    private static final ExecutorService m5154processRequestOnce$lambda26(Lazy<? extends ExecutorService> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: processRequestOnce$lambda-27, reason: not valid java name */
    public static final void m5155processRequestOnce$lambda27(final ClientProxy this$0, final Command cmd, final byte[] bArr) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(cmd, "$cmd");
        this$0.m5159runWithCatchIoAF18A(new Function0<Unit>() { // from class: com.oplus.channel.client.ClientProxy$processRequestOnce$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                LogUtil.i(this.this$0.logTag, Intrinsics.stringPlus("processRequestOnce: cmd=", cmd));
                IClient iClient = this.this$0.iClient;
                byte[] bArr2 = bArr;
                final ClientProxy clientProxy = this.this$0;
                final Command command = cmd;
                iClient.requestOnce(bArr2, new Function1<byte[], Unit>() { // from class: com.oplus.channel.client.ClientProxy$processRequestOnce$1$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p010kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr3) throws Exception {
                        invoke2(bArr3);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull byte[] result) throws Exception {
                        Intrinsics.checkNotNullParameter(result, "result");
                        ContentProviderClient providerClient = clientProxy.getProviderClient();
                        if (providerClient == null) {
                            return;
                        }
                        ClientProxy clientProxy2 = clientProxy;
                        Command command2 = command;
                        try {
                            String clientName = clientProxy2.getClientName();
                            Bundle bundle = new Bundle();
                            bundle.putString("RESULT_CALLBACK_ID", command2.getCallbackId());
                            bundle.putByteArray("RESULT_CALLBACK_DATA", result);
                            Unit unit = Unit.INSTANCE;
                            providerClient.call("callback", clientName, bundle);
                            AutoCloseableKt.closeFinally(providerClient, null);
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                AutoCloseableKt.closeFinally(providerClient, th);
                                throw th2;
                            }
                        }
                    }
                });
            }
        });
    }

    private final void processUnObserve(final String observeRes) {
        Lazy<?> lazy;
        ClientDI clientDI = ClientDI.INSTANCE;
        if (clientDI.getSingleInstanceMap().get(Reflection.getOrCreateKotlinClass(ExecutorService.class)) == null) {
            clientDI.onError("the class of [" + ((Object) Reflection.getOrCreateKotlinClass(ExecutorService.class).getSimpleName()) + "] are not injected");
            lazy = new Lazy<ExecutorService>() { // from class: com.oplus.channel.client.ClientProxy$processUnObserve$$inlined$injectSingle$1
                @Override // p010kotlin.Lazy
                @Nullable
                public ExecutorService getValue() {
                    return null;
                }

                @Override // p010kotlin.Lazy
                public boolean isInitialized() {
                    return false;
                }
            };
        } else {
            Lazy<?> lazy2 = clientDI.getSingleInstanceMap().get(Reflection.getOrCreateKotlinClass(ExecutorService.class));
            if (lazy2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Lazy<T of com.oplus.channel.client.utils.ClientDI.injectSingle>");
            }
            lazy = lazy2;
        }
        ExecutorService executorServiceM5156processUnObserve$lambda30 = m5156processUnObserve$lambda30(lazy);
        if (executorServiceM5156processUnObserve$lambda30 == null) {
            return;
        }
        executorServiceM5156processUnObserve$lambda30.submit(new Runnable() { // from class: com.oplus.aiunit.vision.xf3
            @Override // java.lang.Runnable
            public final void run() {
                ClientProxy.m5157processUnObserve$lambda31(this.i, observeRes);
            }
        });
    }

    /* JADX INFO: renamed from: processUnObserve$lambda-30, reason: not valid java name */
    private static final ExecutorService m5156processUnObserve$lambda30(Lazy<? extends ExecutorService> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: processUnObserve$lambda-31, reason: not valid java name */
    public static final void m5157processUnObserve$lambda31(final ClientProxy this$0, final String observeRes) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(observeRes, "$observeRes");
        LogUtil.i(this$0.logTag, Intrinsics.stringPlus("processUnObserve: observeRes=", observeRes));
        this$0.m5159runWithCatchIoAF18A(new Function0<Unit>() { // from class: com.oplus.channel.client.ClientProxy$processUnObserve$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.iClient.unObserve(observeRes);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: pullAndRunCommand$lambda-12, reason: not valid java name */
    public static final void m5158pullAndRunCommand$lambda12(ClientProxy this$0) {
        Object objM5287constructorimpl;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.shouldRetryRegister) {
            this$0.tryRegisterContentObserver();
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(this$0.pullCommand());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            LogUtil.e(this$0.logTag, "pullAndRunCommand exception = " + ((Object) thM5290exceptionOrNullimpl.getMessage()) + StringUtil.SPACE);
        }
        PullResult pullResult = new PullResult(CollectionsKt__CollectionsKt.emptyList(), true);
        if (Result.m5293isFailureimpl(objM5287constructorimpl)) {
            objM5287constructorimpl = pullResult;
        }
        PullResult pullResult2 = (PullResult) objM5287constructorimpl;
        if (pullResult2.getIdleState()) {
            LogUtil.i(this$0.logTag, "pullAndRunCommand pullResult.idleState = true ");
            return;
        }
        List<Command> commandClients = pullResult2.getCommandClients();
        LogUtil.i(this$0.logTag, Intrinsics.stringPlus("pullAndRunCommand commandList = ", commandClients));
        this$0.processCommandList(commandClients);
    }

    private final PullResult pullCommand() throws Exception {
        ContentProviderClient providerClient = getProviderClient();
        if (providerClient == null) {
            LogUtil.i(this.logTag, "pullCommand with null client ");
            return new PullResult(CollectionsKt__CollectionsKt.emptyList(), false);
        }
        try {
            Bundle bundleCall = providerClient.call("pullCommand", getClientName(), null);
            AutoCloseableKt.closeFinally(providerClient, null);
            return handlePullCommand(bundleCall);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AutoCloseableKt.closeFinally(providerClient, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: runWithCatch-IoAF18A, reason: not valid java name */
    private final Object m5159runWithCatchIoAF18A(Function0<Unit> call) {
        Object objM5287constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            call.invoke();
            objM5287constructorimpl = Result.m5287constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            LogUtil.e(Intrinsics.stringPlus(this.logTag, "_ERR"), Intrinsics.stringPlus("executorService has error:", thM5290exceptionOrNullimpl.getMessage()));
        }
        return objM5287constructorimpl;
    }

    private final void tryRegisterContentObserver() {
        Object objM5287constructorimpl;
        ContentResolver contentResolver;
        LogUtil.d(this.logTag, "tryRegisterContentObserver");
        try {
            Result.Companion companion = Result.INSTANCE;
            Context context = getContext();
            if (context != null && (contentResolver = context.getContentResolver()) != null) {
                contentResolver.registerContentObserver(this.uri, false, this.observer);
            }
            this.shouldRetryRegister = false;
            objM5287constructorimpl = Result.m5287constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            LogUtil.e(this.logTag, Intrinsics.stringPlus("try registerContentObserver error ", thM5290exceptionOrNullimpl.getMessage()));
            this.shouldRetryRegister = true;
        }
    }

    @Override // com.oplus.channel.client.IBatchClientProxy
    public boolean batchCallback(@NotNull String clientName, @NotNull List<String> callbackIds, @NotNull byte[] data) {
        Object objM5287constructorimpl;
        ContentResolver contentResolver;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient;
        Intrinsics.checkNotNullParameter(clientName, "clientName");
        Intrinsics.checkNotNullParameter(callbackIds, "callbackIds");
        Intrinsics.checkNotNullParameter(data, "data");
        boolean zBooleanValue = false;
        if (!this.batchCallBackSupport.get()) {
            LogUtil.w(this.logTag, "batchCallback not batchCallBackSupport");
            return false;
        }
        LogUtil.d(this.logTag, "batchCallback clientName:" + clientName + " callbackIds:" + CollectionsKt___CollectionsKt.toList(callbackIds));
        try {
            Result.Companion companion = Result.INSTANCE;
            Context context = getContext();
            Boolean bool = null;
            if (context != null && (contentResolver = context.getContentResolver()) != null && (contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(getServerAuthority())) != null) {
                try {
                    Bundle bundle = new Bundle();
                    Object[] array = callbackIds.toArray(new String[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    bundle.putStringArray("RESULT_CALLBACK_ID_LIST", (String[]) array);
                    bundle.putByteArray("RESULT_CALLBACK_DATA", data);
                    Unit unit = Unit.INSTANCE;
                    Bundle bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("batch_callback", clientName, bundle);
                    Boolean boolValueOf = Boolean.valueOf(bundleCall != null && bundleCall.getInt("batch_call_result") == 0);
                    AutoCloseableKt.closeFinally(contentProviderClientAcquireUnstableContentProviderClient, null);
                    bool = boolValueOf;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AutoCloseableKt.closeFinally(contentProviderClientAcquireUnstableContentProviderClient, th);
                        throw th2;
                    }
                }
            }
            if (bool == null) {
                LogUtil.w(this.logTag, "batchCallback with null client");
            } else {
                zBooleanValue = bool.booleanValue();
            }
            objM5287constructorimpl = Result.m5287constructorimpl(Boolean.valueOf(zBooleanValue));
        } catch (Throwable th3) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th3));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            LogUtil.e(this.logTag, Intrinsics.stringPlus("batchCallback error ", thM5290exceptionOrNullimpl.getMessage()));
        }
        Boolean bool2 = Boolean.FALSE;
        if (Result.m5293isFailureimpl(objM5287constructorimpl)) {
            objM5287constructorimpl = bool2;
        }
        Boolean bool3 = (Boolean) objM5287constructorimpl;
        boolean zBooleanValue2 = bool3.booleanValue();
        LogUtil.d(this.logTag, "batchCallback clientName:" + clientName + " batchCallResult:" + zBooleanValue2);
        return bool3.booleanValue();
    }

    public final void destroy() {
        Object objM5287constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNull(context);
            context.getContentResolver().unregisterContentObserver(this.observer);
            objM5287constructorimpl = Result.m5287constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            LogUtil.w(this.logTag, Intrinsics.stringPlus("error in destroy ", thM5290exceptionOrNullimpl.getMessage()));
        }
    }

    @NotNull
    public final String getClientName() {
        return this.clientName;
    }

    @NotNull
    public final String getServerAuthority() {
        return this.serverAuthority;
    }

    @NotNull
    public final PullResult handlePullCommand(@Nullable Bundle result) {
        boolean z = result != null && result.getBoolean("RESULT_BATCH_CALLBACK_SUPPORT");
        LogUtil.d(TAG, Intrinsics.stringPlus("handlePullCommand batchCallBackSupport is ", Boolean.valueOf(z)));
        if (z != this.batchCallBackSupport.get()) {
            this.batchCallBackSupport.set(z);
        }
        byte[] byteArray = result == null ? null : result.getByteArray("RESULT_COMMAND_LIST");
        boolean z2 = result == null ? false : result.getBoolean("RESULT_IDLE_STATE", false);
        if (byteArray == null) {
            LogUtil.w(this.logTag, "pullCommand, result.byteArray is null");
            return new PullResult(CollectionsKt__CollectionsKt.emptyList(), z2);
        }
        Parcel parcelObtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain()");
        ArrayList arrayList = new ArrayList();
        try {
            try {
                parcelObtain.unmarshall(byteArray, 0, byteArray.length);
                parcelObtain.setDataPosition(0);
                if (parcelObtain.readInt() == 1) {
                    int i = parcelObtain.readInt();
                    for (int i2 = 0; i2 < i; i2++) {
                        parcelObtain.readInt();
                        int i3 = parcelObtain.readInt();
                        parcelObtain.readInt();
                        String string = parcelObtain.readString();
                        if (string == null) {
                            string = "";
                        }
                        parcelObtain.readInt();
                        byte[] bArr = new byte[parcelObtain.readInt()];
                        parcelObtain.readByteArray(bArr);
                        arrayList.add(new Command(i3, string, bArr));
                        Command.INSTANCE.passObject(parcelObtain);
                    }
                }
            } catch (Exception e2) {
                LogUtil.e(TAG, Intrinsics.stringPlus("handlePullCommand Exception : ", e2.getMessage()));
            }
            return new PullResult(arrayList, z2);
        } finally {
            parcelObtain.recycle();
        }
    }

    public final void processCommandList(@NotNull List<Command> commandClients) {
        Intrinsics.checkNotNullParameter(commandClients, "commandClients");
        List<Command> processCommands = getProcessCommands(commandClients);
        HashMap<String, byte[]> map = new HashMap<>();
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (Command command : processCommands) {
            int methodType = command.getMethodType();
            if (methodType == 0) {
                processRequest(command);
            } else if (methodType == 1) {
                processRequestOnce(command);
            } else if (methodType == 2) {
                String callbackId = command.getCallbackId();
                map.put(callbackId, command.getParams());
                if (processObserve(callbackId, command.getParams())) {
                    z = true;
                }
            } else if (methodType == 3) {
                String callbackId2 = command.getCallbackId();
                map.put(callbackId2, command.getParams());
                processReplaceObserve(callbackId2, command.getParams());
            } else if (methodType == 4) {
                arrayList.add(command.getCallbackId());
            }
        }
        boolean zCalculateUnObserve = calculateUnObserve(z, map, arrayList);
        Set<String> setKeySet = map.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "observeMap.keys");
        List<String> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) setKeySet);
        if (zCalculateUnObserve) {
            this.iClient.observes(mutableList);
            this.iClient.observes(map);
        }
        this.currentObserveRes.clear();
        this.currentObserveRes.addAll(mutableList);
    }

    public final void pullAndRunCommand() {
        WorkHandler.INSTANCE.getInstance().post(new Runnable() { // from class: com.oplus.aiunit.vision.zf3
            @Override // java.lang.Runnable
            public final void run() {
                ClientProxy.m5158pullAndRunCommand$lambda12(this.i);
            }
        });
    }
}
