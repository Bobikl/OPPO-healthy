package com.heytap.health.watch.records.client;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.protobuf.InvalidProtocolBufferException;
import com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler;
import com.heytap.health.watch.records.db.RecordFileDaoImpl;
import com.heytap.health.watch.records.manager.BackgroundSyncHelper;
import com.heytap.health.watch.records.utils.RecordMediaFileUtil;
import com.heytap.health.watch.records.utils.SyncUtil;
import com.heytap.wearable.soundrecord.bean.SoundRecord$RecordCheckRequest;
import com.heytap.wearable.soundrecord.bean.SoundRecord$RecordDeleteRequest;
import com.heytap.wearable.soundrecord.bean.SoundRecord$RecordInfo;
import com.heytap.wearable.soundrecord.bean.SoundRecord$RecordSwitchAutoSyncResponse;
import com.heytap.wearable.soundrecord.bean.SoundRecord$RecordWatchSyncRequest;
import com.oplus.aiunit.vision.RecordFileDbBean;
import com.oplus.aiunit.vision.eui;
import com.oplus.aiunit.vision.pwf;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@Route(path = "/records/RecordMessageReceiver")
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¨\u0006\r"}, d2 = {"Lcom/heytap/health/watch/records/client/RecordMessageReceiver;", "Lcom/heytap/health/devicemanager/client/impl/arouter/DMIMessageHandler;", "", "nodeId", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "msgEvent", "", "onMessageReceived", "c", "<init>", "()V", "Companion", "a", "recordfilemanager_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRecordMessageReceiver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordMessageReceiver.kt\ncom/heytap/health/watch/records/client/RecordMessageReceiver\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,132:1\n29#2:133\n*S KotlinDebug\n*F\n+ 1 RecordMessageReceiver.kt\ncom/heytap/health/watch/records/client/RecordMessageReceiver\n*L\n107#1:133\n*E\n"})
public final class RecordMessageReceiver extends DMIMessageHandler {

    @NotNull
    public static final String TAG = "RecordMessageReceiver";

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void c(String nodeId, MessageEvent msgEvent) throws InvalidProtocolBufferException {
        String strH;
        int commandId = msgEvent.getCommandId();
        boolean z = true;
        int i = 0;
        zEquals = false;
        boolean zEquals = false;
        i = 0;
        i = 0;
        i = 0;
        i = 0;
        long fileId = 0;
        if (commandId == 3) {
            SoundRecord$RecordDeleteRequest from = SoundRecord$RecordDeleteRequest.parseFrom(msgEvent.getData());
            BackgroundSyncHelper backgroundSyncHelper = BackgroundSyncHelper.INSTANCE;
            String fileName = from.getFileName();
            Intrinsics.checkNotNullExpressionValue(fileName, "deleteRequest.fileName");
            backgroundSyncHelper.e(nodeId, fileName, from.getFileId());
        } else if (commandId == 4) {
            SoundRecord$RecordInfo request = SoundRecord$RecordWatchSyncRequest.parseFrom(msgEvent.getData()).getInfo();
            if (eui.INSTANCE.c()) {
                i = 2;
            } else {
                BackgroundSyncHelper backgroundSyncHelper2 = BackgroundSyncHelper.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(request, "request");
                backgroundSyncHelper2.g(nodeId, request);
            }
            fileId = request.getFileId();
        } else if (commandId != 5) {
            if (commandId != 6) {
                if (commandId == 7) {
                    SoundRecord$RecordCheckRequest from2 = SoundRecord$RecordCheckRequest.parseFrom(msgEvent.getData());
                    pwf.a(TAG, "onMessageReceived watchRequest fileId " + from2.getFileId() + " fileName " + from2.getFileName() + " ");
                    RecordFileDbBean dhfVarC = RecordFileDaoImpl.INSTANCE.c(nodeId, from2.getFileId());
                    if (dhfVarC != null && (strH = dhfVarC.getCom.oplus.smartenginehelper.ParserTag.TAG_URI java.lang.String()) != null) {
                        String strD = RecordMediaFileUtil.INSTANCE.d(Uri.parse(strH));
                        pwf.a(TAG, "check file exist local " + dhfVarC.getFileMd5() + " fact " + strD);
                        zEquals = TextUtils.equals(dhfVarC.getFileMd5(), strD);
                    }
                    MessageSendClient.INSTANCE.b(zEquals);
                    return;
                }
            } else if (SyncUtil.INSTANCE.a()) {
                if (SoundRecord$RecordSwitchAutoSyncResponse.parseFrom(msgEvent.getData()).getSwitch() == 1) {
                    BackgroundSyncHelper.INSTANCE.h(nodeId);
                } else {
                    BackgroundSyncHelper.INSTANCE.i(nodeId);
                }
            }
            z = false;
        } else if (SyncUtil.INSTANCE.a()) {
            BackgroundSyncHelper.INSTANCE.h(nodeId);
        }
        if (z) {
            MessageSendClient.INSTANCE.g(msgEvent.getCommandId(), i, fileId);
        }
    }

    @Override // com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler
    public void onMessageReceived(@NotNull String nodeId, @NotNull MessageEvent msgEvent) {
        Intrinsics.checkNotNullParameter(nodeId, "nodeId");
        Intrinsics.checkNotNullParameter(msgEvent, "msgEvent");
        pwf.a(TAG, "onMessageReceived nodeId " + nodeId + " messageEvent " + msgEvent);
        try {
            c(nodeId, msgEvent);
        } catch (Exception e2) {
            pwf.e(TAG, "onMessageReceived exception " + e2);
        }
    }
}
