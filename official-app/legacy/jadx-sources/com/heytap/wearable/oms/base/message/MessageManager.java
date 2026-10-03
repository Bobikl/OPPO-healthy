package com.heytap.wearable.oms.base.message;

import com.google.protobuf.InvalidProtocolBufferException;
import com.heytap.health.watch.thirdparty.WEExtensionKt;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.heytap.wearable.health.Exercise$ExerciseSampleData;
import com.heytap.wearable.oms.base.handler.internal.MessageHandler;
import com.heytap.wearable.oms.base.message.MessageManager;
import com.oplus.aiunit.vision.gue;
import com.oplus.aiunit.vision.k25;
import com.oplus.aiunit.vision.sx9;
import com.oplus.aiunit.vision.yhl;
import com.oplus.aiunit.vision.yv6;
import com.oplus.ocs.wearengine.proto.WearEngineProto$WEMessage;
import com.oplus.ocs.wearengine.proto.WearEngineProto$WEMessageHeader;
import com.oplus.ocs.wearengine.proto.WearEngineProto$WEPermissionInfo;
import com.oplus.ocs.wearengine.proto.WearEngineProto$WEPermissionInfoList;
import io.protostuff.MapSchema;
import java.util.List;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function4;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007R2\u0010\u000f\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/heytap/wearable/oms/base/message/MessageManager;", "Lcom/oplus/aiunit/vision/sx9;", "", "nodeId", "", SpeechConstant.KEY_EVENT_SID, "commandId", "", "data", "", "f", "Lkotlin/Function4;", "Lcom/oplus/ocs/wearengine/proto/WearEngineProto$WEMessage;", "a", "Lkotlin/jvm/functions/Function4;", "handler", "Ljava/util/concurrent/Executor;", "d", "()Ljava/util/concurrent/Executor;", "executor", MapSchema.FIELD_NAME_ENTRY, "()Ljava/lang/String;", "tag", "<init>", "()V", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
public abstract class MessageManager implements sx9 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Function4<Integer, Integer, String, WearEngineProto$WEMessage, Unit> handler = new Function4<Integer, Integer, String, WearEngineProto$WEMessage, Unit>() { // from class: com.heytap.wearable.oms.base.message.MessageManager$handler$1
        {
            super(4);
        }

        @Override // p010kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2, String str, WearEngineProto$WEMessage wearEngineProto$WEMessage) {
            invoke(num.intValue(), num2.intValue(), str, wearEngineProto$WEMessage);
            return Unit.INSTANCE;
        }

        public final void invoke(int i, int i2, @NotNull String nodeId, @NotNull WearEngineProto$WEMessage message) {
            Exercise$ExerciseSampleData from;
            Intrinsics.checkNotNullParameter(nodeId, "nodeId");
            Intrinsics.checkNotNullParameter(message, "message");
            k25.a(this.this$0.e(), "handler sid:" + i + ", commandId:" + i2 + ", header:" + message.getHeader() + ", body:" + message.getBody());
            if (i2 == 101) {
                try {
                    from = Exercise$ExerciseSampleData.parseFrom(message.getBody().getData());
                } catch (InvalidProtocolBufferException unused) {
                    from = null;
                }
                if (from != null) {
                    yv6 yv6Var = yv6.INSTANCE;
                    WearEngineProto$WEMessageHeader header = message.getHeader();
                    Intrinsics.checkNotNullExpressionValue(header, "message.header");
                    yv6Var.g(header, from);
                }
                return;
            }
            switch (i2) {
                case 1:
                    MessageHandler.INSTANCE.l(this.this$0, i, nodeId, message, 2, new Object[0]);
                    break;
                case 2:
                    MessageHandler.INSTANCE.k(this.this$0, nodeId, message, new Object[0]);
                    break;
                case 3:
                    gue.INSTANCE.l(this.this$0, i, nodeId, message, 4, new Object[0]);
                    break;
                case 4:
                    gue.INSTANCE.k(this.this$0, nodeId, message, new Object[0]);
                    break;
                case 5:
                    MessageHandler.INSTANCE.l(this.this$0, i, nodeId, message, 6, new Object[0]);
                    break;
                case 6:
                    MessageHandler.INSTANCE.k(this.this$0, nodeId, message, new Object[0]);
                    break;
                case 7:
                    gue.INSTANCE.l(this.this$0, i, nodeId, message, 8, new Object[0]);
                    break;
                case 8:
                    gue.INSTANCE.k(this.this$0, nodeId, message, new Object[0]);
                    break;
            }
        }
    };

    public static final void g(MessageManager this$0, int i, int i2, String nodeId, WearEngineProto$WEMessage wearableMessage) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(nodeId, "$nodeId");
        Intrinsics.checkNotNullParameter(wearableMessage, "$wearableMessage");
        try {
            this$0.handler.invoke(Integer.valueOf(i), Integer.valueOf(i2), nodeId, wearableMessage);
        } catch (Exception e2) {
            k25.b(this$0.e(), "handler() error, " + e2.getMessage());
        }
    }

    @Nullable
    public Executor d() {
        return null;
    }

    public final String e() {
        return "ThirdServiceMessageManager";
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void f(@NotNull final String nodeId, final int sid, final int commandId, @NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(nodeId, "nodeId");
        Intrinsics.checkNotNullParameter(data, "data");
        WearEngineProto$WEMessage from = null;
        WearEngineProto$WEPermissionInfoList from2 = null;
        if (commandId == 9) {
            try {
                from2 = WearEngineProto$WEPermissionInfoList.parseFrom(data);
            } catch (InvalidProtocolBufferException e2) {
                k25.b(e(), "InvalidProtocolBufferException e = " + e2.getMessage());
            }
            if (from2 == null || from2.getPermissionInfoList() == null) {
                return;
            }
            List<WearEngineProto$WEPermissionInfo> permissionInfoList = from2.getPermissionInfoList();
            Intrinsics.checkNotNullExpressionValue(permissionInfoList, "permissionInfoList.permissionInfoList");
            WEExtensionKt.o(permissionInfoList);
            return;
        }
        try {
            from = WearEngineProto$WEMessage.parseFrom(data);
        } catch (Exception e3) {
            k25.b(e(), "onMessageReceived() error, " + e3.getMessage());
        }
        final WearEngineProto$WEMessage wearEngineProto$WEMessage = from;
        if (wearEngineProto$WEMessage == null) {
            return;
        }
        k25.a(e(), "onMessageReceived header=" + wearEngineProto$WEMessage.getHeader() + "; body=" + wearEngineProto$WEMessage.getBody());
        if (yhl.INSTANCE.b().a(sid, wearEngineProto$WEMessage)) {
            k25.d(e(), "onMessageReceived messageIntercept sid=" + sid + ", path =" + wearEngineProto$WEMessage.getBody().getPath());
            return;
        }
        Executor executorD = d();
        if (executorD != null) {
            executorD.execute(new Runnable() { // from class: com.oplus.aiunit.vision.fyb
                @Override // java.lang.Runnable
                public final void run() {
                    MessageManager.g(this.i, sid, commandId, nodeId, wearEngineProto$WEMessage);
                }
            });
            return;
        }
        try {
            this.handler.invoke(Integer.valueOf(sid), Integer.valueOf(commandId), nodeId, wearEngineProto$WEMessage);
        } catch (Exception e4) {
            k25.b(e(), "executor() error, " + e4.getMessage());
        }
    }
}
