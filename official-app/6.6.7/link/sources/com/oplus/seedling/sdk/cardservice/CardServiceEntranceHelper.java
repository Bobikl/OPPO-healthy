package com.oplus.seedling.sdk.cardservice;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.DeadObjectException;
import com.oplus.aiunit.vision.d14;
import com.oplus.aiunit.vision.ht9;
import com.oplus.aiunit.vision.s8e;
import com.oplus.aiunit.vision.v8e;
import com.pantanal.fundation.internal.thread.DispatchersUtil;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004H\u0007J\u0018\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004H\u0007J\u0018\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/oplus/seedling/sdk/cardservice/CardServiceEntranceHelper;", "", "()V", "KEY_INIT_ENTRANCE_CHANNEL_RESULT", "", "KEY_RELEASE_ENTRANCE_CHANNEL_RESULT", "METHOD_INIT_ENTRANCE_CHANNEL", "METHOD_RELEASE_ENTRANCE_CHANNEL", "TAG", "assistantCardServiceUri", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "umsCardServiceUri", "callCardServiceProvider", "", "methodName", "context", "Landroid/content/Context;", "entranceAuthorityName", "requestDoInitChannelInCardService", "requestDoReleaseInCardService", "pantanal-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CardServiceEntranceHelper {

    @NotNull
    private static final String KEY_INIT_ENTRANCE_CHANNEL_RESULT = "initEntranceChannelResult";

    @NotNull
    private static final String KEY_RELEASE_ENTRANCE_CHANNEL_RESULT = "releaseEntranceChannelResult";

    @NotNull
    private static final String METHOD_INIT_ENTRANCE_CHANNEL = "initEntranceChannel";

    @NotNull
    private static final String METHOD_RELEASE_ENTRANCE_CHANNEL = "releaseEntranceChannel";

    @NotNull
    private static final String TAG = "CardServiceChannelHelper";

    @NotNull
    public static final CardServiceEntranceHelper INSTANCE = new CardServiceEntranceHelper();
    private static final Uri assistantCardServiceUri = Uri.parse("content://com.coloros.assistantscreen.client.provider");
    private static final Uri umsCardServiceUri = Uri.parse("content://com.oplus.pantanal.ums.cardservice.provider.CardServiceClientProvider");

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "com.oplus.seedling.sdk.cardservice.CardServiceEntranceHelper$callCardServiceProvider$1", f = "CardServiceEntranceHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class 1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ String $entranceAuthorityName;
        final /* synthetic */ String $methodName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(Context context, String str, String str2, Continuation<? super 1> continuation) {
            super(2, continuation);
            this.$context = context;
            this.$methodName = str;
            this.$entranceAuthorityName = str2;
        }

        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new 1(this.$context, this.$methodName, this.$entranceAuthorityName, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:55:0x013a A[PHI: r15
  0x013a: PHI (r15v4 ??) = (r15v18 ??), (r15v19 ??) binds: [B:54:0x0138, B:58:0x0164] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:63:0x01a9  */
        /* JADX WARN: Code duplicated, block: B:73:0x0082 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r15v0 */
        /* JADX WARN: Type inference failed for: r15v1 */
        /* JADX WARN: Type inference failed for: r15v10, types: [android.os.BaseBundle] */
        /* JADX WARN: Type inference failed for: r15v11 */
        /* JADX WARN: Type inference failed for: r15v12 */
        /* JADX WARN: Type inference failed for: r15v13 */
        /* JADX WARN: Type inference failed for: r15v14 */
        /* JADX WARN: Type inference failed for: r15v15 */
        /* JADX WARN: Type inference failed for: r15v16 */
        /* JADX WARN: Type inference failed for: r15v17 */
        /* JADX WARN: Type inference failed for: r15v18 */
        /* JADX WARN: Type inference failed for: r15v19 */
        /* JADX WARN: Type inference failed for: r15v2, types: [android.content.ContentProviderClient] */
        /* JADX WARN: Type inference failed for: r15v3 */
        /* JADX WARN: Type inference failed for: r15v4, types: [android.content.ContentProviderClient] */
        /* JADX WARN: Type inference failed for: r15v5 */
        /* JADX WARN: Type inference failed for: r15v6 */
        /* JADX WARN: Type inference failed for: r15v7 */
        /* JADX WARN: Type inference failed for: r15v8 */
        /* JADX WARN: Type inference failed for: r15v9 */
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            ContentProviderClient contentProviderClient;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Uri uri = v8e.a(this.$context) ? CardServiceEntranceHelper.umsCardServiceUri : CardServiceEntranceHelper.assistantCardServiceUri;
            s8e s8eVar = s8e.INSTANCE;
            ht9.a.c(s8eVar, CardServiceEntranceHelper.TAG, "callCardServiceProvider,uri = " + uri + ", methodName=" + this.$methodName + ",authority = " + this.$entranceAuthorityName + d14.COMMA_REGEX, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            boolean z = false;
            ?? r15 = 0;
            r15 = 0;
            r15 = 0;
            r15 = 0;
            try {
                try {
                    ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = this.$context.getContentResolver().acquireUnstableContentProviderClient(uri);
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        try {
                            Bundle bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call(this.$methodName, this.$entranceAuthorityName, null);
                            if (bundleCall == null) {
                                try {
                                    contentProviderClient = contentProviderClientAcquireUnstableContentProviderClient;
                                    try {
                                        ht9.a.e(s8eVar, CardServiceEntranceHelper.TAG, "client is null,uri = " + uri, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                                    } catch (DeadObjectException e) {
                                        e = e;
                                        r15 = contentProviderClient;
                                        ht9.a.e(s8e.INSTANCE, CardServiceEntranceHelper.TAG, "callCardServiceProvider catch DeadObjectException,msg = " + e.getMessage(), false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                                        r15 = r15;
                                        if (r15 != 0) {
                                            r15.close();
                                        }
                                    } catch (Exception e2) {
                                        e = e2;
                                        r15 = contentProviderClient;
                                        ht9.a.e(s8e.INSTANCE, CardServiceEntranceHelper.TAG, "callCardServiceProvider failed,msg = " + e.getMessage(), false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                                        r15 = r15;
                                        if (r15 != 0) {
                                            r15.close();
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        r15 = contentProviderClient;
                                        if (r15 != 0) {
                                            r15.close();
                                        }
                                        throw th;
                                    }
                                } catch (DeadObjectException e3) {
                                    e = e3;
                                    contentProviderClient = contentProviderClientAcquireUnstableContentProviderClient;
                                } catch (Exception e4) {
                                    e = e4;
                                    contentProviderClient = contentProviderClientAcquireUnstableContentProviderClient;
                                } catch (Throwable th2) {
                                    th = th2;
                                    contentProviderClient = contentProviderClientAcquireUnstableContentProviderClient;
                                }
                            } else {
                                r15 = bundleCall;
                                contentProviderClient = contentProviderClientAcquireUnstableContentProviderClient;
                            }
                        } catch (DeadObjectException e5) {
                            e = e5;
                            r15 = contentProviderClientAcquireUnstableContentProviderClient;
                            ht9.a.e(s8e.INSTANCE, CardServiceEntranceHelper.TAG, "callCardServiceProvider catch DeadObjectException,msg = " + e.getMessage(), false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                            r15 = r15;
                            if (r15 != 0) {
                                r15.close();
                            }
                            ht9.a.c(s8e.INSTANCE, CardServiceEntranceHelper.TAG, "callCardServiceProvider " + uri + ", method= " + this.$methodName + ",args = " + this.$entranceAuthorityName + ",callResult=" + z, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                            return Unit.INSTANCE;
                        } catch (Exception e6) {
                            e = e6;
                            r15 = contentProviderClientAcquireUnstableContentProviderClient;
                            ht9.a.e(s8e.INSTANCE, CardServiceEntranceHelper.TAG, "callCardServiceProvider failed,msg = " + e.getMessage(), false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                            r15 = r15;
                            if (r15 != 0) {
                                r15.close();
                            }
                            ht9.a.c(s8e.INSTANCE, CardServiceEntranceHelper.TAG, "callCardServiceProvider " + uri + ", method= " + this.$methodName + ",args = " + this.$entranceAuthorityName + ",callResult=" + z, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                            return Unit.INSTANCE;
                        } catch (Throwable th3) {
                            th = th3;
                            r15 = contentProviderClientAcquireUnstableContentProviderClient;
                            if (r15 != 0) {
                                r15.close();
                            }
                            throw th;
                        }
                    } else {
                        contentProviderClient = contentProviderClientAcquireUnstableContentProviderClient;
                        ht9.a.e(s8eVar, CardServiceEntranceHelper.TAG, "client is null,uri = " + uri, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                    }
                    if (Intrinsics.areEqual(this.$methodName, CardServiceEntranceHelper.METHOD_INIT_ENTRANCE_CHANNEL)) {
                        if (r15 != 0) {
                            z = r15.getBoolean(CardServiceEntranceHelper.KEY_INIT_ENTRANCE_CHANNEL_RESULT);
                        }
                    } else if (!Intrinsics.areEqual(this.$methodName, CardServiceEntranceHelper.METHOD_RELEASE_ENTRANCE_CHANNEL)) {
                        ht9.a.e(s8eVar, CardServiceEntranceHelper.TAG, "not match method = " + this.$methodName, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                    } else if (r15 != 0) {
                        z = r15.getBoolean(CardServiceEntranceHelper.KEY_RELEASE_ENTRANCE_CHANNEL_RESULT);
                    }
                    if (contentProviderClient != null) {
                        contentProviderClient.close();
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (DeadObjectException e7) {
                e = e7;
            } catch (Exception e8) {
                e = e8;
            }
            ht9.a.c(s8e.INSTANCE, CardServiceEntranceHelper.TAG, "callCardServiceProvider " + uri + ", method= " + this.$methodName + ",args = " + this.$entranceAuthorityName + ",callResult=" + z, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            return Unit.INSTANCE;
        }

        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }
    }

    private CardServiceEntranceHelper() {
    }

    @JvmStatic
    public static final void callCardServiceProvider(@NotNull String methodName, @NotNull Context context, @NotNull String entranceAuthorityName) {
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(entranceAuthorityName, "entranceAuthorityName");
        BuildersKt.launch$default(CoroutineScopeKt.CoroutineScope(DispatchersUtil.q()), (CoroutineContext) null, (CoroutineStart) null, new 1(context, methodName, entranceAuthorityName, null), 3, (Object) null);
    }

    @JvmStatic
    public static final void requestDoInitChannelInCardService(@NotNull Context context, @NotNull String entranceAuthorityName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(entranceAuthorityName, "entranceAuthorityName");
        ht9.a.a(s8e.INSTANCE, TAG, "requestDoInitChannelInCardService，entrance = " + entranceAuthorityName, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        callCardServiceProvider(METHOD_INIT_ENTRANCE_CHANNEL, context, entranceAuthorityName);
    }

    @JvmStatic
    public static final void requestDoReleaseInCardService(@NotNull Context context, @NotNull String entranceAuthorityName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(entranceAuthorityName, "entranceAuthorityName");
        ht9.a.a(s8e.INSTANCE, TAG, "requestDoReleaseInCardService，entrance=" + entranceAuthorityName, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        callCardServiceProvider(METHOD_RELEASE_ENTRANCE_CHANNEL, context, entranceAuthorityName);
    }
}
