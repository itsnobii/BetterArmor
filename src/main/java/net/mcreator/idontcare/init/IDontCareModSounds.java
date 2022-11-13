
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.idontcare.init;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

public class IDontCareModSounds {
	public static SoundEvent RICK = new SoundEvent(new ResourceLocation("i_dont_care", "rick"));

	public static void load() {
		Registry.register(Registry.SOUND_EVENT, new ResourceLocation("i_dont_care", "rick"), RICK);
	}
}
