package com.heytap.store.platform.htrouter.facade;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.app.NotificationCompat;
import com.heytap.store.platform.htrouter.facade.callback.NavigationCallback;
import com.heytap.store.platform.htrouter.facade.models.RouteMeta;
import com.heytap.store.platform.htrouter.facade.service.SerializationService;
import com.heytap.store.platform.htrouter.facade.template.IProvider;
import com.heytap.store.platform.htrouter.launcher.HTRouter;
import com.oplus.aiunit.vision.jla;
import com.oplus.aiunit.vision.vc;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import java.io.Serializable;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.heytap.store.platform.htrouter.facade.Postcard, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B7\b\u0017\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000e\u0010D\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001aJ\u0006\u0010\"\u001a\u00020EJ&\u0010F\u001a\u00020E2\b\u0010\u0013\u001a\u0004\u0018\u00010G2\u0006\u0010H\u001a\u00020\u001a2\n\b\u0002\u0010I\u001a\u0004\u0018\u00010JH\u0007J\"\u0010F\u001a\u0004\u0018\u0001072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010I\u001a\u0004\u0018\u00010JH\u0007J\b\u0010K\u001a\u00020\u0003H\u0016J\u000e\u0010L\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010M\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0003J\u0018\u0010N\u001a\u00020\u00002\b\u0010O\u001a\u0004\u0018\u00010\u00032\u0006\u0010P\u001a\u00020#J\u001a\u0010Q\u001a\u00020\u00002\b\u0010O\u001a\u0004\u0018\u00010\u00032\b\u0010P\u001a\u0004\u0018\u00010\bJ\u0018\u0010R\u001a\u00020\u00002\b\u0010O\u001a\u0004\u0018\u00010\u00032\u0006\u0010P\u001a\u00020SJ\u001a\u0010T\u001a\u00020\u00002\b\u0010O\u001a\u0004\u0018\u00010\u00032\b\u0010P\u001a\u0004\u0018\u00010UJ\u0018\u0010V\u001a\u00020\u00002\b\u0010O\u001a\u0004\u0018\u00010\u00032\u0006\u0010P\u001a\u00020WJ\u001a\u0010X\u001a\u00020\u00002\b\u0010O\u001a\u0004\u0018\u00010\u00032\b\u0010P\u001a\u0004\u0018\u00010YJ\u001a\u0010Z\u001a\u00020\u00002\b\u0010O\u001a\u0004\u0018\u00010\u00032\b\u0010P\u001a\u0004\u0018\u00010[J%\u0010\\\u001a\u00020\u00002\b\u0010O\u001a\u0004\u0018\u00010\u00032\u000e\u0010P\u001a\n\u0012\u0004\u0012\u00020[\u0018\u00010]¢\u0006\u0002\u0010^J,\u0010_\u001a\u00020\u00002\b\u0010O\u001a\u0004\u0018\u00010\u00032\u001a\u0010P\u001a\u0016\u0012\u0004\u0012\u00020[\u0018\u00010`j\n\u0012\u0004\u0012\u00020[\u0018\u0001`aJ\u0018\u0010b\u001a\u00020\u00002\b\u0010O\u001a\u0004\u0018\u00010\u00032\u0006\u0010P\u001a\u00020cJ\u000e\u0010d\u001a\u00020\u00002\u0006\u0010e\u001a\u00020\u001aJ\u0018\u0010f\u001a\u00020\u00002\b\u0010O\u001a\u0004\u0018\u00010\u00032\u0006\u0010P\u001a\u00020gJ\u001a\u0010h\u001a\u00020\u00002\b\u0010O\u001a\u0004\u0018\u00010\u00032\b\u0010P\u001a\u0004\u0018\u00010iJ\u0018\u0010j\u001a\u00020\u00002\b\u0010O\u001a\u0004\u0018\u00010\u00032\u0006\u0010P\u001a\u00020\u001aJ,\u0010k\u001a\u00020\u00002\b\u0010O\u001a\u0004\u0018\u00010\u00032\u001a\u0010P\u001a\u0016\u0012\u0004\u0012\u00020\u001a\u0018\u00010`j\n\u0012\u0004\u0012\u00020\u001a\u0018\u0001`aJ\u0018\u0010l\u001a\u00020\u00002\b\u0010O\u001a\u0004\u0018\u00010\u00032\u0006\u0010P\u001a\u00020mJ\u001a\u0010n\u001a\u00020\u00002\b\u0010O\u001a\u0004\u0018\u00010\u00032\b\u0010P\u001a\u0004\u0018\u000107J\u000e\u0010o\u001a\u00020\u00002\u0006\u0010p\u001a\u00020qJ\u001a\u0010r\u001a\u00020\u00002\b\u0010O\u001a\u0004\u0018\u00010\u00032\b\u0010P\u001a\u0004\u0018\u00010sJ'\u0010t\u001a\u00020\u00002\b\u0010O\u001a\u0004\u0018\u00010\u00032\u0010\u0010P\u001a\f\u0012\u0006\b\u0001\u0012\u00020s\u0018\u00010]¢\u0006\u0002\u0010uJ0\u0010v\u001a\u00020\u00002\b\u0010O\u001a\u0004\u0018\u00010\u00032\u001e\u0010P\u001a\u001a\u0012\u0006\b\u0001\u0012\u00020s\u0018\u00010`j\f\u0012\u0006\b\u0001\u0012\u00020s\u0018\u0001`aJ\u001a\u0010w\u001a\u00020\u00002\b\u0010O\u001a\u0004\u0018\u00010\u00032\b\u0010P\u001a\u0004\u0018\u00010xJ\u0018\u0010y\u001a\u00020\u00002\b\u0010O\u001a\u0004\u0018\u00010\u00032\u0006\u0010P\u001a\u00020zJ\u001a\u0010{\u001a\u00020\u00002\b\u0010O\u001a\u0004\u0018\u00010\u00032\b\u0010P\u001a\u0004\u0018\u00010|J\"\u0010}\u001a\u00020\u00002\b\u0010O\u001a\u0004\u0018\u00010\u00032\u0010\u0010P\u001a\f\u0012\u0006\b\u0001\u0012\u00020s\u0018\u00010~J\u001a\u0010\u007f\u001a\u00020\u00002\b\u0010O\u001a\u0004\u0018\u00010\u00032\b\u0010P\u001a\u0004\u0018\u00010\u0003J-\u0010\u0080\u0001\u001a\u00020\u00002\b\u0010O\u001a\u0004\u0018\u00010\u00032\u001a\u0010P\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010`j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`aJ\u0017\u0010\u0081\u0001\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001a@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001a@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u001e\u0010 \u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001a@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u001a\u0010\"\u001a\u00020#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010(\u001a\u0004\u0018\u00010\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0010R\u001c\u0010*\u001a\u0004\u0018\u00010+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001d\u00100\u001a\u0004\u0018\u0001018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b2\u00103R\u001c\u00106\u001a\u0004\u0018\u000107X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001a\u0010<\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u001d\"\u0004\b>\u0010?R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010C¨\u0006\u0082\u0001"}, d2 = {"Lcom/heytap/store/platform/htrouter/facade/Postcard;", "Lcom/heytap/store/platform/htrouter/facade/models/RouteMeta;", "path", "", "group", ParserTag.TAG_URI, "Landroid/net/Uri;", "bundle", "Landroid/os/Bundle;", "(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Landroid/os/Bundle;)V", "action", "getAction", "()Ljava/lang/String;", "setAction", "(Ljava/lang/String;)V", "getBundle", "()Landroid/os/Bundle;", "setBundle", "(Landroid/os/Bundle;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "<set-?>", "", "enterAnim", "getEnterAnim", "()I", "exitAnim", "getExitAnim", UTraceSQLiteHelperKt.COL_FLAGS, "getFlags", "greenChannel", "", "getGreenChannel", "()Z", "setGreenChannel", "(Z)V", "optionsCompat", "getOptionsCompat", "provider", "Lcom/heytap/store/platform/htrouter/facade/template/IProvider;", "getProvider", "()Lcom/heytap/store/platform/htrouter/facade/template/IProvider;", "setProvider", "(Lcom/heytap/store/platform/htrouter/facade/template/IProvider;)V", "serializationService", "Lcom/heytap/store/platform/htrouter/facade/service/SerializationService;", "getSerializationService", "()Lcom/heytap/store/platform/htrouter/facade/service/SerializationService;", "serializationService$delegate", "Lkotlin/Lazy;", "tag", "", "getTag", "()Ljava/lang/Object;", "setTag", "(Ljava/lang/Object;)V", "timeout", "getTimeout", "setTimeout", "(I)V", "getUri", "()Landroid/net/Uri;", "setUri", "(Landroid/net/Uri;)V", "addFlags", "", NotificationCompat.CATEGORY_NAVIGATION, "Landroid/app/Activity;", vc.KEY_REQUEST_CODE, "callback", "Lcom/heytap/store/platform/htrouter/facade/callback/NavigationCallback;", "toString", jla.DEFAULT_WITH_PREFIX, "withAction", "withBoolean", "key", "value", "withBundle", "withByte", "", "withByteArray", "", "withChar", "", "withCharArray", "", "withCharSequence", "", "withCharSequenceArray", "", "(Ljava/lang/String;[Ljava/lang/CharSequence;)Lcom/heytap/store/platform/htrouter/facade/Postcard;", "withCharSequenceArrayList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "withDouble", "", "withFlags", "flag", "withFloat", "", "withFloatArray", "", "withInt", "withIntegerArrayList", "withLong", "", "withObject", "withOptionsCompat", "compat", "Landroidx/core/app/ActivityOptionsCompat;", "withParcelable", "Landroid/os/Parcelable;", "withParcelableArray", "(Ljava/lang/String;[Landroid/os/Parcelable;)Lcom/heytap/store/platform/htrouter/facade/Postcard;", "withParcelableArrayList", "withSerializable", "Ljava/io/Serializable;", "withShort", "", "withShortArray", "", "withSparseParcelableArray", "Landroid/util/SparseArray;", "withString", "withStringArrayList", "withTransition", "htrouter-api_release"}, k = 1, mv = {1, 4, 0})
public final class PostCard extends RouteMeta {

    @Nullable
    private String action;

    @NotNull
    private Bundle bundle;

    @Nullable
    private Context context;
    private int enterAnim;
    private int exitAnim;
    private int flags;
    private boolean greenChannel;

    @Nullable
    private Bundle optionsCompat;

    @Nullable
    private IProvider provider;

    /* JADX INFO: renamed from: serializationService$delegate, reason: from kotlin metadata */
    private final Lazy serializationService;

    @Nullable
    private Object tag;
    private int timeout;

    @Nullable
    private Uri uri;

    @JvmOverloads
    public PostCard() {
        this(null, null, null, null, 15, null);
    }

    private final SerializationService getSerializationService() {
        return (SerializationService) this.serializationService.getValue();
    }

    public static /* synthetic */ Object navigation$default(PostCard postCard, Context context, NavigationCallback navigationCallback, int i, Object obj) {
        if ((i & 1) != 0) {
            context = null;
        }
        if ((i & 2) != 0) {
            navigationCallback = null;
        }
        return postCard.navigation(context, navigationCallback);
    }

    @NotNull
    public final PostCard addFlags(int flags) {
        this.flags = flags | this.flags;
        return this;
    }

    @Nullable
    public final String getAction() {
        return this.action;
    }

    @NotNull
    public final Bundle getBundle() {
        return this.bundle;
    }

    @Nullable
    public final Context getContext() {
        return this.context;
    }

    public final int getEnterAnim() {
        return this.enterAnim;
    }

    public final int getExitAnim() {
        return this.exitAnim;
    }

    public final int getFlags() {
        return this.flags;
    }

    public final boolean getGreenChannel() {
        return this.greenChannel;
    }

    @Nullable
    public final Bundle getOptionsCompat() {
        return this.optionsCompat;
    }

    @Nullable
    public final IProvider getProvider() {
        return this.provider;
    }

    @Nullable
    public final Object getTag() {
        return this.tag;
    }

    public final int getTimeout() {
        return this.timeout;
    }

    @Nullable
    public final Uri getUri() {
        return this.uri;
    }

    public final void greenChannel() {
        this.greenChannel = true;
    }

    @JvmOverloads
    @Nullable
    public final Object navigation() {
        return navigation$default(this, null, null, 3, null);
    }

    public final void setAction(@Nullable String str) {
        this.action = str;
    }

    public final void setBundle(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "<set-?>");
        this.bundle = bundle;
    }

    public final void setContext(@Nullable Context context) {
        this.context = context;
    }

    public final void setGreenChannel(boolean z) {
        this.greenChannel = z;
    }

    public final void setProvider(@Nullable IProvider iProvider) {
        this.provider = iProvider;
    }

    public final void setTag(@Nullable Object obj) {
        this.tag = obj;
    }

    public final void setTimeout(int i) {
        this.timeout = i;
    }

    public final void setUri(@Nullable Uri uri) {
        this.uri = uri;
    }

    @Override // com.heytap.store.platform.htrouter.facade.models.RouteMeta
    @NotNull
    public String toString() {
        return "PostCard(uri=" + this.uri + ", tag=" + this.tag + ", bundle=" + this.bundle + ", flags=" + this.flags + ", timeout=" + this.timeout + ", provider=" + this.provider + ", greenChannel=" + this.greenChannel + ", optionsCompat=" + this.optionsCompat + ", enterAnim=" + this.enterAnim + ", exitAnim=" + this.exitAnim + ')';
    }

    @NotNull
    public final PostCard with(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        this.bundle = bundle;
        return this;
    }

    @NotNull
    public final PostCard withAction(@NotNull String action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.action = action;
        return this;
    }

    @NotNull
    public final PostCard withBoolean(@Nullable String key, boolean value) {
        this.bundle.putBoolean(key, value);
        return this;
    }

    @NotNull
    public final PostCard withBundle(@Nullable String key, @Nullable Bundle value) {
        this.bundle.putBundle(key, value);
        return this;
    }

    @NotNull
    public final PostCard withByte(@Nullable String key, byte value) {
        this.bundle.putByte(key, value);
        return this;
    }

    @NotNull
    public final PostCard withByteArray(@Nullable String key, @Nullable byte[] value) {
        this.bundle.putByteArray(key, value);
        return this;
    }

    @NotNull
    public final PostCard withChar(@Nullable String key, char value) {
        this.bundle.putChar(key, value);
        return this;
    }

    @NotNull
    public final PostCard withCharArray(@Nullable String key, @Nullable char[] value) {
        this.bundle.putCharArray(key, value);
        return this;
    }

    @NotNull
    public final PostCard withCharSequence(@Nullable String key, @Nullable CharSequence value) {
        this.bundle.putCharSequence(key, value);
        return this;
    }

    @NotNull
    public final PostCard withCharSequenceArray(@Nullable String key, @Nullable CharSequence[] value) {
        this.bundle.putCharSequenceArray(key, value);
        return this;
    }

    @NotNull
    public final PostCard withCharSequenceArrayList(@Nullable String key, @Nullable ArrayList<CharSequence> value) {
        this.bundle.putCharSequenceArrayList(key, value);
        return this;
    }

    @NotNull
    public final PostCard withDouble(@Nullable String key, double value) {
        this.bundle.putDouble(key, value);
        return this;
    }

    @NotNull
    public final PostCard withFlags(int flag) {
        this.flags = flag;
        return this;
    }

    @NotNull
    public final PostCard withFloat(@Nullable String key, float value) {
        this.bundle.putFloat(key, value);
        return this;
    }

    @NotNull
    public final PostCard withFloatArray(@Nullable String key, @Nullable float[] value) {
        this.bundle.putFloatArray(key, value);
        return this;
    }

    @NotNull
    public final PostCard withInt(@Nullable String key, int value) {
        this.bundle.putInt(key, value);
        return this;
    }

    @NotNull
    public final PostCard withIntegerArrayList(@Nullable String key, @Nullable ArrayList<Integer> value) {
        this.bundle.putIntegerArrayList(key, value);
        return this;
    }

    @NotNull
    public final PostCard withLong(@Nullable String key, long value) {
        this.bundle.putLong(key, value);
        return this;
    }

    @NotNull
    public final PostCard withObject(@Nullable String key, @Nullable Object value) {
        Bundle bundle = this.bundle;
        SerializationService serializationService = getSerializationService();
        bundle.putString(key, serializationService != null ? serializationService.object2Json(value) : null);
        return this;
    }

    @NotNull
    public final PostCard withOptionsCompat(@NotNull ActivityOptionsCompat compat) {
        Intrinsics.checkNotNullParameter(compat, "compat");
        this.optionsCompat = compat.toBundle();
        return this;
    }

    @NotNull
    public final PostCard withParcelable(@Nullable String key, @Nullable Parcelable value) {
        this.bundle.putParcelable(key, value);
        return this;
    }

    @NotNull
    public final PostCard withParcelableArray(@Nullable String key, @Nullable Parcelable[] value) {
        this.bundle.putParcelableArray(key, value);
        return this;
    }

    @NotNull
    public final PostCard withParcelableArrayList(@Nullable String key, @Nullable ArrayList<? extends Parcelable> value) {
        this.bundle.putParcelableArrayList(key, value);
        return this;
    }

    @NotNull
    public final PostCard withSerializable(@Nullable String key, @Nullable Serializable value) {
        this.bundle.putSerializable(key, value);
        return this;
    }

    @NotNull
    public final PostCard withShort(@Nullable String key, short value) {
        this.bundle.putShort(key, value);
        return this;
    }

    @NotNull
    public final PostCard withShortArray(@Nullable String key, @Nullable short[] value) {
        this.bundle.putShortArray(key, value);
        return this;
    }

    @NotNull
    public final PostCard withSparseParcelableArray(@Nullable String key, @Nullable SparseArray<? extends Parcelable> value) {
        this.bundle.putSparseParcelableArray(key, value);
        return this;
    }

    @NotNull
    public final PostCard withString(@Nullable String key, @Nullable String value) {
        this.bundle.putString(key, value);
        return this;
    }

    @NotNull
    public final PostCard withStringArrayList(@Nullable String key, @Nullable ArrayList<String> value) {
        this.bundle.putStringArrayList(key, value);
        return this;
    }

    @NotNull
    public final PostCard withTransition(int enterAnim, int exitAnim) {
        this.enterAnim = enterAnim;
        this.exitAnim = exitAnim;
        return this;
    }

    @JvmOverloads
    public PostCard(@Nullable String str) {
        this(str, null, null, null, 14, null);
    }

    public static /* synthetic */ void navigation$default(PostCard postCard, Activity activity, int i, NavigationCallback navigationCallback, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            navigationCallback = null;
        }
        postCard.navigation(activity, i, navigationCallback);
    }

    @JvmOverloads
    @Nullable
    public final Object navigation(@Nullable Context context) {
        return navigation$default(this, context, null, 2, null);
    }

    @JvmOverloads
    public PostCard(@Nullable String str, @Nullable String str2) {
        this(str, str2, null, null, 12, null);
    }

    @JvmOverloads
    public final void navigation(@Nullable Activity activity, int i) {
        navigation$default(this, activity, i, null, 4, null);
    }

    @JvmOverloads
    public PostCard(@Nullable String str, @Nullable String str2, @Nullable Uri uri) {
        this(str, str2, uri, null, 8, null);
    }

    @JvmOverloads
    @Nullable
    public final Object navigation(@Nullable Context context, @Nullable NavigationCallback callback) {
        return HTRouter.INSTANCE.getInstance().navigation(context, this, -1, callback);
    }

    @JvmOverloads
    public PostCard(@Nullable String str, @Nullable String str2, @Nullable Uri uri, @Nullable Bundle bundle) {
        this.timeout = 300;
        this.serializationService = LazyKt__LazyJVMKt.lazy(new Function0<SerializationService>() { // from class: com.heytap.store.platform.htrouter.facade.Postcard$serializationService$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @Nullable
            public final SerializationService invoke() {
                return (SerializationService) HTRouter.INSTANCE.getInstance().navigation(SerializationService.class);
            }
        });
        this.enterAnim = -1;
        this.exitAnim = -1;
        setPath(str);
        setGroup(str2);
        this.uri = uri;
        this.bundle = bundle == null ? new Bundle() : bundle;
    }

    @JvmOverloads
    public final void navigation(@Nullable Activity context, int requestCode, @Nullable NavigationCallback callback) {
        HTRouter.INSTANCE.getInstance().navigation(context, this, requestCode, callback);
    }

    public /* synthetic */ PostCard(String str, String str2, Uri uri, Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : uri, (i & 8) != 0 ? null : bundle);
    }
}
