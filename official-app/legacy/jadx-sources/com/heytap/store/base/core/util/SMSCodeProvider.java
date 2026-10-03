package com.heytap.store.base.core.util;

import android.telephony.SmsMessage;
import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class SMSCodeProvider {
    public static final Pattern SMSMachineUnicom = Pattern.compile("^[106550200389]{12}[0-9]{2}$");
    public static final Pattern SMSMachineMobile = Pattern.compile("^[1065755553502]{12}[0-9]{2}$");

    public static String getSMSCode(SmsMessage smsMessage, int i) {
        try {
            return paramSMS(smsMessage, i);
        } catch (Exception unused) {
            return "";
        }
    }

    private static String paramSMS(SmsMessage smsMessage) throws Exception {
        StringBuilder sb = new StringBuilder();
        String displayMessageBody = smsMessage.getDisplayMessageBody();
        char cCharValue = new Character((char) 65306).charValue();
        for (int i = 0; i < displayMessageBody.length(); i++) {
            if (displayMessageBody.charAt(i) == cCharValue) {
                int i2 = i + 1;
                if (Character.isDigit(displayMessageBody.charAt(i2))) {
                    int i3 = i + 2;
                    if (Character.isDigit(displayMessageBody.charAt(i3))) {
                        int i4 = i + 3;
                        if (Character.isDigit(displayMessageBody.charAt(i4))) {
                            int i5 = i + 4;
                            if (Character.isDigit(displayMessageBody.charAt(i5))) {
                                sb.append(displayMessageBody.charAt(i2));
                                sb.append(displayMessageBody.charAt(i3));
                                sb.append(displayMessageBody.charAt(i4));
                                sb.append(displayMessageBody.charAt(i5));
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
        return sb.toString();
    }

    public static String getSMSCode(SmsMessage smsMessage) {
        try {
            return getSMSCode(smsMessage, 4);
        } catch (Exception unused) {
            return "";
        }
    }

    public static String getSMSCode(String str) {
        try {
            return paramSMS(str);
        } catch (Exception unused) {
            return "";
        }
    }

    private static String paramSMS(SmsMessage smsMessage, int i) throws Exception {
        String strGroup = "";
        if (smsMessage == null) {
            return "";
        }
        String displayMessageBody = smsMessage.getDisplayMessageBody();
        if (TextUtils.isEmpty(displayMessageBody)) {
            return "";
        }
        Matcher matcher = Pattern.compile("[0-9\\.]+").matcher(displayMessageBody);
        while (matcher.find()) {
            if (matcher.group().length() == i) {
                strGroup = matcher.group();
            }
        }
        return strGroup;
    }

    private static String paramSMS(String str) throws Exception {
        StringBuilder sb = new StringBuilder();
        char cCharValue = new Character((char) 65306).charValue();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == cCharValue) {
                int i2 = i + 1;
                if (Character.isDigit(str.charAt(i2))) {
                    int i3 = i + 2;
                    if (Character.isDigit(str.charAt(i3))) {
                        int i4 = i + 3;
                        if (Character.isDigit(str.charAt(i4))) {
                            int i5 = i + 4;
                            if (Character.isDigit(str.charAt(i5))) {
                                sb.append(str.charAt(i2));
                                sb.append(str.charAt(i3));
                                sb.append(str.charAt(i4));
                                sb.append(str.charAt(i5));
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
        return sb.toString();
    }
}
