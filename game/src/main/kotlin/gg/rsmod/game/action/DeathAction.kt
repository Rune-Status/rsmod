package gg.rsmod.game.action

import gg.rsmod.game.model.entity.Player
import gg.rsmod.game.plugin.Plugin

/**
 * @author Tom <rspsmods@gmail.com>
 */
object DeathAction {

    val playerDeathPlugin: (Plugin) -> Unit = {
        val p = it.ctx as Player
        p.message("u dead")
    }
}