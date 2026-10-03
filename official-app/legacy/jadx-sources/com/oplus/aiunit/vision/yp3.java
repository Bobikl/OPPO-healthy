package com.oplus.aiunit.vision;

import com.google.gson.JsonObject;
import com.heytap.health.community.utils.NotifyUtils;
import com.heytap.store.business.rn.service.RnConstant;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/yp3;", "", "Lcom/google/gson/JsonObject;", "paramJsonObject", "", "a", RnConstant.KEY_INIT_OPTIONS, "b", "<init>", "()V", "Companion", "Health-6.4.4_03460bd_260624_OPlusRelease"}, k = 1, mv = {1, 8, 0})
public final class yp3 {
    public final void a(@NotNull JsonObject paramJsonObject) {
        Intrinsics.checkNotNullParameter(paramJsonObject, "paramJsonObject");
        a7b.f("CommunityForH5", "onPostMsgChanged:" + paramJsonObject);
        boolean asBoolean = paramJsonObject.get("hasLiked").getAsBoolean();
        String asString = paramJsonObject.get("postId").getAsString();
        Intrinsics.checkNotNullExpressionValue(asString, "paramJsonObject.get(\"postId\").asString");
        String asString2 = paramJsonObject.get("likeNumber").getAsString();
        Intrinsics.checkNotNullExpressionValue(asString2, "paramJsonObject.get(\"likeNumber\").asString");
        String asString3 = paramJsonObject.get("commentNumber").getAsString();
        Intrinsics.checkNotNullExpressionValue(asString3, "paramJsonObject.get(\"commentNumber\").asString");
        String asString4 = paramJsonObject.get("dialogueNumber").getAsString();
        Intrinsics.checkNotNullExpressionValue(asString4, "paramJsonObject.get(\"dialogueNumber\").asString");
        a7b.f("CommunityForH5", "onPostMsgChanged " + asString);
        NotifyUtils.INSTANCE.a().postValue(new NotifyUtils.PostMsg(Long.parseLong(asString), asBoolean, Long.parseLong(asString2), Long.parseLong(asString3), Long.parseLong(asString4)));
    }

    public final void b(@NotNull JsonObject param) {
        Intrinsics.checkNotNullParameter(param, "param");
        a7b.f("CommunityForH5", "onUserFollowStatusChanged:" + param);
        String asString = param.get("userEncryptedSsoid").getAsString();
        Intrinsics.checkNotNullExpressionValue(asString, "param.get(\"userEncryptedSsoid\").asString");
        NotifyUtils.INSTANCE.b().postValue(new NotifyUtils.FollowUserMsg(asString, param.get("followStatus").getAsBoolean()));
    }
}
