package com.oplus.aiunit.vision;

import androidx.annotation.DrawableRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.store.base.core.http.HttpConst;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.xnd, reason: from toString */
/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010 B\u0019\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010!B)\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010\"J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0013\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\"\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\n\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u001b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\"\u0010\u001e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017¨\u0006#"}, d2 = {"Lcom/oplus/aiunit/vision/xnd;", "", "", "b", "", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", MapSchema.FIELD_NAME_ENTRY, "()Ljava/lang/String;", "setOperator", "(Ljava/lang/String;)V", HttpConst.OPERATOR, "c", "setMessage", "message", "I", "()I", "setIconResId", "(I)V", "iconResId", "d", "setOpenType", "openType", "getRvItemType", "setRvItemType", "rvItemType", "<init>", "(Ljava/lang/String;Ljava/lang/String;III)V", "(Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/String;II)V", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class OperatorItemBean {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public String operator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public String message;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public int iconResId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public int openType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public int rvItemType;

    public OperatorItemBean(@NotNull String operator, @NotNull String message, @DrawableRes int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(operator, "operator");
        Intrinsics.checkNotNullParameter(message, "message");
        this.operator = operator;
        this.message = message;
        this.iconResId = i;
        this.openType = i2;
        this.rvItemType = i3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getIconResId() {
        return this.iconResId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getRvItemType() {
        return this.rvItemType;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getOpenType() {
        return this.openType;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getOperator() {
        return this.operator;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OperatorItemBean)) {
            return false;
        }
        OperatorItemBean operatorItemBean = (OperatorItemBean) other;
        return Intrinsics.areEqual(this.operator, operatorItemBean.operator) && Intrinsics.areEqual(this.message, operatorItemBean.message) && this.iconResId == operatorItemBean.iconResId && this.openType == operatorItemBean.openType && this.rvItemType == operatorItemBean.rvItemType;
    }

    public int hashCode() {
        return (((((((this.operator.hashCode() * 31) + this.message.hashCode()) * 31) + Integer.hashCode(this.iconResId)) * 31) + Integer.hashCode(this.openType)) * 31) + Integer.hashCode(this.rvItemType);
    }

    @NotNull
    public String toString() {
        return "OperatorItemBean(operator=" + this.operator + ", message=" + this.message + ", iconResId=" + this.iconResId + ", openType=" + this.openType + ", rvItemType=" + this.rvItemType + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OperatorItemBean(@NotNull String operator, @NotNull String message) {
        this(operator, message, 0, 0, 1);
        Intrinsics.checkNotNullParameter(operator, "operator");
        Intrinsics.checkNotNullParameter(message, "message");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OperatorItemBean(@NotNull String operator, @NotNull String message, int i, int i2) {
        this(operator, message, i, i2, 0);
        Intrinsics.checkNotNullParameter(operator, "operator");
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
