package com.heytap.sporthealth.blib.compose.composable;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.UserInfo;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/heytap/sporthealth/blib/compose/composable/a;", "", "<init>", "()V", "a", "b", "Lcom/heytap/sporthealth/blib/compose/composable/a$a;", "Lcom/heytap/sporthealth/blib/compose/composable/a$b;", "lib_ui_release"}, k = 1, mv = {1, 8, 0})
public abstract class a {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: com.heytap.sporthealth.blib.compose.composable.a$a, reason: collision with other inner class name */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001R \u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0007"}, d2 = {"Lcom/heytap/sporthealth/blib/compose/composable/a$a;", "Lcom/heytap/sporthealth/blib/compose/composable/a;", "Landroidx/compose/ui/unit/Dp;", "a", UserInfo.SEX_FEMALE, "()F", "minSize", "lib_ui_release"}, k = 1, mv = {1, 8, 0})
    public static final class C0740a extends a {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final float minSize;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final float getMinSize() {
            return this.minSize;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/heytap/sporthealth/blib/compose/composable/a$b;", "Lcom/heytap/sporthealth/blib/compose/composable/a;", "", "a", "I", "()I", "count", "<init>", "(I)V", "lib_ui_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends a {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final int count;

        public b(int i) {
            super(null);
            this.count = i;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getCount() {
            return this.count;
        }
    }

    public a() {
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
