package hk.edu.hkbu.comp.comp4107.playground
<<<<<<< HEAD
import hk.edu.hkbu.comp.comp4107.playground.somantik.SelfIntroduction
=======

import hk.edu.hkbu.comp.comp4107.playground.kennycheng.SelfIntro

>>>>>>> df9fb4bd938613d4bcd8c6f28ab49408692d63ec
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
<<<<<<< HEAD
    val sel:SelfIntroduction = SelfIntroduction()
    sel.selfIntroduction()
    println()

=======
    SelfIntro().introduce()
>>>>>>> df9fb4bd938613d4bcd8c6f28ab49408692d63ec

    for (i in 1..5) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")
    }
}