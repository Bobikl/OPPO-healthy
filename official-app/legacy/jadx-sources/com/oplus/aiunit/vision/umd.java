package com.oplus.aiunit.vision;

import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.speech.engine.constant.DialogState;
import com.heytap.speech.engine.protocol.directive.Dependency;
import com.heytap.speech.engine.protocol.directive.Directive;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.Triple;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 22\u00020\u0001:\u0003 #\u000eB\t\b\u0002¢\u0006\u0004\b0\u00101J&\u0010\t\u001a\u00020\b2\u0014\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0016\u0010\u000b\u001a\u00020\b2\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003J&\u0010\r\u001a\u00020\b2\u0014\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0016\u0010\u000e\u001a\u00020\b2\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003J\u0006\u0010\u000f\u001a\u00020\bJp\u0010\u0013\u001a\u00020\b2\u0016\u0010\u0010\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0014\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\u0011\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\u0010\u0012\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0018\u00010\u0002H\u0002J`\u0010\u0015\u001aD\u0012\u0014\u0012\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0012\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0012\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0018\u00010\u00020\u00142\u0014\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030\fH\u0002J<\u0010\u001a\u001a\u00020\u00192\u001a\u0010\u0016\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003H\u0002JL\u0010\u001c\u001a*\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030\u0002\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030\u00020\u001b2\u001a\u0010\u000f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030\u00020\u0002H\u0002J.\u0010\u001e\u001a\u00020\b2\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\u0014\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030\u001dH\u0002R\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010!R\u0018\u0010%\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010!R,\u0010(\u001a\u0018\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030\u001d\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010'R$\u0010/\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00063"}, d2 = {"Lcom/oplus/aiunit/vision/umd;", "", "", "Lcom/heytap/speech/engine/protocol/directive/Directive;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "directives", "", "originData", "", MapSchema.FIELD_NAME_KEY, "directive", "d", "", b2n.g, "c", LogFieldKey.LEVEL_KEY, "templateL", "oneList", "sendList", b2n.f, "Lkotlin/Triple;", "i", "list", "Lcom/heytap/speech/engine/protocol/directive/Dependency;", "dependency", "", "f", "Lkotlin/Pair;", "j", "Ljava/util/concurrent/CopyOnWriteArrayList;", MapSchema.FIELD_NAME_ENTRY, "Lcom/oplus/aiunit/vision/kmd;", "a", "Lcom/oplus/aiunit/vision/kmd;", "templateExe", "b", "oneExe", "secondExe", "baseExe", "Ljava/util/concurrent/CopyOnWriteArrayList;", "allDirectives", "Lcom/oplus/aiunit/vision/s61;", "Lcom/oplus/aiunit/vision/s61;", "getMNode", "()Lcom/oplus/aiunit/vision/s61;", LogFieldKey.MESSAGE_KEY, "(Lcom/oplus/aiunit/vision/s61;)V", "mNode", "<init>", "()V", "Companion", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
public final class umd {

    @NotNull
    public static final String TAG = "OperationManager";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public kmd templateExe;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public kmd oneExe;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public kmd secondExe;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public kmd baseExe;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public CopyOnWriteArrayList<CopyOnWriteArrayList<Directive<? extends DirectivePayload>>> allDirectives;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public s61 mNode;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final umd g = c.INSTANCE.a();

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.umd$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/umd$a;", "", "Lcom/oplus/aiunit/vision/umd;", "instance", "Lcom/oplus/aiunit/vision/umd;", "a", "()Lcom/oplus/aiunit/vision/umd;", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final umd a() {
            return umd.g;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0016J\u0018\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0016R\u0019\u0010\r\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/umd$b;", "Lcom/oplus/aiunit/vision/xu6;", "Lcom/heytap/speech/engine/protocol/directive/Directive;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "d", "", "a", "c", "b", "Lcom/oplus/aiunit/vision/s61;", "Lcom/oplus/aiunit/vision/s61;", "getMNode", "()Lcom/oplus/aiunit/vision/s61;", "mNode", "<init>", "(Lcom/oplus/aiunit/vision/s61;)V", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
    public static final class b implements xu6 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public final s61 mNode;

        public b(@Nullable s61 s61Var) {
            this.mNode = s61Var;
        }

        @Override // com.oplus.aiunit.vision.xu6
        public void a(@NotNull Directive<? extends DirectivePayload> d) {
            Intrinsics.checkNotNullParameter(d, "d");
            umd.INSTANCE.a().d(d);
        }

        @Override // com.oplus.aiunit.vision.xu6
        public void b(@NotNull Directive<? extends DirectivePayload> d) {
            u92 busClient;
            Intrinsics.checkNotNullParameter(d, "d");
            String strA = bnd.INSTANCE.a(d);
            if (Intrinsics.areEqual("SpeechSynthesizer.OutputSpeech", strA)) {
                t7b.INSTANCE.b(umd.TAG, strA);
                s61 s61Var = this.mNode;
                if (s61Var == null || (busClient = s61Var.getBusClient()) == null) {
                    return;
                }
                busClient.u("update.state.by.skill", DialogState.PROCESS.getDes());
            }
        }

        @Override // com.oplus.aiunit.vision.xu6
        public void c(@NotNull Directive<? extends DirectivePayload> d) {
            Intrinsics.checkNotNullParameter(d, "d");
            umd.INSTANCE.a().d(d);
        }

        @Override // com.oplus.aiunit.vision.xu6
        public void d(@NotNull Directive<? extends DirectivePayload> d) {
            u92 busClient;
            Intrinsics.checkNotNullParameter(d, "d");
            String strA = bnd.INSTANCE.a(d);
            if (Intrinsics.areEqual("SpeechSynthesizer.OutputSpeech", strA)) {
                t7b.INSTANCE.b(umd.TAG, strA);
                s61 s61Var = this.mNode;
                if (s61Var == null || (busClient = s61Var.getBusClient()) == null) {
                    return;
                }
                busClient.u("update.state.by.skill", DialogState.SPEAK.getDes());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/vision/umd$c;", "", "Lcom/oplus/aiunit/vision/umd;", "a", "Lcom/oplus/aiunit/vision/umd;", "()Lcom/oplus/aiunit/vision/umd;", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "<init>", "()V", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
    public static final class c {

        @NotNull
        public static final c INSTANCE = new c();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public static final umd holder = new umd(null);

        @NotNull
        public final umd a() {
            return holder;
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0016J\u0018\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0016J\u0006\u0010\t\u001a\u00020\u0005R\"\u0010\u0010\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"com/oplus/aiunit/vision/umd$d", "Lcom/oplus/aiunit/vision/xu6;", "Lcom/heytap/speech/engine/protocol/directive/Directive;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "d", "", "a", "c", "b", MapSchema.FIELD_NAME_ENTRY, "", "I", "getCount", "()I", "setCount", "(I)V", "count", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
    public static final class d implements xu6 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public int count;
        public final /* synthetic */ Ref.ObjectRef<List<Directive<? extends DirectivePayload>>> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ umd f17523c;
        public final /* synthetic */ List<Directive<? extends DirectivePayload>> d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ List<Directive<? extends DirectivePayload>> f17524e;
        public final /* synthetic */ String f;
        public final /* synthetic */ List<Directive<? extends DirectivePayload>> g;
        public final /* synthetic */ List<Directive<? extends DirectivePayload>> h;

        public d(Ref.ObjectRef<List<Directive<? extends DirectivePayload>>> objectRef, umd umdVar, List<Directive<? extends DirectivePayload>> list, List<Directive<? extends DirectivePayload>> list2, String str, List<Directive<? extends DirectivePayload>> list3, List<Directive<? extends DirectivePayload>> list4) {
            this.b = objectRef;
            this.f17523c = umdVar;
            this.d = list;
            this.f17524e = list2;
            this.f = str;
            this.g = list3;
            this.h = list4;
        }

        @Override // com.oplus.aiunit.vision.xu6
        public void a(@NotNull Directive<? extends DirectivePayload> d) {
            Intrinsics.checkNotNullParameter(d, "d");
            umd.INSTANCE.a().d(d);
            this.count++;
            e();
        }

        @Override // com.oplus.aiunit.vision.xu6
        public void b(@NotNull Directive<? extends DirectivePayload> d) {
            Intrinsics.checkNotNullParameter(d, "d");
        }

        @Override // com.oplus.aiunit.vision.xu6
        public void c(@NotNull Directive<? extends DirectivePayload> d) {
            Intrinsics.checkNotNullParameter(d, "d");
            umd.INSTANCE.a().d(d);
            this.count++;
            e();
        }

        @Override // com.oplus.aiunit.vision.xu6
        public void d(@NotNull Directive<? extends DirectivePayload> d) {
            Intrinsics.checkNotNullParameter(d, "d");
        }

        public final void e() {
            if (this.count == this.b.element.size()) {
                t7b.INSTANCE.b(umd.TAG, "base done");
                this.f17523c.g(this.d, this.f17524e, this.f, this.g, this.h);
            }
        }
    }

    public umd() {
    }

    public /* synthetic */ umd(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final void c(@NotNull Directive<? extends DirectivePayload> d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        kmd kmdVar = this.templateExe;
        boolean z = false;
        if (kmdVar != null && kmdVar.c(d2)) {
            d(d2);
        }
        kmd kmdVar2 = this.oneExe;
        if (kmdVar2 != null && kmdVar2.c(d2)) {
            d(d2);
        }
        kmd kmdVar3 = this.secondExe;
        if (kmdVar3 != null && kmdVar3.c(d2)) {
            d(d2);
        }
        kmd kmdVar4 = this.baseExe;
        if (kmdVar4 != null && kmdVar4.c(d2)) {
            z = true;
        }
        if (z) {
            d(d2);
        }
    }

    public final void d(@NotNull Directive<? extends DirectivePayload> directive) {
        int size;
        Intrinsics.checkNotNullParameter(directive, "directive");
        CopyOnWriteArrayList<CopyOnWriteArrayList<Directive<? extends DirectivePayload>>> copyOnWriteArrayList = this.allDirectives;
        if (copyOnWriteArrayList == null || (size = copyOnWriteArrayList.size() - 1) < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            CopyOnWriteArrayList<Directive<? extends DirectivePayload>> copyOnWriteArrayList2 = copyOnWriteArrayList.get(size);
            Intrinsics.checkNotNullExpressionValue(copyOnWriteArrayList2, "it[i]");
            e(directive, copyOnWriteArrayList2);
            if (i < 0) {
                return;
            } else {
                size = i;
            }
        }
    }

    public final void e(Directive<? extends DirectivePayload> directive, CopyOnWriteArrayList<Directive<? extends DirectivePayload>> list) {
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            if (Intrinsics.areEqual(directive, list.get(size))) {
                list.remove(size);
                if (list.isEmpty()) {
                    t7b.INSTANCE.b(TAG, "checkAllStatus done");
                    CopyOnWriteArrayList<CopyOnWriteArrayList<Directive<? extends DirectivePayload>>> copyOnWriteArrayList = this.allDirectives;
                    if (copyOnWriteArrayList == null) {
                        return;
                    }
                    copyOnWriteArrayList.remove(list);
                    return;
                }
                return;
            }
            if (i < 0) {
                return;
            } else {
                size = i;
            }
        }
    }

    public final boolean f(List<List<Directive<? extends DirectivePayload>>> list, Dependency dependency, Directive<? extends DirectivePayload> directive) {
        boolean z = false;
        for (List<Directive<? extends DirectivePayload>> list2 : list) {
            Iterator<Directive<? extends DirectivePayload>> it = list2.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(it.next().getHeader().getId(), dependency.getId())) {
                    list2.add(directive);
                    z = true;
                    break;
                }
            }
        }
        return z;
    }

    public final void g(List<Directive<? extends DirectivePayload>> templateL, List<Directive<? extends DirectivePayload>> directives, String originData, List<Directive<? extends DirectivePayload>> oneList, List<Directive<? extends DirectivePayload>> sendList) {
        List<Directive<? extends DirectivePayload>> list;
        List<Directive<? extends DirectivePayload>> list2;
        List<Directive<? extends DirectivePayload>> list3 = templateL;
        if (!(list3 == null || list3.isEmpty())) {
            t7b.INSTANCE.b(TAG, Intrinsics.stringPlus("templateL size=", Integer.valueOf(templateL.size())));
            Iterator<Directive<? extends DirectivePayload>> it = templateL.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (Intrinsics.areEqual("Template", it.next().getHeader().getNamespace())) {
                    i++;
                }
            }
            if (this.templateExe == null) {
                kmd kmdVar = new kmd("Template");
                this.templateExe = kmdVar;
                Intrinsics.checkNotNull(kmdVar);
                kmdVar.i(new b(this.mNode));
            }
            kmd kmdVar2 = this.templateExe;
            Intrinsics.checkNotNull(kmdVar2);
            kmdVar2.b(templateL, directives, originData, true, i);
        }
        bnd bndVar = bnd.INSTANCE;
        kmd kmdVar3 = this.oneExe;
        if (Intrinsics.areEqual("SpeechSynthesizer.OutputSpeech", bndVar.a(kmdVar3 == null ? null : kmdVar3.g()))) {
            list2 = oneList;
            list = sendList;
        } else {
            list = oneList;
            list2 = sendList;
        }
        List<Directive<? extends DirectivePayload>> list4 = list;
        if (!(list4 == null || list4.isEmpty())) {
            t7b.INSTANCE.b(TAG, Intrinsics.stringPlus("targetOne size=", Integer.valueOf(list.size())));
            if (this.oneExe == null) {
                kmd kmdVar4 = new kmd("One");
                this.oneExe = kmdVar4;
                Intrinsics.checkNotNull(kmdVar4);
                kmdVar4.i(new b(this.mNode));
            }
            kmd kmdVar5 = this.oneExe;
            Intrinsics.checkNotNull(kmdVar5);
            kmdVar5.b(list, directives, originData, false, 0);
        }
        List<Directive<? extends DirectivePayload>> list5 = list2;
        if (list5 == null || list5.isEmpty()) {
            return;
        }
        t7b.INSTANCE.b(TAG, Intrinsics.stringPlus("targetSend size=", Integer.valueOf(list2.size())));
        if (this.secondExe == null) {
            kmd kmdVar6 = new kmd("Second");
            this.secondExe = kmdVar6;
            Intrinsics.checkNotNull(kmdVar6);
            kmdVar6.i(new b(this.mNode));
        }
        kmd kmdVar7 = this.secondExe;
        Intrinsics.checkNotNull(kmdVar7);
        kmdVar7.b(list2, directives, originData, false, 0);
    }

    public final void h(@NotNull List<? extends Directive<? extends DirectivePayload>> d2, @Nullable String originData) {
        Intrinsics.checkNotNullParameter(d2, "d");
        List<? extends Directive<? extends DirectivePayload>> list = d2;
        if (!list.isEmpty()) {
            k(CollectionsKt___CollectionsKt.toMutableList((Collection) list), originData);
        }
    }

    public final Triple<List<Directive<? extends DirectivePayload>>, List<Directive<? extends DirectivePayload>>, List<Directive<? extends DirectivePayload>>> i(List<? extends Directive<? extends DirectivePayload>> directives) {
        ArrayList arrayList = new ArrayList();
        Iterator<? extends Directive<? extends DirectivePayload>> it = directives.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Directive<? extends DirectivePayload> next = it.next();
            List<Dependency> dependencies = next.getHeader().getDependencies();
            if (dependencies == null || dependencies.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(next);
                arrayList.add(arrayList2);
            }
        }
        for (Directive<? extends DirectivePayload> directive : directives) {
            Dependency dependency = (Dependency) CollectionsKt___CollectionsKt.getOrNull(directive.getHeader().getDependencies(), 0);
            if (dependency != null && !f(arrayList, dependency, directive)) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(directive);
                arrayList.add(arrayList3);
            }
        }
        List<Directive<? extends DirectivePayload>> list = null;
        for (List<Directive<? extends DirectivePayload>> list2 : arrayList) {
            for (Directive<? extends DirectivePayload> directive2 : list2) {
                if (!Intrinsics.areEqual("Template", directive2.getHeader().getNamespace())) {
                    if (!Intrinsics.areEqual("SpeechRecognizer.RecognizeResult", directive2.getHeader().getNamespace() + '.' + directive2.getHeader().getName())) {
                        if (Intrinsics.areEqual("SpeechRecognizer.StreamRecognizeResult", directive2.getHeader().getNamespace() + '.' + directive2.getHeader().getName())) {
                        }
                    }
                }
                list = list2;
            }
        }
        if (list != null) {
            arrayList.remove(list);
            int size = arrayList.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    List<Directive<? extends DirectivePayload>> list3 = arrayList.get(size);
                    Iterator<Directive<? extends DirectivePayload>> it2 = list3.iterator();
                    while (it2.hasNext()) {
                        if (Intrinsics.areEqual("Template", it2.next().getHeader().getNamespace())) {
                            arrayList.remove(size);
                            list.addAll(list3);
                            break;
                        }
                    }
                    if (i < 0) {
                        break;
                    }
                    size = i;
                }
            }
        }
        Pair<List<Directive<? extends DirectivePayload>>, List<Directive<? extends DirectivePayload>>> pairJ = j(arrayList);
        return new Triple<>(list, pairJ.component1(), pairJ.component2());
    }

    public final Pair<List<Directive<? extends DirectivePayload>>, List<Directive<? extends DirectivePayload>>> j(List<List<Directive<? extends DirectivePayload>>> l2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (l2.size() == 0) {
            return new Pair<>(arrayList, arrayList2);
        }
        int i = 0;
        if (l2.size() == 1) {
            arrayList.addAll(l2.get(0));
            return new Pair<>(arrayList, arrayList2);
        }
        if (l2.size() == 2) {
            arrayList.addAll(l2.get(0));
            if (l2.get(0).size() + l2.get(1).size() < 5) {
                arrayList.addAll(l2.get(1));
            } else {
                arrayList2.addAll(l2.get(1));
            }
            return new Pair<>(arrayList, arrayList2);
        }
        int size = l2.size() / 2;
        t7b.INSTANCE.b(TAG, Intrinsics.stringPlus("getTwoList index=", Integer.valueOf(size)));
        if (size >= 0) {
            while (true) {
                int i2 = i + 1;
                arrayList.addAll(l2.get(i));
                if (i == size) {
                    break;
                }
                i = i2;
            }
        }
        int i3 = size + 1;
        int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(l2);
        if (i3 <= lastIndex) {
            while (true) {
                int i4 = i3 + 1;
                arrayList2.addAll(l2.get(i3));
                if (i3 == lastIndex) {
                    break;
                }
                i3 = i4;
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.util.ArrayList] */
    public final void k(@NotNull List<Directive<? extends DirectivePayload>> directives, @Nullable String originData) {
        Intrinsics.checkNotNullParameter(directives, "directives");
        if (directives.isEmpty()) {
            return;
        }
        t7b.INSTANCE.b(TAG, Intrinsics.stringPlus("process size=", Integer.valueOf(directives.size())));
        for (Directive<? extends DirectivePayload> directive : directives) {
            Dependency dependency = (Dependency) CollectionsKt___CollectionsKt.getOrNull(directive.getHeader().getDependencies(), 0);
            if (dependency != null && Intrinsics.areEqual(dependency.getId(), directive.getHeader().getId())) {
                directive.getHeader().setDependencies(CollectionsKt__CollectionsKt.emptyList());
            }
        }
        CopyOnWriteArrayList<Directive<? extends DirectivePayload>> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        Iterator<Directive<? extends DirectivePayload>> it = directives.iterator();
        while (it.hasNext()) {
            copyOnWriteArrayList.add(it.next());
        }
        if (this.allDirectives == null) {
            this.allDirectives = new CopyOnWriteArrayList<>();
        }
        CopyOnWriteArrayList<CopyOnWriteArrayList<Directive<? extends DirectivePayload>>> copyOnWriteArrayList2 = this.allDirectives;
        if (copyOnWriteArrayList2 != null) {
            copyOnWriteArrayList2.add(copyOnWriteArrayList);
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new ArrayList();
        for (Directive<? extends DirectivePayload> directive2 : directives) {
            if (Intrinsics.areEqual("base", directive2.getHeader().getType())) {
                ((List) objectRef.element).add(directive2);
            }
        }
        directives.removeAll((Collection) objectRef.element);
        Triple<List<Directive<? extends DirectivePayload>>, List<Directive<? extends DirectivePayload>>, List<Directive<? extends DirectivePayload>>> tripleI = i(directives);
        List<Directive<? extends DirectivePayload>> listComponent1 = tripleI.component1();
        List<Directive<? extends DirectivePayload>> listComponent2 = tripleI.component2();
        List<Directive<? extends DirectivePayload>> listComponent3 = tripleI.component3();
        if (!(!((Collection) objectRef.element).isEmpty())) {
            g(listComponent1, directives, originData, listComponent2, listComponent3);
            return;
        }
        t7b.INSTANCE.b(TAG, Intrinsics.stringPlus("baseL size=", Integer.valueOf(((List) objectRef.element).size())));
        if (this.baseExe == null) {
            this.baseExe = new kmd("Base");
        }
        kmd kmdVar = this.baseExe;
        Intrinsics.checkNotNull(kmdVar);
        kmdVar.i(new d(objectRef, this, listComponent1, directives, originData, listComponent2, listComponent3));
        kmd kmdVar2 = this.baseExe;
        Intrinsics.checkNotNull(kmdVar2);
        kmdVar2.b((List) objectRef.element, directives, originData, false, 0);
    }

    public final void l() {
        kmd kmdVar = this.templateExe;
        if (kmdVar != null) {
            kmdVar.l();
        }
        this.templateExe = null;
        kmd kmdVar2 = this.oneExe;
        if (kmdVar2 != null) {
            kmdVar2.l();
        }
        this.oneExe = null;
        kmd kmdVar3 = this.secondExe;
        if (kmdVar3 != null) {
            kmdVar3.l();
        }
        this.secondExe = null;
        kmd kmdVar4 = this.baseExe;
        if (kmdVar4 != null) {
            kmdVar4.l();
        }
        this.baseExe = null;
        CopyOnWriteArrayList<CopyOnWriteArrayList<Directive<? extends DirectivePayload>>> copyOnWriteArrayList = this.allDirectives;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.clear();
        }
        this.allDirectives = null;
    }

    public final void m(@Nullable s61 s61Var) {
        this.mNode = s61Var;
    }
}
