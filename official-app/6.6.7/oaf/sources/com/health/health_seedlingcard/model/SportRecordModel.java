package com.health.health_seedlingcard.model;

import com.heytap.databaseengine.model.TrackMetadataStat;
import com.heytap.health.base.utils.AsyncResult;
import com.oplus.aiunit.vision.b24;
import com.oplus.aiunit.vision.g18;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.sji;
import com.oplus.aiunit.vision.vji;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/health/health_seedlingcard/model/SportRecordModel;", "", "Lcom/heytap/health/base/utils/AsyncResult;", "Lorg/json/JSONObject;", "c", "Lcom/oplus/aiunit/vision/sji;", "a", "Lcom/oplus/aiunit/vision/sji;", "repository", "Lcom/oplus/aiunit/vision/vji;", "b", "Lcom/oplus/aiunit/vision/vji;", "transform", "<init>", "()V", "Companion", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0})
public final class SportRecordModel {

    @NotNull
    public static final String TAG = "SportRecordModel";

    @NotNull
    public final sji a = new sji();

    @NotNull
    public final vji b = new vji();

    @NotNull
    public final AsyncResult<JSONObject> c() {
        return new AsyncResult<>(new Function1<Function1<? super Result<? extends JSONObject>, ? extends Unit>, Unit>() { // from class: com.health.health_seedlingcard.model.SportRecordModel$getHistoryLastRecords$1

            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/heytap/databaseengine/model/TrackMetadataStat;", "it", "Lorg/json/JSONObject;", "a", "(Ljava/util/List;)Lorg/json/JSONObject;"}, k = 3, mv = {1, 8, 0})
            public static final class a<T, R> implements g18 {
                public final /* synthetic */ SportRecordModel i;

                public a(SportRecordModel sportRecordModel) {
                    this.i = sportRecordModel;
                }

                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final JSONObject apply(@NotNull List<? extends TrackMetadataStat> list) {
                    Intrinsics.checkNotNullParameter(list, "it");
                    return this.i.b.a(list);
                }
            }

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lorg/json/JSONObject;", "a", "(Ljava/lang/Throwable;)Lorg/json/JSONObject;"}, k = 3, mv = {1, 8, 0})
            public static final class b<T, R> implements g18 {
                public final /* synthetic */ SportRecordModel i;

                public b(SportRecordModel sportRecordModel) {
                    this.i = sportRecordModel;
                }

                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final JSONObject apply(@NotNull Throwable th) {
                    Intrinsics.checkNotNullParameter(th, "it");
                    m8b.b(SportRecordModel.TAG, "getHistoryLastRecords error:" + th.getMessage());
                    return this.i.b.b();
                }
            }

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lorg/json/JSONObject;", "it", "", "a", "(Lorg/json/JSONObject;)V"}, k = 3, mv = {1, 8, 0})
            public static final class c<T> implements b24 {
                public final /* synthetic */ Function1<Result<? extends JSONObject>, Unit> i;

                public c(Function1<? super Result<? extends JSONObject>, Unit> function1) {
                    this.i = function1;
                }

                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final void accept(@NotNull JSONObject jSONObject) {
                    Intrinsics.checkNotNullParameter(jSONObject, "it");
                    this.i.invoke(Result.box-impl(Result.constructor-impl(jSONObject)));
                }
            }

            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Function1<? super Result<? extends JSONObject>, Unit>) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Function1<? super Result<? extends JSONObject>, Unit> function1) {
                Intrinsics.checkNotNullParameter(function1, "block");
                this.this$0.a.a().j0(new a(this.this$0)).t0(new b(this.this$0)).a(new c(function1));
            }
        });
    }
}
