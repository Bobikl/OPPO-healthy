package com.heytap.health.devicemanagerimpl.util;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.exifinterface.media.ExifInterface;
import com.oplus.aiunit.vision.ml4;
import com.oplus.aiunit.vision.t5b;
import com.oplus.aiunit.vision.u5b;
import com.oplus.aiunit.vision.wk4;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a8\u0010\b\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¨\u0006\t"}, d2 = {"Landroid/os/IInterface;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/oplus/aiunit/vision/t5b;", "", "tag", "Lkotlin/Function1;", "", "block", "a", "device_manager_impl_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRemoteCallbackExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteCallbackExt.kt\ncom/heytap/health/devicemanagerimpl/util/RemoteCallbackExtKt\n+ 2 LockUtils.kt\ncom/heytap/health/devicemanager/lock/LockUtilsKt\n*L\n1#1,40:1\n21#2,9:41\n*S KotlinDebug\n*F\n+ 1 RemoteCallbackExt.kt\ncom/heytap/health/devicemanagerimpl/util/RemoteCallbackExtKt\n*L\n25#1:41,9\n*E\n"})
public final class RemoteCallbackExtKt {
    public static final <T extends IInterface> void a(@NotNull t5b<T> t5bVar, @NotNull String tag, @NotNull final Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(t5bVar, "<this>");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            u5b.a(tag, "writeLock");
            t5bVar.writeLock();
            try {
                int iBeginBroadcast = t5bVar.beginBroadcast();
                for (int i = 0; i < iBeginBroadcast; i++) {
                    final T broadcastItem = t5bVar.getBroadcastItem(i);
                    wk4.a(tag, broadcastItem, new Function0<Unit>() { // from class: com.heytap.health.devicemanagerimpl.util.RemoteCallbackExtKt$forEach$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/functions/Function1<-TT;Lkotlin/Unit;>;TT;)V */
                        {
                            super(0);
                        }

                        @Override // p010kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX WARN: Type inference incomplete: some casts might be missing */
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            Function1<T, Unit> function1 = block;
                            IInterface broadcastItem2 = broadcastItem;
                            Intrinsics.checkNotNullExpressionValue(broadcastItem2, "broadcastItem");
                            function1.invoke((T) broadcastItem2);
                        }
                    });
                }
            } catch (RemoteException e2) {
                ml4.c("RemoveCallbackExt", tag + " error " + e2.getMessage());
            } finally {
                t5bVar.finishBroadcast();
            }
            Unit unit = Unit.INSTANCE;
            t5bVar.writeUnLock();
            u5b.a(tag, "writeUnLock");
        } catch (Throwable th) {
            t5bVar.writeUnLock();
            u5b.a(tag, "writeUnLock");
            throw th;
        }
    }
}
