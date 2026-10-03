package com.example.opponotificationrelay;

import java.io.*;
import java.nio.charset.StandardCharsets;

/** 有界匿名管道：结果和结束标记完整到达即可返回，不等待su的EOF。 */
public final class SettingsPreviewProtocol {
    public static final String PREFIX="SETTINGSPREVIEW1 RESULT ",END="SETTINGSPREVIEW1 END";
    public static final int MAX_LINE=1200000,MAX_TOTAL=1500000;
    private SettingsPreviewProtocol(){}
    public static String read(InputStream input) throws IOException {
        BufferedInputStream in=new BufferedInputStream(input);
        ByteArrayOutputStream line=new ByteArrayOutputStream();
        String result=null;int total=0,b;
        while((b=in.read())!=-1) {
            if(++total>MAX_TOTAL) throw new IOException("OUTPUT_LIMIT");
            if(b!='\n') {if(line.size()>=MAX_LINE)throw new IOException("LINE_LIMIT");line.write(b);continue;}
            String s=new String(line.toByteArray(),StandardCharsets.UTF_8);line.reset();
            if(s.endsWith("\r"))s=s.substring(0,s.length()-1);
            if(s.startsWith(PREFIX)) {
                if(result!=null)throw new IOException("DUPLICATE_RESULT");
                result=s.substring(PREFIX.length());
            } else if(END.equals(s)) {
                if(result==null)throw new IOException("MISSING_RESULT");return result;
            }
        }
        throw new IOException("INCOMPLETE_RESULT");
    }
    public static String quote(String value) {
        if(value==null || value.indexOf('\0')>=0 || value.indexOf('\n')>=0 || value.indexOf('\r')>=0)
            throw new IllegalArgumentException("COMMAND_ARGUMENT");
        return "'"+value.replace("'","'\\''")+"'";
    }
}
