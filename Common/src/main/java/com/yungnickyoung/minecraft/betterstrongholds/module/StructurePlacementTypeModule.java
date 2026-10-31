package com.yungnickyoung.minecraft.betterstrongholds.module;

import com.mojang.serialization.MapCodec;
import com.yungnickyoung.minecraft.betterstrongholds.BetterStrongholdsCommon;
import com.yungnickyoung.minecraft.betterstrongholds.world.placement.BetterStrongholdsPlacement;
import com.yungnickyoung.minecraft.yungsapi.api.autoregister.AutoRegister;

@AutoRegister(BetterStrongholdsCommon.MOD_ID)
public class StructurePlacementTypeModule {
    @AutoRegister("stronghold")
    public static final MapCodec<BetterStrongholdsPlacement> BETTER_STRONGHOLD_PLACEMENT = BetterStrongholdsPlacement.CODEC;
}
