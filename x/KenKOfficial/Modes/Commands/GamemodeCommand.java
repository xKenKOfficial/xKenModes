package x.KenKOfficial.Modes.Commands;

import org.bukkit.command.*;
import x.KenKOfficial.Modes.Utils.*;
import org.bukkit.entity.*;
import org.bukkit.*;
import x.KenKOfficial.Modes.Main.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class GamemodeCommand implements CommandExecutor
{
    private static final /* synthetic */ String gamemode_gracz_adventure;
    private static final /* synthetic */ String[] IIIl;
    private static final /* synthetic */ String gamemode_usage;
    private static final /* synthetic */ String prefix;
    private static final /* synthetic */ String gamemode_gracz_creative;
    private static final /* synthetic */ String offline_player;
    private static final /* synthetic */ String brak_perm;
    private static final /* synthetic */ String gamemode_gracz_spectator;
    private static final /* synthetic */ String gamemode_gracz_survival;
    private static final /* synthetic */ int[] lIIl;
    
    public boolean onCommand(final CommandSender llIlIIllIllllll, final Command IlIlIIllIllllll, final String lIIlIIllIllllll, final String[] lIlIIIllIllllll) {
        if (llIIIl(llIlIIllIllllll.hasPermission(GamemodeCommand.IIIl[GamemodeCommand.lIIl[0]]) ? 1 : 0)) {
            llIlIIllIllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(GamemodeCommand.prefix).append(GamemodeCommand.IIIl[GamemodeCommand.lIIl[1]]).append(GamemodeCommand.brak_perm))));
            return GamemodeCommand.lIIl[0] != 0;
        }
        if (IIlIIl(lIlIIIllIllllll.length, GamemodeCommand.lIIl[1])) {
            llIlIIllIllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(GamemodeCommand.prefix).append(GamemodeCommand.IIIl[GamemodeCommand.lIIl[2]]).append(GamemodeCommand.gamemode_usage))));
            return GamemodeCommand.lIIl[1] != 0;
        }
        final Player lllIIIllIllllll = (Player)llIlIIllIllllll;
        if (lIlIIl(lIlIIIllIllllll.length, GamemodeCommand.lIIl[1])) {
            if (!llIIIl(lIlIIIllIllllll[GamemodeCommand.lIIl[0]].equalsIgnoreCase(GamemodeCommand.IIIl[GamemodeCommand.lIIl[3]]) ? 1 : 0) || IllIIl(lIlIIIllIllllll[GamemodeCommand.lIIl[0]].equalsIgnoreCase(GamemodeCommand.IIIl[GamemodeCommand.lIIl[4]]) ? 1 : 0)) {
                lllIIIllIllllll.setGameMode(GameMode.SURVIVAL);
                llIlIIllIllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(GamemodeCommand.prefix).append(GamemodeCommand.IIIl[GamemodeCommand.lIIl[5]]).append(GamemodeCommand.gamemode_gracz_survival))));
                "".length();
                if (-(94 + 64 - 138 + 155 ^ 166 + 137 - 231 + 98) >= 0) {
                    return ((71 + 104 - 91 + 110 ^ 32 + 117 - 13 + 6) & (0x35 ^ 0x6F ^ (0xAC ^ 0xBA) ^ -" ".length())) != 0x0;
                }
            }
            else if (!llIIIl(lIlIIIllIllllll[GamemodeCommand.lIIl[0]].equalsIgnoreCase(GamemodeCommand.IIIl[GamemodeCommand.lIIl[6]]) ? 1 : 0) || IllIIl(lIlIIIllIllllll[GamemodeCommand.lIIl[0]].equalsIgnoreCase(GamemodeCommand.IIIl[GamemodeCommand.lIIl[7]]) ? 1 : 0)) {
                lllIIIllIllllll.setGameMode(GameMode.CREATIVE);
                llIlIIllIllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(GamemodeCommand.prefix).append(GamemodeCommand.IIIl[GamemodeCommand.lIIl[8]]).append(GamemodeCommand.gamemode_gracz_creative))));
                "".length();
                if (-"  ".length() >= 0) {
                    return ((0x1D ^ 0x26) & ~(0x74 ^ 0x4F) & ~((0x7A ^ 0x25) & ~(0xC9 ^ 0x96))) != 0x0;
                }
            }
            else if (!llIIIl(lIlIIIllIllllll[GamemodeCommand.lIIl[0]].equalsIgnoreCase(GamemodeCommand.IIIl[GamemodeCommand.lIIl[9]]) ? 1 : 0) || IllIIl(lIlIIIllIllllll[GamemodeCommand.lIIl[0]].equalsIgnoreCase(GamemodeCommand.IIIl[GamemodeCommand.lIIl[10]]) ? 1 : 0)) {
                lllIIIllIllllll.setGameMode(GameMode.ADVENTURE);
                llIlIIllIllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(GamemodeCommand.prefix).append(GamemodeCommand.IIIl[GamemodeCommand.lIIl[11]]).append(GamemodeCommand.gamemode_gracz_adventure))));
                "".length();
                if ("  ".length() <= ((0x1C ^ 0x3C) & ~(0x40 ^ 0x60))) {
                    return ((0xA5 ^ 0xA9) & ~(0x72 ^ 0x7E)) != 0x0;
                }
            }
            else if (!llIIIl(lIlIIIllIllllll[GamemodeCommand.lIIl[0]].equalsIgnoreCase(GamemodeCommand.IIIl[GamemodeCommand.lIIl[12]]) ? 1 : 0) || IllIIl(lIlIIIllIllllll[GamemodeCommand.lIIl[0]].equalsIgnoreCase(GamemodeCommand.IIIl[GamemodeCommand.lIIl[13]]) ? 1 : 0)) {
                lllIIIllIllllll.setGameMode(GameMode.SPECTATOR);
                llIlIIllIllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(GamemodeCommand.prefix).append(GamemodeCommand.IIIl[GamemodeCommand.lIIl[14]]).append(GamemodeCommand.gamemode_gracz_spectator))));
                "".length();
                if ((0x7E ^ 0x7A) < (0x5E ^ 0x5A)) {
                    return ((0x7A ^ 0x4E) & ~(0xE ^ 0x3A)) != 0x0;
                }
            }
            else {
                llIlIIllIllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(GamemodeCommand.prefix).append(GamemodeCommand.IIIl[GamemodeCommand.lIIl[15]]).append(GamemodeCommand.gamemode_usage))));
            }
        }
        if (lIlIIl(lIlIIIllIllllll.length, GamemodeCommand.lIIl[2])) {
            final Player lIIIlIllIllllll = Bukkit.getPlayer(lIlIIIllIllllll[GamemodeCommand.lIIl[1]]);
            if (lllIIl(lIIIlIllIllllll)) {
                llIlIIllIllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(GamemodeCommand.prefix).append(GamemodeCommand.IIIl[GamemodeCommand.lIIl[16]]).append(GamemodeCommand.offline_player))));
                return GamemodeCommand.lIIl[1] != 0;
            }
            final String IIIIlIllIllllll = Main.getPlugin().getConfig().getString(GamemodeCommand.IIIl[GamemodeCommand.lIIl[17]]).replace(GamemodeCommand.IIIl[GamemodeCommand.lIIl[18]], lIIIlIllIllllll.getName());
            final String llllIIllIllllll = Main.getPlugin().getConfig().getString(GamemodeCommand.IIIl[GamemodeCommand.lIIl[19]]).replace(GamemodeCommand.IIIl[GamemodeCommand.lIIl[20]], lIIIlIllIllllll.getName());
            final String IlllIIllIllllll = Main.getPlugin().getConfig().getString(GamemodeCommand.IIIl[GamemodeCommand.lIIl[21]]).replace(GamemodeCommand.IIIl[GamemodeCommand.lIIl[22]], lIIIlIllIllllll.getName());
            final String lIllIIllIllllll = Main.getPlugin().getConfig().getString(GamemodeCommand.IIIl[GamemodeCommand.lIIl[23]]).replace(GamemodeCommand.IIIl[GamemodeCommand.lIIl[24]], lIIIlIllIllllll.getName());
            if (!llIIIl(lIlIIIllIllllll[GamemodeCommand.lIIl[0]].equalsIgnoreCase(GamemodeCommand.IIIl[GamemodeCommand.lIIl[25]]) ? 1 : 0) || IllIIl(lIlIIIllIllllll[GamemodeCommand.lIIl[0]].equalsIgnoreCase(GamemodeCommand.IIIl[GamemodeCommand.lIIl[26]]) ? 1 : 0)) {
                lIIIlIllIllllll.setGameMode(GameMode.SURVIVAL);
                lIIIlIllIllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(GamemodeCommand.prefix).append(GamemodeCommand.IIIl[GamemodeCommand.lIIl[27]]).append(GamemodeCommand.gamemode_gracz_survival))));
                llIlIIllIllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(GamemodeCommand.prefix).append(GamemodeCommand.IIIl[GamemodeCommand.lIIl[28]]).append(IIIIlIllIllllll))));
                "".length();
                if (((0xE6 ^ 0xAE) & ~(0xF0 ^ 0xB8)) != ((0xD6 ^ 0x8C) & ~(0xDA ^ 0x80))) {
                    return ((0x42 ^ 0x1E) & ~(0x52 ^ 0xE)) != 0x0;
                }
            }
            else if (!llIIIl(lIlIIIllIllllll[GamemodeCommand.lIIl[0]].equalsIgnoreCase(GamemodeCommand.IIIl[GamemodeCommand.lIIl[29]]) ? 1 : 0) || IllIIl(lIlIIIllIllllll[GamemodeCommand.lIIl[0]].equalsIgnoreCase(GamemodeCommand.IIIl[GamemodeCommand.lIIl[30]]) ? 1 : 0)) {
                lIIIlIllIllllll.setGameMode(GameMode.CREATIVE);
                lIIIlIllIllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(GamemodeCommand.prefix).append(GamemodeCommand.IIIl[GamemodeCommand.lIIl[31]]).append(GamemodeCommand.gamemode_gracz_creative))));
                llIlIIllIllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(GamemodeCommand.prefix).append(GamemodeCommand.IIIl[GamemodeCommand.lIIl[32]]).append(llllIIllIllllll))));
                "".length();
                if (-"   ".length() >= 0) {
                    return ((0x84 ^ 0xBC ^ (0x5C ^ 0x24)) & (95 + 58 - 106 + 86 ^ 40 + 94 - 53 + 116 ^ -" ".length())) != 0x0;
                }
            }
            else if (!llIIIl(lIlIIIllIllllll[GamemodeCommand.lIIl[0]].equalsIgnoreCase(GamemodeCommand.IIIl[GamemodeCommand.lIIl[33]]) ? 1 : 0) || IllIIl(lIlIIIllIllllll[GamemodeCommand.lIIl[0]].equalsIgnoreCase(GamemodeCommand.IIIl[GamemodeCommand.lIIl[34]]) ? 1 : 0)) {
                lIIIlIllIllllll.setGameMode(GameMode.ADVENTURE);
                lIIIlIllIllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(GamemodeCommand.prefix).append(GamemodeCommand.IIIl[GamemodeCommand.lIIl[35]]).append(GamemodeCommand.gamemode_gracz_adventure))));
                llIlIIllIllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(GamemodeCommand.prefix).append(GamemodeCommand.IIIl[GamemodeCommand.lIIl[36]]).append(IlllIIllIllllll))));
                "".length();
                if (((0x79 ^ 0x50) & ~(0x99 ^ 0xB0)) != 0x0) {
                    return ((0xEC ^ 0xB5) & ~(0x15 ^ 0x4C)) != 0x0;
                }
            }
            else if (!llIIIl(lIlIIIllIllllll[GamemodeCommand.lIIl[0]].equalsIgnoreCase(GamemodeCommand.IIIl[GamemodeCommand.lIIl[37]]) ? 1 : 0) || IllIIl(lIlIIIllIllllll[GamemodeCommand.lIIl[0]].equalsIgnoreCase(GamemodeCommand.IIIl[GamemodeCommand.lIIl[38]]) ? 1 : 0)) {
                lIIIlIllIllllll.setGameMode(GameMode.SPECTATOR);
                lIIIlIllIllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(GamemodeCommand.prefix).append(GamemodeCommand.IIIl[GamemodeCommand.lIIl[39]]).append(GamemodeCommand.gamemode_gracz_spectator))));
                llIlIIllIllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(GamemodeCommand.prefix).append(GamemodeCommand.IIIl[GamemodeCommand.lIIl[40]]).append(lIllIIllIllllll))));
                "".length();
                if (" ".length() == (78 + 136 - 103 + 86 ^ 175 + 173 - 290 + 135)) {
                    return ((0xDE ^ 0xBA ^ (0xF7 ^ 0xC2)) & (78 + 35 + 83 + 35 ^ 143 + 27 - 78 + 90 ^ -" ".length())) != 0x0;
                }
            }
            else {
                llIlIIllIllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(GamemodeCommand.prefix).append(GamemodeCommand.IIIl[GamemodeCommand.lIIl[41]]).append(GamemodeCommand.gamemode_usage))));
            }
        }
        return GamemodeCommand.lIIl[0] != 0;
    }
    
    private static boolean lIlIIl(final int IlIlIIIlIllllll, final int lIIlIIIlIllllll) {
        return IlIlIIIlIllllll == lIIlIIIlIllllll;
    }
    
    private static boolean IllIIl(final int lIIIIIIlIllllll) {
        return lIIIIIIlIllllll != 0;
    }
    
    private static String Illll(final String lllllIIlIllllll, final String IIlllIIlIllllll) {
        try {
            final SecretKeySpec IlIIIlIlIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IIlllIIlIllllll.getBytes(StandardCharsets.UTF_8)), GamemodeCommand.lIIl[8]), "DES");
            final Cipher lIIIIlIlIllllll = Cipher.getInstance("DES");
            lIIIIlIlIllllll.init(GamemodeCommand.lIIl[2], IlIIIlIlIllllll);
            return new String(lIIIIlIlIllllll.doFinal(Base64.getDecoder().decode(lllllIIlIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIIIIlIlIllllll) {
            IIIIIlIlIllllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIIIl(final int lllllllIIllllll) {
        return lllllllIIllllll == 0;
    }
    
    private static String IIIIIl(final String IlIIlIIlIllllll, final String lIIIlIIlIllllll) {
        try {
            final SecretKeySpec lIlIlIIlIllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIlIIlIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher IIlIlIIlIllllll = Cipher.getInstance("Blowfish");
            IIlIlIIlIllllll.init(GamemodeCommand.lIIl[2], lIlIlIIlIllllll);
            return new String(IIlIlIIlIllllll.doFinal(Base64.getDecoder().decode(IlIIlIIlIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIlIIlIllllll) {
            llIIlIIlIllllll.printStackTrace();
            return null;
        }
    }
    
    private static void IlIIIl() {
        (lIIl = new int[51])[0] = ((0x47 ^ 0x56 ^ (0x99 ^ 0xC1)) & (195 + 155 - 252 + 102 ^ 21 + 0 + 58 + 50 ^ -" ".length()));
        GamemodeCommand.lIIl[1] = " ".length();
        GamemodeCommand.lIIl[2] = "  ".length();
        GamemodeCommand.lIIl[3] = "   ".length();
        GamemodeCommand.lIIl[4] = (0x7 ^ 0x63 ^ (0x77 ^ 0x17));
        GamemodeCommand.lIIl[5] = (0xFC ^ 0x8F ^ (0x63 ^ 0x15));
        GamemodeCommand.lIIl[6] = (0x19 ^ 0x54 ^ (0x63 ^ 0x28));
        GamemodeCommand.lIIl[7] = (0x2F ^ 0x28);
        GamemodeCommand.lIIl[8] = (0x1F ^ 0x59 ^ (0x43 ^ 0xD));
        GamemodeCommand.lIIl[9] = (0xB3 ^ 0xAF ^ (0x96 ^ 0x83));
        GamemodeCommand.lIIl[10] = (0x63 ^ 0x6D ^ (0x59 ^ 0x5D));
        GamemodeCommand.lIIl[11] = (0x62 ^ 0x4D ^ (0x38 ^ 0x1C));
        GamemodeCommand.lIIl[12] = (134 + 103 - 221 + 155 ^ 81 + 2 + 36 + 48);
        GamemodeCommand.lIIl[13] = (0x4E ^ 0x43);
        GamemodeCommand.lIIl[14] = (0x2D ^ 0x23);
        GamemodeCommand.lIIl[15] = (0x31 ^ 0x7D ^ (0x4 ^ 0x47));
        GamemodeCommand.lIIl[16] = (0x70 ^ 0x75 ^ (0xAF ^ 0xBA));
        GamemodeCommand.lIIl[17] = (0x64 ^ 0x75);
        GamemodeCommand.lIIl[18] = (0xE8 ^ 0x96 ^ (0xC9 ^ 0xA5));
        GamemodeCommand.lIIl[19] = (0x78 ^ 0x6B);
        GamemodeCommand.lIIl[20] = (0x5A ^ 0x4E);
        GamemodeCommand.lIIl[21] = (0x63 ^ 0x76);
        GamemodeCommand.lIIl[22] = (0x1A ^ 0xC);
        GamemodeCommand.lIIl[23] = (92 + 133 - 91 + 9 ^ 45 + 32 - 74 + 149);
        GamemodeCommand.lIIl[24] = (0x8C ^ 0x94);
        GamemodeCommand.lIIl[25] = (0x2E ^ 0xF ^ (0xB1 ^ 0x89));
        GamemodeCommand.lIIl[26] = (0x67 ^ 0x7D);
        GamemodeCommand.lIIl[27] = (0x6D ^ 0x76);
        GamemodeCommand.lIIl[28] = (0x47 ^ 0x5B);
        GamemodeCommand.lIIl[29] = (0xB0 ^ 0xAD);
        GamemodeCommand.lIIl[30] = (0x22 ^ 0x3C);
        GamemodeCommand.lIIl[31] = (0x8A ^ 0x95);
        GamemodeCommand.lIIl[32] = (0xAB ^ 0x8B);
        GamemodeCommand.lIIl[33] = (0x77 ^ 0x56);
        GamemodeCommand.lIIl[34] = (0x23 ^ 0x72 ^ (0x79 ^ 0xA));
        GamemodeCommand.lIIl[35] = (105 + 47 - 43 + 57 ^ 48 + 100 - 61 + 46);
        GamemodeCommand.lIIl[36] = (144 + 159 - 169 + 32 ^ 40 + 87 - 67 + 70);
        GamemodeCommand.lIIl[37] = (135 + 71 - 187 + 134 ^ 3 + 160 - 20 + 45);
        GamemodeCommand.lIIl[38] = (143 + 58 - 56 + 80 ^ 19 + 87 - 93 + 186);
        GamemodeCommand.lIIl[39] = (0x45 ^ 0x62);
        GamemodeCommand.lIIl[40] = (0x67 ^ 0x4F);
        GamemodeCommand.lIIl[41] = (63 + 18 - 6 + 94 ^ 93 + 92 - 151 + 94);
        GamemodeCommand.lIIl[42] = (0xA1 ^ 0x8B);
        GamemodeCommand.lIIl[43] = (135 + 52 - 174 + 158 ^ 74 + 64 - 101 + 91);
        GamemodeCommand.lIIl[44] = (0xB5 ^ 0x99);
        GamemodeCommand.lIIl[45] = (0xE7 ^ 0xC5 ^ (0x48 ^ 0x47));
        GamemodeCommand.lIIl[46] = (0x28 ^ 0x6);
        GamemodeCommand.lIIl[47] = (124 + 112 - 114 + 22 ^ 167 + 88 - 122 + 58);
        GamemodeCommand.lIIl[48] = (0x2F ^ 0x1F);
        GamemodeCommand.lIIl[49] = (122 + 73 - 156 + 88 ^ (0x24 ^ 0x6A));
        GamemodeCommand.lIIl[50] = (0x54 ^ 0x66);
    }
    
    private static boolean IIlIIl(final int IllIIIIlIllllll, final int lIlIIIIlIllllll) {
        return IllIIIIlIllllll < lIlIIIIlIllllll;
    }
    
    static {
        IlIIIl();
        lIIIIl();
        prefix = Main.getPlugin().getConfig().getString(GamemodeCommand.IIIl[GamemodeCommand.lIIl[42]]);
        brak_perm = Main.getPlugin().getConfig().getString(GamemodeCommand.IIIl[GamemodeCommand.lIIl[43]]);
        offline_player = Main.getPlugin().getConfig().getString(GamemodeCommand.IIIl[GamemodeCommand.lIIl[44]]);
        gamemode_usage = Main.getPlugin().getConfig().getString(GamemodeCommand.IIIl[GamemodeCommand.lIIl[45]]);
        gamemode_gracz_survival = Main.getPlugin().getConfig().getString(GamemodeCommand.IIIl[GamemodeCommand.lIIl[46]]);
        gamemode_gracz_creative = Main.getPlugin().getConfig().getString(GamemodeCommand.IIIl[GamemodeCommand.lIIl[47]]);
        gamemode_gracz_adventure = Main.getPlugin().getConfig().getString(GamemodeCommand.IIIl[GamemodeCommand.lIIl[48]]);
        gamemode_gracz_spectator = Main.getPlugin().getConfig().getString(GamemodeCommand.IIIl[GamemodeCommand.lIIl[49]]);
    }
    
    private static String lllll(String llllIlIlIllllll, final String IlllIlIlIllllll) {
        llllIlIlIllllll = (char)new String(Base64.getDecoder().decode(((String)llllIlIlIllllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IlIIllIlIllllll = new StringBuilder();
        final char[] lIIIllIlIllllll = IlllIlIlIllllll.toCharArray();
        int IIIIllIlIllllll = GamemodeCommand.lIIl[0];
        final String IlIlIlIlIllllll = (Object)((String)llllIlIlIllllll).toCharArray();
        final double lIIlIlIlIllllll = IlIlIlIlIllllll.length;
        char IIIlIlIlIllllll = (char)GamemodeCommand.lIIl[0];
        while (IIlIIl(IIIlIlIlIllllll, (int)lIIlIlIlIllllll)) {
            final char lIlIllIlIllllll = IlIlIlIlIllllll[IIIlIlIlIllllll];
            IlIIllIlIllllll.append((char)(lIlIllIlIllllll ^ lIIIllIlIllllll[IIIIllIlIllllll % lIIIllIlIllllll.length]));
            "".length();
            ++IIIIllIlIllllll;
            ++IIIlIlIlIllllll;
            "".length();
            if (-(11 + 112 - 115 + 138 ^ 83 + 82 - 136 + 121) > 0) {
                return null;
            }
        }
        return String.valueOf(IlIIllIlIllllll);
    }
    
    private static boolean lllIIl(final Object llIIIIIlIllllll) {
        return llIIIIIlIllllll == null;
    }
    
    private static void lIIIIl() {
        (IIIl = new String[GamemodeCommand.lIIl[50]])[GamemodeCommand.lIIl[0]] = Illll("QMThEyv1fHPDEWj23UURb7FXWBhAV4E3", "vutxm");
        GamemodeCommand.IIIl[GamemodeCommand.lIIl[1]] = lllll("eQ==", "Yxfbn");
        GamemodeCommand.IIIl[GamemodeCommand.lIIl[2]] = Illll("HE2bGaZdWmI=", "FpLXj");
        GamemodeCommand.IIIl[GamemodeCommand.lIIl[3]] = lllll("OwIoEAE+FjY=", "HwZfh");
        GamemodeCommand.IIIl[GamemodeCommand.lIIl[4]] = lllll("fg==", "NHcgX");
        GamemodeCommand.IIIl[GamemodeCommand.lIIl[5]] = IIIIIl("sidBQq0/n3Q=", "EAyvg");
        GamemodeCommand.IIIl[GamemodeCommand.lIIl[6]] = IIIIIl("y39c6/sI6YhzA9ej+uP6LQ==", "Ensuu");
        GamemodeCommand.IIIl[GamemodeCommand.lIIl[7]] = Illll("Dd8FUGSyd2E=", "oifKZ");
        GamemodeCommand.IIIl[GamemodeCommand.lIIl[8]] = IIIIIl("bwEoQg+a2Zo=", "RlVyU");
        GamemodeCommand.IIIl[GamemodeCommand.lIIl[9]] = Illll("Mh62PhiTmB5otcdjJGMmsw==", "QMxdg");
        GamemodeCommand.IIIl[GamemodeCommand.lIIl[10]] = IIIIIl("DV4oZ69/v2g=", "akNwU");
        GamemodeCommand.IIIl[GamemodeCommand.lIIl[11]] = IIIIIl("bA/rskieaJU=", "fCjGy");
        GamemodeCommand.IIIl[GamemodeCommand.lIIl[12]] = Illll("BO8mFW9RwkPxsft9AkSS6A==", "ROoie");
        GamemodeCommand.IIIl[GamemodeCommand.lIIl[13]] = lllll("eA==", "KLhPM");
        GamemodeCommand.IIIl[GamemodeCommand.lIIl[14]] = IIIIIl("jxER96d/dOM=", "vGlvU");
        GamemodeCommand.IIIl[GamemodeCommand.lIIl[15]] = Illll("4575Az+frGo=", "qmket");
        GamemodeCommand.IIIl[GamemodeCommand.lIIl[16]] = IIIIIl("+BLvkS4HYcY=", "VpJTA");
        GamemodeCommand.IIIl[GamemodeCommand.lIIl[17]] = Illll("AXSDkaKFbQyZGHknEj4sNIR6GZEuC3Bz", "VjwLR");
        GamemodeCommand.IIIl[GamemodeCommand.lIIl[18]] = Illll("rzAuJSFxcgM=", "NnaRE");
        GamemodeCommand.IIIl[GamemodeCommand.lIIl[19]] = IIIIIl("pbRy4sQA0I1014k2038cmwvsCdQu2MxZ", "noxaX");
        GamemodeCommand.IIIl[GamemodeCommand.lIIl[20]] = Illll("eRe7Ugv7Q3E=", "wyIAl");
        GamemodeCommand.IIIl[GamemodeCommand.lIIl[21]] = Illll("5kpeR4N147oHLnT+/ocFOHd6RQxFeGbHa/7qk3B8KQw=", "JZonD");
        GamemodeCommand.IIIl[GamemodeCommand.lIIl[22]] = IIIIIl("8WsU28oUjH4=", "gqSky");
        GamemodeCommand.IIIl[GamemodeCommand.lIIl[23]] = IIIIIl("AFFBuJXNWonoHX30WK4oBiO6PI+ZnWlowbw2zpANMxM=", "aFWfY");
        GamemodeCommand.IIIl[GamemodeCommand.lIIl[24]] = Illll("WpH2jcNIL5c=", "clbpi");
        GamemodeCommand.IIIl[GamemodeCommand.lIIl[25]] = lllll("MToKJQY0LhQ=", "BOxSo");
        GamemodeCommand.IIIl[GamemodeCommand.lIIl[26]] = lllll("XA==", "lyqzN");
        GamemodeCommand.IIIl[GamemodeCommand.lIIl[27]] = lllll("Yw==", "CDDFa");
        GamemodeCommand.IIIl[GamemodeCommand.lIIl[28]] = IIIIIl("+1k5ta+S/Vk=", "sBjVi");
        GamemodeCommand.IIIl[GamemodeCommand.lIIl[29]] = IIIIIl("HJCNTJmHfTNP+nVHYDu8BQ==", "IccNj");
        GamemodeCommand.IIIl[GamemodeCommand.lIIl[30]] = IIIIIl("DoQ0vsfZYQE=", "JiPbT");
        GamemodeCommand.IIIl[GamemodeCommand.lIIl[31]] = lllll("Wg==", "zKOfx");
        GamemodeCommand.IIIl[GamemodeCommand.lIIl[32]] = lllll("YQ==", "ACYMp");
        GamemodeCommand.IIIl[GamemodeCommand.lIIl[33]] = lllll("DT4vHAMYLysc", "lZYym");
        GamemodeCommand.IIIl[GamemodeCommand.lIIl[34]] = lllll("Qw==", "qGMSj");
        GamemodeCommand.IIIl[GamemodeCommand.lIIl[35]] = IIIIIl("rK4h8TBmXbE=", "ALJkZ");
        GamemodeCommand.IIIl[GamemodeCommand.lIIl[36]] = IIIIIl("7lHKUWN904w=", "nEpRS");
        GamemodeCommand.IIIl[GamemodeCommand.lIIl[37]] = IIIIIl("Lntr3YYsiO8/jLROzuC6bg==", "URBqk");
        GamemodeCommand.IIIl[GamemodeCommand.lIIl[38]] = IIIIIl("AQWcjMX5Dcc=", "LoSTJ");
        GamemodeCommand.IIIl[GamemodeCommand.lIIl[39]] = IIIIIl("zPmhpUATSbs=", "zItZf");
        GamemodeCommand.IIIl[GamemodeCommand.lIIl[40]] = IIIIIl("3jKFpFGtoik=", "RyTQV");
        GamemodeCommand.IIIl[GamemodeCommand.lIIl[41]] = lllll("WQ==", "ykpHM");
        GamemodeCommand.IIIl[GamemodeCommand.lIIl[42]] = Illll("CtFcAIHYfBg=", "gncQn");
        GamemodeCommand.IIIl[GamemodeCommand.lIIl[43]] = Illll("R3SpsSHGTP6qOZdX3lad/g==", "HYneV");
        GamemodeCommand.IIIl[GamemodeCommand.lIIl[44]] = lllll("Fy4HCjgWLT4WPRkxBBQ=", "xHafQ");
        GamemodeCommand.IIIl[GamemodeCommand.lIIl[45]] = Illll("Hw1HcBp6FxWT6EfgShSMLA==", "wuHIj");
        GamemodeCommand.IIIl[GamemodeCommand.lIIl[46]] = Illll("rOeyFmPLazB94c9m/cjQuJAXHByu3hy1", "BJKmY");
        GamemodeCommand.IIIl[GamemodeCommand.lIIl[47]] = lllll("HwMVCBQXBh0yHgoDGxdXGxAdDA0RFB0=", "xbxmy");
        GamemodeCommand.IIIl[GamemodeCommand.lIIl[48]] = Illll("e3oFtr3W9fxBuNzfYxuIEev8Iw/IA0hezuWTs/NSV+o=", "cIOMb");
        GamemodeCommand.IIIl[GamemodeCommand.lIIl[49]] = IIIIIl("KR4jbLuyzdZBafUG8M6ElEqEbOD6U2HJrXzZjKaXLmY=", "pafUk");
    }
}
