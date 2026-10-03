package com.heytap.health.operations.settings.permission;

import com.alibaba.android.arouter.facade.template.IProvider;
import com.oplus.aiunit.vision.PermissionItem;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¨\u0006\b"}, d2 = {"Lcom/heytap/health/operations/settings/permission/IFeaturePermissionService;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "", "featureId", "Lcom/oplus/aiunit/vision/zee;", "permissionItem", "", "b8", "operations_release"}, k = 1, mv = {1, 8, 0})
public interface IFeaturePermissionService extends IProvider {
    void b8(int featureId, @Nullable PermissionItem permissionItem);
}
