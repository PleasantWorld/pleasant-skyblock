package com.pleasantworld.skyblock;

import com.pleasantworld.skyblock.logging.LogType;
import com.pleasantworld.skyblock.logging.Logger;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import org.bukkit.World;
import org.bukkit.WorldCreator;
import org.bukkit.plugin.java.JavaPlugin;

@FieldDefaults(level = AccessLevel.PRIVATE)
public final class SkyblockPlugin extends JavaPlugin {

    @Getter
    static SkyblockPlugin instance;

    @Override
    public void onEnable() {

        instance = this;

        createVoidWorld().getWorldBorder().reset();

        Logger.log(LogType.INFO, "Плагин успешно запущен");
    }

    @Override
    public void onDisable() {

        instance = null;
    }

    private World createVoidWorld() {
        return WorldCreator.name("island")
                .generator(new EmptyWorldGenerator())
                .createWorld();
    }
}