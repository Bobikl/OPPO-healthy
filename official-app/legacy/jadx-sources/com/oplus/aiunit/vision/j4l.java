package com.oplus.aiunit.vision;

import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.ocs.wearengine.proto.WearEngineProto$WEMessage;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmField;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b&\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/j4l;", "", "", SpeechConstant.KEY_EVENT_SID, "Lcom/oplus/ocs/wearengine/proto/WearEngineProto$WEMessage;", "message", "", "a", "<init>", "()V", "Companion", "b", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
public abstract class j4l {

    @JvmField
    @NotNull
    public static final j4l NONE = new a();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/oplus/aiunit/vision/j4l$a", "Lcom/oplus/aiunit/vision/j4l;", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class a extends j4l {
    }

    public boolean a(int sid, @NotNull WearEngineProto$WEMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return false;
    }
}
