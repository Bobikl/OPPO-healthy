package com.health.health_seedlingcard.model;

import com.heytap.databaseengine.model.TrackMetadataStat;
import com.heytap.health.base.utils.AsyncResult;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.cgi;
import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.o14;
import com.oplus.aiunit.vision.zfi;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/health/health_seedlingcard/model/SportRecordModel;", "", "Lcom/heytap/health/base/utils/AsyncResult;", "Lorg/json/JSONObject;", "c", "Lcom/oplus/aiunit/vision/zfi;", "a", "Lcom/oplus/aiunit/vision/zfi;", "repository", "Lcom/oplus/aiunit/vision/cgi;", "b", "Lcom/oplus/aiunit/vision/cgi;", "transform", "<init>", "()V", "Companion", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0})
public final class SportRecordModel {

    @NotNull
    public static final String TAG = "SportRecordModel";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final zfi repository = new zfi();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final cgi transform = new cgi();

    @NotNull
    public final AsyncResult<JSONObject> c() {
        return new AsyncResult<>(new Function1<Function1<? super Result<? extends JSONObject>, ? extends Unit>, Unit>() { // from class: com.health.health_seedlingcard.model.SportRecordModel$getHistoryLastRecords$1

            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/heytap/databaseengine/model/TrackMetadataStat;", "it", "Lorg/json/JSONObject;", "a", "(Ljava/util/List;)Lorg/json/JSONObject;"}, k = 3, mv = {1, 8, 0})
            public static final class a<T, R> implements d08 {
                public final /* synthetic */ SportRecordModel i;

                public a(SportRecordModel sportRecordModel) {
                    this.i = sportRecordModel;
                }

                @Override // com.oplus.aiunit.vision.d08
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final JSONObject apply(@NotNull List<? extends TrackMetadataStat> it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return this.i.transform.a(it);
                }
            }

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lorg/json/JSONObject;", "a", "(Ljava/lang/Throwable;)Lorg/json/JSONObject;"}, k = 3, mv = {1, 8, 0})
            public static final class b<T, R> implements d08 {
                public final /* synthetic */ SportRecordModel i;

                public b(SportRecordModel sportRecordModel) {
                    this.i = sportRecordModel;
                }

                @Override // com.oplus.aiunit.vision.d08
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final JSONObject apply(@NotNull Throwable it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    a7b.b(SportRecordModel.TAG, "getHistoryLastRecords error:" + it.getMessage());
                    return this.i.transform.b();
                }
            }

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lorg/json/JSONObject;", "it", "", "a", "(Lorg/json/JSONObject;)V"}, k = 3, mv = {1, 8, 0})
            public static final class c<T> implements o14 {
                public final /* synthetic */ Function1<Result<? extends JSONObject>, Unit> i;

                /* JADX WARN: Multi-variable type inference failed */
                public c(Function1<? super Result<? extends JSONObject>, Unit> function1) {
                    this.i = function1;
                }

                @Override // com.oplus.aiunit.vision.o14
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final void accept(@NotNull JSONObject it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.i.invoke(Result.m5286boximpl(Result.m5287constructorimpl(it)));
                }
            }

            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Function1<? super Result<? extends JSONObject>, ? extends Unit> function1) {
                invoke2((Function1<? super Result<? extends JSONObject>, Unit>) function1);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Function1<? super Result<? extends JSONObject>, Unit> block) {
                Intrinsics.checkNotNullParameter(block, "block");
                this.this$0.repository.a().j0(new a(this.this$0)).t0(new b(this.this$0)).a(new c(block));
            }
        });
    }
}
