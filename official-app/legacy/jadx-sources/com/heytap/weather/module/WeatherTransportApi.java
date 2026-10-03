package com.heytap.weather.module;

import android.content.Context;
import android.os.RemoteException;
import com.heytap.health.interconnection.weather.UltraVioleBean;
import com.heytap.wearable.watch.weather.IWeatherTransportApi;
import com.heytap.wearable.watch.weather.callback.IWeatherCallBack;
import com.heytap.weather.transceiver.TransceiverManager;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.cm9;
import com.oplus.aiunit.vision.wq8;
import io.protostuff.MapSchema;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.coroutines.AbstractCoroutineContextElement;
import p010kotlin.coroutines.CoroutineContext;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/heytap/weather/module/WeatherTransportApi;", "Lcom/oplus/aiunit/vision/cm9;", "Lcom/heytap/wearable/watch/weather/IWeatherTransportApi;", "f", "Landroid/content/Context;", "context", "", "c", "b", "Lcom/heytap/wearable/watch/weather/IWeatherTransportApi$Stub;", "i", "Lkotlin/Lazy;", MapSchema.FIELD_NAME_ENTRY, "()Lcom/heytap/wearable/watch/weather/IWeatherTransportApi$Stub;", "mBinder", "<init>", "()V", "Companion", "interconnection_impl_release"}, k = 1, mv = {1, 8, 0})
public final class WeatherTransportApi implements cm9<IWeatherTransportApi> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Lazy mBinder = LazyKt__LazyJVMKt.lazy(new Function0<WeatherTransportApi$mBinder$2.AnonymousClass1>() { // from class: com.heytap.weather.module.WeatherTransportApi$mBinder$2

        /* JADX INFO: renamed from: com.heytap.weather.module.WeatherTransportApi$mBinder$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016¨\u0006\n"}, d2 = {"com/heytap/weather/module/WeatherTransportApi$mBinder$2$1", "Lcom/heytap/wearable/watch/weather/IWeatherTransportApi$Stub;", "getUltraVioleData", "", "forceUpdate", "", "callBack", "Lcom/heytap/wearable/watch/weather/callback/IWeatherCallBack;", "sendOobeSync", "syncAfterPermissionGrant", "interconnection_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @SourceDebugExtension({"SMAP\nWeatherTransportApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeatherTransportApi.kt\ncom/heytap/weather/module/WeatherTransportApi$mBinder$2$1\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,120:1\n48#2,4:121\n*S KotlinDebug\n*F\n+ 1 WeatherTransportApi.kt\ncom/heytap/weather/module/WeatherTransportApi$mBinder$2$1\n*L\n101#1:121,4\n*E\n"})
        public static final class AnonymousClass1 extends IWeatherTransportApi.Stub {

            /* JADX INFO: renamed from: com.heytap.weather.module.WeatherTransportApi$mBinder$2$1$a */
            @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 WeatherTransportApi.kt\ncom/heytap/weather/module/WeatherTransportApi$mBinder$2$1\n*L\n1#1,110:1\n102#2,3:111\n*E\n"})
            public static final class a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
                public final /* synthetic */ IWeatherCallBack i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(CoroutineExceptionHandler.Companion companion, IWeatherCallBack iWeatherCallBack) {
                    super(companion);
                    this.i = iWeatherCallBack;
                }

                @Override // kotlinx.coroutines.CoroutineExceptionHandler
                public void handleException(@NotNull CoroutineContext context, @NotNull Throwable exception) throws RemoteException {
                    a7b.f("HtWeather_TransportApi", "getUltraVioleData error " + exception.getMessage());
                    IWeatherCallBack iWeatherCallBack = this.i;
                    if (iWeatherCallBack != null) {
                        iWeatherCallBack.onCallBack(-1, null);
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void sendOobeSync$lambda$0() {
                TransceiverManager.INSTANCE.D();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void syncAfterPermissionGrant$lambda$1() {
                TransceiverManager.INSTANCE.D();
            }

            @Override // com.heytap.wearable.watch.weather.IWeatherTransportApi
            public void getUltraVioleData(boolean forceUpdate, @Nullable IWeatherCallBack callBack) {
                StringBuilder sb = new StringBuilder();
                sb.append("getUltraVioleData forceUpdate ");
                sb.append(forceUpdate);
                sb.append(" callBack ");
                sb.append(callBack);
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(wq8.INSTANCE.b(WeatherModule.TAG_ROOT)), new a(CoroutineExceptionHandler.INSTANCE, callBack), null, new WeatherTransportApi$mBinder$2$1$getUltraVioleData$2(forceUpdate, callBack, null), 2, null);
            }

            @Override // com.heytap.wearable.watch.weather.IWeatherTransportApi
            public void sendOobeSync() {
                WeatherModule.INSTANCE.d(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0007: INVOKE 
                      (wrap com.heytap.weather.module.WeatherModule:0x0000: SGET  A[WRAPPED] com.heytap.weather.module.WeatherModule.INSTANCE com.heytap.weather.module.WeatherModule)
                      (wrap java.lang.Runnable:0x0004: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: com.oplus.aiunit.vision.dml.<init>():void type: CONSTRUCTOR)
                     VIRTUAL call: com.heytap.weather.module.WeatherModule.d(java.lang.Runnable):void A[MD:(java.lang.Runnable):void (m)] in method: com.heytap.weather.module.WeatherTransportApi$mBinder$2.1.sendOobeSync():void, file: classes3.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.oplus.aiunit.vision.dml, state: NOT_LOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                    	... 15 more
                    */
                /*
                    this = this;
                    com.heytap.weather.module.WeatherModule r1 = com.heytap.weather.module.WeatherModule.INSTANCE
                    com.oplus.aiunit.vision.dml r0 = new com.oplus.aiunit.vision.dml
                    r0.<init>()
                    r1.d(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.heytap.weather.module.WeatherTransportApi$mBinder$2.AnonymousClass1.sendOobeSync():void");
            }

            @Override // com.heytap.wearable.watch.weather.IWeatherTransportApi
            public void syncAfterPermissionGrant() {
                WeatherModule.INSTANCE.d(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0007: INVOKE 
                      (wrap com.heytap.weather.module.WeatherModule:0x0000: SGET  A[WRAPPED] com.heytap.weather.module.WeatherModule.INSTANCE com.heytap.weather.module.WeatherModule)
                      (wrap java.lang.Runnable:0x0004: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: com.oplus.aiunit.vision.eml.<init>():void type: CONSTRUCTOR)
                     VIRTUAL call: com.heytap.weather.module.WeatherModule.d(java.lang.Runnable):void A[MD:(java.lang.Runnable):void (m)] in method: com.heytap.weather.module.WeatherTransportApi$mBinder$2.1.syncAfterPermissionGrant():void, file: classes3.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.oplus.aiunit.vision.eml, state: NOT_LOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                    	... 15 more
                    */
                /*
                    this = this;
                    com.heytap.weather.module.WeatherModule r1 = com.heytap.weather.module.WeatherModule.INSTANCE
                    com.oplus.aiunit.vision.eml r0 = new com.oplus.aiunit.vision.eml
                    r0.<init>()
                    r1.d(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.heytap.weather.module.WeatherTransportApi$mBinder$2.AnonymousClass1.syncAfterPermissionGrant():void");
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final AnonymousClass1 invoke() {
            return new AnonymousClass1();
        }
    });

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\"\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u0007R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/heytap/weather/module/WeatherTransportApi$Companion;", "", "", "b", "c", "", "forceUpdate", "Lkotlin/Function1;", "Lcom/heytap/health/interconnection/weather/UltraVioleBean;", "ultraVioleBean", "a", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "interconnection_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(boolean forceUpdate, @NotNull Function1<? super UltraVioleBean, Unit> ultraVioleBean) {
            Intrinsics.checkNotNullParameter(ultraVioleBean, "ultraVioleBean");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(wq8.INSTANCE.e()), null, null, new WeatherTransportApi$Companion$getUltraVioleData$1(forceUpdate, ultraVioleBean, null), 3, null);
        }

        public final void b() {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(wq8.INSTANCE.e()), null, null, new WeatherTransportApi$Companion$sendOobeSync$1(null), 3, null);
        }

        public final void c() {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(wq8.INSTANCE.e()), null, null, new WeatherTransportApi$Companion$syncAfterPermissionGrant$1(null), 3, null);
        }
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final IWeatherTransportApi.Stub e() {
        return (IWeatherTransportApi.Stub) this.mBinder.getValue();
    }

    @Override // com.oplus.aiunit.vision.cm9
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public IWeatherTransportApi d() {
        return e();
    }
}
