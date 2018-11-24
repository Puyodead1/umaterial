package me.randomHashTags.UMaterial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    This code is created and owned by RandomHashTags, and is licensed under the GNU Affero General Public License v3.0 (https://choosealicense.com/licenses/agpl-3.0/)
    You can find RandomHashTags (me) at
        Discord - RandomHashTags#1948
        Email - imrandomhashtags@gmail.com
        GitHub - https://github.com/RandomHashTags
        GitLab - https://gitlab.com/RandomHashTags
        MCMarket - https://www.mc-market.org/members/20858/
        PayPal - imrandomhashtags@gmail.com
        SpigotMC - https://www.spigotmc.org/members/randomhashtags.76364/
        Twitter - https://twitter.com/irandomhashtags
 */
public enum UMaterial {
    // <item>(1.8.8, 1.9, 1.10, 1.11, 1.12, 1.13, 1.14)
    // 1.8 = http://docs.codelanx.com/Bukkit/1.8/org/bukkit/Material.html
    // 1.13 = https://hub.spigotmc.org/javadocs/bukkit/org/bukkit/Material.html
    // 1.13 visual = https://www.digminecraft.com/lists/item_id_list_pc.php
    // Terracotta (Renamed from Stained Clay) = https://minecraft.gamepedia.com/Terracotta
    // Glazed Terracotta = https://minecraft.gamepedia.com/Glazed_Terracotta
    // Shulker boxes = https://minecraft.gamepedia.com/Shulker_Box
    // Glass Panes = https://minecraft.gamepedia.com/Glass_Pane
    // Wool = https://minecraft.gamepedia.com/Wool
    // Bed = https://minecraft.gamepedia.com/Bed
    // Spawn Eggs = https://minecraft.gamepedia.com/Spawn_Egg
    // Banner = https://minecraft.gamepedia.com/Banner
    // Carpet = https://minecraft.gamepedia.com/Carpet
    // Concrete = https://minecraft.gamepedia.com/Concrete
    // Concrete Powder = https://minecraft.gamepedia.com/Concrete_powder
    // Command Block = https://minecraft.gamepedia.com/Command_Block
    ACACIA_BOAT(Arrays.asList("BOAT", null, null, null, null, "ACACIA_BOAT"), 0),
    ACACIA_BUTTON(Arrays.asList("WOOD_BUTTON", null, null, null, null, "ACACIA_BUTTON"), 0),
    ACACIA_DOOR(Arrays.asList("ACACIA_DOOR_ITEM", null, null, null, null, "ACACIA_DOOR"), 0),
    ACACIA_FENCE("ACACIA_FENCE", 0),
    ACACIA_FENCE_GATE("ACACIA_FENCE_GATE", 0),
    ACACIA_LEAVES(Arrays.asList("LEAVES_2", null, null, null, null, "ACACIA_LEAVES"), 0),
    ACACIA_LOG(Arrays.asList("LOG_2", null, null, null, null, "ACACIA_LOG"), 4),
    ACACIA_PLANKS(Arrays.asList("WOOD", null, null, null, null, "ACACIA_PLANKS"), 4),
    ACACIA_PRESSURE_PLATE(Arrays.asList("WOOD_PLATE", null, null, null, null, "ACACIA_PRESSURE_PLATE"), 0),
    ACACIA_SAPLING(Arrays.asList("SAPLING", null, null, null, null, "ACACIA_SAPLING"), 4),
    ACACIA_SLAB(Arrays.asList("WOOD_STEP", null, null, null, null, "ACACIA_SLAB"), 4),
    ACACIA_STAIRS("ACACIA_STAIRS", 0),
    ACACIA_TRAPDOOR(Arrays.asList("TRAP_DOOR", null, null, null, null, "ACACIA_TRAPDOOR"), 0),
    ACACIA_WOOD(Arrays.asList("LOG_2", null, null, null, null, "ACACIA_WOOD"), 4),
    ACTIVATOR_RAIL("ACTIVATOR_RAIL", 0),
    AIR("AIR", 0),
    ALLIUM(Arrays.asList("RED_ROSE", null, null, null, null, "ALLIUM"), 1),
    ANDESITE(Arrays.asList("STONE", null, null, null, null, "ANDESITE"), 5),
    ANVIL("ANVIL", 0),
    APPLE("APPLE", 0),
    ARMOR_STAND("ARMOR_STAND", 0),
    ARROW("ARROW", 0),
    ATTACHED_MELON_STEM(Arrays.asList(null, null, null, null, null, "ATTACHED_MELON_STEM"), 0),
    ATTACHED_PUMPKIN_STEM(Arrays.asList(null, null, null, null, null, "ATTACHED_PUMPKIN_STEM"), 0),
    AZURE_BLUET(Arrays.asList("RED_ROSE", null, null, null, null, "AZURE_BLUET"), 1),
    BAKED_POTATO("BAKED_POTATO", 0),
    BARRIER("BARRIER", 0),
    BAT_SPAWN_EGG(Arrays.asList("MONSTER_EGG", null, null, null, null, "BAT_SPAWN_EGG"), 65),
    BEACON("BEACON", 0),
    BEDROCK("BEDROCK", 0),
    BEEF(Arrays.asList("COOKED_BEEF", null, null, null, null, "BEEF"), 0),
    BEETROOT(Arrays.asList("SEEDS", null, null, null, null, "BEETROOT"), 0),
    BEETROOT_SEEDS(Arrays.asList("SEEDS", null, null, null, null, "BEETROOT_SEEDS"), 0),
    BEETROOT_SOUP(Arrays.asList("MUSHROOM_SOUP", null, null, null, null, "BEETROOT_SOUP"), 0),
    BEETROOTS(Arrays.asList("WHEAT", null, null, null, null, "BEETROOTS"), 0),
    BIRCH_BOAT(Arrays.asList("BOAT", null, null, null, null, "BIRCH_BOAT"), 0),
    BIRCH_BUTTON(Arrays.asList("WOOD_BUTTON", null, null, null, null, "BIRCH_BUTTON"), 0),
    BIRCH_DOOR(Arrays.asList("BIRCH_DOOR_ITEM", null, null, null, null, "BIRCH_DOOR"), 0),
    BIRCH_FENCE("BIRCH_FENCE", 0),
    BIRCH_FENCE_GATE("BIRCH_FENCE_GATE", 0),
    BIRCH_LEAVES(Arrays.asList("LEAVES", null, null, null, null, "BIRCH_LEAVES"), 2),
    BIRCH_LOG(Arrays.asList("LOG", null, null, null, null, "BIRCH_LOG"), 2),
    BIRCH_PLANKS(Arrays.asList("WOOD", null, null, null, null, "BIRCH_PLANKS"), 2),
    BIRCH_PRESSURE_PLATE(Arrays.asList("WOOD_PLATE", null, null, null, null, "BIRCH_PRESSURE_PLANK"), 0),
    BIRCH_SAPLING(Arrays.asList("SAPLING", null, null, null, null, "BIRCH_SAPLING"), 2),
    BIRCH_SLAB(Arrays.asList("WOOD_STEP", null, null, null, null, "BIRCH_SLAB"), 2),
    BIRCH_STAIRS(Arrays.asList("BIRCH_WOOD_STAIRS", null, null, null, null, "BIRCH_STAIRS"), 2),
    BIRCH_TRAPDOOR(Arrays.asList("TRAP_DOOR", null, null, null, null, "BIRCH_TRAPDOOR"), 0),
    BIRCH_WOOD(Arrays.asList("LOG", null, null, null, null, "BIRCH_WOOD"), 2),
    BLACK_BANNER(Arrays.asList("BANNER", null, null, null, null, "BLACK_BANNER"), 0),
    BLACK_BED(Arrays.asList("BED", null, null, null, null, "BLACK_BED"), 0),
    BLACK_CARPET(Arrays.asList("CARPET", null, null, null, null, "BLACK_CARPET"), 15),
    BLACK_CONCRETE(Arrays.asList("COAL_BLOCK", null, null, null, null, "BLACK_CONCRETE"), 0),
    BLACK_CONCRETE_POWDER(Arrays.asList("COAL_BLOCK", null, null, null, null, "BLACK_CONCRETE_POWDER"), 0),
    BLACK_GLAZED_TERRACOTTA(Arrays.asList("COAL_BLOCK", null, null, null, "BLACK_GLAZED_TERRACOTTA", null), 0),
    BLACK_SHULKER_BOX(Arrays.asList("TRAPPED_CHEST", null, null, "BLACK_SHULKER_BOX", null, null), 0),
    BLACK_STAINED_GLASS(Arrays.asList("STAINED_GLASS", null, null, null, null, "BLACK_STAINED_GLASS"), 15),
    BLACK_STAINED_GLASS_PANE(Arrays.asList("STAINED_GLASS_PANE", null, null, null, null, "BLACK_STAINED_GLASS_PANE"), 15),
    BLACK_TERRACOTTA(Arrays.asList("COAL_BLOCK", null, null, null, "BLACK_TERRACOTTA", null), 0),
    BLACK_WOOL(Arrays.asList("WOOL", null, null, "BLACK_WOOL", null, null), 15),
    BLAZE_POWDER("BLAZE_POWDER", 0),
    BLAZE_ROD("BLAZE_ROD", 0),
    BLAZE_SPAWN_EGG(Arrays.asList("MONSTER_EGG", null, null, null, null, "BLAZE_SPAWN_EGG"), 61),
    BLUE_BANNER(Arrays.asList("BANNER", null, null, null, null, "BLUE_BANNER"), 4),
    BLUE_BED(Arrays.asList("BED", null, null, null, "BLUE_BED", null), 0),
    BLUE_CARPET(Arrays.asList("CARPET", null, null, "BLUE_CARPET", null, null), 11),
    BLUE_CONCRETE(Arrays.asList("WOOL", null, null, null, "CONCRETE", "BLUE_CONCRETE"), 11),
    BLUE_CONCRETE_POWDER(Arrays.asList("WOOL", null, null, null, "CONCRETE_POWDER", "BLUE_CONCRETE_POWDER"), 11),
    BLUE_GLAZED_TERRACOTTA(Arrays.asList("LAPIS_BLOCK", null, null, null, null, "BLUE_GLAZED_TERRACOTTA"), 11),
    BLUE_ICE(Arrays.asList("PACKED_ICE", null, null, null, null, "BLUE_ICE"), 0),
    BLUE_ORCHID(Arrays.asList("RED_ROSE", null, null, null, null, "BLUE_ORCHID"), 1),
    BLUE_SHULKER_BOX(Arrays.asList("TRAPPED_CHEST", null, null, "BLUE_SHULKER_BOX", null, null), 0),
    BLUE_STAINED_GLASS(Arrays.asList("STAINED_GLASS", null, null, null, null, "BLUE_STAINED_GLASS"), 11),
    BLUE_STAINED_GLASS_PANE(Arrays.asList("STAINED_GLASS_PANE", null, null, null, null, "BLUE_STAINED_GLASS_PANE"), 11),
    BLUE_TERRACOTTA(Arrays.asList("LAPIS_BLOCK", null, null, null, null, "BLUE_TERRACOTTA"), 0),
    BLUE_WALL_BANNER(Arrays.asList("BANNER", null, null, null, null, "BLACK_WALL_BANNER"), 4),
    BLUE_WOOL(Arrays.asList("WOOL", null, null, "BLUE_WOOL", null, null), 11),
    BONE("BONE", 0),
    BONE_BLOCK(Arrays.asList(null, null, "BONE_BLOCK", null, null, null), 0),
    BONE_MEAL(Arrays.asList("INK_SACK", null, null, null, null, "BONE_MEAL"), 15),
    BOOK("BOOK", 0),
    BOOK_AND_QUILL(Arrays.asList("BOOK_AND_QUILL", null, null, null, null, "LEGACY_BOOK_AND_QUILL"), 0),
    BOOKSHELF("BOOKSHELF", 0),
    BOW("BOW", 0),
    BOWL("BOWL", 0),
    BRAIN_CORAL(Arrays.asList(null, null, null, null, null, "BRAIN_CORAL"), 0),
    BRAIN_CORAL_BLOCK(Arrays.asList(null, null, null, null, null, "BRAIN_CORAL_BLOCK"), 0),
    BRAIN_CORAL_FAN(Arrays.asList(null, null, null, null, null, "BRAIN_CORAL_FAN"), 0),
    BRAIN_CORAL_WALL_FAN(Arrays.asList(null, null, null, null, null, "BRAIN_CORAL_WALL_FAN"), 0),
    BREAD("BREAD", 0),
    BREWING_STAND("BREWING_STAND", 0),
    BREWING_STAND_ITEM(Arrays.asList("BREWING_STAND_ITEM", null, null, null, null, "BREWING_STAND"), 0),
    BRICK("BRICK", 0),
    BRICK_STAIRS("BRICK_STAIRS", 0),
    BROWN_BANNER(Arrays.asList("BANNER", null, null, null, null, "BROWN_BANNER"), 3),
    BROWN_BED(Arrays.asList("BED", null, null, null, null, "BROWN_BED"), 0),
    BROWN_CARPET(Arrays.asList("CARPET", null, null, null, null, "BROWN_CARPET"), 12),
    BROWN_CONCRETE(Arrays.asList(null, null, null, null, "", "BROWN_CONCRETE"), 0),
    BROWN_CONCRETE_POWDER(Arrays.asList(null, null, null, null, null, "BROWN_CONCRETE_POWDER"), 0),
    BROWN_GLAZED_TERRACOTTA(Arrays.asList(null, null, null, null, null, "BROWN_GLAZED_TERRACOTTA"), 0),
    BROWN_MUSHROOM("BROWN_MUSHROOM", 0),
    BROWN_MUSHROOM_BLOCK(Arrays.asList(null, null, null, null, null, "BROWN_MUSHROOM_BLOCK"), 0),
    BROWN_SHULKER_BOX(Arrays.asList(null, null, null, "BROWN_SHULKER_BOX"), 0),
    BROWN_STAINED_GLASS(Arrays.asList("STAINED_GLASS", null, null, null, null, "BROWN_STAINED_GLASS"), 12),
    BROWN_STAINED_GLASS_PANE(Arrays.asList("STAINED_GLASS_PANE", null, null, null, null, "BROWN_STAINED_GLASS_PANE"), 12),
    BROWN_TERRACOTTA(Arrays.asList(null, null, null, null, null, "BROWN_TERRACOTTA"), 0),
    BROWN_WOOL(Arrays.asList("WOOL", null, null, "BROWN_WOOL", null, null), 12),
    BUBBLE_COLUMN(Arrays.asList(null, null, null, null, null, "BUBBLE_COLUM"), 0),
    BUBBLE_CORAL(Arrays.asList(null, null, null, null, null, "BUBBLE_CORAL"), 0),
    BUBBLE_CORAL_BLOCK(Arrays.asList(null, null, null, null, null, "BUBBLE_CORAL_BLOCK"), 0),
    BUBBLE_CORAL_FAN(Arrays.asList(null, null, null, null, null, "BUBBLE_CORAL_FAN"), 0),
    BUBBLE_CORAL_WALL_FAN(Arrays.asList(null, null, null, null, null, "BUBBLE_CORAL_WALL_FAN"), 0),
    BUCKET("BUCKET", 0),
    BURNING_FURNACE(Arrays.asList("BURNING_FURNACE", null, null, null, null, "LEGACY_BURNING_FURNACE"), 0),
    CACTUS("CACTUS", 0),
    CACTUS_GREEN(Arrays.asList("INK_SACK", null, null, null, null, "CACTUS_GREEN"), 2),
    CAKE("CAKE", 0),
    CAKE_BLOCK(Arrays.asList("CAKE_BLOCK", null, null, null, null, "CAKE"), 0),
    CARROT("CARROT", 0),
    CARROT_ITEM(Arrays.asList("CARROT_ITEM", null, null, null, null, "CARROT"), 0),
    CARROT_ON_A_STICK(Arrays.asList("CARROT_STICK", null, null, null, null, "CARROT_ON_A_STICK"), 0),
    CARVED_PUMPKIN(Arrays.asList("PUMPKIN", null, null, null, null, "CARVED_PUMPKIN"), 0),
    CAULDRON("CAULDRON", 0),
    CAULDRON_ITEM(Arrays.asList("CAULDRON_ITEM", null, null, null, null, "CAULDRON"), 0),
    CAVE_AIR(Arrays.asList(null, null, null, null, null, "CAVE_AIR"), 0),
    CAVE_SPIDER_SPAWN_EGG(Arrays.asList("MONSTER_EGG", null, null, null, null, "CAVE_SPIDER_SPAWN_EGG"), 59),
    CHAIN_COMMAND_BLOCK(Arrays.asList("COMMAND", "CHAIN_COMMAND_BLOCK", null, null, null, null), 0),
    CHAINMAIL_BOOTS("CHAINMAIL_BOOTS", 0),
    CHAINMAIL_CHESTPLATE("CHAINMAIL_CHESTPLATE", 0),
    CHAINMAIL_HELMET("CHAINMAIL_HELMET", 0),
    CHAINMAIL_LEGGINGS("CHAINMAIL_LEGGINGS", 0),
    CHARCOAL(Arrays.asList("COAL", null, null, null, null, "CHARCOAL"), 1),
    CHEST("CHEST", 0),
    CHEST_MINECART(Arrays.asList("STORAGE_MINECART", null, null, null, null, "CHEST_MINECART"), 0),
    CHICKEN(Arrays.asList("RAW_CHICKEN", null, null, null, null, "CHICKEN"), 0),
    CHICKEN_SPAWN_EGG(Arrays.asList("MONSTER_EGG", null, null, null, null, "CHICKEN_SPAWN_EGG"), 0),
    CHIPPED_ANVIL(Arrays.asList("ANVIL", null, null, null, null, "CHIPPED_ANVIL"), 1),
    CHISELED_QUARTZ_BLOCK(Arrays.asList("QUARTZ_BLOCK", null, null, null, null, "CHISELED_QUARTZ_BLOCK"), 1),
    CHISELED_RED_SANDSTONE(Arrays.asList("RED_SANDSTONE", null, null, null, null, "CHISELED_RED_SANDSTONE"), 1),
    CHISELED_SANDSTONE(Arrays.asList("SANDSTONE", null, null, null, null, "CHISELED_SANDSTONE"), 1),
    CHISELED_STONE_BRICKS(Arrays.asList("SMOOTH_BRICK", null, null, null, null, "CHISELED_STONE_BRICKS"), 3),
    CHORUS_FLOWER(Arrays.asList(null, "CHORUS_FLOWER"), 0),
    CHORUS_FRUIT(Arrays.asList(null, "CHORUS_FRUIT"), 0),
    CHORUS_PLANT(Arrays.asList(null, "CHORUS_PLANT"), 0),
    CLAY("CLAY", 0),
    CLAY_BALL("CLAY_BALL", 0),
    CLOCK(Arrays.asList("WATCH", null, null, null, null, "CLOCK"), 0),
    COAL("COAL", 0),
    COAL_BLOCK("COAL_BLOCK", 0),
    COAL_ORE("COAL_ORE", 0),
    COARSE_DIRT(Arrays.asList("DIRT", null, null, null, null, "COARSE_DIRT"), 1),
    COBBLESTONE("COBBLESTONE", 0),
    COBBLESTONE_SLAB(Arrays.asList("STEP", null, null, null, null, "COBBLESTONE_SLAB"), 3),
    COBBLESTONE_STAIRS("COBBLESTONE_STAIRS", 0),
    COBBLESTONE_WALL(Arrays.asList("COBBLE_WALL", null, null, null, null, "COBBLESTONE_WALL"), 0),
    COBWEB(Arrays.asList("WEB", null, null, null, null, "COBWEB"), 0),
    COCOA("COCOA", 0),
    COMMAND_BLOCK(Arrays.asList("COMMAND", null, null, "COMMAND_BLOCK"), 0),
    COMMAND_BLOCK_MINECART(Arrays.asList("COMMAND_MINECART", null, null, null, "COMMAND_BLOCK_MINECART"), 0),
    COMPARATOR(Arrays.asList("REDSTONE_COMPARATOR", null, null, null, null, "COMPARATOR"), 0),
    COMPASS("COMPASS", 0),
    CONDUIT(Arrays.asList(null, null, null, null, null, "CONDUIT"), 0),
    COOKED_BEEF("COOKED_BEEF", 0),
    COOKED_CHICKEN("COOKED_CHICKEN", 0),
    COOKED_COD(Arrays.asList("COOKED_FISH", null, null, null, null, "COOKED_COD"), 0),
    COOKED_MUTTON("COOKED_MUTTON", 0),
    COOKED_PORKCHOP(Arrays.asList("GRILLED_PORK", null, null, null, null, "COOKED_PORKCHOP"), 0),
    COOKED_RABBIT("COOKED_RABBIT", 0),
    COOKED_SALMON(Arrays.asList("COOKED_FISH", null, null, null, null, "COOKED_SALMON"), 0),
    COOKIE("COOKIE", 0),
    COW_SPAWN_EGG(Arrays.asList("MONSTER_EGG", null, null, null, null, "COW_SPAWN_EGG"), 92),
    CRACKED_STONE_BRICKS(Arrays.asList("SMOOTH_BRICK", null, null, null, null, "CRACKED_STONE_BRICKS"), 2),
    CRAFTING_TABLE(Arrays.asList("WORKBENCH", null, null, null, null, "CRAFTING_TABLE"), 0),
    CREEPER_HEAD(Arrays.asList("SKULL_ITEM", null, null, null, null, "CREEPER_HEAD"), 4),
    CREEPER_SPAWN_EGG(Arrays.asList("MONSTER_EGG", null, null, null, null, "CREEPER_SPAWN_EGG"), 50),
    CREEPER_WALL_HEAD(Arrays.asList("SKULL", null, null, null, null, "CREEPER_WALL_HEAD"), 3),
    CUT_RED_SANDSTONE(Arrays.asList("RED_SANDSTONE", null, null, null, null, "CUT_RED_SANDSTONE"), 2),
    CUT_SANDSTONE(Arrays.asList("SANDSTONE", null, null, null, null, "CUT_SANDSTONE"), 2),
    CYAN_BANNER(Arrays.asList("BANNER", null, null, null, null, "CYAN_BANNER"), 6),
    CYAN_BED(Arrays.asList("BED", null, null, null, null, "CYAN_BED"), 0),
    CYAN_CARPET(Arrays.asList("CARPET", null, null, null, null, "CYAN_CARPET"), 9),
    CYAN_CONCRETE(Arrays.asList(null, null, null, null, "", "CYAN_CONCRETE"), 0),
    CYAN_CONCRETE_POWDER(Arrays.asList(null, null, null, null, "", "CYAN_CONCRETE_POWDER"), 0),
    CYAN_DYE(Arrays.asList("INK_SACK", null, null, null, null, "CYAN_DYE"), 6),
    DAMAGED_ANVIL(Arrays.asList("ANVIL", null, null, null, null, "DAMAGED_ANVIL"), 2),
    DANDELION(Arrays.asList("YELLOW_FLOWER", null, null, null, null, "DANDELION"), 0),
    DANDELION_YELLOW(Arrays.asList("INK_SACK", null, null, null, null, "DANDELION_YELLOW"), 11),
    DARK_OAK_BOAT(Arrays.asList("BOAT", null, null, null, null, "DARK_OAK_BOAT"), 0),
    DARK_OAK_BUTTON(Arrays.asList("WOOD_BUTTON", null, null, null, "DARK_OAK_BUTTON"), 0),
    DARK_OAK_DOOR(Arrays.asList(null, null, null, null, null, "DARK_ORK_DOOR"), 0),
    DARK_OAK_DOOR_ITEM(Arrays.asList("DARK_OAK_DOOR_ITEM", null, null, null, null, "DARK_OAK_DOOR"), 0),
    DARK_OAK_FENCE("DARK_OAK_FENCE", 0),
    DARK_OAK_FENCE_GATE("DARK_OAK_FENCE_GATE", 0),
    DARK_OAK_LEAVES(Arrays.asList("LEAVES_2", null, null, null, null, "DARK_OAK_LEAVES"), 1),
    DARK_OAK_LOG(Arrays.asList("LOG_2", null, null, null, null, "DARK_OAK_LOG"), 1),
    DARK_OAK_PLANKS(Arrays.asList("WOOD", null, null, null, null, "DARK_OAK_PLANKS"), 5),
    DARK_OAK_PRESSURE_PLATE(Arrays.asList("WOOD_PLATE", null, null, null, null, "DARK_OAK_PRESSURE_PLATE"), 0),
    DARK_OAK_SAPLING(Arrays.asList("SAPLING", null, null, null, null, "DARK_OAK_SAPLING"), 5),
    DARK_OAK_SLAB(Arrays.asList("WOOD_STEP", null, null, null, null, "DARK_OAK_SLAB"), 5),
    DARK_OAK_STAIRS("DARK_OAK_STAIRS", 0),
    DARK_OAK_TRAPDOOR(Arrays.asList("TRAP_DOOR", null, null, null, null, "DARK_OAK_TRAPDOOR"), 0),
    DARK_OAK_WOOD(Arrays.asList("LOG_2", null, null, null, null, "DARK_OAK_WOOD"), 1),
    DARK_PRISMARINE(Arrays.asList("PRISMARINE", null, null, null, null, "DARK_PRISMARINE"), 2),
    DARK_PRISMARINE_SLAB(Arrays.asList(null, null, null, null, null, "DARK_PRISMARINE_SLAB"), 0),
    DARK_PRISMARINE_STAIRS(Arrays.asList(null, null, null, null, null, "DARK_PRISMARINE_STAIRS"), 0),
    DAYLIGHT_DETECTOR("DAYLIGHT_DETECTOR", 0),
    DEAD_BRAIN_CORAL(Arrays.asList(null, null, null, null, null, "DEAD_BRAIN_CORAL"), 0),
    DEAD_BRAIN_CORAL_BLOCK(Arrays.asList(null, null, null, null, null, "DEAD_BRAIN_CORAL_BLOCK"), 0),
    DEAD_BRAIN_CORAL_FAN(Arrays.asList(null, null, null, null, null, "DEAD_BRAIN_CORAL_FAN"), 0),
    DEAD_BRAIN_CORAL_WALL_FAN(Arrays.asList(null, null, null, null, null, "DEAD_BRAIN_CORAL_WALL_FAN"), 0),
    DEAD_BUBBLE_CORAL(Arrays.asList(null, null, null, null, null, "DEAD_BUBBLE_CORAL"), 0),
    DEAD_BUBBLE_CORAL_BLOCK(Arrays.asList(null, null, null, null, null, "DEAD_BUBBLE_CORAL_BLOCK"), 0),
    DEAD_BUBBLE_CORAL_FAN(Arrays.asList(null, null, null, null, null, "DEAD_BUBBLE_CORAL_FAN"), 0),
    DEAD_BUBBLE_CORAL_WALL_FAN(Arrays.asList(null, null, null, null, null, "DEAD_BUBBLE_CORAL_WALL_FAN"), 0),
    DEAD_BUSH("DEAD_BUSH", 0),
    DEAD_FIRE_CORAL(Arrays.asList(null, null, null, null, null, "DEAD_FIRE_CORAL"), 0),
    DEAD_FIRE_CORAL_BLOCK(Arrays.asList(null, null, null, null, null, "DEAD_FIRE_CORAL_BLOCK"), 0),
    DEAD_FIRE_CORAL_FAN(Arrays.asList(null, null, null, null, null, "DEAD_FIRE_CORAL_FAN"), 0),
    DEAD_FIRE_CORAL_WALL_FAN(Arrays.asList(null, null, null, null, null, "DEAD_FIRE_CORAL_WALL_FAN"), 0),
    DEAD_HORN_CORAL(Arrays.asList(null, null, null, null, null, "DEAD_HORN_CORAL"), 0),
    DEAD_HORN_CORAL_BLOCK(Arrays.asList(null, null, null, null, null, "DEAD_HORN_CORAL_BLOCK"), 0),
    DEAD_HORN_CORAL_FAN(Arrays.asList(null, null, null, null, null, "DEAD_HORN_CORAL_FAN"), 0),
    DEAD_HORN_CORAL_WALL_FAN(Arrays.asList(null, null, null, null, null, "DEAD_HORN_CORAL_WALL_FAN"), 0),
    DEBUG_STICK(Arrays.asList(null, null, null, null, null, "DEBUG_STICK"), 0),
    DETECTOR_RAIL("DETECTOR_RAIL", 0),
    DIAMOND("DIAMOND", 0),
    DIAMOND_AXE("DIAMOND_AXE", 0),
    DIAMOND_BLOCK("DIAMOND_BLOCK", 0),
    DIAMOND_BOOTS("DIAMOND_BOOTS", 0),
    DIAMOND_CHESTPLATE("DIAMOND_CHESTPLATE", 0),
    DIAMOND_HELMET("DIAMOND_HELMET", 0),
    DIAMOND_HOE("DIAMOND_HOE", 0),
    DIAMOND_HORSE_ARMOR(Arrays.asList("DIAMOND_BARDING", null, null, null, null, "DIAMOND_HORSE_ARMOR"), 0),
    DIAMOND_LEGGINGS("DIAMOND_LEGGINGS", 0),
    DIAMOND_ORE("DIAMOND_ORE", 0),
    DIAMOND_PICKAXE("DIAMOND_PICKAXE", 0),
    DIAMOND_SHOVEL(Arrays.asList("DIAMOND_SPADE", null, null, null, null, "DIAMOND_SHOVEL"), 0),
    DIAMOND_SWORD("DIAMOND_SWORD", 0),
    DIORITE(Arrays.asList("STONE", null, null, null, null, "DIORITE"), 3),
    DIRT("DIRT", 0),
    DISPENSER("DISPENSER", 0),
    DOLPHIN_SPAWN_EGG(Arrays.asList(null, null, null, null, null, "DOLPHIN_SPAWN_EGG"), 0),
    DONKEY_SPAWN_EGG(Arrays.asList("MONSTER_EGG", null, null, null, null, "DONKEY_SPAWN_EGG"), 100),
    DRAGON_BREATH(Arrays.asList(null, "DRAGON_BREATH"), 0),
    DRAGON_HEAD(Arrays.asList(null, "SKULL", null, null, null, null, "DRAGON_HEAD"), 5),
    DRAGON_HEAD_ITEM(Arrays.asList(null, "SKULL_ITEM", null, null, null, "DRAGON_HEAD"), 5),
    DRAGON_WALL_HEAD(Arrays.asList(null, "SKULL", null, null, null, "DRAGON_WALL_HEAD"), 5),
    DRIED_KELP(Arrays.asList(null, null, null, null, null, "DRIED_KELP"), 0),
    DRIED_KELP_BLOCK(Arrays.asList(null, null, null, null, null, "DRIED_KELP_BLOCK"), 0),
    DROPPER("DROPPER", 0),
    DROWNED_SPAWN_EGG(Arrays.asList(null, null, null, null, null, "DROWNED_SPAWN_EGG"), 0),
    EGG("EGG", 0),
    ELDER_GUARDIAN_SPAWN_EGG(Arrays.asList(null, null, null, null, null, "ELDER_GUARDIAN_SPAWN_EGG"), 0),
    ELYTRA(Arrays.asList(null, "ELYTRA"), 0),
    EMERALD("EMERALD",0 ),
    EMERALD_BLOCK("EMERALD_BLOCK", 0),
    EMERALD_ORE("EMERALD_ORE", 0),
    ENCHANTED_BOOK("ENCHANTED_BOOK", 0),
    ENCHANTED_GOLDEN_APPLE(Arrays.asList("GOLDEN_APPLE", null, null, null, null, "ENCHANTED_GOLDEN_APPLE"), 1),
    ENCHANTING_TABLE(Arrays.asList("ENCHANTMENT_TABLE", null, null, "ENCHANTING_TABLE"), 0),
    END_CRYSTAL(Arrays.asList(null, null, null, "END_CRYSTAL"), 0),
    END_GATEWAY(Arrays.asList(null, "END_GATEWAY"), 0),
    END_PORTAL(Arrays.asList(null, null, null, null, null, "END_PORTAL"), 0),
    END_PORTAL_FRAME(Arrays.asList("ENDER_PORTAL_FRAME", "END_PORTAL_FRAME"), 0),
    END_ROD(Arrays.asList(null, "END_ROD"), 0),
    END_STONE(Arrays.asList("ENDER_STONE", "END_STONE"), 0),
    END_STONE_BRICKS(Arrays.asList(null, "END_STONE_BRICKS"), 0),
    ENDER_CHEST("ENDER_CHEST", 0),
    ENDER_EYE(Arrays.asList("EYE_OF_ENDER", "ENDER_EYE"), 0),
    ENDER_PEARL("ENDER_PEARL", 0),
    ENDERMAN_SPAWN_EGG(Arrays.asList("MONSTER_EGG", null, null, null, null, "ENDERMAN_SPAWN_EGG"), 58),
    ENDERMITE_SPAWN_EGG(Arrays.asList("MONSTER_EGG", null, null, null, null, "ENDERMITE_SPAWN_EGG"), 67),
    EVOKER_SPAWN_EGG(Arrays.asList(null, null, null, null, null, "EVOKER_SPAWN_EGG"), 0),
    EXPERIENCE_BOTTLE(Arrays.asList("EXP_BOTTLE", null, null, null, null, "EXPERIENCE_BOTTLE"), 0),
    FARMLAND(Arrays.asList("SOIL", null, null, null, null, "FARMLAND"), 0),
    FEATHER("FEATHER", 0),
    FERMENTED_SPIDER_EYE("FERMENTED_SPIDER_EYE", 0),
    FERN(Arrays.asList("LONG_GRASS", null, null, null, null, "FERN"), 2),
    FILLED_MAP(Arrays.asList("MAP", null, null, null, null, "FILLED_MAP"), 0),
    FIRE("FIRE", 0),
    FIRE_CHARGE(Arrays.asList("FIREBALL", null, null, null, null, "FIRE_CHARGE"), 0),
    FIRE_CORAL(Arrays.asList(null, null, null, null, null, "FIRE_CORAL"), 0),
    FIRE_CORAL_BLOCK(Arrays.asList(null, null, null, null, null, "FIRE_CORAL_BLOCK"), 0),
    FIRE_CORAL_FAN(Arrays.asList(null, null, null, null, null, "FIRE_CORAL_FAN"), 0),
    FIRE_CORAL_WALL_FAN(Arrays.asList(null, null, null, null, null, "FIRE_CORAL_WALL_FAN"), 0),
    FIREWORK_ROCKET(Arrays.asList("FIREWORK", null, null, null, null, "FIREWORK_ROCKET"), 0),
    FIREWORK_STAR(Arrays.asList("FIREWORK_CHARGE", null, null, null, null, "FIREWORK_STAR"), 0),
    FISHING_ROD("FISHING_ROD", 0),
    FLINT("FLINT", 0),
    FLINT_AND_STEEL("FLINT_AND_STEEL", 0),
    FLOWER_POT("FLOWER_POT", 0),
    FLOWER_POT_ITEM(Arrays.asList("FLOWER_POT_ITEM", null, null, null, null, "FLOWER_POT"), 0),
    FROSTED_ICE(Arrays.asList(null, "FROSTED_ICE"), 0),
    FURNACE("FURNACE", 0),
    FURNACE_MINECART(Arrays.asList("POWERED_MINECART", null, null, "FURNACE_MINECART"), 0),
    GHAST_SPAWN_EGG(Arrays.asList("MONSTER_EGG", null, null, null, null, "GHAST_SPAWN_EGG"), 56),
    GHAST_TEAR("GHAST_TEAR", 0),
    GLASS("GLASS", 0),
    GLASS_BOTTLE("GLASS_BOTTLE", 0),
    GLISTERING_MELON_SLICE(Arrays.asList("SPECKLED_MELON", null, null, null, null, "GLISTERING_MELON_SLICE"), 0),
    GLOWING_REDSTONE_ORE("GLOWING_REDSTONE_ORE", 0),
    GLOWSTONE("GLOWSTONE", 0),
    GLOWSTONE_DUST("GLOWSTONE_DUST", 0),
    GOLD_BLOCK("GOLD_BLOCK", 0),
    GOLD_INGOT("GOLD_INGOT", 0),
    GOLD_NUGGET("GOLD_NUGGET", 0),
    GOLD_ORE("GOLD_ORE", 0),
    GOLDEN_APPLE("GOLDEN_APPLE", 1),
    GOLDEN_AXE(Arrays.asList("GOLD_AXE", null, null, null, null, "GOLDEN_AXE"), 0),
    ;
    private final ArrayList<String> names = new ArrayList<>();
    private final String version = Bukkit.getVersion();
    private ItemStack is;
    UMaterial(String name, int data) {
        names.add(name);
        is = version.contains("1.8") || version.contains("1.9") || version.contains("1.10") || version.contains("1.11") || version.contains("1.12") ? new ItemStack(Material.valueOf(name), 1, (byte) data) : new ItemStack(Material.valueOf(name));
    }
    UMaterial(List<String> names, int data) {
        this.names.addAll(names);
        int ver = version.contains("1.8") ? 0 : version.contains("1.9") ? 1 : version.contains("1.10") ? 2 : version.contains("1.11") ? 3 : version.contains("1.12") ? 4 : version.contains("1.13") ? 5 : version.contains("1.14") ? 6 : names.size()-1;
        int realver = ver;
        if(names.get(ver) == null) {
            for(int i = ver; i >= 0; i--) {
                if(names.get(ver) != null)
                    realver = i;
            }
        }
        // 0 = 1.8
        // 1 = 1.9
        // 2 = 1.10
        // 3 = 1.11
        // 4 = 1.12
        // 5 = 1.13
        // 6 = 1.14
        if(names.get(realver) != null) {
            is = new ItemStack(Material.valueOf(names.get(realver)), 1, (byte) data);
        }
    }
    public ItemStack getItemStack() { return is; }


    @Deprecated
    public static ItemStack valueOf(String name, byte data) {
        name = name.toUpperCase();
        for(UMaterial u : UMaterial.values()) {
            if(u.names.contains(name)) {
                final ItemStack i = u.getItemStack();
                if(i.getData().getData() == data)
                    return i;
            }
        }
        return null;
    }
}
