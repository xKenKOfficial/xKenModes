package x.KenKOfficial.Modes.Utils;

import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class ChatUtil
{
    private static final /* synthetic */ String[] IIl;
    private static final /* synthetic */ int[] lIl;
    
    private static void IIlIl() {
        (lIl = new int[9])[0] = ((0x8A ^ 0xB2) & ~(0x82 ^ 0xBA));
        ChatUtil.lIl[1] = " ".length();
        ChatUtil.lIl[2] = "  ".length();
        ChatUtil.lIl[3] = "   ".length();
        ChatUtil.lIl[4] = (0x3 ^ 0x39 ^ (0x17 ^ 0x29));
        ChatUtil.lIl[5] = (130 + 101 - 90 + 5 ^ 68 + 51 + 9 + 23);
        ChatUtil.lIl[6] = (0x2B ^ 0x2D);
        ChatUtil.lIl[7] = (0x42 ^ 0x45);
        ChatUtil.lIl[8] = (0x6C ^ 0x64);
    }
    
    private static boolean lIlIl(final int IlIIIlIIlllllll, final int lIIIIlIIlllllll) {
        return IlIIIlIIlllllll < lIIIIlIIlllllll;
    }
    
    static {
        IIlIl();
        llIIl();
    }
    
    private static String IlIIl(final String lIlIllIIlllllll, final String IllIllIIlllllll) {
        try {
            final SecretKeySpec IlIlllIIlllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IllIllIIlllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lIIlllIIlllllll = Cipher.getInstance("Blowfish");
            lIIlllIIlllllll.init(ChatUtil.lIl[2], IlIlllIIlllllll);
            return new String(lIIlllIIlllllll.doFinal(Base64.getDecoder().decode(lIlIllIIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIIlllIIlllllll) {
            IIIlllIIlllllll.printStackTrace();
            return null;
        }
    }
    
    private static String lIIIl(String lllIIIlIlllllll, final String IllIIIlIlllllll) {
        lllIIIlIlllllll = (char)new String(Base64.getDecoder().decode(((String)lllIIIlIlllllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IlIlIIlIlllllll = new StringBuilder();
        final char[] lIIlIIlIlllllll = IllIIIlIlllllll.toCharArray();
        int IIIlIIlIlllllll = ChatUtil.lIl[0];
        final long IlIIIIlIlllllll = (Object)((String)lllIIIlIlllllll).toCharArray();
        final float lIIIIIlIlllllll = IlIIIIlIlllllll.length;
        int IIIIIIlIlllllll = ChatUtil.lIl[0];
        while (lIlIl(IIIIIIlIlllllll, (int)lIIIIIlIlllllll)) {
            final char lIllIIlIlllllll = IlIIIIlIlllllll[IIIIIIlIlllllll];
            IlIlIIlIlllllll.append((char)(lIllIIlIlllllll ^ lIIlIIlIlllllll[IIIlIIlIlllllll % lIIlIIlIlllllll.length]));
            "".length();
            ++IIIlIIlIlllllll;
            ++IIIIIIlIlllllll;
            "".length();
            if (" ".length() > "   ".length()) {
                return null;
            }
        }
        return String.valueOf(IlIlIIlIlllllll);
    }
    
    private static void llIIl() {
        (IIl = new String[ChatUtil.lIl[8]])[ChatUtil.lIl[0]] = IIIIl("fOXMzccrYcM=", "hfMeg");
        ChatUtil.IIl[ChatUtil.lIl[1]] = lIIIl("w5M=", "tIYrN");
        ChatUtil.IIl[ChatUtil.lIl[2]] = IIIIl("R2UJFiajE4Q=", "NNPsD");
        ChatUtil.IIl[ChatUtil.lIl[3]] = lIIIl("w78=", "DHBWc");
        ChatUtil.IIl[ChatUtil.lIl[4]] = lIIIl("fks=", "BwAdl");
        ChatUtil.IIl[ChatUtil.lIl[5]] = IIIIl("CuLlN5xoJyA=", "MSgqw");
        ChatUtil.IIl[ChatUtil.lIl[6]] = IlIIl("7xif2bottmg=", "akLyt");
        ChatUtil.IIl[ChatUtil.lIl[7]] = lIIIl("cw==", "yKUeG");
    }
    
    public static String fixColor(final String lllIlIlIlllllll) {
        return lllIlIlIlllllll.replaceAll(ChatUtil.IIl[ChatUtil.lIl[0]], ChatUtil.IIl[ChatUtil.lIl[1]]).replace(ChatUtil.IIl[ChatUtil.lIl[2]], ChatUtil.IIl[ChatUtil.lIl[3]]).replace(ChatUtil.IIl[ChatUtil.lIl[4]], ChatUtil.IIl[ChatUtil.lIl[5]]).replace(ChatUtil.IIl[ChatUtil.lIl[6]], ChatUtil.IIl[ChatUtil.lIl[7]]);
    }
    
    private static String IIIIl(final String IlIlIlIIlllllll, final String lllIIlIIlllllll) {
        try {
            final SecretKeySpec lIllIlIIlllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIIlIIlllllll.getBytes(StandardCharsets.UTF_8)), ChatUtil.lIl[8]), "DES");
            final Cipher IIllIlIIlllllll = Cipher.getInstance("DES");
            IIllIlIIlllllll.init(ChatUtil.lIl[2], lIllIlIIlllllll);
            return new String(IIllIlIIlllllll.doFinal(Base64.getDecoder().decode(IlIlIlIIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIlIlIIlllllll) {
            llIlIlIIlllllll.printStackTrace();
            return null;
        }
    }
}
