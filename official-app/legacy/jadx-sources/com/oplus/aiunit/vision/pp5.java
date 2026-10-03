package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.ArraysKt___ArraysKt;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/pp5;", "", "", "deviceType", "", "a", "b", "d", "c", "", "Ljava/util/List;", "mAltitudeBlacklist", "mEvaluationWhitelist", "deviceLtWatch4", "<init>", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final class pp5 {

    @NotNull
    public static final pp5 INSTANCE = new pp5();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final List<String> mAltitudeBlacklist = CollectionsKt__CollectionsKt.mutableListOf(null, op5.PHONE, "mobile", op5.MERGER, "", op5.BAND, op5.BAND2, op5.BANDHSB);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final List<String> mEvaluationWhitelist = CollectionsKt__CollectionsKt.mutableListOf(op5.WATCH, op5.WATCH2);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final List<String> deviceLtWatch4 = CollectionsKt__CollectionsKt.mutableListOf(op5.WATCH, op5.BAND, op5.WATCH_GT, op5.WATCH2, op5.BAND2, op5.REALME_GT, op5.WATCH3, op5.BANDHSB, op5.WATCH3SE, op5.WATCH3PRO);
    public static final int $stable = 8;

    public final boolean a(@Nullable String deviceType) {
        return !mAltitudeBlacklist.contains(deviceType);
    }

    public final boolean b(@Nullable String deviceType) {
        return CollectionsKt___CollectionsKt.contains(mEvaluationWhitelist, deviceType);
    }

    public final boolean c(@Nullable String deviceType) {
        if (!CollectionsKt___CollectionsKt.contains(deviceLtWatch4, deviceType)) {
            String[] PHONE_DEVICE = op5.PHONE_DEVICE;
            Intrinsics.checkNotNullExpressionValue(PHONE_DEVICE, "PHONE_DEVICE");
            if (!ArraysKt___ArraysKt.contains(PHONE_DEVICE, deviceType)) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(@Nullable String deviceType) {
        if (!CollectionsKt___CollectionsKt.contains(deviceLtWatch4, deviceType)) {
            String[] PHONE_DEVICE = op5.PHONE_DEVICE;
            Intrinsics.checkNotNullExpressionValue(PHONE_DEVICE, "PHONE_DEVICE");
            if (!ArraysKt___ArraysKt.contains(PHONE_DEVICE, deviceType)) {
                return true;
            }
        }
        return false;
    }
}
