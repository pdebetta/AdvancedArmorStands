package com.falyrion.aa;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryAction;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.util.EulerAngle;

import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.TextComponent;


public class InventoryClickHandler implements Listener {

    /**
     * Event listener to handle click events
     */
    @EventHandler
    public void onInventoryClick (InventoryClickEvent clickEvent) {

        if (clickEvent.getClickedInventory() != null) {
            if (clickEvent.getCurrentItem() != null) {
                if (clickEvent.getCurrentItem().getType() != Material.AIR) {

                    String inventoryTitle = clickEvent.getView().getTitle();

                    // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                    // Handle Click Events for Main Menu

                    if (inventoryTitle.equalsIgnoreCase(ChatColor.DARK_GRAY + "Advanced ArmorStands")) {

                        clickEvent.setCancelled(true);
                        Player player = (Player) clickEvent.getWhoClicked();

                        if (clickEvent.getClick().isKeyboardClick()) {
                            player.updateInventory();
                        }

                        if (clickEvent.getAction().equals(InventoryAction.MOVE_TO_OTHER_INVENTORY)) {
                            player.updateInventory();
                        }

                        if (clickEvent.getClickedInventory() == clickEvent.getView().getTopInventory()) {

                            String itemName = clickEvent.getCurrentItem().getItemMeta().getDisplayName();

                            handleEventMainMenu(itemName, player);
                        }
                    }

                    // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                    // Handle Click Events for Basic Settings Menu

                    else if (inventoryTitle.equalsIgnoreCase(ChatColor.DARK_GRAY + "Advanced ArmorStands §rBasics")) {

                        clickEvent.setCancelled(true);
                        Player player = (Player) clickEvent.getWhoClicked();

                        if (clickEvent.getClick().isKeyboardClick()) {
                            player.updateInventory();
                        }

                        if (clickEvent.getAction().equals(InventoryAction.MOVE_TO_OTHER_INVENTORY)) {
                            player.updateInventory();
                        }

                        if (clickEvent.getClickedInventory() == clickEvent.getView().getTopInventory()) {

                            String itemName = clickEvent.getCurrentItem().getItemMeta().getDisplayName();

                            handleEventBasicMenu(itemName, player);
                        }
                    }

                    // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                    // Handle Click Events for Body Parts Settings Menu

                    else if (inventoryTitle.equalsIgnoreCase(ChatColor.DARK_GRAY + "Advanced ArmorStands §rBody")) {

                        clickEvent.setCancelled(true);
                        Player player = (Player) clickEvent.getWhoClicked();

                        if (clickEvent.getClick().isKeyboardClick()) {
                            player.updateInventory();
                        }

                        if (clickEvent.getAction().equals(InventoryAction.MOVE_TO_OTHER_INVENTORY)) {
                            player.updateInventory();
                        }

                        if (clickEvent.getClickedInventory() == clickEvent.getView().getTopInventory()) {

                            String itemName = clickEvent.getCurrentItem().getItemMeta().getDisplayName();

                            handleEventBodyPartMenu(itemName, player);
                        }
                    }

                    // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                    // Handle Click Events for Movement and Rotation Menus

                    else if (inventoryTitle.equalsIgnoreCase(ChatColor.DARK_GRAY + "Advanced ArmorStands §rMove: 0.1")) {

                        clickEvent.setCancelled(true);
                        Player player = (Player) clickEvent.getWhoClicked();

                        if (clickEvent.getClick().isKeyboardClick()) {
                            player.updateInventory();
                        }

                        if (clickEvent.getAction().equals(InventoryAction.MOVE_TO_OTHER_INVENTORY)) {
                            player.updateInventory();
                        }

                        if (clickEvent.getClickedInventory() == clickEvent.getView().getTopInventory()) {

                            String itemName = clickEvent.getCurrentItem().getItemMeta().getDisplayName();

                            handleEventMovementMenu(itemName, player, (float) 0.1);
                        }
                    }

                    else if (inventoryTitle.equalsIgnoreCase(ChatColor.DARK_GRAY + "Advanced ArmorStands §rMove: 0.5")) {

                        clickEvent.setCancelled(true);
                        Player player = (Player) clickEvent.getWhoClicked();

                        if (clickEvent.getClick().isKeyboardClick()) {
                            player.updateInventory();
                        }

                        if (clickEvent.getAction().equals(InventoryAction.MOVE_TO_OTHER_INVENTORY)) {
                            player.updateInventory();
                        }

                        if (clickEvent.getClickedInventory() == clickEvent.getView().getTopInventory()) {

                            String itemName = clickEvent.getCurrentItem().getItemMeta().getDisplayName();

                            handleEventMovementMenu(itemName, player, (float) 0.5);
                        }
                    }

                    else if (inventoryTitle.equalsIgnoreCase(ChatColor.DARK_GRAY + "Advanced ArmorStands §rMove: 1")) {

                        clickEvent.setCancelled(true);
                        Player player = (Player) clickEvent.getWhoClicked();

                        if (clickEvent.getClick().isKeyboardClick()) {
                            player.updateInventory();
                        }

                        if (clickEvent.getAction().equals(InventoryAction.MOVE_TO_OTHER_INVENTORY)) {
                            player.updateInventory();
                        }

                        if (clickEvent.getClickedInventory() == clickEvent.getView().getTopInventory()) {

                            String itemName = clickEvent.getCurrentItem().getItemMeta().getDisplayName();

                            handleEventMovementMenu(itemName, player, (float) 1);
                        }
                    }

                    // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                    // Handle Click Events for Preset Pose Menu

                    else if (inventoryTitle.equalsIgnoreCase(ChatColor.DARK_GRAY + "Advanced ArmorStands §rPoses")) {

                        clickEvent.setCancelled(true);
                        Player player = (Player) clickEvent.getWhoClicked();

                        if (clickEvent.getClick().isKeyboardClick()) {
                            player.updateInventory();
                        }

                        if (clickEvent.getAction().equals(InventoryAction.MOVE_TO_OTHER_INVENTORY)) {
                            player.updateInventory();
                        }

                        if (clickEvent.getClickedInventory() == clickEvent.getView().getTopInventory()) {

                            String itemName = clickEvent.getCurrentItem().getItemMeta().getDisplayName();

                            handleEventPresetPoseMenu(itemName, player);
                        }
                    }



                }
            }
        }
    }


    /**
     * Runs an action based on a clicked item. Called by InventoryClickEvent-EventHandler.
     *
     * @param itemName: String, The item that was clicked on
     * @param player: Player, The player who clicked
     */
    private void handleEventMainMenu(String itemName, Player player) {

        switch(itemName) {
            case "§e§lBasic Settings":
                player.closeInventory();
                AdvancedArmorStandsMain.getInstance().showMenu(player, 2);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;

            case "§e§lBody Settings":
                player.closeInventory();
                AdvancedArmorStandsMain.getInstance().showMenu(player, 3);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;

            case "§e§lMovement and Rotation":
                player.closeInventory();
                AdvancedArmorStandsMain.getInstance().showMenu(player, 5);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;

            case "§e§lPreset Poses":
                player.closeInventory();
                AdvancedArmorStandsMain.getInstance().showMenu(player, 7);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;

            case "§e§lHeads":

            case "§e§lHelp and Info":
                AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                break;

            case "§e§lDocumentation":
                player.closeInventory();

                player.sendMessage(ChatColor.GOLD + AdvancedArmorStandsMain.getInstance().getMessageString("documentation", player.getLocale()));

                TextComponent textComponentWebsite = new TextComponent(">> Spigot website");
                textComponentWebsite.setColor(net.md_5.bungee.api.ChatColor.YELLOW);
                textComponentWebsite.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://www.spigotmc.org/resources/advanced-armor-stands.38513/"));
                player.spigot().sendMessage(textComponentWebsite);

                TextComponent textComponentGithub = new TextComponent(">> Github");
                textComponentGithub.setColor(net.md_5.bungee.api.ChatColor.YELLOW);
                textComponentGithub.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://github.com/Falyrion/AdvancedArmorStands/blob/main/README.md"));
                player.spigot().sendMessage(textComponentGithub);

                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;

            case "§e§lClose":
                player.closeInventory();
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;
        }
    }


    /**
     * Runs an action based on a clicked item. Called by InventoryClickEvent-EventHandler.
     *
     * @param itemName: String, The item that was clicked on
     * @param player: Player, The player who clicked
     */
    private void handleEventBasicMenu(String itemName, Player player) {

        switch(itemName) {
            case "§e§lArms":
                if (player.hasPermission("aa.edit")) {
                    for (Entity entity : player.getNearbyEntities(1, 1, 1)) {
                        if (entity instanceof ArmorStand armorStand) {
                            if (!armorStand.hasArms()) {
                                if (!AdvancedArmorStandsMain.getInstance().canChange(armorStand, player)) {
                                    continue;
                                }
                                armorStand.setArms(true);
                                player.sendMessage(ChatColor.GOLD + AdvancedArmorStandsMain.getInstance().getMessageString("modification_menu", player.getLocale()));
                            }
                        }
                    }
                    AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                } else {
                    player.sendMessage(ChatColor.RED + AdvancedArmorStandsMain.getInstance().getMessageString("no_permission", player.getLocale()));
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                }
                break;

            case "§e§lBaseplate invisible":
                if (player.hasPermission("aa.edit")) {
                    for (Entity entity : player.getNearbyEntities(1, 1, 1)) {
                        if (entity instanceof ArmorStand armorStand) {
                            if (armorStand.hasBasePlate()) {
                                if (!AdvancedArmorStandsMain.getInstance().canChange(armorStand, player)) {
                                    continue;
                                }
                                armorStand.setBasePlate(false);
                                player.sendMessage(ChatColor.GOLD + AdvancedArmorStandsMain.getInstance().getMessageString("modification_menu", player.getLocale()));
                            }
                        }
                    }
                    AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                } else {
                    player.sendMessage(ChatColor.RED + AdvancedArmorStandsMain.getInstance().getMessageString("no_permission", player.getLocale()));
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                }
                break;

            case "§e§lBaseplate visible":
                if (player.hasPermission("aa.edit")) {
                    for (Entity entity : player.getNearbyEntities(1, 1, 1)) {
                        if (entity instanceof ArmorStand armorStand) {
                            if (!armorStand.hasBasePlate()) {
                                if (!AdvancedArmorStandsMain.getInstance().canChange(armorStand, player)) {
                                    continue;
                                }
                                armorStand.setBasePlate(true);
                                player.sendMessage(ChatColor.GOLD + AdvancedArmorStandsMain.getInstance().getMessageString("modification_menu", player.getLocale()));
                            }
                        }
                    }
                    AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                } else {
                    player.sendMessage(ChatColor.RED + AdvancedArmorStandsMain.getInstance().getMessageString("no_permission", player.getLocale()));
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                }
                break;

            case "§e§lGravity off":
                if (player.hasPermission("aa.edit")) {
                    for (Entity entity : player.getNearbyEntities(1, 1, 1)) {
                        if (entity instanceof ArmorStand armorStand) {
                            if (armorStand.hasGravity()) {
                                if (!AdvancedArmorStandsMain.getInstance().canChange(armorStand, player)) {
                                    continue;
                                }
                                armorStand.setGravity(false);
                                player.sendMessage(ChatColor.GOLD + AdvancedArmorStandsMain.getInstance().getMessageString("modification_menu", player.getLocale()));
                            }

                        }
                    }
                    AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                } else {
                    player.sendMessage(ChatColor.RED + AdvancedArmorStandsMain.getInstance().getMessageString("no_permission", player.getLocale()));
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                }
                break;

            case "§e§lGravity on":
                if (player.hasPermission("aa.edit")) {
                    for (Entity entity : player.getNearbyEntities(1, 1, 1)) {
                        if (entity instanceof ArmorStand armorStand) {
                            if (!armorStand.hasGravity()) {
                                if (!AdvancedArmorStandsMain.getInstance().canChange(armorStand, player)) {
                                    continue;
                                }
                                armorStand.setGravity(true);
                                player.sendMessage(ChatColor.GOLD + AdvancedArmorStandsMain.getInstance().getMessageString("modification_menu", player.getLocale()));
                            }
                        }
                    }
                    AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                } else {
                    player.sendMessage(ChatColor.RED + AdvancedArmorStandsMain.getInstance().getMessageString("no_permission", player.getLocale()));
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                }
                break;

            case "§e§lInvisible":
                if (player.hasPermission("aa.visible")) {
                    for (Entity entity : player.getNearbyEntities(1, 1, 1)) {
                        if (entity instanceof ArmorStand armorStand) {
                            if (armorStand.isVisible()) {
                                if (!AdvancedArmorStandsMain.getInstance().canChange(armorStand, player)) {
                                    continue;
                                }
                                armorStand.setVisible(false);
                                player.sendMessage(ChatColor.GOLD + AdvancedArmorStandsMain.getInstance().getMessageString("modification_menu", player.getLocale()));
                            }
                        }
                    }
                    AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                } else {
                    player.sendMessage(ChatColor.RED + AdvancedArmorStandsMain.getInstance().getMessageString("no_permission", player.getLocale()));
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                }
                break;

            case "§e§lVisible":
                if (player.hasPermission("aa.visible")) {
                    for (Entity entity : player.getNearbyEntities(1, 1, 1)) {
                        if (entity instanceof ArmorStand armorStand) {
                            if (!armorStand.isVisible()) {
                                if (!AdvancedArmorStandsMain.getInstance().canChange(armorStand, player)) {
                                    continue;
                                }
                                armorStand.setVisible(true);
                                player.sendMessage(ChatColor.GOLD + AdvancedArmorStandsMain.getInstance().getMessageString("modification_menu", player.getLocale()));
                            }
                        }
                    }
                    AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                } else {
                    player.sendMessage(ChatColor.RED + AdvancedArmorStandsMain.getInstance().getMessageString("no_permission", player.getLocale()));
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                }
                break;

            case "§e§lSmall":
                if (player.hasPermission("aa.edit")) {
                    for (Entity entity : player.getNearbyEntities(1, 1, 1)) {
                        if (entity instanceof ArmorStand armorStand) {
                            if (!armorStand.isSmall()) {
                                if (!AdvancedArmorStandsMain.getInstance().canChange(armorStand, player)) {
                                    continue;
                                }
                                armorStand.setSmall(true);
                                player.sendMessage(ChatColor.GOLD + AdvancedArmorStandsMain.getInstance().getMessageString("modification_menu", player.getLocale()));
                            }
                        }
                    }
                    AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                } else {
                    player.sendMessage(ChatColor.RED + AdvancedArmorStandsMain.getInstance().getMessageString("no_permission", player.getLocale()));
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                }
                break;

            case "§e§lNormal Size":
                if (player.hasPermission("aa.edit")) {
                    for (Entity entity : player.getNearbyEntities(1, 1, 1)) {
                        if (entity instanceof ArmorStand armorStand) {
                            if (armorStand.isSmall()) {
                                if (!AdvancedArmorStandsMain.getInstance().canChange(armorStand, player)){
                                    continue;
                                }
                                armorStand.setSmall(false);
                                player.sendMessage(ChatColor.GOLD + AdvancedArmorStandsMain.getInstance().getMessageString("modification_menu", player.getLocale()));
                            }
                        }
                    }
                    AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                } else {
                    player.sendMessage(ChatColor.RED + AdvancedArmorStandsMain.getInstance().getMessageString("no_permission", player.getLocale()));
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                }
                break;

            case "§e§lHide Name":
                if (player.hasPermission("aa.names")) {
                    for (Entity entity : player.getNearbyEntities(0.5, 0.5, 0.5)){
                        if (entity instanceof ArmorStand armorStand) {
                            if (armorStand.isCustomNameVisible()) {
                                if (!AdvancedArmorStandsMain.getInstance().canChange(armorStand, player)) {
                                    continue;
                                }
                                armorStand.setCustomNameVisible(false);
                                player.sendMessage(ChatColor.GOLD + AdvancedArmorStandsMain.getInstance().getMessageString("modification_menu", player.getLocale()));
                            }
                        }
                    }
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                } else {
                    player.sendMessage(ChatColor.RED + AdvancedArmorStandsMain.getInstance().getMessageString("no_permission", player.getLocale()));
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                }
                break;

            case "§e§lName Help":
                if (player.hasPermission("aa.names")) {
                    player.sendMessage(ChatColor.GOLD + "============== [AA] Name-Help ==============");
                    player.sendMessage("§fUse §b/aa name <text> §fto give your armor stand a custom name! This command affects every armor stand in 1 block range around you!");
                    player.sendMessage("§fWrite '&' and a number in front of your text to give it a specific color.");
                    player.sendMessage("  ");
                    player.sendMessage("§fColors: §00 §11 §22 §33 §44 §55 §66 §77 §88 §99 §aa §bb §cc §dd §ee §ff");
                    player.sendMessage("l §lBold");
                    player.sendMessage("m §mStrikethrough");
                    player.sendMessage("n §nUnderline");
                    player.sendMessage("o §oItalic");
                    player.sendMessage("k Obfuscated §kObfuscated");
                    player.sendMessage("    ");
                    player.sendMessage("Example: '/aa name &3Cool &6&llooking &fNames' will create '§3Cool §6§llooking §fNames' ");
                    player.sendMessage(ChatColor.GOLD + "============================================");

                    player.closeInventory();
                    AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                } else {
                    player.sendMessage(ChatColor.RED + AdvancedArmorStandsMain.getInstance().getMessageString("no_permission", player.getLocale()));
                }
                break;

            case "§e§lMake glowing":
                if (player.hasPermission("aa.edit")) {
                    for (Entity entity : player.getNearbyEntities(1, 1, 1)) {
                        if (entity instanceof ArmorStand armorStand) {
                            if (!armorStand.isGlowing()) {
                                if (!AdvancedArmorStandsMain.getInstance().canChange(armorStand, player)){
                                    continue;
                                }
                                armorStand.setGlowing(true);
                                player.sendMessage(ChatColor.GOLD + AdvancedArmorStandsMain.getInstance().getMessageString("modification_menu", player.getLocale()));
                            }
                        }
                    }
                    AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                } else {
                    player.sendMessage(ChatColor.RED + AdvancedArmorStandsMain.getInstance().getMessageString("no_permission", player.getLocale()));
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                }
                break;

            case "§e§lRemove glow":
                if (player.hasPermission("aa.edit")) {
                    for (Entity entity : player.getNearbyEntities(1, 1, 1)) {
                        if (entity instanceof ArmorStand armorStand) {
                            if (armorStand.isGlowing()) {
                                if (!AdvancedArmorStandsMain.getInstance().canChange(armorStand, player)){
                                    continue;
                                }
                                armorStand.setGlowing(false);
                                player.sendMessage(ChatColor.GOLD + AdvancedArmorStandsMain.getInstance().getMessageString("modification_menu", player.getLocale()));
                            }
                        }
                    }
                    AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                } else{
                    player.sendMessage(ChatColor.RED + AdvancedArmorStandsMain.getInstance().getMessageString("no_permission", player.getLocale()));
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                }
                break;

            case "§e§lInvulnerable":
                if (player.hasPermission("aa.edit")) {
                    for (Entity entity : player.getNearbyEntities(2, 2, 2)) {
                        if (entity instanceof ArmorStand armorStand) {
                            if (!AdvancedArmorStandsMain.getInstance().canChange(armorStand, player)){
                                continue;
                            }
                            if (armorStand.isInvulnerable()) {
                                armorStand.setInvulnerable(false);
                                player.sendMessage(ChatColor.GOLD + AdvancedArmorStandsMain.getInstance().getMessageString("modification_menu", player.getLocale()));
                            } else {
                                armorStand.setInvulnerable(true);
                                player.sendMessage(ChatColor.GOLD + AdvancedArmorStandsMain.getInstance().getMessageString("modification_menu", player.getLocale()));
                            }
                        }
                    }
                    AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                } else {
                    player.sendMessage(ChatColor.RED + AdvancedArmorStandsMain.getInstance().getMessageString("no_permission", player.getLocale()));
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                }
                break;

            case "§e§lCustom Name":

            case "§e§lHow to?":
                AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                break;

            case "§e§lBack":
                player.closeInventory();
                AdvancedArmorStandsMain.getInstance().showMenu(player, 1);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;
        }
    }


    /**
     * Runs an action based on a clicked item. Called by InventoryClickEvent-EventHandler.
     *
     * @param itemName: String, The item that was clicked on
     * @param player: Player, The player who clicked
     */
    private void handleEventBodyPartMenu(String itemName, Player player) {

        switch (itemName) {
            case "§e§lHead Pose":

            case "§e§lBody Pose":

            case "§e§lRight Arm Pose":

            case "§e§lLeft Arm Pose":

            case "§e§lRight Leg Pose":

            case "§e§lLeft Leg Pose":

            case "§e§lHow to?":
                AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                break;

            case "§e§lBack to Main Menu":
                player.closeInventory();
                AdvancedArmorStandsMain.getInstance().showMenu(player, 1);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;
        }
    }


    /**
     * Runs an action based on a clicked item. Called by InventoryClickEvent-EventHandler.
     *
     * @param itemName: String, The item that was clicked on
     * @param player: Player, The player who clicked
     */
    private void handleEventMovementMenu(String itemName, Player player, float distance) {

        /**
         * Runs an action based on a clicked item. Called by InventoryClickEvent-EventHandler.
         */

        switch (itemName) {

            case "§e§lBack to Main Menu":
                player.closeInventory();
                AdvancedArmorStandsMain.getInstance().showMenu(player, 1);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;

            case "§e§lDuplicate":
            case "§e§lTeleport":
            case "§e§lHow to?":
            case "§e§lDistance: 0.1 Blocks (Active)":
            case "§e§lDistance: 0.5 Blocks (Active)":
            case "§e§lDistance: 1 Block (Active)":
                AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                break;

            case "§e§lDistance: 1 Block":
                player.closeInventory();
                AdvancedArmorStandsMain.getInstance().showMenu(player, 6);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;

            case "§e§lDistance: 0.5 Blocks":
                player.closeInventory();
                AdvancedArmorStandsMain.getInstance().showMenu(player, 5);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;

            case "§e§lDistance: 0.1 Blocks":
                player.closeInventory();
                AdvancedArmorStandsMain.getInstance().showMenu(player, 4);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;


            // Nav Cross

            case "§e§lForward":
                if (player.hasPermission("aa.move")) {
                    for (Entity entity : player.getNearbyEntities(distance, distance, distance)) {
                        if (entity instanceof ArmorStand armorStand) {
                            if (!AdvancedArmorStandsMain.getInstance().canChange(armorStand, player)) {
                                continue;
                            }
                            Location newLocation = new Location(
                                    armorStand.getWorld(), armorStand.getLocation().getX() + distance,
                                    armorStand.getLocation().getY(), armorStand.getLocation().getZ()
                            );

                            Float armorStandYaw = armorStand.getLocation().getYaw();
                            newLocation.setYaw(armorStandYaw);

                            armorStand.teleport(newLocation);

                            AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                        }
                    }
                } else {
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                    player.sendMessage(ChatColor.RED + AdvancedArmorStandsMain.getInstance().getMessageString("no_permission", player.getLocale()));
                }
                break;

            case "§e§lBackwards":
                if (player.hasPermission("aa.move")) {
                    for (Entity entity : player.getNearbyEntities(distance, distance, distance)) {
                        if (entity instanceof ArmorStand armorStand) {
                            if (!AdvancedArmorStandsMain.getInstance().canChange(armorStand, player)){
                                continue;
                            }
                            Location newLocation = new Location(
                                    armorStand.getWorld(), armorStand.getLocation().getX() - distance,
                                    armorStand.getLocation().getY(), armorStand.getLocation().getZ()
                            );

                            Float armorStandYaw = armorStand.getLocation().getYaw();
                            newLocation.setYaw(armorStandYaw);

                            armorStand.teleport(newLocation);

                            AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                        }
                    }
                } else {
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                    player.sendMessage(ChatColor.RED + AdvancedArmorStandsMain.getInstance().getMessageString("no_permission", player.getLocale()));
                }
                break;

            case "§e§lRight":
                if (player.hasPermission("aa.move")) {
                    for (Entity entity : player.getNearbyEntities(distance, distance, distance)) {
                        if (entity instanceof ArmorStand armorStand) {
                            if (!AdvancedArmorStandsMain.getInstance().canChange(armorStand, player)) {
                                continue;
                            }
                            Location newLocation = new Location(
                                    armorStand.getWorld(), armorStand.getLocation().getX(),
                                    armorStand.getLocation().getY(), armorStand.getLocation().getZ() + distance
                            );

                            Float armorStandYaw = armorStand.getLocation().getYaw();
                            newLocation.setYaw(armorStandYaw);

                            armorStand.teleport(newLocation);

                            AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                        }
                    }
                } else {
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                    player.sendMessage(ChatColor.RED + AdvancedArmorStandsMain.getInstance().getMessageString("no_permission", player.getLocale()));
                }
                break;

            case "§e§lLeft":
                if (player.hasPermission("aa.move")) {
                    for (Entity entity : player.getNearbyEntities(distance, distance, distance)) {
                        if (entity instanceof ArmorStand armorStand) {
                            if (!AdvancedArmorStandsMain.getInstance().canChange(armorStand, player)) {
                                continue;
                            }
                            Location newLocation = new Location(
                                    armorStand.getWorld(), armorStand.getLocation().getX(),
                                    armorStand.getLocation().getY(), armorStand.getLocation().getZ() - distance
                            );

                            Float armorStandYaw = armorStand.getLocation().getYaw();
                            newLocation.setYaw(armorStandYaw);

                            armorStand.teleport(newLocation);

                            AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                        }
                    }
                } else {
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                    player.sendMessage(ChatColor.RED + AdvancedArmorStandsMain.getInstance().getMessageString("no_permission", player.getLocale()));
                }
                break;


            // Move up and down

            case "§e§lUp":
                if (player.hasPermission("aa.move")) {
                    for (Entity entity : player.getNearbyEntities(distance, distance, distance)) {
                        if (entity instanceof ArmorStand armorStand) {
                            if (!AdvancedArmorStandsMain.getInstance().canChange(armorStand, player)) {
                                continue;
                            }
                            Location newLocation = new Location(
                                    armorStand.getWorld(), armorStand.getLocation().getX(),
                                    armorStand.getLocation().getY() + distance, armorStand.getLocation().getZ()
                            );

                            Float armorStandYaw = armorStand.getLocation().getYaw();
                            newLocation.setYaw(armorStandYaw);

                            armorStand.teleport(newLocation);

                            AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                        }
                    }
                } else {
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                    player.sendMessage(ChatColor.RED + AdvancedArmorStandsMain.getInstance().getMessageString("no_permission", player.getLocale()));
                }
                break;

            case "§e§lDown":
                if (player.hasPermission("aa.move")) {
                    for (Entity entity : player.getNearbyEntities(distance, distance, distance)) {
                        if (entity instanceof ArmorStand armorStand) {
                            if (!AdvancedArmorStandsMain.getInstance().canChange(armorStand, player)) {
                                continue;
                            }
                            Location newLocation = new Location(
                                    armorStand.getWorld(), armorStand.getLocation().getX(),
                                    armorStand.getLocation().getY() - distance, armorStand.getLocation().getZ()
                            );

                            Float armorStandYaw = armorStand.getLocation().getYaw();
                            newLocation.setYaw(armorStandYaw);

                            armorStand.teleport(newLocation);

                            AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                        }
                    }
                } else {
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                    player.sendMessage(ChatColor.RED + AdvancedArmorStandsMain.getInstance().getMessageString("no_permission", player.getLocale()));
                }
                break;


            // Rotate

            case "§e§lRotate left":
                if (player.hasPermission("aa.move")) {
                    for (Entity entity : player.getNearbyEntities(distance, distance, distance)) {
                        if (entity instanceof ArmorStand armorStand) {
                            if (!AdvancedArmorStandsMain.getInstance().canChange(armorStand, player)) {
                                continue;
                            }
                            Location newLocation = new Location(
                                    armorStand.getWorld(), armorStand.getLocation().getX(),
                                    armorStand.getLocation().getY(), armorStand.getLocation().getZ()
                            );

                            Float armorStandYaw = armorStand.getLocation().getYaw();
                            newLocation.setYaw(armorStandYaw + 45);

                            armorStand.teleport(newLocation);

                            AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                        }
                    }
                } else {
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                    player.sendMessage(ChatColor.RED + AdvancedArmorStandsMain.getInstance().getMessageString("no_permission", player.getLocale()));
                }
                break;

            case "§e§lRotate right":
                if (player.hasPermission("aa.move")) {
                    for (Entity entity : player.getNearbyEntities(distance, distance, distance)) {
                        if (entity instanceof ArmorStand armorStand) {
                            if (!AdvancedArmorStandsMain.getInstance().canChange(armorStand, player)){
                                continue;
                            }
                            Location newLocation = new Location(
                                    armorStand.getWorld(), armorStand.getLocation().getX(),
                                    armorStand.getLocation().getY(), armorStand.getLocation().getZ()
                            );

                            Float armorStandYaw = armorStand.getLocation().getYaw();
                            newLocation.setYaw(armorStandYaw - 45);

                            armorStand.teleport(newLocation);

                            AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                        }
                    }
                } else {
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                    player.sendMessage(ChatColor.RED + AdvancedArmorStandsMain.getInstance().getMessageString("no_permission", player.getLocale()));
                }
                break;


        }
    }


    /**
     * Helper function for handlePresetPoseMenu(). Modifies an armor stands body parts near a player based on given input
     * angles for all body parts.
     */
    private void setArmorStandPose(Player player, double rightArmRoll, double rightArmYaw, double rightArmPitch,
                                   double leftArmRoll, double leftArmYaw, double leftArmPitch,
                                   double rightLegRoll, double rightLegYaw, double rightLegPitch,
                                   double leftLegRoll, double LeftLegYaw, double llp_yaw,
                                   double headRoll, double headYaw, double headPitch,
                                   double bodyRoll, double bodyYaw, double bodyPitch) {

        for (Entity entity : player.getNearbyEntities(1, 1, 1)) {
            if (entity instanceof ArmorStand armorStand) {

                if (!AdvancedArmorStandsMain.getInstance().canChange(armorStand, player)) {
                    continue;
                }
                // Set general settings
                armorStand.setArms(true);
                armorStand.setBasePlate(false);
                armorStand.setGravity(false);

                // Calculate and set right arm settings
                rightArmRoll = Math.toRadians(rightArmRoll);
                rightArmYaw = Math.toRadians(rightArmYaw);
                rightArmPitch = Math.toRadians(rightArmPitch);
                EulerAngle rightArmEulerAngle = new EulerAngle(rightArmRoll, rightArmYaw, rightArmPitch);
                armorStand.setRightArmPose(rightArmEulerAngle);

                // Calculate and set left arm settings
                leftArmRoll = Math.toRadians(leftArmRoll);
                leftArmYaw = Math.toRadians(leftArmYaw);
                leftArmPitch = Math.toRadians(leftArmPitch);
                EulerAngle leftArmEulerAngle = new EulerAngle(leftArmRoll, leftArmYaw, leftArmPitch);
                armorStand.setLeftArmPose(leftArmEulerAngle);

                // Calculate and set right leg settings
                rightLegRoll = Math.toRadians(rightLegRoll);
                rightLegYaw = Math.toRadians(rightLegYaw);
                rightLegPitch = Math.toRadians(rightLegPitch);
                EulerAngle rightLegEulerAngle = new EulerAngle(rightLegRoll, rightLegYaw, rightLegPitch);
                armorStand.setRightLegPose(rightLegEulerAngle);

                // Calculate and set left leg settings
                leftLegRoll = Math.toRadians(leftLegRoll);
                LeftLegYaw = Math.toRadians(LeftLegYaw);
                llp_yaw = Math.toRadians(llp_yaw);
                EulerAngle leftLegEulerAngle = new EulerAngle(leftLegRoll, LeftLegYaw, llp_yaw);
                armorStand.setLeftLegPose(leftLegEulerAngle);

                // Calculate and set body settings
                bodyRoll = Math.toRadians(bodyRoll);
                bodyYaw = Math.toRadians(bodyYaw);
                bodyPitch = Math.toRadians(bodyPitch);
                EulerAngle bodyEulerAngle = new EulerAngle(bodyRoll, bodyYaw, bodyPitch);
                armorStand.setBodyPose(bodyEulerAngle);

                // Calculate and set head settings
                headRoll = Math.toRadians(headRoll);
                headYaw = Math.toRadians(headYaw);
                headPitch = Math.toRadians(headPitch);
                EulerAngle headEulerAngle = new EulerAngle(headRoll, headYaw, headPitch);
                armorStand.setHeadPose(headEulerAngle);

                // Send success message to player
                player.sendMessage(ChatColor.GOLD + "[AA] Modified a nearby armor stand!");
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
        }
    }



    /**
     * Runs an action based on a clicked item. Called by InventoryClickEvent-EventHandler.
     *
     * @param itemName: String, The item that was clicked on
     * @param player: Player, The player who clicked
     */
    private void handleEventPresetPoseMenu(String itemName, Player player) {

        switch (itemName) {
            case "§e§lDefault 1" -> {
                setArmorStandPose(player, 345, 0, 10, 350, 0, 350, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "§e§lDefault 2" -> {
                setArmorStandPose(player, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "§e§lWalking 1" -> {
                setArmorStandPose(player, 345, 0, 10, 350, 0, 350, 340, 0, 0, 20, 0, 0, 0, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "§e§lWalking 2" -> {
                setArmorStandPose(player, 300, 40, 350, 20, 0, 350, 10, 0, 0, 350, 0, 0, 0, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "§e§lSitting" -> {
                setArmorStandPose(player, 345, 0, 10, 350, 0, 350, 280, 20, 0, 280, 340, 0, 0, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "§e§lWaving" -> {
                setArmorStandPose(player, 220, 20, 0, 350, 0, 350, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "§e§lGreeting 1" -> {
                setArmorStandPose(player, 260, 20, 0, 260, 340, 0, 340, 0, 0, 20, 0, 0, 0, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "§e§lGreeting 2" -> {
                setArmorStandPose(player, 240, 50, 0, 240, 320, 0, 10, 0, 0, 350, 0, 0, 0, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "§e§lGreeting 3" -> {
                setArmorStandPose(player, 260, 10, 0, 260, 350, 0, 320, 0, 0, 10, 0, 0, 340, 0, 350, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "§e§lCheering 1" -> {
                setArmorStandPose(player, 220, 20, 0, 220, 340, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "§e§lCheering 2" -> {
                setArmorStandPose(player, 250, 60, 0, 20, 10, 0, 10, 0, 0, 350, 0, 0, 340, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "§e§lBuilder" -> {
                setArmorStandPose(player, 340, 320, 0, 320, 40, 0, 340, 0, 0, 20, 0, 0, 20, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "§e§lSword Fighter" -> {
                setArmorStandPose(player, 300, 320, 0, 300, 40, 0, 0, 0, 0, 0, 0, 0, 20, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "§e§lFencing" -> {
                setArmorStandPose(player, 290, 0, 270, 20, 0, 230, 0, 30, 0, 340, 0, 340, 20, 30, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "§e§lArcher" -> {
                setArmorStandPose(player, 270, 350, 0, 280, 50, 0, 340, 0, 10, 20, 0, 350, 0, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "§e§lPresenting Item" -> {
                setArmorStandPose(player, 280, 330, 0, 10, 0, 350, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "§e§lHolding Item above Head" -> {
                setArmorStandPose(player, 250, 320, 0, 250, 35, 0, 10, 0, 0, 350, 0, 0, 340, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "§e§lPointing right up" -> {
                setArmorStandPose(player, 260, 60, 0, 20, 20, 0, 10, 340, 0, 10, 30, 0, 0, 70, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "§e§lFisherman" -> {
                setArmorStandPose(player, 300, 320, 0, 300, 40, 0, 280, 20, 0, 280, 340, 0, 0, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "§e§lDancing 1" -> {
                setArmorStandPose(player, 14, 0, 110, 20, 0, 250, 15, 30, 0, 330, 0, 110, 350, 20, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "§e§lDancing 2" -> {
                setArmorStandPose(player, 14, 0, 110, 20, 0, 250, 250, 330, 0, 15, 330, 0, 350, 350, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "§e§lHow to?" -> AdvancedArmorStandsMain.getInstance().playSoundBass(player);
            case "§e§lBack to Main Menu" -> {
                player.closeInventory();
                AdvancedArmorStandsMain.getInstance().showMenu(player, 1);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
        }
    }


}
