package com.oplus.aiunit.vision;

import com.oplus.cardwidget.util.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0006\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/gjm;", "Lcom/oplus/aiunit/vision/djm;", "Lcom/oplus/aiunit/vision/wmm;", "Lcom/oplus/aiunit/vision/vmm;", "iClient", "b", "event", "", "c", "", "a", "Ljava/util/List;", "iClients", "<init>", "()V", "com.oplus.card.widget.cardwidget"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCardUpdateProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardUpdateProcessor.kt\ncom/oplus/cardwidget/domain/event/processor/CardUpdateProcessor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,44:1\n1849#2,2:45\n*S KotlinDebug\n*F\n+ 1 CardUpdateProcessor.kt\ncom/oplus/cardwidget/domain/event/processor/CardUpdateProcessor\n*L\n40#1:45,2\n*E\n"})
public final class gjm implements djm<wmm> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final List<vmm> iClients = new ArrayList();

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.gjm$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/gjm$a;", "", "Lcom/oplus/aiunit/vision/vmm;", "iClient", "", "a", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "com.oplus.card.widget.cardwidget"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@NotNull vmm iClient) {
            Intrinsics.checkNotNullParameter(iClient, "iClient");
            new s9m().b(new gjm().b(iClient));
        }
    }

    @NotNull
    public final gjm b(@NotNull vmm iClient) {
        Intrinsics.checkNotNullParameter(iClient, "iClient");
        Logger.INSTANCE.d("Update.CardUpdateProcessor", "listener state callback: " + iClient);
        this.iClients.add(iClient);
        return this;
    }

    @Override // com.oplus.aiunit.vision.djm
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull wmm event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Logger.INSTANCE.debug("Update.CardUpdateProcessor", event.getWidgetCode(), "handleEvent event begin...");
        Iterator<T> it = this.iClients.iterator();
        while (it.hasNext()) {
            ((vmm) it.next()).a(event.getData());
        }
    }
}
