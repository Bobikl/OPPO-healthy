package com.heytap.health.operations.settings.permission;

import com.alibaba.android.arouter.facade.template.IProvider;
import com.oplus.aiunit.vision.PermissionItem;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u0000 \r2\u00020\u0001:\u0002\u000e\u000fJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0018\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/heytap/health/operations/settings/permission/IFeaturePermissionDataService;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "", "Lcom/heytap/health/operations/settings/permission/IFeaturePermissionDataService$b;", "J7", "", "featureId", "Lcom/oplus/aiunit/vision/zee;", "P6", "", "name", "I6", "(Ljava/lang/String;)Ljava/lang/Integer;", "Companion", "a", "b", "operations_release"}, k = 1, mv = {1, 8, 0})
public interface IFeaturePermissionDataService extends IProvider {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @NotNull
    public static final String SERVICE_PATH = "/settings/IFeaturePermissionDataService";

    /* JADX INFO: renamed from: com.heytap.health.operations.settings.permission.IFeaturePermissionDataService$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/heytap/health/operations/settings/permission/IFeaturePermissionDataService$a;", "", "", "SERVICE_PATH", "Ljava/lang/String;", "<init>", "()V", "operations_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        @NotNull
        public static final String SERVICE_PATH = "/settings/IFeaturePermissionDataService";
        public static final /* synthetic */ Companion a = new Companion();
    }

    /* JADX INFO: renamed from: com.heytap.health.operations.settings.permission.IFeaturePermissionDataService$b, reason: from toString */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/operations/settings/permission/IFeaturePermissionDataService$b;", "", "", "a", "", "toString", "hashCode", "other", "", "equals", "I", "getId", "()I", "id", "b", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "<init>", "(ILjava/lang/String;)V", "operations_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class FeatureInfo {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        public final int id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final String name;

        public FeatureInfo(int i, @NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.id = i;
            this.name = name;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getId() {
            return this.id;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FeatureInfo)) {
                return false;
            }
            FeatureInfo featureInfo = (FeatureInfo) other;
            return this.id == featureInfo.id && Intrinsics.areEqual(this.name, featureInfo.name);
        }

        public int hashCode() {
            return (Integer.hashCode(this.id) * 31) + this.name.hashCode();
        }

        @NotNull
        public String toString() {
            return "FeatureInfo(id=" + this.id + ", name=" + this.name + ")";
        }
    }

    @Nullable
    Integer I6(@NotNull String name);

    @NotNull
    List<FeatureInfo> J7();

    @Nullable
    List<PermissionItem> P6(int featureId);
}
