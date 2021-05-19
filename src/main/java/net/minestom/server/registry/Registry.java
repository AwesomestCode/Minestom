package net.minestom.server.registry;

import net.minestom.server.attribute.Attribute;
import net.minestom.server.entity.EntityType;
import net.minestom.server.entity.metadata.villager.VillagerProfession;
import net.minestom.server.entity.metadata.villager.VillagerType;
import net.minestom.server.fluid.Fluid;
import net.minestom.server.item.Enchantment;
import net.minestom.server.item.Material;
import net.minestom.server.particle.Particle;
import net.minestom.server.potion.PotionEffect;
import net.minestom.server.potion.PotionType;
import net.minestom.server.sound.SoundEvent;
import net.minestom.server.statistic.StatisticType;

public final class Registry {

    public static final IdCrossMapRegistry.Defaulted<Fluid> FLUID_REGISTRY = new IdCrossMapRegistry.Defaulted<>(() -> Fluid.EMPTY);

    public static final IdCrossMapRegistry.Defaulted<Material> MATERIAL_REGISTRY = new IdCrossMapRegistry.Defaulted<>(() -> Material.AIR);

    public static final IdCrossMapRegistry<Enchantment> ENCHANTMENT_REGISTRY = new IdCrossMapRegistry<>();

    public static final MapRegistry<Attribute> ATTRIBUTE_REGISTRY = new MapRegistry<>();

    public static final IdCrossMapRegistry<EntityType> ENTITY_TYPE_REGISTRY = new IdCrossMapRegistry<>();

    public static final IdCrossMapRegistry<VillagerProfession> VILLAGER_PROFESSION_REGISTRY = new IdCrossMapRegistry<>();

    public static final IdCrossMapRegistry<VillagerType> VILLAGER_TYPE_REGISTRY = new IdCrossMapRegistry<>();

    public static final IdCrossMapRegistry<Particle> PARTICLE_REGISTRY = new IdCrossMapRegistry<>();

    public static final MapRegistry.Defaulted<PotionType> POTION_TYPE_REGISTRY = new MapRegistry.Defaulted<>(() -> PotionType.EMPTY);

    public static final IdCrossMapRegistry<PotionEffect> POTION_EFFECT_REGISTRY = new IdCrossMapRegistry<>();

    public static final IdCrossMapRegistry<SoundEvent> SOUND_EVENT_REGISTRY = new IdCrossMapRegistry<>();

    public static final IdCrossMapRegistry<StatisticType> STATISTIC_TYPE_REGISTRY = new IdCrossMapRegistry<>();
}
