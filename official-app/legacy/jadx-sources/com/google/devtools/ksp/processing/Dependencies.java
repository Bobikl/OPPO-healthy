package com.google.devtools.ksp.processing;

import com.google.devtools.ksp.symbol.KSFile;
import com.oplus.aiunit.vision.oea;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.ArraysKt___ArraysKt;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006¢\u0006\u0002\u0010\u0007B%\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0002\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\rR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/google/devtools/ksp/processing/Dependencies;", "", "aggregating", "", "sources", "", "Lcom/google/devtools/ksp/symbol/KSFile;", "(Z[Lcom/google/devtools/ksp/symbol/KSFile;)V", "isAllSources", "originatingFiles", "", "(ZZLjava/util/List;)V", "getAggregating", "()Z", "getOriginatingFiles", "()Ljava/util/List;", "Companion", oea.FEATURE_API_REQUEST}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Dependencies {
    private final boolean aggregating;
    private final boolean isAllSources;

    @NotNull
    private final List<KSFile> originatingFiles;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Dependencies ALL_FILES = new Dependencies(true, true, CollectionsKt__CollectionsKt.emptyList());

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/google/devtools/ksp/processing/Dependencies$Companion;", "", "()V", "ALL_FILES", "Lcom/google/devtools/ksp/processing/Dependencies;", "getALL_FILES", "()Lcom/google/devtools/ksp/processing/Dependencies;", oea.FEATURE_API_REQUEST}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Dependencies getALL_FILES() {
            return Dependencies.ALL_FILES;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Dependencies(boolean z, boolean z2, List<? extends KSFile> list) {
        this.isAllSources = z;
        this.aggregating = z2;
        this.originatingFiles = list;
    }

    public final boolean getAggregating() {
        return this.aggregating;
    }

    @NotNull
    public final List<KSFile> getOriginatingFiles() {
        return this.originatingFiles;
    }

    /* JADX INFO: renamed from: isAllSources, reason: from getter */
    public final boolean getIsAllSources() {
        return this.isAllSources;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Dependencies(boolean z, @NotNull KSFile... sources) {
        this(false, z, ArraysKt___ArraysKt.toList(sources));
        Intrinsics.checkNotNullParameter(sources, "sources");
    }
}
