package com.oplus.aiunit.vision;

import com.heytap.health.base.text.GsonUtil;
import com.heytap.health.voiceassistant.proto.VAProto;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0005"}, d2 = {"Lcom/oplus/aiunit/vision/bmd;", "", "tag", "", "a", "voiceassistant_impl_release"}, k = 2, mv = {1, 8, 0})
public final class ye8 {
    public static final void a(@NotNull bmd bmdVar, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(bmdVar, "<this>");
        Intrinsics.checkNotNullParameter(tag, "tag");
        String strE = GsonUtil.e(bmdVar.getDirective());
        StringBuilder sb = new StringBuilder();
        sb.append("process: ");
        sb.append(strE);
        gl4.devicePrimary.messageApi.b(new MessageEvent(270, 9, VAProto.BreenoDirectives.newBuilder().setText(strE).setIsMicOn(bmdVar.isMicOn()).build().toByteArray()));
    }
}
