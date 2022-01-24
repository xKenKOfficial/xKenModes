package x.KenKOfficial.Modes.Commands;

import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;
import org.bukkit.command.*;
import x.KenKOfficial.Modes.Utils.*;
import org.bukkit.entity.*;
import x.KenKOfficial.Modes.Main.*;
import org.bukkit.*;

public class FlyCommand implements CommandExecutor
{
    private static final /* synthetic */ String[] I;
    private static final /* synthetic */ int[] l;
    private static final /* synthetic */ String prefix;
    private static final /* synthetic */ String brak_perm;
    private static final /* synthetic */ String offline_player;
    
    private static void IIl() {
        (l = new int[20])[0] = ((0x15 ^ 0x32 ^ (0x80 ^ 0x87)) & (109 + 32 + 22 + 0 ^ 87 + 117 - 75 + 2 ^ -" ".length()));
        FlyCommand.l[1] = " ".length();
        FlyCommand.l[2] = "  ".length();
        FlyCommand.l[3] = "   ".length();
        FlyCommand.l[4] = (0x9E ^ 0x9A);
        FlyCommand.l[5] = (0x23 ^ 0x26);
        FlyCommand.l[6] = (0x31 ^ 0x1 ^ (0xF1 ^ 0xC7));
        FlyCommand.l[7] = (0x77 ^ 0x58 ^ (0xEB ^ 0xC3));
        FlyCommand.l[8] = (0x52 ^ 0x78 ^ (0xE1 ^ 0xC3));
        FlyCommand.l[9] = (0x7B ^ 0x72);
        FlyCommand.l[10] = (0x99 ^ 0x93);
        FlyCommand.l[11] = (88 + 28 - 81 + 93 ^ 70 + 10 - 30 + 89);
        FlyCommand.l[12] = (0xA6 ^ 0x95 ^ (0x42 ^ 0x7D));
        FlyCommand.l[13] = (0xC8 ^ 0xC5);
        FlyCommand.l[14] = (0x3 ^ 0xD);
        FlyCommand.l[15] = (0x33 ^ 0x3C);
        FlyCommand.l[16] = ("   ".length() ^ (0x11 ^ 0x2));
        FlyCommand.l[17] = (0x43 ^ 0x5A ^ (0x95 ^ 0x9D));
        FlyCommand.l[18] = (0x52 ^ 0x40);
        FlyCommand.l[19] = (0x4F ^ 0x36 ^ (0x68 ^ 0x2));
    }
    
    private static String Il(final String IIIllIlllllllll, final String lIIllIlllllllll) {
        try {
            final SecretKeySpec lIlllIlllllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIllIlllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher IIlllIlllllllll = Cipher.getInstance("Blowfish");
            IIlllIlllllllll.init(FlyCommand.l[2], lIlllIlllllllll);
            return new String(IIlllIlllllllll.doFinal(Base64.getDecoder().decode(IIIllIlllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIllIlllllllll) {
            llIllIlllllllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIl(final int IlIIIlIllllllll) {
        return IlIIIlIllllllll == 0;
    }
    
    private static boolean Ill(final int IIlIIlIllllllll) {
        return IIlIIlIllllllll != 0;
    }
    
    private static boolean lll(final int lIIlIlIllllllll, final int IIIlIlIllllllll) {
        return lIIlIlIllllllll < IIIlIlIllllllll;
    }
    
    private static boolean IIIl(final Object IllIIlIllllllll) {
        return IllIIlIllllllll == null;
    }
    
    private static String I(final String llIlIIlllllllll, final String IlIlIIlllllllll) {
        try {
            final SecretKeySpec IIIIlIlllllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IlIlIIlllllllll.getBytes(StandardCharsets.UTF_8)), FlyCommand.l[8]), "DES");
            final Cipher llllIIlllllllll = Cipher.getInstance("DES");
            llllIIlllllllll.init(FlyCommand.l[2], IIIIlIlllllllll);
            return new String(llllIIlllllllll.doFinal(Base64.getDecoder().decode(llIlIIlllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IlllIIlllllllll) {
            IlllIIlllllllll.printStackTrace();
            return null;
        }
    }
    
    public boolean onCommand(final CommandSender lIllIllllllllll, final Command IIllIllllllllll, final String llIlIllllllllll, final String[] IlIlIllllllllll) {
        if (lIl(lIllIllllllllll.hasPermission(FlyCommand.I[FlyCommand.l[0]]) ? 1 : 0)) {
            lIllIllllllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(FlyCommand.prefix).append(FlyCommand.I[FlyCommand.l[1]]).append(FlyCommand.brak_perm))));
            return FlyCommand.l[0] != 0;
        }
        if (Ill((lIllIllllllllll instanceof Player) ? 1 : 0)) {
            final Player IIlIlllllllllll = (Player)lIllIllllllllll;
            final String llIIlllllllllll = Main.getPlugin().getConfig().getString(FlyCommand.I[FlyCommand.l[2]]);
            final String IlIIlllllllllll = Main.getPlugin().getConfig().getString(FlyCommand.I[FlyCommand.l[3]]);
            if (lll(IlIlIllllllllll.length, FlyCommand.l[1])) {
                final Player player = IIlIlllllllllll;
                int allowFlight;
                if (lIl(IIlIlllllllllll.getAllowFlight() ? 1 : 0)) {
                    allowFlight = FlyCommand.l[1];
                    "".length();
                    if (((89 + 70 - 93 + 66 ^ 95 + 155 - 89 + 21) & (0x76 ^ 0x6B ^ (0x33 ^ 0x1C) ^ -" ".length())) >= (67 + 106 - 34 + 4 ^ 11 + 76 - 29 + 81)) {
                        return ((0x1 ^ 0x7A ^ (0xF1 ^ 0xB3)) & (138 + 10 - 83 + 99 ^ 4 + 154 - 31 + 30 ^ -" ".length())) != 0x0;
                    }
                }
                else {
                    allowFlight = FlyCommand.l[0];
                }
                player.setAllowFlight((boolean)(allowFlight != 0));
                final Player player2 = IIlIlllllllllll;
                String lllIlIlIlllllll;
                if (Ill(IIlIlllllllllll.getAllowFlight() ? 1 : 0)) {
                    lllIlIlIlllllll = String.valueOf(new StringBuilder().append(FlyCommand.prefix).append(FlyCommand.I[FlyCommand.l[4]]).append(llIIlllllllllll));
                    "".length();
                    if (((0x52 ^ 0x4A) & ~(0xDD ^ 0xC5)) > (0xB6 ^ 0xB2)) {
                        return ((0x40 ^ 0x22) & ~(0xE8 ^ 0x8A)) != 0x0;
                    }
                }
                else {
                    lllIlIlIlllllll = String.valueOf(new StringBuilder().append(FlyCommand.prefix).append(FlyCommand.I[FlyCommand.l[5]]).append(IlIIlllllllllll));
                }
                player2.sendMessage(ChatUtil.fixColor(lllIlIlIlllllll));
                return FlyCommand.l[0] != 0;
            }
            final Player lIIIlllllllllll = Bukkit.getPlayer(IlIlIllllllllll[FlyCommand.l[0]]);
            if (IIIl(lIIIlllllllllll)) {
                lIllIllllllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(FlyCommand.prefix).append(FlyCommand.I[FlyCommand.l[6]]).append(FlyCommand.offline_player))));
                return FlyCommand.l[0] != 0;
            }
            final String IIIIlllllllllll = Main.getPlugin().getConfig().getString(FlyCommand.I[FlyCommand.l[7]]).replace(FlyCommand.I[FlyCommand.l[8]], lIIIlllllllllll.getName());
            final String llllIllllllllll = Main.getPlugin().getConfig().getString(FlyCommand.I[FlyCommand.l[9]]).replace(FlyCommand.I[FlyCommand.l[10]], lIIIlllllllllll.getName());
            if (lIIl(IlIlIllllllllll.length, FlyCommand.l[1])) {
                final Player player3 = lIIIlllllllllll;
                int allowFlight2;
                if (lIl(lIIIlllllllllll.getAllowFlight() ? 1 : 0)) {
                    allowFlight2 = FlyCommand.l[1];
                    "".length();
                    if (-(0xDF ^ 0xB4 ^ (0xAA ^ 0xC5)) > 0) {
                        return ((0x70 ^ 0x48 ^ (0x1C ^ 0xA)) & (0xB8 ^ 0x85 ^ (0x77 ^ 0x64) ^ -" ".length())) != 0x0;
                    }
                }
                else {
                    allowFlight2 = FlyCommand.l[0];
                }
                player3.setAllowFlight((boolean)(allowFlight2 != 0));
                final Player player4 = lIIIlllllllllll;
                String lllIlIlIlllllll2;
                if (Ill(IIlIlllllllllll.getAllowFlight() ? 1 : 0)) {
                    lllIlIlIlllllll2 = String.valueOf(new StringBuilder().append(FlyCommand.prefix).append(FlyCommand.I[FlyCommand.l[11]]).append(llIIlllllllllll));
                    "".length();
                    if (null != null) {
                        return ((0x30 ^ 0x29) & ~(0x81 ^ 0x98)) != 0x0;
                    }
                }
                else {
                    lllIlIlIlllllll2 = String.valueOf(new StringBuilder().append(FlyCommand.prefix).append(FlyCommand.I[FlyCommand.l[12]]).append(IlIIlllllllllll));
                }
                player4.sendMessage(ChatUtil.fixColor(lllIlIlIlllllll2));
                final Player player5 = IIlIlllllllllll;
                String lllIlIlIlllllll3;
                if (Ill(lIIIlllllllllll.getAllowFlight() ? 1 : 0)) {
                    lllIlIlIlllllll3 = String.valueOf(new StringBuilder().append(FlyCommand.prefix).append(FlyCommand.I[FlyCommand.l[13]]).append(IIIIlllllllllll));
                    "".length();
                    if (((0xF5 ^ 0xB4) & ~(0x25 ^ 0x64)) != 0x0) {
                        return ((0x20 ^ 0x17) & ~(0x32 ^ 0x5)) != 0x0;
                    }
                }
                else {
                    lllIlIlIlllllll3 = String.valueOf(new StringBuilder().append(FlyCommand.prefix).append(FlyCommand.I[FlyCommand.l[14]]).append(llllIllllllllll));
                }
                player5.sendMessage(ChatUtil.fixColor(lllIlIlIlllllll3));
                return FlyCommand.l[0] != 0;
            }
            "".length();
            if (null != null) {
                return ((0x3B ^ 0x7) & ~(0xB4 ^ 0x88)) != 0x0;
            }
        }
        else {
            lIllIllllllllll.sendMessage(String.valueOf(new StringBuilder().append(ChatColor.DARK_RED).append(FlyCommand.I[FlyCommand.l[15]])));
        }
        return FlyCommand.l[0] != 0;
    }
    
    static {
        IIl();
        ll();
        prefix = Main.getPlugin().getConfig().getString(FlyCommand.I[FlyCommand.l[16]]);
        brak_perm = Main.getPlugin().getConfig().getString(FlyCommand.I[FlyCommand.l[17]]);
        offline_player = Main.getPlugin().getConfig().getString(FlyCommand.I[FlyCommand.l[18]]);
    }
    
    private static void ll() {
        (I = new String[FlyCommand.l[19]])[FlyCommand.l[0]] = I("vVlnNS5Ikn802vAzG79p2g==", "bBZZB");
        FlyCommand.I[FlyCommand.l[1]] = l("UA==", "payXA");
        FlyCommand.I[FlyCommand.l[2]] = Il("H2oH1mxunUW5fJC3L1v0shPBKnvmcs3/", "lWdoJ");
        FlyCommand.I[FlyCommand.l[3]] = I("fz533ab89vF4mecY+UHshRONwzpuSmJ8", "INlMn");
        FlyCommand.I[FlyCommand.l[4]] = I("jgDWBVRVrqk=", "FwSnJ");
        FlyCommand.I[FlyCommand.l[5]] = Il("kwmjM1592So=", "BmjRz");
        FlyCommand.I[FlyCommand.l[6]] = I("QGNEHmdYgAo=", "mMADa");
        FlyCommand.I[FlyCommand.l[7]] = I("A4ItXlNPQqANuo98bT1qw778tmqMpxr/", "CEMAi");
        FlyCommand.I[FlyCommand.l[8]] = Il("v7ZBv/qIxlo=", "mWfZz");
        FlyCommand.I[FlyCommand.l[9]] = l("KSM8EjIrIiwjfTg2KSwwNSArKA==", "OOEMS");
        FlyCommand.I[FlyCommand.l[10]] = l("KQEwLDcIOw==", "RFbmt");
        FlyCommand.I[FlyCommand.l[11]] = Il("3p6mEByzgoI=", "Kuuxx");
        FlyCommand.I[FlyCommand.l[12]] = I("KoAOaaWRUUc=", "OWFoC");
        FlyCommand.I[FlyCommand.l[13]] = I("LMA+o3MhnFA=", "hAWhT");
        FlyCommand.I[FlyCommand.l[14]] = I("qRjIFMVIaTk=", "XYvbb");
        FlyCommand.I[FlyCommand.l[15]] = I("IYcJgX/jDZnd2X4NLrBekWdgaHNIhx7lzCxLmAtRtBbcx41RDijN4A==", "ePMMO");
        FlyCommand.I[FlyCommand.l[16]] = I("LTjRpTwLCSA=", "COUgk");
        FlyCommand.I[FlyCommand.l[17]] = l("NBEXPiUmBgQ4EyUJHw==", "VcvUz");
        FlyCommand.I[FlyCommand.l[18]] = Il("mwn5VtSdx4/Kw6JHx+7BLA==", "foGQQ");
    }
    
    private static boolean lIIl(final int lIllIlIllllllll, final int IIllIlIllllllll) {
        return lIllIlIllllllll == IIllIlIllllllll;
    }
    
    private static String l(String IIIlllIllllllll, final String lllIllIllllllll) {
        IIIlllIllllllll = new String(Base64.getDecoder().decode(IIIlllIllllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llIlllIllllllll = new StringBuilder();
        final char[] IlIlllIllllllll = lllIllIllllllll.toCharArray();
        int lIIlllIllllllll = FlyCommand.l[0];
        final String llIIllIllllllll = (Object)IIIlllIllllllll.toCharArray();
        final short IlIIllIllllllll = (short)llIIllIllllllll.length;
        long lIIIllIllllllll = FlyCommand.l[0];
        while (lll((int)lIIIllIllllllll, IlIIllIllllllll)) {
            final char IlllllIllllllll = llIIllIllllllll[lIIIllIllllllll];
            llIlllIllllllll.append((char)(IlllllIllllllll ^ IlIlllIllllllll[lIIlllIllllllll % IlIlllIllllllll.length]));
            "".length();
            ++lIIlllIllllllll;
            ++lIIIllIllllllll;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llIlllIllllllll);
    }
}
