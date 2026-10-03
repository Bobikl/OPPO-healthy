package com.heytap.health.devicelog.feedback;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.heytap.health.device.log.DeviceFileRepo;
import com.oplus.aiunit.vision.LogGetParam;
import com.oplus.aiunit.vision.LogGetResult;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.gea;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/heytap/health/devicelog/feedback/SyncLogFiles;", "Lcom/oplus/aiunit/vision/gea;", "Lcom/oplus/aiunit/vision/b6b;", "Lcom/oplus/aiunit/vision/c6b;", "Lcom/oplus/aiunit/vision/gea$a;", "chain", "a", "(Lcom/oplus/aiunit/vision/gea$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "request", "", "c", "(Lcom/oplus/aiunit/vision/b6b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class SyncLogFiles implements gea<LogGetParam, LogGetResult> {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\b"}, d2 = {"com/heytap/health/devicelog/feedback/SyncLogFiles$a", "Lcom/heytap/health/device/log/DeviceFileRepo$a;", "", "progress", "", "parentDir", "", "a", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements DeviceFileRepo.a {
        public final /* synthetic */ LogGetParam a;

        public a(LogGetParam logGetParam) {
            this.a = logGetParam;
        }

        @Override // com.heytap.health.device.log.DeviceFileRepo.a
        public void a(float progress, @Nullable String parentDir) {
            if (progress > 0.0f) {
                MutableLiveData<Float> mutableLiveDataA = this.a.a();
                Intrinsics.checkNotNull(mutableLiveDataA);
                mutableLiveDataA.postValue(Float.valueOf((0.8f * progress) + 0.2f));
            }
            Feedback.INSTANCE.a();
            StringBuilder sb = new StringBuilder();
            sb.append("doSyncDeviceLog onProgress: ");
            sb.append(progress);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00ea A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x00fb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x00fc A[PHI: r13
  0x00fc: PHI (r13v11 java.lang.Object) = (r13v9 java.lang.Object), (r13v1 java.lang.Object) binds: [B:52:0x00f9, B:14:0x002f] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.oplus.aiunit.vision.gea
    @Nullable
    public Object a(@NotNull gea.a<LogGetParam, LogGetResult> aVar, @NotNull Continuation<? super LogGetResult> continuation) {
        SyncLogFiles$intercept$1 syncLogFiles$intercept$1;
        LogGetParam logGetParam;
        LogGetParam logGetParam2;
        if (continuation instanceof SyncLogFiles$intercept$1) {
            syncLogFiles$intercept$1 = (SyncLogFiles$intercept$1) continuation;
            int i = syncLogFiles$intercept$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                syncLogFiles$intercept$1.label = i - Integer.MIN_VALUE;
            } else {
                syncLogFiles$intercept$1 = new SyncLogFiles$intercept$1(this, continuation);
            }
        } else {
            syncLogFiles$intercept$1 = new SyncLogFiles$intercept$1(this, continuation);
        }
        Object objA = syncLogFiles$intercept$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = syncLogFiles$intercept$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(objA);
            }
            if (i2 != 2) {
                if (i2 == 3) {
                    logGetParam2 = (LogGetParam) syncLogFiles$intercept$1.L$1;
                    aVar = (gea.a) syncLogFiles$intercept$1.L$0;
                    ResultKt.throwOnFailure(objA);
                } else {
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objA);
                }
                return objA;
            }
            logGetParam2 = (LogGetParam) syncLogFiles$intercept$1.L$2;
            aVar = (gea.a) syncLogFiles$intercept$1.L$1;
            SyncLogFiles syncLogFiles = (SyncLogFiles) syncLogFiles$intercept$1.L$0;
            try {
                ResultKt.throwOnFailure(objA);
            } catch (IllegalStateException e2) {
                logGetParam = logGetParam2;
                this = syncLogFiles;
                e = e2;
                a7b.f(Feedback.INSTANCE.a(), "SyncLogFiles error " + e.getMessage() + " retry once");
                syncLogFiles$intercept$1.L$0 = aVar;
                syncLogFiles$intercept$1.L$1 = logGetParam;
                syncLogFiles$intercept$1.L$2 = null;
                syncLogFiles$intercept$1.label = 3;
                if (this.c(logGetParam, syncLogFiles$intercept$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                logGetParam2 = logGetParam;
            }
            logGetParam = logGetParam2;
            syncLogFiles$intercept$1.L$0 = null;
            syncLogFiles$intercept$1.L$1 = null;
            syncLogFiles$intercept$1.L$2 = null;
            syncLogFiles$intercept$1.label = 4;
            objA = aVar.a(logGetParam, syncLogFiles$intercept$1);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objA;
        }
        ResultKt.throwOnFailure(objA);
        logGetParam = (LogGetParam) aVar.request();
        FeedbackOption fbOption = logGetParam.getFbOption();
        List<String> uploadFailFiles = fbOption.getUploadFailFiles();
        if (uploadFailFiles == null || uploadFailFiles.isEmpty()) {
            Map<String, String> fileKeys = fbOption.getFileKeys();
            if (fileKeys == null || fileKeys.isEmpty()) {
                if (fbOption.getCollectLog()) {
                    MutableLiveData<com.heytap.health.devicelog.feedback.a> mutableLiveDataC = logGetParam.c();
                    Intrinsics.checkNotNull(mutableLiveDataC);
                    mutableLiveDataC.postValue(com.heytap.health.devicelog.feedback.a.b.INSTANCE);
                    try {
                        syncLogFiles$intercept$1.L$0 = this;
                        syncLogFiles$intercept$1.L$1 = aVar;
                        syncLogFiles$intercept$1.L$2 = logGetParam;
                        syncLogFiles$intercept$1.label = 2;
                        if (c(logGetParam, syncLogFiles$intercept$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (IllegalStateException e3) {
                        e = e3;
                        a7b.f(Feedback.INSTANCE.a(), "SyncLogFiles error " + e.getMessage() + " retry once");
                        syncLogFiles$intercept$1.L$0 = aVar;
                        syncLogFiles$intercept$1.L$1 = logGetParam;
                        syncLogFiles$intercept$1.L$2 = null;
                        syncLogFiles$intercept$1.label = 3;
                        if (this.c(logGetParam, syncLogFiles$intercept$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                syncLogFiles$intercept$1.L$0 = null;
                syncLogFiles$intercept$1.L$1 = null;
                syncLogFiles$intercept$1.L$2 = null;
                syncLogFiles$intercept$1.label = 4;
                objA = aVar.a(logGetParam, syncLogFiles$intercept$1);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return objA;
            }
        }
        a7b.f(Feedback.INSTANCE.a(), "SyncLogFiles skip, current is pre commit error now retry");
        syncLogFiles$intercept$1.label = 1;
        objA = aVar.a(logGetParam, syncLogFiles$intercept$1);
        return objA == coroutine_suspended ? coroutine_suspended : objA;
        logGetParam2 = logGetParam;
        logGetParam = logGetParam2;
        syncLogFiles$intercept$1.L$0 = null;
        syncLogFiles$intercept$1.L$1 = null;
        syncLogFiles$intercept$1.L$2 = null;
        syncLogFiles$intercept$1.label = 4;
        objA = aVar.a(logGetParam, syncLogFiles$intercept$1);
        if (objA == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(LogGetParam logGetParam, Continuation<? super Unit> continuation) {
        SyncLogFiles$doSyncDeviceLog$1 syncLogFiles$doSyncDeviceLog$1;
        if (continuation instanceof SyncLogFiles$doSyncDeviceLog$1) {
            syncLogFiles$doSyncDeviceLog$1 = (SyncLogFiles$doSyncDeviceLog$1) continuation;
            int i = syncLogFiles$doSyncDeviceLog$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                syncLogFiles$doSyncDeviceLog$1.label = i - Integer.MIN_VALUE;
            } else {
                syncLogFiles$doSyncDeviceLog$1 = new SyncLogFiles$doSyncDeviceLog$1(this, continuation);
            }
        } else {
            syncLogFiles$doSyncDeviceLog$1 = new SyncLogFiles$doSyncDeviceLog$1(this, continuation);
        }
        SyncLogFiles$doSyncDeviceLog$1 syncLogFiles$doSyncDeviceLog$2 = syncLogFiles$doSyncDeviceLog$1;
        Object objJ = syncLogFiles$doSyncDeviceLog$2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = syncLogFiles$doSyncDeviceLog$2.label;
        boolean z = true;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objJ);
            if (!logGetParam.getFbOption().getLogNames().isEmpty()) {
                logGetParam.g().addAll(logGetParam.getFbOption().getLogNames());
            }
            if (logGetParam.g().isEmpty()) {
                a7b.f(Feedback.INSTANCE.a(), "doSyncDeviceLog no log to sync");
                return Unit.INSTANCE;
            }
            DeviceFileRepo deviceFileRepo = DeviceFileRepo.INSTANCE;
            List list = CollectionsKt___CollectionsKt.toList(logGetParam.g());
            a aVar = new a(logGetParam);
            syncLogFiles$doSyncDeviceLog$2.L$0 = logGetParam;
            syncLogFiles$doSyncDeviceLog$2.label = 1;
            objJ = DeviceFileRepo.j(deviceFileRepo, 0, null, list, aVar, syncLogFiles$doSyncDeviceLog$2, 3, null);
            if (objJ == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            logGetParam = (LogGetParam) syncLogFiles$doSyncDeviceLog$2.L$0;
            ResultKt.throwOnFailure(objJ);
        }
        List list2 = (List) objJ;
        if (list2 != null && !list2.isEmpty()) {
            z = false;
        }
        if (z) {
            throw new IllegalStateException("文件同步失败，请5分钟后重试，同时勾选'更多日志'选项");
        }
        logGetParam.f().addAll(0, list2);
        return Unit.INSTANCE;
    }
}
