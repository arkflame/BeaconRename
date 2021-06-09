package dev._2lstudios.utils;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Sound;

public class ListUtils {
    public static List<Sound> toSoundList(final List<String> strings) {
        final List<Sound> sounds = new ArrayList<Sound>();

        for (final Sound sound : Sound.values()) {
            if (strings.contains(sound.name())) {
                sounds.add(sound);
            }
        }

        return sounds;
    }

    private static int getRandomIndex(final List<?> list) {
        return (int) (Math.random() * list.size());
    }

    public static String getRandomString(final List<String> list) {
        return list.get(getRandomIndex(list));
    }

    public static Sound getRandomSound(final List<Sound> list) {
        return list.get(getRandomIndex(list));
    }
}
