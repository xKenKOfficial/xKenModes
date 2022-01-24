package x.KenKOfficial.Modes.Listeners;

import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import org.bukkit.event.player.*;
import x.KenKOfficial.Modes.Main.*;
import x.KenKOfficial.Modes.Utils.*;
import org.bukkit.entity.*;
import org.bukkit.event.*;
import java.util.*;

public class PlayerJoin implements Listener
{
    private static final /* synthetic */ int[] lll;
    private static final /* synthetic */ String[] Ill;
    
    private static boolean llIll(final int lIlllIllIllllll) {
        return lIlllIllIllllll == 0;
    }
    
    private static void lIIll() {
        (Ill = new String[PlayerJoin.lll[13]])[PlayerJoin.lll[0]] = IllIl("GBofDysGKQMGJAc=", "hvjhB");
        PlayerJoin.Ill[PlayerJoin.lll[1]] = lllIl("6mdvHa/vTuMj2I/dptsBH9fCOAN6Zhas", "ygFwF");
        PlayerJoin.Ill[PlayerJoin.lll[2]] = lllIl("1wQ10l6RC9+p8n5Otued0kCWBfbKeL1NQoHYk8FX5C/3NozvfdE29XrQI44ahsT8", "iDilh");
        PlayerJoin.Ill[PlayerJoin.lll[3]] = lllIl("h1JBjabpuRU=", "QNzGL");
        PlayerJoin.Ill[PlayerJoin.lll[4]] = lllIl("vzjT1ooUVO4fOkm6n5H0oAEfAQDlx6QW", "eYgsI");
        PlayerJoin.Ill[PlayerJoin.lll[5]] = IIIll("JstchfM1Xp4=", "zdZkP");
        PlayerJoin.Ill[PlayerJoin.lll[6]] = lllIl("CyEBeC/O+hE0V248/blxDHvrpbUQcDRUMLfXMIsiZdk=", "myylR");
        PlayerJoin.Ill[PlayerJoin.lll[7]] = IIIll("+SZ53nVr4Fg=", "HEyfX");
        PlayerJoin.Ill[PlayerJoin.lll[8]] = IIIll("jd0//GV46yVZ83QoQv/NhSFjc1Gqz4iyKhLNAv7mBwOiGUehd97tWIExXVtrfmxw", "mVWaa");
        PlayerJoin.Ill[PlayerJoin.lll[9]] = IllIl("", "LwDJg");
        PlayerJoin.Ill[PlayerJoin.lll[10]] = IIIll("iD3KsMjq3fdG2SvRHkQBos4ys0Rjigt0VrVJrz/DpIgthB1sJTmtPzEDFNR8d+ZR", "faKPh");
        PlayerJoin.Ill[PlayerJoin.lll[11]] = IIIll("Zld14GlmzxU=", "hfMsy");
        PlayerJoin.Ill[PlayerJoin.lll[12]] = IllIl("QEhpFUdbTXJER1tNckQhQENpFQItFSE0FQIVPF9CQBwSREdbTXJER1tNcg==", "fpOyz");
    }
    
    private static void IlIll() {
        (lll = new int[14])[0] = ((0x9C ^ 0xA3) & ~(0x7B ^ 0x44));
        PlayerJoin.lll[1] = " ".length();
        PlayerJoin.lll[2] = "  ".length();
        PlayerJoin.lll[3] = "   ".length();
        PlayerJoin.lll[4] = (170 + 28 - 14 + 8 ^ 143 + 62 - 146 + 137);
        PlayerJoin.lll[5] = (125 + 100 - 201 + 139 ^ 105 + 78 - 120 + 103);
        PlayerJoin.lll[6] = (0x7A ^ 0x7C);
        PlayerJoin.lll[7] = (0xC3 ^ 0xC4);
        PlayerJoin.lll[8] = (0x18 ^ 0x10);
        PlayerJoin.lll[9] = (0x33 ^ 0x3A);
        PlayerJoin.lll[10] = (0x77 ^ 0x7D);
        PlayerJoin.lll[11] = (0x7A ^ 0x6B ^ (0x2B ^ 0x31));
        PlayerJoin.lll[12] = (77 + 95 - 107 + 76 ^ 33 + 51 + 35 + 10);
        PlayerJoin.lll[13] = (20 + 50 + 74 + 14 ^ 117 + 15 - 94 + 109);
    }
    
    static {
        IlIll();
        lIIll();
    }
    
    private static String IIIll(final String lIllIIIIlllllll, final String IIllIIIIlllllll) {
        try {
            final SecretKeySpec IlIIlIIIlllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IIllIIIIlllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lIIIlIIIlllllll = Cipher.getInstance("Blowfish");
            lIIIlIIIlllllll.init(PlayerJoin.lll[2], IlIIlIIIlllllll);
            return new String(lIIIlIIIlllllll.doFinal(Base64.getDecoder().decode(lIllIIIIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIIIlIIIlllllll) {
            IIIIlIIIlllllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlll(final int IlIIIlllIllllll, final int lIIIIlllIllllll) {
        return IlIIIlllIllllll < lIIIIlllIllllll;
    }
    
    @EventHandler
    public void onJoin(final PlayerJoinEvent IlIllIIIlllllll) {
        final Player lIIllIIIlllllll = IlIllIIIlllllll.getPlayer();
        if (llIll(Main.getPlugin().getConfig().getBoolean(PlayerJoin.Ill[PlayerJoin.lll[0]]) ? 1 : 0) && IIlll(lIIllIIIlllllll.hasPermission(PlayerJoin.Ill[PlayerJoin.lll[1]]) ? 1 : 0)) {
            lIIllIIIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.Ill[PlayerJoin.lll[2]]));
            lIIllIIIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.Ill[PlayerJoin.lll[3]]));
            lIIllIIIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.Ill[PlayerJoin.lll[4]]));
            lIIllIIIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.Ill[PlayerJoin.lll[5]]));
            lIIllIIIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.Ill[PlayerJoin.lll[6]]));
            lIIllIIIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.Ill[PlayerJoin.lll[7]]));
            lIIllIIIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.Ill[PlayerJoin.lll[8]]));
            lIIllIIIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.Ill[PlayerJoin.lll[9]]));
            lIIllIIIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.Ill[PlayerJoin.lll[10]]));
            lIIllIIIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.Ill[PlayerJoin.lll[11]]));
            lIIllIIIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.Ill[PlayerJoin.lll[12]]));
        }
    }
    
    private static String IllIl(String lIllIlllIllllll, final String IIllIlllIllllll) {
        lIllIlllIllllll = (double)new String(Base64.getDecoder().decode(((String)lIllIlllIllllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IIIIllllIllllll = new StringBuilder();
        final char[] llllIlllIllllll = IIllIlllIllllll.toCharArray();
        int IlllIlllIllllll = PlayerJoin.lll[0];
        final float IIIlIlllIllllll = (Object)((String)lIllIlllIllllll).toCharArray();
        final long lllIIlllIllllll = IIIlIlllIllllll.length;
        byte IllIIlllIllllll = (byte)PlayerJoin.lll[0];
        while (lIlll(IllIIlllIllllll, (int)lllIIlllIllllll)) {
            final char llIIllllIllllll = IIIlIlllIllllll[IllIIlllIllllll];
            IIIIllllIllllll.append((char)(llIIllllIllllll ^ llllIlllIllllll[IlllIlllIllllll % llllIlllIllllll.length]));
            "".length();
            ++IlllIlllIllllll;
            ++IllIIlllIllllll;
            "".length();
            if (-"  ".length() >= 0) {
                return null;
            }
        }
        return String.valueOf(IIIIllllIllllll);
    }
    
    private static String lllIl(final String IIIIIIIIlllllll, final String lIIIIIIIlllllll) {
        try {
            final SecretKeySpec lIlIIIIIlllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIIIIIlllllll.getBytes(StandardCharsets.UTF_8)), PlayerJoin.lll[8]), "DES");
            final Cipher IIlIIIIIlllllll = Cipher.getInstance("DES");
            IIlIIIIIlllllll.init(PlayerJoin.lll[2], lIlIIIIIlllllll);
            return new String(IIlIIIIIlllllll.doFinal(Base64.getDecoder().decode(IIIIIIIIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIIIIIlllllll) {
            llIIIIIIlllllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean IIlll(final int lllllIllIllllll) {
        return lllllIllIllllll != 0;
    }
}
