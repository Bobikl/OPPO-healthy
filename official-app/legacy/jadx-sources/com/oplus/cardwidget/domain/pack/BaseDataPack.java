package com.oplus.cardwidget.domain.pack;

import android.os.Bundle;
import com.oplus.aiunit.vision.hjm;
import com.oplus.cardwidget.util.Logger;
import com.oplus.channel.client.utils.ClientDI;
import com.oplus.smartenginehelper.dsl.DSLCoder;
import n.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;
import p010kotlin.jvm.internal.Reflection;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.Charsets;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J \u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002J\"\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H&J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001a²\u0006\u000e\u0010\u0019\u001a\u0004\u0018\u00010\u00118\nX\u008a\u0084\u0002"}, d2 = {"Lcom/oplus/cardwidget/domain/pack/BaseDataPack;", "", "", "dslData", "Lcom/oplus/smartenginehelper/dsl/DSLCoder;", "onPrepare", "", "widgetCode", "coder", "", "forceUpdate", "Landroid/os/Bundle;", "createPatch", "onProcess", "onPack", "", "getCardVersion", "Lcom/oplus/aiunit/vision/hjm;", "dataCompress", "Lcom/oplus/aiunit/vision/hjm;", "getDataCompress", "()Lcom/oplus/aiunit/vision/hjm;", "<init>", "()V", "Companion", "instance", "com.oplus.card.widget.cardwidget"}, k = 1, mv = {1, 8, 0})
public abstract class BaseDataPack {

    @NotNull
    public static final String KEY_DATA_COMPRESS = "compress";

    @NotNull
    public static final String KEY_DATA_VERSION = "version";

    @NotNull
    public static final String KEY_DSL_DATA = "data";

    @NotNull
    public static final String KEY_DSL_NAME = "name";

    @NotNull
    public static final String KEY_EXTRA_MSG = "extraMsg";

    @NotNull
    public static final String KEY_FORCE_CHANGE_UI = "forceChange";

    @NotNull
    public static final String KEY_LAYOUT_NAME = "layoutName";

    @NotNull
    public static final String TAG = "Update.BaseDataPack";

    @Nullable
    private final hjm dataCompress = (hjm) b.a(TAG, a.a);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/oplus/aiunit/vision/hjm;", "a", "()Lcom/oplus/aiunit/vision/hjm;"}, k = 3, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBaseDataPack.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseDataPack.kt\ncom/oplus/cardwidget/domain/pack/BaseDataPack$dataCompress$1\n+ 2 ClientDI.kt\ncom/oplus/channel/client/utils/ClientDI\n*L\n1#1,95:1\n37#2,12:96\n*S KotlinDebug\n*F\n+ 1 BaseDataPack.kt\ncom/oplus/cardwidget/domain/pack/BaseDataPack$dataCompress$1\n*L\n31#1:96,12\n*E\n"})
    public static final class a extends Lambda implements Function0<hjm> {
        public static final a a = new a();

        /* JADX INFO: renamed from: com.oplus.cardwidget.domain.pack.BaseDataPack$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0006\u001a\u0004\u0018\u00018\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/oplus/channel/client/utils/ClientDI$injectSingle$1", "Lkotlin/Lazy;", "", "isInitialized", "getValue", "()Ljava/lang/Object;", "value", "client_release"}, k = 1, mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nClientDI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClientDI.kt\ncom/oplus/channel/client/utils/ClientDI$injectSingle$1\n*L\n1#1,105:1\n*E\n"})
        public static final class C0952a implements Lazy<hjm> {
            @Override // p010kotlin.Lazy
            @Nullable
            public hjm getValue() {
                return null;
            }

            @Override // p010kotlin.Lazy
            public boolean isInitialized() {
                return false;
            }
        }

        public a() {
            super(0);
        }

        @Override // p010kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final hjm invoke() {
            Lazy<?> c0952a;
            ClientDI clientDI = ClientDI.INSTANCE;
            if (clientDI.getSingleInstanceMap().get(Reflection.getOrCreateKotlinClass(hjm.class)) == null) {
                clientDI.onError("the class of [" + ((Object) Reflection.getOrCreateKotlinClass(hjm.class).getSimpleName()) + "] are not injected");
                c0952a = new C0952a();
            } else {
                Lazy<?> lazy = clientDI.getSingleInstanceMap().get(Reflection.getOrCreateKotlinClass(hjm.class));
                if (lazy == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Lazy<T of com.oplus.channel.client.utils.ClientDI.injectSingle>");
                }
                c0952a = lazy;
            }
            return a(c0952a);
        }

        private static final hjm a(Lazy<? extends hjm> lazy) {
            return lazy.getValue();
        }
    }

    private final Bundle createPatch(String widgetCode, DSLCoder coder, boolean forceUpdate) {
        Pair<String, Integer> pair;
        byte[] bArrBuild = coder.build();
        Logger logger = Logger.INSTANCE;
        logger.d(TAG, widgetCode + " createPatch begin...newData size=" + bArrBuild.length);
        hjm hjmVar = this.dataCompress;
        if (hjmVar == null || (pair = hjmVar.a(new String(bArrBuild, Charsets.UTF_8))) == null) {
            pair = new Pair<>("", 0);
        }
        Bundle bundle = new Bundle();
        bundle.putString("widget_code", widgetCode);
        bundle.putString("data", pair.getFirst());
        bundle.putInt(KEY_DATA_COMPRESS, pair.getSecond().intValue());
        bundle.putBoolean(KEY_FORCE_CHANGE_UI, forceUpdate);
        bundle.putLong("version", getCardVersion());
        logger.debug(TAG, widgetCode, "layout data.first encompress size is " + pair.getFirst().length());
        return bundle;
    }

    private final DSLCoder onPrepare(byte[] dslData) {
        if (dslData == null) {
            return null;
        }
        Logger.INSTANCE.d(TAG, "onPrepare dslData size=" + dslData.length);
        return new DSLCoder(dslData);
    }

    public long getCardVersion() {
        return 0L;
    }

    @Nullable
    public final hjm getDataCompress() {
        return this.dataCompress;
    }

    public abstract boolean onPack(@NotNull DSLCoder coder);

    @Nullable
    public Bundle onProcess(@NotNull String widgetCode, @NotNull byte[] dslData, boolean forceUpdate) {
        Intrinsics.checkNotNullParameter(widgetCode, "widgetCode");
        Intrinsics.checkNotNullParameter(dslData, "dslData");
        Logger logger = Logger.INSTANCE;
        logger.debug(TAG, widgetCode, "onProcess begin... forceUpdate: " + forceUpdate);
        DSLCoder dSLCoderOnPrepare = onPrepare(dslData);
        if (dSLCoderOnPrepare == null) {
            logger.error(TAG, widgetCode, "onProcess coder is null");
            return null;
        }
        if (!onPack(dSLCoderOnPrepare)) {
            return null;
        }
        logger.debug(TAG, widgetCode, "onProcess, onPack return true");
        return createPatch(widgetCode, dSLCoderOnPrepare, forceUpdate);
    }
}
