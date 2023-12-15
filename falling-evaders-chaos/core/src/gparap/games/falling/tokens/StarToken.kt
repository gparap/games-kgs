/*******************************
 * Katocheánian Gaming Studios *
 * Falling Evaders Chaos       *
 * created by gparap           *
 *******************************/
package gparap.games.falling.tokens

import com.badlogic.gdx.graphics.g2d.Sprite
import gparap.games.falling.utils.GameConstants

class StarToken(sprite: Sprite) : Token(sprite) {

    init {
        super.init(GameConstants.TOKEN_STAR_SPEED_DEFAULT, GameConstants.TOKEN_STAR_MAX_SPEED, TokenType.STAR, sprite)
    }

    override fun isActiveInGame(): Boolean {
        return isActive
    }

    override fun setActiveInGame(active: Boolean) {
        isActive = active
    }

    override fun isCollectedInGame(): Boolean {
        return isCollected
    }

    override fun setCollectedInGame(collected: Boolean) {
        isCollected = collected
    }

    override fun getScorePoints(): Int {
        return GameConstants.SCORE_POINTS_STAR
    }
}