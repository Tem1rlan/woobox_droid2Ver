package com.iqonic.woobox.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0003\b\u00a9\u0001\b\u0086\b\u0018\u00002\u00020\u0001B\u009b\u0005\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001c\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001f\u001a\u00020\b\u0012\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u0012\b\b\u0002\u0010!\u001a\u00020\u0019\u0012\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0003\u0012\b\b\u0002\u0010$\u001a\u00020\b\u0012\b\b\u0002\u0010%\u001a\u00020\b\u0012\b\b\u0002\u0010&\u001a\u00020\u0019\u0012\b\b\u0002\u0010\'\u001a\u00020\u0006\u0012\b\b\u0002\u0010(\u001a\u00020\b\u0012\b\b\u0002\u0010)\u001a\u00020\u0019\u0012\b\b\u0002\u0010*\u001a\u00020\u0006\u0012\b\b\u0002\u0010+\u001a\u00020\u0006\u0012\b\b\u0002\u0010,\u001a\u00020\u0006\u0012\b\b\u0002\u0010-\u001a\u00020\b\u0012\b\b\u0002\u0010.\u001a\u00020\u0006\u0012\b\b\u0002\u0010/\u001a\u00020\u0019\u0012\b\b\u0002\u00100\u001a\u00020\u0006\u0012\u000e\b\u0002\u00101\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u0012\b\b\u0002\u00102\u001a\u00020\b\u0012\b\b\u0002\u00103\u001a\u00020\u0006\u0012\b\b\u0002\u00104\u001a\u00020\u0006\u0012\b\b\u0002\u00105\u001a\u00020\u0019\u0012\b\b\u0002\u00106\u001a\u00020\b\u0012\b\b\u0002\u00107\u001a\u00020\b\u0012\b\b\u0002\u00108\u001a\u00020\u0006\u0012\b\b\u0002\u00109\u001a\u00020\u0006\u0012\b\b\u0002\u0010:\u001a\u00020\u0006\u0012\b\b\u0002\u0010;\u001a\u00020\b\u0012\b\b\u0002\u0010<\u001a\u00020\u0006\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u0019\u0012\u000e\b\u0002\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u0012\b\b\u0002\u0010?\u001a\u00020\u0006\u0012\b\b\u0002\u0010@\u001a\u00020\u0006\u0012\b\b\u0002\u0010A\u001a\u00020\u0006\u0012\b\b\u0002\u0010B\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00190\u0003\u0012\b\b\u0002\u0010D\u001a\u00020\b\u0012\b\b\u0002\u0010E\u001a\u00020\u0006\u00a2\u0006\u0002\u0010FJ\u0010\u0010\u008a\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\n\u0010\u008b\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u008c\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u008d\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u008e\u0001\u001a\u00020\u0006H\u00c6\u0003J\u0010\u0010\u008f\u0001\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u00c6\u0003J\n\u0010\u0090\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u0091\u0001\u001a\u00020\u0017H\u00c6\u0003J\n\u0010\u0092\u0001\u001a\u00020\u0019H\u00c6\u0003J\n\u0010\u0093\u0001\u001a\u00020\u0019H\u00c6\u0003J\n\u0010\u0094\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u0095\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u0096\u0001\u001a\u00020\bH\u00c6\u0003J\u0010\u0010\u0097\u0001\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u00c6\u0003J\n\u0010\u0098\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u0099\u0001\u001a\u00020\bH\u00c6\u0003J\u0010\u0010\u009a\u0001\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u00c6\u0003J\n\u0010\u009b\u0001\u001a\u00020\u0019H\u00c6\u0003J\u0010\u0010\u009c\u0001\u001a\b\u0012\u0004\u0012\u00020#0\u0003H\u00c6\u0003J\n\u0010\u009d\u0001\u001a\u00020\bH\u00c6\u0003J\n\u0010\u009e\u0001\u001a\u00020\bH\u00c6\u0003J\n\u0010\u009f\u0001\u001a\u00020\u0019H\u00c6\u0003J\n\u0010\u00a0\u0001\u001a\u00020\bH\u00c6\u0003J\n\u0010\u00a1\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u00a2\u0001\u001a\u00020\bH\u00c6\u0003J\n\u0010\u00a3\u0001\u001a\u00020\u0019H\u00c6\u0003J\n\u0010\u00a4\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u00a5\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u00a6\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u00a7\u0001\u001a\u00020\bH\u00c6\u0003J\n\u0010\u00a8\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u00a9\u0001\u001a\u00020\u0019H\u00c6\u0003J\n\u0010\u00aa\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u00ab\u0001\u001a\u00020\u0006H\u00c6\u0003J\u0010\u0010\u00ac\u0001\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u00c6\u0003J\n\u0010\u00ad\u0001\u001a\u00020\bH\u00c6\u0003J\n\u0010\u00ae\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u00af\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u00b0\u0001\u001a\u00020\u0019H\u00c6\u0003J\n\u0010\u00b1\u0001\u001a\u00020\bH\u00c6\u0003J\n\u0010\u00b2\u0001\u001a\u00020\bH\u00c6\u0003J\n\u0010\u00b3\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u00b4\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u00b5\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u00b6\u0001\u001a\u00020\bH\u00c6\u0003J\n\u0010\u00b7\u0001\u001a\u00020\bH\u00c6\u0003J\n\u0010\u00b8\u0001\u001a\u00020\u0006H\u00c6\u0003J\u0012\u0010\u00b9\u0001\u001a\u0004\u0018\u00010\u0019H\u00c6\u0003\u00a2\u0006\u0003\u0010\u0080\u0001J\u0010\u0010\u00ba\u0001\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u00c6\u0003J\n\u0010\u00bb\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u00bc\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u00bd\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u00be\u0001\u001a\u00020\u0006H\u00c6\u0003J\u0010\u0010\u00bf\u0001\u001a\b\u0012\u0004\u0012\u00020\u00190\u0003H\u00c6\u0003J\n\u0010\u00c0\u0001\u001a\u00020\bH\u00c6\u0003J\n\u0010\u00c1\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u00c2\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u00c3\u0001\u001a\u00020\u0006H\u00c6\u0003J\u0010\u0010\u00c4\u0001\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003H\u00c6\u0003J\u0010\u0010\u00c5\u0001\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u00c6\u0003J\u00a6\u0005\u0010\u00c6\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00062\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\b2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00062\b\b\u0002\u0010\u001f\u001a\u00020\b2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010!\u001a\u00020\u00192\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u00032\b\b\u0002\u0010$\u001a\u00020\b2\b\b\u0002\u0010%\u001a\u00020\b2\b\b\u0002\u0010&\u001a\u00020\u00192\b\b\u0002\u0010\'\u001a\u00020\u00062\b\b\u0002\u0010(\u001a\u00020\b2\b\b\u0002\u0010)\u001a\u00020\u00192\b\b\u0002\u0010*\u001a\u00020\u00062\b\b\u0002\u0010+\u001a\u00020\u00062\b\b\u0002\u0010,\u001a\u00020\u00062\b\b\u0002\u0010-\u001a\u00020\b2\b\b\u0002\u0010.\u001a\u00020\u00062\b\b\u0002\u0010/\u001a\u00020\u00192\b\b\u0002\u00100\u001a\u00020\u00062\u000e\b\u0002\u00101\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u00102\u001a\u00020\b2\b\b\u0002\u00103\u001a\u00020\u00062\b\b\u0002\u00104\u001a\u00020\u00062\b\b\u0002\u00105\u001a\u00020\u00192\b\b\u0002\u00106\u001a\u00020\b2\b\b\u0002\u00107\u001a\u00020\b2\b\b\u0002\u00108\u001a\u00020\u00062\b\b\u0002\u00109\u001a\u00020\u00062\b\b\u0002\u0010:\u001a\u00020\u00062\b\b\u0002\u0010;\u001a\u00020\b2\b\b\u0002\u0010<\u001a\u00020\u00062\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u00192\u000e\b\u0002\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010?\u001a\u00020\u00062\b\b\u0002\u0010@\u001a\u00020\u00062\b\b\u0002\u0010A\u001a\u00020\u00062\b\b\u0002\u0010B\u001a\u00020\u00062\u000e\b\u0002\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00190\u00032\b\b\u0002\u0010D\u001a\u00020\b2\b\b\u0002\u0010E\u001a\u00020\u0006H\u00c6\u0001\u00a2\u0006\u0003\u0010\u00c7\u0001J\u0015\u0010\u00c8\u0001\u001a\u00020\b2\t\u0010\u00c9\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\n\u0010\u00ca\u0001\u001a\u00020\u0019H\u00d6\u0001J\n\u0010\u00cb\u0001\u001a\u00020\u0006H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u0010JR\u0011\u0010\n\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u0010LR\u0011\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u0010JR\u0011\u0010\f\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u0010JR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u0010HR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u0010HR\u0011\u0010\u0010\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bS\u0010JR\u0011\u0010\u0011\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bT\u0010JR\u0011\u0010\u0012\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bU\u0010JR\u0011\u0010\u0013\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u0010JR\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bW\u0010HR\u0011\u0010\u0015\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bX\u0010JR\u0011\u0010\u0016\u001a\u00020\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\bY\u0010ZR\u0011\u0010\u0018\u001a\u00020\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b[\u0010\\R\u0011\u0010\u001a\u001a\u00020\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b]\u0010\\R\u0011\u0010\u001b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b^\u0010JR\u0011\u0010\u001c\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b_\u0010LR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b`\u0010HR\u0011\u0010\u001e\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\ba\u0010JR\u0011\u0010\u001f\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\bb\u0010LR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bc\u0010HR\u0011\u0010!\u001a\u00020\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\bd\u0010\\R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\be\u0010HR\u0011\u0010$\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\bf\u0010LR\u0011\u0010%\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\bg\u0010LR\u0011\u0010&\u001a\u00020\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\bh\u0010\\R\u0011\u0010\'\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bi\u0010JR\u0011\u0010(\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\bj\u0010LR\u0011\u0010)\u001a\u00020\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\bk\u0010\\R\u0011\u0010*\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bl\u0010JR\u0011\u0010+\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bm\u0010JR\u0011\u0010,\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bn\u0010JR\u0011\u0010-\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\bo\u0010LR\u0011\u0010.\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bp\u0010JR\u0011\u0010/\u001a\u00020\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\bq\u0010\\R\u0011\u00100\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\br\u0010JR\u0017\u00101\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bs\u0010HR\u0011\u00102\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\bt\u0010LR\u0011\u00103\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bu\u0010JR\u0011\u00104\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bv\u0010JR\u0011\u00105\u001a\u00020\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\bw\u0010\\R\u0011\u00106\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\bx\u0010LR\u0011\u00107\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\by\u0010LR\u0011\u00108\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bz\u0010JR\u0011\u00109\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b{\u0010JR\u0011\u0010:\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b|\u0010JR\u0011\u0010;\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b}\u0010LR\u0011\u0010<\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b~\u0010JR\u0017\u0010=\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\f\n\u0003\u0010\u0081\u0001\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0018\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0082\u0001\u0010HR\u0012\u0010?\u001a\u00020\u0006\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0083\u0001\u0010JR\u0012\u0010@\u001a\u00020\u0006\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0084\u0001\u0010JR\u0012\u0010A\u001a\u00020\u0006\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0085\u0001\u0010JR\u0012\u0010B\u001a\u00020\u0006\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0086\u0001\u0010JR\u0018\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00190\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0087\u0001\u0010HR\u0012\u0010D\u001a\u00020\b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0088\u0001\u0010LR\u0012\u0010E\u001a\u00020\u0006\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0089\u0001\u0010J\u00a8\u0006\u00cc\u0001"}, d2 = {"Lcom/iqonic/woobox/models/ProductModelNew;", "", "attributes", "", "Lcom/iqonic/woobox/models/Attribute;", "average_rating", "", "backordered", "", "backorders", "backorders_allowed", "button_text", "catalog_visibility", "categories", "Lcom/iqonic/woobox/models/ProductCategory;", "cross_sell_ids", "date_created", "date_modified", "date_on_sale_from", "date_on_sale_to", "default_attributes", "description", "dimensions", "Lcom/iqonic/woobox/models/Dimensions;", "download_expiry", "", "download_limit", "download_type", "downloadable", "downloads", "external_url", "featured", "grouped_products", "id", "images", "Lcom/iqonic/woobox/models/Image;", "in_stock", "manage_stock", "menu_order", "name", "on_sale", "parent_id", "permalink", "price", "price_html", "purchasable", "purchase_note", "rating_count", "regular_price", "related_ids", "reviews_allowed", "sale_price", "shipping_class", "shipping_class_id", "shipping_required", "shipping_taxable", "short_description", "sku", "slug", "sold_individually", "status", "stock_quantity", "tags", "tax_class", "tax_status", "total_sales", "type", "variations", "virtual", "weight", "(Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/iqonic/woobox/models/Dimensions;IILjava/lang/String;ZLjava/util/List;Ljava/lang/String;ZLjava/util/List;ILjava/util/List;ZZILjava/lang/String;ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;IZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;)V", "getAttributes", "()Ljava/util/List;", "getAverage_rating", "()Ljava/lang/String;", "getBackordered", "()Z", "getBackorders", "getBackorders_allowed", "getButton_text", "getCatalog_visibility", "getCategories", "getCross_sell_ids", "getDate_created", "getDate_modified", "getDate_on_sale_from", "getDate_on_sale_to", "getDefault_attributes", "getDescription", "getDimensions", "()Lcom/iqonic/woobox/models/Dimensions;", "getDownload_expiry", "()I", "getDownload_limit", "getDownload_type", "getDownloadable", "getDownloads", "getExternal_url", "getFeatured", "getGrouped_products", "getId", "getImages", "getIn_stock", "getManage_stock", "getMenu_order", "getName", "getOn_sale", "getParent_id", "getPermalink", "getPrice", "getPrice_html", "getPurchasable", "getPurchase_note", "getRating_count", "getRegular_price", "getRelated_ids", "getReviews_allowed", "getSale_price", "getShipping_class", "getShipping_class_id", "getShipping_required", "getShipping_taxable", "getShort_description", "getSku", "getSlug", "getSold_individually", "getStatus", "getStock_quantity", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTags", "getTax_class", "getTax_status", "getTotal_sales", "getType", "getVariations", "getVirtual", "getWeight", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component6", "component60", "component7", "component8", "component9", "copy", "(Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/iqonic/woobox/models/Dimensions;IILjava/lang/String;ZLjava/util/List;Ljava/lang/String;ZLjava/util/List;ILjava/util/List;ZZILjava/lang/String;ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;IZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;)Lcom/iqonic/woobox/models/ProductModelNew;", "equals", "other", "hashCode", "toString", "app_debug"})
public final class ProductModelNew {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.iqonic.woobox.models.Attribute> attributes = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String average_rating = null;
    private final boolean backordered = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String backorders = null;
    private final boolean backorders_allowed = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String button_text = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String catalog_visibility = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.iqonic.woobox.models.ProductCategory> categories = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Object> cross_sell_ids = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String date_created = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String date_modified = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String date_on_sale_from = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String date_on_sale_to = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Object> default_attributes = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String description = null;
    @org.jetbrains.annotations.NotNull()
    private final com.iqonic.woobox.models.Dimensions dimensions = null;
    private final int download_expiry = 0;
    private final int download_limit = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String download_type = null;
    private final boolean downloadable = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Object> downloads = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String external_url = null;
    private final boolean featured = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Object> grouped_products = null;
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.iqonic.woobox.models.Image> images = null;
    private final boolean in_stock = false;
    private final boolean manage_stock = false;
    private final int menu_order = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    private final boolean on_sale = false;
    private final int parent_id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String permalink = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String price = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String price_html = null;
    private final boolean purchasable = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String purchase_note = null;
    private final int rating_count = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String regular_price = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Object> related_ids = null;
    private final boolean reviews_allowed = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String sale_price = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String shipping_class = null;
    private final int shipping_class_id = 0;
    private final boolean shipping_required = false;
    private final boolean shipping_taxable = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String short_description = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String sku = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String slug = null;
    private final boolean sold_individually = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String status = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer stock_quantity = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Object> tags = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String tax_class = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String tax_status = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String total_sales = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String type = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Integer> variations = null;
    private final boolean virtual = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String weight = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.iqonic.woobox.models.Attribute> getAttributes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAverage_rating() {
        return null;
    }
    
    public final boolean getBackordered() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBackorders() {
        return null;
    }
    
    public final boolean getBackorders_allowed() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getButton_text() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCatalog_visibility() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.iqonic.woobox.models.ProductCategory> getCategories() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> getCross_sell_ids() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDate_created() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDate_modified() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDate_on_sale_from() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDate_on_sale_to() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> getDefault_attributes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.iqonic.woobox.models.Dimensions getDimensions() {
        return null;
    }
    
    public final int getDownload_expiry() {
        return 0;
    }
    
    public final int getDownload_limit() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDownload_type() {
        return null;
    }
    
    public final boolean getDownloadable() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> getDownloads() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getExternal_url() {
        return null;
    }
    
    public final boolean getFeatured() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> getGrouped_products() {
        return null;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.iqonic.woobox.models.Image> getImages() {
        return null;
    }
    
    public final boolean getIn_stock() {
        return false;
    }
    
    public final boolean getManage_stock() {
        return false;
    }
    
    public final int getMenu_order() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final boolean getOn_sale() {
        return false;
    }
    
    public final int getParent_id() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPermalink() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPrice() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPrice_html() {
        return null;
    }
    
    public final boolean getPurchasable() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPurchase_note() {
        return null;
    }
    
    public final int getRating_count() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRegular_price() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> getRelated_ids() {
        return null;
    }
    
    public final boolean getReviews_allowed() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSale_price() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getShipping_class() {
        return null;
    }
    
    public final int getShipping_class_id() {
        return 0;
    }
    
    public final boolean getShipping_required() {
        return false;
    }
    
    public final boolean getShipping_taxable() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getShort_description() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSku() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSlug() {
        return null;
    }
    
    public final boolean getSold_individually() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getStock_quantity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> getTags() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTax_class() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTax_status() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTotal_sales() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getVariations() {
        return null;
    }
    
    public final boolean getVirtual() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWeight() {
        return null;
    }
    
    public ProductModelNew(@org.jetbrains.annotations.NotNull()
    java.util.List<com.iqonic.woobox.models.Attribute> attributes, @org.jetbrains.annotations.NotNull()
    java.lang.String average_rating, boolean backordered, @org.jetbrains.annotations.NotNull()
    java.lang.String backorders, boolean backorders_allowed, @org.jetbrains.annotations.NotNull()
    java.lang.String button_text, @org.jetbrains.annotations.NotNull()
    java.lang.String catalog_visibility, @org.jetbrains.annotations.NotNull()
    java.util.List<com.iqonic.woobox.models.ProductCategory> categories, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> cross_sell_ids, @org.jetbrains.annotations.NotNull()
    java.lang.String date_created, @org.jetbrains.annotations.NotNull()
    java.lang.String date_modified, @org.jetbrains.annotations.NotNull()
    java.lang.String date_on_sale_from, @org.jetbrains.annotations.NotNull()
    java.lang.String date_on_sale_to, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> default_attributes, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    com.iqonic.woobox.models.Dimensions dimensions, int download_expiry, int download_limit, @org.jetbrains.annotations.NotNull()
    java.lang.String download_type, boolean downloadable, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> downloads, @org.jetbrains.annotations.NotNull()
    java.lang.String external_url, boolean featured, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> grouped_products, int id, @org.jetbrains.annotations.NotNull()
    java.util.List<com.iqonic.woobox.models.Image> images, boolean in_stock, boolean manage_stock, int menu_order, @org.jetbrains.annotations.NotNull()
    java.lang.String name, boolean on_sale, int parent_id, @org.jetbrains.annotations.NotNull()
    java.lang.String permalink, @org.jetbrains.annotations.NotNull()
    java.lang.String price, @org.jetbrains.annotations.NotNull()
    java.lang.String price_html, boolean purchasable, @org.jetbrains.annotations.NotNull()
    java.lang.String purchase_note, int rating_count, @org.jetbrains.annotations.NotNull()
    java.lang.String regular_price, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> related_ids, boolean reviews_allowed, @org.jetbrains.annotations.NotNull()
    java.lang.String sale_price, @org.jetbrains.annotations.NotNull()
    java.lang.String shipping_class, int shipping_class_id, boolean shipping_required, boolean shipping_taxable, @org.jetbrains.annotations.NotNull()
    java.lang.String short_description, @org.jetbrains.annotations.NotNull()
    java.lang.String sku, @org.jetbrains.annotations.NotNull()
    java.lang.String slug, boolean sold_individually, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.Nullable()
    java.lang.Integer stock_quantity, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> tags, @org.jetbrains.annotations.NotNull()
    java.lang.String tax_class, @org.jetbrains.annotations.NotNull()
    java.lang.String tax_status, @org.jetbrains.annotations.NotNull()
    java.lang.String total_sales, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> variations, boolean virtual, @org.jetbrains.annotations.NotNull()
    java.lang.String weight) {
        super();
    }
    
    public ProductModelNew() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.iqonic.woobox.models.Attribute> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    public final boolean component3() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    public final boolean component5() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.iqonic.woobox.models.ProductCategory> component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.iqonic.woobox.models.Dimensions component16() {
        return null;
    }
    
    public final int component17() {
        return 0;
    }
    
    public final int component18() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component19() {
        return null;
    }
    
    public final boolean component20() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> component21() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component22() {
        return null;
    }
    
    public final boolean component23() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> component24() {
        return null;
    }
    
    public final int component25() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.iqonic.woobox.models.Image> component26() {
        return null;
    }
    
    public final boolean component27() {
        return false;
    }
    
    public final boolean component28() {
        return false;
    }
    
    public final int component29() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component30() {
        return null;
    }
    
    public final boolean component31() {
        return false;
    }
    
    public final int component32() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component33() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component34() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component35() {
        return null;
    }
    
    public final boolean component36() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component37() {
        return null;
    }
    
    public final int component38() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component39() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> component40() {
        return null;
    }
    
    public final boolean component41() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component42() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component43() {
        return null;
    }
    
    public final int component44() {
        return 0;
    }
    
    public final boolean component45() {
        return false;
    }
    
    public final boolean component46() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component47() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component48() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component49() {
        return null;
    }
    
    public final boolean component50() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component51() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component52() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> component53() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component54() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component55() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component56() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component57() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> component58() {
        return null;
    }
    
    public final boolean component59() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component60() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.iqonic.woobox.models.ProductModelNew copy(@org.jetbrains.annotations.NotNull()
    java.util.List<com.iqonic.woobox.models.Attribute> attributes, @org.jetbrains.annotations.NotNull()
    java.lang.String average_rating, boolean backordered, @org.jetbrains.annotations.NotNull()
    java.lang.String backorders, boolean backorders_allowed, @org.jetbrains.annotations.NotNull()
    java.lang.String button_text, @org.jetbrains.annotations.NotNull()
    java.lang.String catalog_visibility, @org.jetbrains.annotations.NotNull()
    java.util.List<com.iqonic.woobox.models.ProductCategory> categories, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> cross_sell_ids, @org.jetbrains.annotations.NotNull()
    java.lang.String date_created, @org.jetbrains.annotations.NotNull()
    java.lang.String date_modified, @org.jetbrains.annotations.NotNull()
    java.lang.String date_on_sale_from, @org.jetbrains.annotations.NotNull()
    java.lang.String date_on_sale_to, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> default_attributes, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    com.iqonic.woobox.models.Dimensions dimensions, int download_expiry, int download_limit, @org.jetbrains.annotations.NotNull()
    java.lang.String download_type, boolean downloadable, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> downloads, @org.jetbrains.annotations.NotNull()
    java.lang.String external_url, boolean featured, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> grouped_products, int id, @org.jetbrains.annotations.NotNull()
    java.util.List<com.iqonic.woobox.models.Image> images, boolean in_stock, boolean manage_stock, int menu_order, @org.jetbrains.annotations.NotNull()
    java.lang.String name, boolean on_sale, int parent_id, @org.jetbrains.annotations.NotNull()
    java.lang.String permalink, @org.jetbrains.annotations.NotNull()
    java.lang.String price, @org.jetbrains.annotations.NotNull()
    java.lang.String price_html, boolean purchasable, @org.jetbrains.annotations.NotNull()
    java.lang.String purchase_note, int rating_count, @org.jetbrains.annotations.NotNull()
    java.lang.String regular_price, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> related_ids, boolean reviews_allowed, @org.jetbrains.annotations.NotNull()
    java.lang.String sale_price, @org.jetbrains.annotations.NotNull()
    java.lang.String shipping_class, int shipping_class_id, boolean shipping_required, boolean shipping_taxable, @org.jetbrains.annotations.NotNull()
    java.lang.String short_description, @org.jetbrains.annotations.NotNull()
    java.lang.String sku, @org.jetbrains.annotations.NotNull()
    java.lang.String slug, boolean sold_individually, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.Nullable()
    java.lang.Integer stock_quantity, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> tags, @org.jetbrains.annotations.NotNull()
    java.lang.String tax_class, @org.jetbrains.annotations.NotNull()
    java.lang.String tax_status, @org.jetbrains.annotations.NotNull()
    java.lang.String total_sales, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> variations, boolean virtual, @org.jetbrains.annotations.NotNull()
    java.lang.String weight) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}