import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cg")
public class class82 extends class207 {
   @ObfuscatedName("f")
   public static int field1489 = 0;
   @ObfuscatedName("w")
   @Export("graphicsPixelsWidth")
   public static int field1490;
   @ObfuscatedName("z")
   protected static int field1491 = 0;
   @ObfuscatedName("d")
   public static int field1492 = 0;
   @ObfuscatedName("p")
   @Export("graphicsPixels")
   public static int[] field1493;
   @ObfuscatedName("o")
   @Export("graphicsPixelsHeight")
   public static int field1494;
   @ObfuscatedName("i")
   protected static int field1495 = 0;

   @ObfuscatedName("cy")
   @Export("setRasterBuffer")
   public static void method1879(int[] var0, int var1, int var2) {
      field1493 = var0;
      field1490 = var1;
      field1494 = var2;
      method1908(0, 0, var1, var2);
   }

   @ObfuscatedName("ck")
   public static void method1880() {
      field1491 = 0;
      field1492 = 0;
      field1495 = field1490;
      field1489 = field1494;
   }

   @ObfuscatedName("cb")
   public static void method1883(int[] var0) {
      var0[0] = field1491;
      var0[1] = field1492;
      var0[2] = field1495;
      var0[3] = field1489;
   }

   @ObfuscatedName("cj")
   public static void method1885() {
      int var0 = 0;

      int var1;
      for(var1 = field1490 * field1494 - 7; var0 < var1; field1493[var0++] = 0) {
         field1493[var0++] = 0;
         field1493[var0++] = 0;
         field1493[var0++] = 0;
         field1493[var0++] = 0;
         field1493[var0++] = 0;
         field1493[var0++] = 0;
         field1493[var0++] = 0;
      }

      for(var1 += 7; var0 < var1; field1493[var0++] = 0) {
         ;
      }

   }

   @ObfuscatedName("cp")
   public static void method1888(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = 0;
      int var9 = var4 == var5 && var6 == var7?-1:65536 / var3;
      int var10 = var6;
      int var11 = 256 - var6;
      int var12 = var4;
      if(var0 < field1491) {
         var2 -= field1491 - var0;
         var0 = field1491;
      }

      if(var1 < field1492) {
         var8 += (field1492 - var1) * var9;
         var3 -= field1492 - var1;
         var1 = field1492;
      }

      if(var0 + var2 > field1495) {
         var2 = field1495 - var0;
      }

      if(var1 + var3 > field1489) {
         var3 = field1489 - var1;
      }

      int var13 = field1490 - var2;
      int var14 = var0 + var1 * field1490;

      for(int var15 = -var3; var15 < 0; ++var15) {
         int var16;
         int var17;
         for(var16 = -var2; var16 < 0; ++var16) {
            var17 = field1493[var14];
            int var18 = var12 + var17;
            int var19 = (var12 & 16711935) + (var17 & 16711935);
            int var20 = (var19 & 16777472) + (var18 - var19 & 65536);
            if(var11 == 0) {
               field1493[var14++] = var18 - var20 | var20 - (var20 >>> 8);
            } else {
               int var21 = var18 - var20 | var20 - (var20 >>> 8);
               field1493[var14++] = ((var21 & 16711935) * var10 >> 8 & 16711935) + ((var21 & '\uff00') * var10 >> 8 & '\uff00') + ((var17 & 16711935) * var11 >> 8 & 16711935) + ((var17 & '\uff00') * var11 >> 8 & '\uff00');
            }
         }

         if(var9 > 0) {
            var8 += var9;
            var16 = 65536 - var8 >> 8;
            var17 = var8 >> 8;
            if(var6 != var7) {
               var10 = var6 * (65536 - var8) + var7 * var8 >> 16;
               var11 = 256 - var10;
            }

            if(var4 != var5) {
               var12 = ((var4 & 16711935) * var16 + (var5 & 16711935) * var17 & -16711936) + ((var4 & '\uff00') * var16 + (var5 & '\uff00') * var17 & 16711680) >>> 8;
            }
         }

         var14 += var13;
      }

   }

   @ObfuscatedName("cx")
   public static void method1889(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = 0;
      int var9 = var4 == var5 && var6 == var7?-1:65536 / var3;
      int var10 = var6;
      int var11 = 256 - var6;
      if(var0 < field1491) {
         var2 -= field1491 - var0;
         var0 = field1491;
      }

      if(var1 < field1492) {
         var8 += (field1492 - var1) * var9;
         var3 -= field1492 - var1;
         var1 = field1492;
      }

      if(var0 + var2 > field1495) {
         var2 = field1495 - var0;
      }

      if(var1 + var3 > field1489) {
         var3 = field1489 - var1;
      }

      int var12 = var4 >> 16;
      int var13 = (var4 & '\uff00') >> 8;
      int var14 = var4 & 255;
      int var18 = field1490 - var2;
      int var19 = var0 + var1 * field1490;

      for(int var20 = 0; var20 < var3; ++var20) {
         int var21;
         int var22;
         int var23;
         for(var21 = -var2; var21 < 0; ++var21) {
            var22 = field1493[var19];
            var23 = var22 >> 16;
            int var24 = (var22 & '\uff00') >> 8;
            int var25 = var22 & 255;
            int var15;
            int var16;
            int var17;
            if(var11 == 0) {
               var15 = var23 < 127?var12 * var23 >> 7:255 - ((255 - var12) * (255 - var23) >> 7);
               var16 = var24 < 127?var13 * var24 >> 7:255 - ((255 - var13) * (255 - var24) >> 7);
               var17 = var25 < 127?var14 * var25 >> 7:255 - ((255 - var14) * (255 - var25) >> 7);
            } else {
               var15 = var23 < 127?(var12 * var23 * var10 >> 7) + var23 * var11 >> 8:(255 - ((255 - var12) * (255 - var23) >> 7)) * var10 + var23 * var11 >> 8;
               var16 = var24 < 127?(var13 * var24 * var10 >> 7) + var24 * var11 >> 8:(255 - ((255 - var13) * (255 - var24) >> 7)) * var10 + var24 * var11 >> 8;
               var17 = var25 < 127?(var14 * var25 * var10 >> 7) + var25 * var11 >> 8:(255 - ((255 - var14) * (255 - var25) >> 7)) * var10 + var25 * var11 >> 8;
            }

            field1493[var19++] = (var15 << 16) + (var16 << 8) + var17;
         }

         if(var9 > 0) {
            var8 += var9;
            var21 = 65536 - var8 >> 8;
            var22 = var8 >> 8;
            if(var6 != var7) {
               var10 = var6 * (65536 - var8) + var7 * var8 >> 16;
               var11 = 256 - var10;
            }

            if(var4 != var5) {
               var23 = ((var4 & 16711935) * var21 + (var5 & 16711935) * var22 & -16711936) + ((var4 & '\uff00') * var21 + (var5 & '\uff00') * var22 & 16711680) >>> 8;
               var12 = var23 >> 16;
               var13 = (var23 & '\uff00') >> 8;
               var14 = var23 & 255;
            }
         }

         var19 += var18;
      }

   }

   @ObfuscatedName("cn")
   public static void method1890(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = 0;
      int var9 = 65536 / var3;
      int var10 = var6;
      int var11 = 256 - var6;
      if(var0 < field1491) {
         var2 -= field1491 - var0;
         var0 = field1491;
      }

      if(var1 < field1492) {
         var8 += (field1492 - var1) * var9;
         var3 -= field1492 - var1;
         var1 = field1492;
      }

      if(var0 + var2 > field1495) {
         var2 = field1495 - var0;
      }

      if(var1 + var3 > field1489) {
         var3 = field1489 - var1;
      }

      int var12 = var4 & 16711680;
      int var13 = var4 & '\uff00';
      int var14 = var4 & 255;
      int var15 = var12 * var6 >> 8;
      int var16 = var13 * var6 >> 8;
      int var17 = var14 * var6 >> 8;
      int var18 = field1490 - var2;
      int var19 = var0 + var1 * field1490;

      for(int var20 = 0; var20 < var3; ++var20) {
         int var21;
         int var22;
         int var23;
         for(var21 = -var2; var21 < 0; ++var21) {
            var22 = field1493[var19];
            var23 = var22 & 16711680;
            int var24 = var23 <= var12?var23:(var11 == 0?var12:var15 + (var23 * var11 >> 8) & 16711680);
            int var25 = var22 & '\uff00';
            int var26 = var25 <= var13?var25:(var11 == 0?var13:var16 + (var25 * var11 >> 8) & '\uff00');
            int var27 = var22 & 255;
            int var28 = var27 <= var14?var27:(var11 == 0?var14:var17 + (var27 * var11 >> 8));
            field1493[var19++] = var24 + var26 + var28;
         }

         if(var9 > 0) {
            var8 += var9;
            var21 = 65536 - var8 >> 8;
            var22 = var8 >> 8;
            if(var6 != var7) {
               var10 = var6 * (65536 - var8) + var7 * var8 >> 16;
               var11 = 256 - var10;
            }

            if(var4 != var5) {
               var23 = ((var4 & 16711935) * var21 + (var5 & 16711935) * var22 & -16711936) + ((var4 & '\uff00') * var21 + (var5 & '\uff00') * var22 & 16711680) >>> 8;
               var12 = var23 & 16711680;
               var13 = var23 & '\uff00';
               var14 = var23 & 255;
               var15 = var12 * var10 >> 8;
               var16 = var13 * var10 >> 8;
               var17 = var14 * var10 >> 8;
            }
         }

         var19 += var18;
      }

   }

   @ObfuscatedName("cr")
   public static void method1891(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = 0;
      int var9 = 65536 / var3;
      int var10 = var6;
      int var11 = 256 - var6;
      if(var0 < field1491) {
         var2 -= field1491 - var0;
         var0 = field1491;
      }

      if(var1 < field1492) {
         var8 += (field1492 - var1) * var9;
         var3 -= field1492 - var1;
         var1 = field1492;
      }

      if(var0 + var2 > field1495) {
         var2 = field1495 - var0;
      }

      if(var1 + var3 > field1489) {
         var3 = field1489 - var1;
      }

      int var12 = var4 & 16711680;
      int var13 = var4 & '\uff00';
      int var14 = var4 & 255;
      int var15 = var12 * var6 >> 8;
      int var16 = var13 * var6 >> 8;
      int var17 = var14 * var6 >> 8;
      int var18 = field1490 - var2;
      int var19 = var0 + var1 * field1490;

      for(int var20 = 0; var20 < var3; ++var20) {
         int var21;
         int var22;
         int var23;
         for(var21 = -var2; var21 < 0; ++var21) {
            var22 = field1493[var19];
            var23 = var22 & 16711680;
            int var24 = var23 >= var12?var23:(var11 == 0?var12:var15 + (var23 * var11 >> 8) & 16711680);
            int var25 = var22 & '\uff00';
            int var26 = var25 >= var13?var25:(var11 == 0?var13:var16 + (var25 * var11 >> 8) & '\uff00');
            int var27 = var22 & 255;
            int var28 = var27 >= var14?var27:(var11 == 0?var14:var17 + (var27 * var11 >> 8));
            field1493[var19++] = var24 + var26 + var28;
         }

         if(var9 > 0) {
            var8 += var9;
            var21 = 65536 - var8 >> 8;
            var22 = var8 >> 8;
            if(var6 != var7) {
               var10 = var6 * (65536 - var8) + var7 * var8 >> 16;
               var11 = 256 - var10;
            }

            if(var4 != var5) {
               var23 = ((var4 & 16711935) * var21 + (var5 & 16711935) * var22 & -16711936) + ((var4 & '\uff00') * var21 + (var5 & '\uff00') * var22 & 16711680) >>> 8;
               var12 = var23 & 16711680;
               var13 = var23 & '\uff00';
               var14 = var23 & 255;
               var15 = var12 * var10 >> 8;
               var16 = var13 * var10 >> 8;
               var17 = var14 * var10 >> 8;
            }
         }

         var19 += var18;
      }

   }

   @ObfuscatedName("cu")
   @ObfuscatedSignature(
      signature = "(IIIIII)V",
      garbageValue = "9135624"
   )
   public static void method1892(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = 0;
      int var7 = 65536 / var3;
      if(var0 < field1491) {
         var2 -= field1491 - var0;
         var0 = field1491;
      }

      if(var1 < field1492) {
         var6 += (field1492 - var1) * var7;
         var3 -= field1492 - var1;
         var1 = field1492;
      }

      if(var0 + var2 > field1495) {
         var2 = field1495 - var0;
      }

      if(var1 + var3 > field1489) {
         var3 = field1489 - var1;
      }

      int var8 = field1490 - var2;
      int var9 = var0 + var1 * field1490;

      for(int var10 = -var3; var10 < 0; ++var10) {
         int var11 = 65536 - var6 >> 8;
         int var12 = var6 >> 8;
         int var13 = ((var4 & 16711935) * var11 + (var5 & 16711935) * var12 & -16711936) + ((var4 & '\uff00') * var11 + (var5 & '\uff00') * var12 & 16711680) >>> 8;

         for(int var14 = -var2; var14 < 0; ++var14) {
            field1493[var9++] = var13;
         }

         var9 += var8;
         var6 += var7;
      }

   }

   @ObfuscatedName("cd")
   public static void method1893(int var0, int var1, int var2, int var3, int var4) {
      method1945(var0, var1, var2, var4);
      method1945(var0, var1 + var3 - 1, var2, var4);
      method1949(var0, var1, var3, var4);
      method1949(var0 + var2 - 1, var1, var3, var4);
   }

   @ObfuscatedName("co")
   public static void method1894(int var0, int var1, int var2, int var3, int var4, int var5) {
      if(var0 < field1491) {
         var2 -= field1491 - var0;
         var0 = field1491;
      }

      if(var1 < field1492) {
         var3 -= field1492 - var1;
         var1 = field1492;
      }

      if(var0 + var2 > field1495) {
         var2 = field1495 - var0;
      }

      if(var1 + var3 > field1489) {
         var3 = field1489 - var1;
      }

      var4 = ((var4 & 16711935) * var5 >> 8 & 16711935) + ((var4 & '\uff00') * var5 >> 8 & '\uff00');
      int var6 = 256 - var5;
      int var7 = field1490 - var2;
      int var8 = var0 + var1 * field1490;

      for(int var9 = 0; var9 < var3; ++var9) {
         for(int var10 = -var2; var10 < 0; ++var10) {
            int var11 = field1493[var8];
            var11 = ((var11 & 16711935) * var6 >> 8 & 16711935) + ((var11 & '\uff00') * var6 >> 8 & '\uff00');
            field1493[var8++] = var4 + var11;
         }

         var8 += var7;
      }

   }

   @ObfuscatedName("cc")
   static void method1896(int var0, int var1, int var2, int var3, int var4) {
      if(var1 >= field1492 && var1 < field1489) {
         if(var0 < field1491) {
            var2 -= field1491 - var0;
            var0 = field1491;
         }

         if(var0 + var2 > field1495) {
            var2 = field1495 - var0;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 255) * var4;
         int var7 = (var3 >> 8 & 255) * var4;
         int var8 = (var3 & 255) * var4;
         int var12 = var0 + var1 * field1490;

         for(int var13 = 0; var13 < var2; ++var13) {
            int var9 = (field1493[var12] >> 16 & 255) * var5;
            int var10 = (field1493[var12] >> 8 & 255) * var5;
            int var11 = (field1493[var12] & 255) * var5;
            int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            field1493[var12++] = var14;
         }

      }
   }

   @ObfuscatedName("ci")
   public static void method1897(int[] var0) {
      field1491 = var0[0];
      field1492 = var0[1];
      field1495 = var0[2];
      field1489 = var0[3];
   }

   @ObfuscatedName("dl")
   public static void method1898(int var0, int var1, int var2, int var3, int var4) {
      var2 -= var0;
      var3 -= var1;
      if(var3 == 0) {
         if(var2 >= 0) {
            method1945(var0, var1, var2 + 1, var4);
         } else {
            method1945(var0 + var2, var1, -var2 + 1, var4);
         }

      } else if(var2 == 0) {
         if(var3 >= 0) {
            method1949(var0, var1, var3 + 1, var4);
         } else {
            method1949(var0, var1 + var3, -var3 + 1, var4);
         }

      } else {
         if(var2 + var3 < 0) {
            var0 += var2;
            var2 = -var2;
            var1 += var3;
            var3 = -var3;
         }

         int var5;
         int var6;
         if(var2 > var3) {
            var1 <<= 16;
            var1 += '耀';
            var3 <<= 16;
            var5 = (int)Math.floor((double)var3 / (double)var2 + 0.5D);
            var2 += var0;
            if(var0 < field1491) {
               var1 += var5 * (field1491 - var0);
               var0 = field1491;
            }

            if(var2 >= field1495) {
               var2 = field1495 - 1;
            }

            while(var0 <= var2) {
               var6 = var1 >> 16;
               if(var6 >= field1492 && var6 < field1489) {
                  field1493[var0 + var6 * field1490] = var4;
               }

               var1 += var5;
               ++var0;
            }
         } else {
            var0 <<= 16;
            var0 += '耀';
            var2 <<= 16;
            var5 = (int)Math.floor((double)var2 / (double)var3 + 0.5D);
            var3 += var1;
            if(var1 < field1492) {
               var0 += var5 * (field1492 - var1);
               var1 = field1492;
            }

            if(var3 >= field1489) {
               var3 = field1489 - 1;
            }

            while(var1 <= var3) {
               var6 = var0 >> 16;
               if(var6 >= field1491 && var6 < field1495) {
                  field1493[var6 + var1 * field1490] = var4;
               }

               var0 += var5;
               ++var1;
            }
         }

      }
   }

   @ObfuscatedName("dg")
   public static void method1899(int var0, int var1, int var2, int[] var3, int[] var4) {
      int var5 = var0 + var1 * field1490;

      for(var1 = 0; var1 < var3.length; ++var1) {
         int var6 = var5 + var3[var1];

         for(var0 = -var4[var1]; var0 < 0; ++var0) {
            field1493[var6++] = var2;
         }

         var5 += field1490;
      }

   }

   @ObfuscatedName("ct")
   public static void method1907(int var0, int var1, int var2, int var3, int var4) {
      if(var0 < field1491) {
         var2 -= field1491 - var0;
         var0 = field1491;
      }

      if(var1 < field1492) {
         var3 -= field1492 - var1;
         var1 = field1492;
      }

      if(var0 + var2 > field1495) {
         var2 = field1495 - var0;
      }

      if(var1 + var3 > field1489) {
         var3 = field1489 - var1;
      }

      int var5 = field1490 - var2;
      int var6 = var0 + var1 * field1490;

      for(int var7 = -var3; var7 < 0; ++var7) {
         for(int var8 = -var2; var8 < 0; ++var8) {
            field1493[var6++] = var4;
         }

         var6 += var5;
      }

   }

   @ObfuscatedName("cz")
   public static void method1908(int var0, int var1, int var2, int var3) {
      if(var0 < 0) {
         var0 = 0;
      }

      if(var1 < 0) {
         var1 = 0;
      }

      if(var2 > field1490) {
         var2 = field1490;
      }

      if(var3 > field1494) {
         var3 = field1494;
      }

      field1491 = var0;
      field1492 = var1;
      field1495 = var2;
      field1489 = var3;
   }

   @ObfuscatedName("cv")
   public static void method1912(int var0, int var1, int var2, int var3, int var4, int var5) {
      method1896(var0, var1, var2, var4, var5);
      method1896(var0, var1 + var3 - 1, var2, var4, var5);
      if(var3 >= 3) {
         method1924(var0, var1 + 1, var3 - 2, var4, var5);
         method1924(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5);
      }

   }

   @ObfuscatedName("dj")
   static void method1924(int var0, int var1, int var2, int var3, int var4) {
      if(var0 >= field1491 && var0 < field1495) {
         if(var1 < field1492) {
            var2 -= field1492 - var1;
            var1 = field1492;
         }

         if(var1 + var2 > field1489) {
            var2 = field1489 - var1;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 255) * var4;
         int var7 = (var3 >> 8 & 255) * var4;
         int var8 = (var3 & 255) * var4;
         int var12 = var0 + var1 * field1490;

         for(int var13 = 0; var13 < var2; ++var13) {
            int var9 = (field1493[var12] >> 16 & 255) * var5;
            int var10 = (field1493[var12] >> 8 & 255) * var5;
            int var11 = (field1493[var12] & 255) * var5;
            int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            field1493[var12] = var14;
            var12 += field1490;
         }

      }
   }

   @ObfuscatedName("cs")
   public static void method1941(int var0, int var1, int var2, int var3) {
      if(field1491 < var0) {
         field1491 = var0;
      }

      if(field1492 < var1) {
         field1492 = var1;
      }

      if(field1495 > var2) {
         field1495 = var2;
      }

      if(field1489 > var3) {
         field1489 = var3;
      }

   }

   @ObfuscatedName("cq")
   public static void method1945(int var0, int var1, int var2, int var3) {
      if(var1 >= field1492 && var1 < field1489) {
         if(var0 < field1491) {
            var2 -= field1491 - var0;
            var0 = field1491;
         }

         if(var0 + var2 > field1495) {
            var2 = field1495 - var0;
         }

         int var4 = var0 + var1 * field1490;

         for(int var5 = 0; var5 < var2; ++var5) {
            field1493[var4 + var5] = var3;
         }

      }
   }

   @ObfuscatedName("di")
   public static void method1949(int var0, int var1, int var2, int var3) {
      if(var0 >= field1491 && var0 < field1495) {
         if(var1 < field1492) {
            var2 -= field1492 - var1;
            var1 = field1492;
         }

         if(var1 + var2 > field1489) {
            var2 = field1489 - var1;
         }

         int var4 = var0 + var1 * field1490;

         for(int var5 = 0; var5 < var2; ++var5) {
            field1493[var4 + var5 * field1490] = var3;
         }

      }
   }
}
