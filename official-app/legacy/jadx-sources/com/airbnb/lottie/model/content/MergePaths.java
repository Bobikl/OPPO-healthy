package com.airbnb.lottie.model.content;

import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieFeatureFlag;
import com.oplus.aiunit.vision.e74;
import com.oplus.aiunit.vision.k9b;
import com.oplus.aiunit.vision.l84;
import com.oplus.aiunit.vision.o7b;
import com.oplus.aiunit.vision.vwb;

/* JADX INFO: loaded from: classes12.dex */
public class MergePaths implements l84 {
    public final String a;
    public final MergePathsMode b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f508c;

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
        this.f508c = z;
    }

    @Override // com.oplus.aiunit.vision.l84
    @Nullable
    public e74 a(LottieDrawable lottieDrawable, k9b k9bVar, com.airbnb.lottie.model.layer.a aVar) {
        if (lottieDrawable.p0(LottieFeatureFlag.MergePathsApi19)) {
            return new vwb(this);
        }
        o7b.c("Animation contains merge paths but they are disabled.");
        return null;
    }

    public MergePathsMode b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public boolean d() {
        return this.f508c;
    }

    public String toString() {
        return "MergePaths{mode=" + this.b + '}';
    }
}
