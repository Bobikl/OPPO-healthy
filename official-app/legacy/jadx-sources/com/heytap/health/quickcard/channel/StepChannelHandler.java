package com.heytap.health.quickcard.channel;

import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.Keep;
import com.heytap.health.quickcard.StepDataProcess;
import com.heytap.health.quickcard.data.AppResultBean;
import com.heytap.health.quickcard.data.QuickAppMsgBean;
import com.heytap.speech.engine.constant.EngineConstant;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.sc8;
import org.hapjs.features.channel.ChannelMessage;
import org.hapjs.features.channel.HapChannelManager;
import org.hapjs.features.channel.IHapChannel;
import org.hapjs.features.channel.appinfo.HapApplication;
import org.hapjs.features.channel.listener.EventCallBack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\r\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u001c\u0010\u0010\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J$\u0010\u0014\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0016J$\u0010\u0017\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u001c"}, d2 = {"Lcom/heytap/health/quickcard/channel/StepChannelHandler;", "Lorg/hapjs/features/channel/HapChannelManager$ChannelHandler;", "", "jsType", "data", "Lorg/hapjs/features/channel/IHapChannel;", "channel", "", "sendMsg", "Lorg/hapjs/features/channel/appinfo/HapApplication;", "hapApplication", "", "accept", "onOpen", "Lorg/hapjs/features/channel/ChannelMessage;", "message", "onReceiveMessage", "", "code", EngineConstant.REASON, "onClose", "errorCode", "errorMessage", "onError", "<init>", "()V", "Companion", "a", "quickcard_release"}, k = 1, mv = {1, 8, 0})
public final class StepChannelHandler implements HapChannelManager.ChannelHandler {

    @NotNull
    public static final String QUICK_APP_DEBUG_SIGNATURE = "c8f1c0730fabd39b5d6b27a18f4bbfb9686da8359954f1a3815ce69b29d3d50e";

    @NotNull
    public static final String QUICK_APP_PKG_NAME = "com.heytap.health.quickapp";

    @NotNull
    public static final String QUICK_APP_SIGNATURE = "4e8e1ee24968b0dad6d0956a7e14d848b38b22a203f39c389a45d8737bdc4585";

    @NotNull
    public static final String TAG = "ChannelHandler";

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, d2 = {"com/heytap/health/quickcard/channel/StepChannelHandler$b", "Lorg/hapjs/features/channel/listener/EventCallBack;", "", "onSuccess", "onFail", "quickcard_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements EventCallBack {
        public final /* synthetic */ IHapChannel a;

        public b(IHapChannel iHapChannel) {
            this.a = iHapChannel;
        }

        @Override // org.hapjs.features.channel.listener.EventCallBack
        public void onFail() {
            a7b.f(StepChannelHandler.TAG, "send msg onFail :" + this.a.getStatus());
        }

        @Override // org.hapjs.features.channel.listener.EventCallBack
        public void onSuccess() {
            a7b.f(StepChannelHandler.TAG, "send msg onSuccess");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendMsg(String jsType, String data, IHapChannel channel) {
        a7b.f(TAG, "sendMsg");
        if (channel.getStatus() != 2) {
            a7b.f(TAG, "sendMsg fail! channel status error :" + channel.getStatus());
            return;
        }
        a7b.f(TAG, "data:" + data);
        AppResultBean appResultBean = new AppResultBean();
        appResultBean.setType(jsType);
        appResultBean.setData(new AppResultBean.ResultBean(0, null, data, 3, null));
        String strG = sc8.g(appResultBean);
        StringBuilder sb = new StringBuilder();
        sb.append("jsonData:");
        sb.append(strG);
        ChannelMessage channelMessage = new ChannelMessage();
        channelMessage.code = 1;
        channelMessage.setData(strG);
        channel.send(channelMessage, new b(channel));
    }

    @Override // org.hapjs.features.channel.HapChannelManager.ChannelHandler
    public boolean accept(@Nullable HapApplication hapApplication) {
        if (hapApplication != null) {
            String str = hapApplication.mPkgName;
            StringBuilder sb = new StringBuilder();
            sb.append("mPkgName:");
            sb.append(str);
            String str2 = hapApplication.mSignature;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("mSignature:");
            sb2.append(str2);
            if (!TextUtils.equals(hapApplication.mPkgName, QUICK_APP_PKG_NAME)) {
                a7b.f(TAG, "pkg name verification failed");
                return false;
            }
            if (TextUtils.equals(hapApplication.mSignature, QUICK_APP_SIGNATURE) || TextUtils.equals(hapApplication.mSignature, QUICK_APP_DEBUG_SIGNATURE)) {
                a7b.f(TAG, "verification success!");
                return true;
            }
        }
        a7b.f(TAG, "verification failed");
        return false;
    }

    @Override // org.hapjs.features.channel.HapChannelManager.ChannelHandler
    public void onClose(@Nullable IHapChannel channel, int code, @Nullable String reason) {
        a7b.f(TAG, "onClose status:" + (channel != null ? Integer.valueOf(channel.getStatus()) : null));
    }

    @Override // org.hapjs.features.channel.HapChannelManager.ChannelHandler
    public void onError(@Nullable IHapChannel channel, int errorCode, @Nullable String errorMessage) {
        a7b.f(TAG, "onError, status:" + (channel != null ? Integer.valueOf(channel.getStatus()) : null));
    }

    @Override // org.hapjs.features.channel.HapChannelManager.ChannelHandler
    public void onOpen(@Nullable IHapChannel channel) {
        a7b.f(TAG, "onOpen status:" + (channel != null ? Integer.valueOf(channel.getStatus()) : null));
    }

    @Override // org.hapjs.features.channel.HapChannelManager.ChannelHandler
    public void onReceiveMessage(@Nullable final IHapChannel channel, @Nullable ChannelMessage message) {
        String textData;
        if (channel == null || message == null) {
            a7b.f(TAG, "channel or message is null");
            return;
        }
        if (message.getData() instanceof byte[]) {
            Object data = message.getData();
            Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.ByteArray");
            textData = Base64.encodeToString((byte[]) data, 2);
        } else {
            textData = message.getData().toString();
        }
        a7b.f(TAG, "onReceiveMessage, code:" + message.code + ", data:" + textData);
        final QuickAppMsgBean quickAppMsgBean = (QuickAppMsgBean) sc8.a(textData, QuickAppMsgBean.class);
        if (quickAppMsgBean == null) {
            a7b.f(TAG, "quickAppMsgBean is null");
            return;
        }
        String appFunctionName = quickAppMsgBean.getAppFunctionName();
        if (Intrinsics.areEqual(appFunctionName, QuickAppMsgBean.AppFunctionName.GET_STEP_MONTH_DATA)) {
            StepDataProcess.INSTANCE.a().e(new Function1<String, Unit>() { // from class: com.heytap.health.quickcard.channel.StepChannelHandler.onReceiveMessage.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p010kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull String it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    StepChannelHandler.this.sendMsg(quickAppMsgBean.getType(), it, channel);
                }
            });
            return;
        }
        if (Intrinsics.areEqual(appFunctionName, QuickAppMsgBean.AppFunctionName.UPDATE_STEPS_GOAL)) {
            try {
                Intrinsics.checkNotNullExpressionValue(textData, "textData");
                StepDataProcess.INSTANCE.a().f(Integer.parseInt(textData), new Function1<Boolean, Unit>() { // from class: com.heytap.health.quickcard.channel.StepChannelHandler.onReceiveMessage.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p010kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                        invoke(bool.booleanValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(boolean z) {
                        StepChannelHandler.this.sendMsg(quickAppMsgBean.getType(), String.valueOf(z), channel);
                    }
                });
            } catch (Exception e2) {
                a7b.f(TAG, "setStepGoal error:" + e2.getMessage());
            }
        }
    }
}
