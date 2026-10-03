package com.heytap.health.main.viewmodel;

import android.content.Intent;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/heytap/health/main/viewmodel/a;", "", "<init>", "()V", "a", "b", "Lcom/heytap/health/main/viewmodel/a$a;", "Lcom/heytap/health/main/viewmodel/a$b;", "health_impl_release"}, k = 1, mv = {1, 8, 0})
public abstract class a {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: com.heytap.health.main.viewmodel.a$a, reason: collision with other inner class name and from toString */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/heytap/health/main/viewmodel/a$a;", "Lcom/heytap/health/main/viewmodel/a;", "", "toString", "", "hashCode", "", "other", "", "equals", "Landroid/content/Intent;", "a", "Landroid/content/Intent;", "()Landroid/content/Intent;", "intent", "<init>", "(Landroid/content/Intent;)V", "health_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class EcgBroadCast extends a {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final Intent intent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EcgBroadCast(@NotNull Intent intent) {
            super(null);
            Intrinsics.checkNotNullParameter(intent, "intent");
            this.intent = intent;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Intent getIntent() {
            return this.intent;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof EcgBroadCast) && Intrinsics.areEqual(this.intent, ((EcgBroadCast) other).intent);
        }

        public int hashCode() {
            return this.intent.hashCode();
        }

        @NotNull
        public String toString() {
            return "EcgBroadCast(intent=" + this.intent + ")";
        }
    }

    /* JADX INFO: renamed from: com.heytap.health.main.viewmodel.a$b, reason: from toString */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/heytap/health/main/viewmodel/a$b;", "Lcom/heytap/health/main/viewmodel/a;", "", "toString", "", "hashCode", "", "other", "", "equals", "", "Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;", "a", "Ljava/util/List;", "()Ljava/util/List;", "list", "<init>", "(Ljava/util/List;)V", "health_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class EcgDeviceInfo extends a {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final List<UserDeviceInfo> list;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public EcgDeviceInfo(@NotNull List<? extends UserDeviceInfo> list) {
            super(null);
            Intrinsics.checkNotNullParameter(list, "list");
            this.list = list;
        }

        @NotNull
        public final List<UserDeviceInfo> a() {
            return this.list;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof EcgDeviceInfo) && Intrinsics.areEqual(this.list, ((EcgDeviceInfo) other).list);
        }

        public int hashCode() {
            return this.list.hashCode();
        }

        @NotNull
        public String toString() {
            return "EcgDeviceInfo(list=" + this.list + ")";
        }
    }

    public a() {
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
