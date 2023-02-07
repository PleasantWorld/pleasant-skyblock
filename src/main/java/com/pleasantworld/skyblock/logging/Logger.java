package com.pleasantworld.skyblock.logging;

import lombok.experimental.UtilityClass;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

@UtilityClass
public final class Logger {

    @Contract(pure = true)
    public void log(@NotNull LogType type, String message) {
        System.out.println(type.getColor() + "[Skyblock] " + message);
    }
    
}
