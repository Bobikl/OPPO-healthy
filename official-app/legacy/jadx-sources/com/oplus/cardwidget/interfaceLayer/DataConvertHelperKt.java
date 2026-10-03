package com.oplus.cardwidget.interfaceLayer;

import android.os.Bundle;
import android.util.Base64;
import androidx.exifinterface.media.ExifInterface;
import com.google.protobuf.AbstractMessage;
import com.heytap.store.business.rn.service.RnConstant;
import com.oplus.aiunit.vision.CardAction;
import com.oplus.aiunit.vision.hc3;
import com.oplus.cardwidget.domain.pack.BaseDataPack;
import com.oplus.cardwidget.proto.CardActionProto;
import com.oplus.cardwidget.proto.UIDataProto;
import com.oplus.cardwidget.util.CardDataTranslaterKt;
import com.oplus.cardwidget.util.Logger;
import com.oplus.channel.client.ClientProxy;
import com.oplus.channel.client.data.DataConverterUtilKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.Charsets;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0000*\u00020\u0006H\u0000\u001a \u0010\n\u001a\u00020\u0006\"\n\b\u0000\u0010\t\u0018\u0001*\u00020\b*\u00028\u0000H\u0080\b¢\u0006\u0004\b\n\u0010\u000b\u001a\f\u0010\r\u001a\u00020\f*\u00020\u0006H\u0000\u001a\f\u0010\u000e\u001a\u00020\u0006*\u00020\fH\u0000\u001a\u000e\u0010\u000f\u001a\u0004\u0018\u00010\f*\u00020\u0006H\u0000\u001a\f\u0010\u0011\u001a\u00020\u0010*\u00020\fH\u0000\u001a\f\u0010\u0012\u001a\u00020\u0010*\u00020\fH\u0000\u001a\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0006H\u0000¨\u0006\u0016"}, d2 = {"Lcom/oplus/cardwidget/proto/CardActionProto;", "Lcom/oplus/aiunit/vision/bbm;", "toCardAction", "Landroid/os/Bundle;", "Lcom/oplus/cardwidget/proto/UIDataProto;", "packUiData", "", "getCardActionProto", "Lcom/google/protobuf/AbstractMessage;", ExifInterface.GPS_DIRECTION_TRUE, "changeToPBData", "(Lcom/google/protobuf/AbstractMessage;)[B", "", "convertToString", "convertToByteArray", "checkIsEffectJsonData", "", "checkIsJsonString", "isEffectLayoutName", RnConstant.KEY_INIT_OPTIONS, "Lcom/oplus/channel/client/ClientProxy$ActionIdentify;", "genRequestActionIdentify", "com.oplus.card.widget.cardwidget"}, k = 2, mv = {1, 8, 0})
public final class DataConvertHelperKt {
    public static final /* synthetic */ <T extends AbstractMessage> byte[] changeToPBData(T t) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        byte[] byteArray = t.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "this.toByteArray()");
        return byteArray;
    }

    @Nullable
    public static final String checkIsEffectJsonData(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        String str = new String(bArr, Charsets.UTF_8);
        if (checkIsJsonString(str)) {
            return str;
        }
        return null;
    }

    public static final boolean checkIsJsonString(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            new JSONObject(str);
            return true;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(Result.m5287constructorimpl(ResultKt.createFailure(th)));
            if (thM5290exceptionOrNullimpl == null) {
                return false;
            }
            Logger.INSTANCE.e("DataConvertHelper", "checkIsEffectJsonData has error e:" + thM5290exceptionOrNullimpl.getMessage());
            return false;
        }
    }

    @NotNull
    public static final byte[] convertToByteArray(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        byte[] bArrDecode = Base64.decode(bytes, 0);
        Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(this.toByteArray(), Base64.DEFAULT)");
        return bArrDecode;
    }

    @NotNull
    public static final String convertToString(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        byte[] bArrEncode = Base64.encode(bArr, 0);
        Intrinsics.checkNotNullExpressionValue(bArrEncode, "encode(this, Base64.DEFAULT)");
        return new String(bArrEncode, Charsets.UTF_8);
    }

    @NotNull
    public static final ClientProxy.ActionIdentify genRequestActionIdentify(@NotNull byte[] param) {
        Intrinsics.checkNotNullParameter(param, "param");
        CardActionProto cardActionProto = CardActionProto.parseFrom(param);
        String strValueOf = String.valueOf(cardActionProto.getCardType());
        String strValueOf2 = String.valueOf(cardActionProto.getCardId());
        String strValueOf3 = String.valueOf(cardActionProto.getHostId());
        Intrinsics.checkNotNullExpressionValue(cardActionProto, "cardActionProto");
        return new ClientProxy.ActionIdentify(strValueOf, strValueOf2, strValueOf3, DataConverterUtilKt.getLifeCircleAction(cardActionProto));
    }

    @NotNull
    public static final CardActionProto getCardActionProto(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        CardActionProto from = CardActionProto.parseFrom(bArr);
        Intrinsics.checkNotNullExpressionValue(from, "parseFrom(this)");
        return from;
    }

    public static final boolean isEffectLayoutName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return StringsKt__StringsJVMKt.endsWith$default(str, hc3.CLASSIC_CONFIG_SUFFIX, false, 2, null) & (str.length() > 0);
    }

    @NotNull
    public static final UIDataProto packUiData(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        UIDataProto.Builder builderNewBuilder = UIDataProto.newBuilder();
        String string = bundle.getString("widget_code");
        if (string != null) {
            builderNewBuilder.setCardId(CardDataTranslaterKt.getIdByWidgetCode(string));
        }
        String string2 = bundle.getString("data");
        if (string2 != null) {
            builderNewBuilder.setData(string2);
        }
        String string3 = bundle.getString("name");
        if (string3 != null) {
            builderNewBuilder.setName(string3);
        }
        builderNewBuilder.setVersion(bundle.getLong("version"));
        builderNewBuilder.setCompress(UIDataProto.DataCompress.forNumber(bundle.getInt(BaseDataPack.KEY_DATA_COMPRESS)));
        builderNewBuilder.setForceChangeCardUI(bundle.getBoolean(BaseDataPack.KEY_FORCE_CHANGE_UI));
        String string4 = bundle.getString(BaseDataPack.KEY_LAYOUT_NAME);
        if (string4 != null) {
            builderNewBuilder.setLayoutName(string4);
        }
        String string5 = bundle.getString(BaseDataPack.KEY_EXTRA_MSG);
        if (string5 != null) {
            builderNewBuilder.setExtraMsg(string5);
        }
        UIDataProto uIDataProtoBuild = builderNewBuilder.build();
        Intrinsics.checkNotNullExpressionValue(uIDataProtoBuild, "builder.build()");
        return uIDataProtoBuild;
    }

    @NotNull
    public static final CardAction toCardAction(@NotNull CardActionProto cardActionProto) {
        Intrinsics.checkNotNullParameter(cardActionProto, "<this>");
        return new CardAction(CardDataTranslaterKt.getWidgetId(cardActionProto.getCardType(), cardActionProto.getCardId(), cardActionProto.getHostId()), cardActionProto.getAction(), cardActionProto.getParamMap());
    }
}
