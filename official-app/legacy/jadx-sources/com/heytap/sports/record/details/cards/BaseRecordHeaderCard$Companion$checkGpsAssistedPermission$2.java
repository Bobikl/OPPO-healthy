package com.heytap.sports.record.details.cards;

import com.heytap.health.base.permission.wxbpermission.PermissionRequestDialog;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public /* synthetic */ class BaseRecordHeaderCard$Companion$checkGpsAssistedPermission$2 extends FunctionReferenceImpl implements Function2<Integer, String, Boolean> {
    public static final BaseRecordHeaderCard$Companion$checkGpsAssistedPermission$2 INSTANCE = new BaseRecordHeaderCard$Companion$checkGpsAssistedPermission$2();

    public BaseRecordHeaderCard$Companion$checkGpsAssistedPermission$2() {
        super(2, PermissionRequestDialog.class, "check", "check(ILjava/lang/String;)Z", 0);
    }

    @NotNull
    public final Boolean invoke(int i, String str) {
        return Boolean.valueOf(PermissionRequestDialog.D(i, str));
    }

    @Override // p010kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Boolean invoke(Integer num, String str) {
        return invoke(num.intValue(), str);
    }
}
