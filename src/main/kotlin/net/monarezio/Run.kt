package net.monarezio

import javafx.application.Application
import javafx.application.Platform
import javafx.scene.text.Font
import javafx.stage.Stage
import net.monarezio.domain.minesweeper.Game
import net.monarezio.presentation.minesweeper.Minesweeper
import net.monarezio.presentation.minesweeper.models.MinesweeperModel
import tornadofx.*
import java.io.File

/**
 * Created by monarezio on 08/07/2017.
 */

class Run: App(Minesweeper::class) {
    override fun start(stage: Stage) {
        super.start(stage)
        stage.isResizable = false
    }

    init {


        println(File("resources/fonts/FontAwesome.otf").absolutePath)

        Font.loadFont("file:" + File("resources/fonts/FontAwesome.otf").path, 10.0)
        setInScope(MinesweeperModel(Game.createNewGame(10, (10 * 2).toInt())), DefaultScope)
    }

    companion object {
        fun main(args: Array<String>) {
            Application.launch(Run::class.java, *args)
        }
    }
}