import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ak")
public class class33 {
   @ObfuscatedName("af")
   static String field740;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -1331417555
   )
   static int field741 = 0;
   @ObfuscatedName("z")
   static int[] field742;
   @ObfuscatedName("bt")
   @ObfuscatedGetter(
      intValue = -971737657
   )
   static int field743;
   @ObfuscatedName("h")
   static class83[] field744;
   @ObfuscatedName("s")
   static class81 field745;
   @ObfuscatedName("k")
   static class81 field746;
   @ObfuscatedName("n")
   static class83[] field747;
   @ObfuscatedName("ab")
   @Export("loginMessage1")
   static String field748;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = 508924205
   )
   static int field749;
   @ObfuscatedName("x")
   static int[] field750;
   @ObfuscatedName("nl")
   @ObfuscatedGetter(
      intValue = -1012649735
   )
   static int field751;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -495360777
   )
   static int field752;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1737876119
   )
   static int field753;
   @ObfuscatedName("l")
   static boolean field754;
   @ObfuscatedName("ao")
   @Export("loginMessage3")
   static String field755;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 167499595
   )
   static int field756;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = -329568395
   )
   static int field757;
   @ObfuscatedName("ak")
   static String field758;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = -1402310727
   )
   static int field759;
   @ObfuscatedName("r")
   static class83 field760;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = -276346379
   )
   @Export("loginIndex")
   static int field761;
   @ObfuscatedName("ap")
   @Export("loginMessage2")
   static String field762;
   @ObfuscatedName("e")
   static class83 field763;
   @ObfuscatedName("ay")
   @Export("username")
   static String field764;
   @ObfuscatedName("ai")
   static String field765;
   @ObfuscatedName("aj")
   static class162 field766;
   @ObfuscatedName("ar")
   @Export("authCode")
   static String field767;
   @ObfuscatedName("at")
   static boolean field768;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -397417175
   )
   @Export("loginIndex2")
   static int field769;
   @ObfuscatedName("al")
   @Export("worldSelectShown")
   static boolean field772;
   @ObfuscatedName("bc")
   static class83[] field773;
   @ObfuscatedName("bj")
   static class83 field774;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = -1748152201
   )
   static int field775;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -102602611
   )
   @Export("loginWindowX")
   static int field777;

   @ObfuscatedName("g")
   public static String method701(long var0) {
      if(var0 > 0L && var0 < 6582952005840035281L) {
         if(var0 % 37L == 0L) {
            return null;
         } else {
            int var2 = 0;

            for(long var3 = var0; var3 != 0L; var3 /= 37L) {
               ++var2;
            }

            StringBuilder var5;
            char var8;
            for(var5 = new StringBuilder(var2); var0 != 0L; var5.append(var8)) {
               long var6 = var0;
               var0 /= 37L;
               var8 = class165.field2707[(int)(var6 - var0 * 37L)];
               if(var8 == 95) {
                  int var9 = var5.length() - 1;
                  var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
                  var8 = 160;
               }
            }

            var5.reverse();
            var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
            return var5.toString();
         }
      } else {
         return null;
      }
   }

   static {
      field777 = field741 + 202;
      field742 = new int[256];
      field749 = 0;
      field752 = 0;
      field753 = 0;
      field759 = 0;
      field775 = 0;
      field756 = 0;
      field757 = 10;
      field758 = "";
      field761 = 0;
      field740 = "";
      field748 = "";
      field762 = "";
      field755 = "";
      field764 = "";
      field765 = "";
      field766 = class162.field2661;
      field768 = true;
      field769 = 0;
      field772 = false;
      field743 = -1;
   }

   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-1152335318"
   )
   static void method718(int var0, int var1) {
      client.field337.method2903(55);
      client.field337.method2677(var0);
      client.field337.method2667(var1);
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "-1759915884"
   )
   static final int method732(int var0, int var1) {
      int var2 = var0 + 57 * var1;
      var2 ^= var2 << 13;
      int var3 = 1376312589 + (789221 + var2 * var2 * 15731) * var2 & Integer.MAX_VALUE;
      return var3 >> 19 & 255;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(CS)B",
      garbageValue = "-4690"
   )
   public static byte method735(char var0) {
      byte var1;
      if(var0 > 0 && var0 < 128 || var0 >= 160 && var0 <= 255) {
         var1 = (byte)var0;
      } else if(var0 == 8364) {
         var1 = -128;
      } else if(var0 == 8218) {
         var1 = -126;
      } else if(var0 == 402) {
         var1 = -125;
      } else if(var0 == 8222) {
         var1 = -124;
      } else if(var0 == 8230) {
         var1 = -123;
      } else if(var0 == 8224) {
         var1 = -122;
      } else if(var0 == 8225) {
         var1 = -121;
      } else if(var0 == 710) {
         var1 = -120;
      } else if(var0 == 8240) {
         var1 = -119;
      } else if(var0 == 352) {
         var1 = -118;
      } else if(var0 == 8249) {
         var1 = -117;
      } else if(var0 == 338) {
         var1 = -116;
      } else if(var0 == 381) {
         var1 = -114;
      } else if(var0 == 8216) {
         var1 = -111;
      } else if(var0 == 8217) {
         var1 = -110;
      } else if(var0 == 8220) {
         var1 = -109;
      } else if(var0 == 8221) {
         var1 = -108;
      } else if(var0 == 8226) {
         var1 = -107;
      } else if(var0 == 8211) {
         var1 = -106;
      } else if(var0 == 8212) {
         var1 = -105;
      } else if(var0 == 732) {
         var1 = -104;
      } else if(var0 == 8482) {
         var1 = -103;
      } else if(var0 == 353) {
         var1 = -102;
      } else if(var0 == 8250) {
         var1 = -101;
      } else if(var0 == 339) {
         var1 = -100;
      } else if(var0 == 382) {
         var1 = -98;
      } else if(var0 == 376) {
         var1 = -97;
      } else {
         var1 = 63;
      }

      return var1;
   }
}
