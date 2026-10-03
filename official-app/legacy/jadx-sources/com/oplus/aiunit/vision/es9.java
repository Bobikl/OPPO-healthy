package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0004\bf\u0018\u0000 \u00152\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001c\u0010\t\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H&J\u001c\u0010\n\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H&J+\u0010\r\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\u0010\f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u000f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H&J\u001c\u0010\u0010\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H&J\u001c\u0010\u0011\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H&J&\u0010\u0011\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H&J\u001c\u0010\u0014\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H&¨\u0006\u0016"}, d2 = {"Lcom/oplus/aiunit/vision/es9;", "", "", "level", "", "a", "", "tag", "msg", "v", "d", "", "msgList", "b", "(Ljava/lang/String;[Ljava/lang/String;)V", "i", "w", MapSchema.FIELD_NAME_ENTRY, "", "ex", "print", "Companion", "monitor_release"}, k = 1, mv = {1, 5, 1})
public interface es9 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @NotNull
    public static final String TAG = "Engine.";

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.es9$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/oplus/aiunit/vision/es9$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "monitor_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @NotNull
        public static final String TAG = "Engine.";
        public static final /* synthetic */ Companion a = new Companion();
    }

    void a(int level);

    void b(@Nullable String tag, @NotNull String[] msgList);

    void d(@Nullable String tag, @Nullable String msg);

    void e(@Nullable String tag, @Nullable String msg);

    void e(@Nullable String tag, @Nullable String msg, @Nullable Throwable ex);

    void i(@Nullable String tag, @Nullable String msg);

    void print(@Nullable String tag, @Nullable String msg);

    void v(@Nullable String tag, @Nullable String msg);

    void w(@Nullable String tag, @Nullable String msg);
}
