package com.heytap.health.settings.me.thirdpartbinding.wechat;

import android.annotation.SuppressLint;
import com.heytap.health.base.utils.AsyncResult;
import com.heytap.health.network.core.BaseResponse;
import com.heytap.health.settings.me.thirdpartbinding.model.DeviceHardware;
import com.oplus.aiunit.vision.o14;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¨\u0006\u0006"}, d2 = {"Lcom/heytap/health/settings/me/thirdpartbinding/wechat/MMStepSyncServiceImpl;", "", "mac", "Lcom/heytap/health/base/utils/AsyncResult;", "", "a", "settings_impl_release"}, k = 2, mv = {1, 8, 0})
public final class MMStepSyncServiceImplExtKt {
    @SuppressLint({"CheckResult"})
    @NotNull
    public static final AsyncResult<Boolean> a(@NotNull MMStepSyncServiceImpl mMStepSyncServiceImpl, @Nullable final String str) {
        Intrinsics.checkNotNullParameter(mMStepSyncServiceImpl, "<this>");
        return new AsyncResult<>(new Function1<Function1<? super Result<? extends Boolean>, ? extends Unit>, Unit>() { // from class: com.heytap.health.settings.me.thirdpartbinding.wechat.MMStepSyncServiceImplExtKt$checkDeviceIsBind$1

            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u000620\u0010\u0005\u001a,\u0012(\u0012&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/heytap/health/network/core/BaseResponse;", "", "Lcom/heytap/health/settings/me/thirdpartbinding/model/DeviceHardware;", "kotlin.jvm.PlatformType", "", "result", "", "a", "(Lcom/heytap/health/network/core/BaseResponse;)V"}, k = 3, mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nMMStepSyncServiceImplExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MMStepSyncServiceImplExt.kt\ncom/heytap/health/settings/me/thirdpartbinding/wechat/MMStepSyncServiceImplExtKt$checkDeviceIsBind$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,17:1\n1#2:18\n*E\n"})
            public static final class a<T> implements o14 {
                public final /* synthetic */ Function1<Result<Boolean>, Unit> i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final /* synthetic */ String f5402j;

                /* JADX WARN: Multi-variable type inference failed */
                public a(Function1<? super Result<Boolean>, Unit> function1, String str) {
                    this.i = function1;
                    this.f5402j = str;
                }

                @Override // com.oplus.aiunit.vision.o14
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final void accept(@NotNull BaseResponse<List<DeviceHardware>> result) {
                    T next;
                    DeviceHardware deviceHardware;
                    Intrinsics.checkNotNullParameter(result, "result");
                    Function1<Result<Boolean>, Unit> function1 = this.i;
                    Result.Companion companion = Result.INSTANCE;
                    List<DeviceHardware> body = result.getBody();
                    Intrinsics.checkNotNullExpressionValue(body, "result.body");
                    String str = this.f5402j;
                    Iterator<T> it = body.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = (T) null;
                            break;
                        } else {
                            next = it.next();
                            deviceHardware = (DeviceHardware) next;
                        }
                    } while (!(Intrinsics.areEqual(deviceHardware.deviceUniqueId, str) && deviceHardware.isBind));
                    function1.invoke(Result.m5286boximpl(Result.m5287constructorimpl(Boolean.valueOf(next != null))));
                }
            }

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
            public static final class b<T> implements o14 {
                public final /* synthetic */ Function1<Result<Boolean>, Unit> i;

                /* JADX WARN: Multi-variable type inference failed */
                public b(Function1<? super Result<Boolean>, Unit> function1) {
                    this.i = function1;
                }

                @Override // com.oplus.aiunit.vision.o14
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final void accept(@NotNull Throwable it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    Function1<Result<Boolean>, Unit> function1 = this.i;
                    Result.Companion companion = Result.INSTANCE;
                    function1.invoke(Result.m5286boximpl(Result.m5287constructorimpl(ResultKt.createFailure(new IllegalStateException("check fail " + it.getMessage())))));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Function1<? super Result<? extends Boolean>, ? extends Unit> function1) {
                invoke2((Function1<? super Result<Boolean>, Unit>) function1);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Function1<? super Result<Boolean>, Unit> block) {
                Intrinsics.checkNotNullParameter(block, "block");
                String str2 = str;
                if (!(str2 == null || str2.length() == 0)) {
                    MMHardware.f().b(new a(block, str), new b(block));
                } else {
                    Result.Companion companion = Result.INSTANCE;
                    block.invoke(Result.m5286boximpl(Result.m5287constructorimpl(Boolean.FALSE)));
                }
            }
        });
    }
}
