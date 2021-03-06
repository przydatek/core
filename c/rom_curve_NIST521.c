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
#include "arch.h"
#include "ecp_NIST521.h"

/* Curve NIST521 */

#if CHUNK==16

#error Not supported

#endif

#if CHUNK==32

const int CURVE_Cof_I_NIST521= 1;
const BIG_528_28 CURVE_Cof_NIST521= {0x1,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0};
const int CURVE_B_I_NIST521= 0;
const BIG_528_28 CURVE_B_NIST521= {0xB503F00,0x451FD46,0xC34F1EF,0xDF883D2,0xF073573,0xBD3BB1B,0xB1652C0,0xEC7E937,0x6193951,0xF109E15,0x489918E,0x15F3B8B,0x25B99B3,0xEEA2DA7,0xB68540,0x929A21A,0xE1C9A1F,0x3EB9618,0x5195};
const BIG_528_28 CURVE_Order_NIST521= {0x1386409,0x6FB71E9,0xC47AEBB,0xC9B8899,0x5D03BB5,0x48F709A,0xB7FCC01,0xBF2F966,0x1868783,0xFFFFFA5,0xFFFFFFF,0xFFFFFFF,0xFFFFFFF,0xFFFFFFF,0xFFFFFFF,0xFFFFFFF,0xFFFFFFF,0xFFFFFFF,0x1FFFF};
const BIG_528_28 CURVE_Gx_NIST521= {0x2E5BD66,0x7E7E31C,0xA429BF9,0xB3C1856,0x8DE3348,0x27A2FFA,0x8FE1DC1,0xEFE7592,0x14B5E77,0x4D3DBAA,0x8AF606B,0xB521F82,0x139053F,0x429C648,0x62395B4,0x9E3ECB6,0x404E9CD,0x8E06B70,0xC685};
const BIG_528_28 CURVE_Gy_NIST521= {0xFD16650,0xBE94769,0x2C24088,0x7086A27,0x761353C,0x13FAD0,0xC550B9,0x5EF4264,0x7EE7299,0x3E662C9,0xFBD1727,0x446817A,0x449579B,0xD998F54,0x42C7D1B,0x5C8A5FB,0xA3BC004,0x296A789,0x11839};
const BIG_528_28 CURVE_HTPC_NIST521= {0xFFFFFFF,0xFFFFFFF,0xFFFFFFF,0xFFFFFFF,0xFFFFFFF,0xFFFFFFF,0xFFFFFFF,0xFFFFFFF,0xFFFFFFF,0xFFFFFFF,0xFFFFFFF,0xFFFFFFF,0xFFFFFFF,0xFFFFFFF,0xFFFFFFF,0xFFFFFFF,0xFFFFFFF,0xFFFFFFF,0xFFFF};
#endif

#if CHUNK==64

const int CURVE_Cof_I_NIST521= 1;
const BIG_528_60 CURVE_Cof_NIST521= {0x1L,0x0L,0x0L,0x0L,0x0L,0x0L,0x0L,0x0L,0x0L};
const int CURVE_B_I_NIST521= 0;
const BIG_528_60 CURVE_B_NIST521= {0xF451FD46B503F00L,0x73DF883D2C34F1EL,0x2C0BD3BB1BF0735L,0x3951EC7E937B165L,0x9918EF109E15619L,0x5B99B315F3B8B48L,0xB68540EEA2DA72L,0x8E1C9A1F929A21AL,0x51953EB961L};
const BIG_528_60 CURVE_Order_NIST521= {0xB6FB71E91386409L,0xB5C9B8899C47AEBL,0xC0148F709A5D03BL,0x8783BF2F966B7FCL,0xFFFFFFFFFFA5186L,0xFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFL,0x1FFFFFFFFFFL};
const BIG_528_60 CURVE_Gx_NIST521= {0x97E7E31C2E5BD66L,0x48B3C1856A429BFL,0xDC127A2FFA8DE33L,0x5E77EFE75928FE1L,0xF606B4D3DBAA14BL,0x39053FB521F828AL,0x62395B4429C6481L,0x404E9CD9E3ECB6L,0xC6858E06B7L};
const BIG_528_60 CURVE_Gy_NIST521= {0x8BE94769FD16650L,0x3C7086A272C2408L,0xB9013FAD076135L,0x72995EF42640C55L,0xD17273E662C97EEL,0x49579B446817AFBL,0x42C7D1BD998F544L,0x9A3BC0045C8A5FBL,0x11839296A78L};
const BIG_528_60 CURVE_HTPC_NIST521= {0xFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFL,0xFFFFFFFFFFL};
#endif

