package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.health.wallet.network.bus.rsp.CityCardIotDTO;
import com.heytap.wallet.business.bus.bean.SearchCardBean;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class la2 {
    public static List<SearchCardBean> mIntentCityList = new ArrayList();

    public static void a(String str, List<SearchCardBean> list, List<SearchCardBean> list2) {
        if (list == null || list2 == null) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            SearchCardBean searchCardBean = list.get(i);
            if (searchCardBean != null && searchCardBean.getNfcCardDetail() != null && !TextUtils.isEmpty(searchCardBean.getNfcCardDetail().getAppCode()) && searchCardBean.getNfcCardDetail().getAppCode().contains(str)) {
                list2.add(searchCardBean);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:151:0x021f A[EDGE_INSN: B:151:0x021f->B:118:0x021f BREAK  A[LOOP:8: B:98:0x01b5->B:117:0x021c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:0x021c A[SYNTHETIC] */
    public static void b(String str, List<SearchCardBean> list, List<SearchCardBean> list2) {
        boolean z;
        if (list == null || list2 == null) {
            return;
        }
        String strG = g(str);
        for (int i = 0; i < list.size(); i++) {
            SearchCardBean searchCardBean = list.get(i);
            if (searchCardBean != null) {
                if (searchCardBean.getMatchPin() == null || !searchCardBean.getMatchPin().contains(strG)) {
                    if (drk.e(searchCardBean.getNamePinyinList())) {
                        z = false;
                        break;
                    }
                    int i2 = 0;
                    while (true) {
                        if (i2 >= searchCardBean.getNamePinyinList().size()) {
                            z = false;
                            break;
                        }
                        String str2 = searchCardBean.getNamePinyinList().get(i2);
                        if (!TextUtils.isEmpty(str2) && str2.startsWith(strG)) {
                            if (!list2.contains(searchCardBean)) {
                                list2.add(searchCardBean);
                            }
                            z = true;
                            break;
                        }
                        i2++;
                    }
                    if (!z) {
                        if (!TextUtils.isEmpty(searchCardBean.getNamePinYin()) && searchCardBean.getNamePinYin().contains(strG)) {
                            for (int i3 = 0; i3 < searchCardBean.getNamePinyinList().size(); i3++) {
                                StringBuilder sb = new StringBuilder();
                                for (int i4 = i3; i4 < searchCardBean.getNamePinyinList().size(); i4++) {
                                    sb.append(searchCardBean.getNamePinyinList().get(i4));
                                }
                                if (sb.toString().startsWith(strG)) {
                                    if (!list2.contains(searchCardBean)) {
                                        list2.add(searchCardBean);
                                    }
                                    z = true;
                                }
                            }
                        }
                        if (!z && searchCardBean.getNamePinyinList().size() > 2) {
                            for (int i5 = 0; i5 < searchCardBean.getNamePinyinList().size(); i5++) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(searchCardBean.getNamePinyinList().get(i5));
                                if (i5 < searchCardBean.getNamePinyinList().size() - 2) {
                                    for (int i6 = i5 + 1; i6 < searchCardBean.getMatchPin().length(); i6++) {
                                        sb2.append(searchCardBean.getMatchPin().charAt(i6));
                                        if (sb2.toString().equals(strG)) {
                                            if (!list2.contains(searchCardBean)) {
                                                list2.add(searchCardBean);
                                            }
                                            z = true;
                                            break;
                                        }
                                    }
                                }
                                if (z) {
                                    break;
                                }
                                StringBuilder sb3 = new StringBuilder();
                                for (int i7 = 0; i7 <= i5; i7++) {
                                    sb3.append(searchCardBean.getNamePinyinList().get(i7));
                                }
                                if (i5 < searchCardBean.getNamePinyinList().size() - 2) {
                                    if (searchCardBean.getMatchPin() == null) {
                                        continue;
                                    } else {
                                        for (int i8 = i5 + 1; i8 < searchCardBean.getMatchPin().length(); i8++) {
                                            sb3.append(searchCardBean.getMatchPin().charAt(i8));
                                            if (sb3.toString().equals(strG)) {
                                                if (!list2.contains(searchCardBean)) {
                                                    list2.add(searchCardBean);
                                                }
                                                z = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (z || i5 >= searchCardBean.getNamePinyinList().size() - 2) {
                                    break;
                                }
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(searchCardBean.getNamePinyinList().get(i5));
                                for (int i9 = i5 + 1; i9 < searchCardBean.getNamePinyinList().size(); i9++) {
                                    sb4.append(searchCardBean.getNamePinyinList().get(i9));
                                    StringBuilder sb5 = new StringBuilder();
                                    sb5.append(sb4.toString());
                                    if (i5 < searchCardBean.getNamePinyinList().size() - 2) {
                                        if (searchCardBean.getMatchPin() != null) {
                                            for (int i10 = i9 + 1; i10 < searchCardBean.getMatchPin().length(); i10++) {
                                                sb5.append(searchCardBean.getMatchPin().charAt(i10));
                                                if (sb5.toString().equals(strG)) {
                                                    if (!list2.contains(searchCardBean)) {
                                                        list2.add(searchCardBean);
                                                    }
                                                    z = true;
                                                    break;
                                                }
                                            }
                                            if (z) {
                                                break;
                                                break;
                                            }
                                        } else {
                                            continue;
                                        }
                                    } else {
                                        if (z) {
                                            break;
                                        }
                                    }
                                }
                                if (z) {
                                    break;
                                }
                            }
                        }
                    }
                } else if (!list2.contains(searchCardBean)) {
                    list2.add(searchCardBean);
                }
            }
        }
    }

    public static void c(String str, List<SearchCardBean> list, List<SearchCardBean> list2) {
        if (list == null || list2 == null) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            SearchCardBean searchCardBean = list.get(i);
            if (searchCardBean != null && searchCardBean.getNfcCardDetail() != null && !TextUtils.isEmpty(searchCardBean.getNfcCardDetail().getCardName()) && searchCardBean.getNfcCardDetail().getCardName().contains(str)) {
                list2.add(searchCardBean);
            }
        }
    }

    public static void d(String str, List<CityCardIotDTO> list, List<CityCardIotDTO> list2) {
        boolean z;
        if (list == null || list2 == null) {
            return;
        }
        String strG = g(str);
        for (int i = 0; i < list.size(); i++) {
            CityCardIotDTO cityCardIotDTO = list.get(i);
            if (cityCardIotDTO != null) {
                if (cityCardIotDTO.getMatchPin() == null || !cityCardIotDTO.getMatchPin().contains(strG)) {
                    if (drk.e(cityCardIotDTO.getNamePinyinList())) {
                        z = false;
                        break;
                    }
                    int i2 = 0;
                    while (true) {
                        if (i2 >= cityCardIotDTO.getNamePinyinList().size()) {
                            z = false;
                            break;
                        }
                        String str2 = cityCardIotDTO.getNamePinyinList().get(i2);
                        if (!TextUtils.isEmpty(str2) && str2.startsWith(strG)) {
                            list2.add(cityCardIotDTO);
                            z = true;
                            break;
                        }
                        i2++;
                    }
                    if (!z) {
                        if (!TextUtils.isEmpty(cityCardIotDTO.getFullPin()) && !drk.e(cityCardIotDTO.getNamePinyinList()) && cityCardIotDTO.getFullPin().contains(strG)) {
                            for (int i3 = 0; i3 < cityCardIotDTO.getNamePinyinList().size(); i3++) {
                                StringBuilder sb = new StringBuilder();
                                for (int i4 = i3; i4 < cityCardIotDTO.getNamePinyinList().size(); i4++) {
                                    sb.append(cityCardIotDTO.getNamePinyinList().get(i4));
                                }
                                if (sb.toString().startsWith(strG)) {
                                    list2.add(cityCardIotDTO);
                                    z = true;
                                }
                            }
                        }
                        if (!z && !drk.e(cityCardIotDTO.getNamePinyinList()) && cityCardIotDTO.getNamePinyinList().size() > 2) {
                            for (int i5 = 0; i5 < cityCardIotDTO.getNamePinyinList().size(); i5++) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(cityCardIotDTO.getNamePinyinList().get(i5));
                                if (i5 < cityCardIotDTO.getNamePinyinList().size() - 2) {
                                    if (cityCardIotDTO.getMatchPin() == null) {
                                        continue;
                                    } else {
                                        for (int i6 = i5 + 1; i6 < cityCardIotDTO.getMatchPin().length(); i6++) {
                                            sb2.append(cityCardIotDTO.getMatchPin().charAt(i6));
                                            if (sb2.toString().equals(strG)) {
                                                list2.add(cityCardIotDTO);
                                                z = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (z) {
                                    break;
                                }
                                StringBuilder sb3 = new StringBuilder();
                                for (int i7 = 0; i7 <= i5; i7++) {
                                    sb3.append(cityCardIotDTO.getNamePinyinList().get(i7));
                                }
                                if (i5 < cityCardIotDTO.getNamePinyinList().size() - 2) {
                                    for (int i8 = i5 + 1; i8 < cityCardIotDTO.getMatchPin().length(); i8++) {
                                        if (cityCardIotDTO.getMatchPin() != null) {
                                            sb3.append(cityCardIotDTO.getMatchPin().charAt(i8));
                                            if (sb3.toString().equals(strG)) {
                                                list2.add(cityCardIotDTO);
                                                z = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (z || i5 >= cityCardIotDTO.getNamePinyinList().size() - 2) {
                                    break;
                                }
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(cityCardIotDTO.getNamePinyinList().get(i5));
                                for (int i9 = i5 + 1; i9 < cityCardIotDTO.getNamePinyinList().size(); i9++) {
                                    sb4.append(cityCardIotDTO.getNamePinyinList().get(i9));
                                    StringBuilder sb5 = new StringBuilder();
                                    sb5.append(sb4.toString());
                                    if (i5 < cityCardIotDTO.getNamePinyinList().size() - 2) {
                                        for (int i10 = i9 + 1; i10 < cityCardIotDTO.getMatchPin().length(); i10++) {
                                            sb5.append(cityCardIotDTO.getMatchPin().charAt(i10));
                                            if (sb5.toString().equals(strG)) {
                                                list2.add(cityCardIotDTO);
                                                z = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (z) {
                                        break;
                                    }
                                }
                                if (z) {
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    list2.add(cityCardIotDTO);
                }
            }
        }
    }

    public static void e(String str, List<CityCardIotDTO> list, List<CityCardIotDTO> list2) {
        if (list == null || list2 == null) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            CityCardIotDTO cityCardIotDTO = list.get(i);
            if (cityCardIotDTO != null && !TextUtils.isEmpty(cityCardIotDTO.getCityName()) && cityCardIotDTO.getCityName().contains(str)) {
                list2.add(cityCardIotDTO);
            }
        }
    }

    public static void f(SearchCardBean searchCardBean) {
        if (searchCardBean == null || searchCardBean.getNfcCardDetail() == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        String cardName = searchCardBean.getNfcCardDetail().getCardName();
        if (!TextUtils.isEmpty(cardName)) {
            for (int i = 0; i < cardName.length(); i++) {
                StringBuilder sb3 = new StringBuilder();
                String str = cardName.charAt(i) + "";
                for (int i2 = 0; i2 < str.length(); i2++) {
                    String upperCase = kke.g(String.valueOf(str.charAt(i2)), "").toUpperCase();
                    sb3.append(upperCase);
                    sb2.append(upperCase.charAt(0));
                    sb.append(upperCase);
                }
                if (searchCardBean.getNamePinyinList() != null) {
                    searchCardBean.getNamePinyinList().add(sb3.toString());
                }
            }
            searchCardBean.setNamePinYin(sb.toString());
            searchCardBean.setMatchPin(sb2.toString());
        }
        if (TextUtils.isEmpty(searchCardBean.getNamePinYin())) {
            return;
        }
        String str2 = searchCardBean.getNamePinYin().charAt(0) + "";
        if (wkf.c(str2)) {
            searchCardBean.setPinyinFirst(str2);
        } else {
            searchCardBean.setPinyinFirst("#");
        }
    }

    public static String g(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(kke.g(String.valueOf(str.charAt(i)), "").toUpperCase());
        }
        return sb.toString();
    }
}
