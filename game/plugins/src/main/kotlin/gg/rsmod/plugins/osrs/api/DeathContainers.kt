package gg.rsmod.plugins.osrs.api

import gg.rsmod.game.model.container.ItemContainer

/**
 * Represents [ItemContainer]s for items that should be kept on death and items
 * that will be lost on death.
 *
 * @see gg.rsmod.plugins.osrs.api.helper.calculateDeathContainers
 *
 * @author Tom <rspsmods@gmail.com>
 */
data class DeathContainers(val kept: ItemContainer, val lost: ItemContainer)