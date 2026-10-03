package com.oplus.aiunit.vision;

import com.heytap.store.business.rn.service.RnConstant;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\bB\u0019\b\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/u5h;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", RnConstant.KEY_INIT_OPTIONS, "", "b", "I", "()I", "priority", "<init>", "(Ljava/lang/String;I)V", "Lcom/oplus/aiunit/vision/u5h$a;", "Lcom/oplus/aiunit/vision/u5h$b;", "health_release"}, k = 1, mv = {1, 8, 0})
public abstract class u5h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String param;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int priority;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/oplus/aiunit/vision/u5h$a;", "Lcom/oplus/aiunit/vision/u5h;", "", "cardNum", "<init>", "(I)V", "health_release"}, k = 1, mv = {1, 8, 0})
    public static final class a extends u5h {
        public a(int i) {
            super(String.valueOf(i), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/u5h$b;", "Lcom/oplus/aiunit/vision/u5h;", "<init>", "()V", "health_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends u5h {
        public b() {
            super("", 2, null);
        }
    }

    public /* synthetic */ u5h(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getParam() {
        return this.param;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getPriority() {
        return this.priority;
    }

    public u5h(String str, int i) {
        this.param = str;
        this.priority = i;
    }
}
