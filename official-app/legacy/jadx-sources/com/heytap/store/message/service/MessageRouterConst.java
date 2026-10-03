package com.heytap.store.message.service;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/heytap/store/message/service/MessageRouterConst;", "", "()V", "DEEP_LINK_FOR_APP", "", "DEEP_LINK_HOST", "DEEP_LINK_SCHEME", "MESSAGE_ACTIVITY_DP", "MESSAGE_ACTIVITY_PATH", "MESSAGE_SECOND_ACTIVITY_PATH", "SERVICE_PATH", "TEST_ACTIVITY_PATH", "message-service_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class MessageRouterConst {

    @NotNull
    public static final String DEEP_LINK_FOR_APP = "oppostore://www.opposhop.cn/app/store/";

    @NotNull
    public static final String DEEP_LINK_HOST = "www.opposhop.cn/app/store/";

    @NotNull
    public static final String DEEP_LINK_SCHEME = "oppostore://";

    @NotNull
    public static final MessageRouterConst INSTANCE = new MessageRouterConst();

    @NotNull
    public static final String MESSAGE_ACTIVITY_DP = "oppostore://www.opposhop.cn/app/store/message_page";

    @NotNull
    public static final String MESSAGE_ACTIVITY_PATH = "/messagecomponent/MessageActivity";

    @NotNull
    public static final String MESSAGE_SECOND_ACTIVITY_PATH = "/messagecomponent/MessageSecondActivity";

    @NotNull
    public static final String SERVICE_PATH = "/messagecomponent/messageservice";

    @NotNull
    public static final String TEST_ACTIVITY_PATH = "/messagecomponent/TestActivity";

    private MessageRouterConst() {
    }
}
