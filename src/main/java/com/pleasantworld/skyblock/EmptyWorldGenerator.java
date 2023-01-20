package com.pleasantworld.skyblock;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.generator.BlockPopulator;
import org.bukkit.generator.ChunkGenerator;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EmptyWorldGenerator extends ChunkGenerator {

    public @NotNull List<BlockPopulator> getDefaultPopulators(@NotNull World world) {
        return new ArrayList<>();
    }

    public boolean canSpawn(@NotNull World world, int x, int z) {
        return true;
    }

    public byte[] generate(World world, Random rand, int chunkX, int chunkZ) {
        return new byte[32768];
    }

    public Location getFixedSpawnLocation(@NotNull World world, @NotNull Random random) {
        return new Location(world, 0, 100, 0);
    }
}