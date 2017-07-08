package net.monarezio.domain.minesweeper

import net.monarezio.domain.minesweeper.models.Coordinate

/**
 * Created by monarezio on 08/07/2017.
 */
interface Minesweeper {

    /**
     * gets the amount of one row/column
     */
    fun getSize(): Int

    /**
     * returns the number of bombs around the position
     */
    fun getAmountOfBombsAround(x: Int, y: Int): Int

    /**
     * returns amount of bombs on the field
     */
    fun getAmountOfBombs(): Int

    /**
     * returns the positions of all bombs
     */
    fun getBombPositions(): Set<Coordinate>
}