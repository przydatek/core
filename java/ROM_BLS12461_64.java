/*
 * Copyright (c) 2012-2020 MIRACL UK Ltd.
 *
 * This file is part of MIRACL Core
 * (see https://github.com/miracl/core).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/* Fixed Data in ROM - Field and Curve parameters */


package org.miracl.core.BLS12461;

public class ROM
{

// Base Bits= 60
public static final long[] Modulus= {0xAAC0000AAAAAAABL,0x20000555554AAAAL,0x6AA91557F004000L,0xA8DFFA5C1CC00F2L,0xACCA47B14848B42L,0x935FBD6F1E32D8BL,0xD5A555A55D69414L,0x15555545554L};
public static final long[] ROI= {0xAAC0000AAAAAAAAL,0x20000555554AAAAL,0x6AA91557F004000L,0xA8DFFA5C1CC00F2L,0xACCA47B14848B42L,0x935FBD6F1E32D8BL,0xD5A555A55D69414L,0x15555545554L};
public static final long[] R2modp= {0x96D08774614DDA8L,0xCD45F539225D5BDL,0xD712EB760C95AB1L,0xB3B687155F30B55L,0xC4E62A05C3F5B81L,0xBA1151676CA3CD0L,0x7EDD8A958F442BEL,0x12B89DD3F91L};
public static final long MConst= 0xC0005FFFFFFFDL;
public static final long[] SQRTm3= {0xAA3FFFCAAAAAAAEL,0x40003555558AAAAL,0xAA1AD53F6022001L,0xB9FDCF694150959L,0x2EAD34A29FE1159L,0x1360FCCF1D928C9L,0xD5A555A51D69417L,0x15555545554L};

public static final int CURVE_B_I= 9;
public static final int CURVE_Cof_I= 0;
public static final long[] CURVE_B= {0x9L,0x0L,0x0L,0x0L,0x0L,0x0L,0x0L,0x0L};
public static final long[] CURVE_Order= {0x1L,0x7FEFFFEFFFFC0L,0xC017FFC80001100L,0x7FE05FD000E801FL,0xFFFF7FFFC018001L,0xFFL,0x0L,0x0L};
public static final long[] CURVE_Gx= {0x14D026A8ADEE93DL,0xF2D9C00EE74B741L,0x229C3981B531AC7L,0x6650D3564DC9218L,0x436166F7C292A09L,0x2CF668BE922B197L,0x463B73A0C813271L,0xAD0E74E99BL};
public static final long[] CURVE_Gy= {0xF763157AD1D465L,0x5D17884C8C4FF47L,0x9D0A819E66B8D21L,0x910AE5C3245F495L,0x96EECB8BFA40B84L,0x277ACC8BF9F8CBEL,0x5F68C95F1C3F2FL,0x77BCDB14B3L};
public static final long[] CURVE_HTPC= {0x1L,0x0L,0x0L,0x0L,0x0L,0x0L,0x0L,0x0L};

public static final long[] Fra= {0xF7117BF9B812A3AL,0xA1C6308A599C400L,0x5A6510E07505BF8L,0xB31ACE4858D45FAL,0xFC61EBC2CB04770L,0x366190D073588E2L,0x69E55E24DFEFA84L,0x12E40504B7FL};
public static final long[] Frb= {0xB3AE8410F298071L,0x7E39D4CAFBAE6A9L,0x104404777AFE407L,0xF5C52C13C3EBAF8L,0xB0685BEE7D443D1L,0x5CFE2C9EAADA4A8L,0x6BBFF7807D79990L,0x27150409D5L};
public static final long[] CURVE_Bnx= {0xFFBFFFE00000000L,0x1FFFFL,0x0L,0x0L,0x0L,0x0L,0x0L,0x0L};
public static final long[] CURVE_Cof= {0xFFBFFFE00000001L,0x1FFFFL,0x0L,0x0L,0x0L,0x0L,0x0L,0x0L};
//public static final long[] CURVE_Cof= {0xAA7FFFEAAAAAAABL,0xFFD55AAAB01556AL,0x1555554FFL,0x0L,0x0L,0x0L,0x0L,0x0L};
public static final long[] CRu= {0x40001FFFFFFFEL,0x6FFFE7FFFFE0000L,0x6047200C47F0FFFL,0x777115796DB7BCCL,0x3F0E89875433CF4L,0xBFFF60500050261L,0x1FFFFFEL,0x0L};
public static final long[] CURVE_Pxa= {0x65B503186D0A37CL,0xA9C2E492E75DCC4L,0x564E01F919D6878L,0x3F086DB74FF92FL,0xED78D46D581A668L,0x270C892F97C2907L,0x6A50A9AF679453CL,0x10CC54138A0L};
public static final long[] CURVE_Pxb= {0x9F85CA8C2C1C0ADL,0x96CD66C425CADEL,0x1AC612951A2896L,0xB17D529ABEBEE24L,0xC5AF5BA09D33F65L,0x6A672E4D4371ED4L,0xACEA37CA279D224L,0x95C1FB4FE5L};
public static final long[] CURVE_Pya= {0x7CCD0C1B02FB006L,0x953D194A4A12A33L,0x68B4960CFCC92C8L,0xBA0F3A9B00F39FCL,0xCDFD8A7DBBC5ED1L,0xE73ED227CC2F7A9L,0xEBA7E676070F4F4L,0x226AC848E7L};
public static final long[] CURVE_Pyb= {0x8A506ADFDF1457CL,0xB4D6A31DC04C20AL,0x668EA9A8F136E3FL,0x12973C3BE4492F5L,0xA20BE74BEABA67AL,0x5157F04C42E3856L,0xBB402EA2AB1D004L,0xE38101B4FAL};

}

