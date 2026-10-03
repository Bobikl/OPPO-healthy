package com.oplus.aiunit.vision;

import android.util.ArraySet;
import com.heytap.health.watch.music.api.MusicControlApiManager;
import com.heytap.wearable.music.proto.MusicProto$ControlVolumeAction;
import com.heytap.wearable.music.proto.MusicProto$MusicControlAction;
import com.heytap.wearable.music.proto.MusicProto$MusicControllerStatus;
import com.heytap.wearable.music.proto.MusicProto$VolumeInfo;
import com.oplus.wearable.linkservice.sdk.Node;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b%\u0010&J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0016J\u0006\u0010\f\u001a\u00020\u000bJ\u0018\u0010\u0011\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u000bJ\u0006\u0010\u0014\u001a\u00020\u0005J\u0006\u0010\u0015\u001a\u00020\u000bJ\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\u0010\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001aH\u0002R\u0014\u0010\u001d\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010 R\u0016\u0010$\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/oplus/aiunit/vision/u9c;", "Lcom/oplus/aiunit/vision/ul4$b;", "Landroid/util/ArraySet;", "Lcom/oplus/aiunit/vision/auc;", "interests", "", "getInterestingStatus", "Lcom/oplus/wearable/linkservice/sdk/Node;", l9d.BUNDLE_KEY_NODE, "nodeStatus", "d", "", "c", "", "nodeId", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "messageEvent", "f", "enable", b2n.g, "i", MapSchema.FIELD_NAME_ENTRY, b2n.f, "Lcom/heytap/wearable/music/proto/MusicProto$MusicControlAction;", "musicControlAction", "b", "Lcom/heytap/wearable/music/proto/MusicProto$ControlVolumeAction;", "controlVolumeAction", "a", "ROOT_TAG", "Ljava/lang/String;", "Lcom/oplus/aiunit/vision/hbc;", "Lcom/oplus/aiunit/vision/hbc;", "mListener", "j", "Z", "mSupportLyrics", "<init>", "()V", "music_impl_release"}, k = 1, mv = {1, 8, 0})
public final class u9c implements ul4.b {

    @NotNull
    public static final u9c INSTANCE = new u9c();

    @NotNull
    public static final String ROOT_TAG = "MCS_";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public static final hbc mListener;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static boolean mSupportLyrics;

    static {
        hbc hbcVar = new hbc();
        mListener = hbcVar;
        ls8.INSTANCE.k(hbcVar);
    }

    public final void a(MusicProto$ControlVolumeAction controlVolumeAction) {
        int controlVolumeActionTypeValue = controlVolumeAction.getControlVolumeActionTypeValue();
        if (controlVolumeActionTypeValue == 0) {
            mListener.k(-1);
        } else {
            if (controlVolumeActionTypeValue != 1) {
                return;
            }
            mListener.k(1);
        }
    }

    public final void b(MusicProto$MusicControlAction musicControlAction) {
        int i;
        int musicControlActionTypeValue = musicControlAction.getMusicControlActionTypeValue();
        if (musicControlActionTypeValue == 0) {
            i = 85;
        } else if (musicControlActionTypeValue != 1) {
            i = musicControlActionTypeValue != 2 ? -1 : 87;
        } else {
            i = 88;
        }
        if (i != -1) {
            mListener.m(i);
        }
    }

    public final boolean c() {
        return mSupportLyrics;
    }

    @Override // com.oplus.aiunit.vision.ul4.b
    public void d(@NotNull Node node, @NotNull auc nodeStatus) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(nodeStatus, "nodeStatus");
        if (nodeStatus == auc.a.INSTANCE) {
            g(node);
        }
    }

    public final boolean e() {
        return mListener.o();
    }

    public final void f(@Nullable String nodeId, @NotNull MessageEvent messageEvent) {
        Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        a7b.f("MCS_Manager", "onMessageReceived cid = " + messageEvent.getCommandId());
        if (messageEvent.getCommandId() == 8) {
            mListener.v();
            return;
        }
        boolean zA = MusicControlApiManager.a(nodeId);
        if (messageEvent.getCommandId() == 29) {
            qsg.INSTANCE.g(zA);
            return;
        }
        if (!zA) {
            a7b.f("MCS_Manager", "onMessageReceived no need control, return");
            return;
        }
        int commandId = messageEvent.getCommandId();
        if (commandId == 1) {
            try {
                MusicProto$MusicControlAction from = MusicProto$MusicControlAction.parseFrom(messageEvent.getData());
                Intrinsics.checkNotNullExpressionValue(from, "parseFrom(messageEvent.data)");
                b(from);
                return;
            } catch (Exception e2) {
                a7b.b("MCS_Manager", "CHANGE_PLAY_STATE error: " + e2.getMessage());
                return;
            }
        }
        if (commandId == 5) {
            try {
                MusicProto$ControlVolumeAction from2 = MusicProto$ControlVolumeAction.parseFrom(messageEvent.getData());
                Intrinsics.checkNotNullExpressionValue(from2, "parseFrom(messageEvent.data)");
                a(from2);
                return;
            } catch (Exception e3) {
                a7b.b("MCS_Manager", "CHANGE_PLAY_VOLUME error: " + e3.getMessage());
                return;
            }
        }
        if (commandId == 17) {
            try {
                hbc hbcVar = mListener;
                MusicProto$VolumeInfo from3 = MusicProto$VolumeInfo.parseFrom(messageEvent.getData());
                Intrinsics.checkNotNullExpressionValue(from3, "parseFrom(messageEvent.data)");
                hbcVar.s(from3);
                return;
            } catch (Exception e4) {
                a7b.b("MCS_Manager", "SLIDE_CHANGE_VOLUME error: " + e4.getMessage());
                return;
            }
        }
        if (commandId != 30) {
            return;
        }
        try {
            hbc hbcVar2 = mListener;
            MusicProto$MusicControllerStatus from4 = MusicProto$MusicControllerStatus.parseFrom(messageEvent.getData());
            Intrinsics.checkNotNullExpressionValue(from4, "parseFrom(messageEvent.data)");
            hbcVar2.t(nodeId, from4);
        } catch (Exception e5) {
            a7b.b("MCS_Manager", "MUSIC_CONTROL_STATUS error: " + e5.getMessage());
        }
    }

    public final void g(Node node) {
        mSupportLyrics = w8c.a(node.getNodeId()).t1();
        if (!MusicControlApiManager.a(node.getNodeId())) {
            a7b.f("MCS_Manager", "onNodeConnect, no need control, return");
            return;
        }
        hbc hbcVar = mListener;
        if (hbcVar.o()) {
            hbcVar.v();
        }
    }

    @Override // com.oplus.aiunit.vision.ul4.b
    public void getInterestingStatus(@NotNull ArraySet<auc> interests) {
        Intrinsics.checkNotNullParameter(interests, "interests");
        interests.add(auc.a.INSTANCE);
    }

    public final void h(boolean enable) {
        if (enable) {
            mListener.r();
        } else {
            mListener.q();
        }
    }

    public final void i() {
        a7b.f("MCS_Manager", "sendPauseAction");
        mListener.m(127);
    }
}
