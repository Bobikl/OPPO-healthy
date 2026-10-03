package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u0000 \n2\u00020\u0001:\u0001\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcom/oplus/aiunit/vision/tpg;", "Lcom/oplus/aiunit/vision/l7c;", "", "a", "()Z", "isHeader", "", "getItemType", "()I", "itemType", "Companion", "com.github.CymChad.brvah"}, k = 1, mv = {1, 6, 0})
public interface tpg extends l7c {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;
    public static final int HEADER_TYPE = -99;
    public static final int NORMAL_TYPE = -100;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.tpg$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/tpg$a;", "", "", "NORMAL_TYPE", "I", "HEADER_TYPE", "<init>", "()V", "com.github.CymChad.brvah"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {
        public static final int HEADER_TYPE = -99;
        public static final int NORMAL_TYPE = -100;
        public static final /* synthetic */ Companion a = new Companion();
    }

    boolean a();

    @Override // com.oplus.aiunit.vision.l7c
    default int getItemType() {
        return a() ? -99 : -100;
    }
}
