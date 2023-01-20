package com.pleasantworld.skyblock.util;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import org.bukkit.Material;
import org.bukkit.block.Biome;

import java.util.Arrays;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public enum SchematicType {

    DEFAULT(Material.GRASS_BLOCK, "default.schematic", Biome.PLAINS);

    Material material;
    String fileName;
    Biome biome;

    /**
     * Получить тип острова
     * @param name - название
     * @return - тип
     */
    public static SchematicType getType(String name) {
        return Arrays.stream(values())
                .filter(islandType -> islandType.fileName.equals(name))
                .findFirst()
                .orElse(SchematicType.DEFAULT);
    }
}