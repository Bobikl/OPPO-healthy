package com.oplus.anim.model.content;

import androidx.annotation.Nullable;
import com.oplus.aiunit.vision.d74;
import com.oplus.aiunit.vision.k84;
import com.oplus.aiunit.vision.u7b;
import com.oplus.aiunit.vision.wg6;
import com.oplus.aiunit.vision.wwb;
import com.oplus.anim.EffectiveAnimationDrawable;

/* JADX INFO: loaded from: classes19.dex */
public class MergePaths implements k84 {
    public final String a;
    public final MergePathsMode b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f19622c;

    public enum MergePathsMode {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static MergePathsMode forId(int i) {
            if (i == 1) {
                return MERGE;
            }
            if (i == 2) {
                return ADD;
            }
            if (i == 3) {
                return SUBTRACT;
            }
            if (i != 4) {
                return i != 5 ? MERGE : EXCLUDE_INTERSECTIONS;
            }
            return INTERSECT;
        }
    }

    public MergePaths(String str, MergePathsMode mergePathsMode, boolean z) {
        this.a = str;
        this.b = mergePathsMode;
        this.f19622c = z;
    }

    @Override // com.oplus.aiunit.vision.k84
    @Nullable
    public d74 a(EffectiveAnimationDrawable effectiveAnimationDrawable, wg6 wg6Var, com.oplus.anim.model.layer.a aVar) {
        if (effectiveAnimationDrawable.A()) {
            return new wwb(this);
        }
        u7b.c("Animation contains merge paths but they are disabled.");
        return null;
    }

    public MergePathsMode b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public boolean d() {
        return this.f19622c;
    }

    public String toString() {
        return "MergePaths{mode=" + this.b + '}';
    }
}
