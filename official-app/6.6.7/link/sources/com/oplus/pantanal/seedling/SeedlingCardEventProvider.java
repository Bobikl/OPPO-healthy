package com.oplus.pantanal.seedling;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import com.oplus.pantanal.seedling.bean.CardCreateErrorBean;
import com.oplus.pantanal.seedling.constants.Constants;
import com.oplus.pantanal.seedling.update.SeedlingUpdateManager;
import com.oplus.pantanal.seedling.util.Logger;
import com.oplus.smartenginehelper.ParserTag;
import com.opos.process.bridge.base.BridgeConstant;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000 +2\u00020\u0001:\u0001+B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\t\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0002J1\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0010\u0010\u0010\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\u0011H\u0016¢\u0006\u0002\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001aH&J\b\u0010\u001b\u001a\u00020\u001cH\u0016J0\u0010\u001d\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u00062\b\u0010 \u001a\u0004\u0018\u00010\u00062\b\u0010!\u001a\u0004\u0018\u00010\u0006H&JO\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010\r\u001a\u00020\u000e2\u0010\u0010\u000f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0010\u0010$\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\u00112\b\u0010%\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0002\u0010&J\u0012\u0010'\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010(\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0002J;\u0010)\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00172\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0010\u0010$\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\u0011H\u0016¢\u0006\u0002\u0010*¨\u0006,"}, d2 = {"Lcom/oplus/pantanal/seedling/SeedlingCardEventProvider;", "Landroid/content/ContentProvider;", "()V", "call", "Landroid/os/Bundle;", ParserTag.TAG_METHOD, "", "arg", BridgeConstant.KEY_EXTRAS, SeedlingCardEventProvider.METHOD_CARD_EXCEPTION, "", "delete", "", "p0", "Landroid/net/Uri;", "p1", "p2", "", "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "getType", "insert", ParserTag.TAG_URI, "values", "Landroid/content/ContentValues;", "onCardCreateErrorInfo", "cardErrorInfo", "Lcom/oplus/pantanal/seedling/bean/CardCreateErrorBean;", "onCreate", "", "onServiceClose", "serviceId", SeedlingCardEventProvider.KEY_SERVICE_CLOSE_REASON, SeedlingCardEventProvider.KEY_SERVICE_INSTANCE_ID, SeedlingCardEventProvider.KEY_SERVICE_EXTRA, "query", "Landroid/database/Cursor;", "p3", "p4", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "saveDisableEntry", SeedlingCardEventProvider.METHOD_SERVICE_CLOSE, "update", "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "Companion", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class SeedlingCardEventProvider extends ContentProvider {
    private static final int INVALID_ENTRY = -1;

    @NotNull
    private static final String KEY_DISABLE_ENTRY = "disableEntry";

    @NotNull
    private static final String KEY_ENTRANCE_NAME = "entranceName";

    @NotNull
    private static final String KEY_ENTRANCE_TYPE = "entranceType";

    @NotNull
    private static final String KEY_ERROR_CODE = "errorCode";

    @NotNull
    private static final String KEY_ERROR_MSG = "errorMsg";

    @NotNull
    private static final String KEY_INSTANCE_ID = "instanceId";

    @NotNull
    private static final String KEY_SERVICE_CLOSE_REASON = "reason";

    @NotNull
    private static final String KEY_SERVICE_EXTRA = "extra";

    @NotNull
    private static final String KEY_SERVICE_ID = "serviceId";

    @NotNull
    private static final String KEY_SERVICE_INSTANCE_ID = "serviceInstanceId";

    @NotNull
    private static final String METHOD_CARD_EXCEPTION = "cardException";

    @NotNull
    private static final String METHOD_NOTIFY_DISABLE_ENTRY_CHANGE = "notifyDisableEntryChange";

    @NotNull
    private static final String METHOD_SERVICE_CLOSE = "serviceClose";

    @NotNull
    private static final String TAG = "SeedlingCardEventProvider";

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.oplus.pantanal.seedling.SeedlingCardEventProvider$call$1", f = "SeedlingCardEventProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class 1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Bundle $extras;
        final /* synthetic */ String $method;
        int label;
        final /* synthetic */ SeedlingCardEventProvider this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(String str, SeedlingCardEventProvider seedlingCardEventProvider, Bundle bundle, Continuation<? super 1> continuation) {
            super(2, continuation);
            this.$method = str;
            this.this$0 = seedlingCardEventProvider;
            this.$extras = bundle;
        }

        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new 1(this.$method, this.this$0, this.$extras, continuation);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object obj2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String str = this.$method;
            SeedlingCardEventProvider seedlingCardEventProvider = this.this$0;
            Bundle bundle = this.$extras;
            try {
                Result.Companion companion = Result.Companion;
                int iHashCode = str.hashCode();
                if (iHashCode != -1320884449) {
                    if (iHashCode != -479657501) {
                        if (iHashCode == 333975619 && str.equals(SeedlingCardEventProvider.METHOD_SERVICE_CLOSE)) {
                            seedlingCardEventProvider.serviceClose(bundle);
                        }
                    } else if (str.equals(SeedlingCardEventProvider.METHOD_NOTIFY_DISABLE_ENTRY_CHANGE)) {
                        seedlingCardEventProvider.saveDisableEntry(bundle);
                    }
                } else if (str.equals(SeedlingCardEventProvider.METHOD_CARD_EXCEPTION)) {
                    seedlingCardEventProvider.cardException(bundle);
                }
                obj2 = Result.constructor-impl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(th));
            }
            Throwable th2 = Result.exceptionOrNull-impl(obj2);
            if (th2 != null) {
                Logger.INSTANCE.e(SeedlingCardEventProvider.TAG, "call error, msg: " + th2.getMessage());
            }
            return Unit.INSTANCE;
        }

        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cardException(Bundle extras) {
        if (extras != null) {
            int i = extras.getInt(KEY_ENTRANCE_TYPE);
            String string = extras.getString(KEY_ENTRANCE_NAME);
            int i2 = extras.getInt(KEY_ERROR_CODE);
            String string2 = extras.getString(KEY_ERROR_MSG);
            String string3 = extras.getString("serviceId");
            long j = extras.getLong(KEY_INSTANCE_ID);
            Logger.INSTANCE.i(TAG, "errorCode " + i2 + ", errorMsg " + string2 + ", entranceType " + i + ", entranceName " + string + ", serviceId " + string3 + ", instanceId " + j);
            onCardCreateErrorInfo(new CardCreateErrorBean(j, string3, i, string, i2, string2, null, 64, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveDisableEntry(Bundle extras) {
        if (extras != null) {
            String string = extras.getString("serviceId");
            int i = extras.getInt(KEY_DISABLE_ENTRY, -1);
            String string2 = extras.getString(KEY_SERVICE_INSTANCE_ID);
            Logger.INSTANCE.i(TAG, "saveDisableEntry serviceId=" + string + " serviceInstanceId=" + string2 + " disableEntry=" + i);
            if (string == null || string.length() == 0 || i == -1 || string2 == null || string2.length() == 0) {
                return;
            }
            SeedlingUpdateManager.INSTANCE.getINSTANCE().saveDisableEntry(string, i, string2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void serviceClose(Bundle extras) {
        if (extras != null) {
            String string = extras.getString("serviceId");
            String string2 = extras.getString(KEY_SERVICE_CLOSE_REASON);
            String string3 = extras.getString(KEY_SERVICE_EXTRA);
            String strOptString = new JSONObject(string3).optString(KEY_SERVICE_INSTANCE_ID);
            Logger.INSTANCE.i(TAG, "serviceId " + string + ", reason " + string2 + ", instanceId " + strOptString + ", extra " + string3);
            onServiceClose(string, string2, strOptString, string3);
        }
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Bundle call(@NotNull String method, @Nullable String arg, @Nullable Bundle extras) {
        Intrinsics.checkNotNullParameter(method, ParserTag.TAG_METHOD);
        Context context = getContext();
        if (context == null || context.checkCallingPermission(Constants.ASSISTANT_PERMISSION) != 0) {
            Logger.INSTANCE.i(TAG, "permission denial missing assistant permission");
        } else {
            Logger.INSTANCE.i(TAG, "call method " + method + ", arg " + arg + ", extras " + extras);
            BuildersKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), (CoroutineContext) null, (CoroutineStart) null, new 1(method, this, extras, null), 3, (Object) null);
        }
        return super.call(method, arg, extras);
    }

    @Override // android.content.ContentProvider
    public int delete(@NotNull Uri p0, @Nullable String p1, @Nullable String[] p2) throws RemoteException {
        Intrinsics.checkNotNullParameter(p0, "p0");
        throw new RemoteException("Permission denied: not allowed to call delete");
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NotNull Uri p0) throws RemoteException {
        Intrinsics.checkNotNullParameter(p0, "p0");
        throw new RemoteException("Permission denied: not allowed to call getType");
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NotNull Uri uri, @Nullable ContentValues values) throws RemoteException {
        Intrinsics.checkNotNullParameter(uri, ParserTag.TAG_URI);
        throw new RemoteException("Permission denied: not allowed to call insert");
    }

    public abstract void onCardCreateErrorInfo(@NotNull CardCreateErrorBean cardErrorInfo);

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    public abstract void onServiceClose(@Nullable String serviceId, @Nullable String reason, @Nullable String serviceInstanceId, @Nullable String extra);

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NotNull Uri p0, @Nullable String[] p1, @Nullable String p2, @Nullable String[] p3, @Nullable String p4) throws RemoteException {
        Intrinsics.checkNotNullParameter(p0, "p0");
        throw new RemoteException("Permission denied: not allowed to call query");
    }

    @Override // android.content.ContentProvider
    public int update(@NotNull Uri p0, @Nullable ContentValues p1, @Nullable String p2, @Nullable String[] p3) throws RemoteException {
        Intrinsics.checkNotNullParameter(p0, "p0");
        throw new RemoteException("Permission denied: not allowed to call update");
    }
}
