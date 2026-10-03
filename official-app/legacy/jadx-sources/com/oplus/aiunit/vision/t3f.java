package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/t3f;", "", "", "id", "", "b", "", "a", "c", "<init>", "()V", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
public final class t3f {

    @NotNull
    public static final t3f INSTANCE = new t3f();

    public final void a(@NotNull String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        String keysStr = v9g.x("push_sp").E("cache_already_send_id_keys", "");
        Intrinsics.checkNotNullExpressionValue(keysStr, "keysStr");
        if (StringsKt__StringsKt.contains$default((CharSequence) keysStr, (CharSequence) id, false, 2, (Object) null)) {
            return;
        }
        v9g.x("push_sp").U("cache_already_send_id_keys", keysStr + id + ",");
    }

    public final boolean b(@Nullable String id) {
        String keysStr = v9g.x("push_sp").E("cache_already_send_id_keys", "");
        Intrinsics.checkNotNullExpressionValue(keysStr, "keysStr");
        Intrinsics.checkNotNull(id);
        return StringsKt__StringsKt.contains$default((CharSequence) keysStr, (CharSequence) id, false, 2, (Object) null);
    }

    public final void c(@NotNull String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        String keysStr = v9g.x("push_sp").E("cache_already_send_id_keys", "");
        Intrinsics.checkNotNullExpressionValue(keysStr, "keysStr");
        if (StringsKt__StringsKt.contains$default((CharSequence) keysStr, (CharSequence) id, false, 2, (Object) null)) {
            Intrinsics.checkNotNullExpressionValue(keysStr, "keysStr");
            v9g.x("push_sp").U("cache_already_send_id_keys", StringsKt__StringsJVMKt.replace$default(keysStr, id + ",", "", false, 4, (Object) null));
        }
    }
}
