package com.oplus.aiunit.vision;

import com.oplus.aiunit.core.data.SimpleUnitInfo;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aB)\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b¢\u0006\u0004\b\u0019\u0010\u001cB!\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0013\u0012\u0006\u0010\u001e\u001a\u00020\u0013¢\u0006\u0004\b\u0019\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R&\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015¨\u0006 "}, d2 = {"Lcom/oplus/aiunit/vision/n95;", "", "", "toString", "a", "Ljava/lang/String;", "getDetectName", "()Ljava/lang/String;", "detectName", "Ljava/util/ArrayList;", "Lcom/oplus/aiunit/core/data/SimpleUnitInfo;", "Lkotlin/collections/ArrayList;", "b", "Ljava/util/ArrayList;", "unitList", "", "c", "I", "state", "", "d", "Z", "available", MapSchema.FIELD_NAME_ENTRY, "unavailableBySelf", "<init>", "(Ljava/lang/String;)V", "list", "(Ljava/lang/String;Ljava/util/ArrayList;)V", "runAvailable", "support", "(Ljava/lang/String;ZZ)V", "aiunit.sdk.toolkits_release"}, k = 1, mv = {1, 9, 0})
public final class n95 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String detectName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public ArrayList<SimpleUnitInfo> unitList;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int state;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean available;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean unavailableBySelf;

    public n95(String str) {
        this.detectName = str;
        this.unitList = new ArrayList<>();
    }

    @NotNull
    public String toString() {
        return "DetectInfo(" + this.detectName + ", " + this.state + " -> " + this.unitList + ", " + this.available + ", " + this.unavailableBySelf + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n95(@NotNull String detectName, @NotNull ArrayList<SimpleUnitInfo> list) {
        this(detectName);
        Intrinsics.checkNotNullParameter(detectName, "detectName");
        Intrinsics.checkNotNullParameter(list, "list");
        this.unitList = list;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (this.unitList.get(i).getAvailableInner()) {
                this.available = true;
                this.unavailableBySelf = this.unitList.get(i).getUnsupportedBySelfInner();
                this.state = this.unitList.get(i).getState();
                break;
            }
        }
        if (this.available || !(!this.unitList.isEmpty())) {
            return;
        }
        this.state = this.unitList.get(0).getState();
        this.unavailableBySelf = this.unitList.get(0).getUnsupportedBySelfInner();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n95(@NotNull String detectName, boolean z, boolean z2) {
        this(detectName);
        Intrinsics.checkNotNullParameter(detectName, "detectName");
        this.available = z;
        this.state = z ? 1 : 0;
        this.unavailableBySelf = !z2;
    }
}
