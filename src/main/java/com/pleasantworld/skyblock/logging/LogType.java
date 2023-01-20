package com.pleasantworld.skyblock.logging;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import org.bukkit.ChatColor;

@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public enum LogType {

    INFO(ChatColor.WHITE),
    WARNING(ChatColor.YELLOW),
    ERROR(ChatColor.RED);

    ChatColor color;
}