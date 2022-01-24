package x.KenKOfficial.Modes.Main;

import org.bukkit.plugin.java.*;
import org.bukkit.*;
import x.KenKOfficial.Modes.Listeners.*;
import org.bukkit.event.*;
import org.bukkit.plugin.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import org.bukkit.command.*;
import x.KenKOfficial.Modes.Commands.*;
import java.util.*;

public class Main extends JavaPlugin
{
    private static final /* synthetic */ int[] ll;
    private static final /* synthetic */ String[] Il;
    private static /* synthetic */ Main plugin;
    
    public void onEnable() {
        (Main.plugin = this).saveDefaultConfig();
        this.registerCommands();
        this.registerListener();
        System.out.println(Main.Il[Main.ll[0]]);
        System.out.println(Main.Il[Main.ll[1]]);
        System.out.println(Main.Il[Main.ll[2]]);
        System.out.println(Main.Il[Main.ll[3]]);
        System.out.println(Main.Il[Main.ll[4]]);
        System.out.println(Main.Il[Main.ll[5]]);
    }
    
    static {
        Illl();
        lIll();
    }
    
    private static boolean llll(final int IllllIlIlllllll, final int lIlllIlIlllllll) {
        return IllllIlIlllllll < lIlllIlIlllllll;
    }
    
    public void onDisable() {
        this.saveDefaultConfig();
        System.out.println(Main.Il[Main.ll[6]]);
        System.out.println(Main.Il[Main.ll[7]]);
        System.out.println(Main.Il[Main.ll[8]]);
        System.out.println(Main.Il[Main.ll[9]]);
        System.out.println(Main.Il[Main.ll[10]]);
        System.out.println(Main.Il[Main.ll[11]]);
    }
    
    public void registerListener() {
        this.getLogger().info(String.valueOf(new StringBuilder().append(Main.Il[Main.ll[15]]).append(this.getName())));
        Bukkit.getPluginManager().registerEvents((Listener)new PlayerJoin(), (Plugin)this);
    }
    
    private static String IlIl(String lIIlIllIlllllll, final String lIllIllIlllllll) {
        lIIlIllIlllllll = (short)new String(Base64.getDecoder().decode(((String)lIIlIllIlllllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IIllIllIlllllll = new StringBuilder();
        final char[] llIlIllIlllllll = lIllIllIlllllll.toCharArray();
        int IlIlIllIlllllll = Main.ll[0];
        final double IIlIIllIlllllll = (Object)((String)lIIlIllIlllllll).toCharArray();
        final int llIIIllIlllllll = IIlIIllIlllllll.length;
        char IlIIIllIlllllll = (char)Main.ll[0];
        while (llll(IlIIIllIlllllll, llIIIllIlllllll)) {
            final char llllIllIlllllll = IIlIIllIlllllll[IlIIIllIlllllll];
            IIllIllIlllllll.append((char)(llllIllIlllllll ^ llIlIllIlllllll[IlIlIllIlllllll % llIlIllIlllllll.length]));
            "".length();
            ++IlIlIllIlllllll;
            ++IlIIIllIlllllll;
            "".length();
            if ("   ".length() < " ".length()) {
                return null;
            }
        }
        return String.valueOf(IIllIllIlllllll);
    }
    
    private static String llIl(final String IllllllIlllllll, final String llIllllIlllllll) {
        try {
            final SecretKeySpec lIIIIIIllllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIllllIlllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher IIIIIIIllllllll = Cipher.getInstance("Blowfish");
            IIIIIIIllllllll.init(Main.ll[2], lIIIIIIllllllll);
            return new String(IIIIIIIllllllll.doFinal(Base64.getDecoder().decode(IllllllIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllIlllllll) {
            lllllllIlllllll.printStackTrace();
            return null;
        }
    }
    
    public void registerCommands() {
        this.getLogger().info(String.valueOf(new StringBuilder().append(Main.Il[Main.ll[12]]).append(this.getName())));
        this.getCommand(Main.Il[Main.ll[13]]).setExecutor((CommandExecutor)new FlyCommand());
        this.getCommand(Main.Il[Main.ll[14]]).setExecutor((CommandExecutor)new GamemodeCommand());
    }
    
    private static String IIll(final String llIlIIIllllllll, final String IIIlIIIllllllll) {
        try {
            final SecretKeySpec IlllIIIllllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IIIlIIIllllllll.getBytes(StandardCharsets.UTF_8)), Main.ll[8]), "DES");
            final Cipher lIllIIIllllllll = Cipher.getInstance("DES");
            lIllIIIllllllll.init(Main.ll[2], IlllIIIllllllll);
            return new String(lIllIIIllllllll.doFinal(Base64.getDecoder().decode(llIlIIIllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIllIIIllllllll) {
            IIllIIIllllllll.printStackTrace();
            return null;
        }
    }
    
    public static Main getPlugin() {
        return Main.plugin;
    }
    
    private static void lIll() {
        (Il = new String[Main.ll[16]])[Main.ll[0]] = IlIl("R3VQZUdHdVBlR0d1UGVHR3VQZUdHdVBlR0d1UGVHR3VQZUdHdVBlR0d1UGVHR3VQZUdHdVBlR0d1UGU=", "dVsFd");
        Main.Il[Main.ll[1]] = llIl("/UloB5aOxWlsh8Qa219xSw==", "MAOGK");
        Main.Il[Main.ll[2]] = llIl("9GNBO+gk9yspv72bX8LCCZphnO2hj9yu", "VFMpd");
        Main.Il[Main.ll[3]] = llIl("50iH0B4Agsg+CLAEmP0dNg==", "haMgx");
        Main.Il[Main.ll[4]] = IlIl("GgkhIyg7ByY9JDUDai8pKQsgL205SCQrPyUbMC8jOQ1qOj8xH2orOCQHODkmOQsiamBwMgsIHx8mAwUDFUk=", "PhJJM");
        Main.Il[Main.ll[5]] = llIl("4diF/EhN3zbh2IX8SE3fNuHYhfxITd824diF/EhN3zbh2IX8SE3fNuHYhfxITd824diF/EhN3zZz9gdAEMzWcQ==", "uzFJj");
        Main.Il[Main.ll[6]] = IlIl("e3dLRlF7d0tGUXt3S0ZRe3dLRlF7d0tGUXt3S0ZRe3dLRlF7d0tGUXt3S0ZRe3dLRlF7d0tGUXt3S0Y=", "XTher");
        Main.Il[Main.ll[7]] = IIll("pyIEDKl+eU1XsRfnQxf3fQ==", "HqAHi");
        Main.Il[Main.ll[8]] = llIl("mWDILoVclq6U1XoE8xxZEkHHV4njMuuy", "erUPZ");
        Main.Il[Main.ll[9]] = llIl("N/RABam8Xowyp9Ljwd5deA==", "ivHQM");
        Main.Il[Main.ll[10]] = IIll("PfGxp2QAUDwqV7TteBxOeBCF0iJSja+ZFOI2Nub8uVXuc7YJ/56xibmmrOS+mwFDk3OJRlg7IRjH8VObfzSBDg==", "lNktK");
        Main.Il[Main.ll[11]] = llIl("BmpAOFVnxUsGakA4VWfFSwZqQDhVZ8VLBmpAOFVnxUsGakA4VWfFSwZqQDhVZ8VLBmpAOFVnxUuVw2ftGiwVcA==", "pIneB");
        Main.Il[Main.ll[12]] = llIl("r8+1f93Ezu96I4TfltK22r6G84FrxwuspKt3SPcyw0U=", "LNwxi");
        Main.Il[Main.ll[13]] = IlIl("CC83", "nCNGV");
        Main.Il[Main.ll[14]] = IlIl("Ehs9NjwaHjU=", "uzPSQ");
        Main.Il[Main.ll[15]] = IlIl("JggdAwELBxAJVg8fHAICBR5ZFlYaBQwLHwQcQ0w=", "jiylv");
    }
    
    private static void Illl() {
        (ll = new int[17])[0] = ((0x7D ^ 0x51) & ~(0xB5 ^ 0x99));
        Main.ll[1] = " ".length();
        Main.ll[2] = "  ".length();
        Main.ll[3] = "   ".length();
        Main.ll[4] = (0x5D ^ 0x59);
        Main.ll[5] = (0xBA ^ 0xBF);
        Main.ll[6] = (0x19 ^ 0x7C ^ (0xC9 ^ 0xAA));
        Main.ll[7] = (0xAD ^ 0xC0 ^ (0xAA ^ 0xC0));
        Main.ll[8] = (0xA ^ 0x2);
        Main.ll[9] = (0x65 ^ 0x60 ^ (0xCA ^ 0xC6));
        Main.ll[10] = (50 + 174 - 185 + 141 ^ 189 + 130 - 173 + 44);
        Main.ll[11] = (10 + 72 - 67 + 152 ^ 143 + 85 - 84 + 28);
        Main.ll[12] = (0x8A ^ 0x86);
        Main.ll[13] = (0x85 ^ 0x88);
        Main.ll[14] = (0x57 ^ 0x43 ^ (0x56 ^ 0x4C));
        Main.ll[15] = (0x24 ^ 0x2B);
        Main.ll[16] = (0x99 ^ 0x89);
    }
}
