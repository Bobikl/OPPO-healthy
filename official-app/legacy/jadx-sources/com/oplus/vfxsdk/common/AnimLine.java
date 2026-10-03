package com.oplus.vfxsdk.common;

import androidx.annotation.Keep;
import com.heytap.databaseengine.model.UserInfo;
import com.oplus.aiunit.vision.a8i;
import com.oplus.aiunit.vision.mz9;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b-\u0010.J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJR\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00072\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0015\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b \u0010\u001dR\u0017\u0010\u0011\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010$\u001a\u0004\b%\u0010\fR$\u0010'\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lcom/oplus/vfxsdk/common/AnimLine;", "", "", "component1", "component2", "component3", "component4", "", "component5", "", "Lcom/oplus/vfxsdk/common/AnimKey;", "component6", "()[Lcom/oplus/vfxsdk/common/AnimKey;", "nodeId", "key", "name", "type", "lastTime", "animKeys", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;F[Lcom/oplus/vfxsdk/common/AnimKey;)Lcom/oplus/vfxsdk/common/AnimLine;", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getNodeId", "()Ljava/lang/String;", "getKey", "getName", "getType", UserInfo.SEX_FEMALE, "getLastTime", "()F", "[Lcom/oplus/vfxsdk/common/AnimKey;", "getAnimKeys", "Lcom/oplus/aiunit/vision/mz9;", a8i.UPDATE, "Lcom/oplus/aiunit/vision/mz9;", "getUpdate", "()Lcom/oplus/aiunit/vision/mz9;", "setUpdate", "(Lcom/oplus/aiunit/vision/mz9;)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;F[Lcom/oplus/vfxsdk/common/AnimKey;)V", "coecommon.1.1.0_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class AnimLine {

    @NotNull
    private final AnimKey[] animKeys;

    @NotNull
    private final String key;
    private final float lastTime;

    @NotNull
    private final String name;

    @NotNull
    private final String nodeId;

    @NotNull
    private final String type;

    @Nullable
    private mz9 update;

    public AnimLine(@NotNull String nodeId, @NotNull String key, @NotNull String name, @NotNull String type, float f, @NotNull AnimKey[] animKeys) {
        Intrinsics.checkNotNullParameter(nodeId, "nodeId");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(animKeys, "animKeys");
        this.nodeId = nodeId;
        this.key = key;
        this.name = name;
        this.type = type;
        this.lastTime = f;
        this.animKeys = animKeys;
    }

    public static /* synthetic */ AnimLine copy$default(AnimLine animLine, String str, String str2, String str3, String str4, float f, AnimKey[] animKeyArr, int i, Object obj) {
        if ((i & 1) != 0) {
            str = animLine.nodeId;
        }
        if ((i & 2) != 0) {
            str2 = animLine.key;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = animLine.name;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = animLine.type;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            f = animLine.lastTime;
        }
        float f2 = f;
        if ((i & 32) != 0) {
            animKeyArr = animLine.animKeys;
        }
        return animLine.copy(str, str5, str6, str7, f2, animKeyArr);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNodeId() {
        return this.nodeId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getLastTime() {
        return this.lastTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final AnimKey[] getAnimKeys() {
        return this.animKeys;
    }

    @NotNull
    public final AnimLine copy(@NotNull String nodeId, @NotNull String key, @NotNull String name, @NotNull String type, float lastTime, @NotNull AnimKey[] animKeys) {
        Intrinsics.checkNotNullParameter(nodeId, "nodeId");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(animKeys, "animKeys");
        return new AnimLine(nodeId, key, name, type, lastTime, animKeys);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnimLine)) {
            return false;
        }
        AnimLine animLine = (AnimLine) other;
        return Intrinsics.areEqual(this.nodeId, animLine.nodeId) && Intrinsics.areEqual(this.key, animLine.key) && Intrinsics.areEqual(this.name, animLine.name) && Intrinsics.areEqual(this.type, animLine.type) && Float.compare(this.lastTime, animLine.lastTime) == 0 && Intrinsics.areEqual(this.animKeys, animLine.animKeys);
    }

    @NotNull
    public final AnimKey[] getAnimKeys() {
        return this.animKeys;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    public final float getLastTime() {
        return this.lastTime;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getNodeId() {
        return this.nodeId;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final mz9 getUpdate() {
        return this.update;
    }

    public int hashCode() {
        return (((((((((this.nodeId.hashCode() * 31) + this.key.hashCode()) * 31) + this.name.hashCode()) * 31) + this.type.hashCode()) * 31) + Float.hashCode(this.lastTime)) * 31) + Arrays.hashCode(this.animKeys);
    }

    public final void setUpdate(@Nullable mz9 mz9Var) {
        this.update = mz9Var;
    }

    @NotNull
    public String toString() {
        return "AnimLine(nodeId=" + this.nodeId + ", key=" + this.key + ", name=" + this.name + ", type=" + this.type + ", lastTime=" + this.lastTime + ", animKeys=" + Arrays.toString(this.animKeys) + ")";
    }
}
