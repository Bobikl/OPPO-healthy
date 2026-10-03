package com.heytap.store.base.core.util;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.TuplesKt;
import p010kotlin.collections.MapsKt__MapsJVMKt;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0004J\u000e\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0004J\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/heytap/store/base/core/util/RxBusPostManager;", "", "()V", "HOME_ALL_SCENES_SUBSCRIBE_SUCCESS", "", "LIVE_SUBSCRIBE_SUCCESS", "LIVE_SUBSCRIBE_SUCCESS_STREAM_CODE", "RXBUS_EVENT_OBJECT_KEY_ARTICLE_ID", "RXBUS_EVENT_OBJECT_KEY_PRAISE_PAGE", "RXBUS_EVENT_OBJECT_KEY_PRAISE_STATUS", "RXBUS_EVENT_TAG_PRAISE", "postCommunityLikePrise", "", "articleId", "praiseStatus", "", "praisePage", "postHomeSubscribe", "message", "postLiveSubscribe", "streamCode", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class RxBusPostManager {

    @NotNull
    public static final String HOME_ALL_SCENES_SUBSCRIBE_SUCCESS = "home_all_scenes_subscribe_success";

    @NotNull
    public static final RxBusPostManager INSTANCE = new RxBusPostManager();

    @NotNull
    public static final String LIVE_SUBSCRIBE_SUCCESS = "live_subscribe_success";

    @NotNull
    public static final String LIVE_SUBSCRIBE_SUCCESS_STREAM_CODE = "live_subscribe_success_stream_code";

    @NotNull
    public static final String RXBUS_EVENT_OBJECT_KEY_ARTICLE_ID = "article_id";

    @NotNull
    public static final String RXBUS_EVENT_OBJECT_KEY_PRAISE_PAGE = "praise_page";

    @NotNull
    public static final String RXBUS_EVENT_OBJECT_KEY_PRAISE_STATUS = "praise_status";

    @NotNull
    public static final String RXBUS_EVENT_TAG_PRAISE = "event_tag_praise";

    private RxBusPostManager() {
    }

    public static /* synthetic */ void postCommunityLikePrise$default(RxBusPostManager rxBusPostManager, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = "";
        }
        rxBusPostManager.postCommunityLikePrise(str, z, str2);
    }

    public final void postCommunityLikePrise(@NotNull String articleId, boolean praiseStatus, @NotNull String praisePage) {
        Intrinsics.checkNotNullParameter(articleId, "articleId");
        Intrinsics.checkNotNullParameter(praisePage, "praisePage");
        RxBus.get().post(new RxBus.Event(RXBUS_EVENT_TAG_PRAISE, MapsKt__MapsKt.mapOf(TuplesKt.to(RXBUS_EVENT_OBJECT_KEY_ARTICLE_ID, articleId), TuplesKt.to(RXBUS_EVENT_OBJECT_KEY_PRAISE_STATUS, Boolean.valueOf(praiseStatus)), TuplesKt.to(RXBUS_EVENT_OBJECT_KEY_PRAISE_PAGE, praisePage))));
    }

    public final void postHomeSubscribe(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        RxBus.get().post(new RxBus.Event(HOME_ALL_SCENES_SUBSCRIBE_SUCCESS, message));
    }

    public final void postLiveSubscribe(@NotNull String streamCode) {
        Intrinsics.checkNotNullParameter(streamCode, "streamCode");
        RxBus.get().post(new RxBus.Event(LIVE_SUBSCRIBE_SUCCESS, MapsKt__MapsJVMKt.mapOf(TuplesKt.to(LIVE_SUBSCRIBE_SUCCESS_STREAM_CODE, streamCode))));
    }
}
