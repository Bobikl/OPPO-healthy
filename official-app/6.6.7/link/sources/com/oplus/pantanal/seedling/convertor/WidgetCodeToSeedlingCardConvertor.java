package com.oplus.pantanal.seedling.convertor;

import com.oplus.pantanal.seedling.bean.SeedlingCard;
import com.oplus.pantanal.seedling.bean.SeedlingCardSizeEnum;
import com.oplus.pantanal.seedling.bean.SeedlingHostEnum;
import com.oplus.pantanal.seedling.bean.SeedlingSubscribeTypeEnum;
import com.oplus.pantanal.seedling.constants.Constants;
import com.oplus.pantanal.seedling.util.ExtsKt;
import com.oplus.pantanal.seedling.util.Logger;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u001c\u0010\b\u001a\u0004\u0018\u00010\u0002*\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002¨\u0006\r"}, d2 = {"Lcom/oplus/pantanal/seedling/convertor/WidgetCodeToSeedlingCardConvertor;", "Lcom/oplus/pantanal/seedling/convertor/IConvertor;", "", "Lcom/oplus/pantanal/seedling/bean/SeedlingCard;", "()V", "from", "data", "to", "getValue", "", "index", "", "Companion", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class WidgetCodeToSeedlingCardConvertor implements IConvertor<String, SeedlingCard> {
    private static final int CARD_CARD_SIZE_INDEX = 5;
    private static final int CARD_ID_INDEX = 0;
    private static final int CARD_INDEX_INDEX = 1;

    @NotNull
    public static final String CARD_PREFIX = "card:";

    @NotNull
    public static final String CARD_SPLIT = "&";
    private static final int CARD_SUBSCRIBE_TYPE_INDEX = 4;
    private static final int ENTRANCE_INDEX = 6;
    private static final int HOST_ID_INDEX = 2;
    private static final int PAGE_ID_INDEX = 7;
    private static final int SERVICE_ID_INDEX = 3;
    public static final int SERVICE_INSTANCE_ID_INDEX = 9;
    private static final int UPK_VERSION_CODE_INDEX = 8;

    private final String getValue(List<String> list, int i) {
        if (i < list.size()) {
            return list.get(i);
        }
        Logger.INSTANCE.i(Constants.TAG, "index = " + i + ",size = " + list.size());
        return null;
    }

    @Override // com.oplus.pantanal.seedling.convertor.IConvertor
    @NotNull
    public SeedlingCard to(@NotNull String data) {
        List<String> listSplit$default;
        String str = data;
        Intrinsics.checkNotNullParameter(str, "data");
        Logger.INSTANCE.i(Constants.TAG, "SeedlingCardId(data) = " + str);
        if (!StringsKt.startsWith$default(str, CARD_PREFIX, false, 2, (Object) null)) {
            str = null;
        }
        if (str != null) {
            String strSubstring = str.substring(5);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            if (strSubstring != null && (listSplit$default = StringsKt.split$default(strSubstring, new String[]{CARD_SPLIT}, false, 0, 6, (Object) null)) != null) {
                String value = getValue(listSplit$default, 3);
                String str2 = value == null ? "" : value;
                String value2 = getValue(listSplit$default, 0);
                int i = value2 != null ? ExtsKt.parseInt(value2) : 0;
                String value3 = getValue(listSplit$default, 1);
                int i2 = value3 != null ? ExtsKt.parseInt(value3) : 0;
                String value4 = getValue(listSplit$default, 2);
                int i3 = value4 != null ? ExtsKt.parseInt(value4) : 0;
                SeedlingHostEnum.Companion companion = SeedlingHostEnum.INSTANCE;
                String value5 = getValue(listSplit$default, 6);
                SeedlingHostEnum seedlingHostEnumCreate = companion.create(value5 != null ? ExtsKt.parseInt(value5) : SeedlingHostEnum.Unknown.getHostId());
                SeedlingSubscribeTypeEnum.Companion companion2 = SeedlingSubscribeTypeEnum.INSTANCE;
                String value6 = getValue(listSplit$default, 4);
                SeedlingSubscribeTypeEnum seedlingSubscribeTypeEnumCreate = companion2.create(value6 != null ? ExtsKt.parseInt(value6) : SeedlingSubscribeTypeEnum.Unknown.getTypeCode());
                SeedlingCardSizeEnum.Companion companion3 = SeedlingCardSizeEnum.INSTANCE;
                String value7 = getValue(listSplit$default, 5);
                SeedlingCardSizeEnum seedlingCardSizeEnumCreate = companion3.create(value7 != null ? ExtsKt.parseInt(value7) : SeedlingCardSizeEnum.Unknown.getSizeCode());
                String value8 = getValue(listSplit$default, 9);
                String str3 = value8 == null ? "" : value8;
                String value9 = getValue(listSplit$default, 7);
                String str4 = value9 == null ? "" : value9;
                String value10 = getValue(listSplit$default, 8);
                return new SeedlingCard(str2, i, i2, i3, seedlingHostEnumCreate, seedlingSubscribeTypeEnumCreate, seedlingCardSizeEnumCreate, str4, value10 != null ? Long.parseLong(value10) : 0L, str3);
            }
        }
        return new SeedlingCard("", 0, 0, 0, SeedlingHostEnum.Unknown, SeedlingSubscribeTypeEnum.Unknown, SeedlingCardSizeEnum.Unknown, "", 0L, "");
    }

    @Override // com.oplus.pantanal.seedling.convertor.IConvertor
    @NotNull
    public String from(@NotNull SeedlingCard data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return ExtsKt.formatSeedlingCard(Integer.valueOf(data.getCardId()), Integer.valueOf(data.getCardIndex()), Integer.valueOf(data.getHostId$seedling_support_manualRelease()), data.getServiceId(), Integer.valueOf(data.getSubscribeType().getTypeCode()), Integer.valueOf(data.getSize().getSizeCode()), Integer.valueOf(data.getHost().getHostId()), data.getPageId(), Long.valueOf(data.getUpkVersionCode()), data.getServiceInstanceId());
    }
}
