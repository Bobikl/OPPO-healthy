package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.oplus.aiunit.vision.eug;
import com.oplus.aiunit.vision.wdk;
import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;

/* JADX INFO: loaded from: classes13.dex */
public class InetSocketAddressSerializer extends StdScalarSerializer<InetSocketAddress> {
    public InetSocketAddressSerializer() {
        super(InetSocketAddress.class);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.oplus.aiunit.vision.yla
    public void serialize(InetSocketAddress inetSocketAddress, JsonGenerator jsonGenerator, eug eugVar) throws IOException {
        String strSubstring;
        InetAddress address = inetSocketAddress.getAddress();
        String hostName = address == null ? inetSocketAddress.getHostName() : address.toString().trim();
        int iIndexOf = hostName.indexOf(47);
        if (iIndexOf >= 0) {
            if (iIndexOf == 0) {
                if (address instanceof Inet6Address) {
                    strSubstring = "[" + hostName.substring(1) + "]";
                } else {
                    strSubstring = hostName.substring(1);
                }
                hostName = strSubstring;
            } else {
                hostName = hostName.substring(0, iIndexOf);
            }
        }
        jsonGenerator.t0(hostName + ":" + inetSocketAddress.getPort());
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.oplus.aiunit.vision.yla
    public void serializeWithType(InetSocketAddress inetSocketAddress, JsonGenerator jsonGenerator, eug eugVar, wdk wdkVar) throws IOException {
        WritableTypeId writableTypeIdG = wdkVar.g(jsonGenerator, wdkVar.f(inetSocketAddress, InetSocketAddress.class, JsonToken.VALUE_STRING));
        serialize(inetSocketAddress, jsonGenerator, eugVar);
        wdkVar.h(jsonGenerator, writableTypeIdG);
    }
}
